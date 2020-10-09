package mall.dto;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * code : 200
 * message : 操作成功
 * data : {"tokenHead":"Bearer","token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE2MDExNzU1MTQzMzIsImV4cCI6MTYwMTc4MDMxNH0.V7sicTWS8A2SGPlks9E8qkSebH55H7W0AKokXiBLeJ-ZGrfz4WpfgPmHYwpAZaqfe9vNG0TT8qd8KtKsxoBMkg"}
 */
public class Message {

  private int code;
  private String message;
  private Object data;


  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static Message success(String msg, Object data) {
    Message message = success(msg);
    message.setData(data);
    return message;
  }

  public static Message success(String msg) {
    Message message = new Message();
    message.setCode(200);
    message.setMessage(msg);
    return message;
  }

  public static Message fail(Integer code, String msg) {
    Message message = new Message();
    message.setCode(code);
    message.setMessage(msg);
    return message;
  }

  public static Message fail(Integer code, String msg, List<?> data) {
    Message message = fail(code, msg);
    message.setData(data);
    return message;
  }

  @Override
  public String toString() {
    return "Message{" +
            "code=" + code +
            ", message='" + message + '\'' +
            ", data=" + data +
            '}';
  }

//  public static Message success() {
//    Message message = new Message();
//    message.put("code", 200);
//    message.put("message", "操作成功");
////    message.put("tokenHead", "Bearer");
////    message.put("token",
////            "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE2MDExNzU1MTQzMzIsImV4cCI6MTYwMTc4MDMxNH0.V7sicTWS8A2SGPlks9E8qkSebH55H7W0AKokXiBLeJ-ZGrfz4WpfgPmHYwpAZaqfe9vNG0TT8qd8KtKsxoBMkg")
//    return message;
//  }
//
//
//  public static Message loginSuccess() {
//    Message message = new Message();
//    message.put("code", 200);
//    message.put("message", "操作成功");
//    message.put("tokenHead", "Bearer");
//    message.put("token",
//            "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE2MDExNzU1MTQzMzIsImV4cCI6MTYwMTc4MDMxNH0.V7sicTWS8A2SGPlks9E8qkSebH55H7W0AKokXiBLeJ-ZGrfz4WpfgPmHYwpAZaqfe9vNG0TT8qd8KtKsxoBMkg");
//    return message;
//  }
//
//  public static Message success(List<?> data) {
//    Message message = new Message();
//    message.put("data", data);
//    return message;
//  }
//
//  public static Message fail() {
//    Message message = new Message();
//    message.put("code", 404);
//    message.put("message", "操作失败");
//    return message;
//  }


}