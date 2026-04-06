public class BannerPattern {

    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            " ****"
        };
    }

    public static String[] getBannerLines() {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] lines = new String[7];

        for (int i = 0; i < 7; i++) {
            lines[i] = String.join("   ", oPattern[i], oPattern[i], pPattern[i], sPattern[i]);
        }

        return lines;
    }
}