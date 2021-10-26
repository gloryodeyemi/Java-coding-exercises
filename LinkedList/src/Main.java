import java.util.*;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Emmanuel", 3.50);
        Song song2 = new Song("Hallelujah", 3.27);
        Song song3 = new Song("Forever", 2.50);
        Song song4 = new Song("Only", 4.30);
        Song song5 = new Song("Yes & Amen", 8.30);

        Album album1 = new Album("Abba");
        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);

        Album album2 = new Album("Jesus");
        album2.addSongToAlbum(song3);
        album2.addSongToAlbum(song4);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(album1);
        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<Song>();
        addSongsToPlaylist(playlist, albums, song1);
        addSongsToPlaylist(playlist, albums, song3);
        addSongsToPlaylist(playlist, albums, song5);
        System.out.println("===================================");

        menu(playlist);
    }

    private static boolean addSongsToPlaylist(LinkedList<Song> playlist, ArrayList<Album> albums, Song song){
        for (int i=0; i<albums.size(); i++){
            if (albums.get(i).getSongsList().contains(song)){
                playlist.add(song);
                System.out.println(song.getTitle() + " has been added to playlist!");
                return true;
            }
        }
        System.out.println(song.getTitle() + " cannot be added to playlist.");
        return false;
    }

    private static void listSongs(LinkedList<Song> playlist){
        Iterator<Song> i = playlist.iterator();
        System.out.println("Songs in playlist\n---------------------");
        while (i.hasNext()){
            System.out.println(i.next().getTitle());
        }
        System.out.println("=========================");
    }

    private static boolean removeSongFromPlaylist(LinkedList playlist, String songName){
        Iterator<Song> i = playlist.iterator();
        while (i.hasNext()){
            if (i.next().getTitle().equals(songName)){
                i.remove();
                System.out.println(songName + " removed from the playlist.");
                return true;
            }
        }
        System.out.println(songName + " not in the playlist.");
        return false;
    }

    private static void printMenu(){
        System.out.println("Available options:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - Skip to the next song\n" +
                "2 - Skip to the previous song\n" +
                "3 - Replay the current song\n" +
                "4 - List songs in the playlist\n" +
                "5 - Remove song from playlist\n" +
                "6 - print menu options");
    }

    private static void menu(LinkedList playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.isEmpty()){
            System.out.println("No song in playlist.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
            printMenu();
        }

        while (!quit) {
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    System.out.println("Shutdown!");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (listIterator.hasNext()) {
                        listIterator.next();
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    }
                    break;

                case 4:
                    listSongs(playlist);
                    break;

                case 5:
                    System.out.print("Enter name of song to be removed from playlist: ");
                    String songName = scanner.nextLine();
                    removeSongFromPlaylist(playlist, songName);
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }
    }
}
