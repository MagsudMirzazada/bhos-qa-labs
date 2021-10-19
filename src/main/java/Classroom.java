import java.lang.Math;

public class Classroom{
    int length;
    int height;
    int num_of_tables;
    private static String course_number;
    int width;
    private static String color;


    public Classroom(int h, int l, int w, int num_tables, String c, String col){
        this.height = h;
        this.length = l;
        this.width = w;
        this.num_of_tables = num_tables;
        this.course_number = c;
        this.color = col;

    }

    public int getNumTables(){
        return num_of_tables;
    }

    public String getClassNumber(){
        return course_number;
    }

    public String getClassColor(){
        return color;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }




    public static String getClassNumber(String coursenumber){
        return "This is class number " + coursenumber;
    }

    public static String getClassColor(String classcolor){
        return "This class is painted " + classcolor;
    }

    public static int getMaxNumStudents(int num_tables){
        int total = 2*num_tables;
        return total;
    }
    public static int area(int l, int w){
        int total = l*w;
        return total;
    }

    public static int volume(int h, int l, int w){
        int total = h*l*w;
        return total;
    }


    public static void main(String[] args){
        Classroom classroom = new Classroom(3, 10, 7, 20, "414","white");
        System.out.println("Area : " + area(classroom.getLength(), classroom.getWidth()));
        System.out.println("Volume: " + volume(classroom.getHeight(), classroom.getLength(), classroom.getWidth()));
        System.out.println("Max number students that can be in classroom: " + getMaxNumStudents(classroom.getNumTables()));
        System.out.println("Class number: " + getClassNumber(classroom.getClassNumber()));
        System.out.println("Class color: " + getClassColor(classroom.getClassColor()));

    }

}