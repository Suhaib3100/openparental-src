package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.channels.e0;

/* compiled from: SimpleChannelFlow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J!\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/paging/n1;", "T", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "y", "(Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "()Lkotlinx/coroutines/channels/e0;", "channel", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface n1<T> extends kotlinx.coroutines.r0, kotlinx.coroutines.channels.e0<T> {

    /* compiled from: SimpleChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        @kotlin.k(level = kotlin.m.WARNING, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.x0(expression = "trySend(element).isSuccess", imports = {}))
        public static <T> boolean a(@fg.l n1<T> n1Var, T t4) {
            kotlin.jvm.internal.l0.p(n1Var, "this");
            return e0.a.c(n1Var, t4);
        }
    }

    @fg.l
    kotlinx.coroutines.channels.e0<T> a();

    @fg.m
    Object y(@fg.l ld.a<k2> aVar, @fg.l kotlin.coroutines.d<? super k2> dVar);
}
