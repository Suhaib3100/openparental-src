package androidx.transition;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import androidx.transition.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi14.java */
/* loaded from: classes.dex */
class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9924a = "ViewGroupUtilsApi14";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9925b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static LayoutTransition f9926c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f9927d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f9928e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f9929f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f9930g;

    /* compiled from: ViewGroupUtilsApi14.java */
    static class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private m0() {
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!f9930g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f9929f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f9930g = true;
        }
        Method method = f9929f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    static void b(@androidx.annotation.o0 ViewGroup viewGroup, boolean z5) {
        boolean z6 = false;
        if (f9926c == null) {
            a aVar = new a();
            f9926c = aVar;
            aVar.setAnimator(2, null);
            f9926c.setAnimator(0, null);
            f9926c.setAnimator(1, null);
            f9926c.setAnimator(3, null);
            f9926c.setAnimator(4, null);
        }
        if (z5) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f9926c) {
                    viewGroup.setTag(s.e.I, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f9926c);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f9928e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f9927d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9928e = true;
        }
        Field field = f9927d;
        if (field != null) {
            try {
                boolean z7 = field.getBoolean(viewGroup);
                if (z7) {
                    try {
                        f9927d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z6 = z7;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z6) {
            viewGroup.requestLayout();
        }
        int i5 = s.e.I;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i5);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i5, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
