package androidx.compose.foundation.text.selection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010(\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/d0;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/p;", "Lkotlin/k2;", "block", "k", "(Lld/l;)V", "other", "", "i", "(Landroidx/compose/foundation/text/selection/d0;)Z", "Landroidx/compose/foundation/text/selection/q;", "selection", "", "", "h", "(Landroidx/compose/foundation/text/selection/q;)Ljava/util/Map;", "", "getSize", "()I", "size", "m", "startSlot", "e", "endSlot", "Landroidx/compose/foundation/text/selection/e;", "f", "()Landroidx/compose/foundation/text/selection/e;", "crossStatus", "l", "()Landroidx/compose/foundation/text/selection/p;", "startInfo", "j", "endInfo", "c", "currentInfo", "d", "firstInfo", "b", "lastInfo", "a", "()Z", "isStartHandle", "g", "()Landroidx/compose/foundation/text/selection/q;", "previousSelection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d0 {
    boolean a();

    @fg.l
    p b();

    @fg.l
    p c();

    @fg.l
    p d();

    int e();

    @fg.l
    e f();

    @fg.m
    q g();

    int getSize();

    @fg.l
    Map<Long, q> h(@fg.l q selection);

    boolean i(@fg.m d0 other);

    @fg.l
    p j();

    void k(@fg.l ld.l<? super p, k2> block);

    @fg.l
    p l();

    int m();
}
