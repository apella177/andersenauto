package Task16;

import java.util.Random;

class Generic {
    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static <T> T generateValueByType(String type) {
        Random random = new Random();

        if (type.equalsIgnoreCase("число")) {
            Integer value = random.nextInt();
            return (T) value;

        } else if (type.equalsIgnoreCase("цифра")) {
            Integer value = random.nextInt(10);
            return (T) value;

        } else if (type.equalsIgnoreCase("символ")) {
            char symbol = ALPHABET[random.nextInt(ALPHABET.length)];
            Character value = Character.valueOf(symbol);
            return (T) value;

        } else if (type.equalsIgnoreCase("строка")) {
            String value = generateString();
            return (T) value;

        } else {
            System.err.println("Your type is wrong! Set another type.");
            return null;
        }
    }
    private static String generateString() {
        int length = 15;
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = ALPHABET[random.nextInt(ALPHABET.length)];
            sb.append(c);
        }
        String result = sb.toString();
        return result;
    }
}
