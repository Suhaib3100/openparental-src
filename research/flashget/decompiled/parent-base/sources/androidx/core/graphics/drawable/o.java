package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes3.dex */
final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f26240a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f26241b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f26242c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f26243d;

    o(@q0 o oVar) {
        this.f26242c = null;
        this.f26243d = m.f26231h;
        if (oVar != null) {
            this.f26240a = oVar.f26240a;
            this.f26241b = oVar.f26241b;
            this.f26242c = oVar.f26242c;
            this.f26243d = oVar.f26243d;
        }
    }

    boolean a() {
        return this.f26241b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i4 = this.f26240a;
        Drawable.ConstantState constantState = this.f26241b;
        return i4 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @o0
    public Drawable newDrawable() {
        return new n(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @o0
    public Drawable newDrawable(@q0 Resources resources) {
        return new n(this, resources);
    }
}
