public class Person {
    private final String name;
    private final int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() 
        return id;
    }

    public static void main(String[] args) {
        Person student = new Person("Asif", 5919);
        System.out.println("Name :" + student.getName());
        System.out.println("ID :" + student.getId());
    }
}
