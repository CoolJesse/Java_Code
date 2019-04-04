public class SortedTreeList<E extends Comparable<E>> extends SortedList<E>{
/*************************************** FIELDS ********************************************/
	private Node<E> root;
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
	@Override	
	public boolean contains(Object object){return true;}
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