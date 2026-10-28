package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.o0;
import androidx.work.impl.model.r;
import androidx.work.t;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes3.dex */
public class g extends c<androidx.work.impl.constraints.b> {
    public g(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(androidx.work.impl.constraints.trackers.g.c(context, taskExecutor).d());
    }

    @Override // androidx.work.impl.constraints.controllers.c
    boolean b(@o0 r workSpec) {
        return workSpec.f36355j.b() == t.UNMETERED || (Build.VERSION.SDK_INT >= 30 && workSpec.f36355j.b() == t.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@o0 androidx.work.impl.constraints.b state) {
        return !state.a() || state.b();
    }
}
