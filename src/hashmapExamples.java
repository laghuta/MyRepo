import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class hashmapExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(12, "Laghuta");
		map.put(1, "arg1");
		map.put(13, "Amit");
		map.put(2, "arg6");
		map.put(18, "Vihaan");
		map.put(2, "arg4");
		map.put(0, "arg3");
		
		if(map.containsKey(9))
			System.out.println("true");
		else
			System.out.println("f");
		
		//System.out.println(map.get(2));
		Set mapset = map.entrySet(); 
		System.out.println("Before Sorting");
		Iterator  itr = mapset.iterator();
		while(itr.hasNext()){
			Map.Entry mapentry = (Map.Entry)itr.next();
			System.out.println(mapentry.getKey()+" "+ mapentry.getValue());
		}
		
		
		Map<Integer,String> mapSorting = new TreeMap<Integer,String>(map);
		if(mapSorting.isEmpty()){
			System.out.println("return false");
		}
		else{
			
		Set set2 = mapSorting.entrySet();
		System.out.println("After Sorting");
		Iterator itr2 = set2.iterator();
		while(itr2.hasNext()){
			Map.Entry mapentry2 = (Map.Entry)itr2.next();
			System.out.println(mapentry2.getKey()+" "+mapentry2.getValue());
		}
	}}

}
