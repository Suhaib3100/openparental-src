package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.w;

/* compiled from: FetchAction.java */
/* loaded from: classes6.dex */
class l extends a<Object> {

    /* renamed from: m, reason: collision with root package name */
    private final Object f70942m;

    /* renamed from: n, reason: collision with root package name */
    private f f70943n;

    l(w wVar, b0 b0Var, int i4, int i5, Object obj, String str, f fVar) {
        super(wVar, null, b0Var, i4, i5, 0, null, str, obj, false);
        this.f70942m = new Object();
        this.f70943n = fVar;
    }

    @Override // com.squareup.picasso.a
    void a() {
        this.f70729l = true;
        this.f70943n = null;
    }

    @Override // com.squareup.picasso.a
    void b(Bitmap bitmap, w.e eVar) {
        f fVar = this.f70943n;
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    void c(Exception exc) {
        f fVar = this.f70943n;
        if (fVar != null) {
            fVar.onError(exc);
        }
    }

    @Override // com.squareup.picasso.a
    Object k() {
        return this.f70942m;
    }
}
