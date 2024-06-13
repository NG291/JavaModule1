package accessmodifier.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("name", "lop2");
        Student s3 = new Student();
        s3.setName("nguyen");
        System.out.println(s3.toString());
        System.out.println(s2.toString());
        System.out.println(s1.toString());
    }
}
