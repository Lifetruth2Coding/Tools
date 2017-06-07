package tuple;

public class OneTuple<A> {

	public final A first;

	public OneTuple(A first) {
		super();
		this.first = first;
	}

	@Override
	public String toString() {
		return "OneTuple [first=" + first + "]";
	}

}
