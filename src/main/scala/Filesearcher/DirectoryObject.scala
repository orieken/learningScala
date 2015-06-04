package Filesearcher

import java.io.File

case class DirectoryObject(file: File) extends IOObject {
  def children() =
    try
      file.listFiles().toList map(file => FileConverter convertToIOObject file)
    catch {
      case _ : NullPointerException => List()
    }

}
case class FileObject(file: File) extends IOObject
