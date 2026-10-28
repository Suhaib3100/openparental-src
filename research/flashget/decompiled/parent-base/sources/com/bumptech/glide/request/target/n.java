package com.bumptech.glide.request.target;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SimpleTarget.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class n<Z> extends b<Z> {

    /* renamed from: c, reason: collision with root package name */
    private final int f44893c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44894d;

    public n(int i4, int i5) {
        this.f44893c = i4;
        this.f44894d = i5;
    }

    @Override // com.bumptech.glide.request.target.p
    public void a(@o0 o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void p(@o0 o oVar) {
        if (com.bumptech.glide.util.o.x(this.f44893c, this.f44894d)) {
            oVar.d(this.f44893c, this.f44894d);
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ઉ"));
        sb.append(this.f44893c);
        sb.append(ProtectedSandApp.s("ઊ"));
        throw new IllegalArgumentException(android.support.v4.media.b.a(sb, this.f44894d, ProtectedSandApp.s("ઋ")));
    }

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
