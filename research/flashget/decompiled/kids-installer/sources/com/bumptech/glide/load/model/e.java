package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes3.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11524b = ProtectedSandApp.s("ᴩ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f11525c = ProtectedSandApp.s("ᴪ");

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f11526a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: o, reason: collision with root package name */
        private final String f11527o;

        /* renamed from: p, reason: collision with root package name */
        private final a<Data> f11528p;

        /* renamed from: q, reason: collision with root package name */
        private Data f11529q;

        b(String str, a<Data> aVar) {
            this.f11527o = str;
            this.f11528p = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f11528p.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f11528p.b(this.f11529q);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super Data> aVar) {
            try {
                Data c6 = this.f11528p.c(this.f11527o);
                this.f11529q = c6;
                aVar.f(c6);
            } catch (IllegalArgumentException e6) {
                aVar.c(e6);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f11530a = new a();

        /* compiled from: DataUrlLoader.java */
        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith(ProtectedSandApp.s("ᴣ"))) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ᴧ"));
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ᴦ"));
                }
                if (str.substring(0, indexOf).endsWith(ProtectedSandApp.s("ᴤ"))) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("ᴥ"));
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Model, InputStream> c(@o0 r rVar) {
            return new e(this.f11530a);
        }
    }

    public e(a<Data> aVar) {
        this.f11526a = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@o0 Model model) {
        return model.toString().startsWith(ProtectedSandApp.s("ᴨ"));
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Data> b(@o0 Model model, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(model), new b(model.toString(), this.f11526a));
    }
}
