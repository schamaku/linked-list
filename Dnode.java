public class Dnode {
private Dnode next;
private Dnode previous;
private int data;
public Dnode(int data, Dnode next, Dnode previous){
	this.data= data;
	this.next = next;
  this.previous = previous;
}
public void setData(int data){
	this.data = data;
}
public void setNext(Dnode next){
	this.next = next;
}
public void setPrevious(Dnode previous){
	this.previous = previous;
}
public int getData(){
	return data;
}

public Dnode getNext(){
	return next;
}
public Dnode getPrevious(){
	return previous;
}
public boolean hasNext(){
	if(next!=null) return true;
	else return false;
}
public boolean hasPrevious(){
	if(next!=null) return true;
	else return false;
}
}
