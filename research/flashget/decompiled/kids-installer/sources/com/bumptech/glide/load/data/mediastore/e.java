package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* compiled from: ThumbnailStreamOpener.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: f, reason: collision with root package name */
    private static final String f11103f = ProtectedSandApp.s("Ĉ");

    /* renamed from: g, reason: collision with root package name */
    private static final a f11104g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final a f11105a;

    /* renamed from: b, reason: collision with root package name */
    private final d f11106b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11107c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f11108d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f11109e;

    e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this(list, f11104g, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(@androidx.annotation.o0 android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            com.bumptech.glide.load.data.mediastore.d r1 = r4.f11106b     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L20
            android.database.Cursor r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L20
            if (r1 == 0) goto L18
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.SecurityException -> L21 java.lang.Throwable -> L37
            if (r2 == 0) goto L18
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.SecurityException -> L21 java.lang.Throwable -> L37
            r1.close()
            return r5
        L18:
            if (r1 == 0) goto L1d
            r1.close()
        L1d:
            return r0
        L1e:
            r5 = move-exception
            goto L39
        L20:
            r1 = r0
        L21:
            java.lang.String r2 = "ĉ"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L37
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L31
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L37
        L31:
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            r5 = move-exception
            r0 = r1
        L39:
            if (r0 == 0) goto L3e
            r0.close()
        L3e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.f11105a.a(file) && 0 < this.f11105a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f11108d.openInputStream(uri);
                int b6 = com.bumptech.glide.load.e.b(this.f11109e, inputStream, this.f11107c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b6;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable(ProtectedSandApp.s("Ċ"), 3)) {
                    Objects.toString(uri);
                }
                if (inputStream == null) {
                    return -1;
                }
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b6 = b(uri);
        if (TextUtils.isEmpty(b6)) {
            return null;
        }
        File b7 = this.f11105a.b(b6);
        if (!c(b7)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b7);
        try {
            return this.f11108d.openInputStream(fromFile);
        } catch (NullPointerException e6) {
            throw ((FileNotFoundException) new FileNotFoundException(ProtectedSandApp.s("ċ") + uri + ProtectedSandApp.s("Č") + fromFile).initCause(e6));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this.f11105a = aVar;
        this.f11106b = dVar;
        this.f11107c = bVar;
        this.f11108d = contentResolver;
        this.f11109e = list;
    }
}
