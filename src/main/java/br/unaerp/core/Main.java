package br.unaerp.core;

import br.unaerp.dao.CategoriesDAO;
import br.unaerp.dao.DAOFactory;

public class Main {
    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.SQLITE);
        assert daoFactory != null;
        CategoriesDAO categoriesDAO = daoFactory.getCategoriesDAO();
        categoriesDAO.delete(5);
    }
}
