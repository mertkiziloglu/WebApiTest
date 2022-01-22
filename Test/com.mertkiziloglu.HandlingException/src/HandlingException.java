public class HandlingException {

    public static void main(String[] args) {
        int i = 12;
        int j = 4;

        try {
            int result = i / (j - 2);
            System.out.println("Result: " + result);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());  //error : /by zero
        }

    }
}
