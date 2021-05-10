import java.util.*;

public class InputOnUserChoice {
    
    Scanner sc = new Scanner(System.in);
    
    int arr[] = new int[10];
    int i = 0;
    do {
        System.out.print("Enter any number: ");
        arr[i] = sc.nextInt();
        i++;
        System.out.println("Do you want to continue: ");
        char ch = sc.next().charAt(0);
    }while(chy || ch=='Y');
    
    for(int  i:arr)
    {
        System.out.print(i+ " ");
    }
    
}
