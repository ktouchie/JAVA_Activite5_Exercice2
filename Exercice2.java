import java.util.*;
class Exercice2 {
    
    public static void main(String [] args) {  

        int a[] = {2,5,3,1,4};
        int max = 0;
        int min = 6;
        
        for (int i=0; i< a.length; i++) {
            if (a[i]>max) {
                max = a[i];
            }
            if (a[i]<min) {
                min = a[i];
            }
        }
        
        System.out.println("The maximum element of the array {2,5,3,1,4} is " + max);
        System.out.println("The minimum element of the array {2,5,3,1,4} is " + min);
    }
}