package android.view;

import android.os.Bundle;
import android.view.C0536c;
import android.view.a0;
import android.view.t;
import android.view.w;
import androidx.constraintlayout.motion.widget.g;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import d5.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Recreator.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/w;", "", "className", "Lkotlin/m2;", "g", "Landroidx/lifecycle/a0;", "source", "Landroidx/lifecycle/t$b;", "event", "h", "Landroidx/savedstate/e;", "o", "Landroidx/savedstate/e;", "owner", "<init>", "(Landroidx/savedstate/e;)V", "p", "a", "b", "savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class Recreator implements w {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final InterfaceC0538e owner;

    /* renamed from: q, reason: collision with root package name */
    @d
    public static final String f9621q = "classes_to_restore";

    /* renamed from: r, reason: collision with root package name */
    @d
    public static final String f9622r = "androidx.savedstate.Restarter";

    /* compiled from: Recreator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/c$c;", "Landroid/os/Bundle;", "a", "", "className", "Lkotlin/m2;", "b", "", "Ljava/util/Set;", "classes", "Landroidx/savedstate/c;", "registry", "<init>", "(Landroidx/savedstate/c;)V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements C0536c.InterfaceC0117c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final Set<String> classes;

        public b(@d C0536c registry) {
            l0.p(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.j("androidx.savedstate.Restarter", this);
        }

        @Override // android.view.C0536c.InterfaceC0117c
        @d
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.classes));
            return bundle;
        }

        public final void b(@d String className) {
            l0.p(className, "className");
            this.classes.add(className);
        }
    }

    public Recreator(@d InterfaceC0538e owner) {
        l0.p(owner, "owner");
        this.owner = owner;
    }

    private final void g(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0536c.a.class);
            l0.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    l0.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C0536c.a) newInstance).a(this.owner);
                } catch (Exception e6) {
                    throw new RuntimeException(g.a("Failed to instantiate ", str), e6);
                }
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(e.a("Class ", str, " wasn't found"), e8);
        }
    }

    @Override // android.view.w
    public void h(@d a0 source, @d t.b event) {
        l0.p(source, "source");
        l0.p(event, "event");
        if (event != t.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        Bundle b6 = this.owner.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b6 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b6.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
    }
}
