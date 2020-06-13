package com.longlvq.models;
import org.springframework.web.multipart.MultipartFile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int id;
	private String username;
	private String password;
	private String fullname;
	private int phone;
	private MultipartFile photo;
	private int rank;
	private int block_flag;
}
