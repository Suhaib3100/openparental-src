package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: OffsetMappingCalculator.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u001c\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/r;", "", "<init>", "()V", "", "offset", "", "fromSource", "Landroidx/compose/ui/text/t0;", "a", "(IZ)J", "opOffset", "untransformedLen", "transformedLen", "d", "(IIIIZ)J", "sourceStart", "sourceEnd", "newLength", "Lkotlin/k2;", "e", "(III)V", "c", "(I)J", "b", "Landroidx/compose/foundation/text2/input/internal/s;", "[I", "ops", "I", "opsSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8717c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] ops = s.b(10);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int opsSize;

    private final long a(int offset, boolean fromSource) {
        int i4;
        int i5;
        int[] iArr = this.ops;
        int i6 = this.opsSize;
        if (i6 < 0) {
            i4 = offset;
            i5 = i4;
        } else if (fromSource) {
            i4 = offset;
            i5 = i4;
            int i7 = 0;
            while (i7 < i6) {
                int i10 = i7 * 3;
                int i11 = iArr[i10];
                int i12 = iArr[i10 + 1];
                int i13 = iArr[i10 + 2];
                long d5 = d(i4, i11, i12, i13, fromSource);
                long d6 = d(i5, i11, i12, i13, fromSource);
                int min = Math.min(t0.n(d5), (int) (d6 >> 32));
                i5 = Math.max((int) (d5 & 4294967295L), (int) (d6 & 4294967295L));
                i7++;
                i4 = min;
            }
        } else {
            i4 = offset;
            int i14 = i6 - 1;
            int i15 = i4;
            while (-1 < i14) {
                int i16 = i14 * 3;
                int i17 = iArr[i16];
                int i18 = iArr[i16 + 1];
                int i19 = iArr[i16 + 2];
                long d7 = d(i4, i17, i18, i19, fromSource);
                long d10 = d(i15, i17, i18, i19, fromSource);
                int min2 = Math.min(t0.n(d7), (int) (d10 >> 32));
                i15 = Math.max((int) (d7 & 4294967295L), (int) (d10 & 4294967295L));
                i14--;
                i4 = min2;
            }
            i5 = i15;
        }
        return u0.b(i4, i5);
    }

    private final long d(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i4 = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        if (offset < opOffset) {
            return u0.b(offset, offset);
        }
        if (offset == opOffset) {
            return i4 == 0 ? u0.b(opOffset, untransformedLen + opOffset) : u0.b(opOffset, opOffset);
        }
        if (offset < opOffset + i4) {
            return untransformedLen == 0 ? u0.b(opOffset, opOffset) : u0.b(opOffset, untransformedLen + opOffset);
        }
        int i5 = (offset - i4) + untransformedLen;
        return u0.b(i5, i5);
    }

    public final long b(int offset) {
        return a(offset, false);
    }

    public final long c(int offset) {
        return a(offset, true);
    }

    public final void e(int sourceStart, int sourceEnd, int newLength) {
        if (newLength < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected newLen to be ≥ 0, was ", newLength).toString());
        }
        int min = Math.min(sourceStart, sourceEnd);
        int max = Math.max(min, sourceEnd) - min;
        if (max >= 2 || max != newLength) {
            int i4 = this.opsSize + 1;
            if (i4 > s.i(this.ops)) {
                this.ops = s.d(this.ops, Math.max(i4 * 2, (this.ops.length / 3) * 2));
            }
            s.k(this.ops, this.opsSize, min, max, newLength);
            this.opsSize = i4;
        }
    }
}
