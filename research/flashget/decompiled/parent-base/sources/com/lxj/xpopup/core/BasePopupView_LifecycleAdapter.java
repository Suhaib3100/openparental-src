package com.lxj.xpopup.core;

import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1447t;
import androidx.view.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class BasePopupView_LifecycleAdapter implements InterfaceC1447t {

    /* renamed from: a, reason: collision with root package name */
    final BasePopupView f69560a;

    BasePopupView_LifecycleAdapter(BasePopupView receiver) {
        this.f69560a = receiver;
    }

    @Override // androidx.view.InterfaceC1447t
    public void a(InterfaceC1423e0 owner, AbstractC1450w.a event, boolean onAny, n0 logger) {
        boolean z4 = logger != null;
        if (!onAny && event == AbstractC1450w.a.ON_DESTROY) {
            if (!z4 || logger.a(ProtectedSandApp.s("ធ\u0001"), 1)) {
                this.f69560a.onDestroy();
            }
        }
    }
}
