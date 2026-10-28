package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\b\u001a\u00020\u0000*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000b\u0010\f\u001aN\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aR\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0010\"\u0004\u0018\u00010\u00052'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0016\u001a\u00020\u00152'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001c\u001a\u00020\u00188\u0002X\u0082T¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/ui/q;Lld/p;)Landroidx/compose/ui/q;", "key1", "e", "(Landroidx/compose/ui/q;Ljava/lang/Object;Lld/p;)Landroidx/compose/ui/q;", "key2", "d", "(Landroidx/compose/ui/q;Ljava/lang/Object;Ljava/lang/Object;Lld/p;)Landroidx/compose/ui/q;", "", "keys", "g", "(Landroidx/compose/ui/q;[Ljava/lang/Object;Lld/p;)Landroidx/compose/ui/q;", "pointerInputHandler", "Landroidx/compose/ui/input/pointer/v0;", "a", "(Lld/p;)Landroidx/compose/ui/input/pointer/v0;", "", "Ljava/lang/String;", "c", "()V", "PointerInputModifierNoParamError", "Landroidx/compose/ui/input/pointer/p;", "b", "Landroidx/compose/ui/input/pointer/p;", "EmptyPointerEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f18834a = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final p f18835b = new p(kotlin.collections.j0.f74919b, null);

    @fg.l
    public static final v0 a(@fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return new w0(pVar);
    }

    private static /* synthetic */ void c() {
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.m Object obj, @fg.m Object obj2, @fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return qVar.w3(new SuspendPointerInputElement(obj, obj2, null, pVar, 4, null));
    }

    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.m Object obj, @fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return qVar.w3(new SuspendPointerInputElement(obj, null, null, pVar, 6, null));
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.")
    public static final androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, @fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        throw new IllegalStateException("Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.");
    }

    @fg.l
    public static final androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, @fg.l Object[] objArr, @fg.l ld.p<? super k0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        return qVar.w3(new SuspendPointerInputElement(null, null, objArr, pVar, 3, null));
    }
}
