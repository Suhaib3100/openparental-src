package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.h5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: DrawScope.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/n;", "Landroidx/compose/ui/graphics/drawscope/i;", "", "width", "miter", "Landroidx/compose/ui/graphics/i6;", "cap", "Landroidx/compose/ui/graphics/j6;", "join", "Landroidx/compose/ui/graphics/h5;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/h5;Lkotlin/jvm/internal/w;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "g", "()F", "b", "e", "c", "I", "d", "Landroidx/compose/ui/graphics/h5;", "f", "()Landroidx/compose/ui/graphics/h5;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    public static final float f17799g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public static final float f17800h = 4.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final int f17801i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f17802j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float miter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int cap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int join;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final h5 pathEffect;

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/n$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/i6;", "DefaultCap", "I", "a", "()I", "Landroidx/compose/ui/graphics/j6;", "DefaultJoin", "b", "", "DefaultMiter", "F", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.drawscope.n$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return n.f17801i;
        }

        public final int b() {
            return n.f17802j;
        }

        public Companion(w wVar) {
        }
    }

    static {
        i6.INSTANCE.getClass();
        f17801i = i6.f17861c;
        j6.INSTANCE.getClass();
        f17802j = j6.f17869c;
    }

    public /* synthetic */ n(float f4, float f5, int i4, int i5, h5 h5Var, w wVar) {
        this(f4, f5, i4, i5, h5Var);
    }

    /* renamed from: c, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* renamed from: d, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* renamed from: e, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return this.width == nVar.width && this.miter == nVar.miter && i6.g(this.cap, nVar.cap) && j6.g(this.join, nVar.join) && l0.g(this.pathEffect, nVar.pathEffect);
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final h5 getPathEffect() {
        return this.pathEffect;
    }

    /* renamed from: g, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int h4 = (j6.h(this.join) + ((i6.h(this.cap) + androidx.compose.animation.l0.a(this.miter, Float.hashCode(this.width) * 31, 31)) * 31)) * 31;
        h5 h5Var = this.pathEffect;
        return h4 + (h5Var != null ? h5Var.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) i6.i(this.cap)) + ", join=" + ((Object) j6.i(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ n(float f4, float f5, int i4, int i5, h5 h5Var, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0.0f : f4, (i6 & 2) != 0 ? 4.0f : f5, (i6 & 4) != 0 ? f17801i : i4, (i6 & 8) != 0 ? f17802j : i5, (i6 & 16) != 0 ? null : h5Var);
    }

    private n(float f4, float f5, int i4, int i5, h5 h5Var) {
        super(null);
        this.width = f4;
        this.miter = f5;
        this.cap = i4;
        this.join = i5;
        this.pathEffect = h5Var;
    }
}
