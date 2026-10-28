package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;

/* compiled from: LogFileManager.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15807c = ProtectedSandApp.s("ᓑ");

    /* renamed from: d, reason: collision with root package name */
    private static final b f15808d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    static final int f15809e = 65536;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.f f15810a;

    /* renamed from: b, reason: collision with root package name */
    private c f15811b;

    /* compiled from: LogFileManager.java */
    /* loaded from: classes3.dex */
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
        public void e(long j5, String str) {
        }

        b(a aVar) {
        }
    }

    public e(com.google.firebase.crashlytics.internal.persistence.f fVar) {
        this.f15810a = fVar;
        this.f15811b = f15808d;
    }

    private File d(String str) {
        return this.f15810a.p(str, ProtectedSandApp.s("ᓒ"));
    }

    public void a() {
        this.f15811b.d();
    }

    public byte[] b() {
        return this.f15811b.c();
    }

    @q0
    public String c() {
        return this.f15811b.b();
    }

    public final void e(String str) {
        this.f15811b.a();
        this.f15811b = f15808d;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i5) {
        this.f15811b = new h(file, i5);
    }

    public void g(long j5, String str) {
        this.f15811b.e(j5, str);
    }

    public e(com.google.firebase.crashlytics.internal.persistence.f fVar, String str) {
        this(fVar);
        e(str);
    }
}
