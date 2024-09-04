
public class Netflix {
  public StreamingManager listeners;
  private String[] categories = new String[MovieTypes.values().length];

  public Netflix() {
    int index = 0;
    for (MovieTypes type : MovieTypes.values()) {
      categories[index] = type.name();
      index +=1;
    }
    // System.out.println(categories);
    this.listeners = new StreamingManager(categories);
  }

  public void addNewMovie(Movie newMovie) {
    listeners.notifyAllSubscriber(newMovie.category, newMovie);
  }

}
