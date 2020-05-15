import java.util.LinkedList;
import java.util.Queue;

public class State {

    private class StateNode {

	public Segment s;
	public StateNode parent;
	public StateNode right;
	public StateNode left;

	public StateNode(Segment s) {
	    this.s = s;
	}

	public int getHeight() {
	    if(this.right == null && this.left == null)
		return 0;
	    else {
		int r = (this.right != null) ? this.right.getHeight() : -1;
		int l = (this.left != null) ? this.left.getHeight() : -1;
		return Math.max(r, l) + 1;
	    }
	}
    }

    private StateNode root;

    public State() {}

    public void addSegment(Segment s) {
	StateNode sn = new StateNode(s);
	if(this.root == null)
	    this.root = sn;
	else
	    addSegment(sn, this.root);
    }

    private void addSegment(StateNode sn, StateNode node) {
	if(sn.s.compareTo(node.s) <= 0) {
	    if(node.left == null) {
		node.left = sn;
		sn.parent = node;
	    }else
		addSegment(sn, node.left);
	} else {
	    if(node.right == null) {
		node.right = sn;
		sn.parent = node;
	    }else
		addSegment(sn, node.right);
	}
	rebalance(sn.parent);
    }

    private StateNode search(StateNode sn, Segment s) {
	if(sn == null)
	    return null;
	if(s.compareTo(sn.s) == 0)
	    return sn;
	if(s.compareTo(sn.s) < 0)
	    return search(sn.left, s);
	return search(sn.right, s);
    }

    private void rebalance(StateNode sn) {
	return;
    }

    public void removeSegment(Segment s) {
	return;
    }

    public Segment leftSegment(Segment s) {
	StateNode sn = search(this.root, s);
	return (sn == null || sn.left == null) ? null : sn.left.s;
    }

    public Segment rightSegment(Segment s) {
	StateNode sn = search(this.root, s);
	return (sn == null || sn.right == null) ? null : sn.right.s;
    }

    public void giraDerecha(Segment s) {
	
    }

    public void giraIzquierda(Segment s) {
	
    }

    public String toString() {
	if(this.root == null)
	    return "";
	int h = this.root.getHeight() + 1;
	boolean [] branch = new boolean[h];
	for(int i = 0; i < h; i++)
	    branch[i] = false;
	String s = toString(this.root, 0, branch);
	return s.substring(0, s.length()-1);
    }

    private String toString(StateNode node, int lev, boolean[] branch) {
	String s = node.s.toString() + "\n";
	branch[lev] = true;
	if(node.left != null && node.right != null) {
	    s += spaces(lev, branch);
	    s += "├─›";
	    s += toString(node.left, lev+1, branch);
	    s += spaces(lev, branch);
	    s += "└─»";
	    branch[lev] = false;
	    s += toString(node.right, lev+1, branch);
	} else if(node.left != null) {
	    s += spaces(lev, branch);
	    s += "└─›";
	    branch[lev] = false;
	    s += toString(node.left, lev+1, branch);
	}else if(node.right != null) {
	    s += spaces(lev, branch);
	    s += "└─»";
	    branch[lev] = false;
	    s += toString(node.right, lev+1, branch);
	}
	return s;
    }

    private String spaces(int n, boolean [] branch) {
	String s = "";
	for(int i = 0; i < n; i++)
	    if(branch[i])
		s += "│  ";
	    else
		s += "   ";
	return s;	   
    }
}
