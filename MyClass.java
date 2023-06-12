public class MyClass {
    public static void main(String[] args) {
        Student mark = new Student(); //mark-> object or instance

        mark.id= 1;
        mark.name= "Mark";
        mark.age= 15;
        //System.out.println(mark.name + "is" + mark.age + "years old");

        Student tom = new Student(); //mark-> object or instance

        tom.id= 2;
        tom.name= "Tom";
        tom.age= 14;
        System.out.println(mark.name  + " is " +  mark.age +  " years old");
        System.out.println(tom.name  + " is " +  tom.age +  " years old");



    }

    public static class Student {
       public int id;
        public String name;
        public int age;
    }
}