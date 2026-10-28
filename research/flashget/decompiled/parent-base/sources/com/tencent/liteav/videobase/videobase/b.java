package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final View f72329a;

    private b(View view) {
        this.f72329a = view;
    }

    public static Runnable a(View view) {
        return new b(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72329a.requestLayout();
    }
}
