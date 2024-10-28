package IteratorPattern_PlaylistManagementSystem;

import java.util.List;

public class SequentialIterator implements SongIterator {
    private List<Song> songs;
    private int position = 0;

    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
