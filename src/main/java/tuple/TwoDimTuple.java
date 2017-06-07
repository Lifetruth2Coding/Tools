package tuple;

public class TwoDimTuple<A, B> extends OneDimTuple<A> {

	public final B second;

	public TwoDimTuple(A first, B second) {
		super(first);
		this.second = second;
	}

	@Override
	public String toString() {
		return "TwoTuple [second=" + second + ", first=" + first + "]";
	}

}
