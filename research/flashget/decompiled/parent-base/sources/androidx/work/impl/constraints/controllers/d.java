package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.o0;
import androidx.work.impl.model.r;
import androidx.work.t;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes3.dex */
public class d extends c<androidx.work.impl.constraints.b> {
    public d(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(androidx.work.impl.constraints.trackers.g.c(context, taskExecutor).d());
    }

    @Override // androidx.work.impl.constraints.controllers.c
    boolean b(@o0 r workSpec) {
        return workSpec.f36355j.b() == t.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@o0 androidx.work.impl.constraints.b state) {
        return Build.VERSION.SDK_INT >= 26 ? (state.a() && state.d()) ? false : true : !state.a();
    }
}
