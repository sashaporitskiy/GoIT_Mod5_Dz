package DZ5_2.Player;

public abstract class PlayerSongList extends SuperPlayer {

    String[] playlist;

    public PlayerSongList(double price) {
        super(price);
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public void playAllSongs() {
        System.out.println("Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}