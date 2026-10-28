package kotlinx.coroutines.sync;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.m2;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/sync/c;", "", "owner", "", "a", "Lkotlin/m2;", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "d", "b", "()Z", "isLocked", "Lkotlinx/coroutines/selects/e;", "f", "()Lkotlinx/coroutines/selects/e;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @Deprecated(level = DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(c cVar, Object obj, Continuation continuation, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("幘"));
            }
            if ((i5 & 1) != 0) {
                obj = null;
            }
            return cVar.c(obj, continuation);
        }

        public static /* synthetic */ boolean c(c cVar, Object obj, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("幙"));
            }
            if ((i5 & 1) != 0) {
                obj = null;
            }
            return cVar.a(obj);
        }

        public static /* synthetic */ void d(c cVar, Object obj, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("幚"));
            }
            if ((i5 & 1) != 0) {
                obj = null;
            }
            cVar.d(obj);
        }
    }

    boolean a(@d5.e Object owner);

    boolean b();

    @d5.e
    Object c(@d5.e Object obj, @d5.d Continuation<? super m2> continuation);

    void d(@d5.e Object obj);

    boolean e(@d5.d Object owner);

    @d5.d
    kotlinx.coroutines.selects.e<Object, c> f();
}
