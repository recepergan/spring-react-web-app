package com.hoaxify.ws.user;


import lombok.Data;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity// @Table ile databasedeki tablo adını istediğimiz şekilde belirleyebiliriz
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private long id;

	@NotNull
	@Size(min = 4,max = 255)
	private String username;

	@NotNull
	@Size(min = 4,max = 255)
	private String displayName;

	@NotNull
	@Size(min = 4,max = 255)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
