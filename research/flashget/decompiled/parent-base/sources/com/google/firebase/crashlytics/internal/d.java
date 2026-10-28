package com.google.firebase.crashlytics.internal;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.internal.model.h0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import y9.a;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes6.dex */
public final class d implements com.google.firebase.crashlytics.internal.a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f58873c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final y9.a<com.google.firebase.crashlytics.internal.a> f58874a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<com.google.firebase.crashlytics.internal.a> f58875b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    private static final class b implements h {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public g0.a b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File d() {
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

    public d(y9.a<com.google.firebase.crashlytics.internal.a> aVar) {
        this.f58874a = aVar;
        aVar.a(new a.InterfaceC1408a() { // from class: com.google.firebase.crashlytics.internal.b
            @Override // y9.a.InterfaceC1408a
            public final void a(y9.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(y9.b bVar) {
        g.f().b(ProtectedSandApp.s("ﳓ"));
        this.f58875b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j4, h0 h0Var, y9.b bVar) {
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).c(str, str2, j4, h0Var);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @o0
    public h a(@o0 String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f58875b.get();
        return aVar == null ? f58873c : aVar.a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean b() {
        com.google.firebase.crashlytics.internal.a aVar = this.f58875b.get();
        return aVar != null && aVar.b();
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public void c(@o0 final String str, @o0 final String str2, final long j4, @o0 final h0 h0Var) {
        g.f().k(ProtectedSandApp.s("ﳔ") + str);
        this.f58874a.a(new a.InterfaceC1408a() { // from class: com.google.firebase.crashlytics.internal.c
            @Override // y9.a.InterfaceC1408a
            public final void a(y9.b bVar) {
                d.h(str, str2, j4, h0Var, bVar);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean d(@o0 String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f58875b.get();
        return aVar != null && aVar.d(str);
    }
}
