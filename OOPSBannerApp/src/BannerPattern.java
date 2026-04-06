import java.util.HashMap;
import java.util.Map;

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

    public static Map<Character, CharacterPattern> createPatternMap() {
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            " ****"
        }));

        return patternMap;
    }

    public static String[] getBannerLines(String word) {
        Map<Character, CharacterPattern> patternMap = createPatternMap();
        String[] lines = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                CharacterPattern cp = patternMap.get(ch);

                if (cp != null) {
                    lineBuilder.append(cp.getPattern()[i]);
                    if (j < word.length() - 1) {
                        lineBuilder.append("   ");
                    }
                }
            }

            lines[i] = lineBuilder.toString();
        }

        return lines;
    }
}