package com.bumptech.glide.manager;

import androidx.annotation.o0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes3.dex */
public final class t implements k {

    /* renamed from: b, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.p<?>> f44735b = Collections.newSetFromMap(new WeakHashMap());

    public void b() {
        this.f44735b.clear();
    }

    @o0
    public List<com.bumptech.glide.request.target.p<?>> c() {
        return com.bumptech.glide.util.o.l(this.f44735b);
    }

    public void d(@o0 com.bumptech.glide.request.target.p<?> pVar) {
        this.f44735b.add(pVar);
    }

    public void e(@o0 com.bumptech.glide.request.target.p<?> pVar) {
        this.f44735b.remove(pVar);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
        Iterator it = com.bumptech.glide.util.o.l(this.f44735b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        Iterator it = com.bumptech.glide.util.o.l(this.f44735b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
        Iterator it = com.bumptech.glide.util.o.l(this.f44735b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onStop();
        }
    }
}
