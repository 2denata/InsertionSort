public static void insertionSort(int[] larik) {
    int sizeLarik = larik.length;
    int kunci, praKunci, sementara;

    for (kunci = 1; kunci < sizeLarik; kunci++) {
        sementara = larik[kunci];
        praKunci = kunci - 1;

        while (praKunci >= 0 && sementara < larik[praKunci]) {
            larik[praKunci + 1] = larik[praKunci];
            praKunci--;
        }

        larik[praKunci + 1] = sementara;
    }
}
