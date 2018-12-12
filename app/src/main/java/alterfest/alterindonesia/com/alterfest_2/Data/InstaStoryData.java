package alterfest.alterindonesia.com.alterfest_2.Data;

public class InstaStoryData {
    String nama;
    int gambar;

    public InstaStoryData(String nama, int gambar) {
        this.nama = nama;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
