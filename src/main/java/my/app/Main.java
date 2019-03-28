package my.app;
import ratpack.server.RatpackServer;
import my.app.chains.RouterChain;
import my.app.di.MainModule;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.handling.Chain;

public class Main {

  public static void main(String[] args) throws Exception{
    RatpackServer.start(server -> server
      .serverConfig(c -> c.baseDir(BaseDir.find()))
      .registry(Guice.registry(b -> b.module(MainModule.class)))
      .handlers(new RouterChain())
    );

  }
}
