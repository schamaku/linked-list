
public class Tnode {
private Tnode next;
private int data;
public Tnode(int data, Tnode next){
	this.data= data;
	this.next = next;
}
public void setData(int data){
	this.data = data;
}
public void setNext(Tnode next){
	this.next = next;
}
public int getData(){
	return data;
}

public Tnode getNext(){
	return next;
}
public boolean hasNext(){
	if(next!=null) return true;
	else return false;
}
}
