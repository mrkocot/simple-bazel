load("//src/macros:junit5.bzl", "java_junit5_test")

java_test(
    name = "MathTest_junit4",
    srcs = glob(["MathJ4Test.java"]),
    test_class = "tests.MathJ4Test",
    deps = ["@maven//:junit_junit"],
)

java_junit5_test(
    name = "MathTest_junit5",
    srcs = glob(["MathJ5Test.java"]),
    classname = "tests.MathJ5Test",
)
