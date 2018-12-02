import java.util.*;
public class ADriver {
	private static int start; //request
	private static ArrayList<Integer> req =new ArrayList<Integer>(); 
	Random rand = new Random();
	private String dir;
	
	ADriver(){
		boolean lock1 = false;
		System.out.println("Please enter starting point integer: ");
		Scanner sc = new Scanner(System.in);
		while(lock1==false) {
			
		try {
			start = sc.nextInt();
			lock1 = true;			
		}catch(Exception e){
			System.out.print("Please enter an integer: ");
		}
		}
		
		Boolean lock2 = false;
		System.out.println("Please enter handle direction. (Up or Down) ");
		
		while(lock2==false) {
		try {
			dir = sc.next();
			if(dir == "Up" || dir == "Down")
				lock2 = true;
			else
				throw Exception e;
			
			
		}catch(Exception e){
			System.out.println("Please enter handle direction. (Up or Down) ");
		}
		}
		sc.close();	
	}
	
public ArrayList<Integer> getReq(){
	return req;
}
	
		public static void main(String[] args) {
			ADriver d = new ADriver();
			FIFO f = new FIFO(start,req);
			SCAN s = new SCAN(start,req,dir);
			LOOK l = new LOOK(start,req,dir);
			//System.out.println("Process "+f.getName()+" hand made "+f.getNumMoves());
			System.out.println("Process "+s.getName()+" hand made "+s.getNumMoves());
			//System.out.println("Process "+l.getName()+" hand made "+l.getNumMoves());
		}
	}


