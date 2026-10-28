package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.m1;
import androidx.annotation.x0;
import fg.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WindowMetricsCalculatorCompat.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"¨\u0006$"}, d2 = {"Landroidx/window/layout/g0;", "Landroidx/window/layout/d0;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "Lkotlin/k2;", "l", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context", "", "j", "(Landroid/content/Context;)I", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "i", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "Landroidx/window/layout/c0;", "c", "(Landroid/app/Activity;)Landroidx/window/layout/c0;", "d", "h", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "g", "f", "e", "Landroid/graphics/Point;", "k", "(Landroid/view/Display;)Landroid/graphics/Point;", "", "Ljava/lang/String;", "TAG", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final g0 f35808b = new g0();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private static final String TAG;

    static {
        String simpleName = g0.class.getSimpleName();
        l0.o(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private g0() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    @x0(28)
    private final DisplayCutout i(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (e0.a(obj)) {
                return f0.a(obj);
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private final int j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void l(Activity activity, Rect bounds) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(bounds);
    }

    @Override // androidx.window.sidecar.d0
    @l
    public c0 c(@l Activity activity) {
        l0.p(activity, "activity");
        int i4 = Build.VERSION.SDK_INT;
        return new c0(i4 >= 30 ? e.f35806a.a(activity) : i4 >= 29 ? h(activity) : i4 >= 28 ? g(activity) : f(activity));
    }

    @Override // androidx.window.sidecar.d0
    @l
    public c0 d(@l Activity activity) {
        Rect rect;
        l0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = e.f35806a.b(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            l0.o(display, "display");
            Point k4 = k(display);
            rect = new Rect(0, 0, k4.x, k4.y);
        }
        return new c0(rect);
    }

    @l
    @x0(14)
    public final Rect e(@l Activity activity) {
        int i4;
        l0.p(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        l0.o(defaultDisplay, "defaultDisplay");
        Point k4 = k(defaultDisplay);
        Rect rect = new Rect();
        int i5 = k4.x;
        if (i5 == 0 || (i4 = k4.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i5;
            rect.bottom = i4;
        }
        return rect;
    }

    @l
    @x0(24)
    public final Rect f(@l Activity activity) {
        l0.p(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f35797a.a(activity)) {
            l0.o(defaultDisplay, "defaultDisplay");
            Point k4 = k(defaultDisplay);
            int j4 = j(activity);
            int i4 = rect.bottom;
            if (i4 + j4 == k4.y) {
                rect.bottom = i4 + j4;
            } else {
                int i5 = rect.right;
                if (i5 + j4 == k4.x) {
                    rect.right = i5 + j4;
                }
            }
        }
        return rect;
    }

    @l
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @x0(28)
    public final Rect g(@l Activity activity) {
        DisplayCutout i4;
        l0.p(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f35797a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException unused) {
            l(activity, rect);
        } catch (NoSuchFieldException unused2) {
            l(activity, rect);
        } catch (NoSuchMethodException unused3) {
            l(activity, rect);
        } catch (InvocationTargetException unused4) {
            l(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        f fVar = f.f35807a;
        l0.o(currentDisplay, "currentDisplay");
        fVar.a(currentDisplay, point);
        a aVar = a.f35797a;
        if (!aVar.a(activity)) {
            int j4 = j(activity);
            int i5 = rect.bottom;
            if (i5 + j4 == point.y) {
                rect.bottom = i5 + j4;
            } else {
                int i6 = rect.right;
                if (i6 + j4 == point.x) {
                    rect.right = i6 + j4;
                } else if (rect.left == j4) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (i4 = i(currentDisplay)) != null) {
            int i7 = rect.left;
            k kVar = k.f35810a;
            if (i7 == kVar.b(i4)) {
                rect.left = 0;
            }
            if (point.x - rect.right == kVar.c(i4)) {
                rect.right = kVar.c(i4) + rect.right;
            }
            if (rect.top == kVar.d(i4)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == kVar.a(i4)) {
                rect.bottom = kVar.a(i4) + rect.bottom;
            }
        }
        return rect;
    }

    @l
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @x0(29)
    public final Rect h(@l Activity activity) {
        l0.p(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException unused) {
            return g(activity);
        } catch (NoSuchFieldException unused2) {
            return g(activity);
        } catch (NoSuchMethodException unused3) {
            return g(activity);
        } catch (InvocationTargetException unused4) {
            return g(activity);
        }
    }

    @l
    @m1
    @x0(14)
    public final Point k(@l Display display) {
        l0.p(display, "display");
        Point point = new Point();
        f.f35807a.a(display, point);
        return point;
    }
}
