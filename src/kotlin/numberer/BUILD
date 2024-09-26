load("//src/macros:simple.bzl", "multiple_java_binaries")
load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary")

java_binary(
  name = "NumberPrinter1",
  srcs = glob(["*.java"]),
  main_class = "src.numberer.NumberPrinter"
)

java_binary(
  name = "NumberPrinter2",
  srcs = ["NumberPrinter.java"],
  resources = glob(["KotlinPrinter.kt", "*.txt"]),
  main_class = "src.numberer.NumberPrinter"
)

java_binary(
  name = "Number.Printer3",
  srcs = glob(["NumberPrinter*"]),
  main_class = "src.numberer.NumberPrinter"
)

multiple_java_binaries(
  number = 4,
  name = "MultipliedNumberPrinter",
  srcs = ["NumberPrinter.java"],
  main_class = "src.numberer.NumberPrinter"
)

# multiple_java_binaries(
#   number = 2,
#   name = "MultipliedLargeNumberPrinter",
#   srcs = ["LargeNumberPrinter.java"],
#   main_class = "src.numberer.LargeNumberPrinter"
# )

java_binary(
  name = "LargeNumberPrinter",
  srcs = ["LargeNumberPrinter.java"],
  main_class = "src.numberer.LargeNumberPrinter"
)

kt_jvm_binary(
  name = "KotlinPrinter",
  srcs = glob(["*.kt", "NumberPrinter.java"]),
  main_class = "src.numberer.KotlinPrinter"
)

