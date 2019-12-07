package com.saitin.konekdatabase238

class ApiEndPoint {
    companion object {

        //alamat IP didapatkan melalui cmd dengan mengetik ip config
        private val SERVER = "http://192.168.137.38/belajarkotlin/"
        val CREATE = SERVER+"create_fakultas.php"
        val READ   = SERVER+"read_fakultas.php"
        val UPDATE = SERVER+"update_fakultas.php"
        val DELETE = SERVER+"delete_fakultas.php"
    }
}