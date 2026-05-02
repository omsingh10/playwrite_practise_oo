class hello{
    public static void main(String[] args){
       int n = 10;
       int c =0 ;
     
    for(int i = n; i>1 ; i--){
        if(i%2==0||i%5==0||i%6==0||i%9==0){
            if(i!=4 ||i!=7||i!=3){
                c+=1;
            }
            
            System.out.println("true" + i);
        }

        }



        System.out.println("the count is "+c);
    }

    static void num(int n){

    }
    
}