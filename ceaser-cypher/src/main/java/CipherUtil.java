public final class CipherUtil {

    private final static int alphabeticCharsCount = 26;

    public static String cipherMessage(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabeticPosition = character - 'a';
                int newAlphabeticPosition = (originalAlphabeticPosition + offset) % alphabeticCharsCount;
                char newCharacter = (char) ('a' + newAlphabeticPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // to get proper result, you need to exactly know, which offset was used when message was created
    public static String decipherMessage(String message, int offset) {
        return cipherMessage(message, alphabeticCharsCount - (offset % alphabeticCharsCount));
    }
}
