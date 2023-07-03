import java.util.Scanner;
public class Lecture18 {
    public static void main(String[] args)
	 {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int k=sc.nextInt();

        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            System.out.println("Enter element number "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array : ");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}