package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes3.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f44395b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProtectedSandApp.s("ॴ"), ProtectedSandApp.s("ॵ"))));

    /* renamed from: a, reason: collision with root package name */
    private final o<h, Data> f44396a;

    /* compiled from: UrlUriLoader.java */
    public static class a implements p<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, InputStream> e(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }
    }

    public z(o<h, Data> oVar) {
        this.f44396a = oVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return this.f44396a.b(new h(uri.toString()), i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return f44395b.contains(uri.getScheme());
    }
}
