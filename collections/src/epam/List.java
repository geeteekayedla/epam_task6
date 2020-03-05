package epam;

import java.util.Arrays;

public class List <lis> {
	private int size=0;
	private static final int CAPACITY=10;
	private Object list_of_elements[];
	public List()
	{
        list_of_elements = new Object[CAPACITY];
    }
	public void add(lis data)
	{
		if (size == list_of_elements.length) {
            ensureCapacity();
        }
		list_of_elements[size++]=data;
	}
	public int size()
	{
		return size;
	}
	public lis remove(int i)
	{
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
		 Object list_item = list_of_elements[i];
	        int num_of_Elts = list_of_elements.length - ( i + 1 ) ;
	        System.out.println("Elements are:");
	        System.arraycopy( list_of_elements, i + 1, list_of_elements, i, num_of_Elts ) ;
	        size--;
	        return (lis) list_item;
	}
	public lis get(int i) {
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (lis) list_of_elements[i];
    }
	public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(list_of_elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
	private void ensureCapacity() {
        int newSize = list_of_elements.length * 2;
        list_of_elements = Arrays.copyOf(list_of_elements, newSize);
    }
}