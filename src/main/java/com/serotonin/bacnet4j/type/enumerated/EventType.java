/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * When signing a commercial license with Serotonin Software Technologies Inc.,
 * the following extension to GPL is made. A special exception to the GPL is 
 * included to allow you to distribute a combined work that includes BAcnet4J 
 * without being obliged to provide the source code for any proprietary components.
 */
package com.serotonin.bacnet4j.type.enumerated;

import com.serotonin.bacnet4j.type.notificationParameters.BufferReady;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfBitString;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfCharacterString;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfLifeSafety;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfReliability;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfState;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfStatusFlags;
import com.serotonin.bacnet4j.type.notificationParameters.ChangeOfValue;
import com.serotonin.bacnet4j.type.notificationParameters.CommandFailure;
import com.serotonin.bacnet4j.type.notificationParameters.DoubleOutOfRange;
import com.serotonin.bacnet4j.type.notificationParameters.Extended;
import com.serotonin.bacnet4j.type.notificationParameters.FloatingLimit;
import com.serotonin.bacnet4j.type.notificationParameters.OutOfRange;
import com.serotonin.bacnet4j.type.notificationParameters.SignedOutOfRange;
import com.serotonin.bacnet4j.type.notificationParameters.UnsignedOutOfRange;
import com.serotonin.bacnet4j.type.notificationParameters.UnsignedRange;
import com.serotonin.bacnet4j.type.primitive.Enumerated;
import com.serotonin.bacnet4j.util.sero.ByteQueue;

public class EventType extends Enumerated {
    private static final long serialVersionUID = 6120299002647986138L;

    public static final EventType changeOfBitstring = new EventType(ChangeOfBitString.TYPE_ID);
    public static final EventType changeOfState = new EventType(ChangeOfState.TYPE_ID);
    public static final EventType changeOfValue = new EventType(ChangeOfValue.TYPE_ID);
    public static final EventType commandFailure = new EventType(CommandFailure.TYPE_ID);
    public static final EventType floatingLimit = new EventType(FloatingLimit.TYPE_ID);
    public static final EventType outOfRange = new EventType(OutOfRange.TYPE_ID);
    public static final EventType changeOfLifeSafety = new EventType(ChangeOfLifeSafety.TYPE_ID);
    public static final EventType extended = new EventType(Extended.TYPE_ID);
    public static final EventType bufferReady = new EventType(BufferReady.TYPE_ID);
    public static final EventType unsignedRange = new EventType(UnsignedRange.TYPE_ID);
    public static final EventType accessEvent = new EventType(
            com.serotonin.bacnet4j.type.notificationParameters.AccessEvent.TYPE_ID);
    public static final EventType doubleOutOfRange = new EventType(DoubleOutOfRange.TYPE_ID);
    public static final EventType signedOutOfRange = new EventType(SignedOutOfRange.TYPE_ID);
    public static final EventType unsignedOutOfRange = new EventType(UnsignedOutOfRange.TYPE_ID);
    public static final EventType changeOfCharacterstring = new EventType(ChangeOfCharacterString.TYPE_ID);
    public static final EventType changeOfStatusFlags = new EventType(ChangeOfStatusFlags.TYPE_ID);
    public static final EventType changeOfReliability = new EventType(ChangeOfReliability.TYPE_ID);
    public static final EventType none = new EventType(20);

    public static final EventType[] ALL = { changeOfBitstring, changeOfState, changeOfValue, commandFailure,
            floatingLimit, outOfRange, changeOfLifeSafety, extended, bufferReady, unsignedRange, accessEvent,
            doubleOutOfRange, signedOutOfRange, unsignedOutOfRange, changeOfCharacterstring, changeOfStatusFlags,
            changeOfReliability, none, };

    public EventType(int value) {
        super(value);
    }

    public EventType(ByteQueue queue) {
        super(queue);
    }
}
