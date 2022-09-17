package exercicio7;

public class VideoPlayer {
    private Video video;

    public VideoPlayer(Video video) {
        this.video = video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void play() {
        String content = video.getContent();
        System.out.println(content);
    }
}