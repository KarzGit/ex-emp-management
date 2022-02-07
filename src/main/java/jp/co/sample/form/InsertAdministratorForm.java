package jp.co.sample.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InsertAdministratorForm {
	@NotBlank(message="名前を入力してください")
	private String name;
	@Email(message="メールアドレスの形式が不正です")
	@NotBlank(message="メールアドレスは必須です")
	private String mailAddress;
	@Size(min=4, max=200, message="パスワードは４文字以上２００文字以内で入力してください")
	@NotBlank(message="パスワードは必須です")
	private String password;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
