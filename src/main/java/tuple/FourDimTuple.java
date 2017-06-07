package tuple;

public class FourDimTuple<A, B, C, D> extends ThreeDimTuple<A, B, C> {

	public final D fourth;

	public FourDimTuple(A first, B second, C third, D fourth) {
		super(first, second, third);
		this.fourth = fourth;
	}

	@Override
	public String toString() {
		return "FourDimTuple [fourth=" + fourth + ", third=" + third + ", second=" + second + ", first=" + first + "]";
	}

}
