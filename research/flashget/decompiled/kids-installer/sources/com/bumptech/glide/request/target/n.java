package com.bumptech.glide.request.target;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: SimpleTarget.java */
@Deprecated
/* loaded from: classes4.dex */
public abstract class n<Z> extends b<Z> {

    /* renamed from: p, reason: collision with root package name */
    private final int f12087p;

    /* renamed from: q, reason: collision with root package name */
    private final int f12088q;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public void a(@o0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void q(@o0 o oVar) {
        if (com.bumptech.glide.util.n.w(this.f12087p, this.f12088q)) {
            oVar.e(this.f12087p, this.f12088q);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⯶"));
        sb.append(this.f12087p);
        sb.append(ProtectedSandApp.s("⯷"));
        throw new IllegalArgumentException(androidx.constraintlayout.solver.e.a(sb, this.f12088q, ProtectedSandApp.s("⯸")));
    }

    public n(int i5, int i6) {
        this.f12087p = i5;
        this.f12088q = i6;
    }
}
