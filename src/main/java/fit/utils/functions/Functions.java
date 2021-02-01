package fit.utils.functions;

import java.util.function.Function;

public class Functions {

    private static final String defaultSeparator = "--->";
    private static final String defaultPrefix = "[prefix]";

    private static Function<String, String> loggerBuilder() {
        return loggerBuilder(defaultPrefix, defaultSeparator);
    }

    private static Function<String, String> loggerBuilder(String prefix) {
        return loggerBuilder(prefix, defaultSeparator);
    }

    private static Function<String, String> loggerBuilder(String prefix, String separator) {
        return str -> {
            var text = String.format("%s %s %s", prefix, separator, str);
            System.out.println(text);

            return text;
        };
    }

    public static void experiment() {
        var logger = loggerBuilder();
        var loggerDecorated = loggerBuilder("||prefix||", "==>");
        var anything = "qualquer coisa";
        logger.apply(anything);
        loggerDecorated.apply(anything);
    }
}
