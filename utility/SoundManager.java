package utility;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import main.Main;

public class SoundManager {
    // 播放音效的方法
    public static void playSound(String soundFilePath) {
        Media sound = new Media(Main.class.getResource(soundFilePath).toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();  // 播放音效
    }
}
