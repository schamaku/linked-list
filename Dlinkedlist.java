
import java.util.*;
public class Dlinkedlist {
private Dnode head;
private Dnode ptr;
private Dnode ptr1;
private Dnode ptr2;
private int size;
public Dlinkedlist (){
	size =0;
}
public void add(Dnode node){
	if(head==null){
		head = node;
		size++;
	}
	else{
		ptr=head;
	while(ptr.hasNext()){
		ptr=ptr.getNext();
	}
	ptr.setNext(node);
  node.setPrevious(ptr);
	size++;
	}
}

public void getSize(){
	System.out.println("size is"+size+"->");
}

public void insert(Dnode node){
  ptr=head;
  Scanner sc = new Scanner(System.in);
  int pos = sc.nextInt();
  for(int i=1; i<pos-1; i++){
    ptr=ptr.getNext();

  }
  node.setNext(ptr.getNext());
  ptr.getNext().setPrevious(node);
  ptr.setNext(node);
  node.setPrevious(ptr);
  size++;
}

public void printl(){
  ptr=head;

  while(ptr.hasNext()){

    System.out.println(ptr.getData());
      ptr=ptr.getNext();
  }
System.out.println(ptr.getData());}
}
