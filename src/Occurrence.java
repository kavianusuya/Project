import java.util.Scanner;

public class Occurrence
{
    public static void occurrence(String str)
    {
        char somechar='e';
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==somechar){
                count++;
            }
        }if(count>0){
        System.out.println("******");
        System.out.println(somechar+ "times"+count);
        System.out.println("******");
    }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String str=scan.nextLine();
        Occurrence num = new Occurrence();
        num.occurrence("dddeeeeffff");
        char[] s1=str.toCharArray();
        String str1=str.toLowerCase();
        int count=0;
        for(char i='a';i<='z';i++)
        {
            for(char c:s1)
            {
                if(c==i)
                {
                    count=count+1;
                }
            }
            if(count!=0)
            {
                System.out.println(i +" times "+count);
                count=0;
            }
        }

    }
}
