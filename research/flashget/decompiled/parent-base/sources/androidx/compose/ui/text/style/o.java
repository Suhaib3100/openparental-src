package androidx.compose.ui.text.style;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: TextGeometricTransform.kt */
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/style/o;", "", "", "scaleX", "skewX", "<init>", "(FF)V", "b", "(FF)Landroidx/compose/ui/text/style/o;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "d", "()F", "e", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21383d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float scaleX;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float skewX;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final o f21384e = new o(1.0f, 0.0f);

    /* compiled from: TextGeometricTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/o$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/o;", "None", "Landroidx/compose/ui/text/style/o;", "a", "()Landroidx/compose/ui/text/style/o;", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.o$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final o a() {
            return o.f21384e;
        }

        public Companion(w wVar) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.style.o.<init>():void");
    }

    public static o c(o oVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = oVar.scaleX;
        }
        if ((i4 & 2) != 0) {
            f5 = oVar.skewX;
        }
        oVar.getClass();
        return new o(f4, f5);
    }

    @fg.l
    public final o b(float scaleX, float skewX) {
        return new o(scaleX, skewX);
    }

    /* renamed from: d, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: e, reason: from getter */
    public final float getSkewX() {
        return this.skewX;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return this.scaleX == oVar.scaleX && this.skewX == oVar.skewX;
    }

    public int hashCode() {
        return Float.hashCode(this.skewX) + (Float.hashCode(this.scaleX) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.scaleX);
        sb.append(", skewX=");
        return androidx.compose.animation.b.a(sb, this.skewX, ')');
    }

    public o(float f4, float f5) {
        this.scaleX = f4;
        this.skewX = f5;
    }

    public /* synthetic */ o(float f4, float f5, int i4, w wVar) {
        this((i4 & 1) != 0 ? 1.0f : f4, (i4 & 2) != 0 ? 0.0f : f5);
    }
}
