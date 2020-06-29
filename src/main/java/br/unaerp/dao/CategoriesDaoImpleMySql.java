package br.unaerp.dao;

import br.unaerp.entity.Categories;

import java.sql.SQLException;
import java.util.List;

public class CategoriesDaoImpleMySql implements CategoriesDAO {

    public List<Categories> getCategories() throws SQLException {
        return null;
    }

    public void insert(Categories categories) throws SQLException {

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
