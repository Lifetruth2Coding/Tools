package retry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 重试模板，适用于重试调用接口，请求外部资源等场景
 * 
 * @description
 * @author zhangzheng1
 * @createtime 2018年1月12日 下午6:47:13
 */
public abstract class RetryTemplate {

	public void handler(int retryTimes, List<Class<? extends Exception>> retryExpClazz) {
		if (retryTimes <= 0) {
			return;
		}
		for (int idx = 0; idx < retryTimes; idx++) {
			try {
				execute();
			} catch (Exception e) {
				if (retryExpClazz != null && retryExpClazz.size() > 0) {
					Class<? extends Exception> clazz = e.getClass();
					Iterator<Class<? extends Exception>> iterator = retryExpClazz.iterator();
					boolean find = false;
					while (iterator.hasNext()) {
						String clazzName = iterator.next().getName();
						if (StringUtils.equals(clazzName, clazz.getName())) {
							find = true;
							break;
						}
					}
					if (find) {
						continue;
					} else {
						break;
					}
				} else {
					continue;
				}
			}
		}
	}

	protected abstract void execute();

	public static void main(String[] args) {
		List<Class<? extends Exception>> clazzes = new ArrayList<>();
		clazzes.add(RuntimeException.class);
		new RetryTemplate() {

			@Override
			protected void execute() {
				System.out.println("execute");
				throw new RuntimeException();
			}
		}.handler(5, clazzes);
	}
}
