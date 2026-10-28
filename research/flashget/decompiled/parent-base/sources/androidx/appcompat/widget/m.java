package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.m1;

/* compiled from: AppCompatProgressBarHelper.java */
/* loaded from: classes.dex */
class m {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1933c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f1934a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f1935b;

    /* compiled from: AppCompatProgressBarHelper.java */
    @androidx.annotation.x0(23)
    private static class a {
        private a() {
        }

        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i4) {
            layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
            layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
            layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
            layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
            layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
            layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
            layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
            layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
            layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
        }
    }

    m(ProgressBar progressBar) {
        this.f1934a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i4 = 0; i4 < numberOfFrames; i4++) {
            Drawable d5 = d(animationDrawable.getFrame(i4), true);
            d5.setLevel(10000);
            animationDrawable2.addFrame(d5, animationDrawable.getDuration(i4));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f1935b;
    }

    void c(AttributeSet attributeSet, int i4) {
        t0 G = t0.G(this.f1934a.getContext(), attributeSet, f1933c, i4, 0);
        Drawable i5 = G.i(0);
        if (i5 != null) {
            this.f1934a.setIndeterminateDrawable(e(i5));
        }
        Drawable i6 = G.i(1);
        if (i6 != null) {
            this.f1934a.setProgressDrawable(d(i6, false));
        }
        G.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    Drawable d(Drawable drawable, boolean z4) {
        if (drawable instanceof androidx.core.graphics.drawable.l) {
            androidx.core.graphics.drawable.l lVar = (androidx.core.graphics.drawable.l) drawable;
            Drawable a5 = lVar.a();
            if (a5 != null) {
                lVar.b(d(a5, z4));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id2 = layerDrawable.getId(i4);
                    drawableArr[i4] = d(layerDrawable.getDrawable(i4), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                    a.a(layerDrawable, layerDrawable2, i5);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1935b == null) {
                    this.f1935b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
