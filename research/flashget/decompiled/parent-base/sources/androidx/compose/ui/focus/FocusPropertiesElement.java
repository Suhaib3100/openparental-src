package androidx.compose.ui.focus;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/focus/y;", "Landroidx/compose/ui/focus/z;", "scope", "<init>", "(Landroidx/compose/ui/focus/z;)V", "s", "()Landroidx/compose/ui/focus/y;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/ui/focus/y;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/ui/focus/z;", "o", "(Landroidx/compose/ui/focus/z;)Landroidx/compose/ui/focus/FocusPropertiesElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/focus/z;", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends y0<y> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z scope;

    public FocusPropertiesElement(@fg.l z zVar) {
        this.scope = zVar;
    }

    public static FocusPropertiesElement r(FocusPropertiesElement focusPropertiesElement, z zVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            zVar = focusPropertiesElement.scope;
        }
        focusPropertiesElement.getClass();
        return new FocusPropertiesElement(zVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusPropertiesElement) && kotlin.jvm.internal.l0.g(this.scope, ((FocusPropertiesElement) other).scope);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("focusProperties");
        a2Var.getProperties().c("scope", this.scope);
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final z getScope() {
        return this.scope;
    }

    @fg.l
    public final FocusPropertiesElement o(@fg.l z scope) {
        return new FocusPropertiesElement(scope);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public y i() {
        return new y(this.scope);
    }

    @fg.l
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    @fg.l
    public final z u() {
        return this.scope;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l y node) {
        node.z7(this.scope);
    }
}
