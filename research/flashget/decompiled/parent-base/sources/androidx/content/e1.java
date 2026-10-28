package androidx.content;

import fg.l;
import fg.m;
import kd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.d;

/* compiled from: NavigatorProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\n\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000e\u001a$\u0010\u0010\u001a\u00020\u000f*\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/navigation/c1;", "Landroidx/navigation/f0;", "T", "Landroidx/navigation/d1;", "", "name", "a", "(Landroidx/navigation/d1;Ljava/lang/String;)Landroidx/navigation/c1;", "Lkotlin/reflect/d;", "clazz", "b", "(Landroidx/navigation/d1;Lkotlin/reflect/d;)Landroidx/navigation/c1;", "navigator", "d", "(Landroidx/navigation/d1;Ljava/lang/String;Landroidx/navigation/c1;)Landroidx/navigation/c1;", "Lkotlin/k2;", "c", "(Landroidx/navigation/d1;Landroidx/navigation/c1;)V", "navigation-common_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e1 {
    @l
    public static final <T extends c1<? extends f0>> T a(@l d1 d1Var, @l String name) {
        l0.p(d1Var, "<this>");
        l0.p(name, "name");
        return (T) d1Var.f(name);
    }

    @l
    public static final <T extends c1<? extends f0>> T b(@l d1 d1Var, @l d<T> clazz) {
        l0.p(d1Var, "<this>");
        l0.p(clazz, "clazz");
        return (T) d1Var.e(b.e(clazz));
    }

    public static final void c(@l d1 d1Var, @l c1<? extends f0> navigator) {
        l0.p(d1Var, "<this>");
        l0.p(navigator, "navigator");
        d1Var.b(navigator);
    }

    @m
    public static final c1<? extends f0> d(@l d1 d1Var, @l String name, @l c1<? extends f0> navigator) {
        l0.p(d1Var, "<this>");
        l0.p(name, "name");
        l0.p(navigator, "navigator");
        return d1Var.c(name, navigator);
    }
}
