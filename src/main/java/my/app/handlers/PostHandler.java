package my.app.handlers;
import ratpack.handling.Chain;
import ratpack.handling.Handler;
import ratpack.handling.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PostHandler implements Handler {

  @Override
  public void handle(Context context) {
    context.getResponse().send("goodbye");
  }
}
