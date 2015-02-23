public class Companions {
  public static void main(String[] args) {
    System.out.println(TraitCompanion$.MODULE$.CompilerConstant());
    System.out.println(TraitCompanion$.MODULE$.value());

    System.out.println(ClassCompanion$.MODULE$.CompilerConstant());
    System.out.println(ClassCompanion$.MODULE$.value());
    System.out.println(ClassCompanion.CompilerConstant());
    System.out.println(ClassCompanion.value());

    System.out.println(AbstractClassCompanion$.MODULE$.CompilerConstant());
    System.out.println(AbstractClassCompanion$.MODULE$.value());
    System.out.println(AbstractClassCompanion.CompilerConstant());
    System.out.println(AbstractClassCompanion.value());

    System.out.println(SadCompanion$.MODULE$.CompilerConstant());
    System.out.println(SadCompanion$.MODULE$.value());
  }
}
