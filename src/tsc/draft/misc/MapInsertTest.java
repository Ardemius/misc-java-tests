package tsc.draft.misc;

import java.util.HashMap;
import java.util.Map;

public class MapInsertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap();

		map.put(new String("aaa"), "toto");
		map.put(new String("aaa"), "titi");
		
		// StringBuffer DO NOT overrides hashCode !!!!
		map.put(new StringBuffer("bbbbbb"), "tutu");
		map.put(new StringBuffer("bbbbbb"), "tete");

		map.entrySet();
		for (Object entryObject : map.entrySet()) {
			Map.Entry entry = (Map.Entry) entryObject;
			System.out.println("key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
		}
	}

}
