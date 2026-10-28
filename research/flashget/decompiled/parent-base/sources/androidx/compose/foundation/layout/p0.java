package androidx.compose.foundation.layout;

import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR+\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/p0;", "Landroidx/compose/ui/modifier/d;", "Landroidx/compose/ui/modifier/l;", "Landroidx/compose/foundation/layout/n2;", "<init>", "()V", "modifierLocalInsets", "b", "(Landroidx/compose/foundation/layout/n2;)Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/k2;", "e4", "(Landroidx/compose/ui/modifier/n;)V", "<set-?>", "Landroidx/compose/runtime/k2;", "c", "()Landroidx/compose/foundation/layout/n2;", "e", "(Landroidx/compose/foundation/layout/n2;)V", "consumedInsets", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "d", "value", "Landroidx/compose/foundation/layout/m1;", "Landroidx/compose/foundation/layout/j2;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@kotlin.jvm.internal.r1({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,286:1\n81#2:287\n107#2,2:288\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n198#1:287\n198#1:288,2\n*E\n"})
/* loaded from: classes.dex */
abstract class p0 implements androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.l<n2> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 consumedInsets;

    public /* synthetic */ p0(kotlin.jvm.internal.w wVar) {
        this();
    }

    private final n2 c() {
        return (n2) this.consumedInsets.getValue();
    }

    private final void e(n2 n2Var) {
        this.consumedInsets.setValue(n2Var);
    }

    @fg.l
    public abstract n2 b(@fg.l n2 modifierLocalInsets);

    @Override // androidx.compose.ui.modifier.l
    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n2 getValue() {
        return c();
    }

    @Override // androidx.compose.ui.modifier.d
    public void e4(@fg.l androidx.compose.ui.modifier.n scope) {
        e(b((n2) scope.v(d3.c())));
    }

    @Override // androidx.compose.ui.modifier.l
    @fg.l
    public androidx.compose.ui.modifier.p<n2> getKey() {
        return d3.c();
    }

    private p0() {
        androidx.compose.runtime.k2 g4;
        g4 = t4.g(new g0(0, 0, 0, 0), null, 2, null);
        this.consumedInsets = g4;
    }
}
