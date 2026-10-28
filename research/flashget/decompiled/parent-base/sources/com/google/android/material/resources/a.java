package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.c1;

/* compiled from: CancelableFontCallback.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f53761a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0813a f53762b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f53763c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    public interface InterfaceC0813a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0813a interfaceC0813a, Typeface typeface) {
        this.f53761a = typeface;
        this.f53762b = interfaceC0813a;
    }

    private void d(Typeface typeface) {
        if (this.f53763c) {
            return;
        }
        this.f53762b.a(typeface);
    }

    @Override // com.google.android.material.resources.f
    public void a(int i4) {
        d(this.f53761a);
    }

    @Override // com.google.android.material.resources.f
    public void b(Typeface typeface, boolean z4) {
        d(typeface);
    }

    public void c() {
        this.f53763c = true;
    }
}
