/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.implement;
import penjualan.entity.barang;
import penjualan.interfc.barangInterfc;
import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.interfc.barangInterfc;


public class barangImplement {
    
    public barang insert(barang o) throws SQLException{
        PreparedStatement st=koneksi.getConnection().prepareStatement("insert into baramg values(?,?,?,?)");
        st.setString(1, o.getkodeBarang());
        st.setString(2, o.getnamaBarang());
        st.setString(3, o.getJumlah()+" ");
        st.setString(4, o.getHarga()+" ");
        st.execute();
        return o;
    }
    
    public void update(barang o) throws SQLException{
        PreparedStatement st=koneksi.getConnection().prepareStatement("update barang set nama_barang=?,jumlah=?,harga=? where kode_barang=?");
        st.setString(1, o.getnamaBarang());
        st.setString(2, o.getHarga());
        st.setString(3, o.getJumlah());
        st.setString(4, o.getkodeBarang());
        st.executeUpdate();
        
    }
    
    public void delete(String kode_barang) throws SQLException{
        PreparedStatement st=koneksi.getConnection().prepareStatementStatement("delete from barang where kode_barang");
        st.setString(1, kode_barang);
        st.executeUpdate();
    }
    public List<barang> getAll() throws SqlException{
        Statement st=koneksi.getConnection().createStatement();
        Resultset rs=st.executeQuery("select * from barang");
        List<barang>list=new ArrayList<barang>();
        while(rs.next()){
            barang brg = new barang();
            brg.setkodeBarang(rs.getString ("kode_barang"));
            brg.setnamaBarang(rs.getString ("nama_barang"));
            brg.setJumlah(rs.getString ("jumlah"));
            brg.setHarga(rs.getString ("harga"));
            list.add(brg);
        }
        return list;
    }
    
}
