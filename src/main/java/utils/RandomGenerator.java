package utils;

import java.util.Random;

public class RandomGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()";
    private static final int PASSWORD_LENGTH = 8;

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }

    public static String generateRandomPassword() {
        StringBuilder sb = new StringBuilder(PASSWORD_LENGTH);
        Random random = new Random();
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(NUMBERS.length());
            sb.append(NUMBERS.charAt(randomIndex));
        }
        int randomIndex = random.nextInt(SPECIAL_CHARACTERS.length());
        sb.append(SPECIAL_CHARACTERS.charAt(randomIndex));
        return sb.toString();
    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
        Random random = new Random();
        int randomIndex = random.nextInt(domains.length);
        String domain = domains[randomIndex];
        String username = generateRandomString(8);
        return username + "@" + domain;
    }

    public static String generateRandomPhoneNumber() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        sb.append("+");
        for (int i = 0; i < 11; i++) {
            int randomIndex = random.nextInt(NUMBERS.length());
            sb.append(NUMBERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}