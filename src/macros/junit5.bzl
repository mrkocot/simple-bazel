JUNIT5_DEPS = [
    "@maven//:org_junit_jupiter_junit_jupiter",
    "@maven//:org_junit_jupiter_junit_jupiter_api",
    "@maven//:org_junit_platform_junit_platform_console",
]

def java_junit5_test(classname, deps = [], **kwargs):
    native.java_test(
        main_class = "org.junit.platform.console.ConsoleLauncher",
        deps = JUNIT5_DEPS + deps,
        args = ["--select-class=" + classname, "--fail-if-no-tests"],
        **kwargs
    )
