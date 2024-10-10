/*
FUNCTION VARARGS ARGUMENT
- Varargs = Variable argument
- Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
- Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
- Apa bedanya dengan parameter biasa dengan tipe data Array?
    * Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
    * JIka parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma
*/

fun main() {
    finalValue("riko", 10, 9, 8, 7)
}

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0
    for (value in values ) {
        total += value
    }
    total /= values.size
    println("Finall Value $name = $total")
}