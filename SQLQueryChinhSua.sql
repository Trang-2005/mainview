  -- Nhân Viên
select*from NhanVien

-- Thêm cột mới
ALTER TABLE NhanVien
ADD COLUMN GioiTinh INT,
ADD COLUMN TrangThai INT,
ADD COLUMN DiaChi VARCHAR(250);

-- Sửa kiểu dữ liệu
ALTER TABLE NhanVien
ALTER COLUMN ChucVu int;


insert into NhanVien
(MaNV, HoTen, ChucVu, Email, SDT, GioiTinh, TrangThai, DiaChi)
values('NV001', 'Nguyen Van A', 1, 'nguyenvana@gmail.com', '0987654321', 1, 1, 'HaNoi'),
      ('NV002', 'Nguyen Thi C', 0, 'nguyenthic@gmail.com', '098123564', 0, 0, 'CanTho'),
	  ('NV003', 'Hoang Thi Hoa', 0, 'hoangthihoa@gmail.com', '09999665',0, 1, 'HaNoi'),
	  ('NV004', 'Tran Van Dung', 0, 'tranvandung@gmail.com', '09989665',0, 1, 'HaNoi'),
    
	



--Khách hàng

--đổi tên cột
 sp_rename 'KhachHang.EmailChinh', 'Email', 'COLUMN';
 sp_rename 'KhachHang.SDTChinh', 'SDT', 'COLUMN';

 select *from KhachHang

 insert into KhachHang(MaKH, HoTen, SDT, Email)
 values ('KH001', 'Nguyen Thu Ha', '011234357', 'nguyenthuha@gmail.com'),
        ('KH002', 'Tran Van Hung', '098789800', 'tranvanhung@gmail.com'),
		('KH003', 'Hoang Tien Long', '09343543', 'hoangtienlong@gmail.com')




--Sản phẩm
--đổi tên
sp_rename 'SanPham.MaChatLieu', 'ChatLieu', 'COLUMN';



drop table ChatLieuSP
drop table SanPham
drop table NhaCungCap
drop table ChiTietSanPham


create table SanPham(
    MaSP NVARCHAR(10) PRIMARY KEY,
	TenSP  NVARCHAR(50) NOT NULL,
    Gia DECIMAL(10,2)  NOT NULL,
	SoLuong INT NOT NULL,
    NhaCC NVARCHAR(200),
    MauSac NVARCHAR(50),
    ChatLieu NVARCHAR(10),
    Size NVARCHAR(10),
	
);








