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
/* loaded from: classes6.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    private float f53511c;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private com.google.android.material.resources.d f53514f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f53509a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.material.resources.f f53510b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f53512d = true;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private WeakReference<b> f53513e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    class a extends com.google.android.material.resources.f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i4) {
            k.this.f53512d = true;
            b bVar = (b) k.this.f53513e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.f
        public void b(@o0 Typeface typeface, boolean z4) {
            if (z4) {
                return;
            }
            k.this.f53512d = true;
            b bVar = (b) k.this.f53513e.get();
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
        return this.f53509a.measureText(charSequence, 0, charSequence.length());
    }

    @q0
    public com.google.android.material.resources.d d() {
        return this.f53514f;
    }

    @o0
    public TextPaint e() {
        return this.f53509a;
    }

    public float f(String str) {
        if (!this.f53512d) {
            return this.f53511c;
        }
        float c5 = c(str);
        this.f53511c = c5;
        this.f53512d = false;
        return c5;
    }

    public boolean g() {
        return this.f53512d;
    }

    public void h(@q0 b bVar) {
        this.f53513e = new WeakReference<>(bVar);
    }

    public void i(@q0 com.google.android.material.resources.d dVar, Context context) {
        if (this.f53514f != dVar) {
            this.f53514f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f53509a, this.f53510b);
                b bVar = this.f53513e.get();
                if (bVar != null) {
                    this.f53509a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f53509a, this.f53510b);
                this.f53512d = true;
            }
            b bVar2 = this.f53513e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z4) {
        this.f53512d = z4;
    }

    public void k(Context context) {
        this.f53514f.j(context, this.f53509a, this.f53510b);
    }
}
