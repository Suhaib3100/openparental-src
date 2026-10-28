package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9849a = 1048576;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f9850b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f9851c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f9852d;

    /* compiled from: TransitionUtils.java */
    static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        final float[] f9853a = new float[9];

        /* renamed from: b, reason: collision with root package name */
        final float[] f9854b = new float[9];

        /* renamed from: c, reason: collision with root package name */
        final Matrix f9855c = new Matrix();

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f6, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f9853a);
            matrix2.getValues(this.f9854b);
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f9854b;
                float f7 = fArr[i5];
                float f8 = this.f9853a[i5];
                fArr[i5] = androidx.appcompat.graphics.drawable.d.a(f7, f8, f6, f8);
            }
            this.f9855c.setValues(this.f9854b);
            return this.f9855c;
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        f9850b = true;
        f9851c = true;
        f9852d = i5 >= 28;
    }

    private c0() {
    }

    static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        q0.j(view, matrix);
        q0.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b6 = b(view, matrix, rectF, viewGroup);
        if (b6 != null) {
            imageView.setImageBitmap(b6);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(round4 - round2, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z5;
        boolean z6;
        int i5;
        ViewGroup viewGroup2;
        if (f9850b) {
            z5 = !view.isAttachedToWindow();
            z6 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z5 = false;
            z6 = false;
        }
        boolean z7 = f9851c;
        Bitmap bitmap = null;
        if (!z7 || !z5) {
            i5 = 0;
            viewGroup2 = null;
        } else {
            if (!z6) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i5 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f9852d) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z7 && z5) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i5);
        }
        return bitmap;
    }

    static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
