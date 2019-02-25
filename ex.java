package ex2;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    int k[] = new int [10];
    int t[] = new int [5];
    int n ;        
              
            do{
            System.out.println("Put N : ");
            n = input.nextInt();   
            }while( n < 5);
            for (int i=0;i<n;i++){
            System.out.println("Table ["+i+"]");
            k[i] = input1.nextInt();
            }
            int lengthtable;int j;int egalite;
            lengthtable = (n/2);
            
            for(int i=0;i<(n/2);i++){
            j=i; 
            egalite = k[j]+k[lengthtable];
            t[i]= egalite;
            lengthtable++;
            
            }
            
            
            
            for (int i =0;i < (n/2);i++){
            System.out.println("**********Result**********");
            System.out.println(t[i]);
            }
        
    }
    
}
