import java.util.Scanner;

public class Task2 {
        //total marks = 100;
        public static void main(String[] args) {
            System.out.println("Enter obtained marks in the following subjects:");
            Scanner sc = new Scanner(System.in);

            System.out.print("Marks in English: ");
            int m1 = sc.nextInt();
            System.out.print("Marks in Science: ");
            int m2 = sc.nextInt();
            System.out.print("Marks in Maths: ");
            int m3 = sc.nextInt();
            System.out.print("Marks in Social Studies: ");
            int m4 = sc.nextInt();

            int total = m1 + m2 + m3 + m4;
            int avg = (m1 + m2 + m3 + m4)/4;
            float percent = ((float) total/400)*100;

            System.out.println("Total marks obtained by you is " + total);
            System.out.println("Average: " + avg);
            System.out.println("Overall Percentage: " + percent);

            String grade;
            if(percent>=80){
                grade = "A";
            }
            else if(percent>=70 && percent<80){
                grade = "B";
            }
            else if(percent>=50 && percent<70){
                grade = "C";
            }
            else if(percent>=40 && percent<50){
                grade = "D";
            }
            else{
                grade = "F";
            }

            System.out.println("Grade: " + grade);
        }
    }
