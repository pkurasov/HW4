import java.util.*;
public class SCAN {
	private int start;
	private int numMoves;
	private boolean dir;
	private String name = "SCAN";
	
	SCAN(int start, ArrayList<Integer> req){
		this.start = start;
		setDir();
		numMoves = setNumMoves(start,req,dir);
	}
	private int setNumMoves(int start, ArrayList<Integer> req, boolean dir) { 
		req.add(start);	
		Collections.sort(req);
		int pos = req.indexOf(start);
		int sum = 0;
		if(dir) {
		sum+=4999-req.get(pos);
		sum+=4999-req.get(0);
		} else {
			sum+=Math.abs(0-req.get(pos));
			sum+=req.get(req.size()-1);
		}
		return sum;
	}
	
	private void setDir() {
		boolean lock = false;
		String key;
		System.out.print("Please enter hand direction.('Up' or 'Down') ");
		Scanner sc = new Scanner(System.in);
		while(lock==false) {
			//Scanner sc = new Scanner(System.in);
			key = sc.nextLine();
			if(key == "Up") {
				lock = true;
				dir = true;
				
			}else if(key == "Down") {
				lock = true;
				dir = false;
				
			}else {
				System.out.println("Please enter 'Up' or 'Down'");
			}
			
		}
		
		sc.close();
	}
	
	public int getNumMoves() {
		return numMoves;
	}
	public int getStart() {
		return start;
	}
	public String getDir() {
		String result;
		if(dir == false)
			result = "Down";
		else
			result = "Up";
		return result;
	}
	public String getName() {
		return name;
	}
}
