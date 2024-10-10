import com.company.project.util.sayHallo //Spesifik
import com.company.project.util.* // keseluruhan yang ada di dalam folder util termasuk file StringUtil.kt

/*
PACKAGE & IMPORT
- Package adalah tempat yang bisa digunakan untuk mengorganisir kode program yang kita buat di Kotlin
- Dengan menggunakan package, kita bisa merapikan kode program Kotlin yang kita buat
- Penamaan package di Kotlin biasanya menggunakan huruf kecil semua
- Jika ingin membuat sub package bisa menggunakan tanda . (titik)
 */



fun main() {
    sayHallo("riko")
    sayGoodby("msiocirm")
    com.company.project.util.introduce("RIKO") // secara langsung dengan memasukan directory packagenya
}