/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum4;

/**
 *
 * @author seekers
 */
public class Data {
 private String nama;
 private String alamat;
 private String no_hp;
 private String email;

public Data(String a, String b, String c, String d){
    this.nama = nama;
    this.alamat = alamat;
    this.email =  email;
    this.no_hp = no_hp;
}
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
 
}
