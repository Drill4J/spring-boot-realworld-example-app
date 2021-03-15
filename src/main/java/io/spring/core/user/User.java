package io.spring.core.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class User {
	private String id;
	private String email;
	private String username;
	private String password;
	private String bio;
	private String image;
	private String phone;

	public User(String email, String username, String password, String bio, String image) {
		this.id = UUID.randomUUID().toString();
		this.email = email;
		this.username = username;
		this.password = password;
		this.bio = bio;
		this.image = image;
		this.phone = "";
	}

	public void update(String email, String username, String password, String bio, String image, String phone) {
		if (!"".equals(email)) {
			this.email = email;
		}

		if (!"".equals(username)) {
			this.username = username;
		}

		if (!"".equals(password)) {
			this.password = password;
		}

		if (!"".equals(bio)) {
			this.bio = bio;
		}

		if (!"".equals(image)) {
			this.image = image;
		}

		if (!"".equals(phone)) {
			this.phone = phone;
		}
	}
}
