
import java.util.Arrays;


public class javaProgram {
    public static void main(String[] args){
        int array[]={2,7,9,23};
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum=array[i]+sum;
        }
        System.out.println(sum);
        zero();
        seconder();
        insetArray();
        firstArray();
    }
    public static  void zero(){
        int ar[]={1,0,6,8,0,0};
        int counter=0;
        for (int i=0;i<ar.length;i++){
            if(ar[i]!=0) {
                ar[counter]=ar[i];
                counter++;
            }

        }
        while (counter<ar.length){
            ar[counter]=0;
            counter++;
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void seconder(){
        int[] s={34,90,567,23,1};
        int size=s.length;
        int max=s[size-1];
        int min=s[0];
        int second=0;
        for (int i=0;i<s.length-1;i++){
           /* if (s[i]>max){
                second=max;
                max=s[i];
            }*/
            if (s[max]<s[i]){
                min=max;



            }




        }
        System.out.println(min);

 int mins=Arrays.stream(s).min().getAsInt();
        System.out.println(mins);
      int maxc=  Arrays.stream(s).max().getAsInt();
        System.out.println(maxc);

        //System.out.println(second);

    }
    public static  void insetArray(){
        int[] arr={6,9,2,7,3};
        int size=arr.length;
        int[] arr1=new int[size+1];
        for (int i=0;i<size;i++){
            arr1[i]=arr[i];
        }
        arr1[size]=8;
        System.out.println(Arrays.toString(arr1));
    }
    public static void firstArray(){
        int[] s={3,9,2,8};

        int sixe=s.length;
        int[] n=new int[sixe+1];
        for (int i=sixe-1;i>=0;i--){
            n[i]=s[i];
        }
        n[0]=5;
        System.out.println(Arrays.toString(n));
    }
}
