package exercicio7;

public class YoutubeVideo extends Video {

    private final int[] bits;

    public YoutubeVideo() {
       bits = new int[] {
              80, 97, 114, 97, 98, 233, 110, 115, 44,
              32, 118, 99, 32, 99, 111, 110, 115, 101,
              103, 117, 105, 117, 46
        };
    }

    public int[] getBits() {
       return bits;
    }

    @Override
    public String getContent() {
        String content = "";
        for(int i = 0; i < bits.length; i++) {
            content += (char)bits[i];
        }
        return content;
    }
}