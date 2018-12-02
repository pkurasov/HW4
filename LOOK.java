import java.util.*;
public class LOOK {
	private int start;
	private int numMoves;
	private String dir;
	private String name = "LOOK";
	
	LOOK(int start, ArrayList<Integer> req, String dir){
		this.start = start;
		this.dir = dir;
		numMoves = setNumMoves(start,req,dir);
	}
	private int setNumMoves(int start, ArrayList<Integer> req, boolean dir) { 
		req.add(start);	
		Collections.sort(req);
		int pos = req.indexOf(start);
		int sum = 0;
		if(dir == "Up") {
		sum+=req.get(req.size()-1)-req.get(pos);
		sum+=req.get(req.size()-1)-req.get(0);
		} else {
			sum+=Math.abs(req.get(0)-req.get(pos));
			sum+=Math.abs(req.get(req.size()-1)-req.get(0));
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
