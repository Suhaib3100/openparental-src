package com.google.zxing.datamatrix.decoder;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.google.zxing.FormatException;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Version.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final e[] f62843h = a();

    /* renamed from: a, reason: collision with root package name */
    private final int f62844a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62845b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62846c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62847d;

    /* renamed from: e, reason: collision with root package name */
    private final int f62848e;

    /* renamed from: f, reason: collision with root package name */
    private final c f62849f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62850g;

    /* compiled from: Version.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f62851a;

        /* renamed from: b, reason: collision with root package name */
        private final int f62852b;

        int a() {
            return this.f62851a;
        }

        int b() {
            return this.f62852b;
        }

        private b(int i4, int i5) {
            this.f62851a = i4;
            this.f62852b = i5;
        }
    }

    private e(int i4, int i5, int i6, int i7, int i10, c cVar) {
        this.f62844a = i4;
        this.f62845b = i5;
        this.f62846c = i6;
        this.f62847d = i7;
        this.f62848e = i10;
        this.f62849f = cVar;
        int b5 = cVar.b();
        int i11 = 0;
        for (b bVar : cVar.a()) {
            i11 += (bVar.b() + b5) * bVar.a();
        }
        this.f62850g = i11;
    }

    private static e[] a() {
        int i4 = 1;
        int i5 = 5;
        e eVar = new e(1, 10, 10, 8, 8, new c(i5, new b(i4, 3)));
        e eVar2 = new e(2, 12, 12, 10, 10, new c(7, new b(i4, i5)));
        e eVar3 = new e(3, 14, 14, 12, 12, new c(10, new b(i4, 8)));
        int i6 = 12;
        e eVar4 = new e(4, 16, 16, 14, 14, new c(i6, new b(i4, i6)));
        int i7 = 18;
        e eVar5 = new e(5, 18, 18, 16, 16, new c(14, new b(i4, i7)));
        e eVar6 = new e(6, 20, 20, 18, 18, new c(i7, new b(i4, 22)));
        e eVar7 = new e(7, 22, 22, 20, 20, new c(20, new b(i4, 30)));
        int i10 = 36;
        e eVar8 = new e(8, 24, 24, 22, 22, new c(24, new b(i4, i10)));
        e eVar9 = new e(9, 26, 26, 24, 24, new c(28, new b(i4, 44)));
        e eVar10 = new e(10, 32, 32, 14, 14, new c(i10, new b(i4, 62)));
        int i11 = 42;
        int i12 = 56;
        int i13 = 2;
        int i14 = 4;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, new e(11, 36, 36, 16, 16, new c(i11, new b(i4, 86))), new e(12, 40, 40, 18, 18, new c(48, new b(i4, 114))), new e(13, 44, 44, 20, 20, new c(i12, new b(i4, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(i4, 174))), new e(15, 52, 52, 24, 24, new c(i11, new b(i13, 102))), new e(16, 64, 64, 14, 14, new c(i12, new b(i13, SmsConstants.MAX_USER_DATA_BYTES))), new e(17, 72, 72, 16, 16, new c(36, new b(i14, 92))), new e(18, 80, 80, 18, 18, new c(48, new b(i14, 114))), new e(19, 88, 88, 20, 20, new c(i12, new b(i14, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(i14, 174))), new e(21, 104, 104, 24, 24, new c(i12, new b(6, SyslogAppender.LOG_LOCAL1))), new e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new e(23, UserData.IS91_MSG_TYPE_CLI, UserData.IS91_MSG_TYPE_CLI, 20, 20, new c(62, new b(8, 163))), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(i13, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i4, int i5) throws FormatException {
        if ((i4 & 1) != 0 || (i5 & 1) != 0) {
            throw FormatException.a();
        }
        for (e eVar : f62843h) {
            if (eVar.f62845b == i4 && eVar.f62846c == i5) {
                return eVar;
            }
        }
        throw FormatException.a();
    }

    public int b() {
        return this.f62848e;
    }

    public int c() {
        return this.f62847d;
    }

    c d() {
        return this.f62849f;
    }

    public int e() {
        return this.f62846c;
    }

    public int f() {
        return this.f62845b;
    }

    public int g() {
        return this.f62850g;
    }

    public int i() {
        return this.f62844a;
    }

    public String toString() {
        return String.valueOf(this.f62844a);
    }

    /* compiled from: Version.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f62853a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f62854b;

        b[] a() {
            return this.f62854b;
        }

        int b() {
            return this.f62853a;
        }

        private c(int i4, b bVar) {
            this.f62853a = i4;
            this.f62854b = new b[]{bVar};
        }

        private c(int i4, b bVar, b bVar2) {
            this.f62853a = i4;
            this.f62854b = new b[]{bVar, bVar2};
        }
    }
}
