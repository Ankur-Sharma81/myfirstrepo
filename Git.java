/*public class Git {
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
/*import java.util.Scanner;
public class Git{
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
}*/
public class Git{
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
}