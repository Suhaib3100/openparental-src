package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.text.input.z0;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: StateSyncingModifier.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\b*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/StateSyncingModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/text2/input/internal/v;", "Landroidx/compose/foundation/text2/input/u;", "state", "Landroidx/compose/ui/text/input/z0;", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChanged", "", "writeSelectionFromTextFieldValue", "<init>", "(Landroidx/compose/foundation/text2/input/u;Landroidx/compose/ui/text/input/z0;Lld/l;Z)V", "n", "()Landroidx/compose/foundation/text2/input/internal/v;", "node", "o", "(Landroidx/compose/foundation/text2/input/internal/v;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/text2/input/u;", "e", "Landroidx/compose/ui/text/input/z0;", "f", "Lld/l;", "g", "Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class StateSyncingModifier extends y0<v> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.u state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z0 value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<z0, k2> onValueChanged;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean writeSelectionFromTextFieldValue;

    /* JADX WARN: Multi-variable type inference failed */
    public StateSyncingModifier(@fg.l androidx.compose.foundation.text2.input.u uVar, @fg.l z0 z0Var, @fg.l ld.l<? super z0, k2> lVar, boolean z4) {
        this.state = uVar;
        this.value = z0Var;
        this.onValueChanged = lVar;
        this.writeSelectionFromTextFieldValue = z4;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        return false;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.state.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public v i() {
        return new v(this.state, this.onValueChanged, this.writeSelectionFromTextFieldValue);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l v node) {
        node.B7(this.value, this.onValueChanged);
    }
}
