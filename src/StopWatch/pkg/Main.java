package StopWatch.pkg;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = generateNumbers(100000); // Menghasilkan array angka acak

        StopWatch stopWatch = new StopWatch(); // Membuat objek stopwatch
        selectionSort(numbers); // Memulai pengurutan
        stopWatch.stop(); // Menghentikan stopwatch

        // Menampilkan waktu yang diperlukan untuk pengurutan dalam milidetik
        System.out.println("Waktu yang diperlukan untuk pengurutan: " + stopWatch.getElapsedTime() + " milidetik");
    }

    // Metode untuk menghasilkan array angka acak
    public static int[] generateNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 1000); // Angka acak antara 0 dan 999
        }
        return numbers;
    }

    // Metode untuk pengurutan dengan selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Menukar elemen terkecil dengan elemen pertama pada iterasi saat ini
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}