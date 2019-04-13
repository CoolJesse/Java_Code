public class SortedTreeList<E extends Comparable<E>> extends SortedMap<E>{
/************************************* FIELDS *****************************************/
	private Node<E> root;
	//private Class<E> type;	
/**************************************************************************************/
/*********************************** CONSTRUCTOR **************************************/
	public SortedTreeList(Node<E> rootNode){
		this.root = rootNode;
		size = 1;
	}
	public SortedTreeList(){
		this.root = null;
		size = 0;
	}
	public SortedTreeList(E element){
		this.root = new Node<E>(null, null, element);
	}
/*************************************************************************************/
/************************************* METHODS ***************************************/
/************************************** add(E) ***************************************/
	@Override
	public boolean add(E element){
		int prevSize = size;
		root = addElement(root, element);
		
		if(size - prevSize > 0)
			return true;
		else
			return false;
	}
/**************************************************************************************/
/************************************* clear() ****************************************/
	@Override	
	public void clear(){
		root = clearNodes(root);
	}
/**************************************************************************************/
/******************************** contains(Object) ************************************/
	@Override
	public boolean contains(E item){
	// First check is tree list is empty
		if(isEmpty())
			return false;
	// Check that object is not null and is of same class type as element
		else if(item != null && root.element.getClass() == item.getClass()){
			try{
				//E objAsType = type.cast(object);
				return ( search(root, item) != null );
			}
			
			catch(ClassCastException e){
				return false;
			}
			/*
			catch(NullPointerException e){
				return false;
			}
			*/
		}
	// If object is either null or not of the same class type as element return false
		else 
			return false;
	}
/************************************** equals(Object) ********************************///public boolean equals(Object object);
/************************************** hashcode() ************************************/
	//@Override	
	//public int hashcode(){return 0;}
/************************************** iterator() ************************************/
	//@Override
	//public abstract Iterator<E> iterator();
/************************************** isEmpty() *************************************/
	@Override	
	public boolean isEmpty(){
		return (root == null);
	}
/************************************ remove(Object) **********************************/
	@Override	
	public boolean remove(E item){
		if(item != null && this.getClass() == item.getClass()){
			Node<E> temp = search(root, item);
			if(temp != null){
				
				return true;
			}
		}
		else
			return false;
	}
/**************************************** size() **************************************/
	@Override	
	public int size(){return size;}
/*************************************** toArray() ************************************/
	//@Override
	//public Object[] toArray(); 
/*************************************** toString() ***********************************/
@Override
	public String toString(){
		String list = print(root);
		return list;
	}
/**************************************************************************************/
/********************************** HELPER FUNCTIONS **********************************/
/******************************* addElement(Node<E>, E) *******************************/
	private Node<E> addElement(Node<E> node, E element){
	// If node is null, make it point to new Node containing element
		if(node == null){	
			size++;
			return new Node<E>(null, null, element);
		}
	// If element at current Node is equal to element to add, DO NOT add duplicate
		else if(element.equals(node.element)){			
			return node;
		}
	// If element to add is less than element at current node check left child
		else if(element.compareTo(node.element) < 0 ){			
			node.leftChild = addElement(node.leftChild, element);			
		}
	// If element to add is greater than element at current node check right child
		else{		
			node.rightChild = addElement(node.rightChild, element);			
		}
		return node;
	}
/********************************** clearNodes(Node<E>) ******************************/
	private Node<E> clearNodes(Node<E> node){
		if(node == null)
			return null;
		if(node.leftChild != null){
			node.leftChild = clearNodes(node.leftChild);
		}
		if(node.rightChild != null){
			node.rightChild = clearNodes(node.rightChild);
		}
		size--;
		return null;
		
	}
/******************************* search(Node<E>, E) ***********************************/
	private Node<E> search(Node<E> node, E element){
	// If we reach the end of the tree and haven't found element
		if(node == null || element == null)
			return null;
	// If element is less than current node's element
		if(element.compareTo(node.element) < 0)
			return search(node.leftChild, element);
	// If element is greater than current nodes's element
		else if(element.compareTo(node.element) > 0)
			return search(node.rightChild, element);
	// If element matches current node's element
		else
			return node;
	}
/*********************************** delete(Node<E>) **********************************/
	private Node<E> delete(Node<E> node){
		// If node has no children
		if(node.leftChild == null && node.rightChild == null){
			return null;
		}
		// If node only has a left child
		else if(node.rightChild == null){
			return node.leftChild;
		}
		// If node only has a right child
		else if(node.leftChild == null){
			return node.rightChild;
		}
		// If node has both a left and right child
		else{
			if(node.rightChild.leftChild == null){
				node.element = node.rightChild.element;
				node.rightChild = node.rightChild.rightChild;
			}
			else{
				Node<E> temp = node.rightChild;
				while(temp.leftChild.leftChild != null){
					temp = temp.leftChild;
			}
		// We have now found the smallest element in the right sub tree
			node.element = temp.leftChild.element;
			temp.leftChild = temp.leftChild.rightChild;	
			return node;
		}
	}
/************************************ print(Node<E>) **********************************/
	private String print(Node<E> node){
		// PERFORM INORDER TRAVERSAL TO PRINT CONTENTS OF TREE USING RECURSION
		if(node == null){
			System.out.println("Emtpy list");
			return "";
		}
		
		String list = "";
		// Print left child first
		if(node.leftChild != null)
			list += (print(node.leftChild) + " ");
		// Print this element second	
		list += (node.element.toString() + " ");
		// Print right child last
		if(node.rightChild != null)
			list += (print(node.rightChild) + " ");
		
		return list;
	}
/**************************************************************************************/
}