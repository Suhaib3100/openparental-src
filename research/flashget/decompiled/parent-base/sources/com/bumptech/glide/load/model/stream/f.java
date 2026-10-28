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
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
@x0(29)
/* loaded from: classes3.dex */
public final class f<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44353a;

    /* renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f44354b;

    /* renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f44355c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f44356d;

    /* compiled from: QMediaStoreUriLoader.java */
    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44357a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f44358b;

        a(Context context, Class<DataT> cls) {
            this.f44357a = context;
            this.f44358b = cls;
        }

        @Override // com.bumptech.glide.load.model.p
        public final void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public final o<Uri, DataT> e(@o0 s sVar) {
            return new f(this.f44357a, sVar.d(File.class, this.f44358b), sVar.d(Uri.class, this.f44358b), this.f44358b);
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

        /* renamed from: l, reason: collision with root package name */
        private static final String[] f44359l = {ProtectedSandApp.s("ॶ")};

        /* renamed from: b, reason: collision with root package name */
        private final Context f44360b;

        /* renamed from: c, reason: collision with root package name */
        private final o<File, DataT> f44361c;

        /* renamed from: d, reason: collision with root package name */
        private final o<Uri, DataT> f44362d;

        /* renamed from: e, reason: collision with root package name */
        private final Uri f44363e;

        /* renamed from: f, reason: collision with root package name */
        private final int f44364f;

        /* renamed from: g, reason: collision with root package name */
        private final int f44365g;

        /* renamed from: h, reason: collision with root package name */
        private final com.bumptech.glide.load.i f44366h;

        /* renamed from: i, reason: collision with root package name */
        private final Class<DataT> f44367i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f44368j;

        /* renamed from: k, reason: collision with root package name */
        @q0
        private volatile com.bumptech.glide.load.data.d<DataT> f44369k;

        d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i4, int i5, com.bumptech.glide.load.i iVar, Class<DataT> cls) {
            this.f44360b = context.getApplicationContext();
            this.f44361c = oVar;
            this.f44362d = oVar2;
            this.f44363e = uri;
            this.f44364f = i4;
            this.f44365g = i5;
            this.f44366h = iVar;
            this.f44367i = cls;
        }

        @q0
        private o.a<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f44361c.b(h(this.f44363e), this.f44364f, this.f44365g, this.f44366h);
            }
            if (com.bumptech.glide.load.data.mediastore.b.a(this.f44363e)) {
                return this.f44362d.b(this.f44363e, this.f44364f, this.f44365g, this.f44366h);
            }
            return this.f44362d.b(g() ? MediaStore.setRequireOriginal(this.f44363e) : this.f44363e, this.f44364f, this.f44365g, this.f44366h);
        }

        @q0
        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            o.a<DataT> c5 = c();
            if (c5 != null) {
                return c5.f44321c;
            }
            return null;
        }

        private boolean g() {
            return this.f44360b.checkSelfPermission(ProtectedSandApp.s("ॷ")) == 0;
        }

        @o0
        private File h(Uri uri) throws FileNotFoundException {
            String s4 = ProtectedSandApp.s("ॸ");
            String s5 = ProtectedSandApp.s("ॹ");
            Cursor cursor = null;
            try {
                Cursor query = this.f44360b.getContentResolver().query(uri, f44359l, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException(s4 + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow(ProtectedSandApp.s("ॶ")));
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
            return this.f44367i;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f44369k;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f44368j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f44369k;
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
        public void e(@o0 j jVar, @o0 d.a<? super DataT> aVar) {
            String s4 = ProtectedSandApp.s("ॺ");
            try {
                com.bumptech.glide.load.data.d<DataT> f4 = f();
                if (f4 == null) {
                    aVar.c(new IllegalArgumentException(s4 + this.f44363e));
                } else {
                    this.f44369k = f4;
                    if (this.f44368j) {
                        cancel();
                    } else {
                        f4.e(jVar, aVar);
                    }
                }
            } catch (FileNotFoundException e4) {
                aVar.c(e4);
            }
        }
    }

    f(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f44353a = context.getApplicationContext();
        this.f44354b = oVar;
        this.f44355c = oVar2;
        this.f44356d = cls;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), new d(this.f44353a, this.f44354b, this.f44355c, uri, i4, i5, iVar, this.f44356d));
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
