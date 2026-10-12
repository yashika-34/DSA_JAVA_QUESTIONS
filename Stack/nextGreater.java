import java.util.*;

class Result{
  static void printNextGreaterElement(int arr[],int n){
Stack<Integer>st=new Stack<>();
      int ans[]=new int [n];
    for(int i=n-1; i>=0; i--){
        while(!st.isEmpty() && st.peek()<=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i]=-1;
        }
        else{
           ans[i]=st.peek(); 
        }
        st.push(arr[i]);
    }
      for(int i=0; i<n; i++){
          System.out.print(ans[i]+" ");
      }
  }
}