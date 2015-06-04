package Filesearcher

import java.io.File
import scala.util.control.NonFatal

trait IOObject {
  val file: File
  val name = file.getName()
  val fullName = try file.getAbsolutePath catch { case NonFatal(_) => name}
}
