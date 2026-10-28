package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.w;

/* compiled from: ImageViewAction.java */
/* loaded from: classes6.dex */
class o extends a<ImageView> {

    /* renamed from: m, reason: collision with root package name */
    f f70944m;

    o(w wVar, ImageView imageView, b0 b0Var, int i4, int i5, int i6, Drawable drawable, String str, Object obj, f fVar, boolean z4) {
        super(wVar, imageView, b0Var, i4, i5, i6, drawable, str, obj, z4);
        this.f70944m = fVar;
    }

    @Override // com.squareup.picasso.a
    void a() {
        this.f70729l = true;
        if (this.f70944m != null) {
            this.f70944m = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, w.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f70720c.get();
        if (imageView == null) {
            return;
        }
        w wVar = this.f70718a;
        x.c(imageView, wVar.f70975e, bitmap, eVar, this.f70721d, wVar.f70983m);
        f fVar = this.f70944m;
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f70720c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i4 = this.f70724g;
        if (i4 != 0) {
            imageView.setImageResource(i4);
        } else {
            Drawable drawable2 = this.f70725h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        f fVar = this.f70944m;
        if (fVar != null) {
            fVar.onError(exc);
        }
    }
}
