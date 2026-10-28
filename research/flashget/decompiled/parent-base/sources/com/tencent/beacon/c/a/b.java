package com.tencent.beacon.c.a;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: LifecycleCallbacks.java */
/* loaded from: classes6.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f71375a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f71376b;

    b(c cVar, WeakReference weakReference) {
        this.f71376b = cVar;
        this.f71375a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.beacon.c.c(((Activity) this.f71375a.get()).getApplicationContext()).a();
    }
}
