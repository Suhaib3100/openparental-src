package androidx.content;

import android.annotation.SuppressLint;
import android.support.v4.media.d;
import androidx.annotation.c1;
import androidx.annotation.i;
import androidx.content.c1;
import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: NavigatorProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/navigation/d1;", "", "<init>", "()V", "Landroidx/navigation/c1;", "T", "Ljava/lang/Class;", "navigatorClass", "e", "(Ljava/lang/Class;)Landroidx/navigation/c1;", "", "name", "f", "(Ljava/lang/String;)Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "navigator", "b", "(Landroidx/navigation/c1;)Landroidx/navigation/c1;", "c", "(Ljava/lang/String;Landroidx/navigation/c1;)Landroidx/navigation/c1;", "", "a", "Ljava/util/Map;", "_navigators", "", "g", "()Ljava/util/Map;", "navigators", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes3.dex */
public class d1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final Map<Class<?>, String> f31045c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, c1<? extends f0>> _navigators = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/navigation/d1$a;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Landroidx/navigation/c1;", "navigatorClass", "a", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.d1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final String a(@l Class<? extends c1<?>> navigatorClass) {
            l0.p(navigatorClass, "navigatorClass");
            String str = (String) d1.f31045c.get(navigatorClass);
            if (str == null) {
                c1.b bVar = (c1.b) navigatorClass.getAnnotation(c1.b.class);
                str = bVar == null ? null : bVar.value();
                if (!b(str)) {
                    throw new IllegalArgumentException(l0.C("No @Navigator.Name annotation found for ", navigatorClass.getSimpleName()).toString());
                }
                d1.f31045c.put(navigatorClass, str);
            }
            l0.m(str);
            return str;
        }

        public final boolean b(@m String name) {
            return name != null && name.length() > 0;
        }

        public Companion(w wVar) {
        }
    }

    @l
    @n
    public static final String d(@l Class<? extends c1<?>> cls) {
        return INSTANCE.a(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final c1<? extends f0> b(@l c1<? extends f0> navigator) {
        l0.p(navigator, "navigator");
        return c(INSTANCE.a(navigator.getClass()), navigator);
    }

    @i
    @m
    public c1<? extends f0> c(@l String name, @l c1<? extends f0> navigator) {
        l0.p(name, "name");
        l0.p(navigator, "navigator");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        c1<? extends f0> c1Var = this._navigators.get(name);
        if (l0.g(c1Var, navigator)) {
            return navigator;
        }
        boolean z4 = false;
        if (c1Var != null && c1Var.getIsAttached()) {
            z4 = true;
        }
        if (z4) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + c1Var).toString());
        }
        if (!navigator.getIsAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @l
    public final <T extends c1<?>> T e(@l Class<T> navigatorClass) {
        l0.p(navigatorClass, "navigatorClass");
        return (T) f(INSTANCE.a(navigatorClass));
    }

    @l
    @i
    public <T extends c1<?>> T f(@l String name) {
        l0.p(name, "name");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        c1<? extends f0> c1Var = this._navigators.get(name);
        if (c1Var != null) {
            return c1Var;
        }
        throw new IllegalStateException(d.a("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }

    @l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final Map<String, c1<? extends f0>> g() {
        return z0.D0(this._navigators);
    }
}
