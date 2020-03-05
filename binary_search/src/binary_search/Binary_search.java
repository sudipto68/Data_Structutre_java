
package binary_search;

import java.util.Scanner;


public class Binary_search {

    
    public static void main(String[] args) {
        int arr[]={10,1,2,11,5,20,15};
        int n = arr.length;
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        sorting soort = new sorting();
        soort.sort(arr, x, n);
        
        
        
}
}
