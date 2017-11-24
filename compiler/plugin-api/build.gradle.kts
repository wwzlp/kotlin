
apply { plugin("kotlin") }

jvmTarget = "1.6"

configureIntellijPlugin {
    setExtraDependencies("intellij-core")
}

dependencies {
    compile(project(":compiler:util"))
    compile(project(":compiler:frontend"))
}

afterEvaluate {
    dependencies {
        compileOnly(intellijCoreJar())
    }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}
