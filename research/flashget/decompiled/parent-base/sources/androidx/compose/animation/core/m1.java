package androidx.compose.animation.core;

import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.j5;
import kotlin.Metadata;

/* compiled from: PathEasing.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/core/m1;", "Landroidx/compose/animation/core/d0;", "Landroidx/compose/ui/graphics/g5;", "path", "<init>", "(Landroidx/compose/ui/graphics/g5;)V", "", "fraction", "a", "(F)F", "", "[F", "offsetX", "b", "offsetY", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m1 implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2844c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] offsetX;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] offsetY;

    public m1(@fg.l g5 g5Var) {
        j5 a5 = androidx.compose.ui.graphics.z0.a();
        a5.c(g5Var, false);
        float length = a5.getLength();
        if (length <= 0.0f) {
            throw new IllegalArgumentException("Path cannot be zero in length. Ensure that supplied Path starts at [0,0] and ends at [1,1]");
        }
        int i4 = (int) (length / 0.002f);
        int i5 = i4 + 1;
        float[] fArr = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr[i6] = 0.0f;
        }
        this.offsetX = fArr;
        float[] fArr2 = new float[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            fArr2[i7] = 0.0f;
        }
        this.offsetY = fArr2;
        for (int i10 = 0; i10 < i5; i10++) {
            long d5 = a5.d((i10 * length) / i4);
            this.offsetX[i10] = i0.f.p(d5);
            this.offsetY[i10] = i0.f.r(d5);
            if (i10 > 0) {
                float[] fArr3 = this.offsetX;
                if (fArr3[i10] < fArr3[i10 - 1]) {
                    throw new IllegalArgumentException("Path needs to be continuously increasing");
                }
            }
        }
    }

    @Override // androidx.compose.animation.core.d0
    public float a(float fraction) {
        if (fraction <= 0.0f) {
            return 0.0f;
        }
        if (fraction >= 1.0f) {
            return 1.0f;
        }
        int I = kotlin.collections.l.I(this.offsetX, fraction, 0, 0, 6, null);
        if (I > 0) {
            return this.offsetY[I];
        }
        int abs = Math.abs(I);
        float[] fArr = this.offsetX;
        if (abs >= fArr.length - 1) {
            return kotlin.collections.l.uh(this.offsetY);
        }
        int i4 = abs + 1;
        float f4 = fArr[i4];
        float f5 = fArr[abs];
        float f6 = (fraction - f5) / (f4 - f5);
        float[] fArr2 = this.offsetY;
        float f7 = fArr2[abs];
        return androidx.appcompat.graphics.drawable.d.a(fArr2[i4], f7, f6, f7);
    }
}
