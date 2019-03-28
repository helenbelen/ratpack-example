package my.app.chains;
import ratpack.handling.Chain;
import ratpack.handling.Handler;
import ratpack.handling.Context;
import ratpack.func.Action;
import my.app.handlers.GetHandler;
import my.app.handlers.PostHandler;

public class RouterChain implements Action<Chain> {
  private final Handler getHandler = new GetHandler();
  private final Handler postHandler = new PostHandler();

  @Override
  public void execute(Chain chain) throws Exception {
    chain.path("hello", getHandler);
    chain.path("goodbye", postHandler);
  }
}
