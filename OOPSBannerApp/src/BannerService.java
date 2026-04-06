public class BannerService {

    public void printBanner(String word) {
        String[] lines = BannerPattern.getBannerLines(word);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}