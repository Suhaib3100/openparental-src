package com.google.firebase.components;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import o2.a;

/* compiled from: OptionalProvider.java */
/* loaded from: classes3.dex */
class z<T> implements o2.b<T>, o2.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0465a<Object> f15410c = new a.InterfaceC0465a() { // from class: com.google.firebase.components.w
        @Override // o2.a.InterfaceC0465a
        public final void a(o2.b bVar) {
            z.c(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final o2.b<Object> f15411d = new o2.b() { // from class: com.google.firebase.components.x
        @Override // o2.b
        public final Object get() {
            return z.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private a.InterfaceC0465a<T> f15412a;

    /* renamed from: b, reason: collision with root package name */
    private volatile o2.b<T> f15413b;

    private z(a.InterfaceC0465a<T> interfaceC0465a, o2.b<T> bVar) {
        this.f15412a = interfaceC0465a;
        this.f15413b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(o2.b bVar) {
    }

    static <T> z<T> e() {
        return new z<>(f15410c, f15411d);
    }

    private static /* synthetic */ void f(o2.b bVar) {
    }

    private static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0465a interfaceC0465a, a.InterfaceC0465a interfaceC0465a2, o2.b bVar) {
        interfaceC0465a.a(bVar);
        interfaceC0465a2.a(bVar);
    }

    static <T> z<T> i(o2.b<T> bVar) {
        return new z<>(null, bVar);
    }

    @Override // o2.a
    public void a(@o0 final a.InterfaceC0465a<T> interfaceC0465a) {
        o2.b<T> bVar;
        o2.b<T> bVar2;
        o2.b<T> bVar3 = this.f15413b;
        o2.b<Object> bVar4 = f15411d;
        if (bVar3 != bVar4) {
            interfaceC0465a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f15413b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0465a<T> interfaceC0465a2 = this.f15412a;
                this.f15412a = new a.InterfaceC0465a() { // from class: com.google.firebase.components.y
                    @Override // o2.a.InterfaceC0465a
                    public final void a(o2.b bVar5) {
                        z.h(a.InterfaceC0465a.this, interfaceC0465a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0465a.a(bVar);
        }
    }

    @Override // o2.b
    public T get() {
        return this.f15413b.get();
    }

    void j(o2.b<T> bVar) {
        a.InterfaceC0465a<T> interfaceC0465a;
        if (this.f15413b != f15411d) {
            throw new IllegalStateException(ProtectedSandApp.s("⟗"));
        }
        synchronized (this) {
            interfaceC0465a = this.f15412a;
            this.f15412a = null;
            this.f15413b = bVar;
        }
        interfaceC0465a.a(bVar);
    }
}
