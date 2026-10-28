package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.l;

/* compiled from: DrawableResource.java */
/* loaded from: classes3.dex */
public abstract class b<T extends Drawable> implements u<T>, q {

    /* renamed from: o, reason: collision with root package name */
    protected final T f11805o;

    public b(T t5) {
        this.f11805o = (T) l.d(t5);
    }

    public void b() {
        T t5 = this.f11805o;
        if (t5 instanceof BitmapDrawable) {
            ((BitmapDrawable) t5).getBitmap().prepareToDraw();
        } else if (t5 instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t5).g().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f11805o.getConstantState();
        return constantState == null ? this.f11805o : (T) constantState.newDrawable();
    }
}
