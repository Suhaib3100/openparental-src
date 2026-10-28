package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final View f72327a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72328b;

    private a(View view, int i4) {
        this.f72327a = view;
        this.f72328b = i4;
    }

    public static Runnable a(View view, int i4) {
        return new a(view, i4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72327a.setVisibility(this.f72328b);
    }
}
