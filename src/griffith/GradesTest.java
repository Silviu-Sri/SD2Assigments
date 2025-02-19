package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradesTest {
    @Test
    public void testGradesMax() {
        Grades g = new Grades();
        int[] grades = {45, 78, 90, 32, 88};
        assertEquals(90, g.gradesMax(grades));

        int[] negativeGrades = {-10, -5, -20, -3};
        assertEquals(-3, g.gradesMax(negativeGrades));

        int[] singleElement = {50};
        assertEquals(50, g.gradesMax(singleElement));
    }

    @Test
    public void testGradesTotal() {
        Grades g = new Grades();
        int[] grades = {10, 20, 30, 40};
        assertEquals(100, g.gradesTotal(grades));

        int[] emptyArray = {};
        assertEquals(0, g.gradesTotal(emptyArray));
    }

    @Test
    public void testGradesAverage() {
        Grades g = new Grades();
        int[] grades = {50, 60, 70, 80};
        assertEquals(65.0, g.gradesAverage(grades), 0.01);
    }

    @Test
    public void testCountFails() {
        Grades g = new Grades();
        int[] grades = {10, 20, 50, 70};
        assertEquals(2, g.countFails(grades,40));;}
}