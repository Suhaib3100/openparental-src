package com.lxj.xpopup.core;

import android.view.a0;
import android.view.i0;
import android.view.q;
import android.view.t;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes5.dex */
public class BasePopupView_LifecycleAdapter implements q {

    /* renamed from: a, reason: collision with root package name */
    final BasePopupView f21099a;

    BasePopupView_LifecycleAdapter(BasePopupView receiver) {
        this.f21099a = receiver;
    }

    @Override // android.view.q
    public void a(a0 owner, t.b event, boolean onAny, i0 logger) {
        boolean z5 = logger != null;
        if (!onAny && event == t.b.ON_DESTROY) {
            if (!z5 || logger.a(ProtectedSandApp.s("㔆"), 1)) {
                this.f21099a.onDestroy();
            }
        }
    }
}
