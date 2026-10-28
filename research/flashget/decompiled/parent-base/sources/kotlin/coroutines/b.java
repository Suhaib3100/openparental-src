package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.coroutines.g.b;
import kotlin.jvm.internal.l0;
import kotlin.r;

/* compiled from: CoroutineContextImpl.kt */
@r
@c1(version = "1.3")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/coroutines/b;", "Lkotlin/coroutines/g$b;", "B", "E", "Lkotlin/coroutines/g$c;", "baseKey", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "element", "safeCast", "<init>", "(Lkotlin/coroutines/g$c;Lld/l;)V", "b", "(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g$b;", "key", "", "a", "(Lkotlin/coroutines/g$c;)Z", "Lld/l;", "c", "Lkotlin/coroutines/g$c;", "topmostKey", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<g.b, E> safeCast;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final g.c<?> topmostKey;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ld.l<? super kotlin.coroutines.g$b, ? extends E extends B>, ld.l<kotlin.coroutines.g$b, E extends B>] */
    public b(@l g.c<B> cVar, @l ld.l<? super g.b, ? extends E> lVar) {
        l0.p(cVar, ProtectedSandApp.s("拯\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拰\u0001"));
        this.safeCast = lVar;
        this.topmostKey = cVar instanceof b ? (g.c<B>) ((b) cVar).topmostKey : cVar;
    }

    public final boolean a(@l g.c<?> key) {
        l0.p(key, ProtectedSandApp.s("拱\u0001"));
        return key == this || this.topmostKey == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/g$b;)TE; */
    @m
    public final g.b b(@l g.b element) {
        l0.p(element, ProtectedSandApp.s("拲\u0001"));
        return (g.b) this.safeCast.invoke(element);
    }
}
