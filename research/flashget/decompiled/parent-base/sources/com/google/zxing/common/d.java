package com.google.zxing.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CharacterSetECI.java */
/* loaded from: classes6.dex */
public enum d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, ProtectedSandApp.s("\u0a29\u0001")),
    ISO8859_2(4, ProtectedSandApp.s("ਫ\u0001")),
    ISO8859_3(5, ProtectedSandApp.s("ਭ\u0001")),
    ISO8859_4(6, ProtectedSandApp.s("ਯ\u0001")),
    ISO8859_5(7, ProtectedSandApp.s("\u0a31\u0001")),
    ISO8859_6(8, ProtectedSandApp.s("ਲ਼\u0001")),
    ISO8859_7(9, ProtectedSandApp.s("ਵ\u0001")),
    ISO8859_8(10, ProtectedSandApp.s("\u0a37\u0001")),
    ISO8859_9(11, ProtectedSandApp.s("ਹ\u0001")),
    ISO8859_10(12, ProtectedSandApp.s("\u0a3b\u0001")),
    ISO8859_11(13, ProtectedSandApp.s("\u0a3d\u0001")),
    ISO8859_13(15, ProtectedSandApp.s("ਿ\u0001")),
    ISO8859_14(16, ProtectedSandApp.s("ੁ\u0001")),
    ISO8859_15(17, ProtectedSandApp.s("\u0a43\u0001")),
    ISO8859_16(18, ProtectedSandApp.s("\u0a45\u0001")),
    SJIS(20, ProtectedSandApp.s("ੇ\u0001")),
    Cp1250(21, ProtectedSandApp.s("\u0a49\u0001")),
    Cp1251(22, ProtectedSandApp.s("ੋ\u0001")),
    Cp1252(23, ProtectedSandApp.s("੍\u0001")),
    Cp1256(24, ProtectedSandApp.s("\u0a4f\u0001")),
    UnicodeBigUnmarked(25, ProtectedSandApp.s("ੑ\u0001"), ProtectedSandApp.s("\u0a52\u0001")),
    UTF8(26, ProtectedSandApp.s("\u0a54\u0001")),
    ASCII(new int[]{27, 170}, ProtectedSandApp.s("\u0a56\u0001")),
    Big5(28),
    GB18030(29, ProtectedSandApp.s("ਜ਼\u0001"), ProtectedSandApp.s("ਖ਼\u0001"), ProtectedSandApp.s("ਗ਼\u0001")),
    EUC_KR(30, ProtectedSandApp.s("\u0a5d\u0001"));

    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, d> VALUE_TO_ECI = new HashMap();
    private static final Map<String, d> NAME_TO_ECI = new HashMap();

    static {
        for (d dVar : values()) {
            for (int i4 : dVar.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i4), dVar);
            }
            NAME_TO_ECI.put(dVar.name(), dVar);
            for (String str : dVar.otherEncodingNames) {
                NAME_TO_ECI.put(str, dVar);
            }
        }
    }

    d(int i4) {
        this(new int[]{i4}, new String[0]);
    }

    public static d getCharacterSetECIByName(String str) {
        return NAME_TO_ECI.get(str);
    }

    public static d getCharacterSetECIByValue(int i4) throws FormatException {
        if (i4 < 0 || i4 >= 900) {
            throw FormatException.a();
        }
        return VALUE_TO_ECI.get(Integer.valueOf(i4));
    }

    public int getValue() {
        return this.values[0];
    }

    d(int i4, String... strArr) {
        this.values = new int[]{i4};
        this.otherEncodingNames = strArr;
    }

    d(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
