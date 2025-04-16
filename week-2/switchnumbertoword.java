import java.util.Scanner;
public class switchnumbertoword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        name(num);
        sc.close();
    }
        public static void name(int num)
        {
        String [] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String [] arr2={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] arr3={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if(num<10){
            System.out.println(arr[num]);
        }
        else if(num<20){
            System.out.println(arr2[num-10]);
        }
        else if(num<100){
            System.out.println(arr3[num/10-2]+" "+arr[num%10]);
        }
        else{
            System.out.println("Number out of range");
        }
    }
     
}