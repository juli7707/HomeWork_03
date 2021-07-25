package otus.homework.flowcats

import retrofit2.http.GET

interface CatsService {

    @GET("fact")
    suspend fun getCatFact(): Fact
}