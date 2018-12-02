import java.util.*;
public class LOOK {
	private int start;
	private int numMoves;
	private boolean dir;
	private String name = "LOOK";
	
	LOOK(int start, ArrayList<Integer> req){
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
		sum+=req.get(req.size()-1)-req.get(pos);
		sum+=req.get(req.size()-1)-req.get(0);
		} else {
			sum+=Math.abs(req.get(0)-req.get(pos));
			sum+=Math.abs(req.get(req.size()-1)-req.get(0));
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
			key = sc.next();
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
