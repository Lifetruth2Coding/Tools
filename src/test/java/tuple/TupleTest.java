package tuple;

public class TupleTest {

	public static void main(String[] args) {
		System.out.println(oneTupleTest().toString());
		System.out.println(twoTupleTest().toString());
	}

	public static OneDimTuple<Integer> oneTupleTest() {
		return new OneDimTuple<Integer>(1);
	}

	public static TwoDimTuple<String, Double> twoTupleTest() {
		return new TwoDimTuple<String, Double>("2", 2.2);
	}
}
