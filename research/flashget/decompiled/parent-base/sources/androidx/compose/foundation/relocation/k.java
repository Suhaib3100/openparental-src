package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.o0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: BringIntoViewResponder.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/h;", "Landroidx/compose/foundation/relocation/c;", "b", "(Landroidx/compose/ui/node/h;)Landroidx/compose/foundation/relocation/c;", "Li0/i;", "Landroid/graphics/Rect;", "c", "(Li0/i;)Landroid/graphics/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* compiled from: BringIntoViewResponder.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/u;", "childCoordinates", "Lkotlin/Function0;", "Li0/i;", "boundsProvider", "Lkotlin/k2;", "m2", "(Landroidx/compose/ui/layout/u;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a implements c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.h f6997b;

        a(androidx.compose.ui.node.h hVar) {
            this.f6997b = hVar;
        }

        @Override // androidx.compose.foundation.relocation.c
        @m
        public final Object m2(@l u uVar, @l ld.a<i0.i> aVar, @l kotlin.coroutines.d<? super k2> dVar) {
            View view = (View) androidx.compose.ui.node.i.a(this.f6997b, o0.k());
            long f4 = v.f(uVar);
            i0.i invoke = aVar.invoke();
            i0.i T = invoke != null ? invoke.T(f4) : null;
            if (T != null) {
                view.requestRectangleOnScreen(k.c(T), false);
            }
            return k2.f75408a;
        }
    }

    @l
    public static final c b(@l androidx.compose.ui.node.h hVar) {
        return new a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(i0.i iVar) {
        return new Rect((int) iVar.t(), (int) iVar.getTop(), (int) iVar.x(), (int) iVar.j());
    }
}
