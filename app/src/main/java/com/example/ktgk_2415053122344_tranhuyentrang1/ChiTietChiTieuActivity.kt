package com.example.ktgk_2415053122344_tranhuyentrang1
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.ktgk_2415053122344_tranhuyentrang1.databinding.ActivityChiTietChiTieuBinding
import com.example.ktgk_2415053122344_tranhuyentrang1.databinding.ActivityMainBinding

class ChiTietChiTieuActivity : Activity() {
    private lateinit var binding: ActivityChiTietChiTieuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChiTietChiTieuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Chi tiết khoản chi"
            val tenKhoanChi_344 = intent.getStringExtra("TEN_KHOAN_CHI")
            val soTien_344 = intent.getDoubleExtra("SO_TIEN", -1.0)
            val ghiChu_344 = intent.getStringExtra("GHI_CHU") ?: ""
            if (tenKhoanChi_344.isNullOrBlank() || !soTien_344.isFinite() || soTien_344 <= 0) {
                Toast.makeText(
                    this,
                    "Dữ liệu khoản chi không hợp lệ",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
                return
            }
        binding.txtTenKhoanChi344.text = "Tên khoản chi: $tenKhoanChi_344"
        binding.txtSoTien344.text = "Số tiền: ${soTien_344} VND"
        binding.txtGhiChu344.text = "Ghi chú: $ghiChu_344"
        binding.btnQuayLai344.setOnClickListener {
            finish()
        }
    }
}