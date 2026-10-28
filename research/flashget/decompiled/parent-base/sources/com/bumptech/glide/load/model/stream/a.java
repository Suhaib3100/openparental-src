package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseGlideUrlLoader.java */
/* loaded from: classes3.dex */
public abstract class a<Model> implements o<Model, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final o<com.bumptech.glide.load.model.h, InputStream> f44344a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final n<Model, com.bumptech.glide.load.model.h> f44345b;

    protected a(o<com.bumptech.glide.load.model.h, InputStream> oVar) {
        this(oVar, null);
    }

    private static List<com.bumptech.glide.load.f> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.bumptech.glide.load.model.h(it.next()));
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.load.model.o
    @q0
    public o.a<InputStream> b(@o0 Model model, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        n<Model, com.bumptech.glide.load.model.h> nVar = this.f44345b;
        com.bumptech.glide.load.model.h b5 = nVar != null ? nVar.b(model, i4, i5) : null;
        if (b5 == null) {
            String f4 = f(model, i4, i5, iVar);
            if (TextUtils.isEmpty(f4)) {
                return null;
            }
            com.bumptech.glide.load.model.h hVar = new com.bumptech.glide.load.model.h(f4, e(model, i4, i5, iVar));
            n<Model, com.bumptech.glide.load.model.h> nVar2 = this.f44345b;
            if (nVar2 != null) {
                nVar2.c(model, i4, i5, hVar);
            }
            b5 = hVar;
        }
        List<String> d5 = d(model, i4, i5, iVar);
        o.a<InputStream> b6 = this.f44344a.b(b5, i4, i5, iVar);
        return (b6 == null || d5.isEmpty()) ? b6 : new o.a<>(b6.f44319a, c(d5), b6.f44321c);
    }

    protected List<String> d(Model model, int i4, int i5, com.bumptech.glide.load.i iVar) {
        return Collections.emptyList();
    }

    @q0
    protected com.bumptech.glide.load.model.i e(Model model, int i4, int i5, com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.model.i.f44297b;
    }

    protected abstract String f(Model model, int i4, int i5, com.bumptech.glide.load.i iVar);

    protected a(o<com.bumptech.glide.load.model.h, InputStream> oVar, @q0 n<Model, com.bumptech.glide.load.model.h> nVar) {
        this.f44344a = oVar;
        this.f44345b = nVar;
    }
}
