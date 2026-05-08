class Solution {

    
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

       
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        return Arrays.equals(arr1, arr2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr= new int [strs.length];
        List<List<String>> result = new ArrayList<>();
        

        for (int i = 0; i < strs.length; i++) {
            arr[i]=0;
            
        } 
        for (int i = 0; i < strs.length; i++){
            if(arr[i]==0){
                List<String> group = new ArrayList<>();
                for(int j=i;j<strs.length;j++){
                    if (arr[j]==0){
                        if(isAnagram(strs[i],strs[j])){
                            group.add(strs[j]);
                            arr[j]=1;
                        }
                    }
                }
                result.add(group);
            }
        }
        return result;
    }
}