package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes6.dex */
class h implements c {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f58937d = Charset.forName(ProtectedSandApp.s("ﴳ"));

    /* renamed from: a, reason: collision with root package name */
    private final File f58938a;

    /* renamed from: b, reason: collision with root package name */
    private final int f58939b;

    /* renamed from: c, reason: collision with root package name */
    private g f58940c;

    /* compiled from: QueueFileLogStore.java */
    class a implements g.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f58941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f58942b;

        a(byte[] bArr, int[] iArr) {
            this.f58941a = bArr;
            this.f58942b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.g.d
        public void a(InputStream inputStream, int i4) throws IOException {
            try {
                inputStream.read(this.f58941a, this.f58942b[0], i4);
                int[] iArr = this.f58942b;
                iArr[0] = iArr[0] + i4;
            } finally {
                inputStream.close();
            }
        }
    }

    /* compiled from: QueueFileLogStore.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f58944a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58945b;

        b(byte[] bArr, int i4) {
            this.f58944a = bArr;
            this.f58945b = i4;
        }
    }

    h(File file, int i4) {
        this.f58938a = file;
        this.f58939b = i4;
    }

    private void f(long j4, String str) {
        String s4 = ProtectedSandApp.s("ﴴ");
        String s5 = ProtectedSandApp.s("ﴵ");
        if (this.f58940c == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("ﴶ");
        }
        try {
            int i4 = this.f58939b / 4;
            if (str.length() > i4) {
                str = s5 + str.substring(str.length() - i4);
            }
            this.f58940c.e(String.format(Locale.US, ProtectedSandApp.s("ﴹ"), Long.valueOf(j4), str.replaceAll(ProtectedSandApp.s("ﴷ"), s4).replaceAll(ProtectedSandApp.s("ﴸ"), s4)).getBytes(f58937d));
            while (!this.f58940c.m() && this.f58940c.F() > this.f58939b) {
                this.f58940c.z();
            }
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﴺ"), e4);
        }
    }

    private b g() {
        if (!this.f58938a.exists()) {
            return null;
        }
        h();
        g gVar = this.f58940c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.F()];
        try {
            this.f58940c.i(new a(bArr, iArr));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﴻ"), e4);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f58940c == null) {
            try {
                this.f58940c = new g(this.f58938a);
            } catch (IOException e4) {
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﴼ") + this.f58938a, e4);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public void a() {
        com.google.firebase.crashlytics.internal.common.i.f(this.f58940c, ProtectedSandApp.s("ﴽ"));
        this.f58940c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public String b() {
        byte[] c5 = c();
        if (c5 != null) {
            return new String(c5, f58937d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public byte[] c() {
        b g4 = g();
        if (g4 == null) {
            return null;
        }
        int i4 = g4.f58945b;
        byte[] bArr = new byte[i4];
        System.arraycopy(g4.f58944a, 0, bArr, 0, i4);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public void d() {
        a();
        this.f58938a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public void e(long j4, String str) {
        h();
        f(j4, str);
    }
}
