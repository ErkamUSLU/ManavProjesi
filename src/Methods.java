import java.util.*;

public class Methods implements interfaceMethods {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    static Map<Integer,String> liste = new TreeMap<Integer, String>();
    static Scanner scan = new Scanner(System.in);
    double tutar;
    double totalTutar;




    @Override
    public void listele() {
        System.out.println("URUNISMI   URUNFIYATI");
        System.out.println("=============================");
        liste.put(1,R+"1-)domates    2.1TL");
        liste.put(2,Y+"2-)patates    3.2TL");
        liste.put(3,G+"3-)biber      1.5TL");
        liste.put(4,W+"4-)sogan      2.3TL");
        Collection<String> valueSet=liste.values();
        for (String each: valueSet
        ) {
            System.out.println(each);


    }}

    @Override
    public void urunSec() {
        listele();
        System.out.println(B + "ne almak istersiniz : ");
        int secim = scan.nextInt();
        System.out.println("Kac kilo vereyim : ");
        double kg = scan.nextDouble();
        Variables urun1 = new Variables("Domates", 2.1);
        Variables urun2 = new Variables("Patates", 3.2);
        Variables urun3 = new Variables("Biber", 1.5);
        Variables urun4 = new Variables("Sogan", 2.3);
        if (secim == 1) {
            tutar = urun1.getUrunFiyat() * kg;
            System.out.println(kg + " kg " + urun1.getUrunAdi() + " aldiniz ve total " + tutar + " TL artti.");
            totalTutar += tutar;
        } else if (secim == 2) {
            tutar = urun2.getUrunFiyat() * kg;
            System.out.println(kg + " kg " + urun2.getUrunAdi() + " aldiniz ve total " + tutar + " TL artti.");
            totalTutar += tutar;
        } else if (secim == 3) {
            tutar = urun3.getUrunFiyat() * kg;
            System.out.println(kg + " kg " + urun3.getUrunAdi() + " aldiniz ve total " + tutar + " TL artti.");
            totalTutar += tutar;
        } else if (secim == 4) {
            tutar = urun4.getUrunFiyat() * kg;
            System.out.println(kg + " kg " + urun4.getUrunAdi() + " aldiniz ve total " + tutar + " TL artti.");
            totalTutar += tutar;
        } else {
            System.out.println("Hatali giris...Tekrar deneyin ...");
            urunSec();
        }
        tamamMiDevamMi();
    }

    @Override
    public void tamamMiDevamMi() {


            System.out.println("Daha biseler alcak misiniz : E/H");
            String secim = scan.next().substring(0, 1);
            if (secim.equalsIgnoreCase("E")) {
                urunSec();
            } else if (secim.equalsIgnoreCase("H")) {
                odemeYap();
            }else {

            System.out.println("E ve H disinda birseye basmamak sartiyla tekrar deneyin");
            tamamMiDevamMi();}
    }

    @Override
    public void odemeYap() {
        double ceptekiPara = 100;
        if (ceptekiPara > totalTutar) {
            System.out.println(totalTutar + "TL tuttu ...");
            double geriVerilecekPara = ceptekiPara - totalTutar;
            System.out.println("Para ustunuz " + geriVerilecekPara + " TL ");
        } else {
            System.out.println("Bu paraya bunlari alamazsin");
            totalTutar = 0;
            tutar = 0;
            urunSec();
        }
    }
}
