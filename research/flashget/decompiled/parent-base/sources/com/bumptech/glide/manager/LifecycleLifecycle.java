package com.bumptech.glide.manager;

import androidx.annotation.o0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1421d0;
import androidx.view.InterfaceC1423e0;
import androidx.view.q0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class LifecycleLifecycle implements j, InterfaceC1421d0 {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Set<k> f44677b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final AbstractC1450w f44678c;

    LifecycleLifecycle(AbstractC1450w abstractC1450w) {
        this.f44678c = abstractC1450w;
        abstractC1450w.a(this);
    }

    @Override // com.bumptech.glide.manager.j
    public void a(@o0 k kVar) {
        this.f44677b.remove(kVar);
    }

    @Override // com.bumptech.glide.manager.j
    public void b(@o0 k kVar) {
        this.f44677b.add(kVar);
        if (this.f44678c.b() == AbstractC1450w.b.DESTROYED) {
            kVar.onDestroy();
        } else if (this.f44678c.b().isAtLeast(AbstractC1450w.b.STARTED)) {
            kVar.onStart();
        } else {
            kVar.onStop();
        }
    }

    @q0(AbstractC1450w.a.ON_DESTROY)
    public void onDestroy(@o0 InterfaceC1423e0 interfaceC1423e0) {
        Iterator it = com.bumptech.glide.util.o.l(this.f44677b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
        interfaceC1423e0.getLifecycle().d(this);
    }

    @q0(AbstractC1450w.a.ON_START)
    public void onStart(@o0 InterfaceC1423e0 interfaceC1423e0) {
        Iterator it = com.bumptech.glide.util.o.l(this.f44677b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @q0(AbstractC1450w.a.ON_STOP)
    public void onStop(@o0 InterfaceC1423e0 interfaceC1423e0) {
        Iterator it = com.bumptech.glide.util.o.l(this.f44677b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }
}
