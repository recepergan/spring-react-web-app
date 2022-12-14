package com.hoaxify.ws.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.hoaxify.ws.shared.Views;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity// @Table ile databasedeki tablo adını istediğimiz şekilde belirleyebiliriz
@Table(name="users")
public class User {


	@Id
	@GeneratedValue
	private long id;

	@NotNull(message = "{hoaxify.constraint.username.NotNull.message}")
	@Size(min = 4,max = 255)
	@UniqueUserName
	@JsonView(Views.Base.class)
	private String username;

	@NotNull
	@Size(min = 4,max = 255)
	@JsonView(Views.Base.class)
	private String displayName;

	@NotNull
	@Size(min = 4,max = 255)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$",message="{hoaxify.constrain.password.Pattern.message}")
	@JsonView(Views.Sensitive.class)
	private String password;

	@JsonView(Views.Base.class)
	private String image;



}
