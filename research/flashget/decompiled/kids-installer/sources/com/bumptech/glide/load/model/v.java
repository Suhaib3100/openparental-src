package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes3.dex */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final v<?> f11631a = new v<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f11632a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> b() {
            return (a<T>) f11632a;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Model, Model> c(r rVar) {
            return v.c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: o, reason: collision with root package name */
        private final Model f11633o;

        b(Model model) {
            this.f11633o = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Model> a() {
            return (Class<Model>) this.f11633o.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super Model> aVar) {
            aVar.f(this.f11633o);
        }
    }

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) f11631a;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@o0 Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Model> b(@o0 Model model, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(model), new b(model));
    }
}
