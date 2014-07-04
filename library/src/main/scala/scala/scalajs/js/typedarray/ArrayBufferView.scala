package scala.scalajs.js.typedarray

import scala.scalajs.js

trait ArrayBufferView extends js.Object {
  /** The underlying buffer of this ArrayBufferView */
  val buffer: ArrayBuffer = ???

  /** The number of bytes of this ArrayBufferView */
  val byteLength: Int = ???

  /** The offset of this ArrayBufferView in the underlying buffer */
  val byteOffset: Int = ???
}
