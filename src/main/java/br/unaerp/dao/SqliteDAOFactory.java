package br.unaerp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteDAOFactory extends DAOFactory {
    public static final String DRIVER =
            "COM.cloudscape.core.RmiJdbcDriver";
    public static final String DBURL =
            "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";

    public static Connection getConnection() {
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:database.db");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public CategoriesDAO getCategoriesDAO() {
        return new CategoriesDaoImpleSqlite();
    }

    public ProductsDAO getProductsDAO() {
        return new ProductDaoImpleSqlite();
    }

    public SuppliersDAO getSuppliersDAO() {
        return new SuppliersDapImpleSqlite();
    }
}
