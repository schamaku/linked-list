
import java.util.*;
public class Tlinkedlist {
private Tnode head;
private Tnode ptr;
private Tnode ptr1;
private Tnode ptr2;
private int size;
public Tlinkedlist (){
	size =0;
}
public void add(Tnode node){
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
	size++;
	}
}

public void getSize(){
	System.out.println(size+"->");
}

public void insert(Tnode node){
  ptr1=head;
  Scanner sc = new Scanner(System.in);
  int pos = sc.nextInt();
  for(int i=1; i<pos-1; i++){
    ptr1=ptr1.getNext();

  }
  ptr2 = ptr1.getNext();
  ptr1.setNext(node);
  ptr1=ptr1.getNext();
  ptr1.setNext(ptr2);
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
