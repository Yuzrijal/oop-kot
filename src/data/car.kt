package data

class car(paramBrand: String, paramMerk: String, paramYear: Int){

    init {
        //initializer block adalah blok kode yang akan diekssekusi ketika const dipanggil
        println("Mobil $paramBrand dibuat tahun $paramYear")
    }

    //misal pada secondary const kita hanya mengeksekusi brand dan merk
    constructor(paramBrand: String, paramMerk: String):this(paramBrand,paramMerk,2019){
        println("Secondary Constructor 1: ")
    }

    //pada sec const disini, yang dicall this sec const diatas
    constructor(paramBrand: String): this(paramBrand,""){
        println("Secondary Constructor 2: ")
    }


    var brand: String = paramBrand
    var merk: String= paramMerk
    var year: Int= paramYear
}