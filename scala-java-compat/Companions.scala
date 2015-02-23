abstract trait AbstractTraitCompanion {
}
object AbstractTraitCompanion {
  final val CompilerConstant = 1
  val value = 2
}

trait TraitCompanion {
}
object TraitCompanion {
  final val CompilerConstant = 11
  val value = 12
}

class ClassCompanion {
}
object ClassCompanion {
  final val CompilerConstant = 21
  val value = 22
}

abstract class AbstractClassCompanion {
}
object AbstractClassCompanion {
  final val CompilerConstant = 31
  val value = 32
}

object SadCompanion {
  final val CompilerConstant = 41
  val value = 42
}
