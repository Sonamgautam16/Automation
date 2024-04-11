import java.util.Scanner;

class CaseIdentifier2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        String input = sc.next();
        char c = input.charAt(0);

        if (c >= 65 && c <= 90) {
            System.out.println("Upper case");
        } else if (c >= 97 && c <= 122) {
            System.out.println("Lower case");
        } else {
            System.out.println("Invalid character");
        }
    }
}
