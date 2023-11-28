package model;

/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */
import DAO.ClienteDAO;

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String codCliente;
    private String tipoCliente;
    private String contato;

    ClienteDAO dao = new ClienteDAO();

    // SETTERS
    public void setID(int ID) {
        this.id = ID;
    }
    public void setNome(String name) {
        this.nome = name;
    }
    public void setIdade(int age) {
        this.idade = age;
    }
    public void setCodCliente(String codeCli) {
        this.codCliente = codeCli;
    }
    public void setTipoCliente(String typeCli) {
        this.tipoCliente = typeCli;
    }
    public void setContato(String phone) {
        this.contato = phone;
    }
    
    // GETTERS
    public int getID() {
        return this.id;
    }
    public String setNome() {
        return this.nome;
    }
    public int setIdade() {
        return this.idade;
    }
    public String setCodCliente() {
        return this.codCliente;
    }
    public String setTipoCliente() {
        return this.tipoCliente;
    }
    public String setContato() {
        return this.contato;
    }

    //  MÉTODO PARA CRIAÇÃO DE UM OBJETO COM AS INFORMAÇÕES DO CLIENTE
    public void cadastrar(String name, int age, String typeCliente, String codigo, String telefone) throws Exception {
        this.nome = name;
        this.idade = age;
        this.codCliente = codigo;
        this.tipoCliente = typeCliente;
        this.contato = telefone;

        dao.cadastrar(name, age, typeCliente, codigo, telefone);
    }

}
