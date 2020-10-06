package mall.controller;

import mall.dto.Data;
import mall.dto.Message;
import mall.dto.TokenMsg;
import mall.entity.Admin;
import mall.entity.PasswordParam;
import mall.service.AdminRoleRelationService;
import mall.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class AdminController {

  @Autowired
  private AdminService adminService;

  @Autowired
  private AdminRoleRelationService adminRoleRelationService;

  @RequestMapping("/admin/login")
  @ResponseBody
  public Message adminLogin(@RequestBody Admin login) {
    System.out.println(login);
    Admin admin = adminService.adminLogin(login);
    System.out.println(admin);
    if (admin != null) {
      adminService.updateAdminLoginTime(admin);
      TokenMsg tokenMsg = new TokenMsg();
      tokenMsg.setToken(
              "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE2MDExNzU1MTQzMzIsImV4cCI6MTYwMTc4MDMxNH0.V7sicTWS8A2SGPlks9E8qkSebH55H7W0AKokXiBLeJ-ZGrfz4WpfgPmHYwpAZaqfe9vNG0TT8qd8KtKsxoBMkg");
      tokenMsg.setTokenHead("Bearer");
      return Message.success("登录成功", tokenMsg);
    } else {
      return Message.fail(400, "没有该用户");
    }
  }

  @RequestMapping("/admin/info")
  @ResponseBody
  public String adminInfo() {
    return ("{\"code\":200,\"message\":\"操作成功\",\"data\":{\"roles\":[\"TEST\"],\"icon\":\"http://minio.banyuan.club/dev/preset/timg.jpg\",\"menus\":[{\"id\":1,\"parentId\":0,\"createTime\":\"2020-02-02T06:50:36.000+0000\",\"title\":\"商品\",\"level\":0,\"sort\":0,\"name\":\"pms\",\"icon\":\"product\",\"hidden\":0},{\"id\":2,\"parentId\":1,\"createTime\":\"2020-02-02T06:51:50.000+0000\",\"title\":\"商品列表\",\"level\":1,\"sort\":0,\"name\":\"product\",\"icon\":\"product-list\",\"hidden\":0},{\"id\":3,\"parentId\":1,\"createTime\":\"2020-02-02T06:52:44.000+0000\",\"title\":\"添加商品\",\"level\":1,\"sort\":0,\"name\":\"addProduct\",\"icon\":\"product-add\",\"hidden\":0},{\"id\":4,\"parentId\":1,\"createTime\":\"2020-02-02T06:53:51.000+0000\",\"title\":\"商品分类\",\"level\":1,\"sort\":0,\"name\":\"productCate\",\"icon\":\"product-cate\",\"hidden\":0},{\"id\":5,\"parentId\":1,\"createTime\":\"2020-02-02T06:54:51.000+0000\",\"title\":\"商品类型\",\"level\":1,\"sort\":0,\"name\":\"productAttr\",\"icon\":\"product-attr\",\"hidden\":0},{\"id\":6,\"parentId\":1,\"createTime\":\"2020-02-02T06:56:29.000+0000\",\"title\":\"品牌管理\",\"level\":1,\"sort\":0,\"name\":\"brand\",\"icon\":\"product-brand\",\"hidden\":0},{\"id\":7,\"parentId\":0,\"createTime\":\"2020-02-02T08:54:07.000+0000\",\"title\":\"订单\",\"level\":0,\"sort\":0,\"name\":\"oms\",\"icon\":\"order\",\"hidden\":0},{\"id\":8,\"parentId\":7,\"createTime\":\"2020-02-02T08:55:18.000+0000\",\"title\":\"订单列表\",\"level\":1,\"sort\":0,\"name\":\"order\",\"icon\":\"product-list\",\"hidden\":0},{\"id\":9,\"parentId\":7,\"createTime\":\"2020-02-02T08:56:46.000+0000\",\"title\":\"订单设置\",\"level\":1,\"sort\":0,\"name\":\"orderSetting\",\"icon\":\"order-setting\",\"hidden\":0},{\"id\":10,\"parentId\":7,\"createTime\":\"2020-02-02T08:57:39.000+0000\",\"title\":\"退货申请处理\",\"level\":1,\"sort\":0,\"name\":\"returnApply\",\"icon\":\"order-return\",\"hidden\":0},{\"id\":11,\"parentId\":7,\"createTime\":\"2020-02-02T08:59:40.000+0000\",\"title\":\"退货原因设置\",\"level\":1,\"sort\":0,\"name\":\"returnReason\",\"icon\":\"order-return-reason\",\"hidden\":0},{\"id\":12,\"parentId\":0,\"createTime\":\"2020-02-04T08:18:00.000+0000\",\"title\":\"营销\",\"level\":0,\"sort\":0,\"name\":\"sms\",\"icon\":\"sms\",\"hidden\":0},{\"id\":13,\"parentId\":12,\"createTime\":\"2020-02-04T08:19:22.000+0000\",\"title\":\"秒杀活动列表\",\"level\":1,\"sort\":0,\"name\":\"flash\",\"icon\":\"sms-flash\",\"hidden\":0},{\"id\":14,\"parentId\":12,\"createTime\":\"2020-02-04T08:20:16.000+0000\",\"title\":\"优惠券列表\",\"level\":1,\"sort\":0,\"name\":\"coupon\",\"icon\":\"sms-coupon\",\"hidden\":0},{\"id\":16,\"parentId\":12,\"createTime\":\"2020-02-07T08:22:38.000+0000\",\"title\":\"品牌推荐\",\"level\":1,\"sort\":0,\"name\":\"homeBrand\",\"icon\":\"product-brand\",\"hidden\":0},{\"id\":17,\"parentId\":12,\"createTime\":\"2020-02-07T08:23:14.000+0000\",\"title\":\"新品推荐\",\"level\":1,\"sort\":0,\"name\":\"homeNew\",\"icon\":\"sms-new\",\"hidden\":0},{\"id\":18,\"parentId\":12,\"createTime\":\"2020-02-07T08:26:38.000+0000\",\"title\":\"人气推荐\",\"level\":1,\"sort\":0,\"name\":\"homeHot\",\"icon\":\"sms-hot\",\"hidden\":0},{\"id\":19,\"parentId\":12,\"createTime\":\"2020-02-07T08:28:16.000+0000\",\"title\":\"专题推荐\",\"level\":1,\"sort\":0,\"name\":\"homeSubject\",\"icon\":\"sms-subject\",\"hidden\":0},{\"id\":20,\"parentId\":12,\"createTime\":\"2020-02-07T08:28:42.000+0000\",\"title\":\"广告列表\",\"level\":1,\"sort\":0,\"name\":\"homeAdvertise\",\"icon\":\"sms-ad\",\"hidden\":0},{\"id\":21,\"parentId\":0,\"createTime\":\"2020-02-07T08:29:13.000+0000\",\"title\":\"权限\",\"level\":0,\"sort\":0,\"name\":\"ums\",\"icon\":\"ums\",\"hidden\":0},{\"id\":22,\"parentId\":21,\"createTime\":\"2020-02-07T08:29:51.000+0000\",\"title\":\"用户列表\",\"level\":1,\"sort\":0,\"name\":\"admin\",\"icon\":\"ums-admin\",\"hidden\":0},{\"id\":23,\"parentId\":21,\"createTime\":\"2020-02-07T08:30:13.000+0000\",\"title\":\"角色列表\",\"level\":1,\"sort\":0,\"name\":\"role\",\"icon\":\"ums-role\",\"hidden\":0},{\"id\":24,\"parentId\":21,\"createTime\":\"2020-02-07T08:30:53.000+0000\",\"title\":\"菜单列表\",\"level\":1,\"sort\":0,\"name\":\"menu\",\"icon\":\"ums-menu\",\"hidden\":0},{\"id\":25,\"parentId\":21,\"createTime\":\"2020-02-07T08:31:13.000+0000\",\"title\":\"资源列表\",\"level\":1,\"sort\":0,\"name\":\"resource\",\"icon\":\"ums-resource\",\"hidden\":0}],\"username\":\"admin\"}}");
  }

  @RequestMapping("/admin/list")
  @ResponseBody
  public Message getAdminListByKeyword(String keyword, Integer pageSize, Integer pageNum) {
    List<Admin> adminList = adminService.getAdminListByKeyword(keyword, pageSize, pageNum);
    int total =adminService.getAdminList().size();
    int totalPage = (adminList.size() / pageSize) + 1;
    Data data = Data.data(adminList, pageNum, pageSize, total, totalPage);
    return Message.success("操作成功", data);
  }

  @RequestMapping("/admin/logout")
  @ResponseBody
  public Message adminLogout() {
    return Message.success("退出成功");
  }

  @RequestMapping("/admin/register")
  @ResponseBody
  public Message registerAdmin(@RequestBody Admin admin) {
    Admin checkAdmin = adminService.selectAdminByUsername(admin.getUsername());
    if (checkAdmin == null) {
      adminService.registerAdmin(admin);
      return Message.success("添加成功", admin);
    } else {
      return Message.fail(201, "用户名已存在");
    }
  }

  @RequestMapping("/admin/update/{id}")
  @ResponseBody
  public Message updateAdmin(@PathVariable("id") long id, @RequestBody Admin admin) {
    adminService.updateAdmin(id, admin);
    return Message.success("更新成功");
  }

  @RequestMapping("/admin/role/{adminId}")
  @ResponseBody
  public Message getAdminById(@PathVariable("adminId") Long adminId) {
    Admin adminById = adminService.getAdminById(adminId);
    return Message.success("操作成功", adminById);
  }

  @RequestMapping("/admin/role/update")
  @ResponseBody
  public Message adminUpdateRole(Long adminId, Long[] roleIds) {
    for (Long roleId : roleIds) {
      adminRoleRelationService.insertAdminRoleRelation(adminId, roleId);
    }
    return Message.success("操作成功");
  }

  @RequestMapping("/admin/delete/{id}")
  @ResponseBody
  public Message deleteAdmin(@PathVariable("id") Long id) {
    adminService.deleteAdminById(id);
    adminRoleRelationService.deleteRelationByAdminId(id);
    return Message.success("删除成功");
  }

  @RequestMapping("/admin/{id}")
  @ResponseBody
  public Message getAdminByFrontId(@PathVariable("id") Long id) {
    adminService.getAdminById(id);
    return Message.success("操作成功");
  }

  @RequestMapping("/admin/updatePassword")
  @ResponseBody
  public Message updatePasswordParam(@RequestBody PasswordParam passwordParam) {
    Admin admin = adminService.selectAdminByUsername(passwordParam.getUsername());
    if (admin.getPassword().equals(passwordParam.getOldPassword())) {
      return Message.fail(201, "新密码不能与原密码相同");
    } else {
      return Message.success("操作成功");
    }
  }

  // TODO: +-权限
  @RequestMapping("/admin/permission/{adminId}")
  @ResponseBody
  public Message permission(@PathVariable("adminId") Long adminId) {

    return Message.success("操作成功");
  }

  // TODO: 更新权限
  @RequestMapping("/admin/permission/update")
  @ResponseBody
  public Message updatePermission(Long adminId, Long[] permissionIds) {

    return Message.success("修改成功");
  }


}

