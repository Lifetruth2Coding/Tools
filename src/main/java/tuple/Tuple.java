package tuple;

/**
 * 
 * @description 元组工具类。提供1-4元元组的泛型方法
 * @version currentVersion(1.0)
 * @author zhangzheng1
 * @createtime 2017年6月12日 下午4:49:08
 */
public class Tuple {

	public static <A> OneDimTuple<A> tuple(A a) {
		return new OneDimTuple<A>(a);
	}

	public static <A, B> TwoDimTuple<A, B> tuple(A a, B b) {
		return new TwoDimTuple<A, B>(a, b);
	}

	public static <A, B, C> ThreeDimTuple<A, B, C> tuple(A a, B b, C c) {
		return new ThreeDimTuple<A, B, C>(a, b, c);
	}

	public static <A, B, C, D> FourDimTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
		return new FourDimTuple<A, B, C, D>(a, b, c, d);
	}

}
