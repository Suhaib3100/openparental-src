package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseGlideUrlLoader.java */
/* loaded from: classes3.dex */
public abstract class a<Model> implements n<Model, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f11601a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final m<Model, com.bumptech.glide.load.model.g> f11602b;

    protected a(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this(nVar, null);
    }

    private static List<com.bumptech.glide.load.f> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.bumptech.glide.load.model.g(it.next()));
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.load.model.n
    @q0
    public n.a<InputStream> b(@o0 Model model, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        m<Model, com.bumptech.glide.load.model.g> mVar = this.f11602b;
        com.bumptech.glide.load.model.g b6 = mVar != null ? mVar.b(model, i5, i6) : null;
        if (b6 == null) {
            String f6 = f(model, i5, i6, iVar);
            if (TextUtils.isEmpty(f6)) {
                return null;
            }
            com.bumptech.glide.load.model.g gVar = new com.bumptech.glide.load.model.g(f6, e(model, i5, i6, iVar));
            m<Model, com.bumptech.glide.load.model.g> mVar2 = this.f11602b;
            if (mVar2 != null) {
                mVar2.c(model, i5, i6, gVar);
            }
            b6 = gVar;
        }
        List<String> d6 = d(model, i5, i6, iVar);
        n.a<InputStream> b7 = this.f11601a.b(b6, i5, i6, iVar);
        return (b7 == null || d6.isEmpty()) ? b7 : new n.a<>(b7.f11569a, c(d6), b7.f11571c);
    }

    protected List<String> d(Model model, int i5, int i6, com.bumptech.glide.load.i iVar) {
        return Collections.emptyList();
    }

    @q0
    protected com.bumptech.glide.load.model.h e(Model model, int i5, int i6, com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.model.h.f11547b;
    }

    protected abstract String f(Model model, int i5, int i6, com.bumptech.glide.load.i iVar);

    protected a(n<com.bumptech.glide.load.model.g, InputStream> nVar, @q0 m<Model, com.bumptech.glide.load.model.g> mVar) {
        this.f11601a = nVar;
        this.f11602b = mVar;
    }
}
