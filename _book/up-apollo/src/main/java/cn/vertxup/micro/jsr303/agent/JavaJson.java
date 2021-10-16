package cn.vertxup.micro.jsr303.agent;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class JavaJson {

    @NotNull
    private String name;
    @Email
    private String email;
    @Min(1)
    private Integer age;
}
