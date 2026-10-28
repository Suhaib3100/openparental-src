package com.google.zxing.common.reedsolomon;

import androidx.view.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.TXLiveConstants;

/* compiled from: GenericGF.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f62811h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f62812i = new a(TXLiveConstants.PUSH_EVT_ROOM_USER_VIDEO_STATE, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f62813j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f62814k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f62815l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f62816m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f62817n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f62818o;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f62819a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f62820b;

    /* renamed from: c, reason: collision with root package name */
    private final b f62821c;

    /* renamed from: d, reason: collision with root package name */
    private final b f62822d;

    /* renamed from: e, reason: collision with root package name */
    private final int f62823e;

    /* renamed from: f, reason: collision with root package name */
    private final int f62824f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62825g;

    static {
        a aVar = new a(67, 64, 1);
        f62813j = aVar;
        f62814k = new a(19, 16, 1);
        f62815l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f62816m = aVar2;
        f62817n = aVar2;
        f62818o = aVar;
    }

    public a(int i4, int i5, int i6) {
        this.f62824f = i4;
        this.f62823e = i5;
        this.f62825g = i6;
        this.f62819a = new int[i5];
        this.f62820b = new int[i5];
        int i7 = 1;
        for (int i10 = 0; i10 < i5; i10++) {
            this.f62819a[i10] = i7;
            i7 <<= 1;
            if (i7 >= i5) {
                i7 = (i7 ^ i4) & (i5 - 1);
            }
        }
        for (int i11 = 0; i11 < i5 - 1; i11++) {
            this.f62820b[this.f62819a[i11]] = i11;
        }
        this.f62821c = new b(this, new int[]{0});
        this.f62822d = new b(this, new int[]{1});
    }

    static int a(int i4, int i5) {
        return i4 ^ i5;
    }

    b b(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i5 == 0) {
            return this.f62821c;
        }
        int[] iArr = new int[i4 + 1];
        iArr[0] = i5;
        return new b(this, iArr);
    }

    int c(int i4) {
        return this.f62819a[i4];
    }

    public int d() {
        return this.f62825g;
    }

    b e() {
        return this.f62822d;
    }

    public int f() {
        return this.f62823e;
    }

    b g() {
        return this.f62821c;
    }

    int h(int i4) {
        if (i4 != 0) {
            return this.f62819a[(this.f62823e - this.f62820b[i4]) - 1];
        }
        throw new ArithmeticException();
    }

    int i(int i4) {
        if (i4 != 0) {
            return this.f62820b[i4];
        }
        throw new IllegalArgumentException();
    }

    int j(int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            return 0;
        }
        int[] iArr = this.f62819a;
        int[] iArr2 = this.f62820b;
        return iArr[(iArr2[i4] + iArr2[i5]) % (this.f62823e - 1)];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0a64\u0001"));
        sb.append(Integer.toHexString(this.f62824f));
        sb.append(',');
        return e.a(sb, this.f62823e, ')');
    }
}
