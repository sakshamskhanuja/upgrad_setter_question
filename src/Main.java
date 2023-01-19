public class Main {
    public static void main(String[] args) {
        // Write code here
        Person person = new Person();
        person.setName("Ankit");
    }
}

class Person {
    private String name;
    public String getName() {
        return name;
    }

    // Declare a setter method here
    public void setName(String name) {
        this.name = name;
    }
}