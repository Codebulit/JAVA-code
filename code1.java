//1. Write a program to print unit digit of a given number

// import java.util.Scanner;

// public class code1{
//     public static void main(String [] args){
//         System.out.println("Enter a number:\n");
//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int d =a % 10;//module operator concept
//         System.out.println("The unit digit of"+a+"is:"+d);

//     }
// }

//=======================================================================

//2. Write a program to print a given number without its last digit.

// import java.util.Scanner;
// public class code1{
//     public static void main(String [] args){
//         System.out.println("Enter a number:");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int last_digit=a / 10;
//         System.out.println("The number"+ a + "without last digit is:"+last_digit);



//     }
// }

//========================================================================

//3. Write a program to swap values of two int variables

// import java.util.Scanner;
// public class code1{
//     public static void main(String []args){
//        System.out.println("Enter two number to swap:\n");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int temp;
//        System.out.println("Before swaping a="+ a + "b="+b);
//         temp=a;
//         a=b;
//         b=temp;
//         System.out.println("After swaping a="+ a + "b="+b);
//     } 
// }
//=========================================================================

//4. Write a program to swap values of two int variables without using a third variable.

// import java.util.Scanner;
// public class code1{
//   public static void main(String [] args){
//     System.out.println("Enter two number:");
//     Scanner sc =new Scanner(System.in);
//     int a =sc.nextInt();
//     int b=sc.nextInt();
//     System.out.println("Before  swaping a="+ a + "b= "+ b);
//     a=a+b;
//     b=a-b;
//     a=a-b;
//     System.out.println("After swaping a="+ a + "b="+ b);

//   }
// }

//=================================================================
//5. Write a program to input a three-digit number and display the sum of the digits.
   
// import java.util.Scanner;
//    public class code1{
//     public static void main(String [] args){
//         System.out.println("Enter a three digit number: \n");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int sum=0 ;
//         while(a!=0){
//             int d= a %10;
//            sum+=d;
//             a/=10;
//         }
//         System.out.println("The sum of digit is:"+sum);
//     }
//    }




