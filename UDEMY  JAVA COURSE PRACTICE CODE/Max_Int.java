import java.util.*;
public class Max_Int {
 public static void main(String[] args) {
     int n=5,m;
     Scanner sc = new Scanner(System.in);
     int a[] = new int[n];
     System.out.println("Enter the elements in the array: ");
     for (int i = 0; i < n; i++) {
      a[i]= sc.nextInt();         
     } 
     m = a[0];
     for (int i = 0; i < n; i++) {
        if (m<a[i]) {
            m = a[i];
     }
 
 }
 System.out.println("Maximum value in the array is " + m );
}

}
