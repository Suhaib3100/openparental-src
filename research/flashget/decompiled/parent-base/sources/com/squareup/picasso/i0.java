package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.w;

/* compiled from: TargetAction.java */
/* loaded from: classes6.dex */
final class i0 extends a<h0> {
    i0(w wVar, h0 h0Var, b0 b0Var, int i4, int i5, Drawable drawable, String str, Object obj, int i6) {
        super(wVar, h0Var, b0Var, i4, i5, i6, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.a
    void b(Bitmap bitmap, w.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        h0 k4 = k();
        if (k4 != null) {
            k4.a(bitmap, eVar);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.a
    void c(Exception exc) {
        h0 k4 = k();
        if (k4 != null) {
            if (this.f70724g != 0) {
                k4.b(exc, this.f70718a.f70975e.getResources().getDrawable(this.f70724g));
            } else {
                k4.b(exc, this.f70725h);
            }
        }
    }
}
