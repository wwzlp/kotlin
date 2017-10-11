// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
package org.jetbrains.kotlin.gradle.dsl

internal abstract class KotlinMultiplatformCommonOptionsBase : org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformCommonOptions {

    private var suppressWarningsField: kotlin.Boolean? = null
    override var suppressWarnings: kotlin.Boolean
        get() = suppressWarningsField ?: false
        set(value) { suppressWarningsField = value }

    private var verboseField: kotlin.Boolean? = null
    override var verbose: kotlin.Boolean
        get() = verboseField ?: false
        set(value) { verboseField = value }

    private var warningsAsErrorsField: kotlin.Boolean? = null
    override var warningsAsErrors: kotlin.Boolean
        get() = warningsAsErrorsField ?: false
        set(value) { warningsAsErrorsField = value }

    private var apiVersionField: kotlin.String?? = null
    override var apiVersion: kotlin.String?
        get() = apiVersionField ?: null
        set(value) { apiVersionField = value }

    private var languageVersionField: kotlin.String?? = null
    override var languageVersion: kotlin.String?
        get() = languageVersionField ?: null
        set(value) { languageVersionField = value }

    internal open fun updateArguments(args: org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments) {
        suppressWarningsField?.let { args.suppressWarnings = it }
        verboseField?.let { args.verbose = it }
        warningsAsErrorsField?.let { args.warningsAsErrors = it }
        apiVersionField?.let { args.apiVersion = it }
        languageVersionField?.let { args.languageVersion = it }
    }
}

internal fun org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments.fillDefaultValues() {
    suppressWarnings = false
    verbose = false
    warningsAsErrors = false
    apiVersion = null
    languageVersion = null
}