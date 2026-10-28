package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: classes2.dex */
class y0 extends p0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f1409b;

    public y0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources) {
        super(resources);
        this.f1409b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.p0, android.content.res.Resources
    public Drawable getDrawable(int i5) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i5);
        Context context = this.f1409b.get();
        if (drawable != null && context != null) {
            o0.h().x(context, i5, drawable);
        }
        return drawable;
    }
}
