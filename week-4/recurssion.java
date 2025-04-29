public class recurssion {
    public static void main(String[] main){
        rec(Integer.MAX_VALUE);
    }
    public static void rec(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        rec(n-1);
    }
}