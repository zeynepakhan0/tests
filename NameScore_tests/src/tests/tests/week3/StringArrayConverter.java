package tests.week3;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayConverter implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {

        if (source == null) {
            return null;
        }

        // Ensure the source is a String
        if (!(source instanceof String)) {
            throw new ArgumentConversionException("Source must be a String");
        }

        String input = (String) source;

        if (input.isEmpty()) {
            return new ArrayList<String>();
        }

        // Split by comma and convert to ArrayList
        String[] parts = input.split(",");
        return new ArrayList<>(Arrays.asList(parts));
    }
}