package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * channelAdminLogEventActionParticipantToggleAdmin#d5676710
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChannelAdminLogEventActionParticipantToggleAdmin() : TLAbsChannelAdminLogEventAction() {
    var prevParticipant: TLAbsChannelParticipant = TLChannelParticipantCreator()

    var newParticipant: TLAbsChannelParticipant = TLChannelParticipantCreator()

    private val _constructor: String = "channelAdminLogEventActionParticipantToggleAdmin#d5676710"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(prevParticipant: TLAbsChannelParticipant, newParticipant: TLAbsChannelParticipant) : this() {
        this.prevParticipant = prevParticipant
        this.newParticipant = newParticipant
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(prevParticipant)
        writeTLObject(newParticipant)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        prevParticipant = readTLObject<TLAbsChannelParticipant>()
        newParticipant = readTLObject<TLAbsChannelParticipant>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += prevParticipant.computeSerializedSize()
        size += newParticipant.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChannelAdminLogEventActionParticipantToggleAdmin) return false
        if (other === this) return true

        return prevParticipant == other.prevParticipant
                && newParticipant == other.newParticipant
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xd5676710.toInt()
    }
}