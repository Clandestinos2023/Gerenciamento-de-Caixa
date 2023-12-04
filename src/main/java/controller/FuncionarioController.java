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
package controller;

import model.Funcionario;

/**
 *
 * @author Davidson
 * @since 11/2023
 *
 * Classe chamada na view para dar inicio ao objeto Funcionario
 */
public class FuncionarioController {

    /**
     * Objeto referente a classe Funcionario a qual possui a parametrização do
     * funcionario
     */
    Funcionario model = new Funcionario();

    /**
     * Método para criação de um controller com as informações do funcionário
     *
     * @param name
     * @param user
     * @param pass
     * @param confirmPass
     * @param phone
     * @param mail
     * @param sex
     * @param CPF
     * @throws Exception
     */
    public void cadastrar(String name, String user, String pass, String confirmPass,
            String phone, String mail, String sex, String CPF) throws Exception {
        model.cadastrar(name, user, pass, confirmPass, phone, mail, sex, CPF);
    }

}
