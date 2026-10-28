package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes3.dex */
public class e implements com.bumptech.glide.load.l<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11708a;

    /* renamed from: d, reason: collision with root package name */
    private static final String f11707d = ProtectedSandApp.s("ᵖ");

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f11705b = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ᵗ"), 90);

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Bitmap.CompressFormat> f11706c = com.bumptech.glide.load.h.f(ProtectedSandApp.s("ᵘ"));

    public e(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f11708a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, com.bumptech.glide.load.i iVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.c(f11706c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.l
    @androidx.annotation.o0
    public com.bumptech.glide.load.c b(@androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0016, B:14:0x0040, B:17:0x0058, B:19:0x005e, B:42:0x0076, B:40:0x0079, B:34:0x0053), top: B:2:0x0016 }] */
    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@androidx.annotation.o0 com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r8, @androidx.annotation.o0 java.io.File r9, @androidx.annotation.o0 com.bumptech.glide.load.i r10) {
        /*
            r7 = this;
            java.lang.String r0 = "ᵙ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            r8.getWidth()
            r8.getHeight()
            long r2 = com.bumptech.glide.util.h.b()     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.load.h<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.e.f11705b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r4 = r10.c(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L7a
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            com.bumptech.glide.load.engine.bitmap_recycle.b r9 = r7.f11708a     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            if (r9 == 0) goto L39
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r7.f11708a     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            r5 = r9
            goto L3a
        L39:
            r5 = r6
        L3a:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            r5.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            r5.close()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L7a
        L43:
            r9 = 1
            goto L57
        L45:
            r8 = move-exception
            r5 = r6
            goto L74
        L48:
            r5 = r6
            goto L4c
        L4a:
            r8 = move-exception
            goto L74
        L4c:
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L7a
        L56:
            r9 = 0
        L57:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L73
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.util.n.h(r8)     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.util.h.a(r2)     // Catch: java.lang.Throwable -> L7a
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.e.f11706c     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r10 = r10.c(r0)     // Catch: java.lang.Throwable -> L7a
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> L7a
            r8.hasAlpha()     // Catch: java.lang.Throwable -> L7a
        L73:
            return r9
        L74:
            if (r5 == 0) goto L79
            r5.close()     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7a
        L79:
            throw r8     // Catch: java.lang.Throwable -> L7a
        L7a:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.e.a(com.bumptech.glide.load.engine.u, java.io.File, com.bumptech.glide.load.i):boolean");
    }

    @Deprecated
    public e() {
        this.f11708a = null;
    }
}
