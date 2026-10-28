package org.androidannotations.api.builder;

import android.app.Activity;
import android.content.Context;

/* compiled from: PostActivityStarter.java */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f31761a;

    public f(Context context) {
        this.f31761a = context;
    }

    public void a(int i5, int i6) {
        Context context = this.f31761a;
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(i5, i6);
        }
    }
}
