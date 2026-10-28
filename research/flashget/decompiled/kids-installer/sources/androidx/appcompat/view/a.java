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
    private Context f532a;

    private a(Context context) {
        this.f532a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f532a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f532a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f532a.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600) {
            return 5;
        }
        if (i5 > 960 && i6 > 720) {
            return 5;
        }
        if (i5 > 720 && i6 > 960) {
            return 5;
        }
        if (i5 >= 500) {
            return 4;
        }
        if (i5 > 640 && i6 > 480) {
            return 4;
        }
        if (i5 <= 480 || i6 <= 640) {
            return i5 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f532a.getResources().getDimensionPixelSize(a.f.f21764k);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f532a.obtainStyledAttributes(null, a.n.f22158a, a.c.f21559f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.n.f22248o, 0);
        Resources resources = this.f532a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.f.f21761j));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f532a.getResources().getBoolean(a.d.f21680a);
    }

    public boolean h() {
        return true;
    }
}
