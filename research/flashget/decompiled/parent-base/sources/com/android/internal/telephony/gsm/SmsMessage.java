package com.android.internal.telephony.gsm;

import com.android.internal.telephony.GsmAlphabet;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;

/* loaded from: classes3.dex */
public class SmsMessage {
    public static GsmAlphabet.TextEncodingDetails calculateLength(CharSequence charSequence, boolean z4) {
        GsmAlphabet.TextEncodingDetails countGsmSeptets = GsmAlphabet.countGsmSeptets(charSequence, z4);
        if (countGsmSeptets == null) {
            countGsmSeptets = new GsmAlphabet.TextEncodingDetails();
            int length = charSequence.length() * 2;
            countGsmSeptets.codeUnitCount = charSequence.length();
            if (length > 140) {
                int i4 = (length + UserData.IS91_MSG_TYPE_SHORT_MESSAGE) / SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER;
                countGsmSeptets.msgCount = i4;
                countGsmSeptets.codeUnitsRemaining = ((i4 * SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER) - length) / 2;
            } else {
                countGsmSeptets.msgCount = 1;
                countGsmSeptets.codeUnitsRemaining = (SmsConstants.MAX_USER_DATA_BYTES - length) / 2;
            }
            countGsmSeptets.codeUnitSize = 3;
        }
        return countGsmSeptets;
    }
}
