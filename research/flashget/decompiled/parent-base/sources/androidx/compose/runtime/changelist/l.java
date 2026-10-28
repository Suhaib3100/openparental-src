package androidx.compose.runtime.changelist;

import kotlin.Metadata;

/* compiled from: Operations.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/l;", "", "", "linePrefix", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/d;", "Landroidx/compose/runtime/changelist/f;", "Landroidx/compose/runtime/changelist/k;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l {
    static /* synthetic */ String b(l lVar, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i4 & 1) != 0) {
            str = "  ";
        }
        return lVar.a(str);
    }

    @fg.l
    String a(@fg.l String linePrefix);
}
