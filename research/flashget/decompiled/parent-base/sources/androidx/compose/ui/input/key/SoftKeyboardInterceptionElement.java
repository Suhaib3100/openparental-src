package androidx.compose.ui.input.key;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import ld.l;

/* compiled from: SoftwareKeyboardInterceptionModifier.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J@\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/input/key/a;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/c;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Lld/l;Lld/l;)V", "u", "()Landroidx/compose/ui/input/key/a;", "node", "Lkotlin/k2;", "x", "(Landroidx/compose/ui/input/key/a;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/l;", "o", "r", "(Lld/l;Lld/l;)Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/l;", "v", "e", "w", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SoftKeyboardInterceptionElement extends y0<a> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final l<c, Boolean> onKeyEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final l<c, Boolean> onPreKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(@m l<? super c, Boolean> lVar, @m l<? super c, Boolean> lVar2) {
        this.onKeyEvent = lVar;
        this.onPreKeyEvent = lVar2;
    }

    public static SoftKeyboardInterceptionElement s(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, l lVar, l lVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i4 & 2) != 0) {
            lVar2 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        softKeyboardInterceptionElement.getClass();
        return new SoftKeyboardInterceptionElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) other;
        return l0.g(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && l0.g(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        l<c, Boolean> lVar = this.onKeyEvent;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<c, Boolean> lVar2 = this.onPreKeyEvent;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        l<c, Boolean> lVar = this.onKeyEvent;
        if (lVar != null) {
            a2Var.d("onKeyToSoftKeyboardInterceptedEvent");
            a2Var.getProperties().c("onKeyToSoftKeyboardInterceptedEvent", lVar);
        }
        l<c, Boolean> lVar2 = this.onPreKeyEvent;
        if (lVar2 != null) {
            a2Var.d("onPreKeyToSoftKeyboardInterceptedEvent");
            a2Var.getProperties().c("onPreKeyToSoftKeyboardInterceptedEvent", lVar2);
        }
    }

    @m
    public final l<c, Boolean> n() {
        return this.onKeyEvent;
    }

    @m
    public final l<c, Boolean> o() {
        return this.onPreKeyEvent;
    }

    @fg.l
    public final SoftKeyboardInterceptionElement r(@m l<? super c, Boolean> onKeyEvent, @m l<? super c, Boolean> onPreKeyEvent) {
        return new SoftKeyboardInterceptionElement(onKeyEvent, onPreKeyEvent);
    }

    @fg.l
    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public a i() {
        return new a(this.onKeyEvent, this.onPreKeyEvent);
    }

    @m
    public final l<c, Boolean> v() {
        return this.onKeyEvent;
    }

    @m
    public final l<c, Boolean> w() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l a node) {
        node.A7(this.onKeyEvent);
        node.B7(this.onPreKeyEvent);
    }
}
