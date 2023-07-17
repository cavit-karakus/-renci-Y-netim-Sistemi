# -renci-Y-netim-Sistemi
Bu proje, öğrenci bilgilerini tutan bir öğrenci yönetim sistemi uygulamasını içerir.
-------------------------------

İki sınıf bulunmaktadır: Ogrenci ve LiseOgrencisi.
Bu sınıflar, öğrenci bilgilerini saklamak için kullanılır ve not ortalaması hesaplama işlemlerini gerçekleştirir.

---------------------------------------------
Ogrenci Sınıfı
Ogrenci sınıfı, temel öğrenci bilgilerini (ad, numara, sınıf) ve notları (bir dizide) saklamak için kullanılır.

--------------------------------------------
Kurucu Metod:
public Ogrenci(String adi, int numara, int sinif, int[] notlar)
-----------------------------------------------
Parametreler:

adi: Öğrencinin adı (String).
numara: Öğrencinin numarası (int).
sinif: Öğrencinin sınıfı (int).
notlar: Öğrencinin notları (int dizisi).
-------------------------------------------------

notOrtalamasiHesapla Metodu

public double notOrtalamasiHesapla()

Dönüş Değeri: Hesaplanan not ortalaması (double).

----------------------------------------------------

LiseOgrencisi Sınıfı
LiseOgrencisi sınıfı, Ogrenci sınıfından türetilmiş olup, ek olarak liseye özgü sınav puanını saklamak için kullanılır.

-------------------------------------------------------
Kurucu Metod:
public LiseOgrencisi(String adi, int numara, int sinif, int[] notlar, int sinavPuani)
--------------------------------------------------
Parametreler:

adi: Öğrencinin adı (String).

numara: Öğrencinin numarası (int).

sinif: Öğrencinin sınıfı (int).

notlar: Öğrencinin notları (int dizisi).

sinavPuani:" Öğrencinin lise sınav puanı (int) ".
-----------------------------------------------------

liseNotOrtalamasiHesapla Metodu:
"public double liseNotOrtalamasiHesapla()"

Dönüş Değeri: Hesaplanan lise öğrenci not ortalaması (double).
----------------------------------------------------------------
Main Sınıfı

Main sınıfı, örnek öğrenci ve lise öğrencisi oluşturarak not ortalamalarını hesaplar ve ekrana yazdırır.

int[] ogrenciNotlari = {85, 90, 77, 92};

Ogrenci ogrenci = new Ogrenci("Ahmet", 123, 10, ogrenciNotlari);

double ogrenciNotOrtalamasi = ogrenci.notOrtalamasiHesapla();

System.out.println("Öğrenci Not Ortalaması: " + ogrenciNotOrtalamasi);

--------------------------------------------------------------------

int[] liseOgrenciNotlari = {75, 80, 85, 90};

LiseOgrencisi liseOgrenci = new LiseOgrencisi("Mehmet", 456, 12, liseOgrenciNotlari, 80);

double liseOgrenciNotOrtalamasi = liseOgrenci.liseNotOrtalamasiHesapla();

System.out.println("Lise Öğrenci Not Ortalaması: " + liseOgrenciNotOrtalamasi);

------------------------------------------------------------------------------------
Yukarıdaki örnek kodda, bir öğrenci ve bir lise öğrencisi oluşturulur ve not ortalamaları hesaplanır. Sonuçlar ekrana yazdırılır.

Bu projede nesneye yönelik programlama prensiplerini (sınıflar, nesneler, kalıtım) kullanarak öğrenci yönetimi gerçekleştirilmektedir.
