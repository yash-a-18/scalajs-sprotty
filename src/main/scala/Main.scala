import scala.scalajs.js
import org.facade.Sprotty
// @main def hello(): Unit =
//   println("Hello world!")
//   println(msg)

def msg = "I was compiled by Scala 3. :)"
import scala.scalajs.js
import org.facade.Sprotty
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("reflect-metadata", JSImport.Namespace)
object ReflectMetadata extends js.Object

object MySprotty {
  @main def main(): Unit = {
    // Initialize reflect-metadata
    ReflectMetadata

    try {
      // Print out the Sprotty object for debugging
      println(s"Sprotty object: ${js.JSON.stringify(Sprotty)}")

      // Use the defaultModule to create a diagram
      val diagramModule = Sprotty.defaultModule.asInstanceOf[js.Dynamic]
      println(s"Default module: ${js.JSON.stringify(diagramModule)}")

      // Create an empty root model
      val emptyRoot = Sprotty.EMPTY_ROOT.asInstanceOf[Sprotty.SModelRoot]
      println(s"Empty root: ${js.JSON.stringify(emptyRoot)}")

      // If there's a createContainer function in the module, use it
      if (js.isUndefined(diagramModule.createContainer)) {
        println("createContainer function not found in the default module")
      } else {
        val container = diagramModule.createContainer()
        println(s"Container created: ${js.JSON.stringify(container)}")

        // If there's a setModel function, use it
        if (!js.isUndefined(container.setModel)) {
          container.setModel(emptyRoot)
          println("Model set on the container")
        } else {
          println("setModel function not found on the container")
        }
      }

      println("Sprotty initialization complete")
    } catch {
      case e: Throwable =>
        println(s"Error initializing Sprotty: ${e.getMessage}")
        e.printStackTrace()
    }
  }
}