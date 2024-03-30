public class Error_Handling {
    public static void main(String[] args) {
        try {
            int[] myNums = {1,2,3,4,5};

            System.out.println(myNums[-1]);
        } catch (Exception e) {
            System.out.println("Maximum index you can give is 0-4");
        }
        finally {
            System.out.println("Try-catch if finished and clean and closing db connections");
        }
    }
}
