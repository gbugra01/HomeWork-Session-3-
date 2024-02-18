package ThirdWeeksWork;

import java.util.Scanner;

public class ParentException {
    public static void main(String[] args) {

        System.out.println("Program Starts");
        int a =0;
        int b=0;
        int[] arr=new int[3];
        Scanner sc=new Scanner(System.in);
        try{
            a=2/1;
            //System.out.println(a);
            arr[0]=10;
            b=sc.nextInt();
        }catch (ArithmeticException err){
            System.out.println(err.getMessage());
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException.toString());
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        System.out.println("The End!");
    }
}