package androidx.core.os;

import androidx.core.os.v;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.l0;

/* compiled from: Trace.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "a", "(Ljava/lang/String;Lq3/a;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a0 {
    @Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @ReplaceWith(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@d5.d String sectionName, @d5.d q3.a<? extends T> block) {
        l0.p(sectionName, "sectionName");
        l0.p(block, "block");
        v.b(sectionName);
        try {
            return block.n();
        } finally {
            v.a.b();
        }
    }
}
