package br.unaerp.dao;

public abstract class DAOFactory {
    public static final int MYSQL = 1;
    public static final int SQLITE = 2;

    public abstract CategoriesDAO getCategoriesDAO();
    public abstract ProductsDAO getProductsDAO();
    public abstract SuppliersDAO getSuppliersDAO();

    public static DAOFactory getDAOFactory(int option){
        switch (option){
            case MYSQL:
                return new MysqlDAOFactory();
            case SQLITE:
                return new SqliteDAOFactory();
            default:
                return null;
        }
    }
}
