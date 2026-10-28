package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: classes.dex */
class s0 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f2038b;

    public s0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources) {
        super(resources);
        this.f2038b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.j0, android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        Drawable a5 = a(i4);
        Context context = this.f2038b.get();
        if (a5 != null && context != null) {
            i0.h().x(context, i4, a5);
        }
        return a5;
    }
}
