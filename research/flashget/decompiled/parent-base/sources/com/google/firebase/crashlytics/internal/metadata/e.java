package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: LogFileManager.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f58909c = ProtectedSandApp.s("ﴇ");

    /* renamed from: d, reason: collision with root package name */
    private static final b f58910d = new b();

    /* renamed from: e, reason: collision with root package name */
    static final int f58911e = 65536;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f58912a;

    /* renamed from: b, reason: collision with root package name */
    private c f58913b;

    /* compiled from: LogFileManager.java */
    private static final class b implements c {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.c
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.c
        public String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.c
        public byte[] c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.c
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.c
        public void e(long j4, String str) {
        }

        b(a aVar) {
        }
    }

    public e(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f58912a = gVar;
        this.f58913b = f58910d;
    }

    private File d(String str) {
        return this.f58912a.r(str, ProtectedSandApp.s("ﴇ"));
    }

    public void a() {
        this.f58913b.d();
    }

    public byte[] b() {
        return this.f58913b.c();
    }

    @q0
    public String c() {
        return this.f58913b.b();
    }

    public final void e(String str) {
        this.f58913b.a();
        this.f58913b = f58910d;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i4) {
        this.f58913b = new h(file, i4);
    }

    public void g(long j4, String str) {
        this.f58913b.e(j4, str);
    }

    public e(com.google.firebase.crashlytics.internal.persistence.g gVar, String str) {
        this(gVar);
        e(str);
    }
}
