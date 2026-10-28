package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.snapshots.d0;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.q0;

/* compiled from: ModifierLocalModifierNode.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u00126\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0012\u001a\u00020\u00112\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0016\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/o;", "Landroidx/compose/ui/modifier/i;", "", "Lkotlin/q0;", "Landroidx/compose/ui/modifier/c;", "", "entries", "<init>", "([Lkotlin/q0;)V", "T", "key", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", "a", "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/runtime/snapshots/d0;", "Landroidx/compose/runtime/snapshots/d0;", "map", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19146c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0<c<?>, Object> map;

    public o(@fg.l q0<? extends c<?>, ? extends Object>... q0VarArr) {
        super(null);
        d0<c<?>, Object> d0Var = new d0<>();
        this.map = d0Var;
        d0Var.putAll(z0.H0(q0VarArr));
    }

    @Override // androidx.compose.ui.modifier.i
    public boolean a(@fg.l c<?> key) {
        return this.map.containsKey(key);
    }

    @Override // androidx.compose.ui.modifier.i
    @fg.m
    public <T> T b(@fg.l c<T> key) {
        T t4 = (T) this.map.get(key);
        if (t4 == null) {
            return null;
        }
        return t4;
    }

    @Override // androidx.compose.ui.modifier.i
    public <T> void c(@fg.l c<T> key, T value) {
        this.map.put(key, value);
    }
}
