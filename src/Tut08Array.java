import java.util.Arrays;
import java.util.Objects;

public class Tut08Array {
    public static void main(String[] args) {


        //Array
        // declaration Approach 1
        // when size of array is fixed

        int a[] = new int [5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        System.out.println(Arrays.toString(a));

        // declaration Approach 2
        // when size of array is variable

        int b[] = {100,200,300,400,500};
        System.out.println(Arrays.toString(b));


        // finding length of array
        System.out.println(a.length);
        System.out.println(b.length);

        // read single value from array
        System.out.println(a[3]);
        System.out.println(b[4]);


        // read all values from array
        System.out.println("read all values from array");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }


        // enhance for loop
        // read all values from array
        System.out.println("read all values from array using enhanced for loop");

        for (int value:b){
            System.out.println(value);
        }


        // Two-dimensional array
        // declaration approach 1
        // if size of array is fixed

        int arr1[][]= new int[4][3];
        arr1[0][0]=56;
        arr1[1][0]=54;
        arr1[2][0]=63;
        arr1[3][0]=87;

        arr1[0][1]=22;
        arr1[1][1]=36;
        arr1[2][1]=87;
        arr1[3][1]=21;

        arr1[0][2]=45;
        arr1[1][2]=25;
        arr1[2][2]=78;
        arr1[3][2]=32;


        //length of rows
        System.out.println("Number of rows: "+arr1.length);
        //length of columns
        System.out.println("Number of columns: "+ arr1[0].length);

        //read single value from the array
        System.out.println(arr1[3][2]);

        // read all values from array
        // normal for loop
        System.out.println("read all values from array using normal for loop");
        for(int i = 0; i<arr1.length; i++){
            for (int k = 0; k<arr1[i].length;k++){
                System.out.println(arr1[i][k]);
            }
        }


        // read all values from array
        // enhanced for loop
        System.out.println("read all values from array using enhanced for loop");

        for (int row[]:arr1){
            for (int col:row){
                System.out.println(col);
            }
        }


        // storing heterogeneous data types in array
        Object k [] = {5,10.5,'D',"Ashish",true};
        for (Object x : k){
            System.out.println(x);
        }

        //normal for loop
        for (int l = 0; l<k.length;l++){
            System.out.println(k[l]);
        }

        // search in array element present or not
        // no duplicate detection
        // Linear search

        int q[] = {5,66,7,9,44,55,78,63,49,25,11,24,26,36,};
        int findNum= 11;
        boolean status=false;

        for (int count = 0; count<q.length; count++){
            if (q[count]==findNum){
                System.out.println("Element found in the array at index: "+count);
                status=true;
                break;
            }
        }
        if (status==false){
            System.out.println("Element not found in the array");
        }

        //find repetition of the number in array
        int f[]={45,56,78,56,45,78,56,23,12,45,56,78,89,45,23,56,45,12,23,65,87,56};
        int repNum= 56;
        int repCount = 0;
        for (int m = 0; m<f.length; m++){
            if(f[m]==repNum){
                repCount=repCount+1;
//                repCount++;
            }
        }
        System.out.println("Given number "+repNum+" related "+repCount+" time.");


        // sorting of array
        System.out.println("before sorting..");
        System.out.println(Arrays.toString(f));

        Arrays.sort(f);
        System.out.println("after sorting..");
        System.out.println(Arrays.toString(f));


        // sorting array of strings








        // Print array in reverse order
        System.out.println("Print array in reverse order");
        int h[] = {5,66,7,9,44,55,78,63,49,25,11,24,26,36,};
        for (int m=h.length-1; m>=0; m--){
            System.out.println(h[m]);
        }

    }
}
