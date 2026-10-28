package com.bumptech.glide.manager;

import androidx.annotation.o0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes3.dex */
public final class u implements m {

    /* renamed from: o, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.p<?>> f11944o = Collections.newSetFromMap(new WeakHashMap());

    public void c() {
        this.f11944o.clear();
    }

    @o0
    public List<com.bumptech.glide.request.target.p<?>> d() {
        return com.bumptech.glide.util.n.k(this.f11944o);
    }

    public void e(@o0 com.bumptech.glide.request.target.p<?> pVar) {
        this.f11944o.add(pVar);
    }

    public void f(@o0 com.bumptech.glide.request.target.p<?> pVar) {
        this.f11944o.remove(pVar);
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
        Iterator it = com.bumptech.glide.util.n.k(this.f11944o).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
        Iterator it = com.bumptech.glide.util.n.k(this.f11944o).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
        Iterator it = com.bumptech.glide.util.n.k(this.f11944o).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onStop();
        }
    }
}
