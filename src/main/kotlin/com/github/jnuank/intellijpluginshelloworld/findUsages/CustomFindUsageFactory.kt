package com.github.jnuank.intellijpluginshelloworld.findUsages

import com.intellij.find.findUsages.FindUsagesHandler
import com.intellij.find.findUsages.FindUsagesHandlerFactory
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.psi.PsiElement

class CustomFindUsageFactory: FindUsagesHandlerFactory() {

    init {
        thisLogger().warn("find usage factory.")
    }

    override fun canFindUsages(p0: PsiElement): Boolean {
        println("psiElement:  $p0")
        return true
    }


    override fun createFindUsagesHandler(p0: PsiElement, p1: Boolean): FindUsagesHandler? {
        return CustomFindUsagesHandler(p0)
    }
}