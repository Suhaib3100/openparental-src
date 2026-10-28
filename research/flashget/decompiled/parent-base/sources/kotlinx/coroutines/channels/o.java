package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.channels.p;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000f\u0010\t\u001aE\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lld/l;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "action", "h", "g", "f", "E", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "onUndeliveredElement", "Lkotlinx/coroutines/channels/l;", "b", "(ILkotlinx/coroutines/channels/i;Lld/l;)Lkotlinx/coroutines/channels/l;", "a", "(I)Lkotlinx/coroutines/channels/l;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o {
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ l a(int i4) {
        return d(i4, null, null, 6, null);
    }

    @fg.l
    public static final <E> l<E> b(int i4, @fg.l i iVar, @fg.m ld.l<? super E, k2> lVar) {
        l<E> jVar;
        if (i4 == -2) {
            jVar = iVar == i.SUSPEND ? new j<>(l.INSTANCE.a(), lVar) : new w<>(1, iVar, lVar);
        } else {
            if (i4 == -1) {
                if (iVar == i.SUSPEND) {
                    return new w(1, i.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("虙\u0001"));
            }
            if (i4 != 0) {
                return i4 != Integer.MAX_VALUE ? iVar == i.SUSPEND ? new j(i4, lVar) : new w(i4, iVar, lVar) : new j(Integer.MAX_VALUE, lVar);
            }
            jVar = iVar == i.SUSPEND ? new j<>(0, lVar) : new w<>(1, iVar, lVar);
        }
        return jVar;
    }

    public static /* synthetic */ l c(int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return a(i4);
    }

    public static /* synthetic */ l d(int i4, i iVar, ld.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            iVar = i.SUSPEND;
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        return b(i4, iVar, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@fg.l Object obj, @fg.l ld.l<? super Throwable, ? extends T> lVar) {
        return obj instanceof p.c ? lVar.invoke(p.f(obj)) : obj;
    }

    @fg.l
    public static final <T> Object f(@fg.l Object obj, @fg.l ld.l<? super Throwable, k2> lVar) {
        if (obj instanceof p.a) {
            lVar.invoke(p.f(obj));
        }
        return obj;
    }

    @fg.l
    public static final <T> Object g(@fg.l Object obj, @fg.l ld.l<? super Throwable, k2> lVar) {
        if (obj instanceof p.c) {
            lVar.invoke(p.f(obj));
        }
        return obj;
    }

    @fg.l
    public static final <T> Object h(@fg.l Object obj, @fg.l ld.l<? super T, k2> lVar) {
        if (!(obj instanceof p.c)) {
            lVar.invoke(obj);
        }
        return obj;
    }
}
