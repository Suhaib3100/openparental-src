package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
@x0(29)
/* loaded from: classes3.dex */
public final class f<DataT> implements n<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11610a;

    /* renamed from: b, reason: collision with root package name */
    private final n<File, DataT> f11611b;

    /* renamed from: c, reason: collision with root package name */
    private final n<Uri, DataT> f11612c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f11613d;

    /* compiled from: QMediaStoreUriLoader.java */
    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f11614a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f11615b;

        a(Context context, Class<DataT> cls) {
            this.f11614a = context;
            this.f11615b = cls;
        }

        @Override // com.bumptech.glide.load.model.o
        public final void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public final n<Uri, DataT> c(@o0 r rVar) {
            return new f(this.f11614a, rVar.d(File.class, this.f11615b), rVar.d(Uri.class, this.f11615b), this.f11615b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @x0(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @x0(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: y, reason: collision with root package name */
        private static final String[] f11616y = {ProtectedSandApp.s("ᴽ")};

        /* renamed from: o, reason: collision with root package name */
        private final Context f11617o;

        /* renamed from: p, reason: collision with root package name */
        private final n<File, DataT> f11618p;

        /* renamed from: q, reason: collision with root package name */
        private final n<Uri, DataT> f11619q;

        /* renamed from: r, reason: collision with root package name */
        private final Uri f11620r;

        /* renamed from: s, reason: collision with root package name */
        private final int f11621s;

        /* renamed from: t, reason: collision with root package name */
        private final int f11622t;

        /* renamed from: u, reason: collision with root package name */
        private final com.bumptech.glide.load.i f11623u;

        /* renamed from: v, reason: collision with root package name */
        private final Class<DataT> f11624v;

        /* renamed from: w, reason: collision with root package name */
        private volatile boolean f11625w;

        /* renamed from: x, reason: collision with root package name */
        @q0
        private volatile com.bumptech.glide.load.data.d<DataT> f11626x;

        d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i5, int i6, com.bumptech.glide.load.i iVar, Class<DataT> cls) {
            this.f11617o = context.getApplicationContext();
            this.f11618p = nVar;
            this.f11619q = nVar2;
            this.f11620r = uri;
            this.f11621s = i5;
            this.f11622t = i6;
            this.f11623u = iVar;
            this.f11624v = cls;
        }

        @q0
        private n.a<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f11618p.b(h(this.f11620r), this.f11621s, this.f11622t, this.f11623u);
            }
            return this.f11619q.b(g() ? MediaStore.setRequireOriginal(this.f11620r) : this.f11620r, this.f11621s, this.f11622t, this.f11623u);
        }

        @q0
        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            n.a<DataT> c6 = c();
            if (c6 != null) {
                return c6.f11571c;
            }
            return null;
        }

        private boolean g() {
            return this.f11617o.checkSelfPermission(ProtectedSandApp.s("ᴾ")) == 0;
        }

        @o0
        private File h(Uri uri) throws FileNotFoundException {
            String s5 = ProtectedSandApp.s("ᴿ");
            String s6 = ProtectedSandApp.s("ᵀ");
            Cursor cursor = null;
            try {
                Cursor query = this.f11617o.getContentResolver().query(uri, f11616y, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException(s6 + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow(ProtectedSandApp.s("ᵁ")));
                if (TextUtils.isEmpty(string)) {
                    throw new FileNotFoundException(s5 + uri);
                }
                File file = new File(string);
                query.close();
                return file;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<DataT> a() {
            return this.f11624v;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f11626x;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f11625w = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f11626x;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super DataT> aVar) {
            String s5 = ProtectedSandApp.s("ᵂ");
            try {
                com.bumptech.glide.load.data.d<DataT> f6 = f();
                if (f6 == null) {
                    aVar.c(new IllegalArgumentException(s5 + this.f11620r));
                } else {
                    this.f11626x = f6;
                    if (this.f11625w) {
                        cancel();
                    } else {
                        f6.e(iVar, aVar);
                    }
                }
            } catch (FileNotFoundException e6) {
                aVar.c(e6);
            }
        }
    }

    f(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f11610a = context.getApplicationContext();
        this.f11611b = nVar;
        this.f11612c = nVar2;
        this.f11613d = cls;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<DataT> b(@o0 Uri uri, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), new d(this.f11610a, this.f11611b, this.f11612c, uri, i5, i6, iVar, this.f11613d));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
}
