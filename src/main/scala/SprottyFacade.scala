package org.facade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("sprotty", JSImport.Namespace)
object Sprotty extends js.Object {
  val defaultModule: js.Dynamic = js.native
  val boundModule: js.Dynamic = js.native
  val EMPTY_ROOT: js.Dynamic = js.native
  
  @js.native
  trait SModelRoot extends js.Object {
    val _type: String = js.native
    val id: String = js.native
  }
}

@js.native
trait SprottyDiagram extends js.Object {
  def setModel(model: Sprotty.SModelRoot): Unit = js.native
}

// import scala.scalajs.js.annotation.JSName
  
//   @js.native
//   object TYPES extends js.Object {
//     val ModelSource: js.Any = js.native
//   }
  
// @js.native
// @JSImport("inversify", "Container")
// class Container extends js.Object {
//   def bind(serviceIdentifier: js.Any): js.Dynamic = js.native
//   def get(serviceIdentifier: js.Any): js.Any = js.native
// }

// @js.native
// @JSImport("inversify", JSImport.Namespace)
// object Inversify extends js.Object {
//   def injectable(): js.Function1[js.Any, js.Any] = js.native
//   def inject(serviceIdentifier: js.Any): js.Function1[js.Any, js.Any] = js.native
// }