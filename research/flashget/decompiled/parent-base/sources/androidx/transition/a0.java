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
/* loaded from: classes3.dex */
class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f34346a = 1048576;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f34347b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f34348c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f34349d;

    /* compiled from: TransitionUtils.java */
    static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        final float[] f34350a = new float[9];

        /* renamed from: b, reason: collision with root package name */
        final float[] f34351b = new float[9];

        /* renamed from: c, reason: collision with root package name */
        final Matrix f34352c = new Matrix();

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f34350a);
            matrix2.getValues(this.f34351b);
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f34351b;
                float f5 = fArr[i4];
                float f6 = this.f34350a[i4];
                fArr[i4] = androidx.appcompat.graphics.drawable.d.a(f5, f6, f4, f6);
            }
            this.f34352c.setValues(this.f34351b);
            return this.f34352c;
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        f34347b = true;
        f34348c = true;
        f34349d = i4 >= 28;
    }

    private a0() {
    }

    static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        o0.j(view, matrix);
        o0.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b5 = b(view, matrix, rectF, viewGroup);
        if (b5 != null) {
            imageView.setImageBitmap(b5);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z4;
        boolean z5;
        int i4;
        ViewGroup viewGroup2;
        if (f34347b) {
            z4 = !view.isAttachedToWindow();
            z5 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z4 = false;
            z5 = false;
        }
        boolean z6 = f34348c;
        Bitmap bitmap = null;
        if (!z6 || !z4) {
            i4 = 0;
            viewGroup2 = null;
        } else {
            if (!z5) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i4 = viewGroup2.indexOfChild(view);
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
            if (f34349d) {
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
        if (z6 && z4) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i4);
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
