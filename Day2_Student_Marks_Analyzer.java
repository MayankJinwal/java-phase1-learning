import java.util.Scanner;

public class Day2_Student_Marks_Analyzer {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Enter Number of Students: ");
    int n = scanner.nextInt();

    double[] marks = new double[n];

    for(int i = 0; i < n; i++){
        System.out.print("Enter marks for student " + (i + 1) + ": ");
        marks[i] = scanner.nextDouble();
    }

double total = 0;
double heighest = marks[0];
double lowest = marks[0];

for (double m: marks){
    total += m;
    if (m > heighest){
        heighest = m;
    }
    if (m < lowest){
        lowest = m;
    }
}

double average = total/ n;

System.out.println("\n==== Result Summary ====");
System.out.println("Total Marks: " + total);
System.out.println("Average Marks: " + average); 
System.out.println("Higehst Marks: "+ heighest);
System.out.println("Lowest Marks: " + lowest);

scanner.close();
}
}
