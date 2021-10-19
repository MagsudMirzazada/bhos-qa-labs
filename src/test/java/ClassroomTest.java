import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassroomTest {
    @Test
    void vol_test(){
        assertEquals(210, Classroom.volume(3, 10, 7));
    }


    @Test
    void area_test(){
        assertEquals(70, Classroom.area(10, 7));
    }

    @Test
    void  max_num_stu_test() { assertEquals(40, Classroom.getMaxNumStudents(20));}

    @Test
    void test_class_number() { assertEquals("This is class number 414", Classroom.getClassNumber("414"));}

    @Test
    void test_class_color() { assertEquals("This class is painted white", Classroom.getClassColor("white"));}
}