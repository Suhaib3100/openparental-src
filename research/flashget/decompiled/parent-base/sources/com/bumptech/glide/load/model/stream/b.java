package com.bumptech.glide.load.model.stream;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes3.dex */
public class b implements o<com.bumptech.glide.load.model.h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f44346b = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ॳ"), Integer.valueOf(com.android.volley.g.f40879e));

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> f44347a;

    /* compiled from: HttpGlideUrlLoader.java */
    public static class a implements p<com.bumptech.glide.load.model.h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> f44348a = new n<>(500);

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<com.bumptech.glide.load.model.h, InputStream> e(s sVar) {
            return new b(this.f44348a);
        }
    }

    public b() {
        this(null);
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@o0 com.bumptech.glide.load.model.h hVar, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> nVar = this.f44347a;
        if (nVar != null) {
            com.bumptech.glide.load.model.h b5 = nVar.b(hVar, 0, 0);
            if (b5 == null) {
                this.f44347a.c(hVar, 0, 0, hVar);
            } else {
                hVar = b5;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) iVar.c(f44346b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 com.bumptech.glide.load.model.h hVar) {
        return true;
    }

    public b(@q0 n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> nVar) {
        this.f44347a = nVar;
    }
}
