class LowQualityStrategy implements PlaybackStrategy {
    @Override
    public void stream(Song song) {
        System.out.println("Streaming " + song.getTitle() + " in low quality.");
    }
}

class MediumQualityStrategy implements PlaybackStrategy {
    @Override
    public void stream(Song song) {
        System.out.println("Streaming " + song.getTitle() + " in medium quality.");
    }
}

class HighQualityStrategy implements PlaybackStrategy {
    @Override
    public void stream(Song song) {
        System.out.println("Streaming " + song.getTitle() + " in high quality.");
    }
}
