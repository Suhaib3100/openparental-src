package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import kotlin.Metadata;

/* compiled from: ObservableScopeInvalidator.kt */
@kd.g
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/n0;", "", "Landroidx/compose/runtime/k2;", "Lkotlin/k2;", "state", "c", "(Landroidx/compose/runtime/k2;)Landroidx/compose/runtime/k2;", "a", "(Landroidx/compose/runtime/k2;)V", "h", "", "i", "(Landroidx/compose/runtime/k2;)Ljava/lang/String;", "", "g", "(Landroidx/compose/runtime/k2;)I", "other", "", "e", "(Landroidx/compose/runtime/k2;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/k2;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<kotlin.k2> state;

    private /* synthetic */ n0(k2 k2Var) {
        this.state = k2Var;
    }

    public static final void a(k2<kotlin.k2> k2Var) {
        k2Var.getValue();
    }

    public static final /* synthetic */ n0 b(k2 k2Var) {
        return new n0(k2Var);
    }

    @fg.l
    public static k2<kotlin.k2> c(@fg.l k2<kotlin.k2> k2Var) {
        return k2Var;
    }

    public static k2 d(k2 k2Var, int i4, kotlin.jvm.internal.w wVar) {
        return (i4 & 1) != 0 ? androidx.compose.runtime.b.e(kotlin.k2.f75408a, o4.m()) : k2Var;
    }

    public static boolean e(k2<kotlin.k2> k2Var, Object obj) {
        return (obj instanceof n0) && kotlin.jvm.internal.l0.g(k2Var, ((n0) obj).state);
    }

    public static final boolean f(k2<kotlin.k2> k2Var, k2<kotlin.k2> k2Var2) {
        return kotlin.jvm.internal.l0.g(k2Var, k2Var2);
    }

    public static int g(k2<kotlin.k2> k2Var) {
        return k2Var.hashCode();
    }

    public static final void h(k2<kotlin.k2> k2Var) {
        k2Var.setValue(kotlin.k2.f75408a);
    }

    public static String i(k2<kotlin.k2> k2Var) {
        return "ObservableScopeInvalidator(state=" + k2Var + ')';
    }

    public boolean equals(Object obj) {
        return e(this.state, obj);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ k2 getState() {
        return this.state;
    }

    public String toString() {
        return i(this.state);
    }
}
