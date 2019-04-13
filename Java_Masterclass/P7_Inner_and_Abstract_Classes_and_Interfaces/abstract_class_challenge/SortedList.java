import java.util.Iterator;
import java.util.ListIterator;

abstract class SortedList<E extends Comparable<E>>{
/** Nested Node class **********************************************************************/
	protected class Node<E extends Comparable<E>> implements Comparable<Node<E>>{
		protected Node<E> leftNode;		
		protected Node<E> rightNode;
		
		protected E element;
		
		protected Node(Node<E> leftNode, Node<E> rightNode, E element){
			this.leftNode = leftNode;
			this.rightNode = rightNode;			
			this.element = element;
		}
		protected Node(E element){
			this(null, null, element);
		}
	
		@Override
		public boolean equals(Object obj){
			if(obj != null && getClass() == obj.getClass()){
				if(this == obj)
					return true;
				
				Node tempNode = (Node)obj;
				
				return(element.equals(tempNode.element));
			}
			else
				return false;
			
		}
		@Override
		public int compareTo(Node<E> other){
			return element.compareTo(other.element);
		}
	}
/********************************************************************************************/
/** Fields **********************************************************************************/
	protected int size;
	//type used for casting object to generic type when using compareTo() function
	protected Class<E> type;
	
/** Methods ********************************************************************************/
	public abstract boolean add(E element);
	public abstract void clear();
	//public abstract boolean contains(Object object);
	public abstract boolean contains(E item);
	//public abstract boolean equals(Object object);
	
	public abstract E get(int index);
	public abstract int indexOf(Object object);
	public abstract boolean isEmpty();
	
	//public abstract Iterator<E> iterator();
	public abstract E remove(int index);
	public abstract boolean remove(Object object);
	//public abstract E set(int index, E element);
	public abstract int size();
/*********************************************************************************************/
}