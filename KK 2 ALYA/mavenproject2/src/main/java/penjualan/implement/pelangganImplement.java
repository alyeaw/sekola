/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.implement;

import penjualan.entity.pelanggan;
import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.interfc.barangInterfc;

public class pelangganImplement implements pelangganinterfc {
    
    public pelanggan insert(pelanggan o) throws SQLException{
        PreparedStatement st=koneksi.getConnection().preparedStatement("insert into pelanggan values(?,?,?,?,?)");
        st.setString(1,o.getIdPelanggan());
        st.setString(2,o.getNama());
        st.setString(3,o.getJenikel());
        st.setString(4, o.getAlamat());
        st.setString(5,o.getNotlp());
        st.executeUpdate();
        return o;
    }
    
    public void update(pelanggan o) throws SQLException{
        PreparedStatement st=koneksi.getConnection().preparedStatement("update pelanggan set nama=?,jk=?,alamat=?,notelp=? where id_pelanggan=?");
        st.setString(1, o.getNama());
        st.setString(2, o.getJeniskel());
        st.setString(3, o.getAlamat());
        st.setString(4,o.getNotlp());
        st.setString(5, o.getIdPelanggan());
    }
    
    public void delete(String id_pelanggan) throws SQLException {
        PreparedStatement st=koneksi.getConnection().prepareStatement("delete from pelanggan where id_pelanggan=?");
        st.setString(1,id_pelanggan);
        st.executeUpdate();
    }
    
    public List<pelanggan> getAll() throws SQLException{
        Statement st=koneksi.getConnection().createStetament();
        Resultset rs=st.executeQuery("select * from pelanggan");
        List<pelanggan>list=new ArrayList<pelanggan>();
        while(rs.next()){
            pelanggan plg=new pelanggan();
            plg.setIdPelanggan(rs.getString("id_pelanggan"));
            plg.setNama(rs.getString("nama"));
            plg.setJeniskel(rs.getString("jk"));
            plg.setAlamat(rs.getStriing("alamat"));
            plg.setNotlp(rs.getString("notelp"));
            list.add(plg);
        }
        return list;
        
    }
    
}
