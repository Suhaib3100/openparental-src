package org.apache.commons.text.lookup;

import androidx.compose.material3.z3;
import org.apache.commons.lang3.b1;

/* compiled from: AbstractStringLookup.java */
/* loaded from: classes3.dex */
abstract class a implements t {

    /* renamed from: a, reason: collision with root package name */
    protected static final char f86485a = ':';

    /* renamed from: b, reason: collision with root package name */
    protected static final String f86486b = String.valueOf(f86485a);

    a() {
    }

    static String e(String str, String str2) {
        return f(str, f86486b, str2);
    }

    static String f(String str, String str2, String str3) {
        return z3.a(str, str2, str3);
    }

    @Deprecated
    protected String b(String str, char c5) {
        return b1.e3(str, c5);
    }

    @Deprecated
    protected String c(String str, String str2) {
        return b1.f3(str, str2);
    }

    @Deprecated
    protected String d(String str, char c5) {
        return b1.g3(str, c5);
    }
}
