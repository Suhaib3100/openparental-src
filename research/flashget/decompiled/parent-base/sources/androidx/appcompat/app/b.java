package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* compiled from: ActionBarDrawerToggleHoneycomb.java */
/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f847a = "ActionBarDrawerToggleHC";

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f848b = {R.attr.homeAsUpIndicator};

    /* compiled from: ActionBarDrawerToggleHoneycomb.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public Method f849a;

        /* renamed from: b, reason: collision with root package name */
        public Method f850b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f851c;

        a(Activity activity) {
            try {
                this.f849a = android.app.ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f850b = android.app.ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(R.id.home);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f851c = (ImageView) childAt;
                }
            }
        }
    }

    private b() {
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f848b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i4) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f849a != null) {
            try {
                aVar.f850b.invoke(activity.getActionBar(), Integer.valueOf(i4));
            } catch (Exception unused) {
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i4) {
        a aVar = new a(activity);
        if (aVar.f849a != null) {
            try {
                android.app.ActionBar actionBar = activity.getActionBar();
                aVar.f849a.invoke(actionBar, drawable);
                aVar.f850b.invoke(actionBar, Integer.valueOf(i4));
            } catch (Exception unused) {
            }
        } else {
            ImageView imageView = aVar.f851c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return aVar;
    }
}
