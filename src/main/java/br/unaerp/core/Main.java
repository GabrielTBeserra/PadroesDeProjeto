package br.unaerp.core;

import br.unaerp.dao.CategoriesDAO;
import br.unaerp.dao.DAOFactory;
import br.unaerp.dao.ProductsDAO;
import br.unaerp.dao.SuppliersDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        assert daoFactory != null;
        CategoriesDAO categoriesDAO = daoFactory.getCategoriesDAO();
        SuppliersDAO suppliersDAO = daoFactory.getSuppliersDAO();
        ProductsDAO productsDAO = daoFactory.getProductsDAO();
    }
}
