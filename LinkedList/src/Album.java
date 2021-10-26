import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songsList;

    public Album(String title) {
        this.title = title;
        this.songsList = new ArrayList<Song>();
    }

    public void addSongToAlbum(Song song){
        songsList.add(song);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }
}
