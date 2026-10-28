package com.android.internal.telephony;

import android.content.res.Resources;
import android.support.v4.media.b;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.net.SyslogAppender;
import wb.b;

/* loaded from: classes3.dex */
public class GsmAlphabet {
    public static final byte GSM_EXTENDED_ESCAPE = 27;
    private static final String TAG = ProtectedSandApp.s("ط");
    public static final int UDH_SEPTET_COST_CONCATENATED_MESSAGE = 6;
    public static final int UDH_SEPTET_COST_LENGTH = 1;
    public static final int UDH_SEPTET_COST_ONE_SHIFT_TABLE = 4;
    public static final int UDH_SEPTET_COST_TWO_SHIFT_TABLES = 7;
    private static final SparseIntArray[] sCharsToGsmTables;
    private static final SparseIntArray[] sCharsToShiftTables;
    private static boolean sDisableCountryEncodingCheck;
    private static int[] sEnabledLockingShiftTables;
    private static int[] sEnabledSingleShiftTables;
    private static int sHighestEnabledSingleShiftCode;
    private static final String[] sLanguageShiftTables;
    private static final String[] sLanguageTables;

    private static class LanguagePairCount {
        final int languageCode;
        final int[] septetCounts;
        final int[] unencodableCounts;

        LanguagePairCount(int i4) {
            this.languageCode = i4;
            int i5 = GsmAlphabet.sHighestEnabledSingleShiftCode;
            int i6 = i5 + 1;
            this.septetCounts = new int[i6];
            this.unencodableCounts = new int[i6];
            int i7 = 0;
            for (int i10 = 1; i10 <= i5; i10++) {
                if (GsmAlphabet.sEnabledSingleShiftTables[i7] == i10) {
                    i7++;
                } else {
                    this.septetCounts[i10] = -1;
                }
            }
            if (i4 == 1 && i5 >= 1) {
                this.septetCounts[1] = -1;
            } else {
                if (i4 != 3 || i5 < 2) {
                    return;
                }
                this.septetCounts[2] = -1;
            }
        }
    }

    public static class TextEncodingDetails {
        public int codeUnitCount;
        public int codeUnitSize;
        public int codeUnitsRemaining;
        public int languageShiftTable;
        public int languageTable;
        public int msgCount;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ذ"));
            sb.append(this.msgCount);
            sb.append(ProtectedSandApp.s("ر"));
            sb.append(this.codeUnitCount);
            sb.append(ProtectedSandApp.s("ز"));
            sb.append(this.codeUnitsRemaining);
            sb.append(ProtectedSandApp.s("س"));
            sb.append(this.codeUnitSize);
            sb.append(ProtectedSandApp.s("ش"));
            sb.append(this.languageTable);
            sb.append(ProtectedSandApp.s("ص"));
            return b.a(sb, this.languageShiftTable, ProtectedSandApp.s("ض"));
        }
    }

    static {
        String[] strArr = {ProtectedSandApp.s("غ"), ProtectedSandApp.s("ػ"), "", ProtectedSandApp.s("ؼ"), ProtectedSandApp.s("ؽ"), ProtectedSandApp.s("ؾ"), ProtectedSandApp.s("ؿ"), ProtectedSandApp.s("ـ"), ProtectedSandApp.s("ف"), ProtectedSandApp.s("ق"), ProtectedSandApp.s("ك"), ProtectedSandApp.s("ل"), ProtectedSandApp.s("ظ"), ProtectedSandApp.s("ع")};
        sLanguageTables = strArr;
        String[] strArr2 = {ProtectedSandApp.s("ه"), ProtectedSandApp.s("و"), ProtectedSandApp.s("ى"), ProtectedSandApp.s("ي"), ProtectedSandApp.s("ً"), ProtectedSandApp.s("ٌ"), ProtectedSandApp.s("ٍ"), ProtectedSandApp.s("َ"), ProtectedSandApp.s("ُ"), ProtectedSandApp.s("ِ"), ProtectedSandApp.s("ّ"), ProtectedSandApp.s("ْ"), ProtectedSandApp.s("م"), ProtectedSandApp.s("ن")};
        sLanguageShiftTables = strArr2;
        enableCountrySpecificEncodings();
        int length = strArr.length;
        int length2 = strArr2.length;
        sCharsToGsmTables = new SparseIntArray[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str = sLanguageTables[i4];
            int length3 = str.length();
            SparseIntArray sparseIntArray = new SparseIntArray(length3);
            sCharsToGsmTables[i4] = sparseIntArray;
            for (int i5 = 0; i5 < length3; i5++) {
                sparseIntArray.put(str.charAt(i5), i5);
            }
        }
        sCharsToShiftTables = new SparseIntArray[length];
        for (int i6 = 0; i6 < length2; i6++) {
            String str2 = sLanguageShiftTables[i6];
            int length4 = str2.length();
            SparseIntArray sparseIntArray2 = new SparseIntArray(length4);
            sCharsToShiftTables[i6] = sparseIntArray2;
            for (int i7 = 0; i7 < length4; i7++) {
                char charAt = str2.charAt(i7);
                if (charAt != ' ') {
                    sparseIntArray2.put(charAt, i7);
                }
            }
        }
    }

    private GsmAlphabet() {
    }

    public static int charToGsm(char c5) {
        try {
            return charToGsm(c5, false);
        } catch (EncodeException unused) {
            return sCharsToGsmTables[0].get(32, 32);
        }
    }

    public static int charToGsmExtended(char c5) {
        int i4 = sCharsToShiftTables[0].get(c5, -1);
        return i4 == -1 ? sCharsToGsmTables[0].get(32, 32) : i4;
    }

    public static int countGsmSeptets(char c5) {
        try {
            return countGsmSeptets(c5, false);
        } catch (EncodeException unused) {
            return 0;
        }
    }

    public static int countGsmSeptetsUsingTables(CharSequence charSequence, boolean z4, int i4, int i5) {
        int length = charSequence.length();
        SparseIntArray sparseIntArray = sCharsToGsmTables[i4];
        SparseIntArray sparseIntArray2 = sCharsToShiftTables[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            if (charAt != 27) {
                if (sparseIntArray.get(charAt, -1) == -1) {
                    if (sparseIntArray2.get(charAt, -1) != -1) {
                        i6 += 2;
                    } else if (!z4) {
                        return -1;
                    }
                }
                i6++;
            }
        }
        return i6;
    }

    private static void enableCountrySpecificEncodings() {
        Resources system = Resources.getSystem();
        sEnabledSingleShiftTables = system.getIntArray(b.c.b);
        sEnabledLockingShiftTables = system.getIntArray(b.c.a);
        int[] iArr = sEnabledSingleShiftTables;
        if (iArr.length > 0) {
            sHighestEnabledSingleShiftCode = iArr[iArr.length - 1];
        } else {
            sHighestEnabledSingleShiftCode = 0;
        }
    }

    public static int findGsmSeptetLimitIndex(String str, int i4, int i5, int i6, int i7) {
        int length = str.length();
        SparseIntArray sparseIntArray = sCharsToGsmTables[i6];
        SparseIntArray sparseIntArray2 = sCharsToShiftTables[i7];
        int i10 = 0;
        while (i4 < length) {
            i10 = (sparseIntArray.get(str.charAt(i4), -1) != -1 || sparseIntArray2.get(str.charAt(i4), -1) == -1) ? i10 + 1 : i10 + 2;
            if (i10 > i5) {
                return i4;
            }
            i4++;
        }
        return length;
    }

    static synchronized int[] getEnabledLockingShiftTables() {
        int[] iArr;
        synchronized (GsmAlphabet.class) {
            iArr = sEnabledLockingShiftTables;
        }
        return iArr;
    }

    static synchronized int[] getEnabledSingleShiftTables() {
        int[] iArr;
        synchronized (GsmAlphabet.class) {
            iArr = sEnabledSingleShiftTables;
        }
        return iArr;
    }

    public static String gsm7BitPackedToString(byte[] bArr, int i4, int i5) {
        return gsm7BitPackedToString(bArr, i4, i5, 0, 0, 0);
    }

    public static String gsm8BitUnpackedToString(byte[] bArr, int i4, int i5) {
        return gsm8BitUnpackedToString(bArr, i4, i5, "");
    }

    public static char gsmExtendedToChar(int i4) {
        if (i4 == 27 || i4 < 0 || i4 >= 128) {
            return ' ';
        }
        char charAt = sLanguageShiftTables[0].charAt(i4);
        return charAt == ' ' ? sLanguageTables[0].charAt(i4) : charAt;
    }

    public static char gsmToChar(int i4) {
        if (i4 < 0 || i4 >= 128) {
            return ' ';
        }
        return sLanguageTables[0].charAt(i4);
    }

    private static void packSmsChar(byte[] bArr, int i4, int i5) {
        int i6 = i4 / 8;
        int i7 = i4 % 8;
        int i10 = i6 + 1;
        bArr[i10] = (byte) (bArr[i10] | (i5 << i7));
        if (i7 > 1) {
            bArr[i6 + 2] = (byte) (i5 >> (8 - i7));
        }
    }

    static synchronized void setEnabledLockingShiftTables(int[] iArr) {
        synchronized (GsmAlphabet.class) {
            sEnabledLockingShiftTables = iArr;
            sDisableCountryEncodingCheck = true;
        }
    }

    static synchronized void setEnabledSingleShiftTables(int[] iArr) {
        synchronized (GsmAlphabet.class) {
            try {
                sEnabledSingleShiftTables = iArr;
                sDisableCountryEncodingCheck = true;
                if (iArr.length > 0) {
                    sHighestEnabledSingleShiftCode = iArr[iArr.length - 1];
                } else {
                    sHighestEnabledSingleShiftCode = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] stringToGsm7BitPacked(String str) throws EncodeException {
        return stringToGsm7BitPacked(str, 0, true, 0, 0);
    }

    public static byte[] stringToGsm7BitPackedWithHeader(String str, byte[] bArr) throws EncodeException {
        return stringToGsm7BitPackedWithHeader(str, bArr, 0, 0);
    }

    public static byte[] stringToGsm8BitPacked(String str) {
        int countGsmSeptetsUsingTables = countGsmSeptetsUsingTables(str, true, 0, 0);
        byte[] bArr = new byte[countGsmSeptetsUsingTables];
        stringToGsm8BitUnpackedField(str, bArr, 0, countGsmSeptetsUsingTables);
        return bArr;
    }

    public static void stringToGsm8BitUnpackedField(String str, byte[] bArr, int i4, int i5) {
        int i6 = 0;
        SparseIntArray sparseIntArray = sCharsToGsmTables[0];
        SparseIntArray sparseIntArray2 = sCharsToShiftTables[0];
        int length = str.length();
        int i7 = i4;
        while (i6 < length && i7 - i4 < i5) {
            char charAt = str.charAt(i6);
            int i10 = sparseIntArray.get(charAt, -1);
            if (i10 == -1) {
                i10 = sparseIntArray2.get(charAt, -1);
                if (i10 == -1) {
                    i10 = sparseIntArray.get(32, 32);
                } else {
                    int i11 = i7 + 1;
                    if (i11 - i4 >= i5) {
                        break;
                    }
                    bArr[i7] = 27;
                    i7 = i11;
                }
            }
            bArr[i7] = (byte) i10;
            i6++;
            i7++;
        }
        while (i7 - i4 < i5) {
            bArr[i7] = -1;
            i7++;
        }
    }

    public static int countGsmSeptets(char c5, boolean z4) throws EncodeException {
        if (sCharsToGsmTables[0].get(c5, -1) != -1) {
            return 1;
        }
        if (sCharsToShiftTables[0].get(c5, -1) != -1) {
            return 2;
        }
        if (z4) {
            throw new EncodeException(c5);
        }
        return 1;
    }

    public static String gsm7BitPackedToString(byte[] bArr, int i4, int i5, int i6, int i7, int i10) {
        StringBuilder sb = new StringBuilder(i5);
        if (i7 < 0 || i7 > sLanguageTables.length) {
            i7 = 0;
        }
        if (i10 < 0 || i10 > sLanguageShiftTables.length) {
            i10 = 0;
        }
        try {
            String[] strArr = sLanguageTables;
            String str = strArr[i7];
            String[] strArr2 = sLanguageShiftTables;
            String str2 = strArr2[i10];
            if (str.isEmpty()) {
                str = strArr[0];
            }
            if (str2.isEmpty()) {
                str2 = strArr2[0];
            }
            boolean z4 = false;
            for (int i11 = 0; i11 < i5; i11++) {
                int i12 = (i11 * 7) + i6;
                int i13 = i12 / 8;
                int i14 = i12 % 8;
                int i15 = i13 + i4;
                int i16 = (bArr[i15] >> i14) & 127;
                if (i14 > 1) {
                    i16 = (i16 & (127 >> (i14 - 1))) | ((bArr[i15 + 1] << (8 - i14)) & 127);
                }
                if (z4) {
                    if (i16 == 27) {
                        sb.append(' ');
                    } else {
                        char charAt = str2.charAt(i16);
                        if (charAt == ' ') {
                            sb.append(str.charAt(i16));
                        } else {
                            sb.append(charAt);
                        }
                    }
                    z4 = false;
                } else if (i16 == 27) {
                    z4 = true;
                } else {
                    sb.append(str.charAt(i16));
                }
            }
            return sb.toString();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static String gsm8BitUnpackedToString(byte[] bArr, int i4, int i5, String str) {
        Charset charset;
        ByteBuffer byteBuffer;
        boolean z4;
        int i6;
        int i7;
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(ProtectedSandApp.s("ٓ")) || !Charset.isSupported(str)) {
            charset = null;
            byteBuffer = null;
            z4 = false;
        } else {
            charset = Charset.forName(str);
            byteBuffer = ByteBuffer.allocate(2);
            z4 = true;
        }
        String str2 = sLanguageTables[0];
        String str3 = sLanguageShiftTables[0];
        StringBuilder sb = new StringBuilder(i5);
        int i10 = i4;
        boolean z5 = false;
        while (true) {
            int i11 = i4 + i5;
            if (i10 >= i11 || (i6 = bArr[i10] & 255) == 255) {
                break;
            }
            if (i6 == 27) {
                if (z5) {
                    sb.append(' ');
                } else {
                    z5 = true;
                    i10++;
                }
            } else if (z5) {
                char charAt = str3.charAt(i6);
                if (charAt == ' ') {
                    sb.append(str2.charAt(i6));
                } else {
                    sb.append(charAt);
                }
            } else if (!z4 || i6 < 128 || (i7 = i10 + 1) >= i11) {
                sb.append(str2.charAt(i6));
            } else {
                byteBuffer.clear();
                byteBuffer.put(bArr, i10, 2);
                byteBuffer.flip();
                sb.append(charset.decode(byteBuffer).toString());
                i10 = i7;
            }
            z5 = false;
            i10++;
        }
        return sb.toString();
    }

    public static byte[] stringToGsm7BitPacked(String str, int i4, int i5) throws EncodeException {
        return stringToGsm7BitPacked(str, 0, true, i4, i5);
    }

    public static byte[] stringToGsm7BitPackedWithHeader(String str, byte[] bArr, int i4, int i5) throws EncodeException {
        if (bArr == null || bArr.length == 0) {
            return stringToGsm7BitPacked(str, i4, i5);
        }
        byte[] stringToGsm7BitPacked = stringToGsm7BitPacked(str, (((bArr.length + 1) * 8) + 6) / 7, true, i4, i5);
        stringToGsm7BitPacked[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, stringToGsm7BitPacked, 2, bArr.length);
        return stringToGsm7BitPacked;
    }

    public static int charToGsm(char c5, boolean z4) throws EncodeException {
        SparseIntArray[] sparseIntArrayArr = sCharsToGsmTables;
        int i4 = sparseIntArrayArr[0].get(c5, -1);
        if (i4 != -1) {
            return i4;
        }
        if (sCharsToShiftTables[0].get(c5, -1) != -1) {
            return 27;
        }
        if (!z4) {
            return sparseIntArrayArr[0].get(32, 32);
        }
        throw new EncodeException(c5);
    }

    public static byte[] stringToGsm7BitPacked(String str, int i4, boolean z4, int i5, int i6) throws EncodeException {
        int length = str.length();
        int countGsmSeptetsUsingTables = countGsmSeptetsUsingTables(str, !z4, i5, i6);
        if (countGsmSeptetsUsingTables == -1) {
            throw new EncodeException(ProtectedSandApp.s("ٖ"));
        }
        int i7 = countGsmSeptetsUsingTables + i4;
        if (i7 <= 255) {
            byte[] bArr = new byte[(((i7 * 7) + 7) / 8) + 1];
            SparseIntArray sparseIntArray = sCharsToGsmTables[i5];
            SparseIntArray sparseIntArray2 = sCharsToShiftTables[i6];
            int i10 = i4 * 7;
            int i11 = 0;
            while (i11 < length && i4 < i7) {
                char charAt = str.charAt(i11);
                int i12 = sparseIntArray.get(charAt, -1);
                if (i12 == -1) {
                    i12 = sparseIntArray2.get(charAt, -1);
                    if (i12 != -1) {
                        packSmsChar(bArr, i10, 27);
                        i10 += 7;
                        i4++;
                    } else if (!z4) {
                        i12 = sparseIntArray.get(32, 32);
                    } else {
                        throw new EncodeException(ProtectedSandApp.s("ٔ"));
                    }
                }
                packSmsChar(bArr, i10, i12);
                i4++;
                i11++;
                i10 += 7;
            }
            bArr[0] = (byte) i7;
            return bArr;
        }
        throw new EncodeException(ProtectedSandApp.s("ٕ"));
    }

    public static TextEncodingDetails countGsmSeptets(CharSequence charSequence, boolean z4) {
        int i4;
        int i5;
        int i6;
        if (!sDisableCountryEncodingCheck) {
            enableCountrySpecificEncodings();
        }
        int i7 = 160;
        int i10 = -1;
        int i11 = 0;
        if (sEnabledSingleShiftTables.length + sEnabledLockingShiftTables.length == 0) {
            TextEncodingDetails textEncodingDetails = new TextEncodingDetails();
            int countGsmSeptetsUsingTables = countGsmSeptetsUsingTables(charSequence, z4, 0, 0);
            if (countGsmSeptetsUsingTables == -1) {
                return null;
            }
            textEncodingDetails.codeUnitSize = 1;
            textEncodingDetails.codeUnitCount = countGsmSeptetsUsingTables;
            if (countGsmSeptetsUsingTables > 160) {
                int i12 = (countGsmSeptetsUsingTables + SyslogAppender.LOG_LOCAL3) / SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER;
                textEncodingDetails.msgCount = i12;
                textEncodingDetails.codeUnitsRemaining = (i12 * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) - countGsmSeptetsUsingTables;
            } else {
                textEncodingDetails.msgCount = 1;
                textEncodingDetails.codeUnitsRemaining = 160 - countGsmSeptetsUsingTables;
            }
            textEncodingDetails.codeUnitSize = 1;
            return textEncodingDetails;
        }
        int i13 = sHighestEnabledSingleShiftCode;
        ArrayList arrayList = new ArrayList(sEnabledLockingShiftTables.length + 1);
        arrayList.add(new LanguagePairCount(0));
        for (int i14 : sEnabledLockingShiftTables) {
            if (i14 != 0 && !sLanguageTables[i14].isEmpty()) {
                arrayList.add(new LanguagePairCount(i14));
            }
        }
        int length = charSequence.length();
        int i15 = 0;
        while (i15 < length && !arrayList.isEmpty()) {
            char charAt = charSequence.charAt(i15);
            if (charAt != 27) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LanguagePairCount languagePairCount = (LanguagePairCount) it.next();
                    if (sCharsToGsmTables[languagePairCount.languageCode].get(charAt, -1) == -1) {
                        for (int i16 = i11; i16 <= i13; i16++) {
                            if (languagePairCount.septetCounts[i16] != -1) {
                                if (sCharsToShiftTables[i16].get(charAt, -1) != -1) {
                                    int[] iArr = languagePairCount.septetCounts;
                                    iArr[i16] = iArr[i16] + 2;
                                } else if (z4) {
                                    int[] iArr2 = languagePairCount.septetCounts;
                                    iArr2[i16] = iArr2[i16] + 1;
                                    int[] iArr3 = languagePairCount.unencodableCounts;
                                    iArr3[i16] = iArr3[i16] + 1;
                                } else {
                                    languagePairCount.septetCounts[i16] = -1;
                                }
                            }
                        }
                    } else {
                        for (int i17 = i11; i17 <= i13; i17++) {
                            int[] iArr4 = languagePairCount.septetCounts;
                            int i18 = iArr4[i17];
                            if (i18 != -1) {
                                iArr4[i17] = i18 + 1;
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            i15++;
            i11 = 0;
        }
        TextEncodingDetails textEncodingDetails2 = new TextEncodingDetails();
        textEncodingDetails2.msgCount = Integer.MAX_VALUE;
        textEncodingDetails2.codeUnitSize = 1;
        Iterator it2 = arrayList.iterator();
        int i19 = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            LanguagePairCount languagePairCount2 = (LanguagePairCount) it2.next();
            int i20 = 0;
            while (i20 <= i13) {
                int i21 = languagePairCount2.septetCounts[i20];
                if (i21 != i10) {
                    int i22 = languagePairCount2.languageCode;
                    int i23 = (i22 == 0 || i20 == 0) ? (i22 == 0 && i20 == 0) ? 0 : 5 : 8;
                    if (i21 + i23 > i7) {
                        if (i23 == 0) {
                            i23 = 1;
                        }
                        int i24 = 160 - (i23 + 6);
                        i5 = ((i21 + i24) - 1) / i24;
                        i4 = (i24 * i5) - i21;
                    } else {
                        i4 = (160 - i23) - i21;
                        i5 = 1;
                    }
                    int i25 = languagePairCount2.unencodableCounts[i20];
                    if ((!z4 || i25 <= i19) && ((z4 && i25 < i19) || i5 < (i6 = textEncodingDetails2.msgCount) || (i5 == i6 && i4 > textEncodingDetails2.codeUnitsRemaining))) {
                        textEncodingDetails2.msgCount = i5;
                        textEncodingDetails2.codeUnitCount = i21;
                        textEncodingDetails2.codeUnitsRemaining = i4;
                        textEncodingDetails2.languageTable = i22;
                        textEncodingDetails2.languageShiftTable = i20;
                        i19 = i25;
                    }
                }
                i20++;
                i7 = 160;
                i10 = -1;
            }
        }
        if (textEncodingDetails2.msgCount == Integer.MAX_VALUE) {
            return null;
        }
        return textEncodingDetails2;
    }
}
