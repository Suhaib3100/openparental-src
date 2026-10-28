package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import kotlin.Metadata;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002\u001a\r\u0010\u0006\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\t\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\n\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\bH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\bH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\rH\u0087\n\u001a\r\u0010\u0013\u001a\u00020\u0000*\u00020\rH\u0087\b\u001a\r\u0010\u0014\u001a\u00020\b*\u00020\rH\u0087\b\u001a\u0015\u0010\u0017\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f\u001a\u0015\u0010\u0019\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0018H\u0087\f\u001a\u0015\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f\u001a\u0015\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0018H\u0087\f\u001a\u0015\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0018H\u0087\f\u001a\r\u0010\u001f\u001a\u00020\b*\u00020\u001eH\u0087\b\"\u0016\u0010\"\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0016\u0010$\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0016\u0010&\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010!\"\u0016\u0010(\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010!\"\u0016\u0010+\u001a\u00020\u0001*\u00020\b8Ç\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0016\u0010\"\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0016\u0010$\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b.\u0010-\"\u0016\u0010&\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010-\"\u0016\u0010(\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u0010-\"\u0016\u0010+\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b1\u0010-\"\u0016\u00105\u001a\u000202*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0016\u00107\u001a\u000202*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b6\u00104\"\u0016\u0010\u0016\u001a\u00020\u0018*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Landroid/graphics/Color;", "", "b", "e", "h", "k", "c", "F", "", "f", "i", "l", "G", "", "K", "a", "d", "g", "j", "H", "I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "m", "Landroid/graphics/ColorSpace;", "n", "o", "p", "q", "r", "", "J", "t", "(I)I", "alpha", "C", "red", "y", "green", "v", "blue", "z", "(I)F", "luminance", "s", "(J)F", "B", "x", "u", "A", "", "D", "(J)Z", "isSrgb", "E", "isWideGamut", "w", "(J)Landroid/graphics/ColorSpace;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class k1 {
    @androidx.annotation.x0(26)
    public static final float A(long j5) {
        float luminance;
        luminance = Color.luminance(j5);
        return luminance;
    }

    @androidx.annotation.x0(26)
    public static final float B(long j5) {
        float red;
        red = Color.red(j5);
        return red;
    }

    public static final int C(@androidx.annotation.l int i5) {
        return (i5 >> 16) & 255;
    }

    @androidx.annotation.x0(26)
    public static final boolean D(long j5) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j5);
        return isSrgb;
    }

    @androidx.annotation.x0(26)
    public static final boolean E(long j5) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j5);
        return isWideGamut;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Color F(@d5.d Color color, @d5.d Color c6) {
        kotlin.jvm.internal.l0.p(color, "<this>");
        kotlin.jvm.internal.l0.p(c6, "c");
        Color u5 = r1.u(c6, color);
        kotlin.jvm.internal.l0.o(u5, "compositeColors(c, this)");
        return u5;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Color G(@androidx.annotation.l int i5) {
        Color valueOf;
        valueOf = Color.valueOf(i5);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Color H(long j5) {
        Color valueOf;
        valueOf = Color.valueOf(j5);
        kotlin.jvm.internal.l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @androidx.annotation.l
    @androidx.annotation.x0(26)
    public static final int I(long j5) {
        int argb;
        argb = Color.toArgb(j5);
        return argb;
    }

    @androidx.annotation.l
    public static final int J(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Color.parseColor(str);
    }

    @androidx.annotation.x0(26)
    public static final long K(@androidx.annotation.l int i5) {
        long pack;
        pack = Color.pack(i5);
        return pack;
    }

    @androidx.annotation.x0(26)
    public static final float a(long j5) {
        float red;
        red = Color.red(j5);
        return red;
    }

    @androidx.annotation.x0(26)
    public static final float b(@d5.d Color color) {
        float component;
        kotlin.jvm.internal.l0.p(color, "<this>");
        component = color.getComponent(0);
        return component;
    }

    public static final int c(@androidx.annotation.l int i5) {
        return (i5 >> 24) & 255;
    }

    @androidx.annotation.x0(26)
    public static final float d(long j5) {
        float green;
        green = Color.green(j5);
        return green;
    }

    @androidx.annotation.x0(26)
    public static final float e(@d5.d Color color) {
        float component;
        kotlin.jvm.internal.l0.p(color, "<this>");
        component = color.getComponent(1);
        return component;
    }

    public static final int f(@androidx.annotation.l int i5) {
        return (i5 >> 16) & 255;
    }

    @androidx.annotation.x0(26)
    public static final float g(long j5) {
        float blue;
        blue = Color.blue(j5);
        return blue;
    }

    @androidx.annotation.x0(26)
    public static final float h(@d5.d Color color) {
        float component;
        kotlin.jvm.internal.l0.p(color, "<this>");
        component = color.getComponent(2);
        return component;
    }

    public static final int i(@androidx.annotation.l int i5) {
        return (i5 >> 8) & 255;
    }

    @androidx.annotation.x0(26)
    public static final float j(long j5) {
        float alpha;
        alpha = Color.alpha(j5);
        return alpha;
    }

    @androidx.annotation.x0(26)
    public static final float k(@d5.d Color color) {
        float component;
        kotlin.jvm.internal.l0.p(color, "<this>");
        component = color.getComponent(3);
        return component;
    }

    public static final int l(@androidx.annotation.l int i5) {
        return i5 & 255;
    }

    @androidx.annotation.x0(26)
    public static final long m(@androidx.annotation.l int i5, @d5.d ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        long convert;
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = Color.convert(i5, colorSpace2);
        return convert;
    }

    @androidx.annotation.x0(26)
    public static final long n(@androidx.annotation.l int i5, @d5.d ColorSpace colorSpace) {
        long convert;
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        convert = Color.convert(i5, colorSpace);
        return convert;
    }

    @androidx.annotation.x0(26)
    public static final long o(long j5, @d5.d ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        long convert;
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = Color.convert(j5, colorSpace2);
        return convert;
    }

    @androidx.annotation.x0(26)
    public static final long p(long j5, @d5.d ColorSpace colorSpace) {
        long convert;
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        convert = Color.convert(j5, colorSpace);
        return convert;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Color q(@d5.d Color color, @d5.d ColorSpace.Named colorSpace) {
        ColorSpace colorSpace2;
        Color convert;
        kotlin.jvm.internal.l0.p(color, "<this>");
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        colorSpace2 = ColorSpace.get(colorSpace);
        convert = color.convert(colorSpace2);
        kotlin.jvm.internal.l0.o(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Color r(@d5.d Color color, @d5.d ColorSpace colorSpace) {
        Color convert;
        kotlin.jvm.internal.l0.p(color, "<this>");
        kotlin.jvm.internal.l0.p(colorSpace, "colorSpace");
        convert = color.convert(colorSpace);
        kotlin.jvm.internal.l0.o(convert, "convert(colorSpace)");
        return convert;
    }

    @androidx.annotation.x0(26)
    public static final float s(long j5) {
        float alpha;
        alpha = Color.alpha(j5);
        return alpha;
    }

    public static final int t(@androidx.annotation.l int i5) {
        return (i5 >> 24) & 255;
    }

    @androidx.annotation.x0(26)
    public static final float u(long j5) {
        float blue;
        blue = Color.blue(j5);
        return blue;
    }

    public static final int v(@androidx.annotation.l int i5) {
        return i5 & 255;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final ColorSpace w(long j5) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j5);
        kotlin.jvm.internal.l0.o(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @androidx.annotation.x0(26)
    public static final float x(long j5) {
        float green;
        green = Color.green(j5);
        return green;
    }

    public static final int y(@androidx.annotation.l int i5) {
        return (i5 >> 8) & 255;
    }

    @androidx.annotation.x0(26)
    public static final float z(@androidx.annotation.l int i5) {
        return Color.luminance(i5);
    }
}
