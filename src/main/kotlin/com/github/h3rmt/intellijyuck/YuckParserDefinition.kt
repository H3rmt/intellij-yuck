package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.parser.YuckParser
import com.github.h3rmt.intellijyuck.psi.YuckFile
import com.github.h3rmt.intellijyuck.psi.YuckTokenTypes
import com.github.h3rmt.intellijyuck.psi.YuckTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType


class YuckParserDefinition : ParserDefinition {
  override fun createLexer(project: Project) = YuckLexer()

  override fun createParser(project: Project) = YuckParser()
  override fun getWhitespaceTokens() = YuckTokenTypes.WHITE_SPACES
  override fun getCommentTokens() = YuckTokenTypes.COMMENTS
  override fun getStringLiteralElements() = YuckTokenTypes.STRING_LITERALS
  override fun getFileNodeType() = IFileElementType(YuckLanguage)
  override fun createFile(viewProvider: FileViewProvider): PsiFile = YuckFile(viewProvider)
  override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode) = ParserDefinition.SpaceRequirements.MUST
  override fun createElement(node: ASTNode): PsiElement {
    return YuckTypes.Factory.createElement(node)
  }
}