py_binary(
  name = "PythonPrinter",
  srcs = glob(["*.py"]),
  main = "PythonPrinter.py",
  srcs_version = "PY3"
)

py_binary(
    name = "xyz",
    srcs = ["fgh/ijk.py", "fgh/pqr.py"],
    main = "ijk.py",
    srcs_version = "PY3"
)

py_binary(
    name = "mno/prs",
    srcs = ["fgh/ijk.py", "fgh/pqr.py"],
    main = "ijk.py",
    srcs_version = "PY3"
)

py_binary(
    name = "subdir-test",
    srcs = glob(["**/*.py"]),
    main = "ijk.py",
    srcs_version = "PY3"
)

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

