    import java.util.*;
    public class Basics{

        public static void main(String[] args) {
            //Count digits in a number ..
            //Handle the edge cases ..
            System.out.println("ENter the number to count : ");
            Scanner s= new Scanner(System.in);
            int n =s.nextInt();
            int c=0;
            if(n==0){
                c=1;
            }
            else{ 
            while(n!=0){
                n=n/10;
                c++; 
            }}
            System.out.println("the number of digits is : " + c);

            //reverse the number ..
            //dont use multiple scanners ..
            /* Maximum value  =  2^31 - 1  =  2147483647  
Minimum value  = -2^31      = -2147483648
 */
            System.out.println("ENter the number to reverse : ");
            int n2=s.nextInt();
            int rev=0;
            if(n2==0){
                rev=0;
            }
            else{
            while(n2!=0){
                int rem=n2%10;
                rev=rev*10+rem;
                n2=n2/10;
            } }
            System.out.println("The reverse of a number is : " + rev);

            System.out.println("ENter to find whether its a Armstrong number ? : ");
            int n3=s.nextInt();
            boolean ans= armstrong(n3);
            System.out.println(ans);

        }
        public static boolean armstrong(int n){
            int cube=0;
            int ncopy=n;
            while(n!=0){
                int rem=n%10;
                cube=(rem*rem*rem) + cube;
                n=n/10;
            }
            if(cube==ncopy)
                return true;
            
            else 
            return false;
        }

    }