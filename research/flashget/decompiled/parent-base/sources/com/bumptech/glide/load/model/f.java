package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DirectResourceLoader.java */
/* loaded from: classes3.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44272a;

    /* renamed from: b, reason: collision with root package name */
    private final e<DataT> f44273b;

    /* compiled from: DirectResourceLoader.java */
    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44274a;

        a(Context context) {
            this.f44274a = context;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.bumptech.glide.load.model.f.e
        public AssetFileDescriptor c(@q0 Resources.Theme theme, Resources resources, int i4) {
            return resources.openRawResourceFd(i4);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Integer, AssetFileDescriptor> e(@o0 s sVar) {
            return new f(this.f44274a, this);
        }

        public void f(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        public AssetFileDescriptor g(@q0 Resources.Theme theme, Resources resources, int i4) {
            return resources.openRawResourceFd(i4);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44275a;

        b(Context context) {
            this.f44275a = context;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public void b(Drawable drawable) throws IOException {
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Drawable c(@q0 Resources.Theme theme, Resources resources, int i4) {
            return com.bumptech.glide.load.resource.drawable.i.a(this.f44275a, i4, theme);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Integer, Drawable> e(@o0 s sVar) {
            return new f(this.f44275a, this);
        }

        public void f(Drawable drawable) throws IOException {
        }

        public Drawable g(@q0 Resources.Theme theme, Resources resources, int i4) {
            return com.bumptech.glide.load.resource.drawable.i.a(this.f44275a, i4, theme);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44276a;

        c(Context context) {
            this.f44276a = context;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.f.e
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.bumptech.glide.load.model.f.e
        public InputStream c(@q0 Resources.Theme theme, Resources resources, int i4) {
            return resources.openRawResource(i4);
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Integer, InputStream> e(@o0 s sVar) {
            return new f(this.f44276a, this);
        }

        public void f(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        public InputStream g(@q0 Resources.Theme theme, Resources resources, int i4) {
            return resources.openRawResource(i4);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final Resources.Theme f44277b;

        /* renamed from: c, reason: collision with root package name */
        private final Resources f44278c;

        /* renamed from: d, reason: collision with root package name */
        private final e<DataT> f44279d;

        /* renamed from: e, reason: collision with root package name */
        private final int f44280e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        private DataT f44281f;

        d(@q0 Resources.Theme theme, Resources resources, e<DataT> eVar, int i4) {
            this.f44277b = theme;
            this.f44278c = resources;
            this.f44279d = eVar;
            this.f44280e = i4;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<DataT> a() {
            return this.f44279d.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f44281f;
            if (datat != null) {
                try {
                    this.f44279d.b(datat);
                } catch (IOException unused) {
                }
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

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super DataT> aVar) {
            try {
                DataT c5 = this.f44279d.c(this.f44277b, this.f44278c, this.f44280e);
                this.f44281f = c5;
                aVar.f(c5);
            } catch (Resources.NotFoundException e4) {
                aVar.c(e4);
            }
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(@q0 Resources.Theme theme, Resources resources, int i4);
    }

    f(Context context, e<DataT> eVar) {
        this.f44272a = context.getApplicationContext();
        this.f44273b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean a(@o0 Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(@o0 Integer num, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        Resources.Theme theme = (Resources.Theme) iVar.c(com.bumptech.glide.load.resource.drawable.m.f44583b);
        return new o.a<>(new com.bumptech.glide.signature.e(num), new d(theme, theme != null ? theme.getResources() : this.f44272a.getResources(), this.f44273b, num.intValue()));
    }

    public boolean f(@o0 Integer num) {
        return true;
    }
}
