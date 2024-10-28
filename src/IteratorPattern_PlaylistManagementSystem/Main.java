package IteratorPattern_PlaylistManagementSystem;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong(new Song("Song A", "Artist 1", "Pop"));
        playlist.addSong(new Song("Song B", "Artist 2", "Rock"));
        playlist.addSong(new Song("Song C", "Artist 3", "Pop"));
        playlist.addSong(new Song("Song D", "Artist 4", "Jazz"));
        playlist.addSong(new Song("Song E", "Artist 5", "Rock"));

        // Sequential Traversal
        System.out.println("Sequential Order:");
        SongIterator sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        // Shuffle Traversal
        System.out.println("\nShuffled Order:");
        SongIterator shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        // Genre Filtered Traversal (e.g., Pop)
        System.out.println("\nGenre Filtered Order (Pop):");
        SongIterator genreIterator = playlist.getGenreFilterIterator("Pop");
        while (genreIterator.hasNext()) {
            System.out.println(genreIterator.next());
        }
    }
}
