package com.bumptech.glide.manager;

import androidx.annotation.o0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes3.dex */
class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set<m> f11897a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f11898b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11899c;

    a() {
    }

    @Override // com.bumptech.glide.manager.l
    public void a(@o0 m mVar) {
        this.f11897a.add(mVar);
        if (this.f11899c) {
            mVar.onDestroy();
        } else if (this.f11898b) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.l
    public void b(@o0 m mVar) {
        this.f11897a.remove(mVar);
    }

    void c() {
        this.f11899c = true;
        Iterator it = com.bumptech.glide.util.n.k(this.f11897a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
    }

    void d() {
        this.f11898b = true;
        Iterator it = com.bumptech.glide.util.n.k(this.f11897a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    void e() {
        this.f11898b = false;
        Iterator it = com.bumptech.glide.util.n.k(this.f11897a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}
