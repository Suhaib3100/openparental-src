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
import androidx.transition.a0;
import java.util.Map;

/* loaded from: classes3.dex */
public class ChangeImageTransform extends Transition {
    private static final String L2 = "android:changeImageTransform:bounds";
    private static final String V1 = "android:changeImageTransform:matrix";
    private static final String[] M2 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> N2 = new a();
    private static final Property<ImageView, Matrix> O2 = new b(Matrix.class, "animatedTransform");

    class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            l.a(imageView, matrix);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34261a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f34261a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34261a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    private void J0(b0 b0Var) {
        View view = b0Var.f34364b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = b0Var.f34363a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", M0(imageView));
        }
    }

    private static Matrix L0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f4 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f5 = intrinsicHeight;
        float max = Math.max(width / f4, height / f5);
        int round = Math.round((width - (f4 * max)) / 2.0f);
        int round2 = Math.round((height - (f5 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    @androidx.annotation.o0
    private static Matrix M0(@androidx.annotation.o0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i4 = c.f34261a[imageView.getScaleType().ordinal()];
        return i4 != 1 ? i4 != 2 ? new Matrix(imageView.getImageMatrix()) : L0(imageView) : Q0(imageView);
    }

    private ObjectAnimator N0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) O2, (TypeEvaluator) new a0.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @androidx.annotation.o0
    private ObjectAnimator P0(@androidx.annotation.o0 ImageView imageView) {
        Property<ImageView, Matrix> property = O2;
        TypeEvaluator<Matrix> typeEvaluator = N2;
        Matrix matrix = m.f34442a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix Q0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.o0
    public String[] a0() {
        return M2;
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        J0(b0Var);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.q0
    public Animator t(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        if (b0Var == null || b0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) b0Var.f34363a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) b0Var2.f34363a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) b0Var.f34363a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) b0Var2.f34363a.get("android:changeImageTransform:matrix");
        boolean z4 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z4) {
            return null;
        }
        ImageView imageView = (ImageView) b0Var2.f34364b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return P0(imageView);
        }
        if (matrix == null) {
            matrix = m.f34442a;
        }
        if (matrix2 == null) {
            matrix2 = m.f34442a;
        }
        O2.set(imageView, matrix);
        return N0(imageView, matrix, matrix2);
    }

    public ChangeImageTransform(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
