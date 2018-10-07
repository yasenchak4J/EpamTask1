package by.yasenchak.task1.creator;

import by.yasenchak.task1.entity.Point;
import by.yasenchak.task1.entity.Pyramid;
import by.yasenchak.task1.exception.ParserException;
import by.yasenchak.task1.exception.ReadException;
import by.yasenchak.task1.parser.Parser;
import by.yasenchak.task1.parser.ParserImpl;
import by.yasenchak.task1.reader.Reader;
import by.yasenchak.task1.reader.ReaderImpl;

import java.util.ArrayList;
import java.util.List;

public class PyramidCreatorImpl implements PyramidCreator {

    private List<Pyramid> pyramidList = new ArrayList<>();
    private Parser parser = new ParserImpl();
    private Reader reader = new ReaderImpl();

    @Override
    public List<Pyramid> create() {
        List<Double[]> points = createDoubleListOfPoints();
        for (Double[] pointsofPyramid: points) {
            Point pointOfCenterPyramid = new Point();
            Pyramid pyramid = new Pyramid();

            pointOfCenterPyramid.setPointX(pointsofPyramid[3]);
            pointOfCenterPyramid.setPointY(pointsofPyramid[4]);
            pointOfCenterPyramid.setPointZ(pointsofPyramid[5]);

            pyramid.setNumberOfAngles(pointsofPyramid[0].intValue());
            pyramid.setHeight(pointsofPyramid[1]);
            pyramid.setBottomSideLength(pointsofPyramid[2]);
            pyramid.setPointOfCentrePyramid(pointOfCenterPyramid);

            pyramidList.add(pyramid);
        }
        return pyramidList;
    }

    private List<String> createListStringPoints() {
        List<String> stringListOfPoint = new ArrayList<>();
        try {
            stringListOfPoint = reader.readOnlyValid("resource/data.txt");
        } catch (ReadException e) {
            e.printStackTrace();
        }
        return stringListOfPoint;
    }

    private List<Double[]> createDoubleListOfPoints(){
        List<String> listString = createListStringPoints();
        List<Double[]> doubleList = new ArrayList<>();
        try {
            doubleList = parser.parserList(listString);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        return doubleList;
    }
}
