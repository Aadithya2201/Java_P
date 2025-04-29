public class bitwisereverse{

    public static void main(String[] args){
        // bitreverse();
        int input=11;
        int compliment=~input;
        int mask=0;
        while(mask<input){
            mask=mask<<1;
            mask=mask|1;
                    }     
                    compliment=compliment&mask;
                    System.out.println(compliment);   
    }
    private static void bitreverse(){
        int num = 10;
        int output=0;
        for(int i=0;i<4;i++){
            int last=num&1;
            if(output!=0){
                output=output<<1;
            }
            if (last==1){
                output=output|1;
            }
            num=num>>1;
        }
        System.out.println(output);
}
}