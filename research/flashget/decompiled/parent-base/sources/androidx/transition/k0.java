package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.transition.q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi14.java */
/* loaded from: classes3.dex */
class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34425a = "ViewGroupUtilsApi14";

    /* renamed from: b, reason: collision with root package name */
    private static final int f34426b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static LayoutTransition f34427c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f34428d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f34429e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f34430f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f34431g;

    /* compiled from: ViewGroupUtilsApi14.java */
    class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private k0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void a(LayoutTransition layoutTransition) {
        if (!f34431g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", null);
                f34430f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f34431g = true;
        }
        Method method = f34430f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, null);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    static void b(@androidx.annotation.o0 ViewGroup viewGroup, boolean z4) {
        boolean z5 = false;
        if (f34427c == null) {
            a aVar = new a();
            f34427c = aVar;
            aVar.setAnimator(2, null);
            f34427c.setAnimator(0, null);
            f34427c.setAnimator(1, null);
            f34427c.setAnimator(3, null);
            f34427c.setAnimator(4, null);
        }
        if (z4) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f34427c) {
                    viewGroup.setTag(q.g.S1, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f34427c);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f34429e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f34428d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34429e = true;
        }
        Field field = f34428d;
        if (field != null) {
            try {
                boolean z6 = field.getBoolean(viewGroup);
                if (z6) {
                    try {
                        f34428d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z5 = z6;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z5) {
            viewGroup.requestLayout();
        }
        int i4 = q.g.S1;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i4);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i4, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
