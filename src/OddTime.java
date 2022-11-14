import java.util.HashMap;

public class OddTime {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,1,2,3,4,5,100,400, 15,15,15,15,15,15,15,15};
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>() ;
		for (int i = 0; i < array.length; i++) {
			Integer value = hashmap.get(array[i]);
			if(value != null) {
				hashmap.remove(array[i]);
			}else {
				hashmap.put(array[i], 0);
			}
		}
		
		for(HashMap.Entry<Integer, Integer> set : hashmap.entrySet()) {
			System.out.println(set.getKey());
		}
	}
	
}
