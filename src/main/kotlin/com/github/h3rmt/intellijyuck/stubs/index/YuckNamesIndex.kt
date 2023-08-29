package com.github.h3rmt.intellijyuck.stubs.index

import com.github.h3rmt.intellijyuck.YuckFileElementType
import com.github.h3rmt.intellijyuck.psi.YuckNamedElement
import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.StringStubIndexExtension
import com.intellij.psi.stubs.StubIndex
import com.intellij.psi.stubs.StubIndexKey
import com.intellij.util.Processor
import com.intellij.util.indexing.IdFilter
class YuckNamesIndex : StringStubIndexExtension<YuckNamedElement>() {
    companion object {
        val KEY = StubIndexKey.createIndexKey<String, YuckNamedElement>("Yuck.named.element")

        fun find(
            fqn: String,
            project: Project,
            scope: GlobalSearchScope?,
        ): Collection<YuckNamedElement> {
            return StubIndex.getElements(KEY, fqn, project, scope, YuckNamedElement::class.java)
        }

        fun process(
            name: String,
            project: Project,
            scope: GlobalSearchScope?,
            idFilter: IdFilter?,
            processor: Processor<YuckNamedElement>,
        ): Boolean {
            return StubIndex.getInstance().processElements(
                KEY, name, project, scope, idFilter,
                YuckNamedElement::class.java, processor
            )
        }

        fun getAllPrefix(prefix: String, project: Project): Collection<YuckNamedElement> {
            val keys = StubIndex.getInstance().getAllKeys(KEY, project)
            return keys.flatMap { key ->
                if (!key.startsWith(prefix)) {
                    return@flatMap emptyList()
                }

                StubIndex.getElements(KEY, key, project, null, null, YuckNamedElement::class.java)
            }
        }
    }

    override fun getVersion() = YuckFileElementType.VERSION + 0

    override fun getKey() = KEY
}
