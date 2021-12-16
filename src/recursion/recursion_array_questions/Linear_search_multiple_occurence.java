package recursion.recursion_array_questions;

import java.util.ArrayList;

public class Linear_search_multiple_occurence {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,8};
        int target = 4;
//        findAllIndex(arr,target,0);
//        System.out.println(list);
//        ArrayList<Integer>ans = findAllIndex(arr, target,0,new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAllIndex2(arr,target,0));
    }
    static ArrayList<Integer> list  = new ArrayList();
    static void findAllIndex(int[]arr, int target, int index){
        // base case
        if(index == arr.length){
            return ;
        }

        if(arr[index] == target){
            list.add(index);
        }
        // relation
        findAllIndex(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndex(int[]arr, int target, int index, ArrayList<Integer> list){
        // base condition
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        // relation
        return findAllIndex(arr, target, index+1, list);
    }
    static ArrayList<Integer> findAllIndex2(int[]arr, int target, int index){
        ArrayList<Integer> list  = new ArrayList<>() ;
        // base condition
        if( index == arr.length){
            return list ;
        }
        // this will contain ans for that function only
        if( arr[index] == target){
            list.add(index);
        }
        // relation
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
