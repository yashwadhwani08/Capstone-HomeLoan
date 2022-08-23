
package com.barclays.homeloan.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Column(name="loginId")
	private String loginId;
	
	@Column(name="password")
	private String password;
	
	public User() {};

	public User(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}


	public String getloginId() {
		return loginId;
	}

	public void setId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(loginId, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(loginId, other.loginId) && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", password=" + password + "]";
	}

}
