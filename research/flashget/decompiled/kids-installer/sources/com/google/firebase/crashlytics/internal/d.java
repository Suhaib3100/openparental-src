package com.google.firebase.crashlytics.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import o2.a;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes3.dex */
public final class d implements com.google.firebase.crashlytics.internal.a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f15771c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final o2.a<com.google.firebase.crashlytics.internal.a> f15772a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<com.google.firebase.crashlytics.internal.a> f15773b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    private static final class b implements h {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public f0.a d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File g() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File h() {
            return null;
        }

        b(a aVar) {
        }
    }

    public d(o2.a<com.google.firebase.crashlytics.internal.a> aVar) {
        this.f15772a = aVar;
        aVar.a(new a.InterfaceC0465a() { // from class: com.google.firebase.crashlytics.internal.b
            @Override // o2.a.InterfaceC0465a
            public final void a(o2.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(o2.b bVar) {
        g.f().b(ProtectedSandApp.s("⠺"));
        this.f15773b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j5, g0 g0Var, o2.b bVar) {
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).c(str, str2, j5, g0Var);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @o0
    public h a(@o0 String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f15773b.get();
        return aVar == null ? f15771c : aVar.a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean b() {
        com.google.firebase.crashlytics.internal.a aVar = this.f15773b.get();
        return aVar != null && aVar.b();
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public void c(@o0 final String str, @o0 final String str2, final long j5, @o0 final g0 g0Var) {
        g.f().k(ProtectedSandApp.s("⠻") + str);
        this.f15772a.a(new a.InterfaceC0465a() { // from class: com.google.firebase.crashlytics.internal.c
            @Override // o2.a.InterfaceC0465a
            public final void a(o2.b bVar) {
                d.h(str, str2, j5, g0Var, bVar);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean d(@o0 String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f15773b.get();
        return aVar != null && aVar.d(str);
    }
}
