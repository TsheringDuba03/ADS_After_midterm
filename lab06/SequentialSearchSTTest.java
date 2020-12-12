public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();

		obj.put("A",5);
		obj.put("B",7);
		obj.put(null,6);
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains("A"));
		System.out.println(obj.get("A"));
		obj.delete("B");
		System.out.println(obj.get("B"));
		System.out.println(obj.size());
	}
}