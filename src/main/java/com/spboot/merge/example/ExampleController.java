package com.spboot.merge.example;

import com.spboot.merge.core.exception.BaseException;
import com.spboot.merge.core.reponseDate.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExampleController
 * @description 示例
 * @author hellozhaoxudong@163.com
 * @date 2019/4/28 11:55
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api/example")
public class ExampleController {


    /**
     * responseDataExample : 示例：统一数据返回格式
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/4/28 11:57
     * @param
     * @return org.springframework.http.ResponseEntity<java.util.List<com.spboot.merge.activi.dto.AreaInfo>>
     * @since JDK 1.8
     */
    @GetMapping(value = "/responseDate")
    public ResponseData responseDataExample(){
        List<ExampleDto> returnData = new ArrayList<ExampleDto>();

        ExampleDto dto = new ExampleDto();
        dto.setExampleId(1L);
        dto.setExampleName("name1");
        returnData.add(dto);

        dto = new ExampleDto();
        dto.setExampleId(2L);
        dto.setExampleName("name2");
        returnData.add(dto);

        return new ResponseData(returnData);
    }

    /**
     * baseExceptionExample : 示例：统一异常返回
     *
     * @author xudong.zhao@hand-china.com
     * @version 1.0
     * @date 2019/4/28 14:17
     * @param
     * @return com.spboot.merge.core.reponseDate.ResponseData
     * @since JDK 1.8
     */
    @GetMapping(value = "/baseException")
    public ResponseData baseExceptionExample(){
        try{
            int a = 1/0;
            return new ResponseData(a);
        }catch (Exception e){
            throw new BaseException("0不能做被除数！", e);
        }
    }

}
