package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetIdListener.java */
/* loaded from: classes6.dex */
class n implements s {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource<String> f59782a;

    public n(TaskCompletionSource<String> taskCompletionSource) {
        this.f59782a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.s
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.s
    public boolean b(com.google.firebase.installations.local.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f59782a.trySetResult(dVar.d());
        return true;
    }
}
