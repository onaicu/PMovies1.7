package tv.freetel.pmovies1.network.service;

import tv.freetel.pmovies1.network.model.MovieInfo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Path;
import tv.freetel.pmovies1.view.MoviesFragmentGrid;

/**
 * Defines the REST API for Retrofit to access the movie DB API.
 *
 */
public interface DiscoverMovieService {
    /**adds the sharedpreference value from fetchmovies method to the endpoint.
     * Whereas getMovies is declared in the fetchmovies method in the MoviesFragment Grid.
     */

    @GET("/3/movie/{Sort_By}")
    Call<MovieInfo> getMovies(@Path ("Sort_By") String sortBy, @Query("api_key") String apiKey);
}
