import Channel.Ahmad;
import Channel.youtube;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.println("hello");
        youtube yar = new youtube();
        Ahmad ahmad = new Ahmad(youtube);
        youtube.setMeasurments(23, 2);
    }
}