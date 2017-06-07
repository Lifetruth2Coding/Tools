package tuple;

public class ThreeDimTuple<A, B, C> extends TwoDimTuple<A, B> {

	public final C third;

	public ThreeDimTuple(A first, B second, C third) {
		super(first, second);
		this.third = third;
	}

	@Override
	public String toString() {
		return "ThreeTuple [third=" + third + ", second=" + second + ", first=" + first + "]";
	}

}
