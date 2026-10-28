package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* compiled from: ThumbnailStreamOpener.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: f, reason: collision with root package name */
    private static final String f43809f = ProtectedSandApp.s("ࢀ");

    /* renamed from: g, reason: collision with root package name */
    private static final a f43810g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final a f43811a;

    /* renamed from: b, reason: collision with root package name */
    private final d f43812b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f43813c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f43814d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f43815e;

    e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this(list, f43810g, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(@androidx.annotation.o0 android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            com.bumptech.glide.load.data.mediastore.d r1 = r4.f43812b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            if (r1 == 0) goto L1b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            r1.close()
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L3a
        L1b:
            if (r1 == 0) goto L20
            r1.close()
        L20:
            return r0
        L21:
            r5 = move-exception
            goto L3a
        L23:
            r1 = r0
        L24:
            java.lang.String r2 = "ࢀ"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L18
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L34
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L18
        L34:
            if (r1 == 0) goto L39
            r1.close()
        L39:
            return r0
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.f43811a.a(file) && 0 < this.f43811a.c(file);
    }

    int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f43814d.openInputStream(uri);
                int b5 = com.bumptech.glide.load.e.b(this.f43815e, inputStream, this.f43813c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b5;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable(ProtectedSandApp.s("ࢀ"), 3)) {
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
        String b5 = b(uri);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        File b6 = this.f43811a.b(b5);
        if (!c(b6)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b6);
        try {
            return this.f43814d.openInputStream(fromFile);
        } catch (NullPointerException e4) {
            throw ((FileNotFoundException) new FileNotFoundException(ProtectedSandApp.s("ࢁ") + uri + ProtectedSandApp.s("ࢂ") + fromFile).initCause(e4));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this.f43811a = aVar;
        this.f43812b = dVar;
        this.f43813c = bVar;
        this.f43814d = contentResolver;
        this.f43815e = list;
    }
}
