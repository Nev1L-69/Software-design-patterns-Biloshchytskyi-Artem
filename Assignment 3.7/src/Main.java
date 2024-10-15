public class Main {
    public static void main(String[] args) {

        OnlineCourse course = new OnlineCourse();

        VideoLecture lecture1 = new ProxyVideoLecture("Introduction to Java");
        VideoLecture lecture2 = new ProxyVideoLecture("Design Patterns in Java");
        VideoLecture lecture3 = new ProxyVideoLecture("Advanced Java Programming");

        course.addLecture(lecture1);
        course.addLecture(lecture2);
        course.addLecture(lecture3);

        System.out.println(lecture1.getInfo());
        System.out.println(lecture2.getInfo());
        System.out.println(lecture3.getInfo());
        System.out.println();

        System.out.println("Playing Lecture 1:");
        course.playLecture(0);
        System.out.println();

        System.out.println("Playing Lecture 2:");
        course.playLecture(1);
        System.out.println();

        // Play the first lecture again (no loading, it should be instant)
        System.out.println("Playing Lecture 1 again:");
        course.playLecture(0);
    }
}
