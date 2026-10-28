package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.annotation.c1;
import java.lang.reflect.Field;

/* compiled from: DrawableUtils.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: e, reason: collision with root package name */
    private static Class<?> f1195e;

    /* renamed from: c, reason: collision with root package name */
    private static final String f1193c = "DrawableUtils";

    /* renamed from: f, reason: collision with root package name */
    private static final String f1196f = "android.graphics.drawable.VectorDrawable";

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1191a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1192b = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Rect f1194d = new Rect();

    static {
        try {
            f1195e = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    private e0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@androidx.annotation.o0 Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof androidx.core.graphics.drawable.q) {
                return a(((androidx.core.graphics.drawable.q) drawable).b());
            }
            if (drawable instanceof androidx.appcompat.graphics.drawable.c) {
                return a(((androidx.appcompat.graphics.drawable.c) drawable).a());
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    static void b(@androidx.annotation.o0 Drawable drawable) {
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1191a);
        } else {
            drawable.setState(f1192b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        char c6;
        Insets opticalInsets;
        int i5;
        int i6;
        int i7;
        int i8;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i5 = opticalInsets.left;
            rect.left = i5;
            i6 = opticalInsets.right;
            rect.right = i6;
            i7 = opticalInsets.top;
            rect.top = i7;
            i8 = opticalInsets.bottom;
            rect.bottom = i8;
            return rect;
        }
        if (f1195e != null) {
            try {
                Drawable q5 = androidx.core.graphics.drawable.d.q(drawable);
                Object invoke = q5.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q5, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1195e.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                c6 = 65535;
                                break;
                        }
                        if (c6 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c6 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c6 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c6 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f1194d;
    }

    public static PorterDuff.Mode e(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
