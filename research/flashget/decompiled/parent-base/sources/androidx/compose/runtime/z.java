package androidx.compose.runtime;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: CompositionContext.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH ¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H ¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H ¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010)\u001a\u00020(H ¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010$\u001a\u00020#H\u0010¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b.\u0010\rR\u0014\u00102\u001a\u00020/8 X \u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038 X \u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002038 X \u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0016\u0010<\u001a\u0004\u0018\u0001098PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8 X \u0004¢\u0006\u0006\u001a\u0004\bA\u0010?¨\u0006C"}, d2 = {"Landroidx/compose/runtime/z;", "", "<init>", "()V", "Landroidx/compose/runtime/n0;", "composition", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/runtime/n0;Lld/p;)V", "l", "(Landroidx/compose/runtime/n0;)V", "Landroidx/compose/runtime/f3;", "scope", "m", "(Landroidx/compose/runtime/f3;)V", "", "Landroidx/compose/runtime/tooling/a;", "table", "p", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/t;", "composer", "q", "(Landroidx/compose/runtime/t;)V", "u", "r", "v", "Landroidx/compose/runtime/t2;", "f", "()Landroidx/compose/runtime/t2;", "t", "c", "Landroidx/compose/runtime/f2;", "reference", "k", "(Landroidx/compose/runtime/f2;)V", "b", "Landroidx/compose/runtime/e2;", "data", "n", "(Landroidx/compose/runtime/f2;Landroidx/compose/runtime/e2;)V", "o", "(Landroidx/compose/runtime/f2;)Landroidx/compose/runtime/e2;", "s", "", "g", "()I", "compoundHashKey", "", "d", "()Z", "collectingParameterInformation", "e", "collectingSourceInformation", "Landroidx/compose/runtime/i0;", "i", "()Landroidx/compose/runtime/i0;", "observerHolder", "Lkotlin/coroutines/g;", "h", "()Lkotlin/coroutines/g;", "effectCoroutineContext", "j", "recomposeCoroutineContext", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17330a = 0;

    public abstract void a(@fg.l n0 composition, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> content);

    public abstract void b(@fg.l f2 reference);

    public void c() {
    }

    public abstract boolean d();

    public abstract boolean e();

    @fg.l
    public t2 f() {
        t2 t2Var;
        t2Var = a0.f15899a;
        return t2Var;
    }

    public abstract int g();

    @fg.l
    /* renamed from: h */
    public abstract kotlin.coroutines.g getEffectCoroutineContext();

    @fg.m
    public i0 i() {
        return null;
    }

    @fg.l
    public abstract kotlin.coroutines.g j();

    public abstract void k(@fg.l f2 reference);

    public abstract void l(@fg.l n0 composition);

    public abstract void m(@fg.l f3 scope);

    public abstract void n(@fg.l f2 reference, @fg.l e2 data);

    @fg.m
    public e2 o(@fg.l f2 reference) {
        return null;
    }

    public void p(@fg.l Set<androidx.compose.runtime.tooling.a> table) {
    }

    public void q(@fg.l t composer) {
    }

    public abstract void r(@fg.l n0 composition);

    public abstract void s(@fg.l n0 composition);

    public void t() {
    }

    public void u(@fg.l t composer) {
    }

    public abstract void v(@fg.l n0 composition);
}
