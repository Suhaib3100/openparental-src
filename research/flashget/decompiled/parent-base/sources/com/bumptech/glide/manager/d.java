package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.manager.b;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes3.dex */
final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    private final Context f44679b;

    /* renamed from: c, reason: collision with root package name */
    final b.a f44680c;

    d(@o0 Context context, @o0 b.a aVar) {
        this.f44679b = context.getApplicationContext();
        this.f44680c = aVar;
    }

    private void b() {
        r.a(this.f44679b).d(this.f44680c);
    }

    private void c() {
        r.a(this.f44679b).f(this.f44680c);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        b();
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
        c();
    }
}
