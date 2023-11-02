package Set;
import java.util.ArrayDeque;
import java.util.Deque;
public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Deque<String> dq = new ArrayDeque<String>();
    
    dq.add("glenn");
    dq.add("negan");
    dq.addLast("maggie");
    dq.addFirst("rick");
    dq.add("daryl");
    
    System.out.println("elements in deque : " + dq);
    System.out.println("removed element : " + dq.removeLast());
    System.out.println("elements in deque : " + dq);
    System.out.println("removed element : " + dq.removeFirst());
    System.out.println("elements in deque : " + dq);
    dq.addFirst("charls");
    System.out.println("elements in deque : " + dq);
    System.out.println("head :" + dq.element());
    System.out.println("poll :" + dq.pollLast());
    System.out.println("peek :" + dq.peek());
    System.out.println("elements in deque :" + dq);
    System.out.println("elements is empty :" + dq.isEmpty());
	}

}
