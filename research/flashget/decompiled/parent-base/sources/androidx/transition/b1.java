package androidx.transition;

import android.view.View;

/* compiled from: VisibilityPropagation.java */
/* loaded from: classes3.dex */
public abstract class b1 extends y {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34366a = "android:visibilityPropagation:visibility";

    /* renamed from: b, reason: collision with root package name */
    private static final String f34367b = "android:visibilityPropagation:center";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f34368c = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(b0 b0Var, int i4) {
        int[] iArr;
        if (b0Var == null || (iArr = (int[]) b0Var.f34363a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i4];
    }

    @Override // androidx.transition.y
    public void a(b0 b0Var) {
        View view = b0Var.f34364b;
        Integer num = (Integer) b0Var.f34363a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        b0Var.f34363a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r5, 0};
        view.getLocationOnScreen(iArr);
        int round = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        b0Var.f34363a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.y
    public String[] b() {
        return f34368c;
    }

    public int e(b0 b0Var) {
        Integer num;
        if (b0Var == null || (num = (Integer) b0Var.f34363a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(b0 b0Var) {
        return d(b0Var, 0);
    }

    public int g(b0 b0Var) {
        return d(b0Var, 1);
    }
}
