package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.psi.*
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import java.util.*


object YuckUtil {
  inline fun <reified T : YuckNamedElement> find(project: Project, key: String): List<T> {
    val result = mutableListOf<T>()
    val virtualFiles = FileTypeIndex.getFiles(YuckFileType, GlobalSearchScope.allScope(project))

    for (virtualFile in virtualFiles) {
      val yuckFile: YuckFile? = PsiManager.getInstance(project).findFile(virtualFile) as? YuckFile?
      if (yuckFile != null) {
//        val widgets: List<T> = YuckPsiTreeUtil.getStubChildrenOfTypeAsList(yuckFile, T::class.java)
        val widgets: Collection<T> = PsiTreeUtil.findChildrenOfType(yuckFile, T::class.java)
//        var child = yuckFile.firstChild
//        while (child != null) {
//          LOG.warn("child: ${child.text} ${child.elementType}")
//          child = child.nextSibling
//        }
//        LOG.warn("widgets: ${widgets.size} ($key) ${yuckFile.name}")
        for (widget in (widgets)) {
//          LOG.warn("widget: ${widget.getName()} ${widget.text}")
          if (key == widget.name) {
            result.add(widget)
          }
        }
      }
    }
    return result
  }

  inline fun <reified T : YuckNamedElement> find(project: Project): List<T> {
    val result = mutableListOf<T>()
    val virtualFiles = FileTypeIndex.getFiles(YuckFileType, GlobalSearchScope.allScope(project))

    for (virtualFile in virtualFiles) {
      val yuckFile: YuckFile? = PsiManager.getInstance(project).findFile(virtualFile) as? YuckFile?
      if (yuckFile != null) {
        val widgets: List<T> = PsiTreeUtil.getStubChildrenOfTypeAsList(
          yuckFile, T::class.java
        )
        result.addAll(widgets)
      }
    }
    return result
  }

  fun findDocumentationComment(property: YuckCustomWidgetDefinition): String {
    val result: MutableList<String> = LinkedList()
    var element: PsiElement = property.prevSibling
    while (element is PsiComment || element is PsiWhiteSpace) {
      if (element is PsiComment) {
        val commentText = element.getText().replaceFirst("[;# ]+".toRegex(), "")
        result.add(commentText)
      }
      element = element.prevSibling
    }
    return result.joinToString("\n ")
  }
}