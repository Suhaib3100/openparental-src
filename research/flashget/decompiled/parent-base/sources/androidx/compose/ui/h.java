package androidx.compose.ui;

import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.b2;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000b\u0010\fR-\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/h;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/platform/b2;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/ui/q;", "Landroidx/compose/runtime/i;", "factory", "<init>", "(Lld/l;Lld/q;)V", "e", "Lld/q;", "j", "()Lld/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
class h extends b2 implements q.c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<q, androidx.compose.runtime.t, Integer, q> factory;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar) {
        super(lVar);
        this.factory = qVar;
    }

    @fg.l
    public final ld.q<q, androidx.compose.runtime.t, Integer, q> j() {
        return this.factory;
    }
}
