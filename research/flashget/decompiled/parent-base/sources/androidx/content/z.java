package androidx.content;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.appcompat.view.g;
import androidx.content.c1;
import androidx.content.j0;
import androidx.core.app.x0;
import androidx.navigation.j0.b;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: NavDeepLinkBuilder.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00025*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00002\u0010\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b*\u0010%J#\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020&2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Landroidx/navigation/z;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/u;", "navController", "(Landroidx/navigation/u;)V", "", "destId", "Landroidx/navigation/f0;", "j", "(I)Landroidx/navigation/f0;", "Lkotlin/k2;", "v", "()V", "i", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "m", "(Ljava/lang/Class;)Landroidx/navigation/z;", "Landroid/content/ComponentName;", "componentName", "l", "(Landroid/content/ComponentName;)Landroidx/navigation/z;", "navGraphId", "t", "(I)Landroidx/navigation/z;", "Landroidx/navigation/j0;", "navGraph", "u", "(Landroidx/navigation/j0;)Landroidx/navigation/z;", "Landroid/os/Bundle;", "args", "o", "(ILandroid/os/Bundle;)Landroidx/navigation/z;", "", "destRoute", "q", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/z;", "b", "route", "d", "k", "(Landroid/os/Bundle;)Landroidx/navigation/z;", "Landroidx/core/app/x0;", "h", "()Landroidx/core/app/x0;", "Landroid/app/PendingIntent;", "g", "()Landroid/app/PendingIntent;", "a", "Landroid/content/Context;", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "c", "Landroidx/navigation/j0;", "graph", "", "Landroidx/navigation/z$a;", "Ljava/util/List;", "destinations", "e", "Landroid/os/Bundle;", "globalArgs", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Intent intent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private j0 graph;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<a> destinations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private Bundle globalArgs;

    /* compiled from: NavDeepLinkBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/navigation/z$a;", "", "", "destinationId", "Landroid/os/Bundle;", "arguments", "<init>", "(ILandroid/os/Bundle;)V", "a", "I", "b", "()I", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int destinationId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final Bundle arguments;

        public a(int i4, @m Bundle bundle) {
            this.destinationId = i4;
            this.arguments = bundle;
        }

        @m
        /* renamed from: a, reason: from getter */
        public final Bundle getArguments() {
            return this.arguments;
        }

        /* renamed from: b, reason: from getter */
        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    /* compiled from: NavDeepLinkBuilder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/navigation/z$b;", "Landroidx/navigation/d1;", "<init>", "()V", "Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "T", "", "name", "f", "(Ljava/lang/String;)Landroidx/navigation/c1;", "d", "Landroidx/navigation/c1;", "mDestNavigator", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class b extends d1 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final c1<f0> mDestNavigator = new a();

        /* compiled from: NavDeepLinkBuilder.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/navigation/z$b$a", "Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "a", "()Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "d", "(Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)Landroidx/navigation/f0;", "", "k", "()Z", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a extends c1<f0> {
            a() {
            }

            @Override // androidx.content.c1
            @l
            public f0 a() {
                return new f0("permissive");
            }

            @Override // androidx.content.c1
            @m
            public f0 d(@l f0 destination, @m Bundle args, @m t0 navOptions, @m c1.a navigatorExtras) {
                l0.p(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.content.c1
            public boolean k() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            b(new n0(this));
        }

        @Override // androidx.content.d1
        @l
        public <T extends c1<? extends f0>> T f(@l String name) {
            l0.p(name, "name");
            try {
                return (T) super.f(name);
            } catch (IllegalStateException unused) {
                return this.mDestNavigator;
            }
        }
    }

    public z(@l Context context) {
        Intent launchIntentForPackage;
        l0.p(context, "context");
        this.context = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    public static /* synthetic */ z e(z zVar, int i4, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return zVar.b(i4, bundle);
    }

    public static /* synthetic */ z f(z zVar, String str, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        return zVar.d(str, bundle);
    }

    private final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        f0 f0Var = null;
        for (a aVar : this.destinations) {
            int destinationId = aVar.getDestinationId();
            Bundle arguments = aVar.getArguments();
            f0 j4 = j(destinationId);
            if (j4 == null) {
                StringBuilder a5 = g.a("Navigation destination ", f0.INSTANCE.b(this.context, destinationId), " cannot be found in the navigation graph ");
                a5.append(this.graph);
                throw new IllegalArgumentException(a5.toString());
            }
            int[] l4 = j4.l(f0Var);
            int length = l4.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = l4[i4];
                i4++;
                arrayList.add(Integer.valueOf(i5));
                arrayList2.add(arguments);
            }
            f0Var = j4;
        }
        this.intent.putExtra("android-support-nav:controller:deepLinkIds", w.U5(arrayList));
        this.intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final f0 j(@d0 int destId) {
        k kVar = new k();
        j0 j0Var = this.graph;
        l0.m(j0Var);
        kVar.addLast(j0Var);
        while (!kVar.isEmpty()) {
            f0 f0Var = (f0) kVar.removeFirst();
            if (f0Var.getId() == destId) {
                return f0Var;
            }
            if (f0Var instanceof j0) {
                j0.b bVar = ((j0) f0Var).new b();
                while (bVar.hasNext()) {
                    kVar.addLast(bVar.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ z r(z zVar, int i4, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        return zVar.o(i4, bundle);
    }

    public static /* synthetic */ z s(z zVar, String str, Bundle bundle, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bundle = null;
        }
        return zVar.q(str, bundle);
    }

    private final void v() {
        Iterator<a> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (j(destinationId) == null) {
                StringBuilder a5 = g.a("Navigation destination ", f0.INSTANCE.b(this.context, destinationId), " cannot be found in the navigation graph ");
                a5.append(this.graph);
                throw new IllegalArgumentException(a5.toString());
            }
        }
    }

    @l
    @j
    public final z a(@d0 int i4) {
        return e(this, i4, null, 2, null);
    }

    @l
    @j
    public final z b(@d0 int destId, @m Bundle args) {
        this.destinations.add(new a(destId, args));
        if (this.graph != null) {
            v();
        }
        return this;
    }

    @l
    @j
    public final z c(@l String route) {
        l0.p(route, "route");
        return f(this, route, null, 2, null);
    }

    @l
    @j
    public final z d(@l String route, @m Bundle args) {
        l0.p(route, "route");
        this.destinations.add(new a(f0.INSTANCE.a(route).hashCode(), args));
        if (this.graph != null) {
            v();
        }
        return this;
    }

    @l
    public final PendingIntent g() {
        int i4;
        Bundle bundle = this.globalArgs;
        if (bundle == null) {
            i4 = 0;
        } else {
            Iterator<String> it = bundle.keySet().iterator();
            i4 = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i4 = (i4 * 31) + (obj == null ? 0 : obj.hashCode());
            }
        }
        for (a aVar : this.destinations) {
            i4 = (i4 * 31) + aVar.getDestinationId();
            Bundle arguments = aVar.getArguments();
            if (arguments != null) {
                Iterator<String> it2 = arguments.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = arguments.get(it2.next());
                    i4 = (i4 * 31) + (obj2 == null ? 0 : obj2.hashCode());
                }
            }
        }
        PendingIntent v4 = h().v(i4, 201326592, null);
        l0.m(v4);
        l0.o(v4, "createTaskStackBuilder()…LAG_IMMUTABLE\n        )!!");
        return v4;
    }

    @l
    public final x0 h() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        i();
        x0 c5 = x0.j(this.context).c(new Intent(this.intent));
        l0.o(c5, "create(context)\n        …rentStack(Intent(intent))");
        int q4 = c5.q();
        int i4 = 0;
        while (i4 < q4) {
            int i5 = i4 + 1;
            Intent l4 = c5.l(i4);
            if (l4 != null) {
                l4.putExtra("android-support-nav:controller:deepLinkIntent", this.intent);
            }
            i4 = i5;
        }
        return c5;
    }

    @l
    public final z k(@m Bundle args) {
        this.globalArgs = args;
        this.intent.putExtra("android-support-nav:controller:deepLinkExtras", args);
        return this;
    }

    @l
    public final z l(@l ComponentName componentName) {
        l0.p(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    @l
    public final z m(@l Class<? extends Activity> activityClass) {
        l0.p(activityClass, "activityClass");
        return l(new ComponentName(this.context, activityClass));
    }

    @l
    @j
    public final z n(@d0 int i4) {
        return r(this, i4, null, 2, null);
    }

    @l
    @j
    public final z o(@d0 int destId, @m Bundle args) {
        this.destinations.clear();
        this.destinations.add(new a(destId, args));
        if (this.graph != null) {
            v();
        }
        return this;
    }

    @l
    @j
    public final z p(@l String destRoute) {
        l0.p(destRoute, "destRoute");
        return s(this, destRoute, null, 2, null);
    }

    @l
    @j
    public final z q(@l String destRoute, @m Bundle args) {
        l0.p(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new a(f0.INSTANCE.a(destRoute).hashCode(), args));
        if (this.graph != null) {
            v();
        }
        return this;
    }

    @l
    public final z t(@n0 int navGraphId) {
        return u(new s0(this.context, new b()).b(navGraphId));
    }

    @l
    public final z u(@l j0 navGraph) {
        l0.p(navGraph, "navGraph");
        this.graph = navGraph;
        v();
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(@l u navController) {
        this(navController.getContext());
        l0.p(navController, "navController");
        this.graph = navController.K();
    }
}
