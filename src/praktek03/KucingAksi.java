package praktek03;

public class KucingAksi {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.setJenis("persia");
        k.setWarna("vanila");
        k.setHarga(800000);   
        
        k.cetakinfo();
        
        System.out.print("Jenisnya \t : ");
        System.out.println(k.getJenis());
        System.out.print("Warnanya \t : ");
        System.out.println(k.getWarna());
        System.out.print("Harganya \t : ");
        System.out.println(k.getHarga());
}
}