package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ModifierLocalModifierNode.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ,\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u00102\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/modifier/q;", "Landroidx/compose/ui/modifier/i;", "Landroidx/compose/ui/modifier/c;", "key", "<init>", "(Landroidx/compose/ui/modifier/c;)V", "", "value", "Lkotlin/k2;", "d", "(Ljava/lang/Object;)V", "T", "c", "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", "a", "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/ui/modifier/c;", "<set-?>", "Landroidx/compose/runtime/k2;", "e", "()Ljava/lang/Object;", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,209:1\n81#2:210\n107#2,2:211\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n41#1:210\n41#1:211,2\n*E\n"})
/* loaded from: classes.dex */
public final class q extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19149d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c<?> key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 value;

    public q(@fg.l c<?> cVar) {
        super(null);
        k2 g4;
        this.key = cVar;
        g4 = t4.g(null, null, 2, null);
        this.value = g4;
    }

    private final Object e() {
        return this.value.getValue();
    }

    private final void f(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.i
    public boolean a(@fg.l c<?> key) {
        return key == this.key;
    }

    @Override // androidx.compose.ui.modifier.i
    @fg.m
    public <T> T b(@fg.l c<T> key) {
        if (key != this.key) {
            throw new IllegalStateException("Check failed.");
        }
        T value = this.value.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // androidx.compose.ui.modifier.i
    public <T> void c(@fg.l c<T> key, T value) {
        if (key != this.key) {
            throw new IllegalStateException("Check failed.");
        }
        f(value);
    }

    public final void d(@fg.m Object value) {
        f(value);
    }
}
