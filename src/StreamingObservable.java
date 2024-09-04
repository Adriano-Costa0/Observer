public interface StreamingObservable {
  public void subscribe(String category, StreamingSubscriber obj);
  public void unsubscribe(String category, StreamingSubscriber obj);
  public void notifyAllSubscriber(String category, Movie newMovie);
}