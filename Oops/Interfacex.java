package Oops;

interface move {
	public void run();
	}
interface speak {
	public void spek();
    public void show();
	}
public class  Interfacex implements move,speak {
  public void run()
{ 
			System.out.println("i can run");

}
  public void spek()
{ 
			System.out.println("i can speak");

}
  public void show()
  { 
  			System.out.println("i can run and i can speak");

  }

	public static void main(String[] args) {
		Interfacex obj = new Interfacex();
		obj.run();
		obj.spek();
		obj.show();
	}

}
