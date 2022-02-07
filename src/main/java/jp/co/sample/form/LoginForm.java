package jp.co.sample.form;

public class LoginForm {
	private String mamilAddress;
	private String password;

	public String getMamilAddress() {
		return mamilAddress;
	}

	public void setMamilAddress(String mamilAddress) {
		this.mamilAddress = mamilAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [mamilAddress=" + mamilAddress + ", password=" + password + "]";
	}

}
