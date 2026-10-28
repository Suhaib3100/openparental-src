package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.c1;
import d.a;

/* compiled from: ActionBarPolicy.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f1054a;

    private a(Context context) {
        this.f1054a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f1054a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f1054a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f1054a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f1054a.getResources().getDimensionPixelSize(a.e.f73152k);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f1054a.obtainStyledAttributes(null, a.m.f73485a, a.b.f72973f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.m.f73559o, 0);
        Resources resources = this.f1054a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.e.f73150j));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f1054a.getResources().getBoolean(a.c.f73078a);
    }

    public boolean h() {
        return true;
    }
}
