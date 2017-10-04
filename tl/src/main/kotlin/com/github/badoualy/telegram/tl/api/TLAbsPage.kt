package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.core.TLObjectVector

/**
 * Abstraction level for the following constructors:
 * * [pageFull#556ec7aa][TLPageFull]
 * * [pagePart#8e3f9ebe][TLPagePart]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsPage : TLObject() {
    abstract var blocks: TLObjectVector<TLAbsPageBlock>

    abstract var photos: TLObjectVector<TLAbsPhoto>

    abstract var documents: TLObjectVector<TLAbsDocument>
}