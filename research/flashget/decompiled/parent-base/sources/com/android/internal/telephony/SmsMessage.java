package com.android.internal.telephony;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.android.internal.telephony.GsmAlphabet;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SmsMessage {
    private static int sNetworkType = -1;

    public static ArrayList<String> divideSms(Context context, String str) {
        if (sNetworkType == -1) {
            sNetworkType = ((TelephonyManager) context.getSystemService(ProtectedSandApp.s("٠"))).getNetworkType();
        }
        return fragmentText(sNetworkType, str);
    }

    public static ArrayList<String> fragmentText(int i4, String str) {
        int i5;
        int min;
        int i6;
        int i7 = 0;
        GsmAlphabet.TextEncodingDetails calculateLength = 2 == i4 ? com.android.internal.telephony.cdma.SmsMessage.calculateLength(str, false) : com.android.internal.telephony.gsm.SmsMessage.calculateLength(str, false);
        if (calculateLength.codeUnitSize == 1) {
            int i10 = calculateLength.languageTable;
            int i11 = (i10 == 0 || calculateLength.languageShiftTable == 0) ? (i10 == 0 && calculateLength.languageShiftTable == 0) ? 0 : 4 : 7;
            if (calculateLength.msgCount > 1) {
                i11 += 6;
            }
            if (i11 != 0) {
                i11++;
            }
            i5 = 160 - i11;
        } else {
            i5 = calculateLength.msgCount > 1 ? SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER : SmsConstants.MAX_USER_DATA_BYTES;
        }
        int length = str.length();
        ArrayList<String> arrayList = new ArrayList<>(calculateLength.msgCount);
        while (i7 < length) {
            if (calculateLength.codeUnitSize != 1) {
                min = Math.min(i5 / 2, length - i7);
            } else if (i4 != 2 || calculateLength.msgCount != 1) {
                i6 = GsmAlphabet.findGsmSeptetLimitIndex(str, i7, i5, calculateLength.languageTable, calculateLength.languageShiftTable);
                if (i6 > i7 || i6 > length) {
                    break;
                    break;
                }
                arrayList.add(str.substring(i7, i6));
                i7 = i6;
            } else {
                min = Math.min(i5, length - i7);
            }
            i6 = min + i7;
            if (i6 > i7) {
                break;
            }
            arrayList.add(str.substring(i7, i6));
            i7 = i6;
        }
        return arrayList;
    }
}
