package addstring;

import java.util.Optional;

public class StringAddCalculator {

    private static final String DEFAULT_DELIMITERS = ",|:";

    public static int splitAndSum(final String string) {
        int result = 0;

        if (string == null || string.isEmpty()) {
            return 0;
        }

        final String[] split = splitDelimiters(string);

        for (String s : split) {
            final int i = Integer.parseInt(s.trim());
            validationNegative(i);
            result += i;
        }

        return result;
    }

    private static String[] splitDelimiters(final String string) {
        Optional<String> customDelimiterOpt = validateCustomSplit(string);
        String substring = string.substring(string.indexOf("\n") + 1);

        String[] split = customDelimiterOpt.map(newDelimiter -> substring.split(DEFAULT_DELIMITERS + "|" + newDelimiter)).orElseGet(() -> substring.split(DEFAULT_DELIMITERS));
        return split;
    }

    private static Optional<String> validateCustomSplit(final String string) {
        if (string.startsWith("//")) {
            final int newLineIndex = string.indexOf("\n");
            return Optional.of(string.substring(2, newLineIndex));
        }

        return Optional.empty();
    }

    private static void validationNegative(final int i) {
        if (i < 0) {
            throw new RuntimeException("값은 음수일 수 없습니다.");
        }
    }
}
