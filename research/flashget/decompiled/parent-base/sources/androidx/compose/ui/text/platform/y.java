package androidx.compose.ui.text.platform;

import kotlin.Metadata;
import kotlin.w0;

/* compiled from: Synchronization.jvm.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a,\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0081\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/z;", "a", "()Landroidx/compose/ui/text/platform/z;", "R", "lock", "Lkotlin/Function0;", "block", "b", "(Landroidx/compose/ui/text/platform/z;Lld/a;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {
    @fg.l
    public static final z a() {
        return new z();
    }

    @w0
    public static final <R> R b(@fg.l z zVar, @fg.l ld.a<? extends R> aVar) {
        R invoke;
        synchronized (zVar) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
