import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

//        Song song1 = new Song("Emmanuel", 3.50);
//        Song song2 = new Song("Hallelujah", 3.27);
//        Song song3 = new Song("Forever", 2.50);
//        Song song4 = new Song("Only", 4.30);
//        Song song5 = new Song("Yes & Amen", 8.30);

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("You don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of Fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);

        albums.get(0).addToPlayList(9, playList);
        albums.get(0).addToPlayList(8, playList);
        albums.get(0).addToPlayList(3, playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(0).addToPlayList(24, playList);

        play(playList);

//        LinkedList<Song> playlist = new LinkedList<Song>();
//        addSongsToPlaylist(playlist, albums, song1);
//        addSongsToPlaylist(playlist, albums, song3);
//        addSongsToPlaylist(playlist, albums, song5);
//        System.out.println("===================================");
//
//        menu(playlist);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit =  false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }

                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }

                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
//
                case 3:
                    break;
//
                case 4:
//                    printList(playList);
                    break;

                case 5:
//                    printMenu();
                    break;
            }
        }
    }
//    private static boolean addSongsToPlaylist(LinkedList<Song> playlist, ArrayList<Album> albums, Song song){
//        for (int i=0; i<albums.size(); i++){
//            if (albums.get(i).getSongsList().contains(song)){
//                playlist.add(song);
//                System.out.println(song.getTitle() + " has been added to playlist!");
//                return true;
//            }
//        }
//        System.out.println(song.getTitle() + " cannot be added to playlist.");
//        return false;
//    }
//
//    private static void listSongs(LinkedList<Song> playlist){
//        Iterator<Song> i = playlist.iterator();
//        System.out.println("Songs in playlist\n---------------------");
//        while (i.hasNext()){
//            System.out.println(i.next().getTitle());
//        }
//        System.out.println("=========================");
//    }
//
//    private static boolean removeSongFromPlaylist(LinkedList playlist, String songName){
//        Iterator<Song> i = playlist.iterator();
//        while (i.hasNext()){
//            if (i.next().getTitle().equals(songName)){
//                i.remove();
//                System.out.println(songName + " removed from the playlist.");
//                return true;
//            }
//        }
//        System.out.println(songName + " not in the playlist.");
//        return false;
//    }
//
//    private static void printMenu(){
//        System.out.println("Available options:\npress ");
//        System.out.println("0 - to quit\n" +
//                "1 - Skip to the next song\n" +
//                "2 - Skip to the previous song\n" +
//                "3 - Replay the current song\n" +
//                "4 - List songs in the playlist\n" +
//                "5 - Remove a song from playlist\n" +
//                "6 - Remove current song from playlist\n" +
//                "7 - print menu options");
//    }
//
//    private static void menu(LinkedList playlist){
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        boolean goingForward = true;
//        ListIterator<Song> listIterator = playlist.listIterator();
//
//        if (playlist.isEmpty()){
//            System.out.println("No song in playlist.");
//            return;
//        } else {
//            System.out.println("Now playing " + listIterator.next().getTitle());
//            printMenu();
//        }
//
//        while (!quit) {
//            System.out.print("Enter option: ");
//            int option = scanner.nextInt();
//            scanner.nextLine();
//            switch (option){
//                case 0:
//                    System.out.println("Shutdown!");
//                    quit = true;
//                    break;
//
//                case 1:
//                    if (!goingForward){
//                        if (listIterator.hasNext()){
//                            listIterator.next();
//                        }
//                        goingForward = true;
//                    }
//                    if (listIterator.hasNext()) {
//                        System.out.println("Now playing " + listIterator.next().getTitle());
//                    } else {
//                        System.out.println("Reached the end of the playlist");
//                        goingForward = false;
//                    }
//                    break;
//
//                case 2:
//                    if (goingForward){
//                        if (listIterator.hasPrevious()){
//                            listIterator.previous();
//                        }
//                        goingForward = false;
//                    }
//                    if (listIterator.hasPrevious()){
//                        System.out.println("Now playing " + listIterator.previous().getTitle());
//                    } else {
//                        System.out.println("We are at the start of the playlist");
//                        goingForward = true;
//                    }
//                    break;
//
//                case 3:
//                    if (listIterator.hasNext()) {
//                        listIterator.next();
//                        System.out.println("Now playing " + listIterator.previous().getTitle());
//                    } else {
//                        System.out.println("Now playing " + listIterator.previous().getTitle());
//                    }
//                    break;
//
//                case 4:
//                    listSongs(playlist);
//                    break;
//
//                case 5:
//                    System.out.print("Enter name of song to be removed from playlist: ");
//                    String songName = scanner.nextLine();
//                    removeSongFromPlaylist(playlist, songName);
//                    break;
//
//                case 6:
//                    listIterator.remove();
//                    System.out.println("Current song has been removed from the playlist.");
//                    break;
//
//                case 7:
//                    printMenu();
//                    break;
//
//
//            }
//        }
//    }
}
