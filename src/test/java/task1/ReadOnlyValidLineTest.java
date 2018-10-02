package task1;

import by.yasenchak.task1.reader.ReaderImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReadOnlyValidLineTest {

    List<String>  expectedList;

    @BeforeClass
    public void beforeReadOnlyValidTest(){
        expectedList = new ArrayList<>();
        expectedList.add("3.0 10.2 5.2 3.0 2.0");
    }

    @Test
    public void textReadOnlyValidLinesMethod(){
        ReaderImpl reader = new ReaderImpl();
        Assert.assertEquals(reader.readOnlyValid(), expectedList);
    }
}
