package androidx.window.sidecar;

import android.graphics.Rect;
import androidx.window.sidecar.q;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: HardwareFoldingFeature.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0015\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010#R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&R\u0014\u0010*\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010)¨\u0006+"}, d2 = {"Landroidx/window/layout/r;", "Landroidx/window/layout/q;", "Landroidx/window/core/b;", "featureBounds", "Landroidx/window/layout/r$b;", "type", "Landroidx/window/layout/q$c;", "state", "<init>", "(Landroidx/window/core/b;Landroidx/window/layout/r$b;Landroidx/window/layout/q$c;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/window/core/b;", "b", "Landroidx/window/layout/r$b;", "d", "()Landroidx/window/layout/r$b;", "c", "Landroidx/window/layout/q$c;", "getState", "()Landroidx/window/layout/q$c;", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "()Z", "isSeparating", "Landroidx/window/layout/q$a;", "()Landroidx/window/layout/q$a;", "occlusionType", "Landroidx/window/layout/q$b;", "()Landroidx/window/layout/q$b;", "orientation", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements q {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.window.core.b featureBounds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @l
    private final b type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @l
    private final q.c state;

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/r$a;", "", "<init>", "()V", "Landroidx/window/core/b;", "bounds", "Lkotlin/k2;", "a", "(Landroidx/window/core/b;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.layout.r$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final void a(@l androidx.window.core.b bounds) {
            l0.p(bounds, "bounds");
            if (bounds.f() == 0 && bounds.b() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/r$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        @l
        private static final b f35838c = new b("FOLD");

        /* renamed from: d, reason: collision with root package name */
        @l
        private static final b f35839d = new b("HINGE");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String description;

        /* compiled from: HardwareFoldingFeature.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/r$b$a;", "", "<init>", "()V", "Landroidx/window/layout/r$b;", "FOLD", "Landroidx/window/layout/r$b;", "a", "()Landroidx/window/layout/r$b;", "HINGE", "b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.window.layout.r$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @l
            public final b a() {
                return b.f35838c;
            }

            @l
            public final b b() {
                return b.f35839d;
            }

            public Companion(w wVar) {
            }
        }

        private b(String str) {
            this.description = str;
        }

        @l
        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    public r(@l androidx.window.core.b featureBounds, @l b type, @l q.c state) {
        l0.p(featureBounds, "featureBounds");
        l0.p(type, "type");
        l0.p(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        INSTANCE.a(featureBounds);
    }

    @Override // androidx.window.sidecar.q
    @l
    public q.b a() {
        return this.featureBounds.f() > this.featureBounds.b() ? q.b.f35827d : q.b.f35826c;
    }

    @Override // androidx.window.sidecar.q
    public boolean b() {
        b bVar = this.type;
        b.Companion companion = b.INSTANCE;
        companion.getClass();
        if (l0.g(bVar, b.f35839d)) {
            return true;
        }
        b bVar2 = this.type;
        companion.getClass();
        return l0.g(bVar2, b.f35838c) && l0.g(this.state, q.c.f35831d);
    }

    @Override // androidx.window.sidecar.q
    @l
    public q.a c() {
        return (this.featureBounds.f() == 0 || this.featureBounds.b() == 0) ? q.a.f35822c : q.a.f35823d;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final b getType() {
        return this.type;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!l0.g(r.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        r rVar = (r) other;
        return l0.g(this.featureBounds, rVar.featureBounds) && l0.g(this.type, rVar.type) && l0.g(this.state, rVar.state);
    }

    @Override // androidx.window.sidecar.l
    @l
    public Rect getBounds() {
        return this.featureBounds.i();
    }

    @Override // androidx.window.sidecar.q
    @l
    public q.c getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode() + ((this.type.hashCode() + (this.featureBounds.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return ((Object) r.class.getSimpleName()) + " { " + this.featureBounds + ", type=" + this.type + ", state=" + this.state + " }";
    }
}
