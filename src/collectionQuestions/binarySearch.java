package collectionQuestions;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int index = searchBinary();
        if (index==-1){
            System.out.println("element is not present in given array" );
        }else
        System.out.println(index);
    }

    static int searchBinary() {
        int index =0;
        int[] a = new int[]{2, 6, 3, 7, 4, 9,10};
        int b[] = Arrays.stream(a).sorted().toArray();

        System.out.println(b[1]);
        int givenNum = 9;
        int low = 0;
        int high = b.length-1;
        int mid = (low +high)/2;
        while (low <= high) {

           /* if (b[mid] == givenNum) {
                return index = mid;
            } else if (b[mid] < givenNum) {

                if (b[low] == givenNum) {
                    return index = low;
                } else if (b[high] == givenNum) {
                    return index = high;
                }
                high = mid + 1;

            } else if (b[mid] > givenNum) {
                if (b[low] == givenNum) {
                    return index = low;
                } else if (b[high] == givenNum) {
                    return index = high;
                }

                low = mid - 1;
            }*/
            if(b[mid]<givenNum) {
                low = mid + 1;
            }
            else if(b[mid]==givenNum){
                index=mid;
                break;
                
                } else  {
                high= mid+1;
                
            }
            mid=(low+high)/2;
            if (low> high ){
                System.out.println("Element is not found!");
            }


        }

        return index;
    }

}