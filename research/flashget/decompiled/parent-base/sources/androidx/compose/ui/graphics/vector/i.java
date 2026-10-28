package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.d1;
import androidx.compose.animation.l0;
import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: PathNode.kt */
@m1
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0007\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t\u0082\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/vector/i;", "", "", "isCurve", "isQuad", "<init>", "(ZZ)V", "a", "Z", "()Z", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Landroidx/compose/ui/graphics/vector/i$a;", "Landroidx/compose/ui/graphics/vector/i$b;", "Landroidx/compose/ui/graphics/vector/i$c;", "Landroidx/compose/ui/graphics/vector/i$d;", "Landroidx/compose/ui/graphics/vector/i$e;", "Landroidx/compose/ui/graphics/vector/i$f;", "Landroidx/compose/ui/graphics/vector/i$g;", "Landroidx/compose/ui/graphics/vector/i$h;", "Landroidx/compose/ui/graphics/vector/i$i;", "Landroidx/compose/ui/graphics/vector/i$j;", "Landroidx/compose/ui/graphics/vector/i$k;", "Landroidx/compose/ui/graphics/vector/i$l;", "Landroidx/compose/ui/graphics/vector/i$m;", "Landroidx/compose/ui/graphics/vector/i$n;", "Landroidx/compose/ui/graphics/vector/i$o;", "Landroidx/compose/ui/graphics/vector/i$p;", "Landroidx/compose/ui/graphics/vector/i$q;", "Landroidx/compose/ui/graphics/vector/i$r;", "Landroidx/compose/ui/graphics/vector/i$s;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCurve;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isQuad;

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b(\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b)\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$a;", "Landroidx/compose/ui/graphics/vector/i;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "c", "()F", "d", "e", "f", "()Z", "g", "h", "i", "j", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/i$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "n", "p", "o", "Z", "q", "r", "l", "m", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float horizontalEllipseRadius;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float verticalEllipseRadius;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float theta;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isMoreThanHalf;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean isPositiveArc;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final float arcStartX;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final float arcStartY;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartX = r9
                r3.arcStartY = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.a.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static a k(a aVar, float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f10, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = aVar.horizontalEllipseRadius;
            }
            if ((i4 & 2) != 0) {
                f5 = aVar.verticalEllipseRadius;
            }
            float f11 = f5;
            if ((i4 & 4) != 0) {
                f6 = aVar.theta;
            }
            float f12 = f6;
            if ((i4 & 8) != 0) {
                z4 = aVar.isMoreThanHalf;
            }
            boolean z6 = z4;
            if ((i4 & 16) != 0) {
                z5 = aVar.isPositiveArc;
            }
            boolean z7 = z5;
            if ((i4 & 32) != 0) {
                f7 = aVar.arcStartX;
            }
            float f13 = f7;
            if ((i4 & 64) != 0) {
                f10 = aVar.arcStartY;
            }
            aVar.getClass();
            return new a(f4, f11, f12, z6, z7, f13, f10);
        }

        /* renamed from: c, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        /* renamed from: d, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* renamed from: e, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.horizontalEllipseRadius, aVar.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, aVar.verticalEllipseRadius) == 0 && Float.compare(this.theta, aVar.theta) == 0 && this.isMoreThanHalf == aVar.isMoreThanHalf && this.isPositiveArc == aVar.isPositiveArc && Float.compare(this.arcStartX, aVar.arcStartX) == 0 && Float.compare(this.arcStartY, aVar.arcStartY) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* renamed from: h, reason: from getter */
        public final float getArcStartX() {
            return this.arcStartX;
        }

        public int hashCode() {
            return Float.hashCode(this.arcStartY) + l0.a(this.arcStartX, d1.a(this.isPositiveArc, d1.a(this.isMoreThanHalf, l0.a(this.theta, l0.a(this.verticalEllipseRadius, Float.hashCode(this.horizontalEllipseRadius) * 31, 31), 31), 31), 31), 31);
        }

        /* renamed from: i, reason: from getter */
        public final float getArcStartY() {
            return this.arcStartY;
        }

        @fg.l
        public final a j(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartX, float arcStartY) {
            return new a(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartX, arcStartY);
        }

        public final float l() {
            return this.arcStartX;
        }

        public final float m() {
            return this.arcStartY;
        }

        public final float n() {
            return this.horizontalEllipseRadius;
        }

        public final float o() {
            return this.theta;
        }

        public final float p() {
            return this.verticalEllipseRadius;
        }

        public final boolean q() {
            return this.isMoreThanHalf;
        }

        public final boolean r() {
            return this.isPositiveArc;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.horizontalEllipseRadius);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.verticalEllipseRadius);
            sb.append(", theta=");
            sb.append(this.theta);
            sb.append(", isMoreThanHalf=");
            sb.append(this.isMoreThanHalf);
            sb.append(", isPositiveArc=");
            sb.append(this.isPositiveArc);
            sb.append(", arcStartX=");
            sb.append(this.arcStartX);
            sb.append(", arcStartY=");
            return androidx.compose.animation.b.a(sb, this.arcStartY, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$b;", "Landroidx/compose/ui/graphics/vector/i;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends i {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final b f18200c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private b() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.b.<init>():void");
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b!\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b#\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b%\u0010\f¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$c;", "Landroidx/compose/ui/graphics/vector/i;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "c", "()F", "d", "e", "f", "g", "h", "i", "(FFFFFF)Landroidx/compose/ui/graphics/vector/i$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "k", "n", "l", "o", "m", "p", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final float x3;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final float y3;

        public c(float f4, float f5, float f6, float f7, float f10, float f11) {
            super(true, false, 2, null);
            this.x1 = f4;
            this.y1 = f5;
            this.x2 = f6;
            this.y2 = f7;
            this.x3 = f10;
            this.y3 = f11;
        }

        public static c j(c cVar, float f4, float f5, float f6, float f7, float f10, float f11, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = cVar.x1;
            }
            if ((i4 & 2) != 0) {
                f5 = cVar.y1;
            }
            float f12 = f5;
            if ((i4 & 4) != 0) {
                f6 = cVar.x2;
            }
            float f13 = f6;
            if ((i4 & 8) != 0) {
                f7 = cVar.y2;
            }
            float f14 = f7;
            if ((i4 & 16) != 0) {
                f10 = cVar.x3;
            }
            float f15 = f10;
            if ((i4 & 32) != 0) {
                f11 = cVar.y3;
            }
            cVar.getClass();
            return new c(f4, f12, f13, f14, f15, f11);
        }

        /* renamed from: c, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* renamed from: d, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: e, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Float.compare(this.x1, cVar.x1) == 0 && Float.compare(this.y1, cVar.y1) == 0 && Float.compare(this.x2, cVar.x2) == 0 && Float.compare(this.y2, cVar.y2) == 0 && Float.compare(this.x3, cVar.x3) == 0 && Float.compare(this.y3, cVar.y3) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* renamed from: g, reason: from getter */
        public final float getX3() {
            return this.x3;
        }

        /* renamed from: h, reason: from getter */
        public final float getY3() {
            return this.y3;
        }

        public int hashCode() {
            return Float.hashCode(this.y3) + l0.a(this.x3, l0.a(this.y2, l0.a(this.x2, l0.a(this.y1, Float.hashCode(this.x1) * 31, 31), 31), 31), 31);
        }

        @fg.l
        public final c i(float x12, float y12, float x22, float y22, float x32, float y32) {
            return new c(x12, y12, x22, y22, x32, y32);
        }

        public final float k() {
            return this.x1;
        }

        public final float l() {
            return this.x2;
        }

        public final float m() {
            return this.x3;
        }

        public final float n() {
            return this.y1;
        }

        public final float o() {
            return this.y2;
        }

        public final float p() {
            return this.y3;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.x1);
            sb.append(", y1=");
            sb.append(this.y1);
            sb.append(", x2=");
            sb.append(this.x2);
            sb.append(", y2=");
            sb.append(this.y2);
            sb.append(", x3=");
            sb.append(this.x3);
            sb.append(", y3=");
            return androidx.compose.animation.b.a(sb, this.y3, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$d;", "Landroidx/compose/ui/graphics/vector/i;", "", "x", "<init>", "(F)V", "c", "()F", "d", "(F)Landroidx/compose/ui/graphics/vector/i$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.x = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.d.<init>(float):void");
        }

        public static d e(d dVar, float f4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = dVar.x;
            }
            dVar.getClass();
            return new d(f4);
        }

        /* renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        @fg.l
        public final d d(float x4) {
            return new d(x4);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Float.compare(this.x, ((d) other).x) == 0;
        }

        public final float f() {
            return this.x;
        }

        public int hashCode() {
            return Float.hashCode(this.x);
        }

        @fg.l
        public String toString() {
            return androidx.compose.animation.b.a(new StringBuilder("HorizontalTo(x="), this.x, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$e;", "Landroidx/compose/ui/graphics/vector/i;", "", "x", "y", "<init>", "(FF)V", "c", "()F", "d", "e", "(FF)Landroidx/compose/ui/graphics/vector/i$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.x = r4
                r3.y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.e.<init>(float, float):void");
        }

        public static e f(e eVar, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = eVar.x;
            }
            if ((i4 & 2) != 0) {
                f5 = eVar.y;
            }
            eVar.getClass();
            return new e(f4, f5);
        }

        /* renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: d, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @fg.l
        public final e e(float x4, float y4) {
            return new e(x4, y4);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return Float.compare(this.x, eVar.x) == 0 && Float.compare(this.y, eVar.y) == 0;
        }

        public final float g() {
            return this.x;
        }

        public final float h() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            return androidx.compose.animation.b.a(sb, this.y, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$f;", "Landroidx/compose/ui/graphics/vector/i;", "", "x", "y", "<init>", "(FF)V", "c", "()F", "d", "e", "(FF)Landroidx/compose/ui/graphics/vector/i$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class f extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.x = r4
                r3.y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.f.<init>(float, float):void");
        }

        public static f f(f fVar, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = fVar.x;
            }
            if ((i4 & 2) != 0) {
                f5 = fVar.y;
            }
            fVar.getClass();
            return new f(f4, f5);
        }

        /* renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: d, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @fg.l
        public final f e(float x4, float y4) {
            return new f(x4, y4);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return Float.compare(this.x, fVar.x) == 0 && Float.compare(this.y, fVar.y) == 0;
        }

        public final float g() {
            return this.x;
        }

        public final float h() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            return androidx.compose.animation.b.a(sb, this.y, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/i$g;", "Landroidx/compose/ui/graphics/vector/i;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "c", "()F", "d", "e", "f", "g", "(FFFF)Landroidx/compose/ui/graphics/vector/i$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "i", "k", "j", "l", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class g extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        public g(float f4, float f5, float f6, float f7) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x1 = f4;
            this.y1 = f5;
            this.x2 = f6;
            this.y2 = f7;
        }

        public static g h(g gVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = gVar.x1;
            }
            if ((i4 & 2) != 0) {
                f5 = gVar.y1;
            }
            if ((i4 & 4) != 0) {
                f6 = gVar.x2;
            }
            if ((i4 & 8) != 0) {
                f7 = gVar.y2;
            }
            gVar.getClass();
            return new g(f4, f5, f6, f7);
        }

        /* renamed from: c, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* renamed from: d, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: e, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return Float.compare(this.x1, gVar.x1) == 0 && Float.compare(this.y1, gVar.y1) == 0 && Float.compare(this.x2, gVar.x2) == 0 && Float.compare(this.y2, gVar.y2) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        @fg.l
        public final g g(float x12, float y12, float x22, float y22) {
            return new g(x12, y12, x22, y22);
        }

        public int hashCode() {
            return Float.hashCode(this.y2) + l0.a(this.x2, l0.a(this.y1, Float.hashCode(this.x1) * 31, 31), 31);
        }

        public final float i() {
            return this.x1;
        }

        public final float j() {
            return this.x2;
        }

        public final float k() {
            return this.y1;
        }

        public final float l() {
            return this.y2;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.x1);
            sb.append(", y1=");
            sb.append(this.y1);
            sb.append(", x2=");
            sb.append(this.x2);
            sb.append(", y2=");
            return androidx.compose.animation.b.a(sb, this.y2, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/i$h;", "Landroidx/compose/ui/graphics/vector/i;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "c", "()F", "d", "e", "f", "g", "(FFFF)Landroidx/compose/ui/graphics/vector/i$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "i", "k", "j", "l", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class h extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        public h(float f4, float f5, float f6, float f7) {
            super(true, false, 2, null);
            this.x1 = f4;
            this.y1 = f5;
            this.x2 = f6;
            this.y2 = f7;
        }

        public static h h(h hVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = hVar.x1;
            }
            if ((i4 & 2) != 0) {
                f5 = hVar.y1;
            }
            if ((i4 & 4) != 0) {
                f6 = hVar.x2;
            }
            if ((i4 & 8) != 0) {
                f7 = hVar.y2;
            }
            hVar.getClass();
            return new h(f4, f5, f6, f7);
        }

        /* renamed from: c, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* renamed from: d, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: e, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return Float.compare(this.x1, hVar.x1) == 0 && Float.compare(this.y1, hVar.y1) == 0 && Float.compare(this.x2, hVar.x2) == 0 && Float.compare(this.y2, hVar.y2) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        @fg.l
        public final h g(float x12, float y12, float x22, float y22) {
            return new h(x12, y12, x22, y22);
        }

        public int hashCode() {
            return Float.hashCode(this.y2) + l0.a(this.x2, l0.a(this.y1, Float.hashCode(this.x1) * 31, 31), 31);
        }

        public final float i() {
            return this.x1;
        }

        public final float j() {
            return this.x2;
        }

        public final float k() {
            return this.y1;
        }

        public final float l() {
            return this.y2;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.x1);
            sb.append(", y1=");
            sb.append(this.y1);
            sb.append(", x2=");
            sb.append(this.x2);
            sb.append(", y2=");
            return androidx.compose.animation.b.a(sb, this.y2, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$i;", "Landroidx/compose/ui/graphics/vector/i;", "", "x", "y", "<init>", "(FF)V", "c", "()F", "d", "e", "(FF)Landroidx/compose/ui/graphics/vector/i$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.i$i, reason: collision with other inner class name */
    public static final /* data */ class C0333i extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y;

        public C0333i(float f4, float f5) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x = f4;
            this.y = f5;
        }

        public static C0333i f(C0333i c0333i, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = c0333i.x;
            }
            if ((i4 & 2) != 0) {
                f5 = c0333i.y;
            }
            c0333i.getClass();
            return new C0333i(f4, f5);
        }

        /* renamed from: c, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: d, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @fg.l
        public final C0333i e(float x4, float y4) {
            return new C0333i(x4, y4);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0333i)) {
                return false;
            }
            C0333i c0333i = (C0333i) other;
            return Float.compare(this.x, c0333i.x) == 0 && Float.compare(this.y, c0333i.y) == 0;
        }

        public final float g() {
            return this.x;
        }

        public final float h() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            return androidx.compose.animation.b.a(sb, this.y, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b(\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b)\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$j;", "Landroidx/compose/ui/graphics/vector/i;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "c", "()F", "d", "e", "f", "()Z", "g", "h", "i", "j", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/i$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "n", "p", "o", "Z", "q", "r", "l", "m", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class j extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float horizontalEllipseRadius;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float verticalEllipseRadius;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float theta;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isMoreThanHalf;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean isPositiveArc;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final float arcStartDx;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final float arcStartDy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartDx = r9
                r3.arcStartDy = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.j.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static j k(j jVar, float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f10, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = jVar.horizontalEllipseRadius;
            }
            if ((i4 & 2) != 0) {
                f5 = jVar.verticalEllipseRadius;
            }
            float f11 = f5;
            if ((i4 & 4) != 0) {
                f6 = jVar.theta;
            }
            float f12 = f6;
            if ((i4 & 8) != 0) {
                z4 = jVar.isMoreThanHalf;
            }
            boolean z6 = z4;
            if ((i4 & 16) != 0) {
                z5 = jVar.isPositiveArc;
            }
            boolean z7 = z5;
            if ((i4 & 32) != 0) {
                f7 = jVar.arcStartDx;
            }
            float f13 = f7;
            if ((i4 & 64) != 0) {
                f10 = jVar.arcStartDy;
            }
            jVar.getClass();
            return new j(f4, f11, f12, z6, z7, f13, f10);
        }

        /* renamed from: c, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        /* renamed from: d, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* renamed from: e, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return Float.compare(this.horizontalEllipseRadius, jVar.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, jVar.verticalEllipseRadius) == 0 && Float.compare(this.theta, jVar.theta) == 0 && this.isMoreThanHalf == jVar.isMoreThanHalf && this.isPositiveArc == jVar.isPositiveArc && Float.compare(this.arcStartDx, jVar.arcStartDx) == 0 && Float.compare(this.arcStartDy, jVar.arcStartDy) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* renamed from: h, reason: from getter */
        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public int hashCode() {
            return Float.hashCode(this.arcStartDy) + l0.a(this.arcStartDx, d1.a(this.isPositiveArc, d1.a(this.isMoreThanHalf, l0.a(this.theta, l0.a(this.verticalEllipseRadius, Float.hashCode(this.horizontalEllipseRadius) * 31, 31), 31), 31), 31), 31);
        }

        /* renamed from: i, reason: from getter */
        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        @fg.l
        public final j j(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartDx, float arcStartDy) {
            return new j(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartDx, arcStartDy);
        }

        public final float l() {
            return this.arcStartDx;
        }

        public final float m() {
            return this.arcStartDy;
        }

        public final float n() {
            return this.horizontalEllipseRadius;
        }

        public final float o() {
            return this.theta;
        }

        public final float p() {
            return this.verticalEllipseRadius;
        }

        public final boolean q() {
            return this.isMoreThanHalf;
        }

        public final boolean r() {
            return this.isPositiveArc;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.horizontalEllipseRadius);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.verticalEllipseRadius);
            sb.append(", theta=");
            sb.append(this.theta);
            sb.append(", isMoreThanHalf=");
            sb.append(this.isMoreThanHalf);
            sb.append(", isPositiveArc=");
            sb.append(this.isPositiveArc);
            sb.append(", arcStartDx=");
            sb.append(this.arcStartDx);
            sb.append(", arcStartDy=");
            return androidx.compose.animation.b.a(sb, this.arcStartDy, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b!\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b#\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b%\u0010\f¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$k;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "c", "()F", "d", "e", "f", "g", "h", "i", "(FFFFFF)Landroidx/compose/ui/graphics/vector/i$k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "k", "n", "l", "o", "m", "p", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class k extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float dy1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float dx2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float dy2;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final float dx3;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final float dy3;

        public k(float f4, float f5, float f6, float f7, float f10, float f11) {
            super(true, false, 2, null);
            this.dx1 = f4;
            this.dy1 = f5;
            this.dx2 = f6;
            this.dy2 = f7;
            this.dx3 = f10;
            this.dy3 = f11;
        }

        public static k j(k kVar, float f4, float f5, float f6, float f7, float f10, float f11, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = kVar.dx1;
            }
            if ((i4 & 2) != 0) {
                f5 = kVar.dy1;
            }
            float f12 = f5;
            if ((i4 & 4) != 0) {
                f6 = kVar.dx2;
            }
            float f13 = f6;
            if ((i4 & 8) != 0) {
                f7 = kVar.dy2;
            }
            float f14 = f7;
            if ((i4 & 16) != 0) {
                f10 = kVar.dx3;
            }
            float f15 = f10;
            if ((i4 & 32) != 0) {
                f11 = kVar.dy3;
            }
            kVar.getClass();
            return new k(f4, f12, f13, f14, f15, f11);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* renamed from: d, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: e, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return Float.compare(this.dx1, kVar.dx1) == 0 && Float.compare(this.dy1, kVar.dy1) == 0 && Float.compare(this.dx2, kVar.dx2) == 0 && Float.compare(this.dy2, kVar.dy2) == 0 && Float.compare(this.dx3, kVar.dx3) == 0 && Float.compare(this.dy3, kVar.dy3) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* renamed from: g, reason: from getter */
        public final float getDx3() {
            return this.dx3;
        }

        /* renamed from: h, reason: from getter */
        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return Float.hashCode(this.dy3) + l0.a(this.dx3, l0.a(this.dy2, l0.a(this.dx2, l0.a(this.dy1, Float.hashCode(this.dx1) * 31, 31), 31), 31), 31);
        }

        @fg.l
        public final k i(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
            return new k(dx1, dy1, dx2, dy2, dx3, dy3);
        }

        public final float k() {
            return this.dx1;
        }

        public final float l() {
            return this.dx2;
        }

        public final float m() {
            return this.dx3;
        }

        public final float n() {
            return this.dy1;
        }

        public final float o() {
            return this.dy2;
        }

        public final float p() {
            return this.dy3;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.dx1);
            sb.append(", dy1=");
            sb.append(this.dy1);
            sb.append(", dx2=");
            sb.append(this.dx2);
            sb.append(", dy2=");
            sb.append(this.dy2);
            sb.append(", dx3=");
            sb.append(this.dx3);
            sb.append(", dy3=");
            return androidx.compose.animation.b.a(sb, this.dy3, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$l;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx", "<init>", "(F)V", "c", "()F", "d", "(F)Landroidx/compose/ui/graphics/vector/i$l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class l extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public l(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.l.<init>(float):void");
        }

        public static l e(l lVar, float f4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = lVar.dx;
            }
            lVar.getClass();
            return new l(f4);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        @fg.l
        public final l d(float dx) {
            return new l(dx);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && Float.compare(this.dx, ((l) other).dx) == 0;
        }

        public final float f() {
            return this.dx;
        }

        public int hashCode() {
            return Float.hashCode(this.dx);
        }

        @fg.l
        public String toString() {
            return androidx.compose.animation.b.a(new StringBuilder("RelativeHorizontalTo(dx="), this.dx, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$m;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx", "dy", "<init>", "(FF)V", "c", "()F", "d", "e", "(FF)Landroidx/compose/ui/graphics/vector/i$m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class m extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public m(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.m.<init>(float, float):void");
        }

        public static m f(m mVar, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = mVar.dx;
            }
            if ((i4 & 2) != 0) {
                f5 = mVar.dy;
            }
            mVar.getClass();
            return new m(f4, f5);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* renamed from: d, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @fg.l
        public final m e(float dx, float dy) {
            return new m(dx, dy);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return Float.compare(this.dx, mVar.dx) == 0 && Float.compare(this.dy, mVar.dy) == 0;
        }

        public final float g() {
            return this.dx;
        }

        public final float h() {
            return this.dy;
        }

        public int hashCode() {
            return Float.hashCode(this.dy) + (Float.hashCode(this.dx) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.dx);
            sb.append(", dy=");
            return androidx.compose.animation.b.a(sb, this.dy, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$n;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx", "dy", "<init>", "(FF)V", "c", "()F", "d", "e", "(FF)Landroidx/compose/ui/graphics/vector/i$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class n extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public n(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.n.<init>(float, float):void");
        }

        public static n f(n nVar, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = nVar.dx;
            }
            if ((i4 & 2) != 0) {
                f5 = nVar.dy;
            }
            nVar.getClass();
            return new n(f4, f5);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* renamed from: d, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @fg.l
        public final n e(float dx, float dy) {
            return new n(dx, dy);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof n)) {
                return false;
            }
            n nVar = (n) other;
            return Float.compare(this.dx, nVar.dx) == 0 && Float.compare(this.dy, nVar.dy) == 0;
        }

        public final float g() {
            return this.dx;
        }

        public final float h() {
            return this.dy;
        }

        public int hashCode() {
            return Float.hashCode(this.dy) + (Float.hashCode(this.dx) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.dx);
            sb.append(", dy=");
            return androidx.compose.animation.b.a(sb, this.dy, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/i$o;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "c", "()F", "d", "e", "f", "g", "(FFFF)Landroidx/compose/ui/graphics/vector/i$o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "i", "k", "j", "l", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class o extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float dy1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float dx2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float dy2;

        public o(float f4, float f5, float f6, float f7) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f4;
            this.dy1 = f5;
            this.dx2 = f6;
            this.dy2 = f7;
        }

        public static o h(o oVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = oVar.dx1;
            }
            if ((i4 & 2) != 0) {
                f5 = oVar.dy1;
            }
            if ((i4 & 4) != 0) {
                f6 = oVar.dx2;
            }
            if ((i4 & 8) != 0) {
                f7 = oVar.dy2;
            }
            oVar.getClass();
            return new o(f4, f5, f6, f7);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* renamed from: d, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: e, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof o)) {
                return false;
            }
            o oVar = (o) other;
            return Float.compare(this.dx1, oVar.dx1) == 0 && Float.compare(this.dy1, oVar.dy1) == 0 && Float.compare(this.dx2, oVar.dx2) == 0 && Float.compare(this.dy2, oVar.dy2) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        @fg.l
        public final o g(float dx1, float dy1, float dx2, float dy2) {
            return new o(dx1, dy1, dx2, dy2);
        }

        public int hashCode() {
            return Float.hashCode(this.dy2) + l0.a(this.dx2, l0.a(this.dy1, Float.hashCode(this.dx1) * 31, 31), 31);
        }

        public final float i() {
            return this.dx1;
        }

        public final float j() {
            return this.dx2;
        }

        public final float k() {
            return this.dy1;
        }

        public final float l() {
            return this.dy2;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.dx1);
            sb.append(", dy1=");
            sb.append(this.dy1);
            sb.append(", dx2=");
            sb.append(this.dx2);
            sb.append(", dy2=");
            return androidx.compose.animation.b.a(sb, this.dy2, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/i$p;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "c", "()F", "d", "e", "f", "g", "(FFFF)Landroidx/compose/ui/graphics/vector/i$p;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "i", "k", "j", "l", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class p extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float dy1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float dx2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float dy2;

        public p(float f4, float f5, float f6, float f7) {
            super(true, false, 2, null);
            this.dx1 = f4;
            this.dy1 = f5;
            this.dx2 = f6;
            this.dy2 = f7;
        }

        public static p h(p pVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = pVar.dx1;
            }
            if ((i4 & 2) != 0) {
                f5 = pVar.dy1;
            }
            if ((i4 & 4) != 0) {
                f6 = pVar.dx2;
            }
            if ((i4 & 8) != 0) {
                f7 = pVar.dy2;
            }
            pVar.getClass();
            return new p(f4, f5, f6, f7);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* renamed from: d, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: e, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return Float.compare(this.dx1, pVar.dx1) == 0 && Float.compare(this.dy1, pVar.dy1) == 0 && Float.compare(this.dx2, pVar.dx2) == 0 && Float.compare(this.dy2, pVar.dy2) == 0;
        }

        /* renamed from: f, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        @fg.l
        public final p g(float dx1, float dy1, float dx2, float dy2) {
            return new p(dx1, dy1, dx2, dy2);
        }

        public int hashCode() {
            return Float.hashCode(this.dy2) + l0.a(this.dx2, l0.a(this.dy1, Float.hashCode(this.dx1) * 31, 31), 31);
        }

        public final float i() {
            return this.dx1;
        }

        public final float j() {
            return this.dx2;
        }

        public final float k() {
            return this.dy1;
        }

        public final float l() {
            return this.dy2;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.dx1);
            sb.append(", dy1=");
            sb.append(this.dy1);
            sb.append(", dx2=");
            sb.append(this.dx2);
            sb.append(", dy2=");
            return androidx.compose.animation.b.a(sb, this.dy2, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$q;", "Landroidx/compose/ui/graphics/vector/i;", "", "dx", "dy", "<init>", "(FF)V", "c", "()F", "d", "e", "(FF)Landroidx/compose/ui/graphics/vector/i$q;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "g", "h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class q extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dx;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float dy;

        public q(float f4, float f5) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f4;
            this.dy = f5;
        }

        public static q f(q qVar, float f4, float f5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = qVar.dx;
            }
            if ((i4 & 2) != 0) {
                f5 = qVar.dy;
            }
            qVar.getClass();
            return new q(f4, f5);
        }

        /* renamed from: c, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* renamed from: d, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @fg.l
        public final q e(float dx, float dy) {
            return new q(dx, dy);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return Float.compare(this.dx, qVar.dx) == 0 && Float.compare(this.dy, qVar.dy) == 0;
        }

        public final float g() {
            return this.dx;
        }

        public final float h() {
            return this.dy;
        }

        public int hashCode() {
            return Float.hashCode(this.dy) + (Float.hashCode(this.dx) * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.dx);
            sb.append(", dy=");
            return androidx.compose.animation.b.a(sb, this.dy, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$r;", "Landroidx/compose/ui/graphics/vector/i;", "", "dy", "<init>", "(F)V", "c", "()F", "d", "(F)Landroidx/compose/ui/graphics/vector/i$r;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class r extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public r(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dy = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.r.<init>(float):void");
        }

        public static r e(r rVar, float f4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = rVar.dy;
            }
            rVar.getClass();
            return new r(f4);
        }

        /* renamed from: c, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @fg.l
        public final r d(float dy) {
            return new r(dy);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && Float.compare(this.dy, ((r) other).dy) == 0;
        }

        public final float f() {
            return this.dy;
        }

        public int hashCode() {
            return Float.hashCode(this.dy);
        }

        @fg.l
        public String toString() {
            return androidx.compose.animation.b.a(new StringBuilder("RelativeVerticalTo(dy="), this.dy, ')');
        }
    }

    /* compiled from: PathNode.kt */
    @m1
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/i$s;", "Landroidx/compose/ui/graphics/vector/i;", "", "y", "<init>", "(F)V", "c", "()F", "d", "(F)Landroidx/compose/ui/graphics/vector/i$s;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class s extends i {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public s(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.y = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.i.s.<init>(float):void");
        }

        public static s e(s sVar, float f4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f4 = sVar.y;
            }
            sVar.getClass();
            return new s(f4);
        }

        /* renamed from: c, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @fg.l
        public final s d(float y4) {
            return new s(y4);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && Float.compare(this.y, ((s) other).y) == 0;
        }

        public final float f() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y);
        }

        @fg.l
        public String toString() {
            return androidx.compose.animation.b.a(new StringBuilder("VerticalTo(y="), this.y, ')');
        }
    }

    public /* synthetic */ i(boolean z4, boolean z5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? false : z5);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsCurve() {
        return this.isCurve;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsQuad() {
        return this.isQuad;
    }

    public /* synthetic */ i(boolean z4, boolean z5, kotlin.jvm.internal.w wVar) {
        this(z4, z5);
    }

    private i(boolean z4, boolean z5) {
        this.isCurve = z4;
        this.isQuad = z5;
    }
}
