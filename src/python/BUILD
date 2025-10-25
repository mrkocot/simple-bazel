py_binary(
  name = "PythonPrinter",
  srcs = glob(["*.py"]),
  main = "PythonPrinter.py",
  srcs_version = "PY3"
)

py_binary(
    name = "xyz",
    srcs = ["subdir/ijk.py", "subdir/pqr.py"],
    main = "ijk.py",
    srcs_version = "PY3"
)

py_binary(
    name = "mno/prs",
    srcs = ["subdir/ijk.py", "subdir/pqr.py"],
    main = "ijk.py",
    srcs_version = "PY3"
)

py_binary(
    name = "subdir-test",
    srcs = glob(["**/*.py"]),
    main = "ijk.py",
    srcs_version = "PY3"
)
