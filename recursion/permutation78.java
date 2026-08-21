
package recursion;
import java.util.*;
class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(nums, new ArrayList<>());
        return ans;
        
    }
    void solve(int nums[], List<Integer>curr){
        
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
            
        }
        for(int i=0; i<nums.length; i++){
            if(curr.contains(nums[i])){
                continue;
            }
            curr.add(nums[i]);
            solve(nums,curr);
            curr.remove(curr.size()-1);
        }

    }
}