package com.jc.controller.sec.user;

import com.github.pagehelper.PageInfo;
import com.jc.iservice.sec.user.ISecUserService;
import com.jc.model.sec.user.SecUserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Map;

/**
 * @program: springBootDemo
 * @Date: 2018/12/7 15:02
 * @Author: LiJc
 * @Description:
 *              Swagger2
 *              @Api: 修饰整个类，描述Controller的作用
 *              @ApiOperation: 描述一个类的一个方法，或者说一个接口
 *              @ApiParam: 单个参数描述
 *              @ApiModel: 用对象来接收参数
 *              @ApiProperty: 用对象接收参数时，描述对象的一个字段
 *              @ApiResponse: HTTP响应其中1个描述
 *              @ApiResponses: HTTP响应整体描述
 *              @ApiIgnore: 使用该注解忽略这个API
 *              @ApiError: 发生错误返回的信息
 *              @ApiParamImplicitL: 一个请求参数
 *              @ApiParamsImplicit 多个请求参数
 */
@RestController //等同于同时加上了@Controller和@ResponseBody
@RequestMapping(value = "/secUser")
@Api(tags = "SecUserController", description = "用户信息相关的api")
public class SecUserController {

    @Autowired
    private ISecUserService secUserService;

    /**
     * 创建用户
     *
     * @param SecUserModel
     * @return
     */
    @PostMapping("/createUser")
    @ApiOperation(value="创建用户", notes="创建用户")
    public boolean createUser(SecUserModel SecUserModel) {
        return this.secUserService.crateUser(SecUserModel);
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/queryAllUser")
    @ApiOperation(value="查询所有用户", notes="分页查询：pageNum:开始页，pageSize:每页数")
    public PageInfo<List<SecUserModel>> queryAllUser(int pageNum, int pageSize) {
        return this.secUserService.queryAllUser(pageNum, pageSize);
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/queryAllUser1")
    @ApiOperation(value="查询所有用户")
    public List<Map<String, Object>> queryAllUser() {
        return this.secUserService.queryAllUser();
    }

    /**
     * 根据用户ID获取用户信息
     *
     * @return
     */
    @GetMapping("/getSecUserModel/{userId}")
    @ApiOperation(value="获取用户", notes="根据userId获取用户")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "String",paramType = "path")//paramType = "path" 表示参数在url上
    public SecUserModel getSecUserModel(@PathVariable String userId) {
        return this.secUserService.getSecUserModel(userId);
    }

    @RequestMapping(value = {"/hello1"}, method = RequestMethod.GET)
    @ApiIgnore//使用该注解忽略这个API
    public String say() {
        return "hi you!!!";
    }

    @GetMapping
    public String hi() {
        return "hi you!!!";
    }
}
