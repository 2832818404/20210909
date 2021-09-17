import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author hongxiaozheng
 * @date 2021/9/9 8:25
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01", "root", "001120");
        // 3创建状态
        Statement statement =  connection.createStatement();
        // 4执行查询
        String sql = "insert into book values (6 ,'查寝风暴','张美玉',999 )";//增
        String sql2 = "delete from book where author = '张美玉'";//删
        String sql3 = "update book set name = '《大碗牢饭》' where author = '签儿'";//改
        int reslut = statement.executeUpdate(sql3);//查
        // 5获取结果并遍历
        if (reslut != -1){
            System.out.println("执行成功");
        }else {
            System.out.println("执行失败");
        }
        // 6关闭资源
    }
}
