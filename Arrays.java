              // This code demonstrates how to update the elements of an array by incrementing each element by 1.
/*import java.util.Scanner;
public class Arrays{
    public static void Update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        int marks[] = {97, 98, 99};
        Update (marks);
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i] + " " );
        }
        System.out.println();
    }
}
*/
                               // This code performs linear search on an array of integers to find a specific key.
/*import java.util.Scanner;
public class Main{
    public static int linearsearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10,12,14,26};
        int key = 14;
        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.print("Not found");
        }
        else{
            System.out.print("found at index: " + index);
        }
    }
}
*/
                               // This code finds the largest number in an array and also finds the smallest number.  
/*import java.util.Scanner;
public class Arrays{
    public static int GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is: " + smallest); 
        return largest;  
    }
    public static void main(String[] args){
        int numbers[] = {25,20,35,28,36,16,30,40,50};
        System.out.println("largest value is: " + GetLargest(numbers));    
    }
}*/
                     // This code reverses an array of integers.
/*import java.util.Scanner;
public class Arrays{
    public static void reverse(int number[]){
        int first = 0;
        int last = number.length-1;
        while(first<last){
            int temp =  number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int number[] = {2,4,6,7,9,8};
        reverse (number);
        for(int i=0 ; i<number.length; i++){
            System.out.print(number[i] + " ");

        }

    }

}*/
                             // This code prints all pairs of elements in an array.
/*import java.util.Scanner;
public class Arrays {
    public static void pairs(int number[]){
        for(int i = 0; i<number.length; i++){
            int ankur = number[i];
            for (int j=i+1; j< number.length; j++){
                System.out.print("(" + ankur + ", " + number[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,9};
        pairs(number);
    }
}*/
/*import java.util.Scanner;
public class Arrays{
    public static void subarrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j =i; j<numbers.length; j++){
                int End = j;
                for(int k = start; k <= End; k++){
                    System.out.print(numbers[k] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }
}
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,9};
        subarrays(numbers); 
    }
}

*/
                                // This code finds the maximum subarray sum using a brute force approach.
/*import java.util.Scanner;
public class Arrays{
    public static void Maxsubarray(int numbers[]){
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j =i; j<numbers.length; j++){
                int End = j;
                for(int k = start; k <= End; k++){
                    CurrSum += numbers[k];

            }
            System.out.println(CurrSum);
            if(MaxSum < CurrSum){
                MaxSum = CurrSum;
            }
        }
    }
    System.out.println("MaxSum =" +MaxSum);
}
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,9};
        Maxsubarray(numbers); 
    }
}*/
            /* This code implements the Bubble Sort algorithm to sort an array of integers in ascending order.
import java.util.Scanner;
public class Arrays{
    public static void Bubble(int arr[]){
        for(int turn = 0; turn<arr.length; turn++){
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        Bubble(arr);
        printArr(arr);

    }
}
*/

             //This code implements the Bubble Sort algorithm to sort an array of integers in decending order.
/*import java.util.Scanner;
public class Arrays{
    public static void Bubble(int arr[]){
        for(int turn = 0; turn<arr.length; turn++){
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        Bubble(arr);
    }
}*/   

              
import java.util.scanner;
public class Arrays{
    public static void selectionsort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minpos = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }

            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        selectionsort(arr);

    }
}          

