package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes3.dex */
public interface o<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.f f44319a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.f> f44320b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f44321c;

        public a(@o0 com.bumptech.glide.load.f fVar, @o0 com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(@o0 com.bumptech.glide.load.f fVar, @o0 List<com.bumptech.glide.load.f> list, @o0 com.bumptech.glide.load.data.d<Data> dVar) {
            String s4 = ProtectedSandApp.s("७");
            this.f44319a = (com.bumptech.glide.load.f) com.bumptech.glide.util.m.f(fVar, s4);
            this.f44320b = (List) com.bumptech.glide.util.m.f(list, s4);
            this.f44321c = (com.bumptech.glide.load.data.d) com.bumptech.glide.util.m.f(dVar, s4);
        }
    }

    boolean a(@o0 Model model);

    @q0
    a<Data> b(@o0 Model model, int i4, int i5, @o0 com.bumptech.glide.load.i iVar);
}
