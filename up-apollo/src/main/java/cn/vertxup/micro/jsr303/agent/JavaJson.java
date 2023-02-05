package cn.vertxup.micro.jsr303.agent;

import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Data
public class JavaJson {

    @NotNull
    private String name;
    @Email
    private String email;
    @Min(1)
    private Integer age;
}
