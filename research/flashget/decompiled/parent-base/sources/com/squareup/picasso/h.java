package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentStreamRequestHandler.java */
/* loaded from: classes6.dex */
class h extends d0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f70880a;

    h(Context context) {
        this.f70880a = context;
    }

    @Override // com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        return "content".equals(b0Var.f70750d.getScheme());
    }

    @Override // com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        return new d0.a(okio.a0.m(j(b0Var)), w.e.DISK);
    }

    InputStream j(b0 b0Var) throws FileNotFoundException {
        return this.f70880a.getContentResolver().openInputStream(b0Var.f70750d);
    }
}
