public class AnotherClass extends MyClass {
    //accessing public method and attributes
    public static void main(String[] args) {
        //creating an instance
        MyClass myobj = new MyClass();
        myobj.publicMethod(); //accessing public method
        //private method cant be accessed
        myobj.protectedMethod();
    }
}
