package projeto.loginSpringBoot.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty(message = "O campo EMAIL não pode ser vazio!")
    @Email
    private String email;
    @NotEmpty(message = "o campo SENHA não pode ser vazio!")
    private String password;
}
