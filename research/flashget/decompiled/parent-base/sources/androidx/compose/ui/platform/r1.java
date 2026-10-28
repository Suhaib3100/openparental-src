package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u0010\"J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0010J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/platform/r1;", "", "<init>", "()V", "Lkotlin/k2;", "q", "", "p", "()Ljava/lang/String;", "Landroidx/compose/ui/text/i0;", "spanStyle", "e", "(Landroidx/compose/ui/text/i0;)V", "Landroidx/compose/ui/graphics/d2;", "color", "m", "(J)V", "Landroidx/compose/ui/unit/z;", "textUnit", "j", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "f", "(Landroidx/compose/ui/text/font/o0;)V", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "o", "(I)V", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "l", "Landroidx/compose/ui/text/style/a;", "baselineShift", "k", "(F)V", "Landroidx/compose/ui/text/style/o;", "textGeometricTransform", "h", "(Landroidx/compose/ui/text/style/o;)V", "Landroidx/compose/ui/text/style/k;", "textDecoration", "g", "(Landroidx/compose/ui/text/style/k;)V", "Landroidx/compose/ui/graphics/c6;", "shadow", "d", "(Landroidx/compose/ui/graphics/c6;)V", "", "byte", "a", "(B)V", "", "int", "c", "", "float", "b", "Lkotlin/a2;", "uLong", "n", "string", "i", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20091b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Parcel parcel = Parcel.obtain();

    public final void a(byte r22) {
        this.parcel.writeByte(r22);
    }

    public final void b(float r22) {
        this.parcel.writeFloat(r22);
    }

    public final void c(int r22) {
        this.parcel.writeInt(r22);
    }

    public final void d(@fg.l androidx.compose.ui.graphics.c6 shadow) {
        n(shadow.getColor());
        b(i0.f.p(shadow.getOffset()));
        b(i0.f.r(shadow.getOffset()));
        b(shadow.getBlurRadius());
    }

    public final void e(@fg.l androidx.compose.ui.text.i0 spanStyle) {
        long m4 = spanStyle.m();
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        if (!kotlin.a2.o(m4, androidx.compose.ui.graphics.d2.f17778o)) {
            a((byte) 1);
            n(spanStyle.m());
        }
        long fontSize = spanStyle.getFontSize();
        z.Companion companion2 = androidx.compose.ui.unit.z.INSTANCE;
        companion2.getClass();
        if (!androidx.compose.ui.unit.z.j(fontSize, androidx.compose.ui.unit.z.f21534d)) {
            a((byte) 2);
            j(spanStyle.getFontSize());
        }
        androidx.compose.ui.text.font.o0 fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            a((byte) 3);
            f(fontWeight);
        }
        androidx.compose.ui.text.font.k0 fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int j4 = fontStyle.j();
            a((byte) 4);
            o(j4);
        }
        androidx.compose.ui.text.font.l0 fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            a((byte) 5);
            l(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            a((byte) 6);
            i(fontFeatureSettings);
        }
        long letterSpacing = spanStyle.getLetterSpacing();
        companion2.getClass();
        if (!androidx.compose.ui.unit.z.j(letterSpacing, androidx.compose.ui.unit.z.f21534d)) {
            a((byte) 7);
            j(spanStyle.getLetterSpacing());
        }
        androidx.compose.ui.text.style.a baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float k4 = baselineShift.k();
            a((byte) 8);
            b(k4);
        }
        androidx.compose.ui.text.style.o textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            a((byte) 9);
            h(textGeometricTransform);
        }
        long background = spanStyle.getBackground();
        companion.getClass();
        if (!kotlin.a2.o(background, androidx.compose.ui.graphics.d2.f17778o)) {
            a((byte) 10);
            n(spanStyle.getBackground());
        }
        androidx.compose.ui.text.style.k background2 = spanStyle.getBackground();
        if (background2 != null) {
            a((byte) 11);
            g(background2);
        }
        androidx.compose.ui.graphics.c6 shadow = spanStyle.getShadow();
        if (shadow != null) {
            a((byte) 12);
            d(shadow);
        }
    }

    public final void f(@fg.l androidx.compose.ui.text.font.o0 fontWeight) {
        c(fontWeight.u());
    }

    public final void g(@fg.l androidx.compose.ui.text.style.k textDecoration) {
        c(textDecoration.getMask());
    }

    public final void h(@fg.l androidx.compose.ui.text.style.o textGeometricTransform) {
        b(textGeometricTransform.getScaleX());
        b(textGeometricTransform.getSkewX());
    }

    public final void i(@fg.l String string) {
        this.parcel.writeString(string);
    }

    public final void j(long textUnit) {
        long m4 = androidx.compose.ui.unit.z.m(textUnit);
        b0.Companion companion = androidx.compose.ui.unit.b0.INSTANCE;
        companion.getClass();
        byte b5 = 0;
        if (!androidx.compose.ui.unit.b0.g(m4, androidx.compose.ui.unit.b0.f21486c)) {
            companion.getClass();
            if (androidx.compose.ui.unit.b0.g(m4, androidx.compose.ui.unit.b0.f21487d)) {
                b5 = 1;
            } else {
                companion.getClass();
                if (androidx.compose.ui.unit.b0.g(m4, androidx.compose.ui.unit.b0.f21488e)) {
                    b5 = 2;
                }
            }
        }
        a(b5);
        long m5 = androidx.compose.ui.unit.z.m(textUnit);
        companion.getClass();
        if (androidx.compose.ui.unit.b0.g(m5, androidx.compose.ui.unit.b0.f21486c)) {
            return;
        }
        b(androidx.compose.ui.unit.z.n(textUnit));
    }

    public final void k(float baselineShift) {
        b(baselineShift);
    }

    public final void l(int fontSynthesis) {
        l0.Companion companion = androidx.compose.ui.text.font.l0.INSTANCE;
        companion.getClass();
        byte b5 = 0;
        if (!androidx.compose.ui.text.font.l0.h(fontSynthesis, androidx.compose.ui.text.font.l0.f20759c)) {
            companion.getClass();
            if (androidx.compose.ui.text.font.l0.h(fontSynthesis, androidx.compose.ui.text.font.l0.f20760d)) {
                b5 = 1;
            } else {
                companion.getClass();
                if (androidx.compose.ui.text.font.l0.h(fontSynthesis, androidx.compose.ui.text.font.l0.f20761e)) {
                    b5 = 2;
                } else {
                    companion.getClass();
                    if (androidx.compose.ui.text.font.l0.h(fontSynthesis, androidx.compose.ui.text.font.l0.f20762f)) {
                        b5 = 3;
                    }
                }
            }
        }
        a(b5);
    }

    public final void m(long color) {
        n(color);
    }

    public final void n(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void o(int fontStyle) {
        k0.Companion companion = androidx.compose.ui.text.font.k0.INSTANCE;
        companion.getClass();
        byte b5 = 0;
        if (!androidx.compose.ui.text.font.k0.f(fontStyle, androidx.compose.ui.text.font.k0.f20754c)) {
            companion.getClass();
            if (androidx.compose.ui.text.font.k0.f(fontStyle, androidx.compose.ui.text.font.k0.f20755d)) {
                b5 = 1;
            }
        }
        a(b5);
    }

    @fg.l
    public final String p() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void q() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }
}
