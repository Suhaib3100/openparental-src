package androidx.compose.ui.draw;

import androidx.compose.runtime.m1;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.r5;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: Blur.kt */
@kd.g
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/draw/c;", "", "Landroidx/compose/ui/graphics/e6;", "shape", "d", "(Landroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/graphics/e6;", "", "i", "(Landroidx/compose/ui/graphics/e6;)Ljava/lang/String;", "", "h", "(Landroidx/compose/ui/graphics/e6;)I", "other", "", "e", "(Landroidx/compose/ui/graphics/e6;Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/graphics/e6;", "g", "()Landroidx/compose/ui/graphics/e6;", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final e6 f17433c = r5.a();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final e6 f17434d = null;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final e6 shape;

    /* compiled from: Blur.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/draw/c;", "Rectangle", "Landroidx/compose/ui/graphics/e6;", "a", "()Landroidx/compose/ui/graphics/e6;", "Unbounded", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.draw.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final e6 a() {
            return c.f17433c;
        }

        @fg.l
        public final e6 b() {
            return c.f17434d;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ c(e6 e6Var) {
        this.shape = e6Var;
    }

    public static final /* synthetic */ c c(e6 e6Var) {
        return new c(e6Var);
    }

    @fg.l
    public static e6 d(@fg.m e6 e6Var) {
        return e6Var;
    }

    public static boolean e(e6 e6Var, Object obj) {
        return (obj instanceof c) && l0.g(e6Var, ((c) obj).shape);
    }

    public static final boolean f(e6 e6Var, e6 e6Var2) {
        return l0.g(e6Var, e6Var2);
    }

    public static int h(e6 e6Var) {
        if (e6Var == null) {
            return 0;
        }
        return e6Var.hashCode();
    }

    public static String i(e6 e6Var) {
        return "BlurredEdgeTreatment(shape=" + e6Var + ')';
    }

    public boolean equals(Object obj) {
        return e(this.shape, obj);
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final e6 getShape() {
        return this.shape;
    }

    public int hashCode() {
        return h(this.shape);
    }

    public final /* synthetic */ e6 j() {
        return this.shape;
    }

    public String toString() {
        return i(this.shape);
    }
}
