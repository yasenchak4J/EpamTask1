package by.yasenchak.task1.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParserImpl implements Parser {

    private List<Double[]> doubleList;
    private static final Pattern DELETE_EXTRA_SPACE = Pattern.compile("[\\s]{2,}");

    @Override
    public List<Double[]> parserList(List<String> listOfLines) {
        doubleList = new ArrayList<Double[]>();
        String[] splitArray;
        Double[] doubleArray = null;
        for (String line: listOfLines) {
            line = DELETE_EXTRA_SPACE.matcher(line).replaceAll(" ").trim();
            splitArray = line.split(" ");
            doubleArray = new Double[splitArray.length];
            for (int i = 0; i < splitArray.length; i++) {
                doubleArray[i] = Double.parseDouble(splitArray[i]);
            }
            doubleList.add(doubleArray);
        }
        return doubleList;
    }
}
