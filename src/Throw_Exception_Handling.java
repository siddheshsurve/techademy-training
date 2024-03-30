public class Throw_Exception_Handling {

    public static void main(String[] args) {
        try {
            int age = -1;
            if(age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Your age is "+age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred : " + e.getMessage());
        }
    }
}
