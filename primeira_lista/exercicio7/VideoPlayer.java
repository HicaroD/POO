package exercicio7;

public class VideoPlayer {    
    public IVideo video;

    public VideoPlayer(IVideo video) {
        this.video = video;
    }

    public void play() {
        System.out.println(video.getContent());
    }
}
