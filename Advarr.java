import java.util.*;
 class Find{
  public int[] twoSum(int arr[], int target){
   for(int i=0; i<arr.length; i++){
    for(int j= i+1; j<arr.length;j++){
     if(arr[i]+arr[j]==target){
     return new int[]{i,j};
    } 
    }
    }
  return new int[]{};
  }
 }

public class Advarr{
public static void main(String []args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter array size:"); 
int size = sc.nextInt();
System.out.println("Enter array :"); 

int arr[] = new int[size];
for(int i=0; i<size; i++)
arr[i]=sc.nextInt();

System.out.println("Enter the target numbers:"); 

int target = sc.nextInt();
Find f= new Find();
int result[] = f.twoSum(arr, target);

if(result.length>0){
System.out.println("Array index:"+ result[0]+ " " + result[1]);
}else{
System.out.println("no array");
}
}
}