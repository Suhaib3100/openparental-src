package androidx.content;

import androidx.annotation.d0;
import androidx.content.f0;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.k2;
import kotlin.x0;

/* compiled from: NavDestinationBuilder.kt */
@h0
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rJ.\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\u00020\u00112\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00062\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u000205048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00106R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u000209088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010:R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020<048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00106¨\u0006>"}, d2 = {"Landroidx/navigation/g0;", "Landroidx/navigation/f0;", "D", "", "Landroidx/navigation/c1;", "navigator", "", "id", "", "route", "<init>", "(Landroidx/navigation/c1;ILjava/lang/String;)V", "(Landroidx/navigation/c1;I)V", "(Landroidx/navigation/c1;Ljava/lang/String;)V", "name", "Lkotlin/Function1;", "Landroidx/navigation/r;", "Lkotlin/k2;", "Lkotlin/u;", "argumentBuilder", "b", "(Ljava/lang/String;Lld/l;)V", "uriPattern", "d", "(Ljava/lang/String;)V", "Landroidx/navigation/b0;", "navDeepLink", "e", "(Lld/l;)V", "actionId", "Landroidx/navigation/m;", "actionBuilder", "a", "(ILld/l;)V", "c", "()Landroidx/navigation/f0;", "Landroidx/navigation/c1;", "h", "()Landroidx/navigation/c1;", "I", "f", "()I", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "", "Ljava/lang/CharSequence;", "g", "()Ljava/lang/CharSequence;", "j", "(Ljava/lang/CharSequence;)V", "label", "", "Landroidx/navigation/q;", "Ljava/util/Map;", "arguments", "", "Landroidx/navigation/y;", "Ljava/util/List;", "deepLinks", "Landroidx/navigation/l;", "actions", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class g0<D extends f0> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final c1<? extends D> navigator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final String route;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private CharSequence label;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, q> arguments;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private List<y> deepLinks;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<Integer, l> actions;

    public g0(@l c1<? extends D> navigator, @d0 int i4, @m String str) {
        l0.p(navigator, "navigator");
        this.navigator = navigator;
        this.id = i4;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    @k(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void a(int actionId, @l ld.l<? super m, k2> actionBuilder) {
        l0.p(actionBuilder, "actionBuilder");
        Map<Integer, l> map = this.actions;
        Integer valueOf = Integer.valueOf(actionId);
        m mVar = new m();
        actionBuilder.invoke(mVar);
        map.put(valueOf, mVar.a());
    }

    public final void b(@l String name, @l ld.l<? super r, k2> argumentBuilder) {
        l0.p(name, "name");
        l0.p(argumentBuilder, "argumentBuilder");
        Map<String, q> map = this.arguments;
        r rVar = new r();
        argumentBuilder.invoke(rVar);
        map.put(name, rVar.a());
    }

    @l
    public D c() {
        D a5 = this.navigator.a();
        String str = this.route;
        if (str != null) {
            a5.X(str);
        }
        int i4 = this.id;
        if (i4 != -1) {
            a5.U(i4);
        }
        a5.V(this.label);
        for (Map.Entry<String, q> entry : this.arguments.entrySet()) {
            a5.c(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            a5.f((y) it.next());
        }
        for (Map.Entry<Integer, l> entry2 : this.actions.entrySet()) {
            a5.R(entry2.getKey().intValue(), entry2.getValue());
        }
        return a5;
    }

    public final void d(@l String uriPattern) {
        l0.p(uriPattern, "uriPattern");
        this.deepLinks.add(new y(uriPattern));
    }

    public final void e(@l ld.l<? super b0, k2> navDeepLink) {
        l0.p(navDeepLink, "navDeepLink");
        List<y> list = this.deepLinks;
        b0 b0Var = new b0();
        navDeepLink.invoke(b0Var);
        list.add(b0Var.a());
    }

    /* renamed from: f, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @m
    /* renamed from: g, reason: from getter */
    public final CharSequence getLabel() {
        return this.label;
    }

    @l
    protected final c1<? extends D> h() {
        return this.navigator;
    }

    @m
    /* renamed from: i, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final void j(@m CharSequence charSequence) {
        this.label = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your NavDestination instead", replaceWith = @x0(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public g0(@l c1<? extends D> navigator, @d0 int i4) {
        this(navigator, i4, null);
        l0.p(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(@l c1<? extends D> navigator, @m String str) {
        this(navigator, -1, str);
        l0.p(navigator, "navigator");
    }
}
