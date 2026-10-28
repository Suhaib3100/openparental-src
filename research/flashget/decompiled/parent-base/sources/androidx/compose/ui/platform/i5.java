package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: TextToolbar.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J_\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/i5;", "", "Li0/i;", "rect", "Lkotlin/Function0;", "Lkotlin/k2;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "c", "(Li0/i;Lld/a;Lld/a;Lld/a;Lld/a;)V", "a", "()V", "Landroidx/compose/ui/platform/k5;", "getStatus", "()Landroidx/compose/ui/platform/k5;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i5 {

    /* compiled from: TextToolbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ void b(i5 i5Var, i0.i iVar, ld.a aVar, ld.a aVar2, ld.a aVar3, ld.a aVar4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        i5Var.c(iVar, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? null : aVar2, (i4 & 8) != 0 ? null : aVar3, (i4 & 16) != 0 ? null : aVar4);
    }

    void a();

    void c(@fg.l i0.i rect, @fg.m ld.a<kotlin.k2> onCopyRequested, @fg.m ld.a<kotlin.k2> onPasteRequested, @fg.m ld.a<kotlin.k2> onCutRequested, @fg.m ld.a<kotlin.k2> onSelectAllRequested);

    @fg.l
    k5 getStatus();
}
