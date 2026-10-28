package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Xyz.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0013R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/colorspace/f0;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "", "x", "p", "(F)F", "component", "f", "(I)F", "e", "", "v", "m", "([F)[F", "v0", "v1", "v2", "", "k", "(FFF)J", "n", "(FFF)F", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/d2;", "o", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "b", "", "j", "()Z", "isWideGamut", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,80:1\n25#2,3:81\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:81,3\n*E\n"})
/* loaded from: classes.dex */
public final class f0 extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@fg.l String str, int i4) {
        super(str, b.f17670d, i4, null);
        b.INSTANCE.getClass();
    }

    private final float p(float x4) {
        return kotlin.ranges.s.H(x4, -2.0f, 2.0f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] b(@fg.l float[] v4) {
        v4[0] = p(v4[0]);
        v4[1] = p(v4[1]);
        v4[2] = p(v4[2]);
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* renamed from: j */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long k(float v02, float v12, float v22) {
        float p4 = p(v02);
        float p5 = p(v12);
        return (Float.floatToRawIntBits(p5) & 4294967295L) | (Float.floatToRawIntBits(p4) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @fg.l
    public float[] m(@fg.l float[] v4) {
        v4[0] = p(v4[0]);
        v4[1] = p(v4[1]);
        v4[2] = p(v4[2]);
        return v4;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float v02, float v12, float v22) {
        return p(v22);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float x4, float y4, float z4, float a5, @fg.l c colorSpace) {
        return f2.a(p(x4), p(y4), p(z4), a5, colorSpace);
    }
}
