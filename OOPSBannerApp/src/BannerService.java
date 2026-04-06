public class BannerService {

    public void printBanner() {
        String[] lines = BannerPattern.getBannerLines();

        for (String line : lines) {
            System.out.println(line);
        }
    }
}