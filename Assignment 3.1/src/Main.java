public class Main {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "song.mp3");

        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "sound.wav");

        AudioPlayer aacPlayer = new AudioAdapter("aac");
        aacPlayer.play("aac", "melody.aac");
    }
}
