package com.tencent.liteav.sdkcommon;

import android.view.View;

/* loaded from: classes7.dex */
final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final g f72056a;

    private k(g gVar) {
        this.f72056a = gVar;
    }

    public static View.OnClickListener a(g gVar) {
        return new k(gVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f72056a.a(false);
    }
}
