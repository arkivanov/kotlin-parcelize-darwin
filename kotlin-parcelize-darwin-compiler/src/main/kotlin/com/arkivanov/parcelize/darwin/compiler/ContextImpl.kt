package com.arkivanov.parcelize.darwin.compiler

import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol

class ContextImpl(
    override val pluginContext: IrPluginContext
) : Context {

    override val nsObjectClass: IrClassSymbol = pluginContext.referenceClass(nsObjectName).require()
    override val nsCodingClass: IrClassSymbol = pluginContext.referenceClass(nsCodingName).require()
    override val nsCoderClass: IrClassSymbol = pluginContext.referenceClass(nsCoderName).require()
    override val decodedValueClass: IrClassSymbol = pluginContext.referenceClass(decodedValueName).require()
    override val parcelableClass: IrClassSymbol = pluginContext.referenceClass(parcelableName).require()
}