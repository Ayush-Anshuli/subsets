import java.util.*;
public class subsets {
    public static void subsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("nul");
                return;
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        subsets(str, ans+str.charAt(i), i+1);
        subsets(str, ans, i+1);
    }
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("subset of the string is ");
        subsets(str, "", 0);
        
    }
}
