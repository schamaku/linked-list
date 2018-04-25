public class TestDlinkedlist{

public static void main(String args[]){
	Dnode n = new Dnode(1,null,null);
Dnode n1 = new Dnode(2,null,null);
Dnode n2 = new Dnode(3,null,null);
Dnode n3 = new Dnode(5,null,null);
Dnode n4 = new Dnode(6,null,null);
Dnode n5 = new Dnode(7,null,null);

	Dlinkedlist dl = new Dlinkedlist();
  dl.add(n);
  dl.add(n1);
    dl.add(n2);
      dl.add(n3);
      dl.add(n4);
dl.insert(n5);
dl.printl();

	dl.getSize();

}
}
