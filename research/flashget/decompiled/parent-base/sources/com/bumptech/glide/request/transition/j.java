package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.f;

/* compiled from: ViewPropertyTransition.java */
/* loaded from: classes3.dex */
public class j<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final a f44931a;

    /* compiled from: ViewPropertyTransition.java */
    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f44931a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r4, f.a aVar) {
        if (aVar.getView() == null) {
            return false;
        }
        this.f44931a.a(aVar.getView());
        return false;
    }
}
