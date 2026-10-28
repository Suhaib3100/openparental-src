package kotlinx.coroutines.sync;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.k;
import kotlin.k2;
import kotlin.m;
import kotlinx.coroutines.selects.i;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\u000f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/sync/a;", "", "owner", "", "c", "(Ljava/lang/Object;)Z", "Lkotlin/k2;", "f", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "g", "(Ljava/lang/Object;)V", "d", "()Z", "isLocked", "Lkotlinx/coroutines/selects/i;", "i", "()Lkotlinx/coroutines/selects/i;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.sync.a$a, reason: collision with other inner class name */
    public static final class C1262a {
        @k(level = m.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(a aVar, Object obj, kotlin.coroutines.d dVar, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("裋\u0001"));
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            return aVar.f(obj, dVar);
        }

        public static /* synthetic */ boolean c(a aVar, Object obj, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("裌\u0001"));
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj);
        }

        public static /* synthetic */ void d(a aVar, Object obj, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("裍\u0001"));
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            aVar.g(obj);
        }
    }

    boolean c(@fg.m Object owner);

    boolean d();

    @fg.m
    Object f(@fg.m Object obj, @l kotlin.coroutines.d<? super k2> dVar);

    void g(@fg.m Object owner);

    boolean h(@l Object owner);

    @l
    i<Object, a> i();
}
