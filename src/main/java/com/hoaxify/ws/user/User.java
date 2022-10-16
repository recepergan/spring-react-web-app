package com.hoaxify.ws.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity// @Table ile databasedeki tablo adını istediğimiz şekilde belirleyebiliriz
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private long id;

	private String username;
	
	private String displayName;
	
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
