package modelattribute_demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NameInfoDTO {
	// Provided some static values
	// inside the variable
	// And we are going to read these values
	private String lastName = "홍";
	private String firstName = "길동";

	@Override
	public String toString() {
		return "NameInfoDTO [성씨=" + lastName + ", 이름=" + firstName + "]";
	}

}
