package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance (){
        Point p1 = new Point(5, 3);
        Point p2 = new Point(1,8);
        Assert.assertEquals(p1.distance(p2), 6.4031242374328485);


        Point r1 = new Point(123, 4553);
        Point r2 = new Point(34, 58);
        assert r1.distance(r2) == 4495.881003763334;
    }

}
