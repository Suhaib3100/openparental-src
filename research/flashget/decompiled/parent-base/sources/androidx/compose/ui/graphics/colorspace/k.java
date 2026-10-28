package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Lab.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/k;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "m", "([F)[F", "v0", "v1", "v2", "", "k", "(FFF)J", "n", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/d2;", "o", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "b", "", "j", "()Z", "isWideGamut", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,141:1\n25#2,3:142\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:142,3\n*E\n"})
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: h, reason: collision with root package name */
    private static final float f17738h = 0.008856452f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f17739i = 7.787037f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f17740j = 0.13793103f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f17741k = 0.20689656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@fg.l String str, int i4) {
        super(str, b.f17671e, i4, null);
        b.INSTANCE.getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] b(@fg.l float[] v4) {
        float f4 = v4[0];
        j jVar = j.f17726a;
        float f5 = f4 / jVar.e()[0];
        float f6 = v4[1] / jVar.e()[1];
        float f7 = v4[2] / jVar.e()[2];
        float pow = f5 > f17738h ? (float) Math.pow(f5, 0.33333334f) : (f5 * f17739i) + f17740j;
        float pow2 = f6 > f17738h ? (float) Math.pow(f6, 0.33333334f) : (f6 * f17739i) + f17740j;
        float pow3 = f7 > f17738h ? (float) Math.pow(f7, 0.33333334f) : (f7 * f17739i) + f17740j;
        v4[0] = kotlin.ranges.s.H((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        v4[1] = kotlin.ranges.s.H((pow - pow2) * 500.0f, -128.0f, 128.0f);
        v4[2] = kotlin.ranges.s.H((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* renamed from: j */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long k(float v02, float v12, float v22) {
        float H = (kotlin.ranges.s.H(v02, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float H2 = (kotlin.ranges.s.H(v12, -128.0f, 128.0f) * 0.002f) + H;
        float f4 = H2 > f17741k ? H2 * H2 * H2 : (H2 - f17740j) * 0.12841855f;
        float f5 = H > f17741k ? H * H * H : (H - f17740j) * 0.12841855f;
        float f6 = f4 * j.f17726a.e()[0];
        return (Float.floatToRawIntBits(f5 * r5.e()[1]) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] m(@fg.l float[] v4) {
        v4[0] = kotlin.ranges.s.H(v4[0], 0.0f, 100.0f);
        v4[1] = kotlin.ranges.s.H(v4[1], -128.0f, 128.0f);
        float H = kotlin.ranges.s.H(v4[2], -128.0f, 128.0f);
        v4[2] = H;
        float f4 = (v4[0] + 16.0f) / 116.0f;
        float f5 = (v4[1] * 0.002f) + f4;
        float f6 = f4 - (H * 0.005f);
        float f7 = f5 > f17741k ? f5 * f5 * f5 : (f5 - f17740j) * 0.12841855f;
        float f10 = f4 > f17741k ? f4 * f4 * f4 : (f4 - f17740j) * 0.12841855f;
        float f11 = f6 > f17741k ? f6 * f6 * f6 : (f6 - f17740j) * 0.12841855f;
        j jVar = j.f17726a;
        v4[0] = f7 * jVar.e()[0];
        v4[1] = f10 * jVar.e()[1];
        v4[2] = f11 * jVar.e()[2];
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float v02, float v12, float v22) {
        float H = ((kotlin.ranges.s.H(v02, 0.0f, 100.0f) + 16.0f) / 116.0f) - (kotlin.ranges.s.H(v22, -128.0f, 128.0f) * 0.005f);
        return (H > f17741k ? H * H * H : 0.12841855f * (H - f17740j)) * j.f17726a.e()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float x4, float y4, float z4, float a5, @fg.l c colorSpace) {
        j jVar = j.f17726a;
        float f4 = x4 / jVar.e()[0];
        float f5 = y4 / jVar.e()[1];
        float f6 = z4 / jVar.e()[2];
        float pow = f4 > f17738h ? (float) Math.pow(f4, 0.33333334f) : (f4 * f17739i) + f17740j;
        float pow2 = f5 > f17738h ? (float) Math.pow(f5, 0.33333334f) : (f5 * f17739i) + f17740j;
        return f2.a(kotlin.ranges.s.H((116.0f * pow2) - 16.0f, 0.0f, 100.0f), kotlin.ranges.s.H((pow - pow2) * 500.0f, -128.0f, 128.0f), kotlin.ranges.s.H((pow2 - (f6 > f17738h ? (float) Math.pow(f6, 0.33333334f) : (f6 * f17739i) + f17740j)) * 200.0f, -128.0f, 128.0f), a5, colorSpace);
    }
}
