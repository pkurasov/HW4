import java.util.*;
public class SCAN {
	private int start;
	private int numMoves;
	private String dir;
	private String name = "SCAN";
	
	SCAN(int start, ArrayList<Integer> req,String dir){
		this.start = start;
		this.dir = dir;
		numMoves = setNumMoves(start,req,dir);
	}
	private int setNumMoves(int start, ArrayList<Integer> req, String dir) { 
		req.add(start);	
		Collections.sort(req);
		int pos = req.indexOf(start);
		int sum = 0;
		if(dir == "Up") {
		sum+=4999-req.get(pos);
		sum+=4999-req.get(0);
		} else {
			sum+=Math.abs(0-req.get(pos));
			sum+=req.get(req.size()-1);
		}
		return sum;
	}
	
	
	
	public int getNumMoves() {
		return numMoves;
	}
	public int getStart() {
		return start;
	}
	public String getDir() {
		
		return dir;
	}
	public String getName() {
		return name;
	}
}
