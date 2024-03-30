public class MyClass {
    public int publicVariable;
    //private attribute
    private int privateVariable;
    //protected variable
    protected int protectedVariable;

    int packageprivateVariable;
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    //private method
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    //protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    //default-package-private method
    void privatepackageMethod() {
        System.out.println("This is private package default method");
    }

    public static void main(String[] args) {
        //creating instance
        MyClass myobj = new MyClass();
        myobj.privateMethod();
        myobj.privatepackageMethod();
    }
}
