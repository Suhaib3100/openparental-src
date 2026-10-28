package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.f f11569a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.f> f11570b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f11571c;

        public a(@o0 com.bumptech.glide.load.f fVar, @o0 com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(@o0 com.bumptech.glide.load.f fVar, @o0 List<com.bumptech.glide.load.f> list, @o0 com.bumptech.glide.load.data.d<Data> dVar) {
            this.f11569a = (com.bumptech.glide.load.f) com.bumptech.glide.util.l.d(fVar);
            this.f11570b = (List) com.bumptech.glide.util.l.d(list);
            this.f11571c = (com.bumptech.glide.load.data.d) com.bumptech.glide.util.l.d(dVar);
        }
    }

    boolean a(@o0 Model model);

    @q0
    a<Data> b(@o0 Model model, int i5, int i6, @o0 com.bumptech.glide.load.i iVar);
}
