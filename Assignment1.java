import java.util.regex.Matcher;

import java.util.regex.Pattern;

import java.util.Scanner;



public class Assignment1 {

    public static void main(String[] args) {

//Emailaddres

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student email address: ");

        String studentNum = scanner.nextLine();

        // Long method

        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");

        Matcher matcher = pattern.matcher(studentNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }

//number
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    String number = input.nextLine();
   //method
   Pattern patt = Pattern.compile("\\+63+\\d{10}");
   Matcher matchhh = patt.matcher(number);
   boolean matchh = matchhh.matches();
   if (matchh) {
       System.out.println("valid number");
   } else {
       System.out.println("invalid number");
   }
//birthdate
Scanner sc = new Scanner(System.in);
System.out.print("Enter birthday(YYYY-MM-DD) : ");
String date = sc.nextLine();
//method
Pattern P = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
Matcher M = P.matcher(date);
boolean MA = M.matches();
if (MA) {
   System.out.println("valid date");
} else {
   System.out.println("invalid date");
    }
}
}