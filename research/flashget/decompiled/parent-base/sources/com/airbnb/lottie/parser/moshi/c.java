package com.airbnb.lottie.parser.moshi;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.d0;
import okio.m;
import okio.o;
import okio.p;

/* compiled from: JsonReader.java */
/* loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f39241h = new String[128];

    /* renamed from: b, reason: collision with root package name */
    int f39242b;

    /* renamed from: c, reason: collision with root package name */
    int[] f39243c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    String[] f39244d = new String[32];

    /* renamed from: e, reason: collision with root package name */
    int[] f39245e = new int[32];

    /* renamed from: f, reason: collision with root package name */
    boolean f39246f;

    /* renamed from: g, reason: collision with root package name */
    boolean f39247g;

    /* compiled from: JsonReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f39248a;

        /* renamed from: b, reason: collision with root package name */
        final d0 f39249b;

        private a(String[] strArr, d0 d0Var) {
            this.f39248a = strArr;
            this.f39249b = d0Var;
        }

        public static a a(String... strArr) {
            try {
                p[] pVarArr = new p[strArr.length];
                m mVar = new m();
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    c.u(mVar, strArr[i4]);
                    mVar.readByte();
                    pVarArr[i4] = mVar.b3();
                }
                return new a((String[]) strArr.clone(), d0.m(pVarArr));
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    /* compiled from: JsonReader.java */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f39241h[i4] = String.format(ProtectedSandApp.s("ɀ"), Integer.valueOf(i4));
        }
        String[] strArr = f39241h;
        strArr[34] = ProtectedSandApp.s("Ɂ");
        strArr[92] = ProtectedSandApp.s("ɂ");
        strArr[9] = ProtectedSandApp.s("Ƀ");
        strArr[8] = ProtectedSandApp.s("Ʉ");
        strArr[10] = ProtectedSandApp.s("Ʌ");
        strArr[13] = ProtectedSandApp.s("Ɇ");
        strArr[12] = ProtectedSandApp.s("ɇ");
    }

    c() {
    }

    public static c m(o oVar) {
        return new f(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(okio.n r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.c.f39241h
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L3e
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L31
            goto L3b
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L27
            java.lang.String r5 = "Ɉ"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            goto L31
        L27:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3b
            java.lang.String r5 = "ɉ"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
        L31:
            if (r4 >= r3) goto L36
            r7.a1(r8, r4, r3)
        L36:
            r7.Q0(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Ld
        L3e:
            if (r4 >= r2) goto L43
            r7.a1(r8, r4, r2)
        L43:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.c.u(okio.n, java.lang.String):void");
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public abstract boolean f() throws IOException;

    public abstract boolean g() throws IOException;

    public final String getPath() {
        return d.a(this.f39242b, this.f39243c, this.f39244d, this.f39245e);
    }

    public abstract double h() throws IOException;

    public abstract int i() throws IOException;

    public abstract String k() throws IOException;

    public abstract String l() throws IOException;

    public abstract b n() throws IOException;

    final void o(int i4) {
        int i5 = this.f39242b;
        int[] iArr = this.f39243c;
        if (i5 == iArr.length) {
            if (i5 == 256) {
                throw new com.airbnb.lottie.parser.moshi.a(ProtectedSandApp.s("Ɋ") + getPath());
            }
            this.f39243c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f39244d;
            this.f39244d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f39245e;
            this.f39245e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f39243c;
        int i6 = this.f39242b;
        this.f39242b = i6 + 1;
        iArr3[i6] = i4;
    }

    public abstract int q(a aVar) throws IOException;

    public abstract void s() throws IOException;

    public abstract void t() throws IOException;

    final com.airbnb.lottie.parser.moshi.b x(String str) throws com.airbnb.lottie.parser.moshi.b {
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("ɋ"));
        a5.append(getPath());
        throw new com.airbnb.lottie.parser.moshi.b(a5.toString());
    }
}
