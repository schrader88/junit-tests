import java.util.ArrayList;
import org.junit.Test;

// Below import means we do not need to instantiate the Assert class:
import static org.junit.Assert.*;

// Sheen Estevez
// Cindy Vortex
// Nick Dean

public class StudentTest {
    @Test
    public void testGetId() {
        ArrayList<Integer> testArray = new ArrayList<>();

        Student jimmy = new Student(1234567, "Jimmy Neutron", testArray);

        assertEquals(1234567, jimmy.getId());
    }

    @Test
    public void testGetName() {
        ArrayList<Integer> testArray = new ArrayList<>();

        Student sheen = new Student(1234567, "Sheen Estevez", testArray);

        assertEquals("Sheen Estevez", sheen.getName());
    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> testArray = new ArrayList<>();
        ArrayList<Integer> testArrayTwo = new ArrayList<>();

        Student nick = new Student(1234567, "Nick Dean", testArray);

        nick.addGrade(99);
        testArrayTwo.add(99);

        assertEquals(testArrayTwo, nick.getGrades());
    }

    @Test
    public void testGetGrades() {
        ArrayList<Integer> testArray = new ArrayList<>();
        ArrayList<Integer> testArrayTwo = new ArrayList<>();

        Student cindy = new Student(1234567, "Cindy Vortex", testArray);

        cindy.addGrade(100);
        cindy.addGrade(100);
        cindy.addGrade(99);

        testArrayTwo.add(100);
        testArrayTwo.add(100);
        testArrayTwo.add(99);

        assertEquals(testArrayTwo , cindy.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        ArrayList<Integer> testArray = new ArrayList<>();

        Student carl = new Student(1234567, "Carl Wheezer", testArray);

        carl.addGrade(97);
        carl.addGrade(57);
        carl.addGrade(77);

        assertEquals(77.0, carl.getGradeAverage(), 0);
    }
}
