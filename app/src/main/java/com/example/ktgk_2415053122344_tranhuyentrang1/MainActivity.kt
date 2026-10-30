package com.example.ktgk_2415053122344_tranhuyentrang1
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import com.example.ktgk_2415053122344_tranhuyentrang1.databinding.ActivityMainBinding
class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Trần Huyền Trang - 2415053122344 - Quản lý chi tiêu cá nhân"
        binding.btnThemKhoanChi344.setOnClickListener {
            val tenKhoanChi_344 = binding.edtTenKhoanChi344.text.toString().trim()
            val soTien_344 = binding.edtSoTien344.text.toString().trim().toDoubleOrNull()
            if (tenKhoanChi_344.isEmpty()) {
                binding.edtTenKhoanChi344.error = "Vui lòng nhập tên khoản chi"
            } else if (soTien_344 == null || soTien_344 <= 0) {
                binding.edtSoTien344.error = "Số tiền phải lớn hơn 0"
            } else {
                Toast.makeText(this, "Thêm khoản chi thành công!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnXemChiTiet344.setOnClickListener {
            val tenKhoanChi_344 = binding.edtTenKhoanChi344.text.toString().trim()
            val soTien_344 = binding.edtSoTien344.text.toString().trim().toDoubleOrNull()
            val ghiChu_344 = binding.edtGhiChu344.text.toString().trim()
        }
    }
}