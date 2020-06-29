package br.unaerp.dao;

import br.unaerp.entity.Products;

import java.sql.SQLException;
import java.util.List;

public interface ProductsDAO {
    List<Products> getProducts() throws SQLException;

    void update(Products products) throws SQLException;

    void inset(Products categories) throws SQLException;

    void delete(int id) throws SQLException;

    Products getProduct(int id) throws SQLException;
}
