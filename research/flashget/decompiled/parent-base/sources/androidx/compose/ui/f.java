package androidx.compose.ui;

import androidx.compose.runtime.m1;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Alignment.kt */
@m1
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b!\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/f;", "Landroidx/compose/ui/c;", "", "horizontalBias", "verticalBias", "<init>", "(FF)V", "Landroidx/compose/ui/unit/u;", "size", "space", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/q;", "a", "(JJLandroidx/compose/ui/unit/w;)J", "b", "()F", "c", "d", "(FF)Landroidx/compose/ui/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "g", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class f implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17476d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float horizontalBias;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float verticalBias;

    /* compiled from: Alignment.kt */
    @m1
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/f$a;", "Landroidx/compose/ui/c$b;", "", "bias", "<init>", "(F)V", "b", "()F", "", "size", "space", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(IILandroidx/compose/ui/unit/w;)I", "c", "(F)Landroidx/compose/ui/f$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a implements c.b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f17479b = 0;

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
            return kotlin.math.b.L0((1 + (layoutDirection == androidx.compose.ui.unit.w.Ltr ? this.bias : (-1) * this.bias)) * ((space - size) / 2.0f));
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

    /* compiled from: Alignment.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/f$b;", "Landroidx/compose/ui/c$c;", "", "bias", "<init>", "(F)V", "b", "()F", "", "size", "space", "a", "(II)I", "c", "(F)Landroidx/compose/ui/f$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements c.InterfaceC0326c {

        /* renamed from: b, reason: collision with root package name */
        public static final int f17481b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float bias;

        public b(float f4) {
            this.bias = f4;
        }

        /* renamed from: b, reason: from getter */
        private final float getBias() {
            return this.bias;
        }

        public static b d(b bVar, float f4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = bVar.bias;
            }
            bVar.getClass();
            return new b(f4);
        }

        @Override // androidx.compose.ui.c.InterfaceC0326c
        public int a(int size, int space) {
            return kotlin.math.b.L0((1 + this.bias) * ((space - size) / 2.0f));
        }

        @fg.l
        public final b c(float bias) {
            return new b(bias);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Float.compare(this.bias, ((b) other).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @fg.l
        public String toString() {
            return androidx.compose.animation.b.a(new StringBuilder("Vertical(bias="), this.bias, ')');
        }
    }

    public f(float f4, float f5) {
        this.horizontalBias = f4;
        this.verticalBias = f5;
    }

    public static f e(f fVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = fVar.horizontalBias;
        }
        if ((i4 & 2) != 0) {
            f5 = fVar.verticalBias;
        }
        fVar.getClass();
        return new f(f4, f5);
    }

    @Override // androidx.compose.ui.c
    public long a(long size, long space, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        float m4 = (androidx.compose.ui.unit.u.m(space) - ((int) (size >> 32))) / 2.0f;
        float f4 = (((int) (space & 4294967295L)) - ((int) (size & 4294967295L))) / 2.0f;
        float f5 = 1;
        return androidx.compose.ui.unit.r.a(kotlin.math.b.L0(((layoutDirection == androidx.compose.ui.unit.w.Ltr ? this.horizontalBias : (-1) * this.horizontalBias) + f5) * m4), kotlin.math.b.L0((f5 + this.verticalBias) * f4));
    }

    /* renamed from: b, reason: from getter */
    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    /* renamed from: c, reason: from getter */
    public final float getVerticalBias() {
        return this.verticalBias;
    }

    @fg.l
    public final f d(float horizontalBias, float verticalBias) {
        return new f(horizontalBias, verticalBias);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return Float.compare(this.horizontalBias, fVar.horizontalBias) == 0 && Float.compare(this.verticalBias, fVar.verticalBias) == 0;
    }

    public final float f() {
        return this.horizontalBias;
    }

    public final float g() {
        return this.verticalBias;
    }

    public int hashCode() {
        return Float.hashCode(this.verticalBias) + (Float.hashCode(this.horizontalBias) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.horizontalBias);
        sb.append(", verticalBias=");
        return androidx.compose.animation.b.a(sb, this.verticalBias, ')');
    }
}
