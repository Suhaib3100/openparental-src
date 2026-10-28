package com.android.internal.telephony.cdma;

import com.android.internal.telephony.GsmAlphabet;
import com.android.internal.telephony.SmsConstants;

/* loaded from: classes3.dex */
public class BearerData {
    public static GsmAlphabet.TextEncodingDetails calcTextEncodingDetails(CharSequence charSequence, boolean z4) {
        int countAsciiSeptets = countAsciiSeptets(charSequence, z4);
        if (countAsciiSeptets != -1 && countAsciiSeptets <= 160) {
            GsmAlphabet.TextEncodingDetails textEncodingDetails = new GsmAlphabet.TextEncodingDetails();
            textEncodingDetails.msgCount = 1;
            textEncodingDetails.codeUnitCount = countAsciiSeptets;
            textEncodingDetails.codeUnitsRemaining = 160 - countAsciiSeptets;
            textEncodingDetails.codeUnitSize = 1;
            return textEncodingDetails;
        }
        GsmAlphabet.TextEncodingDetails calculateLength = com.android.internal.telephony.gsm.SmsMessage.calculateLength(charSequence, z4);
        if (calculateLength.msgCount == 1 && calculateLength.codeUnitSize == 1) {
            int length = charSequence.length();
            calculateLength.codeUnitCount = length;
            int i4 = length * 2;
            if (i4 > 140) {
                int i5 = (i4 + UserData.IS91_MSG_TYPE_SHORT_MESSAGE) / SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER;
                calculateLength.msgCount = i5;
                calculateLength.codeUnitsRemaining = ((i5 * SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER) - i4) / 2;
            } else {
                calculateLength.msgCount = 1;
                calculateLength.codeUnitsRemaining = (SmsConstants.MAX_USER_DATA_BYTES - i4) / 2;
            }
            calculateLength.codeUnitSize = 3;
        }
        return calculateLength;
    }

    private static int countAsciiSeptets(CharSequence charSequence, boolean z4) {
        int length = charSequence.length();
        if (z4) {
            return length;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (UserData.charToAscii.get(charSequence.charAt(i4), -1) == -1) {
                return -1;
            }
        }
        return length;
    }
}
