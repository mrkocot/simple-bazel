load("@rules_python//python:py_test.bzl", "py_test")

py_test(
    name = "python_test_pytest",
    srcs = ["pytest_test.py"],
    main = "pytest_test.py",
    deps = ["@pypi//pytest:pkg",],
)

py_test(
    name = "python_test_unittest",
    srcs = ["unittest_test.py"],
    main = "unittest_test.py",
    deps = [],
)
