package badilla.carlos.atlas.red

import badilla.carlos.atlas.modelos.Pais
import retrofit2.http.GET
import retrofit2.http.Query

interface PaisesApi {

    @GET("countries")
    suspend fun obtenerPaises(
        @Query("fields") campos: String
    ): List<Pais>
}