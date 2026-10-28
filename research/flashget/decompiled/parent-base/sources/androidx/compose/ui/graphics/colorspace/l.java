package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Oklab.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/l;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "m", "([F)[F", "v0", "v1", "v2", "", "k", "(FFF)J", "n", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/d2;", "o", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "b", "", "j", "()Z", "isWideGamut", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final float[] f17743h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final float[] f17744i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final float[] f17745j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final float[] f17746k;

    static {
        a.INSTANCE.getClass();
        float[] transform = a.f17645c.getTransform();
        j jVar = j.f17726a;
        float[] m4 = d.m(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.f(transform, jVar.d().g(), jVar.h().g()));
        f17743h = m4;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f17744i = fArr;
        f17745j = d.l(m4);
        f17746k = d.l(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@fg.l String str, int i4) {
        super(str, b.f17671e, i4, null);
        b.INSTANCE.getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] b(@fg.l float[] v4) {
        d.o(f17743h, v4);
        double d5 = 0.33333334f;
        v4[0] = Math.signum(v4[0]) * ((float) Math.pow(Math.abs(v4[0]), d5));
        v4[1] = Math.signum(v4[1]) * ((float) Math.pow(Math.abs(v4[1]), d5));
        v4[2] = Math.signum(v4[2]) * ((float) Math.pow(Math.abs(v4[2]), d5));
        d.o(f17744i, v4);
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* renamed from: j */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long k(float v02, float v12, float v22) {
        float H = kotlin.ranges.s.H(v02, 0.0f, 1.0f);
        float H2 = kotlin.ranges.s.H(v12, -0.5f, 0.5f);
        float H3 = kotlin.ranges.s.H(v22, -0.5f, 0.5f);
        float[] fArr = f17746k;
        float p4 = d.p(fArr, H, H2, H3);
        float q4 = d.q(fArr, H, H2, H3);
        float r4 = d.r(fArr, H, H2, H3);
        float f4 = p4 * p4 * p4;
        float f5 = q4 * q4 * q4;
        float f6 = r4 * r4 * r4;
        float[] fArr2 = f17745j;
        float p5 = d.p(fArr2, f4, f5, f6);
        float q5 = d.q(fArr2, f4, f5, f6);
        return (Float.floatToRawIntBits(p5) << 32) | (Float.floatToRawIntBits(q5) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] m(@fg.l float[] v4) {
        v4[0] = kotlin.ranges.s.H(v4[0], 0.0f, 1.0f);
        v4[1] = kotlin.ranges.s.H(v4[1], -0.5f, 0.5f);
        v4[2] = kotlin.ranges.s.H(v4[2], -0.5f, 0.5f);
        d.o(f17746k, v4);
        float f4 = v4[0];
        v4[0] = f4 * f4 * f4;
        float f5 = v4[1];
        v4[1] = f5 * f5 * f5;
        float f6 = v4[2];
        v4[2] = f6 * f6 * f6;
        d.o(f17745j, v4);
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float v02, float v12, float v22) {
        float H = kotlin.ranges.s.H(v02, 0.0f, 1.0f);
        float H2 = kotlin.ranges.s.H(v12, -0.5f, 0.5f);
        float H3 = kotlin.ranges.s.H(v22, -0.5f, 0.5f);
        float[] fArr = f17746k;
        float p4 = d.p(fArr, H, H2, H3);
        float q4 = d.q(fArr, H, H2, H3);
        float r4 = d.r(fArr, H, H2, H3);
        float f4 = r4 * r4 * r4;
        return d.r(f17745j, p4 * p4 * p4, q4 * q4 * q4, f4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float x4, float y4, float z4, float a5, @fg.l c colorSpace) {
        float[] fArr = f17743h;
        float p4 = d.p(fArr, x4, y4, z4);
        float q4 = d.q(fArr, x4, y4, z4);
        float r4 = d.r(fArr, x4, y4, z4);
        double d5 = 0.33333334f;
        float signum = Math.signum(p4) * ((float) Math.pow(Math.abs(p4), d5));
        float signum2 = Math.signum(q4) * ((float) Math.pow(Math.abs(q4), d5));
        float signum3 = Math.signum(r4) * ((float) Math.pow(Math.abs(r4), d5));
        float[] fArr2 = f17744i;
        return f2.a(d.p(fArr2, signum, signum2, signum3), d.q(fArr2, signum, signum2, signum3), d.r(fArr2, signum, signum2, signum3), a5, colorSpace);
    }
}
