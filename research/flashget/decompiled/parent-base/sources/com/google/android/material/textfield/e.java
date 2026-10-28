package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.o0;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes6.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f54353a;

    /* renamed from: b, reason: collision with root package name */
    Context f54354b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f54355c;

    e(@o0 TextInputLayout textInputLayout) {
        this.f54353a = textInputLayout;
        this.f54354b = textInputLayout.getContext();
        this.f54355c = textInputLayout.f0();
    }

    abstract void a();

    boolean b(int i4) {
        return true;
    }

    void c(boolean z4) {
    }

    boolean d() {
        return false;
    }
}
