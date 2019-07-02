package cn.zerohy.mp.raw.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import cn.zerohy.mp.common.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hyuan
 * @since 2019-07-02
 */
@RestController
@RequestMapping("/raw/abc-record")
public class AbcRecordController extends BaseController {

    public String test() {
        log.info("hello");
        return "";
    }

}
