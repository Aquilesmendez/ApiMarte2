package com.example.apimarte.Model.Remote

import retrofit2.Response
import retrofit2.http.GET

//Interfaz para llamar los datos de una api.
interface MarsApi {

    //Metodo http para traer los datos de una api.
    @GET("realestate")
    suspend fun obtenerDatosApi(): Response<List<MarsRealstate>>
}
