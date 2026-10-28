package com.bumptech.glide.load.model;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes3.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final x<?> f44387a = new x<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f44388a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f44388a;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Model, Model> e(s sVar) {
            return x.c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: b, reason: collision with root package name */
        private final Model f44389b;

        b(Model model) {
            this.f44389b = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Model> a() {
            return (Class<Model>) this.f44389b.getClass();
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
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super Model> aVar) {
            aVar.f(this.f44389b);
        }
    }

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) f44387a;
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean a(@o0 Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.o
    public o.a<Model> b(@o0 Model model, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(model), new b(model));
    }
}
