package tuple;

/**
 * 
 * @description tuple基类，用于返回多个参数
 * @version currentVersion(1.0)
 * @author zhangzheng1
 */
public class OneDimTuple<A> {

	public final A first;

	public OneDimTuple(A first) {
		super();
		this.first = first;
	}

	@Override
	public String toString() {
		return "OneTuple [first=" + first + "]";
	}

}
