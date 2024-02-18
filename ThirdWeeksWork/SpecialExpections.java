package ThirdWeeksWork;

public class SpecialExpections {
    public static void main(String[] args){
        int[] a=new int[3];

        System.out.println("Program Starts Work");
        try{
            a[4]=10;
        }catch (ArithmeticException ar){
            System.out.println("ERROR!");
            System.out.println(ar.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("The End!");
    }
    }

