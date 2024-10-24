// ShuffleIterator.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleIterator implements Iterator<Song> {
    private List<Song> songs;
    private List<Song> shuffledSongs;
    private int position = 0;

    public ShuffleIterator(List<Song> songs) {
        this.songs = songs;
        shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs, new Random());
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(position++);
    }
}
