import java.util.ArrayList;

public class MyAlbum {
    private String title;
    private ArrayList<MySong> songsList;

    public MyAlbum(String title) {
        this.title = title;
        this.songsList = new ArrayList<MySong>();
    }

    public void addSongToAlbum(MySong song){
        songsList.add(song);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<MySong> getSongsList() {
        return songsList;
    }
}
