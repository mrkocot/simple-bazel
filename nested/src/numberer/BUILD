load("@rules_java//java:java_binary.bzl", "java_binary")
load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary")

java_binary(
  name = "NumberPrinter1",
  srcs = glob(["**/*.java"]),
  main_class = "numberer.NumberPrinter"
)

java_binary(
  name = "LargeNumberPrinter",
  srcs = ["LargeNumberPrinter.java"],
  main_class = "numberer.LargeNumberPrinter"
)

