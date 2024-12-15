package com.github.jnuank.intellijpluginshelloworld.findUsages

import com.intellij.find.findUsages.FindUsagesHandler
import com.intellij.find.findUsages.FindUsagesOptions
import com.intellij.psi.PsiElement
import com.intellij.usageView.UsageInfo
import com.intellij.util.Processor
import org.jetbrains.kotlin.psi.KtNamedFunction

class CustomFindUsagesHandler(psiElement: PsiElement): FindUsagesHandler(psiElement) {

    override fun processElementUsages(
        element: PsiElement,
        processor: Processor<in UsageInfo>,
        options: FindUsagesOptions
    ): Boolean {
        println(element)
        if (element is KtNamedFunction) {
            println("できた")
        }

//        element.instanceOf(PsiTreeUtil)
//        element.elementType
        return super.processElementUsages(element, processor, options)
    }
}