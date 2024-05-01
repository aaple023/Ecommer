package pac;

import java.util.Arrays;

public class DemoQuestion {
    public static void main(String[] args){
        String name="neha";
        StringBuffer stringBuffer=new StringBuffer(name);
     StringBuffer  names= stringBuffer.reverse();
        System.out.println(names);
        rev();
        swap();
        fabio();
        sumGivenDigit();
        prime();
        numberSting();
        duplicateString();
        swap4();
        reverseArray();
        capitalNumber();
        consequention();
    }
    public static  void rev(){
        String name="neha";
        String str="";
        char ch;
        for (int i=0;i<name.length();i++){
            ch=name.charAt(i);
            str=ch+str;

        }
        System.out.println(str);

    }
    public static void swap(){
        String s="name";
        String s1="kumari";
        String temp="";
        System.out.println("s  value="+s+" s1 value="+s1);
       temp=s;
       s=s1;
       s1=temp;
        System.out.println("s  value="+s+" s1 value="+s1);
    }
    public static void fabio(){
        int a=0;
        int b=0;
        int c=1;
        int n=9;
        for (int i=0;i<9;i++){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
    }
    public static void sumGivenDigit(){
        int num= 548;
        int rem=0;
        int sum=0;
      while (num!=0){
          rem=num%10;
          sum=sum+rem;
          num=num/10;


      }
        System.out.println(sum);
    }
    public static void prime(){
        int num=89;
        if (num%2==0){
            System.out.println("number is not prime");
        }else {
            System.out.println("number is prime");
        }
    }
    public static void numberSting(){
        String number="nehatyy";
        int count=0;
        for (int i=0;i<number.length();i++){
            count++;

        }
        System.out.println(count);
    }
    public  static void duplicateString(){
        String duplicate="nehaaa";
        int count=0;
        char[] inp=duplicate.toCharArray();
        for (int i=0;i<duplicate.length();i++){
            for (int j=i+1;j<duplicate.length();j++){
               if (inp[i]==inp[j]){
                   System.out.println(inp[j]);
                   count++;
                   break;
               }
            }
        }
    }
    public static void swap4(){
        int a=90;
        int b=49;
        int c=0;
        System.out.println("a ="+a+" b ="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("a ="+a+" b ="+b);

    }
    public static void reverseArray(){
        int[] a={ 2,5,89,1};
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        System.out.println("  ");
    }
    public static void capitalNumber(){
        String name="NehA";
        int countUpper=0;
        int lower=0;
        char[] ch=name.toCharArray();
         for (char chh :ch){
            if(chh>='A' && chh<='Z'){
           countUpper++;
            } else if (chh>='a'&& chh<='z') {
                lower++;

            }
            else {
                continue;
            }


         }
        System.out.println("count of upper class"+countUpper);

    }
    public static void consequention(){
        int[] a={10,15,1,2,3,4,5,6,90};
        int b=0;
        int c=0;
        for (int i=0;i<a.length-1;i++){
            if (a[i]-a[i+1]==-1){
                b=b+1;
                c=c+1;
                if (b>=c){
                    System.out.println(a[i]);
                }
                else {
                    b=0;
                }
            }
        }
    }

}
