package androidx.compose.material3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/m5;", "T", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "current", "", "Landroidx/compose/material3/l5;", "b", "Ljava/util/List;", "()Ljava/util/List;", "e", "(Ljava/util/List;)V", "items", "Landroidx/compose/runtime/e3;", "c", "Landroidx/compose/runtime/e3;", "()Landroidx/compose/runtime/e3;", "f", "(Landroidx/compose/runtime/e3;)V", "scope", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m5<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object current = new Object();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private List<l5<T>> items = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.e3 scope;

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Object getCurrent() {
        return this.current;
    }

    @fg.l
    public final List<l5<T>> b() {
        return this.items;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final androidx.compose.runtime.e3 getScope() {
        return this.scope;
    }

    public final void d(@fg.m Object obj) {
        this.current = obj;
    }

    public final void e(@fg.l List<l5<T>> list) {
        this.items = list;
    }

    public final void f(@fg.m androidx.compose.runtime.e3 e3Var) {
        this.scope = e3Var;
    }
}
