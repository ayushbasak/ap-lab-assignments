import Rational.*;
import java.util.*;
public class Program{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Menu: Choose\n");
        System.out.println("1: ADD");
        System.out.println("2: SUBTRACT");
        System.out.println("3: MULTIPLY");
        System.out.println("4: DIVIDE");
        System.out.println("5: EXIT");

        int choice = sc.nextInt();

        switch(choice){
            case 1:{
                System.out.println("Enter p,q for Rational Number 1");
                System.out.println("Enter p,q for Rational Number 2");

                int w,x,y,z;
                w = sc.nextInt();
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                Rational obj01 = new Rational(w,x);
                Rational obj02 = new Rational(y,z);
                Rational  sum = Rational.add(obj01,obj02);
                System.out.println(sum.p +"/" + sum.q);
                break;
            }
            case 2:{
                System.out.println("Enter p,q for Rational Number 1");
                System.out.println("Enter p,q for Rational Number 2");

                int w,x,y,z;
                w = sc.nextInt();
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                Rational obj01 = new Rational(w,x);
                Rational obj02 = new Rational(y,z);
                Rational  sum = Rational.subtract(obj01,obj02);
                System.out.println(sum.p +"/" + sum.q);
                break;
            }
            case 3:{
                System.out.println("Enter p,q for Rational Number 1");
                System.out.println("Enter p,q for Rational Number 2");

                int w,x,y,z;
                w = sc.nextInt();
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                Rational obj01 = new Rational(w,x);
                Rational obj02 = new Rational(y,z);
                Rational  sum = Rational.multiply(obj01,obj02);
                System.out.println(sum.p +"/" + sum.q);
                break;
            }
            case 4:{
                System.out.println("Enter p,q for Rational Number 1");
                System.out.println("Enter p,q for Rational Number 2");

                int w,x,y,z;
                w = sc.nextInt();
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                Rational obj01 = new Rational(w,x);
                Rational obj02 = new Rational(y,z);
                Rational  sum = Rational.divide(obj01,obj02);
                System.out.println(sum.p +"/" + sum.q);
                break;
            }
            case 5:{
                System.exit(0);
            }
            default:
                System.out.println("Invalid Choice");
        }
        String [] argument = {""};
        main(argument);
        sc.close();
    }
}