package com.github.h3rmt.intellijyuck


import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile


object YuckFileType : LanguageFileType(YuckLanguage) {
  override fun getName() = "Yuck"
  override fun getDescription() = "Yuck file"
  override fun getDefaultExtension() = "yuck"
  override fun getIcon() = YuckIcons.Icon
  override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}