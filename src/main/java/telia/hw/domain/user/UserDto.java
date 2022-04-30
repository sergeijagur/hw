package telia.hw.domain.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String password;
}
