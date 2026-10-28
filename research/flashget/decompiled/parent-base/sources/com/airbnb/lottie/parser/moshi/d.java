package com.airbnb.lottie.parser.moshi;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: JsonScope.java */
/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final int f39250a = 1;

    /* renamed from: b, reason: collision with root package name */
    static final int f39251b = 2;

    /* renamed from: c, reason: collision with root package name */
    static final int f39252c = 3;

    /* renamed from: d, reason: collision with root package name */
    static final int f39253d = 4;

    /* renamed from: e, reason: collision with root package name */
    static final int f39254e = 5;

    /* renamed from: f, reason: collision with root package name */
    static final int f39255f = 6;

    /* renamed from: g, reason: collision with root package name */
    static final int f39256g = 7;

    /* renamed from: h, reason: collision with root package name */
    static final int f39257h = 8;

    private d() {
    }

    static String a(int i4, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ɍ"));
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(iArr2[i5]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append('.');
                String str = strArr[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
