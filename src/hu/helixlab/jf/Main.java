package hu.helixlab.jf;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10.2,30.1,"Blue");
       /* System.out.println("Length: " +rectangle2.getLength());
        System.out.println("Width: " +rectangle2.getWidth());
        System.out.println("Color: " +rectangle2.getColor()); */
      rectangle2.print();
        rectangle.setLength(23);
        rectangle.setWidth(45.6);
        rectangle.setColor("Red");

	/*int number =0;
        Scanner scanner = new Scanner(System.in);
	System.out.println("next number:");
        number = scanner.nextInt();
        System.out.println("Number - " + number);
	Random random = new Random();
	int randomNumber = random.nextInt(11);  felső korlát
        System.out.println("random number:" + randomNumber);
        System.out.println(Math.sqrt(10.0));
        print();
        System.out.println(sum (10,3));
        System.out.println(getTheBigger (10,3)); */
   System.out.println(Math.sum(3,4));
        System.out.println(Math.subs(10,4));
        System.out.println(Math.mult(2,4));
        System.out.println(Math.div(56,12));

    }
      /*  static void print() {

	    System.out.println("sdfsd");
        }

      private static int sum(int x, int y){
          return x + y;

      }
    private static int getTheBigger(int x, int y){
          if(x>y){
              return (x);
          }
          else if (y<y) {
              return (y);
          }
          else {
              System.out.println("A két szám egyenlő");
          }
        return x > y ? x : y;

    } */
}
