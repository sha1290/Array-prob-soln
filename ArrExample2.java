package Array_Problem;

public class ArrExample2 {
    public static void FindSubarr(int number[]){
        int ts=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k] +" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray = " + ts);
    }
    //Find all possible subarray of given array
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        FindSubarr(number);
    }
    
}

// package Array_Problem;

// public class ArrExample2 {
//     public static void FindSubarr(int number[]){
//         int ts=0;
//         for(int i=0;i<number.length;i++){
//             int start=i;
//             for(int j=i;j<number.length;j++){
//                 int end=j;
//                 for(int k=start;k<end;k++){
//                     int s=(start+end);
//                     //System.out.print(number[k] +" ");
//                     System.out.print(s);
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarray = " + ts);
//     }
//     //Find all possible subarray of given array
//     public static void main(String[] args) {
//         int number[] = {2, 4, 6, 8, 10};
//         FindSubarr(number);
//     }
    
// }
