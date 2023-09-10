class student{
    int pm;
    int cm;
    int em;
    int hm;
}
public class Test{
    public static void main(String[] args) {
        student s = new student();
        s.pm = 90;
        s.cm = 95;
        s.em = 99;
        s.hm = 100;

        System.out.println("Physics marks = "+ s.pm);
        System.out.println("Chemistry marks = "+ s.cm);
        System.out.println("English marks = "+ s.em);
        System.out.println("Hindi marks = "+ s.hm);
    }
}
