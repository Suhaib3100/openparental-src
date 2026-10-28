package com.google.zxing.datamatrix.encoder;

import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.Crop;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: SymbolInfo.java */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    static final k[] f62893i;

    /* renamed from: j, reason: collision with root package name */
    private static k[] f62894j;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f62895a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62896b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62897c;

    /* renamed from: d, reason: collision with root package name */
    public final int f62898d;

    /* renamed from: e, reason: collision with root package name */
    public final int f62899e;

    /* renamed from: f, reason: collision with root package name */
    private final int f62900f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62901g;

    /* renamed from: h, reason: collision with root package name */
    private final int f62902h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1, 3, 5), new k(false, 5, 7, 10, 10, 1, 5, 7), new k(true, 5, 7, 16, 6, 1, 5, 7), new k(false, 8, 10, 12, 12, 1, 8, 10), new k(true, 10, 11, 14, 6, 2, 10, 11), new k(false, 12, 12, 14, 14, 1, 12, 12), new k(true, 16, 14, 24, 10, 1, 16, 14), new k(false, 18, 14, 16, 16, 1, 18, 14), new k(false, 22, 18, 18, 18, 1, 22, 18), new k(true, 22, 18, 16, 10, 2, 22, 18), new k(false, 30, 20, 20, 20, 1, 30, 20), new k(true, 32, 24, 16, 14, 2, 32, 24), new k(false, 36, 24, 22, 22, 1, 36, 24), new k(false, 44, 28, 24, 24, 1, 44, 28), new k(true, 49, 28, 22, 14, 2, 49, 28), new k(false, 62, 36, 14, 14, 4, 62, 36), new k(false, 86, 42, 16, 16, 4, 86, 42), new k(false, 114, 48, 18, 18, 4, 114, 48), new k(false, 144, 56, 20, 20, 4, 144, 56), new k(false, 174, 68, 22, 22, 4, 174, 68), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, SmsConstants.MAX_USER_DATA_BYTES, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, Crop.REQUEST_EDIT_CROP, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, SyslogAppender.LOG_LOCAL1, 56), new k(false, 1050, HttpStatus.SC_REQUEST_TIMEOUT, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f62893i = kVarArr;
        f62894j = kVarArr;
    }

    public k(boolean z4, int i4, int i5, int i6, int i7, int i10) {
        this(z4, i4, i5, i6, i7, i10, i4, i5);
    }

    private int f() {
        int i4 = this.f62900f;
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2 && i4 != 4) {
                if (i4 == 16) {
                    return 4;
                }
                if (i4 == 36) {
                    return 6;
                }
                throw new IllegalStateException(ProtectedSandApp.s("ઑ\u0001"));
            }
        }
        return i5;
    }

    private int l() {
        int i4 = this.f62900f;
        if (i4 == 1 || i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 36) {
            return 6;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ઑ\u0001"));
    }

    public static k m(int i4) {
        return o(i4, l.FORCE_NONE, null, null, true);
    }

    public static k n(int i4, l lVar) {
        return o(i4, lVar, null, null, true);
    }

    public static k o(int i4, l lVar, com.google.zxing.e eVar, com.google.zxing.e eVar2, boolean z4) {
        for (k kVar : f62894j) {
            if (!(lVar == l.FORCE_SQUARE && kVar.f62895a) && ((lVar != l.FORCE_RECTANGLE || kVar.f62895a) && ((eVar == null || (kVar.k() >= eVar.b() && kVar.j() >= eVar.a())) && ((eVar2 == null || (kVar.k() <= eVar2.b() && kVar.j() <= eVar2.a())) && i4 <= kVar.f62896b)))) {
                return kVar;
            }
        }
        if (z4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a92\u0001").concat(String.valueOf(i4)));
        }
        return null;
    }

    private static k p(int i4, l lVar, boolean z4) {
        return o(i4, lVar, null, null, z4);
    }

    public static k q(int i4, boolean z4, boolean z5) {
        return o(i4, z4 ? l.FORCE_NONE : l.FORCE_SQUARE, null, null, z5);
    }

    public static void r(k[] kVarArr) {
        f62894j = kVarArr;
    }

    public int a() {
        return this.f62896b + this.f62897c;
    }

    public final int b() {
        return this.f62896b;
    }

    public int c(int i4) {
        return this.f62901g;
    }

    public final int d() {
        return this.f62897c;
    }

    public final int e(int i4) {
        return this.f62902h;
    }

    public int g() {
        return this.f62896b / this.f62901g;
    }

    public final int h() {
        return l() * this.f62899e;
    }

    public final int i() {
        return f() * this.f62898d;
    }

    public final int j() {
        return h() + (l() << 1);
    }

    public final int k() {
        return i() + (f() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f62895a ? ProtectedSandApp.s("ઓ\u0001") : ProtectedSandApp.s("ઔ\u0001"));
        sb.append(ProtectedSandApp.s("ક\u0001"));
        sb.append(this.f62898d);
        sb.append('x');
        sb.append(this.f62899e);
        sb.append(ProtectedSandApp.s("ખ\u0001"));
        sb.append(k());
        sb.append('x');
        sb.append(j());
        sb.append(ProtectedSandApp.s("ગ\u0001"));
        sb.append(i());
        sb.append('x');
        sb.append(h());
        sb.append(ProtectedSandApp.s("ઘ\u0001"));
        sb.append(this.f62896b);
        sb.append('+');
        sb.append(this.f62897c);
        return sb.toString();
    }

    k(boolean z4, int i4, int i5, int i6, int i7, int i10, int i11, int i12) {
        this.f62895a = z4;
        this.f62896b = i4;
        this.f62897c = i5;
        this.f62898d = i6;
        this.f62899e = i7;
        this.f62900f = i10;
        this.f62901g = i11;
        this.f62902h = i12;
    }
}
