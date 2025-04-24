public class stringDemo {
    public static void main(String[] args) {
        String name="Aadhi";
        String name2="Aadhi";
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        StringBuilder a=new StringBuilder("Aadhi");
        StringBuilder b= new StringBuilder(" Midhun");
        a.append(b);
        System.out.println(a);
    }
    
}
