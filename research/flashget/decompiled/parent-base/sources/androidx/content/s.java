package androidx.content;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.view.AbstractC1413a;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.C1460d;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1449v;
import androidx.view.InterfaceC1461e;
import androidx.view.g0;
import androidx.view.h1;
import androidx.view.k1;
import androidx.view.n1;
import androidx.view.o1;
import androidx.view.y0;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import ld.a;

/* compiled from: NavBackStackEntry.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\\46BS\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0000\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\tH\u0007¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010AR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010=R\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0016\u0010N\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010MR\u001b\u0010R\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010P\u001a\u0004\b?\u0010QR\u001b\u0010V\u001a\u00020S8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bG\u0010UR*\u0010Z\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010@\u001a\u0004\bE\u0010X\"\u0004\bT\u0010Y¨\u0006]"}, d2 = {"Landroidx/navigation/s;", "Landroidx/lifecycle/e0;", "Landroidx/lifecycle/o1;", "Landroidx/lifecycle/v;", "Landroidx/savedstate/e;", "Landroid/content/Context;", "context", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/w$b;", "hostLifecycleState", "Landroidx/navigation/y0;", "viewModelStoreProvider", "", "id", "savedState", "<init>", "(Landroid/content/Context;Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/lifecycle/w$b;Landroidx/navigation/y0;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "(Landroidx/navigation/s;Landroid/os/Bundle;)V", "Landroidx/lifecycle/w;", "getLifecycle", "()Landroidx/lifecycle/w;", "Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "j", "(Landroidx/lifecycle/w$a;)V", "n", "()V", "Landroidx/lifecycle/n1;", "getViewModelStore", "()Landroidx/lifecycle/n1;", "Landroidx/lifecycle/k1$b;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/k1$b;", "Landroidx/savedstate/c;", "getSavedStateRegistry", "()Landroidx/savedstate/c;", "outBundle", "k", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroid/content/Context;", "c", "Landroidx/navigation/f0;", "f", "()Landroidx/navigation/f0;", "l", "(Landroidx/navigation/f0;)V", "d", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "e", "Landroidx/lifecycle/w$b;", "Landroidx/navigation/y0;", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "h", "Landroidx/lifecycle/g0;", "i", "Landroidx/lifecycle/g0;", "lifecycle", "Landroidx/savedstate/d;", "Landroidx/savedstate/d;", "savedStateRegistryController", "Z", "savedStateRegistryRestored", "Landroidx/lifecycle/c1;", "Lkotlin/b0;", "()Landroidx/lifecycle/c1;", "defaultFactory", "Landroidx/lifecycle/y0;", "m", "()Landroidx/lifecycle/y0;", "savedStateHandle", "maxState", "()Landroidx/lifecycle/w$b;", "(Landroidx/lifecycle/w$b;)V", "maxLifecycle", "o", "a", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements InterfaceC1423e0, o1, InterfaceC1449v, InterfaceC1461e {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private f0 destination;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final Bundle arguments;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private AbstractC1450w.b hostLifecycleState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final y0 viewModelStoreProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final String id;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private final Bundle savedState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private g0 lifecycle;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private final C1460d savedStateRegistryController;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean savedStateRegistryRestored;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 defaultFactory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 savedStateHandle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    private AbstractC1450w.b maxLifecycle;

    /* compiled from: NavBackStackEntry.kt */
    @c1({c1.a.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/navigation/s$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/w$b;", "hostLifecycleState", "Landroidx/navigation/y0;", "viewModelStoreProvider", "", "id", "savedState", "Landroidx/navigation/s;", "a", "(Landroid/content/Context;Landroidx/navigation/f0;Landroid/os/Bundle;Landroidx/lifecycle/w$b;Landroidx/navigation/y0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/s;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.s$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ s b(Companion companion, Context context, f0 f0Var, Bundle bundle, AbstractC1450w.b bVar, y0 y0Var, String str, Bundle bundle2, int i4, Object obj) {
            String str2;
            Bundle bundle3 = (i4 & 4) != 0 ? null : bundle;
            AbstractC1450w.b bVar2 = (i4 & 8) != 0 ? AbstractC1450w.b.CREATED : bVar;
            y0 y0Var2 = (i4 & 16) != 0 ? null : y0Var;
            if ((i4 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                l0.o(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return companion.a(context, f0Var, bundle3, bVar2, y0Var2, str2, (i4 & 64) != 0 ? null : bundle2);
        }

        @l
        @c1({c1.a.LIBRARY_GROUP})
        public final s a(@m Context context, @l f0 destination, @m Bundle arguments, @l AbstractC1450w.b hostLifecycleState, @m y0 viewModelStoreProvider, @l String id2, @m Bundle savedState) {
            l0.p(destination, "destination");
            l0.p(hostLifecycleState, "hostLifecycleState");
            l0.p(id2, "id");
            return new s(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id2, savedState, null);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/navigation/s$b;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Landroidx/savedstate/e;Landroid/os/Bundle;)V", "Landroidx/lifecycle/h1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/y0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/y0;)Landroidx/lifecycle/h1;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class b extends AbstractC1413a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l InterfaceC1461e owner, @m Bundle bundle) {
            super(owner, bundle);
            l0.p(owner, "owner");
        }

        @Override // androidx.view.AbstractC1413a
        @l
        protected <T extends h1> T e(@l String key, @l Class<T> modelClass, @l y0 handle) {
            l0.p(key, "key");
            l0.p(modelClass, "modelClass");
            l0.p(handle, "handle");
            return new c(handle);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/navigation/s$c;", "Landroidx/lifecycle/h1;", "Landroidx/lifecycle/y0;", "handle", "<init>", "(Landroidx/lifecycle/y0;)V", "a", "Landroidx/lifecycle/y0;", "b", "()Landroidx/lifecycle/y0;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class c extends h1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final y0 handle;

        public c(@l y0 handle) {
            l0.p(handle, "handle");
            this.handle = handle;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final y0 getHandle() {
            return this.handle;
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/c1;", "a", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {1, 6, 0})
    static final class d extends n0 implements a<androidx.view.c1> {
        d() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.view.c1 invoke() {
            Context context = s.this.context;
            Context applicationContext = context == null ? null : context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            s sVar = s.this;
            return new androidx.view.c1(application, sVar, sVar.getArguments());
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/y0;", "a", "()Landroidx/lifecycle/y0;"}, k = 3, mv = {1, 6, 0})
    static final class e extends n0 implements a<y0> {
        e() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y0 invoke() {
            if (!s.this.savedStateRegistryRestored) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (s.this.lifecycle.getState() != AbstractC1450w.b.DESTROYED) {
                return ((c) new k1(s.this, new b(s.this, null)).a(c.class)).getHandle();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public /* synthetic */ s(Context context, f0 f0Var, Bundle bundle, AbstractC1450w.b bVar, y0 y0Var, String str, Bundle bundle2, w wVar) {
        this(context, f0Var, bundle, bVar, y0Var, str, bundle2);
    }

    private final androidx.view.c1 e() {
        return (androidx.view.c1) this.defaultFactory.getValue();
    }

    @m
    /* renamed from: d, reason: from getter */
    public final Bundle getArguments() {
        return this.arguments;
    }

    public boolean equals(@m Object other) {
        Set<String> keySet;
        if (other == null || !(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        if (!l0.g(this.id, sVar.id) || !l0.g(this.destination, sVar.destination) || !l0.g(this.lifecycle, sVar.lifecycle) || !l0.g(getSavedStateRegistry(), sVar.getSavedStateRegistry())) {
            return false;
        }
        if (!l0.g(this.arguments, sVar.arguments)) {
            Bundle bundle = this.arguments;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj = this.arguments.get(str);
                    Bundle bundle2 = sVar.arguments;
                    if (!l0.g(obj, bundle2 == null ? null : bundle2.get(str))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final f0 getDestination() {
        return this.destination;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // androidx.view.InterfaceC1449v
    @l
    public k1.b getDefaultViewModelProviderFactory() {
        return e();
    }

    @Override // androidx.view.InterfaceC1423e0
    @l
    public AbstractC1450w getLifecycle() {
        return this.lifecycle;
    }

    @Override // androidx.view.InterfaceC1461e
    @l
    public C1459c getSavedStateRegistry() {
        C1459c savedStateRegistry = this.savedStateRegistryController.getSavedStateRegistry();
        l0.o(savedStateRegistry, "savedStateRegistryController.savedStateRegistry");
        return savedStateRegistry;
    }

    @Override // androidx.view.o1
    @l
    public n1 getViewModelStore() {
        if (!this.savedStateRegistryRestored) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.lifecycle.getState() == AbstractC1450w.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        y0 y0Var = this.viewModelStoreProvider;
        if (y0Var != null) {
            return y0Var.a(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @l
    @c1({c1.a.LIBRARY_GROUP})
    /* renamed from: h, reason: from getter */
    public final AbstractC1450w.b getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = this.destination.hashCode() + (this.id.hashCode() * 31);
        Bundle bundle = this.arguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i4 = hashCode * 31;
                Object obj = this.arguments.get((String) it.next());
                hashCode = i4 + (obj == null ? 0 : obj.hashCode());
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.lifecycle.hashCode() + (hashCode * 31)) * 31);
    }

    @l
    public final y0 i() {
        return (y0) this.savedStateHandle.getValue();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void j(@l AbstractC1450w.a event) {
        l0.p(event, "event");
        AbstractC1450w.b targetState = event.getTargetState();
        l0.o(targetState, "event.targetState");
        this.hostLifecycleState = targetState;
        n();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void k(@l Bundle outBundle) {
        l0.p(outBundle, "outBundle");
        this.savedStateRegistryController.e(outBundle);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void l(@l f0 f0Var) {
        l0.p(f0Var, "<set-?>");
        this.destination = f0Var;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void m(@l AbstractC1450w.b maxState) {
        l0.p(maxState, "maxState");
        this.maxLifecycle = maxState;
        n();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void n() {
        if (!this.savedStateRegistryRestored) {
            this.savedStateRegistryController.d(this.savedState);
            this.savedStateRegistryRestored = true;
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this.lifecycle.s(this.hostLifecycleState);
        } else {
            this.lifecycle.s(this.maxLifecycle);
        }
    }

    private s(Context context, f0 f0Var, Bundle bundle, AbstractC1450w.b bVar, y0 y0Var, String str, Bundle bundle2) {
        this.context = context;
        this.destination = f0Var;
        this.arguments = bundle;
        this.hostLifecycleState = bVar;
        this.viewModelStoreProvider = y0Var;
        this.id = str;
        this.savedState = bundle2;
        this.lifecycle = new g0(this);
        C1460d a5 = C1460d.a(this);
        l0.o(a5, "create(this)");
        this.savedStateRegistryController = a5;
        this.defaultFactory = c0.c(new d());
        this.savedStateHandle = c0.c(new e());
        this.maxLifecycle = AbstractC1450w.b.INITIALIZED;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ s(android.content.Context r11, androidx.content.f0 r12, android.os.Bundle r13, androidx.view.AbstractC1450w.b r14, androidx.content.y0 r15, java.lang.String r16, android.os.Bundle r17, int r18, kotlin.jvm.internal.w r19) {
        /*
            r10 = this;
            r0 = r18 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r13
        L8:
            r0 = r18 & 8
            if (r0 == 0) goto L10
            androidx.lifecycle.w$b r0 = androidx.view.AbstractC1450w.b.CREATED
            r6 = r0
            goto L11
        L10:
            r6 = r14
        L11:
            r0 = r18 & 16
            if (r0 == 0) goto L17
            r7 = r1
            goto L18
        L17:
            r7 = r15
        L18:
            r0 = r18 & 32
            if (r0 == 0) goto L2b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.l0.o(r0, r2)
            r8 = r0
            goto L2d
        L2b:
            r8 = r16
        L2d:
            r0 = r18 & 64
            if (r0 == 0) goto L33
            r9 = r1
            goto L35
        L33:
            r9 = r17
        L35:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.s.<init>(android.content.Context, androidx.navigation.f0, android.os.Bundle, androidx.lifecycle.w$b, androidx.navigation.y0, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.w):void");
    }

    public /* synthetic */ s(s sVar, Bundle bundle, int i4, w wVar) {
        this(sVar, (i4 & 2) != 0 ? sVar.arguments : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @c1({c1.a.LIBRARY_GROUP})
    public s(@l s entry, @m Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        l0.p(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        m(entry.maxLifecycle);
    }
}
