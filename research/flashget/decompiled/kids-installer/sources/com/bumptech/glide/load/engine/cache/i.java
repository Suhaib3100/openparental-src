package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.u;

/* compiled from: LruResourceCache.java */
/* loaded from: classes3.dex */
public class i extends com.bumptech.glide.util.i<com.bumptech.glide.load.f, u<?>> implements j {

    /* renamed from: e, reason: collision with root package name */
    private j.a f11249e;

    public i(long j5) {
        super(j5);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @SuppressLint({"InlinedApi"})
    public void a(int i5) {
        if (i5 >= 40) {
            b();
        } else if (i5 >= 20 || i5 == 15) {
            q(e() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @q0
    public /* bridge */ /* synthetic */ u f(@o0 com.bumptech.glide.load.f fVar, @q0 u uVar) {
        return (u) super.o(fVar, uVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @q0
    public /* bridge */ /* synthetic */ u g(@o0 com.bumptech.glide.load.f fVar) {
        return (u) super.p(fVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@o0 j.a aVar) {
        this.f11249e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int m(@q0 u<?> uVar) {
        if (uVar == null) {
            return 1;
        }
        return uVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(@o0 com.bumptech.glide.load.f fVar, @q0 u<?> uVar) {
        j.a aVar = this.f11249e;
        if (aVar == null || uVar == null) {
            return;
        }
        aVar.a(uVar);
    }
}
