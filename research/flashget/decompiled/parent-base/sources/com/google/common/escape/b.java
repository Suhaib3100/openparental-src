package com.google.common.escape;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* compiled from: ArrayBasedEscaperMap.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final char[][] f56686b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final char[][] f56687a;

    private b(char[][] cArr) {
        this.f56687a = cArr;
    }

    public static b a(Map<Character, String> map) {
        return new b(b(map));
    }

    @d9.d
    static char[][] b(Map<Character, String> map) {
        map.getClass();
        if (map.isEmpty()) {
            return f56686b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }

    char[][] c() {
        return this.f56687a;
    }
}
