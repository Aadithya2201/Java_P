
public class valid_parenthese {
    public static void main(String[] args) {
        String input = "({[]})";
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<input.length();i++){
            char e= input.charAt(i);
            if(e=='(' || e=='{'|| e=='['){
                if(e=='('){
                    if(count<0){
                        break;
                    }
                    else{
                    count++;
                    }
                }
                if(e=='{'){
                    if(count1<0){
                        break;
                    }
                    else{
                    count1++;
                    }
                }
                if(e=='['){
                    if(count2<0){
                        break;
                    }
                    else{
                    count2++;
                    }
                }
            }
            else if(e==')' || e=='}' || e==']'){
                    if(e==')'){
                        count--;
                    }
                    if(e=='}'){
                        count1--;
                    }
                    if(e==']'){
                        count2--;
                    }
            }
            else{
                break;
            }
        }
        if(count==0 && count1==0 && count2==0){
            System.out.println("valid Parentheses");
        }
        else{
            System.out.println("invalid Parentheses");
        }
    }
    }