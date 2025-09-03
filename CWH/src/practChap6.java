
import java.util.Scanner;

public class practChap6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1Creste an array of 5 flals And calculate
        // their Sum
        // float[] num = {1.0f,2.0f,4.0f,5};
        // float count=0;
        // for(float i:num){
        //     count+=i;
        // }
        // System.out.println(count);
        //================================================================
        //Q2 Write a program to find out whither a
        // given integet us presnt in on array or ot
        // System.out.print("Enter the number to search: ");
        // int num=sc.nextInt();
        // int count=0;
        // System.out.print("enter length of array: ");
        // int l=sc.nextInt();
        // int[] arr= new int[l];
        // System.out.println("Enter array data:");
        // for (int i=0; i<l;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.print("Entered array is: ");
        // for (int i:arr) {
        //     System.out.print(i+",");
        //     if(num==i){
        //         count+=1;
        //     }
        // }
        // System.out.println();
        // if(count>0){
        //     System.out.printf("Entered number %d appeared %d times",num,count);
        // }
        // else{
        //     System.out.printf("Entered number %d is not present is not present",num);
        // }
        //=============================================================================
        // Q3Cakculote the arcrage marks ftom an array
        // Containing marks of all students in Physics
        // using for- each laop
        // int len=arr.length;
        // float sum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        // System.out.println("average of physycs marks:"+sum/len);

        //Q4Ceate a Java program to add two mabrices
        // of Sige 2x'3 
        // int [][] arr1={{1,3,4},{2,3,5}};
        // int [][] arr2={{6,3,4},{3,4,6}};
        // int[][] arrsum = new int[2][3];
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         arrsum[i][j]= arr1[i][j]+arr2[i][j];
        //     }
        // }
        // System.out.println(arrsum.length);
        // System.out.println(arrsum[0].length);
        // for(int i=0;i<arrsum.length;i++){
        //     for(int j=0; j<arrsum[0].length;j++){
        //         System.out.print(arrsum[i][j]+", ");
        //     }
        //     System.out.println();
        // }
        //========================================================================

        //Q5 Java program to reverse an array
        // int[] arr = {1,2,3,5};
        // int[] rev = new int[arr.length];
        // System.out.println(arr.length);
        // for(int i:rev){
        //     System.out.print(i+", ");
        // }
        // System.out.println();
        // for (int i = (arr.length-1); i >=0; i--) {
        //     rev[(arr.length-1)-i]= arr[i];
        //     System.out.println("*");
           
        // }
        // for(int i:rev){
        //     System.out.println(i);
        // }
        //===================================================================
        
        // Q6 Write a Jara program to find the maximun element in an akray
        int[] arr = {1,2,6,7};
        // int max=0;
        // for(int i:arr){
        //     if(max<i){
        //         max=i;
        //     }
        // }
        // System.out.println(max);

        // //min number in array 
        // int min=arr[0];

        // for(int i:arr){
        //     if(min>i){
        //         min=i;
        //     }
        // }
        // System.out.println(min);
        
        // Q8 sorted or not 
        boolean sorted = true;
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
        
    }
}
