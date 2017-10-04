package com.github.badoualy.telegram.tl.api

/**
 * messageActionEmpty#b6aef7b0
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLMessageActionEmpty : TLAbsMessageAction() {
    private val _constructor: String = "messageActionEmpty#b6aef7b0"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLMessageActionEmpty) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xb6aef7b0.toInt()
    }
}