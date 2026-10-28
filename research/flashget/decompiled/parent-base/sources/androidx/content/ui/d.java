package androidx.content.ui;

import android.annotation.SuppressLint;
import android.view.Menu;
import androidx.content.j0;
import androidx.customview.widget.c;
import androidx.drawerlayout.widget.DrawerLayout;
import fg.l;
import fg.m;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;

/* compiled from: AppBarConfiguration.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB+\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/navigation/ui/d;", "", "", "", "topLevelDestinations", "Landroidx/customview/widget/c;", "openableLayout", "Landroidx/navigation/ui/d$b;", "fallbackOnNavigateUpListener", "<init>", "(Ljava/util/Set;Landroidx/customview/widget/c;Landroidx/navigation/ui/d$b;)V", "a", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "b", "Landroidx/customview/widget/c;", "c", "()Landroidx/customview/widget/c;", "Landroidx/navigation/ui/d$b;", "()Landroidx/navigation/ui/d$b;", "Landroidx/drawerlayout/widget/DrawerLayout;", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Set<Integer> topLevelDestinations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final c openableLayout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final b fallbackOnNavigateUpListener;

    /* compiled from: AppBarConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/ui/d$b;", "", "", "a", "()Z", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b {
        boolean a();
    }

    public /* synthetic */ d(Set set, c cVar, b bVar, w wVar) {
        this(set, cVar, bVar);
    }

    @m
    @k(message = "Use {@link #getOpenableLayout()}.")
    public final DrawerLayout a() {
        c cVar = this.openableLayout;
        if (cVar instanceof DrawerLayout) {
            return (DrawerLayout) cVar;
        }
        return null;
    }

    @m
    /* renamed from: b, reason: from getter */
    public final b getFallbackOnNavigateUpListener() {
        return this.fallbackOnNavigateUpListener;
    }

    @m
    /* renamed from: c, reason: from getter */
    public final c getOpenableLayout() {
        return this.openableLayout;
    }

    @l
    public final Set<Integer> d() {
        return this.topLevelDestinations;
    }

    private d(Set<Integer> set, c cVar, b bVar) {
        this.topLevelDestinations = set;
        this.openableLayout = cVar;
        this.fallbackOnNavigateUpListener = bVar;
    }

    /* compiled from: AppBarConfiguration.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0015\b\u0016\u0012\n\u0010\u000b\u001a\u00020\t\"\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0004\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"¨\u0006#"}, d2 = {"Landroidx/navigation/ui/d$a;", "", "Landroidx/navigation/j0;", "navGraph", "<init>", "(Landroidx/navigation/j0;)V", "Landroid/view/Menu;", "topLevelMenu", "(Landroid/view/Menu;)V", "", "", "topLevelDestinationIds", "([I)V", "", "(Ljava/util/Set;)V", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "b", "(Landroidx/drawerlayout/widget/DrawerLayout;)Landroidx/navigation/ui/d$a;", "Landroidx/customview/widget/c;", "openableLayout", "d", "(Landroidx/customview/widget/c;)Landroidx/navigation/ui/d$a;", "Landroidx/navigation/ui/d$b;", "fallbackOnNavigateUpListener", "c", "(Landroidx/navigation/ui/d$b;)Landroidx/navigation/ui/d$a;", "Landroidx/navigation/ui/d;", "a", "()Landroidx/navigation/ui/d;", "", "Ljava/util/Set;", "topLevelDestinations", "Landroidx/customview/widget/c;", "Landroidx/navigation/ui/d$b;", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Set<Integer> topLevelDestinations;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private c openableLayout;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private b fallbackOnNavigateUpListener;

        public a(@l j0 navGraph) {
            l0.p(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.add(Integer.valueOf(j0.INSTANCE.a(navGraph).getId()));
        }

        @l
        @SuppressLint({"SyntheticAccessor"})
        public final d a() {
            return new d(this.topLevelDestinations, this.openableLayout, this.fallbackOnNavigateUpListener, null);
        }

        @l
        @k(message = "Use {@link #setOpenableLayout(Openable)}.")
        public final a b(@m DrawerLayout drawerLayout) {
            this.openableLayout = drawerLayout;
            return this;
        }

        @l
        public final a c(@m b fallbackOnNavigateUpListener) {
            this.fallbackOnNavigateUpListener = fallbackOnNavigateUpListener;
            return this;
        }

        @l
        public final a d(@m c openableLayout) {
            this.openableLayout = openableLayout;
            return this;
        }

        public a(@l Menu topLevelMenu) {
            l0.p(topLevelMenu, "topLevelMenu");
            this.topLevelDestinations = new HashSet();
            int size = topLevelMenu.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                this.topLevelDestinations.add(Integer.valueOf(topLevelMenu.getItem(i4).getItemId()));
                i4 = i5;
            }
        }

        public a(@l int... topLevelDestinationIds) {
            l0.p(topLevelDestinationIds, "topLevelDestinationIds");
            this.topLevelDestinations = new HashSet();
            int length = topLevelDestinationIds.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = topLevelDestinationIds[i4];
                i4++;
                this.topLevelDestinations.add(Integer.valueOf(i5));
            }
        }

        public a(@l Set<Integer> topLevelDestinationIds) {
            l0.p(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }
    }
}
