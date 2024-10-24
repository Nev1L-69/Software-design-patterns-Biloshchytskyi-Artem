// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a playlist
        Playlist playlist = new Playlist();

        // Add songs to the playlist
        playlist.addSong(new Song("Song 1", "Rock"));
        playlist.addSong(new Song("Song 2", "Pop"));
        playlist.addSong(new Song("Song 3", "Jazz"));
        playlist.addSong(new Song("Song 4", "Rock"));
        playlist.addSong(new Song("Song 5", "Pop"));

        // Traverse songs sequentially
        System.out.println("Sequential Iteration:");
        Iterator<Song> sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        // Traverse songs in shuffled order
        System.out.println("\nShuffled Iteration:");
        Iterator<Song> shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        // Traverse songs filtered by genre
        System.out.println("\nFiltered Iteration (Genre: Rock):");
        Iterator<Song> genreFilterIterator = playlist.getGenreFilterIterator("Rock");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}
