package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\"\u0010$\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\t\u0010\"\"\u0004\b \u0010#¨\u0006%"}, d2 = {"Landroidx/compose/material3/t7;", "Landroidx/compose/material3/ob;", "Landroidx/compose/material3/pb;", "state", "Lkotlin/Function0;", "", "canScroll", "<init>", "(Landroidx/compose/material3/pb;Lld/a;)V", "a", "Landroidx/compose/material3/pb;", "getState", "()Landroidx/compose/material3/pb;", "b", "Lld/a;", "e", "()Lld/a;", "c", "Z", "()Z", "isPinned", "Landroidx/compose/animation/core/k;", "", "d", "Landroidx/compose/animation/core/k;", "()Landroidx/compose/animation/core/k;", "snapAnimationSpec", "Landroidx/compose/animation/core/z;", "Landroidx/compose/animation/core/z;", "()Landroidx/compose/animation/core/z;", "flingAnimationSpec", "Landroidx/compose/ui/input/nestedscroll/a;", "f", "Landroidx/compose/ui/input/nestedscroll/a;", "()Landroidx/compose/ui/input/nestedscroll/a;", "(Landroidx/compose/ui/input/nestedscroll/a;)V", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class t7 implements ob {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final pb state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> canScroll;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.animation.core.k<Float> snapAnimationSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.animation.core.z<Float> flingAnimationSpec;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.input.nestedscroll.a nestedScrollConnection;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14625b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"androidx/compose/material3/t7$b", "Landroidx/compose/ui/input/nestedscroll/a;", "Li0/f;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "H2", "(JJI)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.ui.input.nestedscroll.a {
        b() {
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long H2(long consumed, long available, int source) {
            if (!t7.this.e().invoke().booleanValue()) {
                i0.f.INSTANCE.getClass();
                return i0.f.f74147c;
            }
            if (i0.f.r(consumed) != 0.0f || i0.f.r(available) <= 0.0f) {
                pb state = t7.this.getState();
                state.g(i0.f.r(consumed) + state.c());
            } else {
                t7.this.getState().g(0.0f);
            }
            i0.f.INSTANCE.getClass();
            return i0.f.f74147c;
        }
    }

    public t7(@fg.l pb pbVar, @fg.l ld.a<Boolean> aVar) {
        this.state = pbVar;
        this.canScroll = aVar;
        this.isPinned = true;
        this.nestedScrollConnection = new b();
    }

    @Override // androidx.compose.material3.ob
    @fg.l
    /* renamed from: a, reason: from getter */
    public androidx.compose.ui.input.nestedscroll.a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.ob
    /* renamed from: b, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // androidx.compose.material3.ob
    @fg.m
    public androidx.compose.animation.core.z<Float> c() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.ob
    @fg.m
    public androidx.compose.animation.core.k<Float> d() {
        return this.snapAnimationSpec;
    }

    @fg.l
    public final ld.a<Boolean> e() {
        return this.canScroll;
    }

    public void f(@fg.l androidx.compose.ui.input.nestedscroll.a aVar) {
        this.nestedScrollConnection = aVar;
    }

    @Override // androidx.compose.material3.ob
    @fg.l
    public pb getState() {
        return this.state;
    }

    public /* synthetic */ t7(pb pbVar, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(pbVar, (i4 & 2) != 0 ? a.f14625b : aVar);
    }
}
