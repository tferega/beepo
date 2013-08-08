resolvers ++= Seq(
  "Element Nexus" at "http://repo.element.hr/nexus/content/groups/public/",
  Resolver.url("Element Nexus (Ivy)", url("http://repo.element.hr/nexus/content/groups/public/"))(Resolver.ivyStylePatterns)
)

// =======================================================================================

// +-------------------------------------------------------------------------------------+
// | SBT Eclipse (https://github.com/typesafehub/sbteclipse)                             |
// | Creates .project and .classpath files for easy Eclipse project imports              |
// |                                                                                     |
// | See also: Eclipse downloads (http://www.eclipse.org/downloads/)                     |
// | See also: Scala IDE downloads (http://download.scala-ide.org/)                      |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

// +-------------------------------------------------------------------------------------+
// | Dependency graph SBT plugin (https://github.com/jrudolph/sbt-dependency-graph)      |
// | Lists all library dependencies in a nicely formatted way for easy inspection.       |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

// +-------------------------------------------------------------------------------------+
// | XSBT Web plugin (https://github.com/JamesEarlDouglas/xsbt-web-plugin)               |
// | Implements SBT 0.7.x Web project actions: "jetty-run" -> "container:start", etc ... |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.3.0")
