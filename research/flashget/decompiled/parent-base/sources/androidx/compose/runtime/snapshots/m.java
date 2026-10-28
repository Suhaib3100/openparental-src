package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.runtime.u4;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001-B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0000H ¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0000H ¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH ¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010\nJ\u000f\u0010'\u001a\u00020\bH\u0010¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\bH\u0010¢\u0006\u0004\b(\u0010\nJ\u000f\u0010)\u001a\u00020\bH\u0000¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010,R\"\u0010\u0005\u001a\u00020\u00048\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010)\u001a\u0004\b4\u0010,\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010:R\u001c\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010)\u0012\u0004\b<\u0010\nR$\u0010A\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00028P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b?\u0010,\"\u0004\b@\u00106R\u0014\u0010C\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0014\u0010E\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0011R\u0015\u0010G\u001a\u00020\u000f8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0011R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\"\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\bJ\u0010IR\u001c\u0010O\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010L8 X \u0004¢\u0006\u0006\u001a\u0004\bM\u0010N\u0082\u0001\u0004PQRS¨\u0006T"}, d2 = {"Landroidx/compose/runtime/snapshots/m;", "", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/t;)V", "Lkotlin/k2;", "d", "()V", "Lkotlin/Function1;", "readObserver", "D", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "", "p", "()Z", "T", "Lkotlin/Function0;", "block", "e", "(Lld/a;)Ljava/lang/Object;", "r", "()Landroidx/compose/runtime/snapshots/m;", "snapshot", "y", "(Landroidx/compose/runtime/snapshots/m;)V", "G", "oldSnapshot", "H", "s", "t", "Landroidx/compose/runtime/snapshots/p0;", "state", "v", "(Landroidx/compose/runtime/snapshots/p0;)V", "u", "b", "c", "x", "I", "w", "F", "()I", "a", "Landroidx/compose/runtime/snapshots/t;", "h", "()Landroidx/compose/runtime/snapshots/t;", "B", "(Landroidx/compose/runtime/snapshots/t;)V", "<set-?>", "g", "A", "(I)V", "Z", "f", "z", "(Z)V", "disposed", "j", "pinningTrackingHandle", "value", "n", "C", "writeCount", "m", "root", "l", "readOnly", "q", "isPinned", "k", "()Lld/l;", "o", "writeObserver", "Landroidx/compose/runtime/collection/d;", "i", "()Landroidx/compose/runtime/collection/d;", "modified", "Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/g;", "Landroidx/compose/runtime/snapshots/j;", "Landroidx/compose/runtime/snapshots/u0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#2:2295\n1714#2:2297\n82#3:2296\n82#3:2298\n1#4:2299\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n91#1:2295\n241#1:2297\n91#1:2296\n241#1:2298\n*E\n"})
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f17109f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private t invalid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinningTrackingHandle;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0012JQ\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b\u0019H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001a\u0010\u0012J-\u0010\u001f\u001a\u00020\u001e2\u001e\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u001e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u0003J\r\u0010$\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b(\u0010\u0018J\u0019\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/runtime/snapshots/m$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/k2;", "readObserver", "Landroidx/compose/runtime/snapshots/m;", "t", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "writeObserver", "Landroidx/compose/runtime/snapshots/e;", "r", "(Lld/l;Lld/l;)Landroidx/compose/runtime/snapshots/e;", "T", "Lkotlin/Function0;", "block", "e", "(Lld/a;)Ljava/lang/Object;", "R", "v", "h", "(Lld/l;Lld/l;Lld/a;)Ljava/lang/Object;", "c", "()Landroidx/compose/runtime/snapshots/m;", "Landroidx/compose/runtime/t0;", "w", "Lkotlin/Function2;", "", "observer", "Landroidx/compose/runtime/snapshots/h;", "k", "(Lld/p;)Landroidx/compose/runtime/snapshots/h;", "m", "(Lld/l;)Landroidx/compose/runtime/snapshots/h;", "g", "q", "", "j", "()I", "o", "previous", "p", "(Landroidx/compose/runtime/snapshots/m;)V", "d", "current", "", "f", "()Z", "isApplyObserverNotificationPending", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1#2:2295\n129#3,5:2296\n129#3,5:2301\n129#3,5:2306\n1714#4:2311\n1714#4:2313\n1714#4:2315\n1714#4:2317\n1714#4:2319\n82#5:2312\n82#5:2314\n82#5:2316\n82#5:2318\n82#5:2320\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n439#1:2296,5\n476#1:2301,5\n498#1:2306,5\n514#1:2311\n541#1:2313\n579#1:2315\n518#1:2317\n546#1:2319\n514#1:2312\n541#1:2314\n579#1:2316\n518#1:2318\n546#1:2320\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.m$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object i(Companion companion, ld.l lVar, ld.l lVar2, ld.a aVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                lVar = null;
            }
            if ((i4 & 2) != 0) {
                lVar2 = null;
            }
            return companion.h(lVar, lVar2, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(ld.p pVar) {
            List list;
            synchronized (v.K()) {
                list = v.f17176i;
                v.f17176i = kotlin.collections.w.q4(list, pVar);
                k2 k2Var = k2.f75408a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(ld.l lVar) {
            List list;
            synchronized (v.K()) {
                list = v.f17177j;
                v.f17177j = kotlin.collections.w.q4(list, lVar);
                k2 k2Var = k2.f75408a;
            }
            v.C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e s(Companion companion, ld.l lVar, ld.l lVar2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                lVar = null;
            }
            if ((i4 & 2) != 0) {
                lVar2 = null;
            }
            return companion.r(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ m u(Companion companion, ld.l lVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                lVar = null;
            }
            return companion.t(lVar);
        }

        @fg.l
        @w0
        public final m c() {
            u4 u4Var;
            u4Var = v.f17170c;
            return v.F((m) u4Var.a(), null, false, 6, null);
        }

        @fg.l
        public final m d() {
            return v.I();
        }

        public final <T> T e(@fg.l ld.a<? extends T> block) {
            m o4 = o();
            T invoke = block.invoke();
            m.INSTANCE.p(o4);
            return invoke;
        }

        public final boolean f() {
            androidx.compose.runtime.f fVar;
            fVar = v.f17180m;
            return fVar.get() > 0;
        }

        public final void g() {
            v.I().u();
        }

        public final <T> T h(@fg.m ld.l<Object, k2> readObserver, @fg.m ld.l<Object, k2> writeObserver, @fg.l ld.a<? extends T> block) {
            u4 u4Var;
            m t0Var;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            u4Var = v.f17170c;
            m mVar = (m) u4Var.a();
            if (mVar == null || (mVar instanceof e)) {
                t0Var = new t0(mVar instanceof e ? (e) mVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                t0Var = mVar.D(readObserver);
            }
            try {
                m r4 = t0Var.r();
                try {
                    return block.invoke();
                } finally {
                    t0Var.y(r4);
                }
            } finally {
                t0Var.d();
            }
        }

        @p1
        public final int j() {
            return kotlin.collections.w.V5(v.f17172e).size();
        }

        @fg.l
        public final h k(@fg.l final ld.p<? super Set<? extends Object>, ? super m, k2> observer) {
            ld.l lVar;
            List list;
            lVar = v.f17168a;
            v.B(lVar);
            synchronized (v.K()) {
                list = v.f17176i;
                v.f17176i = kotlin.collections.w.E4(list, observer);
                k2 k2Var = k2.f75408a;
            }
            return new h() { // from class: androidx.compose.runtime.snapshots.k
                @Override // androidx.compose.runtime.snapshots.h
                public final void dispose() {
                    m.Companion.l(ld.p.this);
                }
            };
        }

        @fg.l
        public final h m(@fg.l final ld.l<Object, k2> observer) {
            List list;
            synchronized (v.K()) {
                list = v.f17177j;
                v.f17177j = kotlin.collections.w.E4(list, observer);
                k2 k2Var = k2.f75408a;
            }
            v.C();
            return new h() { // from class: androidx.compose.runtime.snapshots.l
                @Override // androidx.compose.runtime.snapshots.h
                public final void dispose() {
                    m.Companion.n(ld.l.this);
                }
            };
        }

        @fg.m
        @w0
        public final m o() {
            u4 u4Var;
            u4 u4Var2;
            u4Var = v.f17170c;
            m mVar = (m) u4Var.a();
            if (mVar != null) {
                u4Var2 = v.f17170c;
                u4Var2.b(null);
            }
            return mVar;
        }

        @w0
        public final void p(@fg.m m previous) {
            u4 u4Var;
            if (previous != null) {
                u4Var = v.f17170c;
                u4Var.b(previous);
            }
        }

        public final void q() {
            AtomicReference atomicReference;
            boolean z4;
            synchronized (v.K()) {
                atomicReference = v.f17178k;
                androidx.compose.runtime.collection.d<p0> i4 = ((c) atomicReference.get()).i();
                z4 = false;
                if (i4 != null) {
                    if (i4.q()) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                v.C();
            }
        }

        @fg.l
        public final e r(@fg.m ld.l<Object, k2> readObserver, @fg.m ld.l<Object, k2> writeObserver) {
            e c02;
            m I = v.I();
            e eVar = I instanceof e ? (e) I : null;
            if (eVar == null || (c02 = eVar.c0(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c02;
        }

        @fg.l
        public final m t(@fg.m ld.l<Object, k2> readObserver) {
            return v.I().D(readObserver);
        }

        public final <R> R v(@fg.l ld.a<? extends R> block) {
            e s4 = s(this, null, null, 3, null);
            try {
                m r4 = s4.r();
                try {
                    R invoke = block.invoke();
                    s4.y(r4);
                    s4.M().a();
                    return invoke;
                } catch (Throwable th) {
                    s4.y(r4);
                    throw th;
                }
            } finally {
                s4.d();
            }
        }

        public final <T> T w(@fg.l ld.a<? extends T> block) {
            m c5 = c();
            try {
                m r4 = c5.r();
                try {
                    return block.invoke();
                } finally {
                    c5.y(r4);
                }
            } finally {
                c5.d();
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ m(int i4, t tVar, kotlin.jvm.internal.w wVar) {
        this(i4, tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m E(m mVar, ld.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        return mVar.D(lVar);
    }

    private static /* synthetic */ void j() {
    }

    public void A(int i4) {
        this.id = i4;
    }

    public void B(@fg.l t tVar) {
        this.invalid = tVar;
    }

    public void C(int i4) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @fg.l
    public abstract m D(@fg.m ld.l<Object, k2> readObserver);

    public final int F() {
        int i4 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i4;
    }

    @fg.m
    @c1
    public final m G() {
        return r();
    }

    @c1
    public final void H(@fg.m m oldSnapshot) {
        u4 u4Var;
        u4Var = v.f17170c;
        if (u4Var.a() == this) {
            y(oldSnapshot);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void I() {
        if (this.disposed) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public final void b() {
        synchronized (v.K()) {
            c();
            x();
            k2 k2Var = k2.f75408a;
        }
    }

    public void c() {
        v.f17172e = v.f17172e.m(getId());
    }

    public void d() {
        this.disposed = true;
        synchronized (v.K()) {
            w();
            k2 k2Var = k2.f75408a;
        }
    }

    public final <T> T e(@fg.l ld.a<? extends T> block) {
        m r4 = r();
        try {
            return block.invoke();
        } finally {
            y(r4);
        }
    }

    /* renamed from: f, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* renamed from: g, reason: from getter */
    public int getId() {
        return this.id;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public t getInvalid() {
        return this.invalid;
    }

    @fg.m
    public abstract androidx.compose.runtime.collection.d<p0> i();

    @fg.m
    public abstract ld.l<Object, k2> k();

    public abstract boolean l();

    @fg.l
    public abstract m m();

    public int n() {
        return 0;
    }

    @fg.m
    public abstract ld.l<Object, k2> o();

    public abstract boolean p();

    public final boolean q() {
        return this.pinningTrackingHandle >= 0;
    }

    @fg.m
    @w0
    public m r() {
        u4 u4Var;
        u4 u4Var2;
        u4Var = v.f17170c;
        m mVar = (m) u4Var.a();
        u4Var2 = v.f17170c;
        u4Var2.b(this);
        return mVar;
    }

    public abstract void s(@fg.l m snapshot);

    public abstract void t(@fg.l m snapshot);

    public abstract void u();

    public abstract void v(@fg.l p0 state);

    public final void w() {
        int i4 = this.pinningTrackingHandle;
        if (i4 >= 0) {
            v.e0(i4);
            this.pinningTrackingHandle = -1;
        }
    }

    public void x() {
        w();
    }

    @w0
    public void y(@fg.m m snapshot) {
        u4 u4Var;
        u4Var = v.f17170c;
        u4Var.b(snapshot);
    }

    public final void z(boolean z4) {
        this.disposed = z4;
    }

    private m(int i4, t tVar) {
        this.invalid = tVar;
        this.id = i4;
        this.pinningTrackingHandle = i4 != 0 ? v.j0(i4, getInvalid()) : -1;
    }
}
