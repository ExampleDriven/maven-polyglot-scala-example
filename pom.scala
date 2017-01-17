import org.sonatype.maven.polyglot.scala.model._
import scala.collection.immutable.Seq

Model(
  "org.exampledriven" % "maven-polyglot-scala-example" % "1.0-SNAPSHOT",
  dependencies = Seq(
    "io.takari.polyglot" % "polyglot-scala" % "0.1.10" % "test"
  ),
  build = Build(
    tasks = Seq(Task("someTaskId", "verify") { ec =>
      println(s"\nbaseDir: \n${ec.basedir}")
    })
  ),
  modelVersion = "4.0.0"
)
