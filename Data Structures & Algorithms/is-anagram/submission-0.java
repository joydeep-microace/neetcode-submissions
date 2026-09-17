class Solution {

    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];

        for ( char c: s.toCharArray() ) {

            int index = ((int) c) - 97 ;

            arr[index] = arr[index] + 1;

        }
        
        for( char c: t.toCharArray() ) {
            
            int index = ((int) c) - 97;
            
            arr[index] = arr[index] - 1;
            
        }

        return Arrays.stream(arr).allMatch( val -> val == 0 );

    }
}
