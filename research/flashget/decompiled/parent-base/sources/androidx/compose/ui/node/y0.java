package androidx.compose.ui.node;

import androidx.compose.ui.platform.m5;
import androidx.compose.ui.q;
import androidx.compose.ui.q.d;
import kotlin.Metadata;

/* compiled from: ModifierNodeElement.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H¦\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010!\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010#\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\"R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/q$d;", "N", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/platform/x1;", "<init>", "()V", "i", "()Landroidx/compose/ui/q$d;", "node", "Lkotlin/k2;", "m", "(Landroidx/compose/ui/q$d;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/ui/platform/a2;", "_inspectorValues", "j", "()Landroidx/compose/ui/platform/a2;", "inspectorValues", "", "h", "()Ljava/lang/String;", "nameFallback", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/m5;", "g", "()Lkotlin/sequences/m;", "inspectableElements", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 2)
@kotlin.jvm.internal.r1({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes.dex */
public abstract class y0<N extends q.d> implements q.c, androidx.compose.ui.platform.x1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19529c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.platform.a2 _inspectorValues;

    private final androidx.compose.ui.platform.a2 j() {
        androidx.compose.ui.platform.a2 a2Var = this._inspectorValues;
        if (a2Var != null) {
            return a2Var;
        }
        androidx.compose.ui.platform.a2 a2Var2 = new androidx.compose.ui.platform.a2();
        a2Var2.d(kotlin.jvm.internal.l1.d(getClass()).W());
        k(a2Var2);
        this._inspectorValues = a2Var2;
        return a2Var2;
    }

    @Override // androidx.compose.ui.platform.x1
    @fg.m
    public final Object b() {
        return j().getValue();
    }

    public abstract boolean equals(@fg.m Object other);

    @Override // androidx.compose.ui.platform.x1
    @fg.l
    public final kotlin.sequences.m<m5> g() {
        return j().getProperties();
    }

    @Override // androidx.compose.ui.platform.x1
    @fg.m
    public final String h() {
        return j().getName();
    }

    public abstract int hashCode();

    @fg.l
    public abstract N i();

    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        androidx.compose.ui.b.b(a2Var, this);
    }

    public abstract void m(@fg.l N node);
}
