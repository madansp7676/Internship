import java.util.Scanner;
class program4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mobile number");
        long mobile=sc.nextLong();
        System.out.println("enter the ctc");
        double ctc=sc.nextDouble();
        System.out.println("are you single");
        boolean single=sc.nextBoolean();

        System.out.println("Mobile Number: "+mobile);
        System.out.println("CTC: "+ctc);
        System.out.println("Single: "+single);
    }
}