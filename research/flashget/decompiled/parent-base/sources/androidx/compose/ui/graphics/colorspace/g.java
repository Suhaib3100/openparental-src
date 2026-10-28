package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.e1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ColorSpaces.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010)\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010,\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u0017\u0010.\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b*\u0010\"R\u0017\u00100\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b'\u0010\"R\u0017\u00102\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b1\u0010\"R\u0017\u00105\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R\u0017\u00107\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b6\u0010\"R\u0017\u00109\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b8\u0010\"R\u0017\u0010:\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010<\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b;\u0010\"R\u0017\u0010=\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001c\u0010\"R\u0017\u0010>\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010A\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b/\u0010@R\u0017\u0010C\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\b-\u0010@R\u001a\u0010E\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010 \u001a\u0004\bD\u0010\"R\u0017\u0010F\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\bB\u0010@R \u0010J\u001a\b\u0012\u0004\u0012\u00020\b0G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010H\u001a\u0004\b3\u0010I¨\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/g;", "", "<init>", "()V", "", "toXYZD50", "Landroidx/compose/ui/graphics/colorspace/d0;", "function", "Landroidx/compose/ui/graphics/colorspace/c;", "B", "([FLandroidx/compose/ui/graphics/colorspace/d0;)Landroidx/compose/ui/graphics/colorspace/c;", "", "id", "l", "(I)Landroidx/compose/ui/graphics/colorspace/c;", "b", "[F", "y", "()[F", "SrgbPrimaries", "c", "t", "Ntsc1953Primaries", "d", "Landroidx/compose/ui/graphics/colorspace/d0;", "z", "()Landroidx/compose/ui/graphics/colorspace/d0;", "SrgbTransferParameters", "e", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/a0;", "f", "Landroidx/compose/ui/graphics/colorspace/a0;", "x", "()Landroidx/compose/ui/graphics/colorspace/a0;", "Srgb", "g", "r", "LinearSrgb", "h", "p", "ExtendedSrgb", "i", "q", "LinearExtendedSrgb", "j", "Bt709", "k", "Bt2020", "n", "DciP3", "m", "o", "DisplayP3", "s", "Ntsc1953", "w", "SmpteC", "AdobeRgb", "v", "ProPhotoRgb", "Aces", "Acescg", "Landroidx/compose/ui/graphics/colorspace/c;", "()Landroidx/compose/ui/graphics/colorspace/c;", "CieXyz", "u", "CieLab", "A", "Unspecified", "Oklab", "", "[Landroidx/compose/ui/graphics/colorspace/c;", "()[Landroidx/compose/ui/graphics/colorspace/c;", "ColorSpacesArray", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f17689a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] SrgbPrimaries;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final float[] Ntsc1953Primaries;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final d0 SrgbTransferParameters;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final d0 NoneTransferParameters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Srgb;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 LinearSrgb;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 ExtendedSrgb;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 LinearExtendedSrgb;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Bt709;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Bt2020;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 DciP3;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 DisplayP3;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Ntsc1953;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 SmpteC;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 AdobeRgb;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 ProPhotoRgb;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Aces;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Acescg;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final c CieXyz;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final c CieLab;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final a0 Unspecified;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final c Oklab;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final c[] ColorSpacesArray;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        d0 d0Var = new d0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null);
        SrgbTransferParameters = d0Var;
        d0 d0Var2 = new d0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null);
        NoneTransferParameters = d0Var2;
        j jVar = j.f17726a;
        a0 a0Var = new a0("sRGB IEC61966-2.1", fArr, jVar.h(), d0Var, 0);
        Srgb = a0Var;
        a0 a0Var2 = new a0("sRGB IEC61966-2.1 (Linear)", fArr, jVar.h(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = a0Var2;
        a0 a0Var3 = new a0("scRGB-nl IEC 61966-2-2:2003", fArr, jVar.h(), null, new e(), new f(), -0.799f, 2.399f, d0Var, 2);
        ExtendedSrgb = a0Var3;
        a0 a0Var4 = new a0("scRGB IEC 61966-2-2:2003", fArr, jVar.h(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = a0Var4;
        a0 a0Var5 = new a0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jVar.h(), new d0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null), 4);
        Bt709 = a0Var5;
        a0 a0Var6 = new a0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jVar.h(), new d0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null), 5);
        Bt2020 = a0Var6;
        a0 a0Var7 = new a0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new e0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = a0Var7;
        a0 a0Var8 = new a0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jVar.h(), d0Var, 7);
        DisplayP3 = a0Var8;
        a0 a0Var9 = new a0("NTSC (1953)", fArr2, jVar.c(), new d0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null), 8);
        Ntsc1953 = a0Var9;
        a0 a0Var10 = new a0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jVar.h(), new d0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null), 9);
        SmpteC = a0Var10;
        a0 a0Var11 = new a0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jVar.h(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = a0Var11;
        a0 a0Var12 = new a0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jVar.d(), new d0(1.8d, 1.0d, com.google.firebase.remoteconfig.p.f60679p, 0.0625d, 0.031248d, com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p, 96, null), 11);
        ProPhotoRgb = a0Var12;
        a0 a0Var13 = new a0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, jVar.g(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = a0Var13;
        a0 a0Var14 = new a0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jVar.g(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = a0Var14;
        f0 f0Var = new f0("Generic XYZ", 14);
        CieXyz = f0Var;
        k kVar = new k("Generic L*a*b*", 15);
        CieLab = kVar;
        a0 a0Var15 = new a0("None", fArr, jVar.h(), d0Var2, 16);
        Unspecified = a0Var15;
        l lVar = new l("Oklab", 17);
        Oklab = lVar;
        ColorSpacesArray = new c[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9, a0Var10, a0Var11, a0Var12, a0Var13, a0Var14, f0Var, kVar, a0Var15, lVar};
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d5) {
        return d.a(d5, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d5) {
        return d.b(d5, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @fg.l
    public final a0 A() {
        return Unspecified;
    }

    @fg.m
    public final c B(@e1(9) @fg.l float[] toXYZD50, @fg.l d0 function) {
        for (c cVar : ColorSpacesArray) {
            long model = cVar.getModel();
            b.INSTANCE.getClass();
            if (b.h(model, b.f17669c)) {
                c e4 = d.e(cVar, j.f17726a.d(), null, 2, null);
                l0.n(e4, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                a0 a0Var = (a0) e4;
                if (d.i(toXYZD50, a0Var.getTransform()) && d.g(function, a0Var.getTransferParameters())) {
                    return cVar;
                }
            }
        }
        return null;
    }

    @fg.l
    public final a0 e() {
        return Aces;
    }

    @fg.l
    public final a0 f() {
        return Acescg;
    }

    @fg.l
    public final a0 g() {
        return AdobeRgb;
    }

    @fg.l
    public final a0 h() {
        return Bt2020;
    }

    @fg.l
    public final a0 i() {
        return Bt709;
    }

    @fg.l
    public final c j() {
        return CieLab;
    }

    @fg.l
    public final c k() {
        return CieXyz;
    }

    @fg.l
    public final c l(int id2) {
        return ColorSpacesArray[id2];
    }

    @fg.l
    public final c[] m() {
        return ColorSpacesArray;
    }

    @fg.l
    public final a0 n() {
        return DciP3;
    }

    @fg.l
    public final a0 o() {
        return DisplayP3;
    }

    @fg.l
    public final a0 p() {
        return ExtendedSrgb;
    }

    @fg.l
    public final a0 q() {
        return LinearExtendedSrgb;
    }

    @fg.l
    public final a0 r() {
        return LinearSrgb;
    }

    @fg.l
    public final a0 s() {
        return Ntsc1953;
    }

    @fg.l
    public final float[] t() {
        return Ntsc1953Primaries;
    }

    @fg.l
    public final c u() {
        return Oklab;
    }

    @fg.l
    public final a0 v() {
        return ProPhotoRgb;
    }

    @fg.l
    public final a0 w() {
        return SmpteC;
    }

    @fg.l
    public final a0 x() {
        return Srgb;
    }

    @fg.l
    public final float[] y() {
        return SrgbPrimaries;
    }

    @fg.l
    public final d0 z() {
        return SrgbTransferParameters;
    }
}
