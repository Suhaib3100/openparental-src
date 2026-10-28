package com.github.penfeizhou.animation.avif;

import android.content.Context;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.loader.c;
import com.github.penfeizhou.animation.loader.d;
import com.github.penfeizhou.animation.loader.e;

/* compiled from: AVIFDrawable.java */
/* loaded from: classes5.dex */
public class a extends com.github.penfeizhou.animation.a<com.github.penfeizhou.animation.avif.decode.a> {
    public a(d dVar) {
        super(dVar);
    }

    public static a u(Context context, String str) {
        return new a(new com.github.penfeizhou.animation.loader.a(context, str));
    }

    public static a v(String str) {
        return new a(new c(str));
    }

    public static a w(Context context, int i4) {
        return new a(new e(context, i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.avif.decode.a g(d dVar, b.j jVar) {
        return new com.github.penfeizhou.animation.avif.decode.a(dVar, jVar);
    }

    public a(com.github.penfeizhou.animation.avif.decode.a aVar) {
        super(aVar);
    }
}
