import java.util.*;
public class FIFO {
	private int start;
	private int numMoves;
	private String name = "FIFO";
	
	FIFO(int start, ArrayList<Integer> req){
		this.start = start;
		numMoves = getCount(req);
		
	}
	
	private int getCount(ArrayList<Integer> r) {
		int sum = 0;
		for(int i = 0;i < r.size();i+=2) {
			sum+=(Math.abs(r.get(i)-r.get(i+1)));
		}
		return sum + Math.abs(start - r.get(0));
	}
	public int getNumMoves() {
		return numMoves;
	}
	public int getStart() {
		return start;
	}
	
	public String getName() {
		return name;
	}
}
