package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.o0;
import androidx.work.impl.model.r;
import androidx.work.s;
import androidx.work.t;

/* compiled from: NetworkNotRoamingController.java */
/* loaded from: classes3.dex */
public class f extends c<androidx.work.impl.constraints.b> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f36121e = s.f("NetworkNotRoamingCtrlr");

    public f(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        super(androidx.work.impl.constraints.trackers.g.c(context, taskExecutor).d());
    }

    @Override // androidx.work.impl.constraints.controllers.c
    boolean b(@o0 r workSpec) {
        return workSpec.f36355j.b() == t.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.constraints.controllers.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(@o0 androidx.work.impl.constraints.b state) {
        return (state.a() && state.c()) ? false : true;
    }
}
