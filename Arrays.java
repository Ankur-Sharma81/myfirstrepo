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
import java.util.Scanner;
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


