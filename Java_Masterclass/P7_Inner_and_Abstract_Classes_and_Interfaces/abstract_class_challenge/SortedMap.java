
public abstract class SortedMap<E extends Comparable<E>>{
/** Nested Node class **********************************************************************/
	protected class Node<E extends Comparable<E>> implements Comparable<Node<E>>{
		protected Node<E> leftChild;		
		protected Node<E> rightChild;
		
		protected E element;
		
		protected Node(Node<E> leftChild, Node<E> rightChild, E element){
			this.leftChild = leftChild;
			this.rightChild = rightChild;			
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
/**************************************** FIELDS ********************************************/
	protected int size;
/*************************************** METHODS ********************************************/
	public abstract boolean add(E e);
	//public abstract boolean addAll(Collection<? extends E> c);
	public abstract void clear();
	public abstract boolean contains(E item);
	//public abstract boolean equals(Object o);
	//public abstract int hashCode();
	public abstract boolean isEmpty();
	//public abstract Iterator<E> iterator();
	public abstract boolean remove(E item);
	//public abstract boolean removeAll(Collection<?> c);
	//public abstract boolean retainAll(Collection<?> c);
	public abstract int size();
	//public abstract Object[] toArray(); 
}