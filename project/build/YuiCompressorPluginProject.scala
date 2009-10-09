import sbt._
class YuiCompressorPluginProject(info: ProjectInfo) extends PluginProject(info) {
    val yuiCompressor = "com.yahoo.platform.yui" % "yuicompressor" % "2.3.6"
    val rhino = "rhino" % "js" % "1.6R7"
}