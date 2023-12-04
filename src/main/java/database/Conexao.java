/*
 * The MIT License
 *
 * Copyright 2023 Davidson Teixeira Filho.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe que faz a conexão com o banco de dados local
 */
public class Conexao {

    /**
     * Método que efetua a conexão com o banco de dados
     *
     * @return conexao
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciamento_caixa", "root", "");
            return conexao;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }
}
