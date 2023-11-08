/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenc;

import DAO.ClienteDAO;

/**
 *
 * @author Davidson
 */
public class Gerenc {

    public static void main(String[] args) throws Exception {
        ClienteDAO dao = new ClienteDAO();
        System.out.println(dao.getID("davidson"));
    }
}
