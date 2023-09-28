package Array_Problem;

public class ArrExample1 {
    public static void FindPairs(int number[]){
        int pairs = 0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" + curr + "," + number[j] + ")");
                pairs++;
            }
            System.out.println(" ");
        }
        System.out.println("Total pairs:" +pairs);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        FindPairs(number);
    }
    
}
