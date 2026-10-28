package androidx.compose.runtime.tooling;

import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: CompositionData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/a;", "", "identityToFind", "Landroidx/compose/runtime/tooling/b;", "c", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/b;", "", "f", "()Ljava/lang/Iterable;", "compositionGroups", "", "isEmpty", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface a {
    @m
    default b c(@l Object identityToFind) {
        return null;
    }

    @l
    Iterable<b> f();

    boolean isEmpty();
}
