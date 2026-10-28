package androidx.compose.material3.carousel;

import androidx.annotation.x;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: Arrangement.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/carousel/a;", "", "", "priority", "", "smallSize", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "<init>", "(IFIFIFI)V", "", "f", "()Z", "targetLargeSize", "b", "(F)F", "a", "I", "F", "e", "()F", "c", "d", "g", "h", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    public static final int f10294i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final float f10295j = 0.1f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float smallSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int smallCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float mediumSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int mediumCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float largeSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int largeCount;

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/material3/carousel/a$a;", "", "<init>", "()V", "", "priority", "", "availableSpace", "smallCount", "smallSize", "Landroidx/annotation/x;", "smallSizeRange", "mediumCount", "mediumSize", "largeCount", "largeSize", "Landroidx/compose/material3/carousel/a;", "c", "(IFIFLandroidx/annotation/x;IFIF)Landroidx/compose/material3/carousel/a;", "a", "(FIFII)F", "targetSmallSize", "", "smallCounts", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "b", "(FFLandroidx/annotation/x;[IF[IF[I)Landroidx/compose/material3/carousel/a;", "MediumItemFlexPercentage", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.carousel.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final float a(float availableSpace, int smallCount, float smallSize, int mediumCount, int largeCount) {
            float f4 = mediumCount / 2.0f;
            return (availableSpace - ((smallCount + f4) * smallSize)) / (largeCount + f4);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final androidx.compose.material3.carousel.a c(int r14, float r15, int r16, float r17, androidx.annotation.x r18, int r19, float r20, int r21, float r22) {
            /*
                r13 = this;
                r6 = r16
                r7 = r19
                double r0 = r18.from()
                float r0 = (float) r0
                double r1 = r18.to()
                float r1 = (float) r1
                r2 = r17
                float r0 = kotlin.ranges.s.H(r2, r0, r1)
                r8 = r21
                float r9 = (float) r8
                float r1 = r22 * r9
                float r10 = (float) r7
                float r2 = r20 * r10
                float r2 = r2 + r1
                float r1 = (float) r6
                float r3 = r0 * r1
                float r3 = r3 + r2
                float r2 = r15 - r3
                r11 = 0
                if (r6 <= 0) goto L37
                int r3 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r3 <= 0) goto L37
                float r2 = r2 / r1
                double r3 = r18.to()
                float r1 = (float) r3
                float r1 = r1 - r0
                float r1 = java.lang.Math.min(r2, r1)
            L35:
                float r0 = r0 + r1
                goto L49
            L37:
                if (r6 <= 0) goto L49
                int r3 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r3 >= 0) goto L49
                float r2 = r2 / r1
                double r3 = r18.from()
                float r1 = (float) r3
                float r1 = r1 - r0
                float r1 = java.lang.Math.max(r2, r1)
                goto L35
            L49:
                if (r6 <= 0) goto L4d
                r12 = r0
                goto L4e
            L4d:
                r12 = r11
            L4e:
                r0 = r13
                r1 = r15
                r2 = r16
                r3 = r12
                r4 = r19
                r5 = r21
                float r0 = r0.a(r1, r2, r3, r4, r5)
                float r1 = r0 + r12
                r2 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r2
                if (r7 <= 0) goto L8b
                int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
                if (r2 != 0) goto L67
                goto L8b
            L67:
                float r2 = r22 - r0
                float r2 = r2 * r9
                r3 = 1036831949(0x3dcccccd, float:0.1)
                float r3 = r3 * r1
                float r3 = r3 * r10
                float r4 = java.lang.Math.abs(r2)
                float r3 = java.lang.Math.min(r4, r3)
                int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r2 <= 0) goto L83
                float r2 = r3 / r10
                float r1 = r1 - r2
                float r3 = r3 / r9
                float r3 = r3 + r0
                r4 = r1
                r9 = r3
                goto L8d
            L83:
                float r2 = r3 / r10
                float r2 = r2 + r1
                float r3 = r3 / r9
                float r0 = r0 - r3
                r9 = r0
                r4 = r2
                goto L8d
            L8b:
                r9 = r0
                r4 = r1
            L8d:
                androidx.compose.material3.carousel.a r10 = new androidx.compose.material3.carousel.a
                r0 = r10
                r1 = r14
                r2 = r12
                r3 = r16
                r5 = r19
                r6 = r9
                r7 = r21
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.a.Companion.c(int, float, int, float, androidx.annotation.x, int, float, int, float):androidx.compose.material3.carousel.a");
        }

        @m
        public final a b(float availableSpace, float targetSmallSize, @l x smallSizeRange, @l int[] smallCounts, float targetMediumSize, @l int[] mediumCounts, float targetLargeSize, @l int[] largeCounts) {
            int length = largeCounts.length;
            a aVar = null;
            int i4 = 1;
            int i5 = 0;
            while (i5 < length) {
                int i6 = largeCounts[i5];
                int length2 = mediumCounts.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i10 = mediumCounts[i7];
                    int length3 = smallCounts.length;
                    a aVar2 = aVar;
                    int i11 = i4;
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = i12;
                        a aVar3 = aVar2;
                        int i14 = length3;
                        int i15 = i7;
                        int i16 = length2;
                        int i17 = i5;
                        a c5 = c(i11, availableSpace, smallCounts[i12], targetSmallSize, smallSizeRange, i10, targetMediumSize, i6, targetLargeSize);
                        if (aVar3 != null && c5.b(targetLargeSize) >= aVar3.b(targetLargeSize)) {
                            aVar2 = aVar3;
                        } else {
                            if (c5.b(targetLargeSize) == 0.0f) {
                                return c5;
                            }
                            aVar2 = c5;
                        }
                        i11++;
                        i12 = i13 + 1;
                        length3 = i14;
                        i7 = i15;
                        length2 = i16;
                        i5 = i17;
                    }
                    i7++;
                    aVar = aVar2;
                    i4 = i11;
                }
                i5++;
            }
            return aVar;
        }

        public Companion(w wVar) {
        }
    }

    public a(int i4, float f4, int i5, float f5, int i6, float f6, int i7) {
        this.priority = i4;
        this.smallSize = f4;
        this.smallCount = i5;
        this.mediumSize = f5;
        this.mediumCount = i6;
        this.largeSize = f6;
        this.largeCount = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float b(float targetLargeSize) {
        if (f()) {
            return Math.abs(targetLargeSize - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    private final boolean f() {
        int i4 = this.largeCount;
        if (i4 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i4 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f4 = this.largeSize;
        float f5 = this.mediumSize;
        return f4 > f5 && f5 > this.smallSize;
    }

    /* renamed from: c, reason: from getter */
    public final float getLargeSize() {
        return this.largeSize;
    }

    /* renamed from: d, reason: from getter */
    public final float getMediumSize() {
        return this.mediumSize;
    }

    /* renamed from: e, reason: from getter */
    public final float getSmallSize() {
        return this.smallSize;
    }
}
