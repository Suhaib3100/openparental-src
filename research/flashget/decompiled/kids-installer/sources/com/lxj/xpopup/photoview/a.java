package com.lxj.xpopup.photoview;

import android.annotation.TargetApi;
import android.view.View;

/* compiled from: Compat.java */
/* loaded from: classes5.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f21203a = 16;

    a() {
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @TargetApi(16)
    private static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
