package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.u;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DrawableResource.java */
/* loaded from: classes3.dex */
public abstract class j<T extends Drawable> implements u<T>, q {

    /* renamed from: b, reason: collision with root package name */
    protected final T f44582b;

    public j(T t4) {
        this.f44582b = (T) com.bumptech.glide.util.m.f(t4, ProtectedSandApp.s("ট"));
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f44582b.getConstantState();
        return constantState == null ? this.f44582b : (T) constantState.newDrawable();
    }

    public void c() {
        T t4 = this.f44582b;
        if (t4 instanceof BitmapDrawable) {
            ((BitmapDrawable) t4).getBitmap().prepareToDraw();
        } else if (t4 instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t4).h().prepareToDraw();
        }
    }
}
