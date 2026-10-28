package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u0017*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u001c*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010\"\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010\r\u001a\u0017\u0010#\u001a\u00020!*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b%\u0010\u0014\u001a\u001f\u0010&\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010\u0016\u001a\u0017\u0010(\u001a\u00020'*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b(\u0010$\u001a\"\u0010)\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020'H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010\r\u001a\u0017\u0010+\u001a\u00020**\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b+\u0010$\u001a\"\u0010,\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020*H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010\r\u001a\u0017\u0010-\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b-\u0010\u0014\u001a\u001f\u0010.\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b.\u0010\u0016\u001a\u0017\u00100\u001a\u00020/*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b0\u0010$\u001a\"\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020/H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u0010\r\u001a'\u00104\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u000f\u001a\n\u0018\u000102j\u0004\u0018\u0001`3H\u0000¢\u0006\u0004\b4\u00105\u001a!\u00107\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b7\u00108*\n\u00109\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/d5;", "a", "()Landroidx/compose/ui/graphics/d5;", "Landroid/graphics/Paint;", "b", "(Landroid/graphics/Paint;)Landroidx/compose/ui/graphics/d5;", "l", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/k1;", "mode", "Lkotlin/k2;", "o", "(Landroid/graphics/Paint;I)V", "Landroidx/compose/ui/graphics/e2;", "value", "q", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/e2;)V", "", "c", "(Landroid/graphics/Paint;)F", "m", "(Landroid/graphics/Paint;F)V", "", "d", "(Landroid/graphics/Paint;)Z", "n", "(Landroid/graphics/Paint;Z)V", "Landroidx/compose/ui/graphics/d2;", "e", "(Landroid/graphics/Paint;)J", "p", "(Landroid/graphics/Paint;J)V", "Landroidx/compose/ui/graphics/f5;", "y", "k", "(Landroid/graphics/Paint;)I", "j", "x", "Landroidx/compose/ui/graphics/i6;", "g", "u", "Landroidx/compose/ui/graphics/j6;", "h", "v", "i", "w", "Landroidx/compose/ui/graphics/m4;", "f", "r", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "t", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/h5;", "s", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/h5;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 {

    /* compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18048a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f18049b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f18050c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f18048a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f18049b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f18050c = iArr3;
        }
    }

    @fg.l
    public static final d5 a() {
        return new t0();
    }

    @fg.l
    public static final d5 b(@fg.l Paint paint) {
        return new t0(paint);
    }

    public static final float c(@fg.l Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean d(@fg.l Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long e(@fg.l Paint paint) {
        return f2.b(paint.getColor());
    }

    public static final int f(@fg.l Paint paint) {
        if (paint.isFilterBitmap()) {
            m4.INSTANCE.getClass();
            return m4.f17930d;
        }
        m4.INSTANCE.getClass();
        return m4.f17929c;
    }

    public static final int g(@fg.l Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i4 = strokeCap == null ? -1 : a.f18049b[strokeCap.ordinal()];
        if (i4 == 1) {
            i6.INSTANCE.getClass();
            return i6.f17861c;
        }
        if (i4 == 2) {
            i6.INSTANCE.getClass();
            return i6.f17862d;
        }
        if (i4 != 3) {
            i6.INSTANCE.getClass();
            return i6.f17861c;
        }
        i6.INSTANCE.getClass();
        return i6.f17863e;
    }

    public static final int h(@fg.l Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i4 = strokeJoin == null ? -1 : a.f18050c[strokeJoin.ordinal()];
        if (i4 == 1) {
            j6.INSTANCE.getClass();
            return j6.f17869c;
        }
        if (i4 == 2) {
            j6.INSTANCE.getClass();
            return j6.f17871e;
        }
        if (i4 != 3) {
            j6.INSTANCE.getClass();
            return j6.f17869c;
        }
        j6.INSTANCE.getClass();
        return j6.f17870d;
    }

    public static final float i(@fg.l Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float j(@fg.l Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int k(@fg.l Paint paint) {
        Paint.Style style = paint.getStyle();
        if ((style == null ? -1 : a.f18048a[style.ordinal()]) == 1) {
            f5.INSTANCE.getClass();
            return f5.f17817d;
        }
        f5.INSTANCE.getClass();
        return f5.f17816c;
    }

    @fg.l
    public static final Paint l() {
        return new Paint(7);
    }

    public static final void m(@fg.l Paint paint, float f4) {
        paint.setAlpha((int) Math.rint(f4 * 255.0f));
    }

    public static final void n(@fg.l Paint paint, boolean z4) {
        paint.setAntiAlias(z4);
    }

    public static final void o(@fg.l Paint paint, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            u6.f18052a.a(paint, i4);
        } else {
            paint.setXfermode(new PorterDuffXfermode(f0.d(i4)));
        }
    }

    public static final void p(@fg.l Paint paint, long j4) {
        paint.setColor(f2.r(j4));
    }

    public static final void q(@fg.l Paint paint, @fg.m e2 e2Var) {
        paint.setColorFilter(e2Var != null ? e2Var.getNativeColorFilter() : null);
    }

    public static final void r(@fg.l Paint paint, int i4) {
        m4.INSTANCE.getClass();
        paint.setFilterBitmap(!m4.h(i4, m4.f17929c));
    }

    public static final void s(@fg.l Paint paint, @fg.m h5 h5Var) {
        w0 w0Var = (w0) h5Var;
        paint.setPathEffect(w0Var != null ? w0Var.getNativePathEffect() : null);
    }

    public static final void t(@fg.l Paint paint, @fg.m Shader shader) {
        paint.setShader(shader);
    }

    public static final void u(@fg.l Paint paint, int i4) {
        Paint.Cap cap;
        i6.Companion companion = i6.INSTANCE;
        companion.getClass();
        if (i6.g(i4, i6.f17863e)) {
            cap = Paint.Cap.SQUARE;
        } else {
            companion.getClass();
            if (i6.g(i4, i6.f17862d)) {
                cap = Paint.Cap.ROUND;
            } else {
                companion.getClass();
                cap = i6.g(i4, i6.f17861c) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    public static final void v(@fg.l Paint paint, int i4) {
        Paint.Join join;
        j6.Companion companion = j6.INSTANCE;
        companion.getClass();
        if (j6.g(i4, j6.f17869c)) {
            join = Paint.Join.MITER;
        } else {
            companion.getClass();
            if (j6.g(i4, j6.f17871e)) {
                join = Paint.Join.BEVEL;
            } else {
                companion.getClass();
                join = j6.g(i4, j6.f17870d) ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    public static final void w(@fg.l Paint paint, float f4) {
        paint.setStrokeMiter(f4);
    }

    public static final void x(@fg.l Paint paint, float f4) {
        paint.setStrokeWidth(f4);
    }

    public static final void y(@fg.l Paint paint, int i4) {
        f5.INSTANCE.getClass();
        paint.setStyle(f5.f(i4, f5.f17817d) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
