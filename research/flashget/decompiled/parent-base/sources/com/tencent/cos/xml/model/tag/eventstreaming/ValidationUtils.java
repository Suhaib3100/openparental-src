package com.tencent.cos.xml.model.tag.eventstreaming;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;

/* loaded from: classes7.dex */
public class ValidationUtils {
    public static void assertAllAreNull(String str, Object... objArr) throws IllegalArgumentException {
        for (Object obj : objArr) {
            if (obj != null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static int assertIsPositive(int i4, String str) {
        if (i4 > 0) {
            return i4;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("亨\u0001"), str));
    }

    public static <T extends Collection<?>> T assertNotEmpty(T t4, String str) throws IllegalArgumentException {
        assertNotNull(t4, str);
        if (t4.isEmpty()) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("亩\u0001"), str));
        }
        return t4;
    }

    public static <T> T assertNotNull(T t4, String str) throws IllegalArgumentException {
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("亪\u0001"), str));
    }

    public static String assertStringNotEmpty(String str, String str2) throws IllegalArgumentException {
        assertNotNull(str, str2);
        if (str.isEmpty()) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("亩\u0001"), str2));
        }
        return str;
    }

    public static <T> T[] assertNotEmpty(T[] tArr, String str) throws IllegalArgumentException {
        assertNotNull(tArr, str);
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("亩\u0001"), str));
    }
}
