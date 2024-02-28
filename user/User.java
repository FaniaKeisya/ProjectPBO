/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user;

/**
 *
 * @author SMK TELKOM 13
 */
public interface User {
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
 
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}
