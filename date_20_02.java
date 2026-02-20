// public class date_20_02 {
    
//         static void test(int a) //formal argument
//         {
            
//             System.out.println("Value: "+a);
//         }
    
//     public static void main(String[] args) {

//         test(25); //actual argument
//     }
        
// }

//program2:
 class date_20_02
 {
//     static void disp(double d)
//     {
//         System.out.println("value " + d);
//     }
//     public static void main(String[] args)
//     {
//         disp(2.3);
//         disp(32.31);
//     }
 

// output:value 2.3
// value 32.31

//program3:
 static void run(boolean bool)
 {
        System.out.println("passedvalue " + bool);

 }
 static void help(char ch)
 {
    System.out.println("value passed  " + ch);
    run(true);
 }
 public static void main(String[] args)
 {
    help('J');
 }
}

