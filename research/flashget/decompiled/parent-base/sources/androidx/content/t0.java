package androidx.content;

import androidx.annotation.b;
import androidx.annotation.d0;
import fg.l;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: NavOptions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u001dB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b \u0010\u0013R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b#\u0010\u0013R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b$\u0010'¨\u0006("}, d2 = {"Landroidx/navigation/t0;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "e", "()I", "i", "()Z", "k", "h", "j", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "a", "Z", "b", "c", "I", "f", "d", "g", "<set-?>", "Ljava/lang/String;", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleTop;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean restoreState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d0
    private final int popUpToId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToInclusive;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToSaveState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int enterAnim;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int exitAnim;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int popEnterAnim;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int popExitAnim;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private String popUpToRoute;

    /* compiled from: NavOptions.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!¨\u0006)"}, d2 = {"Landroidx/navigation/t0$a;", "", "<init>", "()V", "", "singleTop", "d", "(Z)Landroidx/navigation/t0$a;", "restoreState", "m", "", "destinationId", "inclusive", "saveState", "h", "(IZZ)Landroidx/navigation/t0$a;", "", "route", "j", "(Ljava/lang/String;ZZ)Landroidx/navigation/t0$a;", "enterAnim", "b", "(I)Landroidx/navigation/t0$a;", "exitAnim", "c", "popEnterAnim", "e", "popExitAnim", "f", "Landroidx/navigation/t0;", "a", "()Landroidx/navigation/t0;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "popUpToInclusive", "popUpToSaveState", "g", "i", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean singleTop;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean restoreState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @m
        private String popUpToRoute;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToInclusive;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToSaveState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d0
        private int popUpToId = -1;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.a
        @b
        private int enterAnim = -1;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.a
        @b
        private int exitAnim = -1;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.a
        @b
        private int popEnterAnim = -1;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @androidx.annotation.a
        @b
        private int popExitAnim = -1;

        public static /* synthetic */ a k(a aVar, int i4, boolean z4, boolean z5, int i5, Object obj) {
            if ((i5 & 4) != 0) {
                z5 = false;
            }
            return aVar.h(i4, z4, z5);
        }

        public static /* synthetic */ a l(a aVar, String str, boolean z4, boolean z5, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                z5 = false;
            }
            return aVar.j(str, z4, z5);
        }

        @l
        public final t0 a() {
            String str = this.popUpToRoute;
            return str != null ? new t0(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim) : new t0(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        @l
        public final a b(@androidx.annotation.a @b int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        @l
        public final a c(@androidx.annotation.a @b int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        @l
        public final a d(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        @l
        public final a e(@androidx.annotation.a @b int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        @l
        public final a f(@androidx.annotation.a @b int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        @l
        @j
        public final a g(@d0 int i4, boolean z4) {
            return k(this, i4, z4, false, 4, null);
        }

        @l
        @j
        public final a h(@d0 int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @l
        @j
        public final a i(@m String str, boolean z4) {
            return l(this, str, z4, false, 4, null);
        }

        @l
        @j
        public final a j(@m String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        @l
        public final a m(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }
    }

    public t0(boolean z4, boolean z5, @d0 int i4, boolean z6, boolean z7, @androidx.annotation.a @b int i5, @androidx.annotation.a @b int i6, @androidx.annotation.a @b int i7, @androidx.annotation.a @b int i10) {
        this.singleTop = z4;
        this.restoreState = z5;
        this.popUpToId = i4;
        this.popUpToInclusive = z6;
        this.popUpToSaveState = z7;
        this.enterAnim = i5;
        this.exitAnim = i6;
        this.popEnterAnim = i7;
        this.popExitAnim = i10;
    }

    @androidx.annotation.a
    @b
    /* renamed from: a, reason: from getter */
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    @androidx.annotation.a
    @b
    /* renamed from: b, reason: from getter */
    public final int getExitAnim() {
        return this.exitAnim;
    }

    @androidx.annotation.a
    @b
    /* renamed from: c, reason: from getter */
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    @androidx.annotation.a
    @b
    /* renamed from: d, reason: from getter */
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @d0
    @k(message = "Use popUpToId instead.", replaceWith = @x0(expression = "popUpToId", imports = {}))
    /* renamed from: e, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !l0.g(t0.class, other.getClass())) {
            return false;
        }
        t0 t0Var = (t0) other;
        return this.singleTop == t0Var.singleTop && this.restoreState == t0Var.restoreState && this.popUpToId == t0Var.popUpToId && l0.g(this.popUpToRoute, t0Var.popUpToRoute) && this.popUpToInclusive == t0Var.popUpToInclusive && this.popUpToSaveState == t0Var.popUpToSaveState && this.enterAnim == t0Var.enterAnim && this.exitAnim == t0Var.exitAnim && this.popEnterAnim == t0Var.popEnterAnim && this.popExitAnim == t0Var.popExitAnim;
    }

    @d0
    public final int f() {
        return this.popUpToId;
    }

    @m
    /* renamed from: g, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public int hashCode() {
        int i4 = (((((this.singleTop ? 1 : 0) * 31) + (this.restoreState ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        return ((((((((((((i4 + (str == null ? 0 : str.hashCode())) * 31) + (this.popUpToInclusive ? 1 : 0)) * 31) + (this.popUpToSaveState ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public t0(boolean z4, boolean z5, @m String str, boolean z6, boolean z7, int i4, int i5, int i6, int i7) {
        this(z4, z5, f0.INSTANCE.a(str).hashCode(), z6, z7, i4, i5, i6, i7);
        this.popUpToRoute = str;
    }
}
