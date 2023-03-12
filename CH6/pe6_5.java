//(Sort three numbers) Write a method with the following header to display three numbers in increasing order:
//public static void displaySortedNumbers(double num1, double num2, double num3)
//Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
public class Pe_5 {
  public static void main(String[] args){
    System.out.print('Enter Three Nnumbers: ');
    double num1 = new jave.util.Scanner(System.in).nextInt();
    double num2 = new jave.util.Scanner(System.in).nextInt();
    double num3 = new jave.util.Scanner(System.in).nextInt();
    displaySortedNumbers(num1, num2, num3);
  }

  public static void displaySortedNumbers(double num1, double num2, double num3){
    double temp;
    if (num1 > num2){
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3){
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2){
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    System.out.println(num1 + " " + num2 + " " + num3);
  }

}