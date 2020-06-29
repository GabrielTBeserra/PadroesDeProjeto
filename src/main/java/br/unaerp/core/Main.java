package br.unaerp.core;

import br.unaerp.dao.CategoriesDAO;
import br.unaerp.dao.DAOFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        assert daoFactory != null;
        CategoriesDAO categoriesDAO = daoFactory.getCategoriesDAO();
        categoriesDAO.delete(5);
    }
}
