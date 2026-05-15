public class strings {

    public static String fraudulentUserCheck(String[] users) {
        int count = 0;
        int n = users.length;

        for (int i = 0; i < n; i++) {
            if (isFraud(users[i])) {
                count++;
                System.out.println("Fraud user found: " + users[i]);
            }
        }

        return "Total fraudulent users: " + count;
    }

    public static boolean isFraud(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static String formatMessage(String message) {
        if (message == null || message.isEmpty()) return message;

        String[] words = message.split(" ");
        StringBuilder formatted = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                formatted.append(Character.toUpperCase(word.charAt(0)));
                formatted.append(word.substring(1));
                formatted.append(" ");
            }
        }

        return formatted.toString().trim();
    }

    public static int countVowels(String message) {
        if (message == null || message.isEmpty()) return 0;

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < message.length(); i++) {
            if (vowels.indexOf(message.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static String spamScore(String message) {
        if (message == null || message.isEmpty()) return "UNKNOWN";

        double ratio = (double) countVowels(message) / message.length();

        if (ratio > 0.70) return "HIGH SPAM";
        if (ratio > 0.50) return "MEDIUM SPAM";
        return "CLEAN";
    }

    public static String compress(String message) {
        if (message == null || message.isEmpty()) return message;

        StringBuilder compressed = new StringBuilder();
        int i = 0;

        while (i < message.length()) {
            char current = message.charAt(i);
            int count = 1;

            while (i + count < message.length() && message.charAt(i + count) == current) {
                count++;
            }

            compressed.append(current);
            if (count > 1) compressed.append(count);
            i += count;
        }

        return compressed.toString();
    }

    public static void processPipeline(String raw) {
        String formatted  = formatMessage(raw);
        int vowels        = countVowels(formatted);
        String spam       = spamScore(formatted);
        String compressed = compress(raw);

        System.out.println("Raw        : " + raw);
        System.out.println("Formatted  : " + formatted);
        System.out.println("Vowels     : " + vowels);
        System.out.println("Spam Score : " + spam);
        System.out.println("Compressed : " + compressed);
        System.out.println();
    }

    public static void main(String[] args) {
        String[] users = {
            "raman123",
            "racecar",
            "backendDev",
            "madam",
            "engineer",
            "level",
            "aaaaaa",
            "1111111"
        };

        System.out.println(fraudulentUserCheck(users));
        System.out.println();

        String[] messages = {
            "heyyyy broooo",
            "AAAAAAAAAAAAA",
            "what is upppp mannn",
            "hello world"
        };

        for (String msg : messages) {
            processPipeline(msg);
        }
    }
}