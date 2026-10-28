package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.b1;
import androidx.paging.e0;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;
import kotlinx.coroutines.b2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PagedList.kt */
@kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b'\u0018\u0000 z*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006{DHLPSBA\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0013H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H&¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0018H\u0017¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010!J\u0019\u0010)\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010%J\u001a\u0010.\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u001fJ\u0013\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001¢\u0006\u0004\b2\u00103J'\u00105\u001a\u00020\u00192\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b5\u0010\u001cJ'\u00106\u001a\u00020\u00192\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b6\u0010\u001cJ'\u00109\u001a\u00020\u00192\u000e\u00107\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001012\u0006\u0010\u001a\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u000208¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u000208¢\u0006\u0004\b=\u0010<J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0013H\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0013H\u0007¢\u0006\u0004\bB\u0010AJ\u001f\u0010C\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0013H\u0007¢\u0006\u0004\bC\u0010AR$\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b\u0002\u0010RR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010(\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010*R\u001a\u0010_\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010\u0015R \u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR2\u0010f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00160a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010cR$\u0010k\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000g8FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010!\u001a\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0015R\u0016\u0010p\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010u\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b]\u0010\u0015R\u0014\u0010w\u001a\u00020q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010sR\u0011\u0010y\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bx\u0010\u0015¨\u0006|"}, d2 = {"Landroidx/paging/s0;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/b1;", "pagingSource", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlinx/coroutines/m0;", "notifyDispatcher", "Landroidx/paging/v0;", "storage", "Landroidx/paging/s0$e;", "config", "<init>", "(Landroidx/paging/b1;Lkotlinx/coroutines/r0;Lkotlinx/coroutines/m0;Landroidx/paging/v0;Landroidx/paging/s0$e;)V", "Landroidx/paging/k0;", "L", "()Landroidx/paging/k0;", "", "W", "()I", "Lkotlin/Function2;", "Landroidx/paging/g0;", "Landroidx/paging/e0;", "Lkotlin/k2;", "callback", "w", "(Lld/p;)V", "index", "Z", "(I)V", "v", "()V", "loadType", "loadState", "i0", "(Landroidx/paging/g0;Landroidx/paging/e0;)V", "h0", "Ljava/lang/Runnable;", "refreshRetryCallback", "k0", "(Ljava/lang/Runnable;)V", "type", "state", "x", "get", "(I)Ljava/lang/Object;", "X", "", "l0", "()Ljava/util/List;", "listener", "r", "g0", "previousSnapshot", "Landroidx/paging/s0$c;", "q", "(Ljava/util/List;Landroidx/paging/s0$c;)V", "p", "(Landroidx/paging/s0$c;)V", "f0", "position", "count", "b0", "(II)V", "a0", "d0", "b", "Landroidx/paging/b1;", "O", "()Landroidx/paging/b1;", "c", "Lkotlinx/coroutines/r0;", "D", "()Lkotlinx/coroutines/r0;", "d", "Lkotlinx/coroutines/m0;", "K", "()Lkotlinx/coroutines/m0;", "e", "Landroidx/paging/v0;", "()Landroidx/paging/v0;", "f", "Landroidx/paging/s0$e;", "A", "()Landroidx/paging/s0$e;", "g", "Ljava/lang/Runnable;", "Q", "()Ljava/lang/Runnable;", "j0", "h", "I", "R", "requiredRemainder", "", "Ljava/lang/ref/WeakReference;", "i", "Ljava/util/List;", "callbacks", "j", "loadStateListeners", "Landroidx/paging/m;", "F", "()Landroidx/paging/m;", "G", "dataSource", "S", "size", "H", "()Ljava/lang/Object;", "lastKey", "", "U", "()Z", "isDetached", "loadedCount", "V", "isImmutable", "P", "positionOffset", "k", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class s0<T> extends AbstractList<T> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    private final b1<?, T> pagingSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 notifyDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0<T> storage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e config;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Runnable refreshRetryCallback;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int requiredRemainder;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<WeakReference<c>> callbacks;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<WeakReference<ld.p<g0, e0, k2>>> loadStateListeners;

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/paging/s0$a;", "", "T", "<init>", "()V", "Lkotlin/k2;", "c", "itemAtFront", "b", "(Ljava/lang/Object;)V", "itemAtEnd", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @androidx.annotation.l0
    public static abstract class a<T> {
        public void a(@fg.l T itemAtEnd) {
            kotlin.jvm.internal.l0.p(itemAtEnd, "itemAtEnd");
        }

        public void b(@fg.l T itemAtFront) {
            kotlin.jvm.internal.l0.p(itemAtFront, "itemAtFront");
        }

        public void c() {
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/paging/s0$c;", "", "<init>", "()V", "", "position", "count", "Lkotlin/k2;", "a", "(II)V", "b", "c", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class c {
        public abstract void a(int position, int count);

        public abstract void b(int position, int count);

        public abstract void c(int position, int count);
    }

    /* compiled from: PagedList.kt */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\b\b\u0001\u0010\u0004*\u00020\u0001\"\b\b\u0002\u0010\u0005*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/paging/s0$d;", "", "<init>", "()V", "K", "T", "Landroidx/paging/b1;", "pagingSource", "Landroidx/paging/b1$b$c;", "initialPage", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlinx/coroutines/m0;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/s0$a;", "boundaryCallback", "Landroidx/paging/s0$e;", "config", "key", "Landroidx/paging/s0;", "a", "(Landroidx/paging/b1;Landroidx/paging/b1$b$c;Lkotlinx/coroutines/r0;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/m0;Landroidx/paging/s0$a;Landroidx/paging/s0$e;Ljava/lang/Object;)Landroidx/paging/s0;", "", "currentSize", "snapshotSize", "Landroidx/paging/s0$c;", "callback", "Lkotlin/k2;", "b", "(IILandroidx/paging/s0$c;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.s0$d, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: Add missing generic type declarations: [K] */
        /* compiled from: PagedList.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", i = {}, l = {SyslogAppender.LOG_LOCAL7}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "T", "Lkotlinx/coroutines/r0;", "Landroidx/paging/b1$b$c;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/b1$b$c;"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.paging.s0$d$a */
        static final class a<K> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super b1.b.c<K, T>>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32352b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b1<K, T> f32353c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b1.a.d<K> f32354d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1<K, T> b1Var, b1.a.d<K> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f32353c = b1Var;
                this.f32354d = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f32353c, this.f32354d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32352b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    b1<K, T> b1Var = this.f32353c;
                    b1.a.d<K> dVar = this.f32354d;
                    this.f32352b = 1;
                    obj = b1Var.g(dVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                b1.b bVar = (b1.b) obj;
                if (bVar instanceof b1.b.c) {
                    return (b1.b.c) bVar;
                }
                if (bVar instanceof b1.b.a) {
                    throw ((b1.b.a) bVar).d();
                }
                if (bVar instanceof b1.b.C0529b) {
                    throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super b1.b.c<K, T>> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        private Companion() {
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        public final <K, T> s0<T> a(@fg.l b1<K, T> pagingSource, @fg.m b1.b.c<K, T> initialPage, @fg.l kotlinx.coroutines.r0 coroutineScope, @fg.l kotlinx.coroutines.m0 notifyDispatcher, @fg.l kotlinx.coroutines.m0 fetchDispatcher, @fg.m a<T> boundaryCallback, @fg.l e config, @fg.m K key) {
            b1.b.c<K, T> cVar;
            Object b5;
            kotlin.jvm.internal.l0.p(pagingSource, "pagingSource");
            kotlin.jvm.internal.l0.p(coroutineScope, "coroutineScope");
            kotlin.jvm.internal.l0.p(notifyDispatcher, "notifyDispatcher");
            kotlin.jvm.internal.l0.p(fetchDispatcher, "fetchDispatcher");
            kotlin.jvm.internal.l0.p(config, "config");
            if (initialPage == null) {
                b5 = kotlinx.coroutines.j.b(null, new a(pagingSource, new b1.a.d(key, config.initialLoadSizeHint, config.enablePlaceholders), null), 1, null);
                cVar = (b1.b.c) b5;
            } else {
                cVar = initialPage;
            }
            return new androidx.paging.k(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, boundaryCallback, config, cVar, key);
        }

        public final void b(int currentSize, int snapshotSize, @fg.l c callback) {
            kotlin.jvm.internal.l0.p(callback, "callback");
            if (snapshotSize < currentSize) {
                if (snapshotSize > 0) {
                    callback.a(0, snapshotSize);
                }
                int i4 = currentSize - snapshotSize;
                if (i4 > 0) {
                    callback.b(snapshotSize, i4);
                    return;
                }
                return;
            }
            if (currentSize > 0) {
                callback.a(0, currentSize);
            }
            int i5 = snapshotSize - currentSize;
            if (i5 != 0) {
                callback.c(currentSize, i5);
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u00122\u00020\u0001:\u0002\u000b\rB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/paging/s0$e;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSizeHint", "maxSize", "<init>", "(IIZII)V", "a", "I", "b", "c", "Z", "d", "e", "f", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: g, reason: collision with root package name */
        public static final int f32356g = Integer.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int pageSize;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int prefetchDistance;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean enablePlaceholders;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int initialLoadSizeHint;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int maxSize;

        /* compiled from: PagedList.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/paging/s0$e$a;", "", "<init>", "()V", "", "pageSize", "e", "(I)Landroidx/paging/s0$e$a;", "prefetchDistance", "f", "", "enablePlaceholders", "b", "(Z)Landroidx/paging/s0$e$a;", "initialLoadSizeHint", "c", "maxSize", "d", "Landroidx/paging/s0$e;", "a", "()Landroidx/paging/s0$e;", "I", "Z", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a {

            /* renamed from: g, reason: collision with root package name */
            public static final int f32363g = 3;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int pageSize = -1;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int prefetchDistance = -1;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int initialLoadSizeHint = -1;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private boolean enablePlaceholders = true;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private int maxSize = Integer.MAX_VALUE;

            @fg.l
            public final e a() {
                if (this.prefetchDistance < 0) {
                    this.prefetchDistance = this.pageSize;
                }
                if (this.initialLoadSizeHint < 0) {
                    this.initialLoadSizeHint = this.pageSize * 3;
                }
                if (!this.enablePlaceholders && this.prefetchDistance == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i4 = this.maxSize;
                if (i4 != Integer.MAX_VALUE) {
                    if (i4 < (this.prefetchDistance * 2) + this.pageSize) {
                        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.pageSize + ", prefetchDist=" + this.prefetchDistance + ", maxSize=" + this.maxSize);
                    }
                }
                return new e(this.pageSize, this.prefetchDistance, this.enablePlaceholders, this.initialLoadSizeHint, this.maxSize);
            }

            @fg.l
            public final a b(boolean enablePlaceholders) {
                this.enablePlaceholders = enablePlaceholders;
                return this;
            }

            @fg.l
            public final a c(@androidx.annotation.g0(from = 1) int initialLoadSizeHint) {
                this.initialLoadSizeHint = initialLoadSizeHint;
                return this;
            }

            @fg.l
            public final a d(@androidx.annotation.g0(from = 2) int maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            @fg.l
            public final a e(@androidx.annotation.g0(from = 1) int pageSize) {
                if (pageSize < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.pageSize = pageSize;
                return this;
            }

            @fg.l
            public final a f(@androidx.annotation.g0(from = 0) int prefetchDistance) {
                this.prefetchDistance = prefetchDistance;
                return this;
            }
        }

        /* compiled from: PagedList.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Landroidx/paging/s0$e$b;", "", "<init>", "()V", "", "MAX_SIZE_UNBOUNDED", "I", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.s0$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ void a() {
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public e(int i4, int i5, boolean z4, int i6, int i7) {
            this.pageSize = i4;
            this.prefetchDistance = i5;
            this.enablePlaceholders = z4;
            this.initialLoadSizeHint = i6;
            this.maxSize = i7;
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/paging/s0$f;", "", "<init>", "()V", "Landroidx/paging/g0;", "type", "Landroidx/paging/e0;", "state", "Lkotlin/k2;", "i", "(Landroidx/paging/g0;Landroidx/paging/e0;)V", "e", "Lkotlin/Function2;", "callback", "a", "(Lld/p;)V", "Landroidx/paging/e0;", "c", "()Landroidx/paging/e0;", "g", "(Landroidx/paging/e0;)V", "refreshState", "b", "d", "h", "startState", "f", "endState", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private e0 refreshState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private e0 startState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private e0 endState;

        /* compiled from: PagedList.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32372a;

            static {
                int[] iArr = new int[g0.values().length];
                iArr[g0.REFRESH.ordinal()] = 1;
                iArr[g0.PREPEND.ordinal()] = 2;
                iArr[g0.APPEND.ordinal()] = 3;
                f32372a = iArr;
            }
        }

        public f() {
            e0.c.Companion companion = e0.c.INSTANCE;
            companion.getClass();
            this.refreshState = e0.c.f31663d;
            companion.getClass();
            this.startState = e0.c.f31663d;
            companion.getClass();
            this.endState = e0.c.f31663d;
        }

        public final void a(@fg.l ld.p<? super g0, ? super e0, k2> callback) {
            kotlin.jvm.internal.l0.p(callback, "callback");
            callback.invoke(g0.REFRESH, this.refreshState);
            callback.invoke(g0.PREPEND, this.startState);
            callback.invoke(g0.APPEND, this.endState);
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final e0 getEndState() {
            return this.endState;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final e0 getRefreshState() {
            return this.refreshState;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final e0 getStartState() {
            return this.startState;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        public abstract void e(@fg.l g0 type, @fg.l e0 state);

        public final void f(@fg.l e0 e0Var) {
            kotlin.jvm.internal.l0.p(e0Var, "<set-?>");
            this.endState = e0Var;
        }

        public final void g(@fg.l e0 e0Var) {
            kotlin.jvm.internal.l0.p(e0Var, "<set-?>");
            this.refreshState = e0Var;
        }

        public final void h(@fg.l e0 e0Var) {
            kotlin.jvm.internal.l0.p(e0Var, "<set-?>");
            this.startState = e0Var;
        }

        public final void i(@fg.l g0 type, @fg.l e0 state) {
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(state, "state");
            int i4 = a.f32372a[type.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (kotlin.jvm.internal.l0.g(this.endState, state)) {
                            return;
                        } else {
                            this.endState = state;
                        }
                    }
                } else if (kotlin.jvm.internal.l0.g(this.startState, state)) {
                    return;
                } else {
                    this.startState = state;
                }
            } else if (kotlin.jvm.internal.l0.g(this.refreshState, state)) {
                return;
            } else {
                this.refreshState = state;
            }
            e(type, state);
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/s0$c;", "it", "", "<anonymous>", "(Ljava/lang/ref/WeakReference;)Z"}, k = 3, mv = {1, 5, 1})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<WeakReference<c>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f32373b = new g(1);

        g() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l WeakReference<c> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return Boolean.valueOf(it.get() == null);
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Landroidx/paging/g0;", "Landroidx/paging/e0;", "Lkotlin/k2;", "it", "", "<anonymous>", "(Ljava/lang/ref/WeakReference;)Z"}, k = 3, mv = {1, 5, 1})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<WeakReference<ld.p<? super g0, ? super e0, ? extends k2>>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f32374b = new h(1);

        h() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l WeakReference<ld.p<g0, e0, k2>> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return Boolean.valueOf(it.get() == null);
        }
    }

    /* compiled from: PagedList.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32375b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0<T> f32376c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f32377d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0 f32378e;

        /* compiled from: PagedList.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Landroidx/paging/g0;", "Landroidx/paging/e0;", "Lkotlin/k2;", "it", "", "<anonymous>", "(Ljava/lang/ref/WeakReference;)Z"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<WeakReference<ld.p<? super g0, ? super e0, ? extends k2>>, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f32379b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l WeakReference<ld.p<g0, e0, k2>> it) {
                kotlin.jvm.internal.l0.p(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(s0<T> s0Var, g0 g0Var, e0 e0Var, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f32376c = s0Var;
            this.f32377d = g0Var;
            this.f32378e = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new i(this.f32376c, this.f32377d, this.f32378e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32375b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            kotlin.collections.w.L0(((s0) this.f32376c).loadStateListeners, a.f32379b);
            List list = ((s0) this.f32376c).loadStateListeners;
            g0 g0Var = this.f32377d;
            e0 e0Var = this.f32378e;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ld.p pVar = (ld.p) ((WeakReference) it.next()).get();
                if (pVar != null) {
                    pVar.invoke(g0Var, e0Var);
                }
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((i) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/s0$c;", "it", "", "<anonymous>", "(Ljava/lang/ref/WeakReference;)Z"}, k = 3, mv = {1, 5, 1})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<WeakReference<c>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f32380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(1);
            this.f32380b = cVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l WeakReference<c> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f32380b);
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Landroidx/paging/g0;", "Landroidx/paging/e0;", "Lkotlin/k2;", "it", "", "<anonymous>", "(Ljava/lang/ref/WeakReference;)Z"}, k = 3, mv = {1, 5, 1})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<WeakReference<ld.p<? super g0, ? super e0, ? extends k2>>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<g0, e0, k2> f32381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(ld.p<? super g0, ? super e0, k2> pVar) {
            super(1);
            this.f32381b = pVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l WeakReference<ld.p<g0, e0, k2>> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f32381b);
        }
    }

    public s0(@fg.l b1<?, T> pagingSource, @fg.l kotlinx.coroutines.r0 coroutineScope, @fg.l kotlinx.coroutines.m0 notifyDispatcher, @fg.l v0<T> storage, @fg.l e config) {
        kotlin.jvm.internal.l0.p(pagingSource, "pagingSource");
        kotlin.jvm.internal.l0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.l0.p(storage, "storage");
        kotlin.jvm.internal.l0.p(config, "config");
        this.pagingSource = pagingSource;
        this.coroutineScope = coroutineScope;
        this.notifyDispatcher = notifyDispatcher;
        this.storage = storage;
        this.config = config;
        this.requiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
        this.callbacks = new ArrayList();
        this.loadStateListeners = new ArrayList();
    }

    @kotlin.k(message = "DataSource is deprecated and has been replaced by PagingSource. PagedList offers indirect ways of controlling fetch ('loadAround()', 'retry()') so that you should not need to access the DataSource/PagingSource.")
    public static /* synthetic */ void G() {
    }

    @fg.l
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static final <K, T> s0<T> s(@fg.l b1<K, T> b1Var, @fg.m b1.b.c<K, T> cVar, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l kotlinx.coroutines.m0 m0Var, @fg.l kotlinx.coroutines.m0 m0Var2, @fg.m a<T> aVar, @fg.l e eVar, @fg.m K k4) {
        return INSTANCE.a(b1Var, cVar, r0Var, m0Var, m0Var2, aVar, eVar, k4);
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final e getConfig() {
        return this.config;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final kotlinx.coroutines.r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @fg.l
    public final m<?, T> F() {
        b1<?, T> O = O();
        if (O instanceof d0) {
            return ((d0) O).j();
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + ((Object) O.getClass().getSimpleName()) + " instead of a DataSource");
    }

    @fg.m
    public abstract Object H();

    public final int I() {
        return this.storage.getStorageCount();
    }

    @fg.l
    /* renamed from: K, reason: from getter */
    public final kotlinx.coroutines.m0 getNotifyDispatcher() {
        return this.notifyDispatcher;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final k0<T> L() {
        return this.storage;
    }

    @fg.l
    public b1<?, T> O() {
        return this.pagingSource;
    }

    public final int P() {
        return this.storage.getPositionOffset();
    }

    @fg.m
    /* renamed from: Q, reason: from getter */
    public final Runnable getRefreshRetryCallback() {
        return this.refreshRetryCallback;
    }

    /* renamed from: R, reason: from getter */
    public final int getRequiredRemainder() {
        return this.requiredRemainder;
    }

    public int S() {
        return this.storage.getSize();
    }

    @fg.l
    public final v0<T> T() {
        return this.storage;
    }

    /* renamed from: U */
    public abstract boolean getIsDetached();

    /* renamed from: V */
    public boolean getIsImmutable() {
        return getIsDetached();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final int W() {
        return this.storage.r();
    }

    public final void X(int index) {
        if (index < 0 || index >= S()) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", index, ", Size: ");
            a5.append(S());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        this.storage.P(index);
        Z(index);
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public abstract void Z(int index);

    @androidx.annotation.c1({c1.a.LIBRARY})
    public final void a0(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = kotlin.collections.w.X4(this.callbacks).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.a(position, count);
            }
        }
    }

    public final void b0(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = kotlin.collections.w.X4(this.callbacks).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.b(position, count);
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public final void d0(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = kotlin.collections.w.X4(this.callbacks).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.c(position, count);
            }
        }
    }

    public /* bridge */ Object e0(int i4) {
        return super.remove(i4);
    }

    public final void f0(@fg.l c callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
        kotlin.collections.w.L0(this.callbacks, new j(callback));
    }

    public final void g0(@fg.l ld.p<? super g0, ? super e0, k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        kotlin.collections.w.L0(this.loadStateListeners, new k(listener));
    }

    @Override // java.util.AbstractList, java.util.List
    @fg.m
    public T get(int index) {
        return this.storage.get(index);
    }

    public void h0() {
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void i0(@fg.l g0 loadType, @fg.l e0 loadState) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(loadState, "loadState");
    }

    public final void j0(@fg.m Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public final void k0(@fg.m Runnable refreshRetryCallback) {
        this.refreshRetryCallback = refreshRetryCallback;
    }

    @fg.l
    public final List<T> l0() {
        return getIsImmutable() ? this : new q1(this);
    }

    public final void p(@fg.l c callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
        kotlin.collections.w.L0(this.callbacks, g.f32373b);
        this.callbacks.add(new WeakReference<>(callback));
    }

    @kotlin.k(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    public final void q(@fg.m List<? extends T> previousSnapshot, @fg.l c callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (previousSnapshot != null && previousSnapshot != this) {
            INSTANCE.b(S(), previousSnapshot.size(), callback);
        }
        p(callback);
    }

    public final void r(@fg.l ld.p<? super g0, ? super e0, k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        kotlin.collections.w.L0(this.loadStateListeners, h.f32374b);
        this.loadStateListeners.add(new WeakReference<>(listener));
        w(listener);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i4) {
        return (T) e0(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return S();
    }

    public abstract void v();

    @androidx.annotation.c1({c1.a.LIBRARY})
    public abstract void w(@fg.l ld.p<? super g0, ? super e0, k2> callback);

    public final void x(@fg.l g0 type, @fg.l e0 state) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(state, "state");
        kotlinx.coroutines.k.f(this.coroutineScope, this.notifyDispatcher, null, new i(this, type, state, null), 2, null);
    }

    /* compiled from: PagedList.kt */
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData, which no longer supports constructing snapshots of loaded data manually.", replaceWith = @kotlin.x0(expression = "Pager.flow", imports = {"androidx.paging.Pager"}))
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB9\b\u0016\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0011B9\b\u0016\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0012J!\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ)\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010#¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00020*¢\u0006\u0004\b+\u0010,R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010-R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\"\u00102\u0012\u0004\b.\u00103R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00104R\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00104R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0018\u0010'\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106¨\u00067"}, d2 = {"Landroidx/paging/s0$b;", "", "Key", "Value", "Landroidx/paging/m;", "dataSource", "Landroidx/paging/s0$e;", "config", "<init>", "(Landroidx/paging/m;Landroidx/paging/s0$e;)V", "", "pageSize", "(Landroidx/paging/m;I)V", "Landroidx/paging/b1;", "pagingSource", "Landroidx/paging/b1$b$c;", "initialPage", "(Landroidx/paging/b1;Landroidx/paging/b1$b$c;Landroidx/paging/s0$e;)V", "(Landroidx/paging/b1;Landroidx/paging/b1$b$c;I)V", "Lkotlinx/coroutines/r0;", "coroutineScope", "d", "(Lkotlinx/coroutines/r0;)Landroidx/paging/s0$b;", "Ljava/util/concurrent/Executor;", "notifyExecutor", "i", "(Ljava/util/concurrent/Executor;)Landroidx/paging/s0$b;", "Lkotlinx/coroutines/m0;", "notifyDispatcher", "h", "(Lkotlinx/coroutines/m0;)Landroidx/paging/s0$b;", "fetchExecutor", "f", "fetchDispatcher", "e", "Landroidx/paging/s0$a;", "boundaryCallback", "c", "(Landroidx/paging/s0$a;)Landroidx/paging/s0$b;", "initialKey", "g", "(Ljava/lang/Object;)Landroidx/paging/s0$b;", "Landroidx/paging/s0;", "a", "()Landroidx/paging/s0;", "Landroidx/paging/b1;", "b", "Landroidx/paging/m;", "Landroidx/paging/b1$b$c;", "Landroidx/paging/s0$e;", "Lkotlinx/coroutines/r0;", "()V", "Lkotlinx/coroutines/m0;", "Landroidx/paging/s0$a;", "Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<Key, Value> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final b1<Key, Value> pagingSource;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private m<Key, Value> dataSource;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final b1.b.c<Key, Value> initialPage;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final e config;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private kotlinx.coroutines.r0 coroutineScope;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private kotlinx.coroutines.m0 notifyDispatcher;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private kotlinx.coroutines.m0 fetchDispatcher;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private a<Value> boundaryCallback;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Key initialKey;

        public b(@fg.l m<Key, Value> dataSource, @fg.l e config) {
            kotlin.jvm.internal.l0.p(dataSource, "dataSource");
            kotlin.jvm.internal.l0.p(config, "config");
            this.coroutineScope = b2.f79269b;
            this.pagingSource = null;
            this.dataSource = dataSource;
            this.initialPage = null;
            this.config = config;
        }

        private static /* synthetic */ void b() {
        }

        @fg.l
        public final s0<Value> a() {
            kotlinx.coroutines.m0 m0Var = this.fetchDispatcher;
            if (m0Var == null) {
                m0Var = kotlinx.coroutines.j1.c();
            }
            kotlinx.coroutines.m0 m0Var2 = m0Var;
            b1<Key, Value> b1Var = this.pagingSource;
            if (b1Var == null) {
                m<Key, Value> mVar = this.dataSource;
                b1Var = mVar == null ? null : new d0(m0Var2, mVar);
            }
            b1<Key, Value> b1Var2 = b1Var;
            if (b1Var2 instanceof d0) {
                ((d0) b1Var2).l(this.config.pageSize);
            }
            if (!(b1Var2 != null)) {
                throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource");
            }
            Companion companion = s0.INSTANCE;
            b1.b.c<Key, Value> cVar = this.initialPage;
            kotlinx.coroutines.r0 r0Var = this.coroutineScope;
            kotlinx.coroutines.m0 m0Var3 = this.notifyDispatcher;
            if (m0Var3 == null) {
                m0Var3 = kotlinx.coroutines.j1.e().j1();
            }
            return companion.a(b1Var2, cVar, r0Var, m0Var3, m0Var2, this.boundaryCallback, this.config, this.initialKey);
        }

        @fg.l
        public final b<Key, Value> c(@fg.m a<Value> boundaryCallback) {
            this.boundaryCallback = boundaryCallback;
            return this;
        }

        @fg.l
        public final b<Key, Value> d(@fg.l kotlinx.coroutines.r0 coroutineScope) {
            kotlin.jvm.internal.l0.p(coroutineScope, "coroutineScope");
            this.coroutineScope = coroutineScope;
            return this;
        }

        @fg.l
        public final b<Key, Value> e(@fg.l kotlinx.coroutines.m0 fetchDispatcher) {
            kotlin.jvm.internal.l0.p(fetchDispatcher, "fetchDispatcher");
            this.fetchDispatcher = fetchDispatcher;
            return this;
        }

        @fg.l
        @kotlin.k(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.x0(expression = "setFetchDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        public final b<Key, Value> f(@fg.l Executor fetchExecutor) {
            kotlin.jvm.internal.l0.p(fetchExecutor, "fetchExecutor");
            this.fetchDispatcher = kotlinx.coroutines.y1.c(fetchExecutor);
            return this;
        }

        @fg.l
        public final b<Key, Value> g(@fg.m Key initialKey) {
            this.initialKey = initialKey;
            return this;
        }

        @fg.l
        public final b<Key, Value> h(@fg.l kotlinx.coroutines.m0 notifyDispatcher) {
            kotlin.jvm.internal.l0.p(notifyDispatcher, "notifyDispatcher");
            this.notifyDispatcher = notifyDispatcher;
            return this;
        }

        @fg.l
        @kotlin.k(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.x0(expression = "setNotifyDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        public final b<Key, Value> i(@fg.l Executor notifyExecutor) {
            kotlin.jvm.internal.l0.p(notifyExecutor, "notifyExecutor");
            this.notifyDispatcher = kotlinx.coroutines.y1.c(notifyExecutor);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@fg.l m<Key, Value> dataSource, int i4) {
            this(dataSource, t0.b(i4, 0, false, 0, 0, 30, null));
            kotlin.jvm.internal.l0.p(dataSource, "dataSource");
        }

        public b(@fg.l b1<Key, Value> pagingSource, @fg.l b1.b.c<Key, Value> initialPage, @fg.l e config) {
            kotlin.jvm.internal.l0.p(pagingSource, "pagingSource");
            kotlin.jvm.internal.l0.p(initialPage, "initialPage");
            kotlin.jvm.internal.l0.p(config, "config");
            this.coroutineScope = b2.f79269b;
            this.pagingSource = pagingSource;
            this.dataSource = null;
            this.initialPage = initialPage;
            this.config = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@fg.l b1<Key, Value> pagingSource, @fg.l b1.b.c<Key, Value> initialPage, int i4) {
            this(pagingSource, initialPage, t0.b(i4, 0, false, 0, 0, 30, null));
            kotlin.jvm.internal.l0.p(pagingSource, "pagingSource");
            kotlin.jvm.internal.l0.p(initialPage, "initialPage");
        }
    }
}
