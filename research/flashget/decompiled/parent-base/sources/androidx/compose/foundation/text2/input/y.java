package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text2.input.o;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextUndoManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\n*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/d;", "next", "b", "(Landroidx/compose/foundation/text2/input/internal/undo/d;Landroidx/compose/foundation/text2/input/internal/undo/d;)Landroidx/compose/foundation/text2/input/internal/undo/d;", "Landroidx/compose/foundation/text2/input/x;", "Landroidx/compose/foundation/text2/input/q;", "pre", "post", "Landroidx/compose/foundation/text2/input/o$a;", "changes", "", "allowMerge", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/text2/input/x;Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o$a;Z)V", "", "a", "I", "TEXT_UNDO_CAPACITY", "(Landroidx/compose/foundation/text2/input/internal/undo/d;)Z", "isNewLineInsert", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9090a = 100;

    private static final boolean a(androidx.compose.foundation.text2.input.internal.undo.d dVar) {
        return l0.g(dVar.getPostText(), "\n") || l0.g(dVar.getPostText(), "\r\n");
    }

    @fg.m
    public static final androidx.compose.foundation.text2.input.internal.undo.d b(@fg.l androidx.compose.foundation.text2.input.internal.undo.d dVar, @fg.l androidx.compose.foundation.text2.input.internal.undo.d dVar2) {
        if (!dVar.getCanMerge() || !dVar2.getCanMerge() || dVar2.getTimeInMillis() < dVar.getTimeInMillis() || dVar2.getTimeInMillis() - dVar.getTimeInMillis() >= k1.a() || a(dVar) || a(dVar2) || dVar.getTextEditType() != dVar2.getTextEditType()) {
            return null;
        }
        if (dVar.getTextEditType() == androidx.compose.foundation.text2.input.internal.undo.b.Insert) {
            if (dVar.getPostText().length() + dVar.getIndex() == dVar2.getIndex()) {
                return new androidx.compose.foundation.text2.input.internal.undo.d(dVar.getIndex(), "", dVar.getPostText() + dVar2.getPostText(), dVar.getPreSelection(), dVar2.getPostSelection(), dVar.getTimeInMillis(), false, 64, null);
            }
        }
        if (dVar.getTextEditType() == androidx.compose.foundation.text2.input.internal.undo.b.Delete && dVar.c() == dVar2.c() && (dVar.c() == androidx.compose.foundation.text2.input.internal.undo.a.Start || dVar.c() == androidx.compose.foundation.text2.input.internal.undo.a.End)) {
            if (dVar.getIndex() == dVar2.getPreText().length() + dVar2.getIndex()) {
                return new androidx.compose.foundation.text2.input.internal.undo.d(dVar2.getIndex(), dVar2.getPreText() + dVar.getPreText(), "", dVar.getPreSelection(), dVar2.getPostSelection(), dVar.getTimeInMillis(), false, 64, null);
            }
            if (dVar.getIndex() == dVar2.getIndex()) {
                return new androidx.compose.foundation.text2.input.internal.undo.d(dVar.getIndex(), dVar.getPreText() + dVar2.getPreText(), "", dVar.getPreSelection(), dVar2.getPostSelection(), dVar.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static final void c(@fg.l x xVar, @fg.l q qVar, @fg.l q qVar2, @fg.l o.a aVar, boolean z4) {
        if (aVar.a() > 1) {
            xVar.h(new androidx.compose.foundation.text2.input.internal.undo.d(0, qVar.toString(), qVar2.toString(), qVar.getSelectionInChars(), qVar2.getSelectionInChars(), 0L, false, 32, null));
            return;
        }
        if (aVar.a() == 1) {
            long b5 = aVar.b(0);
            long c5 = aVar.c(0);
            if (t0.h(b5) && t0.h(c5)) {
                return;
            }
            xVar.h(new androidx.compose.foundation.text2.input.internal.undo.d(t0.l(b5), u0.e(qVar, b5), u0.e(qVar2, c5), qVar.getSelectionInChars(), qVar2.getSelectionInChars(), 0L, z4, 32, null));
        }
    }

    public static /* synthetic */ void d(x xVar, q qVar, q qVar2, o.a aVar, boolean z4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z4 = true;
        }
        c(xVar, qVar, qVar2, aVar, z4);
    }
}
