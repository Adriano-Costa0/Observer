public class Client implements StreamingSubscriber {

  private String name;

  public Client(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void update(Movie newMovie) {
    System.out.println(name + " - Nova Notificação");
    System.out.println("Netflix acaba de adicionar " + newMovie.title + ", CATEGORIA: " + newMovie.category+"\n");
  }

}
