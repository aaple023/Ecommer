import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class WorkDemo {
    public static void main(String[] args){
        String name="ram ji adarsh purush hai";
        String rev=" ";
        char ch;
        for (int i=0; i<name.length();i++){
            ch=name.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
        WorkDemo demo=new WorkDemo();
        demo.reverse();
        demo.large();
        demo.second();
        demo.prime();
        demo.factorial();
        demo.fact();
        demo.main();
        demo.hum();
        //demo.duplicateNumber();
        demo.duplicateNumber();
        demo.duplicateNumbers();
        demo.aramStrong();
        demo.secondDe();

    }
    public void reverse(){
        String name="ram ji adarsh purush hai";
        StringBuffer sb=new StringBuffer(name);
        System.out.println( sb.reverse());

    }
    public  void large(){
        int[] num={12,89,65,23};
        int max=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
                System.out.println(max);
            }
        }
    }
    public void second(){
        int []  a={90,67,34,12,6};
        int size=a.length;
        int max=a[size-1];
        int min=a[0];
        for (int i=0;i<size;i++){
            if (a[i]>max){
                a[i]=max;
                min=max;


            }


        }
        System.out.println(min);

    }
    public  void prime(){
       int numPrime=9;
       if (numPrime/2==0){
           System.out.println("number is not prime"+numPrime);

       }else {
           System.out.println("number is prime"+numPrime);
       }
    }
    public  void  factorial(){
        int number=0;
        int number2=0;
        int number3=1;
        int num=9;
        for (int i=0;i<num;i++){
            number=number2;
            number2=number3;
            number3=number+number2;

        }
        System.out.println(number3);
    }
    public void fact(){
        int num=5;
        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;

        }
        System.out.println("fact number"+fact);
    }

        public void main() {
            int num = 5;
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }
        public void hum(){

                int[] nums = {1, 2, 3, 1, 2, 4, 5};
                Set<Integer> set = new LinkedHashSet<>();
                for (int num : nums) {
                    set.add(num);
                }
                Integer[] result = set.toArray(new Integer[set.size()]);
                System.out.println(Arrays.toString(result));

        }
        //Write a program to remove duplicate elements from an array in Java.
    public void duplicateNumber(){
        int[] number={1, 2, 3, 1, 2, 4, 5};
        for (int i=0;i<number.length-1;i++){
          for (int j=i+1;j<number.length-1;j++){
              if (number[i]==number[j]){
                  System.out.println(number[j]);
              }
          }
        }
    }
    public void duplicateNumbers(){
        int[] number={1, 2, 3, 1, 2, 4, 5};
     Arrays.stream(number).distinct().forEach(s-> System.out.println(s));
        
    }
    public void  aramStrong(){
        String str="silent";
        String str1="listen";
        char[] arr1 = str.toCharArray();
        char[] arr2 = str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Number is aramStrong."+str+"    "+str1);
        }
        else {
            System.out.println("Number is  not aramStrong."+str+str1);

        }
    }
    public void secondDe(){
        int[] f={45,90,54,23};
        int length=f.length;
        int max=f[length-1];
        int min=f[0];
        for (int i=0;i<length;i++){
            if (f[i]>max){
                f[i]=max;
                min=max;

            }
        }
        System.out.println(min);
    }


}
