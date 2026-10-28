package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.o0;
import androidx.work.impl.model.r;
import androidx.work.s;
import androidx.work.t;

/* compiled from: NetworkMeteredController.java */
/* loaded from: classes3.dex */
public class e extends c<androidx.work.impl.constraints.b> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f36120e = s.f("NetworkMeteredCtrlr");

    public e(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(androidx.work.impl.constraints.trackers.g.c(context, taskExecutor).d());
    }

    @Override // androidx.work.impl.constraints.controllers.c
    boolean b(@o0 r workSpec) {
        return workSpec.f36355j.b() == t.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@o0 androidx.work.impl.constraints.b state) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (state.a() && state.b()) ? false : true;
        }
        s.c().a(f36120e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !state.a();
    }
}
