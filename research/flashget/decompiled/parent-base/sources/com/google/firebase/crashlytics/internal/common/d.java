package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* loaded from: classes6.dex */
public abstract class d implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
