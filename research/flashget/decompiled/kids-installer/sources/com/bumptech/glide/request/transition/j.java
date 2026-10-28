package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.f;

/* compiled from: ViewPropertyTransition.java */
/* loaded from: classes3.dex */
public class j<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final a f12125a;

    /* compiled from: ViewPropertyTransition.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f12125a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r5, f.a aVar) {
        if (aVar.d() == null) {
            return false;
        }
        this.f12125a.a(aVar.d());
        return false;
    }
}
