package androidx.view;

import androidx.annotation.o0;
import androidx.view.AbstractC1450w;
import androidx.view.C1422e;

@Deprecated
/* loaded from: classes3.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name */
    private final Object f30183b;

    /* renamed from: c, reason: collision with root package name */
    private final C1422e.a f30184c;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f30183b = obj;
        this.f30184c = C1422e.f30282c.c(obj.getClass());
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
        this.f30184c.a(interfaceC1423e0, aVar, this.f30183b);
    }
}
