public class BannerPattern {

    public static String[] getBannerLines() {

        return new String[] {
            String.join("   ", " *** ", " *** ", "*****", " ****"),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "*****", " ****"),
            String.join("   ", "*   *", "*   *", "*", "        *"),
            String.join("   ", "*   *", "*   *", "*", "        *"),
            String.join("   ", " *** ", " *** ", "*", "   ****")
        };
    }
}