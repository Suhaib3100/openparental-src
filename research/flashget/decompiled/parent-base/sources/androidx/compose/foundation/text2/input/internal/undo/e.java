package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.foundation.text2.input.internal.m;
import androidx.compose.foundation.text2.input.q;
import androidx.compose.foundation.text2.input.r;
import androidx.compose.foundation.text2.input.u;
import androidx.compose.ui.text.t0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/u;", "Landroidx/compose/foundation/text2/input/internal/undo/d;", "op", "Lkotlin/k2;", "b", "(Landroidx/compose/foundation/text2/input/u;Landroidx/compose/foundation/text2/input/internal/undo/d;)V", "a", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,179:1\n218#2,14:180\n218#2,14:194\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n*L\n117#1:180,14\n128#1:194,14\n*E\n"})
/* loaded from: classes.dex */
public final class e {
    public static final void a(@l u uVar, @l d dVar) {
        q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        mainBuffer.o(dVar.getIndex(), dVar.getPreText().length() + dVar.getIndex(), dVar.getPostText());
        mainBuffer.r(t0.n(dVar.getPostSelection()), (int) (dVar.getPostSelection() & 4294967295L));
        q a5 = r.a(uVar.getMainBuffer().toString(), uVar.getMainBuffer().k(), uVar.getMainBuffer().f());
        uVar.v(a5);
        uVar.q(m4, a5);
    }

    public static final void b(@l u uVar, @l d dVar) {
        q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        mainBuffer.o(dVar.getIndex(), dVar.getPostText().length() + dVar.getIndex(), dVar.getPreText());
        mainBuffer.r(t0.n(dVar.getPreSelection()), (int) (dVar.getPreSelection() & 4294967295L));
        q a5 = r.a(uVar.getMainBuffer().toString(), uVar.getMainBuffer().k(), uVar.getMainBuffer().f());
        uVar.v(a5);
        uVar.q(m4, a5);
    }
}
