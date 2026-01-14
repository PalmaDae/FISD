package dao;

//Написать метод для загрузки книги в БД;
//сущность книги содержит инфу о числе страниц, названии,
//а также содержит внешний ключ, ссылающийся на таблицу с авторами

import entity.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {

    public void saveBook(String title, String cntPages, String authorId) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/books",
                    "postgres",
                    "010909");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String sql = "insert into books (title, cntPages, author_id) values (?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, title);
            ps.setInt(2, Integer.parseInt(cntPages));
            ps.setInt(3, Integer.parseInt(authorId));
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
