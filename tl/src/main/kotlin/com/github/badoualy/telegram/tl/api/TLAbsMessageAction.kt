package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [messageActionChannelCreate#95d2ac92][TLMessageActionChannelCreate]
 * * [messageActionChannelMigrateFrom#b055eaee][TLMessageActionChannelMigrateFrom]
 * * [messageActionChatAddUser#488a7337][TLMessageActionChatAddUser]
 * * [messageActionChatCreate#a6638b9a][TLMessageActionChatCreate]
 * * [messageActionChatDeletePhoto#95e3fbef][TLMessageActionChatDeletePhoto]
 * * [messageActionChatDeleteUser#b2ae9b0c][TLMessageActionChatDeleteUser]
 * * [messageActionChatEditPhoto#7fcb13a8][TLMessageActionChatEditPhoto]
 * * [messageActionChatEditTitle#b5a1ce5a][TLMessageActionChatEditTitle]
 * * [messageActionChatJoinedByLink#f89cf5e8][TLMessageActionChatJoinedByLink]
 * * [messageActionChatMigrateTo#51bdb021][TLMessageActionChatMigrateTo]
 * * [messageActionEmpty#b6aef7b0][TLMessageActionEmpty]
 * * [messageActionGameScore#92a72876][TLMessageActionGameScore]
 * * [messageActionHistoryClear#9fbab604][TLMessageActionHistoryClear]
 * * [messageActionPaymentSent#40699cd0][TLMessageActionPaymentSent]
 * * [messageActionPaymentSentMe#8f31b327][TLMessageActionPaymentSentMe]
 * * [messageActionPhoneCall#80e11a7f][TLMessageActionPhoneCall]
 * * [messageActionPinMessage#94bd38ed][TLMessageActionPinMessage]
 * * [messageActionScreenshotTaken#4792929b][TLMessageActionScreenshotTaken]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsMessageAction : TLObject()