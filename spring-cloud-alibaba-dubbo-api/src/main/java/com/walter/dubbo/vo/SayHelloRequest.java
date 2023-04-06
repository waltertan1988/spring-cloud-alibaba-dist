package com.walter.dubbo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Data
@Accessors(chain = true)
public class SayHelloRequest implements Serializable {

    @NotNull(message = "from cannot be null")
    @Size(min = 1, max = 255, message = "length of from should be between {min} and {max}")
    private String from;

    @NotNull(message = "to cannot be null")
    @Size(min = 1, max = 255, message = "length of to should be between {min} and {max}")
    private String to;
}
