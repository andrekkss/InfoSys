    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

/**
 *
 * @author linux
 */
public class ClienteDAO implements Persistencia<Cliente> {

    private static ClienteDAO dao;
    
    public ClienteDAO(){
    }
    
    public static ClienteDAO getInstance(){
        if (dao == null){
            dao = new ClienteDAO();
        }
        return dao;
    }
    
    @Override
    public int insert(Cliente obj) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        final String sql = "Insert Into Cliente (Nome,CPF,Fone,Celular,Email) Values (?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCpf());
            pst.setString(3, obj.getFone());
            pst.setString(4, obj.getCelular());
            pst.setString(5, obj.getEmail());
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return 0;
    }

    @Override
    public boolean update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> select() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Cliente>lista = new ArrayList<Cliente>();
        final String sql = "select Codigo,Nome,Cpf,Fone,Celular,Email from Cliente order by Nome";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String cpf = rs.getString(3);
                String fone = rs.getString(4);
                String celular = rs.getString(5);
                String email = rs.getString(6);
                Cliente c = new Cliente( codigo, nome, cpf, fone, celular, email);
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }

    @Override
    public Cliente findByCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
