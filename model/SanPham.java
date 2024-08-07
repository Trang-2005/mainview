/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class SanPham {
    
    private String MaSP;
    private String TenSP;
    private int gia;
    private int SoLuong;
    private String nhaCC;
    private String ChatLieu;
    private String Size;
    private String MauSac;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, int gia, int SoLuong, String nhaCC, String ChatLieu, String Size, String MauSac) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.gia = gia;
        this.SoLuong = SoLuong;
        this.nhaCC = nhaCC;
        this.ChatLieu = ChatLieu;
        this.Size = Size;
        this.MauSac = MauSac;
    }

    
    
    

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

   

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", gia=" + gia + ", SoLuong=" + SoLuong + ", nhaCC=" + nhaCC + ", ChatLieu=" + ChatLieu + ", Size=" + Size + ", MauSac=" + MauSac + '}';
    }

     public Object[] toRowTable(){
        return new Object[]{
            MaSP,TenSP,gia ,SoLuong, nhaCC ,Size,ChatLieu,MauSac
        };
    }
}
