    
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
    System.out.println("Factorial :  ");
    int ans =fact(n);
    System.out.println(ans);   
    //5) Sum of n numbers :
    //5.1) parametrised :
    int sum=0;
    int i=1;
    System.out.println("Parametrised :  ");
    sum_para(n, sum,i);
    //5.2) functional :
    int ans2 = sum_fun(n);
    System.out.println(" funcational :" + ans2);
    
    
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
    public static void sum_para(int n , int sum, int i ){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum_para(n,sum+i,i+1);
        


    }
    public static int sum_fun(int n){
        if(n==0){
            return 0;
        }
        return n + sum_fun(n-1);
    }

        
    }