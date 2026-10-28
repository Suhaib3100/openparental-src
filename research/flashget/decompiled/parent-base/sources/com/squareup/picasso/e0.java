package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.IOException;

/* compiled from: ResourceRequestHandler.java */
/* loaded from: classes6.dex */
class e0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70836a;

    e0(Context context) {
        this.f70836a = context;
    }

    private static Bitmap j(Resources resources, int i4, b0 b0Var) {
        BitmapFactory.Options d5 = d0.d(b0Var);
        if (d0.g(d5)) {
            BitmapFactory.decodeResource(resources, i4, d5);
            d0.b(b0Var.f70754h, b0Var.f70755i, d5, b0Var);
        }
        return BitmapFactory.decodeResource(resources, i4, d5);
    }

    @Override // com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        if (b0Var.f70751e != 0) {
            return true;
        }
        return "android.resource".equals(b0Var.f70750d.getScheme());
    }

    @Override // com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        Resources n4 = k0.n(this.f70836a, b0Var);
        return new d0.a(j(n4, k0.m(n4, b0Var), b0Var), w.e.DISK);
    }
}
