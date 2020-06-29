package br.unaerp.dao;

import br.unaerp.entity.Categories;

import java.sql.SQLException;
import java.util.List;

public interface CategoriesDAO {
    List<Categories> getCategories() throws SQLException;

    void insert(Categories categories) throws SQLException;

    void update(Categories categories) throws SQLException;

    void delete(int id) throws SQLException;

    Categories show(int id) throws SQLException;
}
