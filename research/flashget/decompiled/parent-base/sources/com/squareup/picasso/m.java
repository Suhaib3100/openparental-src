package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.IOException;

/* compiled from: FileRequestHandler.java */
/* loaded from: classes6.dex */
class m extends h {
    m(Context context) {
        super(context);
    }

    static int k(Uri uri) throws IOException {
        return new androidx.exifinterface.media.a(uri.getPath()).l("Orientation", 1);
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        return "file".equals(b0Var.f70750d.getScheme());
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        return new d0.a(null, okio.a0.m(j(b0Var)), w.e.DISK, k(b0Var.f70750d));
    }
}
