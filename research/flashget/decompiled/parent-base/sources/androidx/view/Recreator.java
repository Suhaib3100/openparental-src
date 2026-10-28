package androidx.view;

import android.os.Bundle;
import android.support.v4.media.d;
import androidx.constraintlayout.core.motion.key.c;
import androidx.view.AbstractC1450w;
import androidx.view.C1459c;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import fg.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Recreator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\t\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/b0;", "Landroidx/savedstate/e;", "owner", "<init>", "(Landroidx/savedstate/e;)V", "", "className", "Lkotlin/k2;", "a", "(Ljava/lang/String;)V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "b", "Landroidx/savedstate/e;", "c", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recreator implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final InterfaceC1461e owner;

    /* renamed from: d, reason: collision with root package name */
    @l
    public static final String f34003d = "classes_to_restore";

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final String f34004e = "androidx.savedstate.Restarter";

    /* compiled from: Recreator.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/c$c;", "Landroidx/savedstate/c;", "registry", "<init>", "(Landroidx/savedstate/c;)V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "", "className", "Lkotlin/k2;", "b", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C1459c.InterfaceC0615c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Set<String> classes;

        public b(@l C1459c registry) {
            l0.p(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.j("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.view.C1459c.InterfaceC0615c
        @l
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.classes));
            return bundle;
        }

        public final void b(@l String className) {
            l0.p(className, "className");
            this.classes.add(className);
        }
    }

    public Recreator(@l InterfaceC1461e owner) {
        l0.p(owner, "owner");
        this.owner = owner;
    }

    private final void a(String className) {
        try {
            Class<? extends U> asSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(C1459c.a.class);
            l0.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    l0.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C1459c.a) newInstance).a(this.owner);
                } catch (Exception e4) {
                    throw new RuntimeException(c.a("Failed to instantiate ", className), e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(d.a("Class ", className, " wasn't found"), e6);
        }
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
        l0.p(source, "source");
        l0.p(event, "event");
        if (event != AbstractC1450w.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().d(this);
        Bundle b5 = this.owner.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b5 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b5.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
