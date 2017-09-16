package tv.freetel.pmovies1.event;

import tv.freetel.pmovies1.network.model.Movie;

import java.util.List;

/**
 * Ths event class is used to represent response returned by discover endpoint of  Open Movie DB API.
 *
 */
public class MovieEvent {

    List<Movie> mMovieList;

    public MovieEvent() {
    }

    public MovieEvent(List<Movie> mMovieList) {
        this.mMovieList = mMovieList;
    }

    public List<Movie> getmMovieList() {
        return mMovieList;
    }

    public void setmMovieList(List<Movie> mMovieList) {
        this.mMovieList = mMovieList;
    }
}
