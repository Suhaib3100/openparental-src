package androidx.transition;

import android.view.View;

/* compiled from: VisibilityPropagation.java */
/* loaded from: classes3.dex */
public abstract class e1 extends a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9874a = "android:visibilityPropagation:visibility";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9875b = "android:visibilityPropagation:center";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f9876c = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(d0 d0Var, int i5) {
        int[] iArr;
        if (d0Var == null || (iArr = (int[]) d0Var.f9859a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i5];
    }

    @Override // androidx.transition.a0
    public void a(d0 d0Var) {
        View view = d0Var.f9860b;
        Integer num = (Integer) d0Var.f9859a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        d0Var.f9859a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r5, 0};
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        d0Var.f9859a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.a0
    public String[] b() {
        return f9876c;
    }

    public int e(d0 d0Var) {
        Integer num;
        if (d0Var == null || (num = (Integer) d0Var.f9859a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(d0 d0Var) {
        return d(d0Var, 0);
    }

    public int g(d0 d0Var) {
        return d(d0Var, 1);
    }
}
