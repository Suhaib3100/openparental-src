package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.IOException;

/* compiled from: MediaStoreRequestHandler.java */
/* loaded from: classes6.dex */
class r extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f70958b = {"orientation"};

    /* compiled from: MediaStoreRequestHandler.java */
    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        a(int i4, int i5, int i6) {
            this.androidKind = i4;
            this.width = i5;
            this.height = i6;
        }
    }

    r(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.r.f70958b     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            if (r1 == 0) goto L20
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            if (r8 != 0) goto L16
            goto L20
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L2c
            r1.close()
            return r8
        L1e:
            r8 = move-exception
            goto L26
        L20:
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()
        L2b:
            throw r8
        L2c:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.r.k(android.content.ContentResolver, android.net.Uri):int");
    }

    static a l(int i4, int i5) {
        a aVar = a.MICRO;
        if (i4 <= aVar.width && i5 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i4 > aVar2.width || i5 > aVar2.height) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        Uri uri = b0Var.f70750d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f70880a.getContentResolver();
        int k4 = k(contentResolver, b0Var.f70750d);
        String type = contentResolver.getType(b0Var.f70750d);
        boolean z4 = type != null && type.startsWith("video/");
        if (b0Var.d()) {
            a l4 = l(b0Var.f70754h, b0Var.f70755i);
            if (!z4 && l4 == a.FULL) {
                return new d0.a(null, okio.a0.m(j(b0Var)), w.e.DISK, k4);
            }
            long parseId = ContentUris.parseId(b0Var.f70750d);
            BitmapFactory.Options d5 = d0.d(b0Var);
            d5.inJustDecodeBounds = true;
            d0.a(b0Var.f70754h, b0Var.f70755i, l4.width, l4.height, d5, b0Var);
            if (z4) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l4 == a.FULL ? 1 : l4.androidKind, d5);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l4.androidKind, d5);
            }
            if (thumbnail != null) {
                return new d0.a(thumbnail, null, w.e.DISK, k4);
            }
        }
        return new d0.a(null, okio.a0.m(j(b0Var)), w.e.DISK, k4);
    }
}
