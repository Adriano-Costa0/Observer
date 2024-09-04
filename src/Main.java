public class Main{

  public static void main(String[] args) {
    Client adriano = new Client("Adriano Costa Araujo");
    Client paulo = new Client("Paulo Cesar");
    Client fernando = new Client("Fernando Silva");
    Client debora = new Client("Debora Seco");
    Client carlos = new Client("Carlos Eduardo");

    Netflix streaming = new Netflix();

    Movie teste = new Movie("Filme", MovieTypes.ACAO.name());
    streaming.addNewMovie(teste);
    
    streaming.listeners.subscribe(MovieTypes.ACAO.name(), adriano);
    streaming.listeners.subscribe(MovieTypes.ACAO.name(), paulo);
    streaming.listeners.subscribe(MovieTypes.COMEDIA.name(), paulo);
    streaming.listeners.subscribe(MovieTypes.COMEDIA.name(), fernando);
    streaming.listeners.subscribe(MovieTypes.COMEDIA.name(), debora);
    streaming.listeners.subscribe(MovieTypes.COMEDIA.name(), carlos);
    
    Movie teste2 = new Movie("Velozes e furiosos", MovieTypes.ACAO.name());
    streaming.addNewMovie(teste2);

    Movie teste3 = new Movie("Gente grande 2", MovieTypes.COMEDIA.name());
    streaming.addNewMovie(teste3);

    Movie teste4 = new Movie("Shingeki no kiojin", MovieTypes.ANIME.name());
    streaming.addNewMovie(teste4);
    
  }
}