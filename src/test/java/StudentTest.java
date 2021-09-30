import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

// Below import means we do not need to instantiate the Assert class:
import static org.junit.Assert.*;

public class StudentTest {

    private Student studentOne;
    private Student studentTwo;
    private Student studentThree;
    private Student studentFour;

    @Before
    public void setup() {
        studentOne = new Student(1L, "Kyle Schrader");
        studentTwo = new Student(2L, "Jimmy Neutron");
        studentThree = new Student(3L, "Sheen Estevez");
        studentFour = new Student(4L, "Carl Wheezer");
    }

    @Test
    public void testGetId() {
        assertEquals(1L, studentOne.getId());
        assertEquals(2L, studentTwo.getId());
        assertEquals(3L, studentThree.getId());
        assertEquals(4L, studentFour.getId());

    }

    @Test
    public void testGetName() {
      assertEquals("Kyle Schrader", studentOne.getName());
      assertEquals("Jimmy Neutron", studentTwo.getName());
      assertEquals("Sheen Estevez", studentThree.getName());
      assertEquals("Carl Wheezer", studentFour.getName());
    }

    @Test
    public void testAddGrade() {
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(97);
        testArray.add(57);
        testArray.add(77);

        studentOne.addGrade(97);
        studentOne.addGrade(57);
        studentOne.addGrade(77);

        studentTwo.addGrade(100);
        studentTwo.addGrade(0);
        studentTwo.addGrade(0);

        studentThree.addGrade(97);
        studentThree.addGrade(57);
        studentThree.addGrade(77);

        studentFour.addGrade(44);
        studentFour.addGrade(13);
        studentFour.addGrade(86);

        assertEquals(testArray, studentOne.getGrades());
        assertNotEquals(testArray, studentTwo.getGrades());
        assertEquals(testArray, studentThree.getGrades());
        assertNotEquals(testArray, studentFour.getGrades());
    }

    @Test
    public void testGetGrades() {
        ArrayList<Integer> testArray = new ArrayList<>();

        assertEquals(testArray , studentOne.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        studentOne.addGrade(97);
        studentOne.addGrade(57);
        studentOne.addGrade(77);

        assertEquals(77.0, studentOne.getGradeAverage(), .5);
    }

    @Test
    public void testUpdateGrade() {
        ArrayList<Integer> testArray = new ArrayList<>();

        studentOne.addGrade(100);
        studentOne.addGrade(100);
        studentOne.addGrade(100);

        testArray.add(100);
        testArray.add(98);
        testArray.add(100);

        studentOne.updateGrade(2, 98);

        assertEquals(testArray , studentOne.getGrades());

    }
}
