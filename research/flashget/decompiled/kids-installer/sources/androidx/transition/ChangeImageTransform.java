package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.c0;
import java.util.Map;

/* loaded from: classes3.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: l0, reason: collision with root package name */
    private static final String f9713l0 = "android:changeImageTransform:bounds";

    /* renamed from: k0, reason: collision with root package name */
    private static final String f9712k0 = "android:changeImageTransform:matrix";

    /* renamed from: m0, reason: collision with root package name */
    private static final String[] f9714m0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: n0, reason: collision with root package name */
    private static final TypeEvaluator<Matrix> f9715n0 = new a();

    /* renamed from: o0, reason: collision with root package name */
    private static final Property<ImageView, Matrix> f9716o0 = new b(Matrix.class, "animatedTransform");

    /* loaded from: classes.dex */
    static class a implements TypeEvaluator<Matrix> {
        a() {
        }

        public Matrix a(float f6, Matrix matrix, Matrix matrix2) {
            return null;
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f6, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        public Matrix a(ImageView imageView) {
            return null;
        }

        public void b(ImageView imageView, Matrix matrix) {
            n.a(imageView, matrix);
        }

        @Override // android.util.Property
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public void set(ImageView imageView, Matrix matrix) {
            n.a(imageView, matrix);
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9717a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f9717a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9717a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    private void P0(d0 d0Var) {
        View view = d0Var.f9860b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = d0Var.f9859a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", R0(imageView));
        }
    }

    private static Matrix Q0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f6 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f7 = intrinsicHeight;
        float max = Math.max(width / f6, height / f7);
        int round = Math.round((width - (f6 * max)) / 2.0f);
        int round2 = Math.round((height - (f7 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    @androidx.annotation.o0
    private static Matrix R0(@androidx.annotation.o0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i5 = c.f9717a[imageView.getScaleType().ordinal()];
            if (i5 == 1) {
                return V0(imageView);
            }
            if (i5 == 2) {
                return Q0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private ObjectAnimator S0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f9716o0, (TypeEvaluator) new c0.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @androidx.annotation.o0
    private ObjectAnimator U0(@androidx.annotation.o0 ImageView imageView) {
        Property<ImageView, Matrix> property = f9716o0;
        TypeEvaluator<Matrix> typeEvaluator = f9715n0;
        Matrix matrix = o.f9941a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix V0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    public String[] e0() {
        return f9714m0;
    }

    @Override // androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        P0(d0Var);
    }

    @Override // androidx.transition.Transition
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) d0Var.f9859a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) d0Var2.f9859a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) d0Var.f9859a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f9859a.get("android:changeImageTransform:matrix");
        boolean z5 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z5) {
            return null;
        }
        ImageView imageView = (ImageView) d0Var2.f9860b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return U0(imageView);
        }
        if (matrix == null) {
            matrix = o.f9941a;
        }
        if (matrix2 == null) {
            matrix2 = o.f9941a;
        }
        f9716o0.set(imageView, matrix);
        return S0(imageView, matrix, matrix2);
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
