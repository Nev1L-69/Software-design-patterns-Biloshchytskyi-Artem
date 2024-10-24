// Playlist.java
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    // Get an iterator for sequential access
    public Iterator<Song> getSequentialIterator() {
        return new SequentialIterator(songs);
    }

    // Get an iterator for shuffled access
    public Iterator<Song> getShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    // Get an iterator filtered by genre
    public Iterator<Song> getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}
