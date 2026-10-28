package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.a;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes3.dex */
class m implements s {

    /* renamed from: a, reason: collision with root package name */
    private final t f16759a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<o> f16760b;

    public m(t tVar, TaskCompletionSource<o> taskCompletionSource) {
        this.f16759a = tVar;
        this.f16760b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.s
    public boolean a(Exception exc) {
        this.f16760b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.s
    public boolean b(com.google.firebase.installations.local.d dVar) {
        if (!dVar.k() || this.f16759a.f(dVar)) {
            return false;
        }
        this.f16760b.setResult(new a.b().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
