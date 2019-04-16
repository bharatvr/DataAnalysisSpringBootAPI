package bsingh.data.analysis.utils;

/**
 * @author bharat
 *
 * @param <T1>
 */
public class ValueResult<T1> {

	public ValueResult() {
		setSuccess(Boolean.TRUE);
	}

	public ValueResult(T1 resource) {
		setSuccess(Boolean.TRUE);
		setResult(resource);
	}

	public ValueResult(T1 resource, boolean status) {
		setSuccess(status);
		setResult(resource);
	}

	private T1 result;
	private boolean success;

	public T1 getResult() {
		return result;
	}

	public void setResult(T1 result) {
		this.result = result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}