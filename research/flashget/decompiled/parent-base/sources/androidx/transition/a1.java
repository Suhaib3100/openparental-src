package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* loaded from: classes3.dex */
class a1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f34353b = "ViewUtilsBase";

    /* renamed from: c, reason: collision with root package name */
    private static Method f34354c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f34355d = false;

    /* renamed from: e, reason: collision with root package name */
    private static Field f34356e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f34357f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final int f34358g = 12;

    /* renamed from: a, reason: collision with root package name */
    private float[] f34359a;

    a1() {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (f34355d) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f34354c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f34355d = true;
    }

    public void a(@androidx.annotation.o0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(q.g.Y0, null);
        }
    }

    public float c(@androidx.annotation.o0 View view) {
        Float f4 = (Float) view.getTag(q.g.Y0);
        return f4 != null ? view.getAlpha() / f4.floatValue() : view.getAlpha();
    }

    public void d(@androidx.annotation.o0 View view) {
        int i4 = q.g.Y0;
        if (view.getTag(i4) == null) {
            view.setTag(i4, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f34359a;
        if (fArr == null) {
            fArr = new float[9];
            this.f34359a = fArr;
        }
        matrix.getValues(fArr);
        float f4 = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f4 * f4))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f4, sqrt));
        float f5 = fArr[0] / sqrt;
        float f6 = fArr[4] / sqrt;
        float f7 = fArr[2];
        float f10 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f7);
        view.setTranslationY(f10);
        view.setRotation(degrees);
        view.setScaleX(f5);
        view.setScaleY(f6);
    }

    public void f(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        b();
        Method method = f34354c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    public void g(@androidx.annotation.o0 View view, float f4) {
        Float f5 = (Float) view.getTag(q.g.Y0);
        if (f5 != null) {
            view.setAlpha(f5.floatValue() * f4);
        } else {
            view.setAlpha(f4);
        }
    }

    public void h(@androidx.annotation.o0 View view, int i4) {
        if (!f34357f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f34356e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f34357f = true;
        }
        Field field = f34356e;
        if (field != null) {
            try {
                f34356e.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
