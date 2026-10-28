package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    private float f13716c;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private com.google.android.material.resources.d f13719f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f13714a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.material.resources.f f13715b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f13717d = true;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private WeakReference<b> f13718e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    class a extends com.google.android.material.resources.f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i5) {
            k.this.f13717d = true;
            b bVar = (b) k.this.f13718e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.f
        public void b(@o0 Typeface typeface, boolean z5) {
            if (z5) {
                return;
            }
            k.this.f13717d = true;
            b bVar = (b) k.this.f13718e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        @o0
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public k(@q0 b bVar) {
        h(bVar);
    }

    private float c(@q0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f13714a.measureText(charSequence, 0, charSequence.length());
    }

    @q0
    public com.google.android.material.resources.d d() {
        return this.f13719f;
    }

    @o0
    public TextPaint e() {
        return this.f13714a;
    }

    public float f(String str) {
        if (!this.f13717d) {
            return this.f13716c;
        }
        float c6 = c(str);
        this.f13716c = c6;
        this.f13717d = false;
        return c6;
    }

    public boolean g() {
        return this.f13717d;
    }

    public void h(@q0 b bVar) {
        this.f13718e = new WeakReference<>(bVar);
    }

    public void i(@q0 com.google.android.material.resources.d dVar, Context context) {
        if (this.f13719f != dVar) {
            this.f13719f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f13714a, this.f13715b);
                b bVar = this.f13718e.get();
                if (bVar != null) {
                    this.f13714a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f13714a, this.f13715b);
                this.f13717d = true;
            }
            b bVar2 = this.f13718e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z5) {
        this.f13717d = z5;
    }

    public void k(Context context) {
        this.f13719f.j(context, this.f13714a, this.f13715b);
    }
}
