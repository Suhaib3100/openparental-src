package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.c1;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f1 extends Resources {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1230b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1231c = 20;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f1232a;

    public f1(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1232a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1230b;
    }

    public static void b(boolean z5) {
        f1230b = z5;
    }

    public static boolean c() {
        return false;
    }

    final Drawable d(int i5) {
        return super.getDrawable(i5);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i5) throws Resources.NotFoundException {
        Context context = this.f1232a.get();
        return context != null ? o0.h().t(context, this, i5) : super.getDrawable(i5);
    }
}
