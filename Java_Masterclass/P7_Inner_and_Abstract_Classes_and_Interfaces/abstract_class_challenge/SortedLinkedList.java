import java.util.Iterator;

public class SortedLinkedList<E extends Comparable<E>> extends SortedList<E>{
/************************************* CONSTRUCTORS *****************************************/
	public SortedLinkedList(Node<E> newNode){
		head = newNode;
		tail = newNode;
		size = 1;
	}
	public SortedLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
/********************************************************************************************/
/***************************************** METHODS ******************************************/
/************************************** add(E element) **************************************/
	@Override
	public boolean add(E element){
	/** List is empty so add element to front of list **/
		if(isEmpty()){
			head = new Node<E>(null, null, element);
			tail = head;
			size++;
			return true;
		}
	/** List is not empty **/
		else{
			Node<E> tempNode = head;
		// Pass through list comparing values
			while(tempNode != null){
			// Do not add duplicates
				if(element.equals(tempNode.element))
					return false;	
			// The element to add is greater than current element //
				else if(element.compareTo(tempNode.element) > 0){
					tempNode = tempNode.nextNode;
				}
			// The element to add is less than current element
				else{
				// If current node is head add to front of list
					if(tempNode == head){
						tempNode = new Node<E>(null, head, element);
						head.previousNode = tempNode;
						head = tempNode;
						size++;
					}
				// If current node is any node other than head
					else{
					// Create new node to add to list
						Node<E> tempNode2 = new Node<E>(tempNode.previousNode, tempNode, element);
						/*
						tempNode = tempNode.previousNode;
						tempNode.nextNode = tempNode2;
						*/
						tempNode.previousNode.nextNode = tempNode2;
						tempNode.previousNode = tempNode2;
						size++;
					}
					return true;
				}
			}
		// Reached end of list so add element to end
			tail.nextNode = new Node<E>(tail, null, element);
			tail = tail.nextNode;
			size++;
			return true;
		}
	}
/********************************************************************************************/
/*************************************** clear() ********************************************/
	@Override
	public void clear(){
		helpClear(head);
	}
/*********************************************************************************************/
/******************************* contains(Object object) *************************************/
	@Override
	public boolean contains(Object object){
		if(isEmpty())
			return false;
		
		else if(object != null && head.element.getClass() == object.getClass()){
			//E temp = (E)object;
			Node<E> tempNode = head;
			while(tempNode != null){
				if(tempNode.element.equals(object))
					return true;
				else
					tempNode = tempNode.nextNode;
			}
		}
		return false;
	}
/*********************************************************************************************/
/************************************ equals(Object object) **********************************/
/*
	@Override
	public boolean equals(Object object){
		if(object != null && this.getClass() == object.getClass()){
			;
		}
	}
*/
/*********************************************************************************************/
/*************************************** get(int index) **************************************/
	@Override
	public E get(int index){
		if(index > size)
			return null;
		else if(index < 0)
			return null;
		else{
			Node<E> temp = head;
			for(int i=0; i<index; i++){
				temp = temp.nextNode;
			}
			return temp.element;
		}
	}
/********************************************************************************************/
/*********************************** indexOf(Object object) *********************************/
	@Override
	public int indexOf(Object object){
		if(isEmpty())
			return -1;
		
		else if(object != null && head.element.getClass() == object.getClass()){
		//else if(object != null && type.isInstance(object)){
			//E objAsType = type.cast(object);
			
			Node<E> tempNode = head;
			for(int i=0; (i < size) && (tempNode != null); i++){
				if(tempNode.element.equals(object))
					return i;
				//else if(tempNode.element.compareTo(object) > 0)
					//return -1;
				else
					tempNode = tempNode.nextNode;
			}
		}
		return -1;
	}
/*********************************************************************************************/
/***************************************** isEmpty() *****************************************/
	@Override
	public boolean isEmpty(){
		return(head == null);
	}
/*********************************************************************************************/
/**************************************** iterator() *****************************************/
	/*
	@Override
	public Iterator<E> iterator(){
		;
	}
	*/
/*********************************************************************************************/
/************************************* remove(int index) *************************************/
	@Override
	public E remove(int index){
	//check if the list is empty
		if(isEmpty())
			return null;
	//check if the index is less than zero or exceeds the size of the list
		else if(index < 0 || index >= size)
			return null;
	//check if the index is the first element in the list
		else if(index == 0){
			E item = head.element;
			head = head.nextNode;
			size--;
			return item;
		}
	//check if index is the last element in the list
		else if(index == (size-1)){
			E item = tail.element;
			tail = tail.previousNode;
			tail.nextNode = null;
			size--;
			return item;
		}
		else{
			Node<E> tempNode = head;
			for(int i=0; i < size; i++){
				if(i == (index-1) ){
					E item = tempNode.nextNode.element;
					tempNode.nextNode = tempNode.nextNode.nextNode;
					tempNode.nextNode.previousNode = tempNode;
					size--;
					return item;
				}
				else
					tempNode = tempNode.nextNode;
			}
			return null;
		}
	}
/********************************************************************************************/
/********************************** remove(Object object) ***********************************/
	@Override
	public boolean remove(Object object){
		// check for empty list
		if(head == null)
			return true;
		
		else if(object != null && head.element.getClass() == object.getClass()){
		
			for(Node<E> temp = head; temp != null; temp = temp.nextNode){
			// Found a match
				if(temp.element.equals(object)){
				// If object to be deleted is pointed to by head
					if(temp == head){
						head = head.nextNode;
						size--;
						return true;
					}
				// If object to be deleted is pointed to by tail
					else if(temp == tail){
						tail = tail.previousNode;
						tail.nextNode = null;
						size--;
						return true;
					}
					else{
						Node<E> temp2 = temp.previousNode;
						temp2.nextNode = temp.nextNode;
						temp = temp.nextNode;
						temp.previousNode = temp2;
						
						size--;
						return true;
					}
				}
			}
		}
		return false;
	}
/*********************************************************************************************/
/******************************************* size() ******************************************/
	@Override
	public int size(){
		return size;
	}
/*********************************************************************************************/
/**************************************** toString() *****************************************/
	@Override
	public String toString(){
		if(head == null)
			return null;
		else{
			String returnString = "";
			
			Node<E> temp = head;
			while(temp.nextNode != null){
				returnString += temp.element.toString() + ", ";
				temp = temp.nextNode;
			}
			returnString += temp.element.toString();
			
			return (returnString);
		}
	}
/*
	public String backwardsString(){
		
		String list = "";
		Node<E> tempNode = tail;
		while(tempNode != null){
			list += (tempNode.element + " ");
			tempNode = tempNode.previousNode;
		}
		return list;
	}
*/
/*********************************************************************************************/
/************************************* HELPER FUNCTIONS **************************************/
/*********************************** helpClear(Node node) ************************************/
	private void helpClear(Node<E> node){
		if(node == null)
			return;
		else{
			helpClear(node.nextNode);
			node = null;
		}
	}
/**********************************************************************************************/
}