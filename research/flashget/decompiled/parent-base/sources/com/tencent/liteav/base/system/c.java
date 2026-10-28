package com.tencent.liteav.base.system;

import com.tencent.liteav.base.util.i;

/* loaded from: classes7.dex */
final /* synthetic */ class c implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private static final c f71899a = new c();

    private c() {
    }

    public static i.a a() {
        return f71899a;
    }

    @Override // com.tencent.liteav.base.util.i.a
    public final void a(boolean z4) {
        LiteavSystemInfo.onAppBackgroundStateChanged(z4);
    }
}
