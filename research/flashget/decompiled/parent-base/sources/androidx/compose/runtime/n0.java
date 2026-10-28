package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH&¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00032\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u0019H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H&¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0003H&¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0003H&¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0003H'¢\u0006\u0004\b(\u0010$J5\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010)2\b\u0010*\u001a\u0004\u0018\u00010\u00002\u0006\u0010,\u001a\u00020+2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0014\u00102\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018\u0082\u0001\u00013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/y;", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "y", "(Lld/p;)V", "", "", "values", "H", "(Ljava/util/Set;)V", "", "F", "(Ljava/util/Set;)Z", "block", "L", "(Lld/a;)V", "value", "a", "(Ljava/lang/Object;)V", "K", "E", "()Z", "", "Lkotlin/q0;", "Landroidx/compose/runtime/f2;", "references", "C", "(Ljava/util/List;)V", "Landroidx/compose/runtime/e2;", "state", "B", "(Landroidx/compose/runtime/e2;)V", "I", "()V", "z", "M", "x", "G", "R", "to", "", "groupIndex", "A", "(Landroidx/compose/runtime/n0;ILld/a;)Ljava/lang/Object;", "J", "isComposing", "D", "hasPendingChanges", "Landroidx/compose/runtime/b0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface n0 extends y {
    <R> R A(@fg.m n0 to, int groupIndex, @fg.l ld.a<? extends R> block);

    @p1
    void B(@fg.l e2 state);

    @p1
    void C(@fg.l List<kotlin.q0<f2, f2>> references);

    boolean D();

    boolean E();

    boolean F(@fg.l Set<? extends Object> values);

    @p1
    void G();

    void H(@fg.l Set<? extends Object> values);

    void I();

    boolean J();

    void K(@fg.l Object value);

    void L(@fg.l ld.a<kotlin.k2> block);

    void M();

    void a(@fg.l Object value);

    void x();

    void y(@fg.l ld.p<? super t, ? super Integer, kotlin.k2> content);

    void z();
}
