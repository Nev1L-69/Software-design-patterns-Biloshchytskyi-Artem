import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> lectures;

    public OnlineCourse() {
        lectures = new ArrayList<>();
    }

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void playLecture(int index) {
        if (index < 0 || index >= lectures.size()) {
            System.out.println("Invalid lecture index.");
            return;
        }
        lectures.get(index).play();
    }
}
