public class BannerPattern {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });
    }

    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        });
    }

    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[] {
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            " ****"
        });
    }

    public static String[] getBannerLines() {
        CharacterPattern o1 = getOPattern();
        CharacterPattern o2 = getOPattern();
        CharacterPattern p = getPPattern();
        CharacterPattern s = getSPattern();

        String[] lines = new String[7];

        for (int i = 0; i < 7; i++) {
            lines[i] = String.join("   ",
                    o1.getPattern()[i],
                    o2.getPattern()[i],
                    p.getPattern()[i],
                    s.getPattern()[i]);
        }

        return lines;
    }
}