package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetIdListener.java */
/* loaded from: classes3.dex */
class n implements s {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource<String> f16761a;

    public n(TaskCompletionSource<String> taskCompletionSource) {
        this.f16761a = taskCompletionSource;
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
        this.f16761a.trySetResult(dVar.d());
        return true;
    }
}
