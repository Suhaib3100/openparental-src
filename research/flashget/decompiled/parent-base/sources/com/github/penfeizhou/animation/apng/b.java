package com.github.penfeizhou.animation.apng;

import android.content.Context;
import com.github.penfeizhou.animation.decode.b;

/* compiled from: APNGDrawable.java */
/* loaded from: classes5.dex */
public class b extends com.github.penfeizhou.animation.a<com.github.penfeizhou.animation.apng.decode.b> {
    public b(com.github.penfeizhou.animation.loader.d dVar) {
        super(dVar);
    }

    public static b u(Context context, String str) {
        return new b(new com.github.penfeizhou.animation.loader.a(context, str));
    }

    public static b v(String str) {
        return new b(new com.github.penfeizhou.animation.loader.c(str));
    }

    public static b w(Context context, int i4) {
        return new b(new com.github.penfeizhou.animation.loader.e(context, i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.apng.decode.b g(com.github.penfeizhou.animation.loader.d dVar, b.j jVar) {
        return new com.github.penfeizhou.animation.apng.decode.b(dVar, jVar);
    }

    public b(com.github.penfeizhou.animation.apng.decode.b bVar) {
        super(bVar);
    }
}
