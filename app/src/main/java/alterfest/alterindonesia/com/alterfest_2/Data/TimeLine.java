package alterfest.alterindonesia.com.alterfest_2.Data;

public class TimeLine {
    int foto, gambar;
    String likeLabel;
    String username;
    String caption;
    String time;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getLikeLabel() {
        return likeLabel;
    }

    public void setLikeLabel(String likeLabel) {
        this.likeLabel = likeLabel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TimeLine(int foto, int gambar, String likeLabel, String username, String caption, String time) {
        this.foto = foto;
        this.gambar = gambar;
        this.likeLabel = likeLabel;
        this.username = username;
        this.caption = caption;
        this.time = time;
    }
}
