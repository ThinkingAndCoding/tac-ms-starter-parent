package org.tac.ms.tacmsrobotlogic.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel(value = "Communication", description = "交流VO")
public class Communication implements Serializable {
    @Getter
    @Setter
    @NotNull(message="信息不能为空")
    @ApiModelProperty(value = "信息")
    private String message;

}
