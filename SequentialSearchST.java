import java.util.*;
public class SequentialSearchST<Key, Value>
{
    private int n;
    private Node first;

    private class Node{
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next)
        {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }    

    public SequentialSearchST() {
    
    }
    public int size()
    {
        return n;
    
    }
    public boolean isEmpty()
    {
        return size()==0;
    }
    public boolean contains(Key key)
    {
        if(key==null) throw new IllegalArgumentException("Argument to contain() is null");
        return get(key) != null;    
    }
    public Value get(Key key)
    {
        if (key == null) throw new IllegalArgumentException("argument to get() is null"); 
        for (Node x = first; x != null; x = x.next)
        {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }
    public void put(Key key, Value val)
    {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null"); 
        if (val == null)
        {
            delete(key);
            return;
        }

        for (Node x = first; x != null; x = x.next)
        {
            if (key.equals(x.key)) 
            {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
        n++;
   
    }
    public void delete(Key key) 
    {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null"); 
        first = delete(first, key);
    }
    private Node delete(Node x, Key key) 
    {
        if (x == null) return null;
        if (key.equals(x.key)) 
        {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }
    public Iterable<Key> keys()
    {
        ArrayList<Key> arr=new ArrayList<Key>();
        for (Node x = first; x != null; x = x.next)
            arr.add(x.key);
        return arr;


    }
     public static void main(String[] args)
    {
        SequentialSearchST<String, Integer> list = new SequentialSearchST<String, Integer>();
        list.put("Sonam",1);
        list.put("Duba",2);
        list.put("Ugyen",3);
        list.put("Peso",4);
        System.out.println("size is:"+list.size());
        System.out.println("keys are: "+list.keys());
        System.out.println("Is it empty:"+list.isEmpty());   
    }
}