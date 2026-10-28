package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes3.dex */
class h implements c {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f15835d = Charset.forName(ProtectedSandApp.s("⡐"));

    /* renamed from: a, reason: collision with root package name */
    private final File f15836a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15837b;

    /* renamed from: c, reason: collision with root package name */
    private g f15838c;

    /* compiled from: QueueFileLogStore.java */
    class a implements g.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f15839a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f15840b;

        a(byte[] bArr, int[] iArr) {
            this.f15839a = bArr;
            this.f15840b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.g.d
        public void b(InputStream inputStream, int i5) throws IOException {
            try {
                inputStream.read(this.f15839a, this.f15840b[0], i5);
                int[] iArr = this.f15840b;
                iArr[0] = iArr[0] + i5;
            } finally {
                inputStream.close();
            }
        }
    }

    /* compiled from: QueueFileLogStore.java */
    /* loaded from: classes2.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f15842a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15843b;

        b(byte[] bArr, int i5) {
            this.f15842a = bArr;
            this.f15843b = i5;
        }
    }

    h(File file, int i5) {
        this.f15836a = file;
        this.f15837b = i5;
    }

    private void f(long j5, String str) {
        String s5 = ProtectedSandApp.s("⡑");
        String s6 = ProtectedSandApp.s("⡒");
        if (this.f15838c == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("⡓");
        }
        try {
            int i5 = this.f15837b / 4;
            if (str.length() > i5) {
                str = s6 + str.substring(str.length() - i5);
            }
            this.f15838c.e(String.format(Locale.US, ProtectedSandApp.s("⡖"), Long.valueOf(j5), str.replaceAll(ProtectedSandApp.s("⡔"), s5).replaceAll(ProtectedSandApp.s("⡕"), s5)).getBytes(f15835d));
            while (!this.f15838c.o() && this.f15838c.X() > this.f15837b) {
                this.f15838c.H();
            }
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("⡗"), e6);
        }
    }

    private b g() {
        if (!this.f15836a.exists()) {
            return null;
        }
        h();
        g gVar = this.f15838c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.X()];
        try {
            this.f15838c.l(new a(bArr, iArr));
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("⡘"), e6);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f15838c == null) {
            try {
                this.f15838c = new g(this.f15836a);
            } catch (IOException e6) {
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("⡙") + this.f15836a, e6);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public void a() {
        com.google.firebase.crashlytics.internal.common.i.f(this.f15838c, ProtectedSandApp.s("⡚"));
        this.f15838c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public String b() {
        byte[] c6 = c();
        if (c6 != null) {
            return new String(c6, f15835d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public byte[] c() {
        b g5 = g();
        if (g5 == null) {
            return null;
        }
        int i5 = g5.f15843b;
        byte[] bArr = new byte[i5];
        System.arraycopy(g5.f15842a, 0, bArr, 0, i5);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public void d() {
        a();
        this.f15836a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.c
    public void e(long j5, String str) {
        h();
        f(j5, str);
    }
}
