public class Main {
    public static void main(String[] args) {
        Song song = new Song("Bohemian Rhapsody");

        // Initial strategy is set to low quality
        MusicPlayer player = new MusicPlayer(new LowQualityStrategy());
        System.out.println("User is on a basic subscription:");
        player.play(song);

        // Change strategy to medium quality
        System.out.println("\nUser upgrades to a standard subscription:");
        player.setPlaybackStrategy(new MediumQualityStrategy());
        player.play(song);

        // Change strategy to high quality
        System.out.println("\nUser upgrades to a premium subscription:");
        player.setPlaybackStrategy(new HighQualityStrategy());
        player.play(song);

        // Simulate network condition changing to low quality
        System.out.println("\nNetwork conditions worsen, switching to low quality:");
        player.setPlaybackStrategy(new LowQualityStrategy());
        player.play(song);
    }
}
