package exercicio7;

public class VideoPlayer {
    private IVideo video;

    public VideoPlayer(IVideo video) {
        this.video = video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    public void play() {
        String content = video.getContent();
        System.out.println(content);
    }
}