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

    private void rebalance(StateNode sn) {
	return;
    }

    public void removeSegment(Segment s) {
	return;
    }

    public void bfs() {
	if(root == null)
	    return;
	Queue<StateNode> queue = new LinkedList<>();
	queue.add(this.root);
	do {
	    StateNode sn = queue.poll();
	    System.out.println(sn.s.toString());
	    if(sn.left != null) {
		queue.add(sn.left);
		System.out.println("Left: " + sn.left.s.toString());
	    }
	    if(sn.right != null) {
		queue.add(sn.right);
		System.out.println("Right: " + sn.right.s.toString());
	    }
	} while(!queue.isEmpty());
    }
    
}
