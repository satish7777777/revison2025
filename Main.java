// public class function {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(9, 5));
//     }
// }

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hello() {
        System.out.println("My name is " + name + " and my age is " + age);
    }

}

public class Main {

    public static void main(String[] args) {
        Person p = new Person("satish", 20);
        p.hello();
    }
}