package exercicio7;

class Exercicio7 {
    public static void main(String[] args) { 
        YoutubeVideo youtubeVideo = new YoutubeVideo(); 
        FaceVideo faceVideo = new FaceVideo(); 
        VideoPlayer videoPlayer = new VideoPlayer(youtubeVideo);
        videoPlayer.play();
        videoPlayer.setVideo(faceVideo);
        videoPlayer.play();
    }
}