package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;

/* compiled from: SequencesJVM.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes5.dex */
class r extends q {
    @InlineOnly
    private static final <T> Sequence<T> c(Enumeration<T> enumeration) {
        Iterator f02;
        l0.p(enumeration, ProtectedSandApp.s("娲"));
        f02 = kotlin.collections.c0.f0(enumeration);
        return s.e(f02);
    }
}
