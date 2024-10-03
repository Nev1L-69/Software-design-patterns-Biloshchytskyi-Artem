// Movie Interface
public interface Movie {
    String getTitle();
    String getType();
}

// Concrete classes
class RegularMovie implements Movie {
    private String title;
    public RegularMovie(String title) { this.title = title; }
    public String getTitle() { return title; }
    public String getType() { return "Regular Movie"; }
}

class IMAXMovie implements Movie {
    private String title;
    public IMAXMovie(String title) { this.title = title; }
    public String getTitle() { return title; }
    public String getType() { return "IMAX Movie"; }
}

// Factory Method
abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}

class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}

class IMAXMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}
