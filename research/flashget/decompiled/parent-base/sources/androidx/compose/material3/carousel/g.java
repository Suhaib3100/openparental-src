package androidx.compose.material3.carousel;

import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;

/* compiled from: Keyline.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+¨\u0006,"}, d2 = {"Landroidx/compose/material3/carousel/g;", "Landroidx/compose/material3/carousel/f;", "<init>", "()V", "", "f", "()I", "pivotIndex", "", "pivotOffset", "firstFocalIndex", "lastFocalIndex", "itemMainAxisSize", "carouselMainAxisSize", "", "Landroidx/compose/material3/carousel/g$a;", "tmpKeylines", "Landroidx/compose/material3/carousel/c;", "c", "(IFIIFFLjava/util/List;)Ljava/util/List;", "size", "offset", "", "g", "(FF)Z", "h", "(FFF)Z", "isAnchor", "Lkotlin/k2;", "b", "(FZ)V", "Landroidx/compose/material3/carousel/e;", "e", "(FIF)Landroidx/compose/material3/carousel/e;", "Landroidx/compose/material3/carousel/b;", "carouselAlignment", "d", "(FLandroidx/compose/material3/carousel/b;)Landroidx/compose/material3/carousel/e;", "a", "I", "F", "focalItemSize", "", "Ljava/util/List;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nKeyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1855#2,2:472\n1855#2,2:474\n*S KotlinDebug\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n*L\n392#1:472,2\n418#1:474,2\n*E\n"})
/* loaded from: classes.dex */
final class g implements f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float focalItemSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float pivotOffset;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int firstFocalIndex = -1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pivotIndex = -1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<a> tmpKeylines = new ArrayList();

    /* compiled from: Keyline.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/carousel/g$a;", "", "", "size", "", "isAnchor", "<init>", "(FZ)V", "a", "()F", "b", "()Z", "c", "(FZ)Landroidx/compose/material3/carousel/g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "e", "Z", "f", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float size;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isAnchor;

        public a(float f4, boolean z4) {
            this.size = f4;
            this.isAnchor = z4;
        }

        public static a d(a aVar, float f4, boolean z4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = aVar.size;
            }
            if ((i4 & 2) != 0) {
                z4 = aVar.isAnchor;
            }
            aVar.getClass();
            return new a(f4, z4);
        }

        /* renamed from: a, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsAnchor() {
            return this.isAnchor;
        }

        @l
        public final a c(float size, boolean isAnchor) {
            return new a(size, isAnchor);
        }

        public final float e() {
            return this.size;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.size, aVar.size) == 0 && this.isAnchor == aVar.isAnchor;
        }

        public final boolean f() {
            return this.isAnchor;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAnchor) + (Float.hashCode(this.size) * 31);
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder("TmpKeyline(size=");
            sb.append(this.size);
            sb.append(", isAnchor=");
            return androidx.compose.animation.l.a(sb, this.isAnchor, ')');
        }
    }

    /* compiled from: Keyline.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10330a;

        static {
            int[] iArr = new int[androidx.compose.material3.carousel.b.values().length];
            try {
                iArr[androidx.compose.material3.carousel.b.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.carousel.b.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.carousel.b.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10330a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.material3.carousel.c> c(int r29, float r30, int r31, int r32, float r33, float r34, java.util.List<androidx.compose.material3.carousel.g.a> r35) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.g.c(int, float, int, int, float, float, java.util.List):java.util.List");
    }

    private final int f() {
        int i4 = this.firstFocalIndex;
        while (i4 < w.J(this.tmpKeylines)) {
            int i5 = i4 + 1;
            if (this.tmpKeylines.get(i5).e() != this.focalItemSize) {
                break;
            }
            i4 = i5;
        }
        return i4;
    }

    private final boolean g(float size, float offset) {
        float f4 = size / 2;
        return offset - f4 < 0.0f && offset + f4 > 0.0f;
    }

    private final boolean h(float size, float offset, float carouselMainAxisSize) {
        float f4 = size / 2;
        return offset - f4 < carouselMainAxisSize && offset + f4 > carouselMainAxisSize;
    }

    @Override // androidx.compose.material3.carousel.f
    public void b(float size, boolean isAnchor) {
        this.tmpKeylines.add(new a(size, isAnchor));
        if (size > this.focalItemSize) {
            this.firstFocalIndex = w.J(this.tmpKeylines);
            this.focalItemSize = size;
        }
    }

    @l
    public final e d(float carouselMainAxisSize, @l androidx.compose.material3.carousel.b carouselAlignment) {
        float f4;
        float f5;
        int f6 = f();
        int i4 = this.firstFocalIndex;
        int i5 = f6 - i4;
        this.pivotIndex = i4;
        int i6 = b.f10330a[carouselAlignment.ordinal()];
        if (i6 == 1) {
            f4 = this.focalItemSize / 2;
        } else {
            if (i6 == 2) {
                float f7 = 2;
                f5 = (carouselMainAxisSize / f7) - ((this.focalItemSize / f7) * i5);
                this.pivotOffset = f5;
                return new e(c(this.pivotIndex, f5, this.firstFocalIndex, f6, this.focalItemSize, carouselMainAxisSize, this.tmpKeylines));
            }
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f4 = carouselMainAxisSize - (this.focalItemSize / 2);
        }
        f5 = f4;
        this.pivotOffset = f5;
        return new e(c(this.pivotIndex, f5, this.firstFocalIndex, f6, this.focalItemSize, carouselMainAxisSize, this.tmpKeylines));
    }

    @l
    public final e e(float carouselMainAxisSize, int pivotIndex, float pivotOffset) {
        return new e(c(pivotIndex, pivotOffset, this.firstFocalIndex, f(), this.focalItemSize, carouselMainAxisSize, this.tmpKeylines));
    }
}
