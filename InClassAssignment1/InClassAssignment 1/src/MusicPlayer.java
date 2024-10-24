public class MusicPlayer {
    private PlaybackStrategy strategy;

    public MusicPlayer(PlaybackStrategy strategy) {
        this.strategy = strategy;
    }

    public void setPlaybackStrategy(PlaybackStrategy strategy) {
        this.strategy = strategy;
    }

    public void play(Song song) {
        if (strategy == null) {
            System.out.println("Playback strategy is not set.");
        } else {
            strategy.stream(song);
        }
    }
}
