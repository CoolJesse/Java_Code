public class MyLinkedList<T>
{
	
/** Nested Node class **********************************************************************/
	private class Node<T>{
		private Node<T> nextNode;
		private Node<T> previousNode;
		
		private T obj;
		
		private Node(Node<T> previousNode, Node<T> nextNode, T obj){
			this.previousNode = previousNode;
			this.nextNode = nextNode;			
			this.obj = obj;
		}
		private Node(T obj){
			this(null, null, obj);
		}
	}
/********************************************************************************************/
/** MyLinkedList class **********************************************************************/
	private Node<T> head;
	private Node<T> tail;
/** Methods *********************************************************************************/

	public boolean isEmpty(){
		return(head == null && tail == null);
	}
	public void add(T obj){
		if(isEmpty()){
			head = new Node<T>(null, null, obj);
			tail = head;
		}
		else{
			tail.nextNode = new Node<T>(tail, null, obj);
			tail = tail.nextNode;
		}
	}
	private Node<T> delete(T obj){
		/** head-->null **/
		if(head == null)
			return null;
		
		for(Node<T> temp = head; temp != null; temp = temp.nextNode){
			if(temp.obj == obj){
			/** temp2<-->temp-->next **/
				Node<T> temp2 = temp.previousNode;
			/** temp2-->next && temp-->next **/
				temp2.nextNode = temp.nextNode;
			/** temp2-->next && temp-->null **/
				temp = null;
				return temp2;
			}
		}
		return null;
			
	}
	private void helpClear(Node<T> node){
		if(node == null)
			return;
		else{
			helpClear(node.nextNode);
			node = null;
		}
	}
	public void clear(){
		helpClear(head);
	}
	@Override
	public String toString(){
		if(head == null)
			return null;
		else{
			String returnString = "";
			
			Node<T> temp = head;
			for(; temp.nextNode != null; temp = temp.nextNode){
				returnString += temp.obj.toString() + ", ";
			}
			returnString += temp.obj.toString();
			
			return (returnString);
		}
	}
}