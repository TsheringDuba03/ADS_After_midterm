import java.util*
class BST
	{

	class Node{
		
		private int size;
		private Key key;
		private Value value;
		private int left right;

		public Node(Key key, Value val,int size)
		{
			this.key=key;
			this.value=value;
			this.size=size;
		}
	}

	int size(){
		return size();
	}

	public void put(Key key){
		if (key==null){
			System.out.print("The tree is empty");
		

		else (){
		
		}
		size=size+1;


	}
	
	public void isempty(){
		if(size==0){
			return true;
		}
		else {
			return false;
		}
	}

	public void get(Node x, Key key){
		if (key == null) throw new IllegalArgumentException("Null key");
        if (x == null)  return null;

        while(x!= null){
            int cmp = key.compareTo(x.key);

            if (cmp < 0) 
                return get(x.left, key);

            else if (cmp > 0) 
                return get(x.right, key);

            else              
                return x.val;
        }
        return null;
	}

	public void delete(Key key){
		if(x==null){
			System.out.print("Sorry! No key to delete");
		}
		else {

		}
		size=size-1;

	}

	public Key min() {
        if (isEmpty()) throw new NoSuchElementException("h empty symbol table");
        return min(root).key;
    } 

	public void min(){

		if (x.left == null) 
            return x; 
        else               
            return min(x.left);
    }

	public static void main(String[] args){

		BST obj()=new BST; 
		obj.put("Ada", 1);
		obj.put("Ballerina", 3);
		System.out.println(obj.get("Ada"));
		obj.put("Html" ,5);
		obj.put("java", 7);
		System.out.println(obj.get("java"));
		System.out.println(size());
		System.out.println(min());
		System.out.println(obj.floor("Ballerina"));
		obj.put("java", 8);
		obj.put("Dart", 9);
		System.out.println(obj.get("java"));
		System.out.println(obj.size());
		System.out.println(obj.delete("java"));

	} 

}