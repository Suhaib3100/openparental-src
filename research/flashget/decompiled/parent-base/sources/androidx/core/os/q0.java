package androidx.core.os;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: Trace.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "a", "(Ljava/lang/String;Lld/a;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q0 {
    @kotlin.k(message = "Use androidx.tracing.Trace instead", replaceWith = @x0(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@fg.l String str, @fg.l ld.a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
