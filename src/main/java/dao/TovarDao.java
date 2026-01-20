package dao;

import entity.Category;
import entity.Tovar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TovarDao {
    CategoryDao categoryDao;

    public List<Tovar> getAllTovars() throws SQLException {
        List<Tovar> list = new ArrayList<>();

        List<Category> categories = categoryDao.getAllCategories();

        Connection connection = DriverManager.getConnection("jdbc::postgres//localhost:5432",
                "postgres", "010909"
        );

        String sql = "select * from tovars";

        try(
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while (rs.next()) {
                int idcat = rs.getInt("category_id");

                Category categorysome = null;

                for (Category category : categories) {
                    if (category.id == idcat) {
                        categorysome = category;
                    }
                }

                list.add(
                    new Tovar(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("cost"),
                        categorysome
                    )
                );
            }
        }

        return list;
    }
}
