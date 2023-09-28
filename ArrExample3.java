package Array_Problem;
import java.util.*;
public class ArrExample3 {
    public static int FindTrappedWater(int height[]){
        int n=height.length;;
        //maxleft array
        int maxleft[] = new int[n];
        maxleft[0] = height[0];
        for(int i=1;i<n;i++){
            maxleft[i] = Math.max(height[i],maxleft[i-1]);
        }
        //maxright array
        int maxright[] = new int[n];
        maxright[n -1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            maxright[i] = Math.max(height[i],maxright[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
        //water level=min(maxleft array, maxrigth array);
        int WaterLevel= Math.min(maxleft[i],maxright[i]);
        
        //trapped water=waterlevel - heigth[i]
        trappedWater += WaterLevel - height[i];

        }
        return trappedWater;
        
        
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2,5};
        System.out.println(FindTrappedWater(height));
        
    }
    
}
