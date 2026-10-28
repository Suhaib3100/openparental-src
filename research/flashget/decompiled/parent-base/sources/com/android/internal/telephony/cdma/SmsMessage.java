package com.android.internal.telephony.cdma;

import com.android.internal.telephony.GsmAlphabet;

/* loaded from: classes3.dex */
public class SmsMessage {
    public static GsmAlphabet.TextEncodingDetails calculateLength(CharSequence charSequence, boolean z4) {
        return BearerData.calcTextEncodingDetails(charSequence, z4);
    }
}
