interface Sports{
    void play();
}

class Cricket implements Sports{
    public void play() {
        System.out.println("Playing Cricket");
    }
}

class Football extends Cricket implements Sports{
    public void play() {
        System.out.println("Playing Football");
    }
}

public class Interface_Poly
{
    public static void main(String[] args) {
        Cricket obj = new Football();
        obj.play();
    }
}
