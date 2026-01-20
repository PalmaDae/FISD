package dao;

import entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    public List<Category> getAllCategories() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc::postgres//localhost:5432",
                "postgres", "010909"
                );
        List<Category> list = new ArrayList<>();

        String sql = "select * from categories";

        try(
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)
        ) {
            while (rs.next()) {
                list.add(
                    new Category(
                            rs.getInt("id"),
                            rs.getString("name")
                    )
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
