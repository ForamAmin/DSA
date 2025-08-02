    
    import java.util.*;
    public class Recursion{
        public static void main(String[] args) {
        //1) print n times name :
    System.out.println("ENter anything : ");
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    System.out.println("how many times you want to print ? :");
    int n=sc.nextInt();
    rec_name(a,n);
    //2) linearly from 1 to n :
    int s=1;
    System.out.println(" ");
    rec_oneton(n,s);
    //3) from n to 1:
    System.out.println(" ");
    rec_ntoone(n);
    //4) factorial 
    System.out.println(" ");
    int ans =fact(n);
    System.out.println(ans);   
        }

    public static void rec_name(String a , int n ){
    if(n==0){
        return;
    }
    else{
        System.out.println(a);
        rec_name(a, n-1);
    }
    }
    public static void rec_oneton(int n , int s){
        if(s>n){
            return;
        }
        else{
            System.out.println(s);
            rec_oneton(n,s+1);
        }
    }

    public static void rec_ntoone(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            rec_ntoone(n-1);
        }
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
          return n*fact(n-1);
        }
    }

        
    }