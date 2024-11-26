import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String grade = "";
        if(n >= 90){
            grade = "A+";
        }
        else if(n >= 75 && n < 90){
            grade = "A";
        }
        else if(n >= 50 && n < 75){
            grade = "B";
        }
        else{
            grade = "Fail";
        }
        System.out.println("The grade of a student is : "+grade);
    }
}
