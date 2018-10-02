package by.yasenchak.task1.reader;

import by.yasenchak.task1.validator.Validator;
import by.yasenchak.task1.validator.ValidatorImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderImpl implements Reader {

    private static final Path FILE_PATH = Paths.get("resource/data.txt");
    private List<String> listOfAllLines;
    private List<String> listOfOnlyValidLines;

    @Override
    public List<String> read() {
        listOfAllLines = new ArrayList<>();

        try(Stream<String> lineStream = Files.lines(FILE_PATH) ) {

            listOfAllLines = lineStream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfAllLines;
    }

    @Override
    public List<String> readOnlyValid() {
        listOfAllLines = new ArrayList<>();
        listOfOnlyValidLines = new ArrayList<>();
        ValidatorImpl validator = new ValidatorImpl();
        try(Stream<String> lineStream = Files.lines(FILE_PATH) ) {

            listOfAllLines = lineStream.collect(Collectors.toList());

            for (String line: listOfAllLines) {
                if (validator.isValid(line)){
                    listOfOnlyValidLines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfOnlyValidLines;
    }
}
