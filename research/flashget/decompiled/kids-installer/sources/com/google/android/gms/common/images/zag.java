package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i5) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i5;
    }

    protected abstract void zaa(@q0 Drawable drawable, boolean z5, boolean z6, boolean z7);

    final void zab(Context context, zak zakVar, boolean z5) {
        int i5 = this.zab;
        zaa(i5 != 0 ? context.getResources().getDrawable(i5) : null, z5, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z5) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
