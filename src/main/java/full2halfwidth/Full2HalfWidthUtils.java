package full2halfwidth;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * 
 * @description 全角转半角(只转符号,不转汉字)
 * @author LT2C
 * @createtime 2018年1月4日 下午4:04:41
 */
public class Full2HalfWidthUtils {

	private static final String FULL_WIDTH_REGEX = "[^\\x00-\\xff]";
	private static final String HAN_REGEX = "[\\p{IsHan}]";
	private static final char FULL_WIDTH_SPACE = '　';
	private static final int FULL_HALF_OFFSET = 65248;

	public static Boolean isFullWidth(char c) {
		String temp = String.valueOf(c);
		if (temp.matches(FULL_WIDTH_REGEX)) {
			return true;
		}
		return false;
	}

	public static Boolean isAllFullWidth(String input) {
		if (isEmpty(input)) {
			return false;
		}
		char[] array = input.toCharArray();
		for (int idx = 0, len = array.length; idx < len; idx++) {
			if (!isFullWidth(array[idx])) {
				return false;
			}
		}
		return true;
	}

	public static Boolean isContainsFullWidth(String input) {
		if (isEmpty(input)) {
			return false;
		}
		char[] array = input.toCharArray();
		for (int idx = 0, len = array.length; idx < len; idx++) {
			if (isFullWidth(array[idx])) {
				return true;
			}
		}
		return false;
	}

	public static char full2HalfWidth(char c) {
		String temp = String.valueOf(c);
		if (temp.matches(FULL_WIDTH_REGEX)) {
			if (c == FULL_WIDTH_SPACE) {
				return ' ';
			} else {
				if (temp.matches(HAN_REGEX)) {
					return c;
				}
				return (char) (c - FULL_HALF_OFFSET);
			}
		} else {
			return c;
		}
	}

	public static String full2HalfWidth(String fullWidthInput) {
		if (isEmpty(fullWidthInput)) {
			return null;
		}
		char[] array = fullWidthInput.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int idx = 0, len = array.length; idx < len; idx++) {
			if (isFullWidth(array[idx])) {
				sb.append(full2HalfWidth(array[idx]));
			} else {
				sb.append(array[idx]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(full2HalfWidth("天空２　０００qgc４１５wx3fs２２８４＠＃＄％２４"));
	}
}
