package com.walter.dubbo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author think
 * @date 2022/1/29
 *
 */
@Data
@Accessors(chain = true)
public class SayHelloRequest implements Serializable {

    private String from;

    private String to;
}
