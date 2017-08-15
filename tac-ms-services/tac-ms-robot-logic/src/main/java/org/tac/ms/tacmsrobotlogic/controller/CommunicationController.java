package org.tac.ms.tacmsrobotlogic.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.tac.ms.tacmscommonstartbase.dto.CommonResponse;
import org.tac.ms.tacmsrobotlogic.vo.Communication;

@RestController
@Api(value = "交流", description = "机器人交流接口")
public class CommunicationController {
    private static final Logger logger = LoggerFactory.getLogger(CommunicationController.class);

    @ApiOperation(value = "语言交流", notes = "计算", response = CommonResponse.class,consumes = "application/json")
    @ApiImplicitParams({@ApiImplicitParam(name = "communication", value = "语言交流VO", required = true, dataType = "Communication",paramType = "body")})
    @ApiResponses(value = { @ApiResponse(code = 500, message = "系统异常")
                            ,@ApiResponse(code = 200, message = "success",response = Communication.class) })
    @RequestMapping(value = "/comunicate" ,consumes = "application/json",method = {RequestMethod.POST})
    public CommonResponse comunicate(@RequestBody @Validated Communication communication, BindingResult bindingResult){
        return new CommonResponse(200, "OK", "你好!");
    }

}
