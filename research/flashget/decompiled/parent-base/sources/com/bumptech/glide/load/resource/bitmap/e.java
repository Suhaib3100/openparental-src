package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes3.dex */
public class e implements com.bumptech.glide.load.l<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44471a;

    /* renamed from: d, reason: collision with root package name */
    private static final String f44470d = ProtectedSandApp.s("ত");

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f44468b = com.bumptech.glide.load.h.g(ProtectedSandApp.s("থ"), 90);

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Bitmap.CompressFormat> f44469c = com.bumptech.glide.load.h.f(ProtectedSandApp.s("দ"));

    public e(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44471a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, com.bumptech.glide.load.i iVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.c(f44469c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.l
    @androidx.annotation.o0
    public com.bumptech.glide.load.c b(@androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@androidx.annotation.o0 com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r8, @androidx.annotation.o0 java.io.File r9, @androidx.annotation.o0 com.bumptech.glide.load.i r10) {
        /*
            r7 = this;
            java.lang.String r0 = "ত"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "ধ"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            com.bumptech.glide.util.pool.b.e(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.i.b()
            com.bumptech.glide.load.h<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.e.f44468b
            java.lang.Object r4 = r10.c(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            com.bumptech.glide.load.engine.bitmap_recycle.b r9 = r7.f44471a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            if (r9 == 0) goto L51
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r7.f44471a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            r5 = r9
            goto L52
        L4c:
            r8 = move-exception
            r5 = r6
            goto L89
        L4f:
            r5 = r6
            goto L62
        L51:
            r5 = r6
        L52:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r5.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r5.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            goto L5e
        L5c:
            r8 = move-exception
            goto L8f
        L5e:
            r9 = 1
            goto L6c
        L60:
            r8 = move-exception
            goto L89
        L62:
            r9 = 3
            android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6b
            r5.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L6b
        L6b:
            r9 = 0
        L6c:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L88
            java.util.Objects.toString(r1)
            com.bumptech.glide.util.o.i(r8)
            com.bumptech.glide.util.i.a(r2)
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.e.f44469c
            java.lang.Object r10 = r10.c(r0)
            java.util.Objects.toString(r10)
            r8.hasAlpha()
        L88:
            return r9
        L89:
            if (r5 == 0) goto L90
            r5.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L90
            goto L90
        L8f:
            throw r8
        L90:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.e.a(com.bumptech.glide.load.engine.u, java.io.File, com.bumptech.glide.load.i):boolean");
    }

    @Deprecated
    public e() {
        this.f44471a = null;
    }
}
