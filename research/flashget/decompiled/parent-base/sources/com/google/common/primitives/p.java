package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ParseRequest.java */
@f
@d9.b
/* loaded from: classes6.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    final String f57528a;

    /* renamed from: b, reason: collision with root package name */
    final int f57529b;

    private p(String str, int i4) {
        this.f57528a = str;
        this.f57529b = i4;
    }

    static p a(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException(ProtectedSandApp.s("\uf8d3"));
        }
        char charAt = str.charAt(0);
        int i4 = 16;
        if (str.startsWith(ProtectedSandApp.s("\uf8d1")) || str.startsWith(ProtectedSandApp.s("\uf8d2"))) {
            str = str.substring(2);
        } else if (charAt == '#') {
            str = str.substring(1);
        } else if (charAt != '0' || str.length() <= 1) {
            i4 = 10;
        } else {
            str = str.substring(1);
            i4 = 8;
        }
        return new p(str, i4);
    }
}
