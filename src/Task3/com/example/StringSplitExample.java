package Task3.com.example;

public class StringSplitExample {
    public static void main(String[] args) {

        String internetText = "Strings are constant; their values cannot be changed after they are created." +
                " String buffers support mutable strings. Because String objects are immutable they can be shared";

        String[] sentences = internetText.split("\\.");

        if (sentences.length % 2 != 0) {
            sentences[0] += sentences[sentences.length - 1];
        }

        int middle = sentences.length / 2;
        String[] firstHalf = new String[middle];
        String[] secondHalf = new String[middle];

        for (int i = 0; i < middle; i++) {
            firstHalf[i] = sentences[i];
            secondHalf[i] = sentences[i + middle];
        }

        System.out.println("Перший підрядок:");
        for (String sentence : firstHalf) {
            System.out.println(sentence.trim());
        }

        System.out.println("\nДругий підрядок:");
        for (String sentence : secondHalf) {
            System.out.println(sentence.trim());
        }
    }
}
