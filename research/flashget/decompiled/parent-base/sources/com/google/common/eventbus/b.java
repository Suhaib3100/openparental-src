package com.google.common.eventbus;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.eventbus.f;
import java.util.concurrent.Executor;

/* compiled from: AsyncEventBus.java */
@e
/* loaded from: classes6.dex */
public class b extends f {
    public b(String str, Executor executor) {
        super(str, executor, d.c(), f.a.f56727a);
    }

    public b(Executor executor, l lVar) {
        super(ProtectedSandApp.s("\uf598"), executor, d.c(), lVar);
    }

    public b(Executor executor) {
        super(ProtectedSandApp.s("\uf598"), executor, d.c(), f.a.f56727a);
    }
}
