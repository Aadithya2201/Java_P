public class zeroexception {
    public static void main(String[] args) {
        int a=25;
        int b=0;
        int c=0;
        try{
            c=a/b;
        }
        catch(ArithmeticException exception){
            System.out.println("Arithmetic Exception Occured");
            exception.getStackTrace();
        }
        finally{
            System.out.println("finally block has been executed");
        }
    }
}
