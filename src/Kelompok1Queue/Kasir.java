package Kelompok1Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Kelas yang merepresentasikan pelanggan (klaim/permintaan) dalam sistem antrean.
 * Berfungsi untuk mencatat waktu kedatangan, mirip dengan 'Source' dalam diagram AnyLogic.
 */
class Customer {
    private static int counter = 0;
    public final int id;
    public final double arrivalTime;

    public Customer(double arrivalTime) {
        this.id = ++counter;
        this.arrivalTime = arrivalTime;
    }
}

/**
 * Implementasi simulasi sistem antrean sederhana (M/M/1 - Single Server)
 * Konsep utama: Menghitung Waktu Tunggu Matematis vs. Panjang Antrean Riil.
 * Panjang Antrean Riil hanya dihitung ketika pelanggan baru tiba dan menemukan antrean > 0.
 */
public class Kasir {

    // --- Parameter Sistem Antrean (QS) ---
    private static final double ARRIVAL_RATE = 0.5; // Rata-rata kedatangan per satuan waktu
    private static final double SERVICE_RATE = 0.4; // Rata-rata layanan per satuan waktu
    private static final int SIMULATION_DURATION = 20; // Durasi simulasi dalam satuan waktu diskrit

    // --- Komponen QS (Source, Queue, Delay, Sink) ---
    private Queue<Customer> customerQueue = new LinkedList<>(); // Queue (Antrean)
    private double serverFreeTime = 0; // Delay/Status Server (Waktu server akan bebas)
    private int totalCustomersArrived = 0;
    private Random random = new Random();

    // --- Metrik Kinerja ---
    private double totalWaitingTime = 0; // Waktu tunggu Matematis
    private double accumulatedRealQueueLength = 0;
    private int realQueueInstanceCount = 0;

    public static void main(String[] args) {
        // AnyLogic menggunakan Java untuk memperluas model simulasi,.
        Kasir sim = new Kasir();
        sim.runSimulation();
        sim.printResults();
    }

    /**
     * Menjalankan simulasi langkah demi langkah (discrete-time simulation).
     */
    public void runSimulation() {
        System.out.println("--- Simulasi Sistem Antrean Dimulai ---");
        System.out.println("Memodelkan konsep komponen QS: Source -> Queue -> Delay -> Sink.");

        for (int currentTime = 1; currentTime <= SIMULATION_DURATION; currentTime++) {
            
            // 1. Kedatangan Pelanggan (Source)
            // Menggunakan probabilitas sederhana untuk meniru proses kedatangan Poisson
            if (random.nextDouble() < ARRIVAL_RATE) {
                Customer newCustomer = new Customer(currentTime);
                totalCustomersArrived++;
                customerQueue.offer(newCustomer);
                System.out.printf("[Waktu %d] Pelanggan %d tiba. Panjang Antrean: %d%n", 
                                  currentTime, newCustomer.id, customerQueue.size());

                // 2. Logika Panjang Antrean Riil (Real Queue Length Logic)
                /*
                 * Berdasarkan sumber, Antrean Riil menghitung pelanggan yang benar-benar
                 * menunggu layanan, yaitu ketika ada pelanggan yang mengantri (queue.size() > 0)
                 * dan server (delay) sedang sibuk atau baru saja akan sibuk,.
                 * Dalam konteks ini, kita catat panjang antrean saat pelanggan tiba.
                 */
                if (customerQueue.size() > 0) {
                    accumulatedRealQueueLength += customerQueue.size();
                    realQueueInstanceCount++;
                }
            }

            // 3. Layanan (Delay/Server)
            // Cek apakah server bebas DAN ada pelanggan menunggu di antrean
            if (currentTime >= serverFreeTime && !customerQueue.isEmpty()) {
                Customer servingCustomer = customerQueue.poll();
                
                // Hitung Waktu Tunggu Matematis
                double waitingTime = currentTime - servingCustomer.arrivalTime;
                totalWaitingTime += waitingTime;

                // Tentukan Durasi Layanan (Distribusi Waktu Layanan)
                // Dalam model M/Er/1, ini adalah distribusi Erlang-r,.
                // Di sini kita pakai perkiraan sederhana berdasarkan SERVICE_RATE
                double serviceDuration = 1 / SERVICE_RATE + random.nextDouble();
                serverFreeTime = currentTime + serviceDuration;

                System.out.printf("[Waktu %d] Mulai Layanan P%d. Tunggu: %.2fs. Server bebas pada: %.2f%n", 
                                  currentTime, servingCustomer.id, waitingTime, serverFreeTime);
            }
        }
    }

    /**
     * Mencetak metrik kinerja akhir.
     */
    public void printResults() {
        System.out.println("\n--- Hasil Simulasi ---");
        System.out.printf("Total Pelanggan Tiba (Source): %d pelanggan.%n", totalCustomersArrived);
        System.out.printf("Sisa Pelanggan di Antrean (Buffer Occupancy): %d pelanggan.%n", customerQueue.size());
        
        if (totalCustomersArrived > 0) {
            
            // 1. Waktu Tunggu Rata-rata (Metrik Matematis)
            double avgWaitingTimeMathematical = totalWaitingTime / totalCustomersArrived;
            System.out.printf("\n1. Waktu Tunggu Rata-rata (Matematis): %.2f satuan waktu.%n", avgWaitingTimeMathematical);

            // 2. Panjang Antrean Riil Rata-rata
            if (realQueueInstanceCount > 0) {
                /*
                 * Nilai ini penting karena memprediksi jumlah pelanggan yang benar-benar 
                 * mengantri, bukan hanya yang berada dalam sistem, memberikan arti fisik 
                 * yang lebih relevan dibandingkan antrean matematis di banyak kasus,.
                 */
                double avgRealQueueLength = accumulatedRealQueueLength / realQueueInstanceCount;
                System.out.printf("2. Panjang Antrean Riil Rata-rata: %.2f pelanggan.%n", avgRealQueueLength);
            } else {
                System.out.println("2. Panjang Antrean Riil Rata-rata: Tidak ada kasus antrean yang tercatat.");
            }
        }
    }
}