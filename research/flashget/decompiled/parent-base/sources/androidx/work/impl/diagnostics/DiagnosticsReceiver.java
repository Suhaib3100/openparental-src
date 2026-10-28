package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.j;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.s;
import androidx.work.u;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36168a = s.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@o0 Context context, @q0 Intent intent) {
        if (intent == null) {
            return;
        }
        s.c().a(f36168a, "Requesting diagnostics", new Throwable[0]);
        try {
            j.H(context).j(u.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e4) {
            s.c().b(f36168a, "WorkManager is not initialized", e4);
        }
    }
}
