package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.c1;

/* compiled from: CancelableFontCallback.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f13911a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0179a f13912b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13913c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0179a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0179a interfaceC0179a, Typeface typeface) {
        this.f13911a = typeface;
        this.f13912b = interfaceC0179a;
    }

    private void d(Typeface typeface) {
        if (this.f13913c) {
            return;
        }
        this.f13912b.a(typeface);
    }

    @Override // com.google.android.material.resources.f
    public void a(int i5) {
        d(this.f13911a);
    }

    @Override // com.google.android.material.resources.f
    public void b(Typeface typeface, boolean z5) {
        d(typeface);
    }

    public void c() {
        this.f13913c = true;
    }
}
