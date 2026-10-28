package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
final class t extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f4752a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f4753b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f4754c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f4755d;

    t(@q0 t tVar) {
        this.f4754c = null;
        this.f4755d = r.f4743u;
        if (tVar != null) {
            this.f4752a = tVar.f4752a;
            this.f4753b = tVar.f4753b;
            this.f4754c = tVar.f4754c;
            this.f4755d = tVar.f4755d;
        }
    }

    boolean a() {
        return this.f4753b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i5 = this.f4752a;
        Drawable.ConstantState constantState = this.f4753b;
        return i5 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @o0
    public Drawable newDrawable() {
        return new s(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @o0
    public Drawable newDrawable(@q0 Resources resources) {
        return new s(this, resources);
    }
}
