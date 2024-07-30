package data

class person {

    //properties
    var firstName: String = ""
    var midName: String? = null
    var lastname: String = ""

    fun menyapa(name: String) {
        println("Halo $name, namaku adalah $firstName")
    }

    //membuat function overloading boleh sama fun nya tetapi harus beda parameternya
    fun menyapa(firstNameParam:String,lastNameParam:String){
        println("Halo $firstNameParam $lastNameParam, namaku yaitu $firstName")
    }

    fun lari(){
        println("Aku berlari")
    }

    fun ambilnamapanjang(): String{
        return "$firstName $midName $lastname"
    }

}