package recursion;
import java.util.*;
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>());
        return ans;
        
    }
    void solve(int []nums, int index, List<Integer>curr){
        ans.add(new ArrayList<>(curr));
        for(int i=index; i<nums.length; i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            solve(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}

public class subests90 {
    
}
