public class Person {
    //private attributes
    private String name;
    private int age;

    //constructor
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    //public getter method
    public String getName() {
        return name;
    }

    //public setter method for name attribute
    public void setName(String name) {
        this.name = name;
    }

    //public getter method for age
    public int getAge() {
        return age;
    }

    //public setter for age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age, Must be above 0");
        }
    }

    public void display() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(14);
        p.setName("Sarvesh");
        p.getName();
        p.getAge();
        p.display();
    }
}
