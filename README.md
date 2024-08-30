
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

# Insertion Sort

Algoritma ini melakukan pengurutan sederhana dan efisien untuk dataset kecil. Algoritma ini bekerja dengan membagi array menjadi dua bagian: bagian yang sudah diurutkan dan bagian yang belum diurutkan. Pada setiap langkah, elemen dari bagian yang belum diurutkan diambil dan ditempatkan di posisi yang tepat dalam bagian yang sudah diurutkan. Proses ini diulang sampai seluruh array terurutkan.


# Kompleksitas

Algoritma ini memiliki kompleksitas waktu O(n²) dalam kasus terburuk, tapi algoritma ini sering lebih cepat daripada Bubble Sort dan Selection Sort untuk dataset kecil, dan juga sangat efisien untuk mengurutkan array yang sudah hampir terurutkan.
# Pro & Cons
## Kelebihan
- Efisien untuk dataset kecil dan array yang hampir terurutkan.
- Stabil, sehingga tidak mengubah urutan relatif dari elemen-elemen dengan nilai yang sama.
- Pengurutan In-place, sehingga tidak memerlukan memori tambahan.

## Kekurangan
- Kurang efisien untuk dataset besar dengan kompleksitas waktu O(n²) dalam kasus terburuk.
- Kinerja menurun ketika array sangat tidak terurut.

# Demo

Misal ada sebuah array dengan variabel larik yang berisi {5, 8, 26, 15, 11, 31}, menggunakan pengurutan Insertion Sort membutuhkan beberapa kali iterasi:

![image](https://github.com/user-attachments/assets/feebc1d5-10c9-4840-a5e5-d659da31cc5d)
![image](https://github.com/user-attachments/assets/cebb0cd7-709a-485d-8669-092bbf2065e0)
![image](https://github.com/user-attachments/assets/5953e9ef-3c87-455e-8838-ca19b21075b9)







