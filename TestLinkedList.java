
public class TestLinkedList{

public static void main(String args[]){
	Tnode n = new Tnode(5,null);
Tnode n1 = new Tnode(5,null);
Tnode n2 = new Tnode(5,null);
Tnode n3 = new Tnode(5,null);
Tnode n4 = new Tnode(6,null);

	Tlinkedlist tl = new Tlinkedlist();
  tl.add(n);
  tl.add(n1);
    tl.add(n2);
      tl.add(n3);
tl.insert(n4);
tl.printl();

	tl.getSize();

}
}
