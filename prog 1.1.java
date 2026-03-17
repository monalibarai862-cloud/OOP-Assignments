class Person {
    String name;
    int age;

   
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating two Person objects
        Person p1 = new Person("Anushka", 21);
        Person p2 = new Person("Kashish", 23);

        // Printing their details
        p1.display();
        p2.display();
    }
}