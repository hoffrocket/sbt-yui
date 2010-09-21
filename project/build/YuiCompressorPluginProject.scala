import sbt._
class YuiCompressorPluginProject(info: ProjectInfo) extends PluginProject(info) {
  val yuiCompressor = "com.yahoo.platform.yui" % "yuicompressor" % "2.4.2" % "compile->default"
  
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)
  
}