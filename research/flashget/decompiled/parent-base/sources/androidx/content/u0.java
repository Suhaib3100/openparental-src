package androidx.content;

import androidx.annotation.d0;
import androidx.content.t0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k;
import kotlin.k2;
import kotlin.text.v;

/* compiled from: NavOptionsBuilder.kt */
@w0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\u00020\b2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R*\u0010-\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u00104\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0016\u00106\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001cR*\u00108\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048F@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010\u0003\u001a\u0004\b'\u0010*\"\u0004\b7\u0010,¨\u00069"}, d2 = {"Landroidx/navigation/u0;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/h1;", "Lkotlin/k2;", "Lkotlin/u;", "popUpToBuilder", "i", "(ILld/l;)V", "", "route", "j", "(Ljava/lang/String;Lld/l;)V", "Landroidx/navigation/h;", "animBuilder", "a", "(Lld/l;)V", "Landroidx/navigation/t0;", "b", "()Landroidx/navigation/t0;", "Landroidx/navigation/t0$a;", "Landroidx/navigation/t0$a;", "builder", "", "Z", "c", "()Z", "m", "(Z)V", "launchSingleTop", "<set-?>", "h", "q", "restoreState", "value", "d", "I", "f", "()I", "o", "(I)V", "popUpToId", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "popUpToRoute", "inclusive", "saveState", "n", "popUpTo", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean launchSingleTop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean restoreState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private String popUpToRoute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean inclusive;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean saveState;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final t0.a builder = new t0.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d0
    private int popUpToId = -1;

    /* compiled from: NavOptionsBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/h1;", "Lkotlin/k2;", "a", "(Landroidx/navigation/h1;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends n0 implements ld.l<h1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f31317b = new a(1);

        a() {
            super(1);
        }

        public final void a(@l h1 h1Var) {
            l0.p(h1Var, "$this$null");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var) {
            a(h1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: NavOptionsBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/h1;", "Lkotlin/k2;", "a", "(Landroidx/navigation/h1;)V"}, k = 3, mv = {1, 6, 0})
    static final class b extends n0 implements ld.l<h1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f31318b = new b(1);

        b() {
            super(1);
        }

        public final void a(@l h1 h1Var) {
            l0.p(h1Var, "$this$null");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var) {
            a(h1Var);
            return k2.f75408a;
        }
    }

    @k(message = "Use the popUpToId property.")
    public static /* synthetic */ void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(u0 u0Var, int i4, ld.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = a.f31317b;
        }
        u0Var.i(i4, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(u0 u0Var, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = b.f31318b;
        }
        u0Var.j(str, lVar);
    }

    private final void p(String str) {
        if (str != null) {
            if (v.S1(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void a(@l ld.l<? super h, k2> animBuilder) {
        l0.p(animBuilder, "animBuilder");
        h hVar = new h();
        animBuilder.invoke(hVar);
        this.builder.b(hVar.getEnter()).c(hVar.getExit()).e(hVar.getPopEnter()).f(hVar.getPopExit());
    }

    @l
    public final t0 b() {
        t0.a aVar = this.builder;
        aVar.d(this.launchSingleTop);
        aVar.m(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            aVar.j(str, this.inclusive, this.saveState);
        } else {
            aVar.h(this.popUpToId, this.inclusive, this.saveState);
        }
        return aVar.a();
    }

    /* renamed from: c, reason: from getter */
    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    /* renamed from: d, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final int f() {
        return this.popUpToId;
    }

    @m
    /* renamed from: g, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void i(@d0 int id2, @l ld.l<? super h1, k2> popUpToBuilder) {
        l0.p(popUpToBuilder, "popUpToBuilder");
        o(id2);
        p(null);
        h1 h1Var = new h1();
        popUpToBuilder.invoke(h1Var);
        this.inclusive = h1Var.getInclusive();
        this.saveState = h1Var.getSaveState();
    }

    public final void j(@l String route, @l ld.l<? super h1, k2> popUpToBuilder) {
        l0.p(route, "route");
        l0.p(popUpToBuilder, "popUpToBuilder");
        p(route);
        o(-1);
        h1 h1Var = new h1();
        popUpToBuilder.invoke(h1Var);
        this.inclusive = h1Var.getInclusive();
        this.saveState = h1Var.getSaveState();
    }

    public final void m(boolean z4) {
        this.launchSingleTop = z4;
    }

    @k(message = "Use the popUpTo function and passing in the id.")
    public final void n(int i4) {
        k(this, i4, null, 2, null);
    }

    public final void o(int i4) {
        this.popUpToId = i4;
        this.inclusive = false;
    }

    public final void q(boolean z4) {
        this.restoreState = z4;
    }
}
