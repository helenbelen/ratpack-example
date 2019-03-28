package my.app.di;
import com.google.inject.AbstractModule;
import my.app.chains.RouterChain;

public class MainModule extends AbstractModule {

  protected void configure() {
    bind(RouterChain.class);
  }
}
