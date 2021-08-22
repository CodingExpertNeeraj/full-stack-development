class Student1{
    int id;
    String name;
}


public class Student2 {
    public static void main(String[] args) {
        Student1 obj =new Student1();
        obj.id =100;
        obj.name = "Rachit rastogi";
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
