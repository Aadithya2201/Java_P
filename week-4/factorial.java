public class factorial {
    public static void main(String[] args){
        int a=7;
        System.out.println(fact(a));
    }
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        return a*fact(a-1);

    }
}
