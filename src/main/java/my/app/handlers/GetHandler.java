package my.app.handlers;
import ratpack.handling.Handler;
import ratpack.handling.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class GetHandler implements Handler {
  private final static Logger LOGGER = LoggerFactory.getLogger(GetHandler.class);


  @Override
  public void handle(Context context) {
    context.getResponse().send("hello");

  }
}
