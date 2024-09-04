import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamingManager implements StreamingObservable {

  Map<String, List<StreamingSubscriber>> listeners = new HashMap<>();

  public StreamingManager(String... categories) {
    for (String category : categories) {
      this.listeners.put(category, new ArrayList<>());
    }
  }

  @Override
  public void subscribe(String category, StreamingSubscriber obj) {
    List<StreamingSubscriber> users = listeners.get(category);
    users.add(obj);
  }

  @Override
  public void unsubscribe(String category, StreamingSubscriber obj) {
    List<StreamingSubscriber> users = listeners.get(category);
    users.remove(obj);
  }

  @Override
  public void notifyAllSubscriber(String category, Movie newMovie) {
    List<StreamingSubscriber> users = listeners.get(category);
    for (StreamingSubscriber listener : users) {
      listener.update(newMovie);
    }
  }

}
