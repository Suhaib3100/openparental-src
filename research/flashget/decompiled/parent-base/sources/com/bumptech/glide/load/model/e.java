package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes3.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f44264b = ProtectedSandApp.s("ॠ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f44265c = ProtectedSandApp.s("ॡ");

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f44266a;

    /* compiled from: DataUrlLoader.java */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        private final String f44267b;

        /* renamed from: c, reason: collision with root package name */
        private final a<Data> f44268c;

        /* renamed from: d, reason: collision with root package name */
        private Data f44269d;

        b(String str, a<Data> aVar) {
            this.f44267b = str;
            this.f44268c = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<Data> a() {
            return this.f44268c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f44268c.b(this.f44269d);
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
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super Data> aVar) {
            try {
                Data c5 = this.f44268c.c(this.f44267b);
                this.f44269d = c5;
                aVar.f(c5);
            } catch (IllegalArgumentException e4) {
                aVar.c(e4);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f44270a = new a();

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
                if (!str.startsWith(ProtectedSandApp.s("ज़"))) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("य़"));
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("फ़"));
                }
                if (str.substring(0, indexOf).endsWith(ProtectedSandApp.s("ड़"))) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("ढ़"));
            }
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Model, InputStream> e(@o0 s sVar) {
            return new e(this.f44270a);
        }
    }

    public e(a<Data> aVar) {
        this.f44266a = aVar;
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean a(@o0 Model model) {
        return model.toString().startsWith(ProtectedSandApp.s("ॠ"));
    }

    @Override // com.bumptech.glide.load.model.o
    public o.a<Data> b(@o0 Model model, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(model), new b(model.toString(), this.f44266a));
    }
}
