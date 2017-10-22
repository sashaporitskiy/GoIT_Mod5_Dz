package DZ5_2.Player;

/*
Плеер 4.
Имеет final цену(задается в конструкторе) и геттер
Имеет плейлист
playSong Может проиграть последнюю песню
playAllSongs может проиграть все песни
 */

public class Player4 extends PlayerSongList {

    public Player4(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        setSong(playlist[playlist.length-1]);
        super.playSong();
    }
}
