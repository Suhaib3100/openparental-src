package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import kotlin.Metadata;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u0007\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\r\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0014\u0010\u000f\u001a\u00020\u0000*\u00020\nH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\nH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u0014\u0010\u0019\u001a\u00020\u0000*\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\n*\u00020\u0011H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001f\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0087\f¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\"\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u001e\u001a\u00020!H\u0087\f¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0087\f¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010&\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001e\u001a\u00020!H\u0087\f¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010(\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0087\f¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020!H\u0087\f¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010-\u001a\u00020\n*\u00020,H\u0087\b¢\u0006\u0004\b-\u0010.\"\u0016\u00100\u001a\u00020\n*\u00020\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b/\u0010\u000b\"\u0016\u00102\u001a\u00020\n*\u00020\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b1\u0010\u000b\"\u0016\u00104\u001a\u00020\n*\u00020\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b3\u0010\u000b\"\u0016\u00106\u001a\u00020\n*\u00020\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b5\u0010\u000b\"\u0016\u00109\u001a\u00020\u0001*\u00020\n8Ç\u0002¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0016\u00100\u001a\u00020\u0001*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b:\u0010\u0015\"\u0016\u00102\u001a\u00020\u0001*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b;\u0010\u0015\"\u0016\u00104\u001a\u00020\u0001*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b<\u0010\u0015\"\u0016\u00106\u001a\u00020\u0001*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b=\u0010\u0015\"\u0016\u00109\u001a\u00020\u0001*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b>\u0010\u0015\"\u0016\u0010B\u001a\u00020?*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0016\u0010D\u001a\u00020?*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\bC\u0010A\"\u0016\u0010\u001e\u001a\u00020!*\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Landroid/graphics/Color;", "", "b", "(Landroid/graphics/Color;)F", "e", "h", "k", "c", "F", "(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color;", "", "(I)I", "f", "i", "l", "G", "(I)Landroid/graphics/Color;", "", "K", "(I)J", "a", "(J)F", "d", "g", "j", "H", "(J)Landroid/graphics/Color;", "I", "(J)I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "m", "(ILandroid/graphics/ColorSpace$Named;)J", "Landroid/graphics/ColorSpace;", "n", "(ILandroid/graphics/ColorSpace;)J", "o", "(JLandroid/graphics/ColorSpace$Named;)J", "p", "(JLandroid/graphics/ColorSpace;)J", "q", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace$Named;)Landroid/graphics/Color;", "r", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace;)Landroid/graphics/Color;", "", "J", "(Ljava/lang/String;)I", "t", "alpha", "C", "red", "y", "green", "v", "blue", "z", "(I)F", "luminance", "s", "B", "x", "u", "A", "", "D", "(J)Z", "isSrgb", "E", "isWideGamut", "w", "(J)Landroid/graphics/ColorSpace;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x {
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float A(long j4) {
        float luminance;
        luminance = Color.luminance(j4);
        return luminance;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float B(long j4) {
        float red;
        red = Color.red(j4);
        return red;
    }

    public static final int C(@androidx.annotation.l int i4) {
        return (i4 >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final boolean D(long j4) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j4);
        return isSrgb;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final boolean E(long j4) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j4);
        return isWideGamut;
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final Color F(@fg.l Color color, @fg.l Color color2) {
        return z.w(color2, color);
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final Color G(@androidx.annotation.l int i4) {
        Color valueOf;
        valueOf = Color.valueOf(i4);
        return valueOf;
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final Color H(long j4) {
        Color valueOf;
        valueOf = Color.valueOf(j4);
        return valueOf;
    }

    @androidx.annotation.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final int I(long j4) {
        int argb;
        argb = Color.toArgb(j4);
        return argb;
    }

    @androidx.annotation.l
    public static final int J(@fg.l String str) {
        return Color.parseColor(str);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final long K(@androidx.annotation.l int i4) {
        long pack;
        pack = Color.pack(i4);
        return pack;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float a(long j4) {
        float red;
        red = Color.red(j4);
        return red;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float b(@fg.l Color color) {
        float component;
        component = color.getComponent(0);
        return component;
    }

    public static final int c(@androidx.annotation.l int i4) {
        return (i4 >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float d(long j4) {
        float green;
        green = Color.green(j4);
        return green;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float e(@fg.l Color color) {
        float component;
        component = color.getComponent(1);
        return component;
    }

    public static final int f(@androidx.annotation.l int i4) {
        return (i4 >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float g(long j4) {
        float blue;
        blue = Color.blue(j4);
        return blue;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float h(@fg.l Color color) {
        float component;
        component = color.getComponent(2);
        return component;
    }

    public static final int i(@androidx.annotation.l int i4) {
        return (i4 >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float j(long j4) {
        float alpha;
        alpha = Color.alpha(j4);
        return alpha;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float k(@fg.l Color color) {
        float component;
        component = color.getComponent(3);
        return component;
    }

    public static final int l(@androidx.annotation.l int i4) {
        return i4 & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final long m(@androidx.annotation.l int i4, @fg.l ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(i4, colorSpace);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final long n(@androidx.annotation.l int i4, @fg.l ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(i4, colorSpace);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final long o(long j4, @fg.l ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(j4, colorSpace);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final long p(long j4, @fg.l ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(j4, colorSpace);
        return convert;
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final Color q(@fg.l Color color, @fg.l ColorSpace.Named named) {
        ColorSpace colorSpace;
        Color convert;
        colorSpace = ColorSpace.get(named);
        convert = color.convert(colorSpace);
        return convert;
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final Color r(@fg.l Color color, @fg.l ColorSpace colorSpace) {
        Color convert;
        convert = color.convert(colorSpace);
        return convert;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float s(long j4) {
        float alpha;
        alpha = Color.alpha(j4);
        return alpha;
    }

    public static final int t(@androidx.annotation.l int i4) {
        return (i4 >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float u(long j4) {
        float blue;
        blue = Color.blue(j4);
        return blue;
    }

    public static final int v(@androidx.annotation.l int i4) {
        return i4 & 255;
    }

    @fg.l
    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final ColorSpace w(long j4) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j4);
        return colorSpace;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float x(long j4) {
        float green;
        green = Color.green(j4);
        return green;
    }

    public static final int y(@androidx.annotation.l int i4) {
        return (i4 >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.x0(26)
    public static final float z(@androidx.annotation.l int i4) {
        return Color.luminance(i4);
    }
}
