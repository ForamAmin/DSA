 public static int gcd(int a , int b){
        int min;
        int gcd=1;
        int maxgcd=1;
        if(a>b){
            min=b;
        }
        else{
            min=a;
        }
        for(int i=1; i<=min ; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            if(maxgcd<gcd){
                maxgcd=gcd;
            }
        }
        return maxgcd;
    }