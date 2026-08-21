package recursion;
import java.util.ArrayList;
import java.util.*;
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new ArrayList<>());
        return ans;
        
    }
    void solve(int []nums, int index, List<Integer>curr){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(nums, index+1,curr);
        curr.remove(curr.size()-1);
        solve(nums, index+1, curr);
    }
}

public class subsets78 {
    
}
