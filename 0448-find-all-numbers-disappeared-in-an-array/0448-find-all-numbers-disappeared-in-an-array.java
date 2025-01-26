class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {

        //CYCLIC SORT APPROACH
        //By 0 To N Index Which is arr.length
        int i=0;
        //Use of Interface
        List<Integer>ans=new ArrayList<>();
        while(i<arr.length)
        {
            int correct_index=arr[i]-1;
            if(arr[i]!=arr[correct_index])
            {
                swap(arr,i,correct_index);
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                ans.add(index+1);
            }
        }
        return ans;
    }
    void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}