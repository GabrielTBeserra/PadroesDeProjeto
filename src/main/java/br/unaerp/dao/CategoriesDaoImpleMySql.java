package br.unaerp.dao;

import br.unaerp.entity.Categories;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CategoriesDaoImpleMySql implements CategoriesDAO {

    public List<Categories> getCategories() throws SQLException {
        return null;
    }

    public void insert(Categories categories) throws SQLException {
        String query = "insert into categories (categories_id , category_name , description , piscture) value (? , ? , ? , ?)";

        PreparedStatement preparedStatement = MYSQLDAOFactory.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, categories.getCategoryId());
        preparedStatement.setString(2, categories.getCategoryName());
        preparedStatement.setString(3, categories.getDescription());
        preparedStatement.setString(4, categories.getPicture());

        preparedStatement.execute();

    }

    public void update(Categories categories) throws SQLException {

    }

    public void delete(int id) throws SQLException {
        System.out.println("mysql " + id);
    }

    public Categories show(int id) throws SQLException {
        return null;
    }
}
