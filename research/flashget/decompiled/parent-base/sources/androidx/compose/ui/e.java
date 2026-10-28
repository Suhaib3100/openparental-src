package androidx.compose.ui;

import androidx.compose.runtime.m1;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Alignment.kt */
@m1
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/e;", "Landroidx/compose/ui/c;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "b", "()F", "c", "Landroidx/compose/ui/unit/u;", "size", "space", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/q;", "a", "(JJLandroidx/compose/ui/unit/w;)J", "d", "(FF)Landroidx/compose/ui/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class e implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17471d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float horizontalBias;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float verticalBias;

    /* compiled from: Alignment.kt */
    @m1
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/e$a;", "Landroidx/compose/ui/c$b;", "", "bias", "<init>", "(F)V", "b", "()F", "", "size", "space", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(IILandroidx/compose/ui/unit/w;)I", "c", "(F)Landroidx/compose/ui/e$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a implements c.b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f17474b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float bias;

        public a(float f4) {
            this.bias = f4;
        }

        /* renamed from: b, reason: from getter */
        private final float getBias() {
            return this.bias;
        }

        public static a d(a aVar, float f4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = aVar.bias;
            }
            aVar.getClass();
            return new a(f4);
        }

        @Override // androidx.compose.ui.c.b
        public int a(int size, int space, @fg.l androidx.compose.ui.unit.w layoutDirection) {
            return kotlin.math.b.L0((1 + this.bias) * ((space - size) / 2.0f));
        }

        @fg.l
        public final a c(float bias) {
            return new a(bias);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Float.compare(this.bias, ((a) other).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @fg.l
        public String toString() {
            return androidx.compose.animation.b.a(new StringBuilder("Horizontal(bias="), this.bias, ')');
        }
    }

    public e(float f4, float f5) {
        this.horizontalBias = f4;
        this.verticalBias = f5;
    }

    /* renamed from: b, reason: from getter */
    private final float getHorizontalBias() {
        return this.horizontalBias;
    }

    /* renamed from: c, reason: from getter */
    private final float getVerticalBias() {
        return this.verticalBias;
    }

    public static e e(e eVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = eVar.horizontalBias;
        }
        if ((i4 & 2) != 0) {
            f5 = eVar.verticalBias;
        }
        eVar.getClass();
        return new e(f4, f5);
    }

    @Override // androidx.compose.ui.c
    public long a(long size, long space, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        long a5 = androidx.compose.ui.unit.v.a(androidx.compose.ui.unit.u.m(space) - ((int) (size >> 32)), ((int) (space & 4294967295L)) - ((int) (size & 4294967295L)));
        float f4 = 1;
        return androidx.compose.ui.unit.r.a(kotlin.math.b.L0((this.horizontalBias + f4) * (((int) (a5 >> 32)) / 2.0f)), kotlin.math.b.L0((f4 + this.verticalBias) * (((int) (a5 & 4294967295L)) / 2.0f)));
    }

    @fg.l
    public final e d(float horizontalBias, float verticalBias) {
        return new e(horizontalBias, verticalBias);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return Float.compare(this.horizontalBias, eVar.horizontalBias) == 0 && Float.compare(this.verticalBias, eVar.verticalBias) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.verticalBias) + (Float.hashCode(this.horizontalBias) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb.append(this.horizontalBias);
        sb.append(", verticalBias=");
        return androidx.compose.animation.b.a(sb, this.verticalBias, ')');
    }
}
