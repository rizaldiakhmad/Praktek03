package praktek03;

public class Kucing {
    private String jenis;
    private String warna;
    private double harga;
    
    void cetakinfo(){ 
    System.out.println("Jenis kucing \t : "+jenis+"\n"+
                "warna kucing \t : "+warna+"\n"+"Harga kucing \t : "+harga);
}

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
