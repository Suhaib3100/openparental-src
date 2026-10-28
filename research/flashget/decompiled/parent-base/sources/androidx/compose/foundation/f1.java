package androidx.compose.foundation;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/f1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/focus/e0;", "<init>", "()V", "", "focused", "Lkotlin/k2;", "y7", "(Z)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "Landroidx/compose/ui/semantics/l;", "p", "Landroidx/compose/ui/semantics/l;", "semanticsConfigurationCache", "q", "Z", "isFocused", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f1 extends q.d implements androidx.compose.ui.node.y1, androidx.compose.ui.focus.e0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.semantics.l semanticsConfigurationCache = new androidx.compose.ui.semantics.l();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.f0.c(f1.this));
        }
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        androidx.compose.ui.semantics.w.d1(zVar, this.isFocused);
        androidx.compose.ui.semantics.w.R0(zVar, null, new a(), 1, null);
    }

    public final void y7(boolean focused) {
        this.isFocused = focused;
    }
}
