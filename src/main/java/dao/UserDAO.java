//package dao;
//
//import entity.User;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDAO {
//    public List<User> getUsers() {
//        List<User> list = new ArrayList<>();
//
//        Connection connection = DriverManager.getConnection("jdbc::/postgresql/localhost/5432",
//                "postgres",
//                "010909");
//
//        String sql = "SELECT * from users";
//
//        try(
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            ) {
//            while (rs.next()) {
//                list.add(new User(
//                        rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getString("role")
//                ));
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        return list;
//    }
//
//    public void updateUser(User user, String username) {
//        Connection connection = DriverManager.getConnection(
//                "jdbc::postgres//localhost:5432",
//                "postgres",
//                "010909"
//        );
//
//        String sql = "UPDATE users set role = ?, set name = ? where username = ?";
//
//        try(
//            PreparedStatement ps = connection.prepareStatement(sql)
//        ) {
//            ps.setString(1, user.role);
//            ps.setString(2, user.name);
//            ps.setString(3, username);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
