package griffith;
import java.util.*;

public class Grades {
    public int gradesMax(int[] grades) {
        if (grades.length == 0) return Integer.MIN_VALUE;
        return Arrays.stream(grades).max().getAsInt();
    }

    public int gradesTotal(int[] grades) {
        return Arrays.stream(grades).sum();
    }

    public double gradesAverage(int[] grades) {
        if (grades.length == 0) return 0.0;
        return (double) gradesTotal(grades) / grades.length;
    }

    public int countFails(int[] grades, int minGrade) {
        return (int) Arrays.stream(grades).filter(g -> g < minGrade).count();}
}