package androidx.content;

import androidx.collection.c;
import androidx.view.h1;
import androidx.view.k1;
import androidx.view.n1;
import fg.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavControllerViewModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/navigation/w;", "Landroidx/lifecycle/h1;", "Landroidx/navigation/y0;", "<init>", "()V", "", "backStackEntryId", "Lkotlin/k2;", "c", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/n1;", "a", "(Ljava/lang/String;)Landroidx/lifecycle/n1;", "toString", "()Ljava/lang/String;", "", "Ljava/util/Map;", "viewModelStores", "b", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w extends h1 implements y0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final k1.b f31371c = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, n1> viewModelStores = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/navigation/w$a", "Landroidx/lifecycle/k1$b;", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements k1.b {
        a() {
        }

        @Override // androidx.lifecycle.k1.b
        @l
        public <T extends h1> T create(@l Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            return new w();
        }
    }

    /* compiled from: NavControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/navigation/w$b;", "", "<init>", "()V", "Landroidx/lifecycle/n1;", "viewModelStore", "Landroidx/navigation/w;", "a", "(Landroidx/lifecycle/n1;)Landroidx/navigation/w;", "Landroidx/lifecycle/k1$b;", "FACTORY", "Landroidx/lifecycle/k1$b;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.w$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final w a(@l n1 viewModelStore) {
            l0.p(viewModelStore, "viewModelStore");
            h1 a5 = new k1(viewModelStore, w.f31371c).a(w.class);
            l0.o(a5, "get(VM::class.java)");
            return (w) a5;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @l
    @n
    public static final w d(@l n1 n1Var) {
        return INSTANCE.a(n1Var);
    }

    @Override // androidx.content.y0
    @l
    public n1 a(@l String backStackEntryId) {
        l0.p(backStackEntryId, "backStackEntryId");
        n1 n1Var = this.viewModelStores.get(backStackEntryId);
        if (n1Var != null) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        this.viewModelStores.put(backStackEntryId, n1Var2);
        return n1Var2;
    }

    public final void c(@l String backStackEntryId) {
        l0.p(backStackEntryId, "backStackEntryId");
        n1 remove = this.viewModelStores.remove(backStackEntryId);
        if (remove == null) {
            return;
        }
        remove.a();
    }

    @Override // androidx.view.h1
    protected void onCleared() {
        Iterator<n1> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.viewModelStores.clear();
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return c.a(sb, ')', "sb.toString()");
    }
}
