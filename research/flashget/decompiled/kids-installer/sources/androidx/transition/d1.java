package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* loaded from: classes.dex */
class d1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9862b = "ViewUtilsBase";

    /* renamed from: c, reason: collision with root package name */
    private static Method f9863c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f9864d = false;

    /* renamed from: e, reason: collision with root package name */
    private static Field f9865e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f9866f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9867g = 12;

    /* renamed from: a, reason: collision with root package name */
    private float[] f9868a;

    d1() {
    }

    @SuppressLint({"PrivateApi"})
    private void b() {
        if (f9864d) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f9863c = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f9864d = true;
    }

    public void a(@androidx.annotation.o0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(s.e.f10027y, null);
        }
    }

    public float c(@androidx.annotation.o0 View view) {
        Float f6 = (Float) view.getTag(s.e.f10027y);
        return f6 != null ? view.getAlpha() / f6.floatValue() : view.getAlpha();
    }

    public void d(@androidx.annotation.o0 View view) {
        int i5 = s.e.f10027y;
        if (view.getTag(i5) == null) {
            view.setTag(i5, Float.valueOf(view.getAlpha()));
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
        float[] fArr = this.f9868a;
        if (fArr == null) {
            fArr = new float[9];
            this.f9868a = fArr;
        }
        matrix.getValues(fArr);
        float f6 = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f6 * f6))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f6, sqrt));
        float f7 = fArr[0] / sqrt;
        float f8 = fArr[4] / sqrt;
        float f9 = fArr[2];
        float f10 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f9);
        view.setTranslationY(f10);
        view.setRotation(degrees);
        view.setScaleX(f7);
        view.setScaleY(f8);
    }

    public void f(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        b();
        Method method = f9863c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6.getCause());
            }
        }
    }

    public void g(@androidx.annotation.o0 View view, float f6) {
        Float f7 = (Float) view.getTag(s.e.f10027y);
        if (f7 != null) {
            view.setAlpha(f7.floatValue() * f6);
        } else {
            view.setAlpha(f6);
        }
    }

    public void h(@androidx.annotation.o0 View view, int i5) {
        if (!f9866f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f9865e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9866f = true;
        }
        Field field = f9865e;
        if (field != null) {
            try {
                f9865e.setInt(view, i5 | (field.getInt(view) & (-13)));
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
