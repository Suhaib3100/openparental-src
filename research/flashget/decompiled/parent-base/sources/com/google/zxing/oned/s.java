package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: OneDimensionalCodeWriter.java */
/* loaded from: classes6.dex */
public abstract class s implements com.google.zxing.r {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f63143a = Pattern.compile(ProtectedSandApp.s("\u0ad6\u0001"));

    protected static int c(boolean[] zArr, int i4, int[] iArr, boolean z4) {
        int i5 = 0;
        for (int i6 : iArr) {
            int i7 = 0;
            while (i7 < i6) {
                zArr[i4] = z4;
                i7++;
                i4++;
            }
            i5 += i6;
            z4 = !z4;
        }
        return i5;
    }

    protected static void d(String str) {
        if (!f63143a.matcher(str).matches()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0ad7\u0001"));
        }
    }

    private static com.google.zxing.common.b h(boolean[] zArr, int i4, int i5, int i6) {
        int length = zArr.length;
        int i7 = i6 + length;
        int max = Math.max(i4, i7);
        int max2 = Math.max(1, i5);
        int i10 = max / i7;
        int i11 = (max - (length * i10)) / 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(max, max2);
        int i12 = 0;
        while (i12 < length) {
            if (zArr[i12]) {
                bVar.t(i11, 0, i10, max2);
            }
            i12++;
            i11 += i10;
        }
        return bVar;
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<com.google.zxing.f, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0adb\u0001"));
        }
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0ada\u0001") + i4 + 'x' + i5);
        }
        Collection<com.google.zxing.a> g4 = g();
        if (g4 != null && !g4.contains(aVar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0ad8\u0001") + g4 + ProtectedSandApp.s("\u0ad9\u0001") + aVar);
        }
        int f4 = f();
        if (map != null) {
            com.google.zxing.f fVar = com.google.zxing.f.MARGIN;
            if (map.containsKey(fVar)) {
                f4 = Integer.parseInt(map.get(fVar).toString());
            }
        }
        return h(e(str), i4, i5, f4);
    }

    @Override // com.google.zxing.r
    public final com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) {
        return a(str, aVar, i4, i5, null);
    }

    public abstract boolean[] e(String str);

    public int f() {
        return 10;
    }

    protected Collection<com.google.zxing.a> g() {
        return null;
    }
}
