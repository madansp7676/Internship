//feb-16

class looping
{
    public static void main(String[] args)
    {


       // Program to print 11110
       // int n=5;
        //int val=1;
        //for(int i=0;i<n;i++);
        //{
          //  for(int j=5;j<n;j++);
            //{
              //  System.out.print(val+" ");
     //           val++;
       //     }
         //   System.out.println();
        //}


//        int n=5;
  //      for(int i=1;i<n;i++)
//        {
  //          for(int j=1;j<n;j++)
    //        {
      //          if(i%2==1)
        //            System.out.print("1"+" ");
          //      else
//            //        System.out.println("0"+" ");
  //          }
    //    }

   // program2

   //int n=5;
   //int val=1;
  // for(int i=0;i<n;i++)
//    {
//     for(int j=0;j<n;j++)
//     {
//         System.out.print(val+" ");
//         val++;
//     }
//     System.out.println();
//     val++;
//     val=1;
//    }
//Output:
// 1 2 3 4 5 
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5


//program 3:

// int n=5;
// for(int i=0;i<n;i++)
// {
//   for(int j=0;j<n;j++)
//   {
//     if(i%2==0)
//       {
//         System.out.print("1"+" ");
//         }
//         else{
//           System.out.print("0"+" ");
//         }
// }
// System.out.println();
// }
// output:1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1
// 0 0 0 0 0
// 1 1 1 1 1

//program 4:

// int n=5;
// for(int i=0;i<n;i++)
// {
//   for(int j=0;j<n;j++)
//       {
//         System.out.print("*"+" ");
//         }
//           System.out.println();
//         }

//         output:
//          * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *

//program 5:

// int n=5;
// for(int i=0;i<n;i++)
// {
//   for(int j=0;j<n;j++)
//       {
//         if(i==0 || j==0|| i==n-1|| j==n-1)
//           {
//             System.out.print("*"+" ");
//             }
//             else{
//               System.out.print(" "+" ");
//             }
//     }
//     System.out.println();
//    }       

// //    output:* * * * * 
// // *  -  -  - *
// // *  -  -  - *
// // *  -  -  - *
// // * * * * *

// //space is represented by - in the output
// // * * * * * 
// // *       *
// // *       *
// // *       *
// // * * * * *

// //program 6:

// int m=5;
// for(int i=0;i<m;i++)
// {
//   for(int j=0;j<m;j++)
//       {
//         if(i==m/2 || j==m/2) 
//           {
//             System.out.print("*"+" ");
//             }
//             else{
//               System.out.print(" "+" ");
//             }
//     }
//     System.out.println();
//    }

//    output:
//          *     
//     *
// * * * * *
//     *
//     *


//program 7:

// int n=5;
// for(int i=0;i<n;i++)
// {
//   for(int j=0;j<n;j++)
//       {
//         if(i==0 || j==0|| i==n-1|| j==n-1 || i==n/2 || j==n/2) 
//           {
//             System.out.print("*"+" ");
//             }
//             else{
//               System.out.print(" "+" ");
//             }
//     }
//     System.out.println();
//    }

//    output:
//    * * * * * 
// *   *   *
// * * * * *
// *   *   *
// * * * * *

//program 8:

// int n=5;
// for(int i=0;i<n;i++)
// {
//   for(int j=0;j<n;j++)
//   {
//     if(i==j || i+j==n-1)
//       {
//         System.out.print(" "+" ");
//         }
//         else{
//           System.out.print("* "+" ");
//         }
//   }
//   System.out.println();

// }

// output:
//   *  *  *    
// *    *    *
// *  *    *  *
// *    *    *
//   *  *  *
   //propgram 9:

//         for(char c = 'A'; c <= 'Z'; c++){
//             System.out.println("Letter " + c + ":");
//             for(int i = 0; i < 5; i++){
//                 for(int j = 0; j < 5; j++){
                    
                    
//                     switch(c){
//                         case 'A':
                            
//                             if ((i == 0 && j == 2) || (i == 1 && (j == 1 || j == 3)) || (i >= 2 && j % 2 == 0)) star = true;
//                             break;
//                         case 'B':
//                             if (j == 0 || (i % 2 == 0 && j < 4) || (i % 2 == 1 && j == 4)) star = true;
//                             break;
//                         case 'C':
//                             if (i == 0 || i == 4 || j == 0) star = true;
//                             break;
//                         case 'D':
//                             if (j == 0 || ((i == 0 || i == 4) && j < 4)) star = true;
//                             break;
//                         case 'E':
//                             if (j == 0 || i % 2 == 0) star = true;
//                             break;
//                         case 'F':
//                             if (j == 0 || i == 0 || i == 2) star = true;
//                             break;
//                         case 'G':
//                             if (i == 0 || i == 4 || j == 0 || (i == 2 && j >= 2) || (i == 3 && j == 4)) star = true;
//                             break;
//                         case 'H':
//                             if (j == 0 || j == 4 || i == 2) star = true;
//                             break;
//                         case 'I':
//                             if (j == 2) star = true;
//                             break;
//                         case 'J':
//                             if ((i < 3 && j == 4) || (i == 3 && j == 0) || (i == 4 && j < 3)) star = true;
//                             break;
//                         case 'K':
//                             if (j == 0 || i == j - 1 || i + j == 3) star = true;
//                             break;
//                         case 'L':
//                             if (j == 0 || i == 4) star = true;
//                             break;
//                         case 'M':
//                             if (j == 0 || j == 4 || (i == 1 && (j == 1 || j == 3)) || (i == 2 && j == 2)) star = true;
//                             break;
//                         case 'N':
//                             if (j == 0 || j == 4 || i == j) star = true;
//                             break;
//                         case 'O':
//                             if (i == 0 || i == 4 || j == 0 || j == 4) star = true;
//                             break;
//                         case 'P':
//                             if (j == 0 || ((i == 0 || i == 2) && j < 4) || (i == 1 && j == 4)) star = true;
//                             break;
//                         case 'Q':
//                             if (i == 0 || i == 4 || j == 0 || j == 4 || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 3)) star = true;
//                             break;
//                         case 'R':
//                             if (j == 0 || ((i == 0 || i == 2) && j < 4) || (i == 1 && j == 4) || (i == 3 && j == 3) || (i == 4 && j == 4)) star = true;
//                             break;
//                         case 'S':
//                             if ((i == 0 || i == 2 || i == 4) && j > 0 || (i == 1 && j == 0) || (i == 3 && j == 4)) star = true;
//                             break;
//                         case 'T':
//                             if (i == 0 || j == 2) star = true;
//                             break;
//                         case 'U':
//                             if (j == 0 || j == 4 || i == 4) star = true;
//                             break;
//                         case 'V':
//                             if ((i < 3 && (j == 0 || j == 4)) || (i == 3 && (j == 1 || j == 3)) || (i == 4 && j == 2)) star = true;
//                             break;
//                         case 'W':
//                             if (j == 0 || j == 4 || (i == 2 && j == 2) || (i == 3 && (j == 1 || j == 3))) star = true;
//                             break;
//                         case 'X':
//                             if (i == j || i + j == 4) star = true;
//                             break;
//                         case 'Y':
//                             if ((i < 2 && (j == 0 || j == 4)) || (i == 1 && (j == 1 || j == 3)) || (i >= 2 && j == 2)) star = true;
//                             break;
//                         case 'Z':
//                             if (i == 0 || i == 4 || i + j == 4) star = true;
//                             break;
//                     }
//                     System.out.print(star ? "*" : " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }


 }
 }