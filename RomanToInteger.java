class Solution {
    public int romanToInt(String s) {
        
        int num = 0;
        
		Map<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
        
		int i =0;
        
		while(i<s.length()-1) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			int first = map.get(c1);
			int second = map.get(c2);
			if(first>=second) {      // the number is going on in increasing order
				num = num+first;
				i=i+1;
				
			}else {
				num = num + (second-first);  
                // smaller value number is before the larger so we subtract the larger with                         the smaller and move 2 step at a time.
				i=i+2;
			}
		}
		if(i<s.length()) { 
            //since the while loop will not consider last character if going one at time 
			num = num + map.get(s.charAt(i));
		}
		return num;
    }
}