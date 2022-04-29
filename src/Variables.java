public class Variables {

   String  urunAdi;
   double urunFiyat;

    public Variables() {
    }

    public Variables(String urunAdi, double urunFiyat) {
        this.urunAdi = urunAdi;
        this.urunFiyat = urunFiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(double urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

}
