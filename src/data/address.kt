package data

class address{
    var kabupaten: String=""
    var provinsi: String=""
    var negara: String= "Indonesia"


    //tanpa primary const
    constructor(paramkabupaten:String, paramprovisnsi:String){
        kabupaten= paramkabupaten
        provinsi= paramprovisnsi
    }

    constructor(paramkabupaten: String,paramprovisnsi: String,paramNegara:String)
    : this(paramkabupaten,paramprovisnsi) {
        negara= paramNegara //cukup call negara karena kab n prov dipanggil this
    }
}