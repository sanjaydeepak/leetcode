class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int []pair:nums1)
        {
            map.put(pair[0],map.getOrDefault(pair[0],0)+pair[1]);
        }
        for(int []pair:nums2)
        {
            map.put(pair[0],map.getOrDefault(pair[0],0)+pair[1]);
        }
        //to convert Hashmap to list
        List<int[]>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
           list.add(new int[]{entry.getKey(),entry.getValue()});
        }
          list.sort(Comparator.comparingInt(a->a[0]));
          return list.toArray(new int[0][]);
    }
}