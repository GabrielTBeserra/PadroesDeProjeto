package br.unaerp.dao;

import java.sql.Connection;

public class MysqlDAOFactory extends DAOFactory {
    public static Connection createConnection() {
        return null;
    }

    public CategoriesDAO getCategoriesDAO() {
        return new CategoriesDaoImpleMySql();
    }

    public ProductsDAO getProductsDAO() {
        return new ProductDaoImpleMySql();
    }

    public SuppliersDAO getSuppliersDAO() {
        return new SuppliersDapImpleMySql();
    }
}
