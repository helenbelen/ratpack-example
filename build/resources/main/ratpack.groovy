import ratpack.groovy.template.TextTemplateModule

import static ratpack.groovy.Groovy.ratpack
import static ratpack.groovy.Groovy.groovyTemplate

ratpack {

  bindings {
		module TextTemplateModule, { TextTemplateModule.Config config -> config.staticallyCompile = true }
	}
  handlers {
    get {
        render groovyTemplate("index.html")
    }
    get(":name") {
        render "Hello $pathTokens.name!"
    }
  }
}
