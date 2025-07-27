                   //  1. PRINT 1 TO N.
/*import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
    while(i <= n) {
        System.out.println(i);
        i++;
    }
    }
}*/
                    // 2. SUM OF FIRST N NATURAL NUMBER
/*import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 5;
        int sum = 0;
        int i = 1;
while(i <= n) {
    sum = sum + i;
    i ++;
    System.out.println(sum);
    }
    }

}
*/
                       //3. FOR LOOP
/*import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int i;
for(i = 0; i<=1000; i++) {
    System.out.println("Hello World");
}    
    }

}
*/
                   //4. SQUARE NUMBER
/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        int line;
    for(line =1 ; line <=4 ; line++){
        System.out.println("****");
    }

    }
}*/ 
                  //5. SQUARE NUMBER.
/*import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        int counter = 1;
    while(counter <= 4){
        System.out.println("****");
        counter++;
    }
    }
}*/
                  //6. SQUARE NUMBER
/*import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        int i;
    for(i =1; i<=4; i++) {
        System.out.println("****");
    }
    }
}
*/

                // 8. REVERSE OF A NUMBER.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n = 10899;
    while(n > 0) {
        int lastdigit = n % 10;
    System.out.print(lastdigit);
    n = n/10;
    }
    }
}
*/
        
                    //9. Reverse of a given  number
/*import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int n = 108867;
        int rev = 0;
        int LastDigit;
    while(n > 0) {
        LastDigit = n % 10;
        rev = (rev * 10) + LastDigit;
        n = n / 10;
        System.out.print(rev);
    }
    }
}
*/
                  // 10. Using do while loop to print Helloworld.
/*                  
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int counter = 1;
    do {
        System.out.println("Helloworld");
        counter++;
    }
    while(counter <= 10);

    }
}
*/
                     //11. code using Break Statement using while loop.
/*                      
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i = 1;
    while(i <= 5) {
        if(i == 3) {
            break;
        }
        System.out.println(i);
        i++;
    }
    System.out.println("i am out of the loop");
    }
}
*/
                           // 12. break statement using for loop.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    for(int i=1; i<=5; i++){
        if(i == 3){
            break;
        }
        System.out.println(i);
    }
    System.out.println("i am out of loop");

    }
}
*/
               //13. Keep entering number till user enter a multiple of 10. 
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    do {
        System.out.print("enter your number");
        int n = sc.nextInt();
        if(n % 10 == 0) {
            break;
        }
        System.out.println(n);
    }
    while(true);
    }

}
*/
                   //14. Continue Statement.
/* 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        for(int i =1; i<=5; i++){
        if(i == 3){
            continue;
        }
        System.out.println(i);
    }
    }
}
*/
              //15. display all number enter by user except  multiple of 10. 
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("enter your number");
    for(int i =1; i<=20; i++){
         if(i % 10 == 0){
            continue;
        }
        System.out.println("number was :" +i);

    }
    }
    
}
*/
                              //16. Continue statement using do while loop.
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    do {
        System.out.println("enter your number");
        int n = sc.nextInt();
        if(n % 10 == 0) {
            continue;
        }
        System.out.println("number was: " +n);
    }
    while(true);
    }

} */
                        // 18. Print Star Pattern.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    for(int i =1;i<=10; i++){
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println  ();
    }
    }
} 
*/
                      //19. print pattern in inverted(max to min) form.
/* 
import java.util.scanner;
public class Main{
    public static void main(String[] args){
        int n = 4;
    for(int line = 1; line<= n; line++){
        for(int star = 1; star <= n-line+1; star++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
*/
                         //20. how to print half Pyramid Method.                          
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n = 4;
    for(int line = 1; line<=n; line++){
        for(int number=1; number<=line; number++){
            System.out.print(number);
        }
        System.out.println();
    }
    }
}*/
                       //21. Print character of Pattern.
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n = 11;
        char ch = 'A';
    for(int line=1; line<= n; line++){
        for(int chars=1; chars<=line; chars++){
            System.out.print(ch);
            ch++;

        }
        System.out.println();
    }
    }

}*/
                      //22. print Pattern using small Alphabets.
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n = 7;
        char ch = 'a';
    for(int line=1; line<=n; line++){
        for(int chars=1; chars<=line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}
*/

                         //23. Functions/Methods.
/*import java.util.Scanner;
public class Main{
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
    public static void main(String args[]){
         printHelloWorld();

    }
}
*/
 
                           //24. Swap of number.
/* 
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int a = 25;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
    System.out.println(a);
    System.out.println(b);
    }
    
}
*/
                            //25. Factorial of n!.
/*import java.util.Scanner;
public class Main{
    public static int factorial(int n){
    int f = 1;
    for(int i=1;i<=n;i++){
        f = f*i;
    }
    return f;
    }

public static void main(String args[]){
    System.out.print(factorial(10));
}
}*/

                    //26. binomial coefficient of n.
/*import java.util.Scanner;
public class Main{

    public static int bincoeff(int n, int r){
        int factorial;
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
public static void main(String args[]){
    System.out.print(bincoeff(5,2));

}
}*/
                    //27. Function overloading with parameter.
/*import java.util.Scanner;
public class Main{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,  int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(sum(2 , 3));
         System.out.println(sum(2 , 3 , 5));

    }
}*/
                        //28. Check if a number is prime or not.
/*import java.util.Scanner;
public class Main{
    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i = 2;i<=n-1; i++){
            if(n % i == 0){
                 isprime = false; 
                break;

            }
        }
        return isprime;

    }
    public static void main(String args[]){
        System.out.println(isprime(5));

    }
}*/                    //29. 2nd method : Check if a number is prime or not.
/*import java.util.Scanner;
public class Main{
    public static boolean isprime(int n){
        //if(n == 2){
            //return true;
        //}
        for(int i = 2;i<=n-1; i++){
            if(n % i == 0){
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isprime(81));

    }
}
*/
                        //30. check if a number is prime or not.




                   // print all primes in a Range.n = 20 or anything.
/*import java.util.Scanner;
public class Main{
    public static void  primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();

    }
public static void isprime(int n){
    for(int i=0;i<Sqrt.math(n);i++){
        if(i%n==0)
        return false;

    }
    return true;
}
public static void main(String args[]){
    primeInRange(20);
}

    
}
*/
                // 31. Code of Decimal to Binary Conversion.
/*import java.util.Scanner;
public class Main{
 public static void dectoBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n >0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of"  + myNum + " = " + binNum);
    }
    public static void main(String[] args){
        dectoBin(15);
    }
}*/
/*import java.util.Scanner;
class Main{
    public static void hollow_rectangle(int n, int m){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=m; j++){
                if(i == 1 || i == n ||j == 1 || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollow_rectangle(5,4);
    }
}*/
import java.util.Scanner;
public class Main{
    public static void Update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        int marks[] = {97, 98, 99};
        Update(marks);
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}