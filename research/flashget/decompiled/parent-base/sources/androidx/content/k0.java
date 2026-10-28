package androidx.content;

import androidx.annotation.d0;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: NavGraphBuilder.kt */
@h0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fJ%\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u0010*\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$¨\u0006&"}, d2 = {"Landroidx/navigation/k0;", "Landroidx/navigation/g0;", "Landroidx/navigation/j0;", "Landroidx/navigation/d1;", "provider", "", "id", "startDestination", "<init>", "(Landroidx/navigation/d1;II)V", "", "route", "(Landroidx/navigation/d1;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/navigation/f0;", "D", "navDestination", "Lkotlin/k2;", "m", "(Landroidx/navigation/g0;)V", "o", "(Landroidx/navigation/f0;)V", "destination", "k", "l", "()Landroidx/navigation/j0;", "h", "Landroidx/navigation/d1;", "n", "()Landroidx/navigation/d1;", "i", "I", "startDestinationId", "j", "Ljava/lang/String;", "startDestinationRoute", "", "Ljava/util/List;", "destinations", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class k0 extends g0<j0> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final d1 provider;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @d0
    private int startDestinationId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private String startDestinationRoute;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<f0> destinations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your NavGraph instead", replaceWith = @x0(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public k0(@l d1 provider, @d0 int i4, @d0 int i5) {
        super(provider.e(n0.class), i4);
        l0.p(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i5;
    }

    public final void k(@l f0 destination) {
        l0.p(destination, "destination");
        this.destinations.add(destination);
    }

    @Override // androidx.content.g0
    @l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public j0 c() {
        j0 j0Var = (j0) super.c();
        j0Var.d0(this.destinations);
        int i4 = this.startDestinationId;
        if (i4 == 0 && this.startDestinationRoute == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            l0.m(str);
            j0Var.s0(str);
        } else {
            j0Var.r0(i4);
        }
        return j0Var;
    }

    public final <D extends f0> void m(@l g0<? extends D> navDestination) {
        l0.p(navDestination, "navDestination");
        this.destinations.add(navDestination.c());
    }

    @l
    /* renamed from: n, reason: from getter */
    public final d1 getProvider() {
        return this.provider;
    }

    public final void o(@l f0 f0Var) {
        l0.p(f0Var, "<this>");
        k(f0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@l d1 provider, @l String startDestination, @m String str) {
        super(provider.e(n0.class), str);
        l0.p(provider, "provider");
        l0.p(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }
}
