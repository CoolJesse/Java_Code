public class SortedTreeList<E extends Comparable<E>> extends SortedList<E>{
/*************************************** FIELDS ********************************************/
	private Node<E> root;
	//private Class<E> type;	
/*******************************************************************************************/
/************************************* CONSTRUCTOR *****************************************/
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
/*******************************************************************************************/
/*************************************** METHODS *******************************************/
/**************************************** add(E) *******************************************/
	@Override
	public boolean add(E element){
		int prevSize = size;
		root = addElement(root, element);
		
		if(size - prevSize > 0)
			return true;
		else
			return false;
	}
/*******************************************************************************************/
/**************************************** clear() ******************************************/
	@Override	
	public void clear(){
		root = clearNodes(root);
	}
/*******************************************************************************************/
/************************************ contains(Object) *************************************/
	@Override	
	public boolean contains(Object object){
	// First check is tree list is empty
		if(isEmpty())
			return false;
	// Check that object is not null and is of same class type as element
		else if(object != null && root.element.getClass() == object.getClass()){
			try{
				E objAsType = type.cast(object);
				//E objAsType = (root.element.getClass())(object);
				return ( find(root, objAsType, 0) > -1 );
				//return ( find(root, type.cast(object), 0) > -1 );
			}
			
			catch(ClassCastException e){
				return false;
			}
			catch(NullPointerException e){
				return false;
			}
		}
	// If object is either null or not of the same class type as element return false
		else 
			return false;
	}
/*******************************************************************************************/
	//public boolean equals(Object object);
/*******************************************************************************************/	
	@Override	
	public E get(int index){return root.element;}
/*******************************************************************************************/
	@Override	
	public int indexOf(Object object){return 0;}
/*******************************************************************************************/	
	@Override	
	public boolean isEmpty(){
		return (root == null);
	}
	//public Iterator<E> iterator();
/*******************************************************************************************/
	@Override	
	public E remove(int index){return root.element;}
/*******************************************************************************************/
	@Override	
	public boolean remove(Object object){return true;}
	//public E set(int index, E element);
/*******************************************************************************************/
	@Override	
	public int size(){return size;}
/*******************************************************************************************/	
	@Override
	public String toString(){
		String list = print(root);
		return list;
	}
/*******************************************************************************************/
/********************************** HELPER FUNCTIONS *****************************************/
/******************************* addElement(Node<E>, E) **************************************/
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
			node.leftNode = addElement(node.leftNode, element);			
		}
	// If element to add is greater than element at current node check right child
		else{		
			node.rightNode = addElement(node.rightNode, element);			
		}
		return node;
	}
/*******************************************************************************************/
/********************************** clearNodes(Node<E>) ************************************/
	private Node<E> clearNodes(Node<E> node){
		if(node == null)
			return null;
		if(node.leftNode != null){
			node.leftNode = clearNodes(node.leftNode);
		}
		if(node.rightNode != null){
			node.rightNode = clearNodes(node.rightNode);
		}
		size--;
		return null;
		
	}
/*******************************************************************************************/
/***************************** find(Node<E>, element, index) *******************************/
	private int find(Node<E> node, E element, int index){
	// If we reach the end of the tree and haven't found element
		if(node == null || element == null)
			return -1;
	// If element is less than current node's element
		if(element.compareTo(node.element) < 0)
			return find(node.leftNode, element, index +1);
	// If element is greater than current nodes's element
		else if(element.compareTo(node.element) > 0)
			return find(node.rightNode, element, index + 1);
	// If element matches current node's element
		else
			return index;
	}
/*******************************************************************************************/
/************************************ print(Node<E>) ***************************************/
	private String print(Node<E> node){
		// PERFORM INORDER TRAVERSAL TO PRINT CONTENTS OF TREE USING RECURSION
		if(node == null){
			System.out.println("Emtpy list");
			return "";
		}
		
		String list = "";
		// Print left child first
		if(node.leftNode != null)
			list += (print(node.leftNode) + " ");
		// Print this element second	
		list += (node.element.toString() + " ");
		// Print right child last
		if(node.rightNode != null)
			list += (print(node.rightNode) + " ");
		
		return list;
	}
/*********************************************************************************************/
}