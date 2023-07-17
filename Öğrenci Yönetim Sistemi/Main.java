class Ogrenci {
    String adi;
    int numara;
    int sinif;
    int[] notlar;

    public Ogrenci(String adi, int numara, int sinif, int[] notlar) {
        this.adi = adi;
        this.numara = numara;
        this.sinif = sinif;
        this.notlar = notlar;
    }

    public double notOrtalamasiHesapla() {
        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        return (double) toplam / notlar.length;
    }
}

class LiseOgrencisi extends Ogrenci {
    int sinavPuani;

    public LiseOgrencisi(String adi, int numara, int sinif, int[] notlar, int sinavPuani) {
        super(adi, numara, sinif, notlar);
        this.sinavPuani = sinavPuani;
    }

    public double liseNotOrtalamasiHesapla() {
        double ogrenciNotOrtalamasi = notOrtalamasiHesapla();
        return (ogrenciNotOrtalamasi * 0.6) + (sinavPuani * 0.4);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] ogrenciNotlari = {85, 90, 77, 92};
        Ogrenci ogrenci = new Ogrenci("Ahmet", 123, 10, ogrenciNotlari);
        double ogrenciNotOrtalamasi = ogrenci.notOrtalamasiHesapla();
        System.out.println("Öğrenci Not Ortalaması: " + ogrenciNotOrtalamasi);

        int[] liseOgrenciNotlari = {75, 80, 85, 90};
        LiseOgrencisi liseOgrenci = new LiseOgrencisi("Mehmet", 456, 12, liseOgrenciNotlari, 80);
        double liseOgrenciNotOrtalamasi = liseOgrenci.liseNotOrtalamasiHesapla();
        System.out.println("Lise Öğrenci Not Ortalaması: " + liseOgrenciNotOrtalamasi);
    }
}