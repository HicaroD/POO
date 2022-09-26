package exercicio7;

public class Exercicio7 {
    public static void main(String[] args) {
        YoutubeVideo youtubeVideo = new YoutubeVideo(); 
        FaceVideo faceVideo = new FaceVideo(); 
        VideoPlayer videoPlayer = new VideoPlayer(faceVideo);
        videoPlayer.play();
        videoPlayer.video = youtubeVideo;
        videoPlayer.play();
    } 
}