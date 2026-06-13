package Arrays;

public class Example1 {
    public static void main(String[] args) {
//        Syntax1
        int arr[]=new int[5];
//        Syntax2
        int []arr1=new int[5];
//        Syntax3
        int arr3[];
        arr3 = new int[5];

        int array[]={1,5,9,2,6};
        int i = 0;
        int max = 0;
        int secondMax = 0;
        while(i<array.length){
            if(array[i]>max){
//                secondMax = max;
                max = array[i];
            }
            if(array[i]<max && array[i]>secondMax){
                secondMax = array[i];
            }
            i++;
        }
        System.out.println(secondMax);

    }
}
