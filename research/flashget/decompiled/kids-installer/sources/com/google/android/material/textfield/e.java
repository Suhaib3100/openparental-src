package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.o0;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes2.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f14498a;

    /* renamed from: b, reason: collision with root package name */
    Context f14499b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f14500c;

    e(@o0 TextInputLayout textInputLayout) {
        this.f14498a = textInputLayout;
        this.f14499b = textInputLayout.getContext();
        this.f14500c = textInputLayout.f0();
    }

    abstract void a();

    boolean b(int i5) {
        return true;
    }

    void c(boolean z5) {
    }

    boolean d() {
        return false;
    }
}
