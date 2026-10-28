package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;

/* compiled from: ITFWriter.java */
/* loaded from: classes6.dex */
public final class o extends s {

    /* renamed from: d, reason: collision with root package name */
    private static final int f63050d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63051e = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f63048b = {1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f63049c = {3, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    private static final int[][] f63052f = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("୨\u0001"));
        }
        if (length > 80) {
            throw new IllegalArgumentException(ProtectedSandApp.s("୧\u0001").concat(String.valueOf(length)));
        }
        s.d(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int c5 = s.c(zArr, 0, f63048b, true);
        for (int i4 = 0; i4 < length; i4 += 2) {
            int digit = Character.digit(str.charAt(i4), 10);
            int digit2 = Character.digit(str.charAt(i4 + 1), 10);
            int[] iArr = new int[10];
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = i5 * 2;
                int[][] iArr2 = f63052f;
                iArr[i6] = iArr2[digit][i5];
                iArr[i6 + 1] = iArr2[digit2][i5];
            }
            c5 += s.c(zArr, c5, iArr, true);
        }
        s.c(zArr, c5, f63049c, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.ITF);
    }
}
