package com.google.firebase.components;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import y9.a;

/* compiled from: OptionalProvider.java */
/* loaded from: classes6.dex */
class z<T> implements y9.b<T>, y9.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC1408a<Object> f58487c = new w();

    /* renamed from: d, reason: collision with root package name */
    private static final y9.b<Object> f58488d = new x();

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private a.InterfaceC1408a<T> f58489a;

    /* renamed from: b, reason: collision with root package name */
    private volatile y9.b<T> f58490b;

    private z(a.InterfaceC1408a<T> interfaceC1408a, y9.b<T> bVar) {
        this.f58489a = interfaceC1408a;
        this.f58490b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void d(y9.b bVar) {
    }

    static <T> z<T> e() {
        return new z<>(f58487c, f58488d);
    }

    private static /* synthetic */ void f(y9.b bVar) {
    }

    private static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC1408a interfaceC1408a, a.InterfaceC1408a interfaceC1408a2, y9.b bVar) {
        interfaceC1408a.a(bVar);
        interfaceC1408a2.a(bVar);
    }

    static <T> z<T> i(y9.b<T> bVar) {
        return new z<>(null, bVar);
    }

    @Override // y9.a
    public void a(@o0 final a.InterfaceC1408a<T> interfaceC1408a) {
        y9.b<T> bVar;
        y9.b<T> bVar2;
        y9.b<T> bVar3 = this.f58490b;
        y9.b<Object> bVar4 = f58488d;
        if (bVar3 != bVar4) {
            interfaceC1408a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f58490b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC1408a<T> interfaceC1408a2 = this.f58489a;
                this.f58489a = new a.InterfaceC1408a() { // from class: com.google.firebase.components.y
                    @Override // y9.a.InterfaceC1408a
                    public final void a(y9.b bVar5) {
                        z.h(a.InterfaceC1408a.this, interfaceC1408a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC1408a.a(bVar);
        }
    }

    @Override // y9.b
    public T get() {
        return this.f58490b.get();
    }

    void j(y9.b<T> bVar) {
        a.InterfaceC1408a<T> interfaceC1408a;
        if (this.f58490b != f58488d) {
            throw new IllegalStateException(ProtectedSandApp.s("ﮎ"));
        }
        synchronized (this) {
            interfaceC1408a = this.f58489a;
            this.f58489a = null;
            this.f58490b = bVar;
        }
        interfaceC1408a.a(bVar);
    }
}
