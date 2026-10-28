package android.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.C0536c;
import android.view.InterfaceC0538e;
import android.view.f1;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import kotlin.AbstractC0540a;

/* compiled from: AbstractSavedStateViewModelFactory.java */
/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0523a extends f1.d implements f1.b {

    /* renamed from: e, reason: collision with root package name */
    static final String f8482e = "androidx.lifecycle.savedstate.vm.tag";

    /* renamed from: b, reason: collision with root package name */
    private C0536c f8483b;

    /* renamed from: c, reason: collision with root package name */
    private t f8484c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f8485d;

    public AbstractC0523a() {
    }

    @o0
    private <T extends c1> T e(@o0 String str, @o0 Class<T> cls) {
        SavedStateHandleController b6 = LegacySavedStateHandleController.b(this.f8483b, this.f8484c, str, this.f8485d);
        T t5 = (T) f(str, cls, b6.i());
        t5.f("androidx.lifecycle.savedstate.vm.tag", b6);
        return t5;
    }

    @Override // androidx.lifecycle.f1.b
    @o0
    public final <T extends c1> T a(@o0 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f8484c != null) {
            return (T) e(canonicalName, cls);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.f1.b
    @o0
    public final <T extends c1> T c(@o0 Class<T> cls, @o0 AbstractC0540a abstractC0540a) {
        String str = (String) abstractC0540a.a(f1.c.f8555d);
        if (str != null) {
            return this.f8483b != null ? (T) e(str, cls) : (T) f(str, cls, t0.b(abstractC0540a));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.f1.d
    @c1({c1.a.LIBRARY_GROUP})
    public void d(@o0 c1 c1Var) {
        C0536c c0536c = this.f8483b;
        if (c0536c != null) {
            LegacySavedStateHandleController.a(c1Var, c0536c, this.f8484c);
        }
    }

    @o0
    protected abstract <T extends c1> T f(@o0 String str, @o0 Class<T> cls, @o0 s0 s0Var);

    @SuppressLint({"LambdaLast"})
    public AbstractC0523a(@o0 InterfaceC0538e interfaceC0538e, @q0 Bundle bundle) {
        this.f8483b = interfaceC0538e.getSavedStateRegistry();
        this.f8484c = interfaceC0538e.getLifecycle();
        this.f8485d = bundle;
    }
}
