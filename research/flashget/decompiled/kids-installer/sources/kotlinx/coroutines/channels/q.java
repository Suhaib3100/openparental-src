package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.m2;
import kotlinx.coroutines.channels.r;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000f\u0010\t\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/channels/r;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lq3/l;)Ljava/lang/Object;", "value", "Lkotlin/m2;", "action", "h", "g", "f", "E", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "onUndeliveredElement", "Lkotlinx/coroutines/channels/n;", "b", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class q {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ n a(int i5) {
        return d(i5, null, null, 6, null);
    }

    @d5.d
    public static final <E> n<E> b(int i5, @d5.d m mVar, @d5.e q3.l<? super E, m2> lVar) {
        if (i5 == -2) {
            return new h(mVar == m.SUSPEND ? n.INSTANCE.a() : 1, mVar, lVar);
        }
        if (i5 != -1) {
            return i5 != 0 ? i5 != Integer.MAX_VALUE ? (i5 == 1 && mVar == m.DROP_OLDEST) ? new y(lVar) : new h(i5, mVar, lVar) : new b0(lVar) : mVar == m.SUSPEND ? new i0(lVar) : new h(1, mVar, lVar);
        }
        if ((mVar != m.SUSPEND ? 0 : 1) != 0) {
            return new y(lVar);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("峓").toString());
    }

    public static /* synthetic */ n c(int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return a(i5);
    }

    public static /* synthetic */ n d(int i5, m mVar, q3.l lVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        if ((i6 & 2) != 0) {
            mVar = m.SUSPEND;
        }
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        return b(i5, mVar, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@d5.d Object obj, @d5.d q3.l<? super Throwable, ? extends T> lVar) {
        return obj instanceof r.c ? lVar.N(r.f(obj)) : obj;
    }

    @d5.d
    public static final <T> Object f(@d5.d Object obj, @d5.d q3.l<? super Throwable, m2> lVar) {
        if (obj instanceof r.a) {
            lVar.N(r.f(obj));
        }
        return obj;
    }

    @d5.d
    public static final <T> Object g(@d5.d Object obj, @d5.d q3.l<? super Throwable, m2> lVar) {
        if (obj instanceof r.c) {
            lVar.N(r.f(obj));
        }
        return obj;
    }

    @d5.d
    public static final <T> Object h(@d5.d Object obj, @d5.d q3.l<? super T, m2> lVar) {
        if (!(obj instanceof r.c)) {
            lVar.N(obj);
        }
        return obj;
    }
}
