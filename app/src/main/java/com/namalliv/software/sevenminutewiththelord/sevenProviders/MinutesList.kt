package com.namalliv.software.sevenminutewiththelord.sevenProviders

object MinutesList {

    var alturas : MutableList<String>? = ArrayList()

    init {
        ponerAltura("Calling")
        ponerAltura("Confessing")
        ponerAltura("Praying")
        ponerAltura("Pray-reading")
        ponerAltura("Petitions")
        ponerAltura("Normal")
        ponerAltura("Normal")

    }


    private fun ponerAltura(mainView : String){
        alturas?.add(mainView)
    }
}