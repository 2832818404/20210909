import java.sql.*;

/**
 * @author hongxiaozheng
 * @date 2021/9/9 8:25
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01", "root", "001120");
        // 3 创建状态   预编译  防止SQL注入，避免黑客攻击
        PreparedStatement preparedStatement = connection.prepareStatement("insert into book(`name`,author,prices) values (?,?,?)");
        // 4执行查询
        preparedStatement.setString(1,"东北军阀");
        preparedStatement.setString(2,"黑龙江职业技术学院学生部");
        preparedStatement.setInt(3,9999);
        boolean reslut = false;
        reslut =preparedStatement.execute();
        // 5获取结果并遍历
      /*  if (reslut != -1){
            System.out.println("执行成功");
        }else {
            System.out.println("执行失败");
        }*/
        // 6关闭资源
        preparedStatement.close();
        connection.close();
    }
}
