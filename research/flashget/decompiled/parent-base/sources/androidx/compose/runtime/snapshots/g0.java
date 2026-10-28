package androidx.compose.runtime.snapshots;

import androidx.collection.g2;
import androidx.collection.j2;
import androidx.collection.n2;
import androidx.compose.animation.core.k1;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.snapshots.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: SnapshotStateObserver.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00013B0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\b¢\u0006\u0004\b\u001b\u0010\nJ$\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u0002H\u0082\b¢\u0006\u0004\b\u001c\u0010\nJ-\u0010\u001f\u001a\u00020\u0019\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010#\u001a\u00020\u0004\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010!\u001a\u00028\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J0\u0010*\u001a\u00020\u00042!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b*\u0010\nJ\r\u0010+\u001a\u00020\u0004¢\u0006\u0004\b+\u0010\u000fJ\r\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\u000fJ%\u00100\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\u000fR5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R(\u00109\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000105j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R,\u0010@\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00104R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010;R\u0018\u0010N\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010P¨\u0006R"}, d2 = {"Landroidx/compose/runtime/snapshots/g0;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/k2;", "Lkotlin/r0;", "name", "callback", "onChangedExecutor", "<init>", "(Lld/l;)V", "", "m", "()Z", "u", "()V", "", "set", "i", "(Ljava/util/Set;)V", "r", "()Ljava/util/Set;", "", "t", "()Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/g0$a;", "block", "o", "s", "T", "onChanged", "n", "(Lld/l;)Landroidx/compose/runtime/snapshots/g0$a;", "scope", "onValueChangedForScope", "q", "(Ljava/lang/Object;Lld/l;Lld/a;)V", "x", "(Lld/a;)V", "k", "(Ljava/lang/Object;)V", "predicate", "l", "v", "w", "changes", "Landroidx/compose/runtime/snapshots/m;", "snapshot", "p", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/m;)V", "j", "a", "Lld/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "d", "Lld/p;", "applyObserver", "e", "readObserver", "Landroidx/compose/runtime/collection/g;", "f", "Landroidx/compose/runtime/collection/g;", "observedScopeMaps", "Landroidx/compose/runtime/snapshots/h;", "g", "Landroidx/compose/runtime/snapshots/h;", "applyUnsubscribe", "h", "isPaused", "Landroidx/compose/runtime/snapshots/g0$a;", "currentMap", "", "J", "currentMapThreadId", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,652:1\n184#1,2:657\n186#1,2:670\n190#1,2:698\n192#1,2:715\n190#1,2:717\n192#1,2:734\n184#1,2:736\n186#1,2:749\n1208#2:653\n1187#2,2:654\n1#3:656\n460#4,11:659\n460#4,11:672\n838#4,15:683\n838#4,15:700\n838#4,15:719\n460#4,11:738\n366#4,12:751\n728#4,2:763\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n68#1:657,2\n68#1:670,2\n290#1:698,2\n290#1:715,2\n301#1:717,2\n301#1:734,2\n334#1:736,2\n334#1:749,2\n176#1:653\n176#1:654,2\n68#1:659,11\n185#1:672,11\n191#1:683,15\n290#1:700,15\n301#1:719,15\n334#1:738,11\n347#1:751,12\n350#1:763,2\n*E\n"})
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f17062k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<ld.a<k2>, k2> onChangedExecutor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sendingNotifications;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h applyUnsubscribe;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a currentMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<Set<? extends Object>, m, k2> applyObserver = new b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Object, k2> readObserver = new c();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a> observedScopeMaps = new androidx.compose.runtime.collection.g<>(new a[16], 0);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long currentMapThreadId = -1;

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J7\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0011J0\u0010\u001f\u001a\u00020\u00032!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001d0\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00032\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0003¢\u0006\u0004\b,\u0010#R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010>R\u001e\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010AR\u0017\u0010F\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b,\u0010D\u001a\u0004\b:\u0010ER\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001e\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107R<\u0010L\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ij\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030(\u0012\u0006\u0012\u0004\u0018\u00010\u0001`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010K¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/g0$a;", "", "Lkotlin/Function1;", "Lkotlin/k2;", "onChanged", "<init>", "(Lld/l;)V", "value", "", "currentToken", "currentScope", "Landroidx/collection/g2;", "recordedValues", "m", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/g2;)V", "scope", "d", "(Ljava/lang/Object;)V", "n", "(Ljava/lang/Object;Ljava/lang/Object;)V", "l", "readObserver", "Lkotlin/Function0;", "block", "j", "(Ljava/lang/Object;Lld/l;Lld/a;)V", "e", "Lkotlin/r0;", "name", "", "predicate", "o", "h", "()Z", "c", "()V", "", "changes", "k", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/r0;", "derivedState", "p", "(Landroidx/compose/runtime/r0;)V", "i", "a", "Lld/l;", "g", "()Lld/l;", "b", "Ljava/lang/Object;", "Landroidx/collection/g2;", "currentScopeReads", "I", "Landroidx/compose/runtime/collection/i;", "Landroidx/compose/runtime/collection/i;", "valueToScopes", "Landroidx/collection/j2;", "f", "Landroidx/collection/j2;", "scopeToValues", "Landroidx/collection/k2;", "Landroidx/collection/k2;", "invalidated", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "statesToReread", "Landroidx/compose/runtime/s0;", "Landroidx/compose/runtime/s0;", "()Landroidx/compose/runtime/s0;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 12 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,652:1\n1208#2:653\n1187#2,2:654\n415#3,3:656\n373#3,6:659\n383#3,3:666\n386#3,2:670\n419#3:672\n420#3:674\n389#3,6:675\n421#3:681\n373#3,6:693\n383#3,3:700\n386#3,2:704\n389#3,6:710\n401#3,4:717\n373#3,6:721\n383#3,3:728\n386#3,2:732\n406#3,2:734\n389#3,6:736\n408#3:742\n401#3,4:758\n373#3,6:762\n383#3,3:769\n386#3,2:773\n406#3,2:775\n389#3,6:777\n408#3:783\n1810#4:665\n1672#4:669\n1810#4:699\n1672#4:703\n1810#4:727\n1672#4:731\n1810#4:750\n1672#4:754\n1810#4:768\n1672#4:772\n1810#4:818\n1672#4:822\n1810#4:842\n1672#4:846\n1810#4:887\n1672#4:891\n1810#4:924\n1672#4:928\n1672#4:961\n1810#4:981\n1672#4:985\n1810#4:1026\n1672#4:1030\n1810#4:1063\n1672#4:1067\n1810#4:1112\n1672#4:1116\n1810#4:1143\n1672#4:1147\n51#5:673\n51#5:682\n51#5:801\n388#6,6:683\n394#6,2:690\n48#7:689\n460#7,11:1085\n843#8:692\n845#8,4:706\n849#8:716\n1047#9:743\n1049#9:757\n1050#9,3:784\n1053#9:793\n363#10,6:744\n373#10,3:751\n376#10,2:755\n379#10,6:787\n396#11,2:794\n399#11:945\n401#11:1084\n108#12,5:796\n114#12:944\n70#13,5:802\n70#13,5:826\n78#13,4:858\n78#13:870\n70#13,5:871\n78#13,4:903\n81#13:907\n70#13,5:908\n78#13,4:940\n70#13,5:965\n78#13,4:997\n78#13:1009\n70#13,5:1010\n78#13,4:1042\n81#13:1046\n70#13,5:1047\n78#13,4:1079\n70#13,5:1096\n78#13,4:1128\n267#14,4:807\n237#14,7:811\n248#14,3:819\n251#14,2:823\n272#14:825\n267#14,4:831\n237#14,7:835\n248#14,3:843\n251#14,2:847\n272#14,2:849\n254#14,6:851\n274#14:857\n273#14:862\n254#14,6:863\n274#14:869\n267#14,4:876\n237#14,7:880\n248#14,3:888\n251#14,2:892\n272#14,2:894\n254#14,6:896\n274#14:902\n267#14,4:913\n237#14,7:917\n248#14,3:925\n251#14,2:929\n272#14,2:931\n254#14,6:933\n274#14:939\n237#14,14:947\n251#14,2:962\n272#14:964\n267#14,4:970\n237#14,7:974\n248#14,3:982\n251#14,2:986\n272#14,2:988\n254#14,6:990\n274#14:996\n273#14:1001\n254#14,6:1002\n274#14:1008\n267#14,4:1015\n237#14,7:1019\n248#14,3:1027\n251#14,2:1031\n272#14,2:1033\n254#14,6:1035\n274#14:1041\n267#14,4:1052\n237#14,7:1056\n248#14,3:1064\n251#14,2:1068\n272#14,2:1070\n254#14,6:1072\n274#14:1078\n267#14,4:1101\n237#14,7:1105\n248#14,3:1113\n251#14,2:1117\n272#14,2:1119\n254#14,6:1121\n274#14:1127\n267#14,4:1132\n237#14,7:1136\n248#14,3:1144\n251#14,2:1148\n272#14,2:1150\n254#14,6:1152\n274#14:1158\n1855#15:946\n1856#15:1083\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n397#1:653\n397#1:654,2\n469#1:656,3\n469#1:659,6\n469#1:666,3\n469#1:670,2\n469#1:672\n469#1:674\n469#1:675,6\n469#1:681\n512#1:693,6\n512#1:700,3\n512#1:704,2\n512#1:710,6\n526#1:717,4\n526#1:721,6\n526#1:728,3\n526#1:732,2\n526#1:734,2\n526#1:736,6\n526#1:742\n538#1:758,4\n538#1:762,6\n538#1:769,3\n538#1:773,2\n538#1:775,2\n538#1:777,6\n538#1:783\n469#1:665\n469#1:669\n512#1:699\n512#1:703\n526#1:727\n526#1:731\n535#1:750\n535#1:754\n538#1:768\n538#1:772\n588#1:818\n588#1:822\n599#1:842\n599#1:846\n599#1:887\n599#1:891\n610#1:924\n610#1:928\n588#1:961\n599#1:981\n599#1:985\n599#1:1026\n599#1:1030\n610#1:1063\n610#1:1067\n630#1:1112\n630#1:1116\n647#1:1143\n647#1:1147\n471#1:673\n479#1:682\n581#1:801\n499#1:683,6\n499#1:690,2\n499#1:689\n617#1:1085,11\n512#1:692\n512#1:706,4\n512#1:716\n535#1:743\n535#1:757\n535#1:784,3\n535#1:793\n535#1:744,6\n535#1:751,3\n535#1:755,2\n535#1:787,6\n579#1:794,2\n579#1:945\n579#1:1084\n579#1:796,5\n579#1:944\n588#1:802,5\n599#1:826,5\n599#1:858,4\n588#1:870\n599#1:871,5\n599#1:903,4\n588#1:907\n610#1:908,5\n610#1:940,4\n599#1:965,5\n599#1:997,4\n588#1:1009\n599#1:1010,5\n599#1:1042,4\n588#1:1046\n610#1:1047,5\n610#1:1079,4\n630#1:1096,5\n630#1:1128,4\n588#1:807,4\n588#1:811,7\n588#1:819,3\n588#1:823,2\n588#1:825\n599#1:831,4\n599#1:835,7\n599#1:843,3\n599#1:847,2\n599#1:849,2\n599#1:851,6\n599#1:857\n588#1:862\n588#1:863,6\n588#1:869\n599#1:876,4\n599#1:880,7\n599#1:888,3\n599#1:892,2\n599#1:894,2\n599#1:896,6\n599#1:902\n610#1:913,4\n610#1:917,7\n610#1:925,3\n610#1:929,2\n610#1:931,2\n610#1:933,6\n610#1:939\n588#1:947,14\n588#1:962,2\n588#1:964\n599#1:970,4\n599#1:974,7\n599#1:982,3\n599#1:986,2\n599#1:988,2\n599#1:990,6\n599#1:996\n588#1:1001\n588#1:1002,6\n588#1:1008\n599#1:1015,4\n599#1:1019,7\n599#1:1027,3\n599#1:1031,2\n599#1:1033,2\n599#1:1035,6\n599#1:1041\n610#1:1052,4\n610#1:1056,7\n610#1:1064,3\n610#1:1068,2\n610#1:1070,2\n610#1:1072,6\n610#1:1078\n630#1:1101,4\n630#1:1105,7\n630#1:1113,3\n630#1:1117,2\n630#1:1119,2\n630#1:1121,6\n630#1:1127\n647#1:1132,4\n647#1:1136,7\n647#1:1144,3\n647#1:1148,2\n647#1:1150,2\n647#1:1152,6\n647#1:1158\n579#1:946\n579#1:1083\n*E\n"})
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.l<Object, k2> onChanged;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Object currentScope;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private g2<Object> currentScopeReads;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int deriveStateScopeCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int currentToken = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.collection.i<Object> valueToScopes = new androidx.compose.runtime.collection.i<>();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final j2<Object, g2<Object>> scopeToValues = new j2<>(0, 1, null);

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.collection.k2<Object> invalidated = new androidx.collection.k2<>(0, 1, null);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.collection.g<androidx.compose.runtime.r0<?>> statesToReread = new androidx.compose.runtime.collection.g<>(new androidx.compose.runtime.r0[16], 0);

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.s0 derivedStateObserver = new C0324a();

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.collection.i<androidx.compose.runtime.r0<?>> dependencyToDerivedStates = new androidx.compose.runtime.collection.i<>();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final HashMap<androidx.compose.runtime.r0<?>, Object> recordedDerivedStateValues = new HashMap<>();

        /* compiled from: SnapshotStateObserver.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/g0$a$a", "Landroidx/compose/runtime/s0;", "Landroidx/compose/runtime/r0;", "derivedState", "Lkotlin/k2;", "b", "(Landroidx/compose/runtime/r0;)V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.snapshots.g0$a$a, reason: collision with other inner class name */
        public static final class C0324a implements androidx.compose.runtime.s0 {
            C0324a() {
            }

            @Override // androidx.compose.runtime.s0
            public void a(@fg.l androidx.compose.runtime.r0<?> derivedState) {
                a aVar = a.this;
                aVar.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.s0
            public void b(@fg.l androidx.compose.runtime.r0<?> derivedState) {
                a.this.deriveStateScopeCount++;
            }
        }

        public a(@fg.l ld.l<Object, k2> lVar) {
            this.onChanged = lVar;
        }

        private final void d(Object scope) {
            int i4 = this.currentToken;
            g2<Object> g2Var = this.currentScopeReads;
            if (g2Var == null) {
                return;
            }
            long[] jArr = g2Var.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j4 = jArr[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i10 = (i5 << 3) + i7;
                            Object obj = g2Var.keys[i10];
                            boolean z4 = g2Var.values[i10] != i4;
                            if (z4) {
                                n(scope, obj);
                            }
                            if (z4) {
                                g2Var.j0(i10);
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        return;
                    }
                }
                if (i5 == length) {
                    return;
                } else {
                    i5++;
                }
            }
        }

        private final void m(Object value, int currentToken, Object currentScope, g2<Object> recordedValues) {
            int i4;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int c02 = recordedValues.c0(value, currentToken, -1);
            if (!(value instanceof androidx.compose.runtime.r0) || c02 == currentToken) {
                i4 = -1;
            } else {
                r0.a P = ((androidx.compose.runtime.r0) value).P();
                this.recordedDerivedStateValues.put(value, P.a());
                n2<p0> b5 = P.b();
                androidx.compose.runtime.collection.i<androidx.compose.runtime.r0<?>> iVar = this.dependencyToDerivedStates;
                iVar.h(value);
                Object[] objArr = b5.keys;
                long[] jArr = b5.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr[i5];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & 255) < 128) {
                                    p0 p0Var = (p0) objArr[(i5 << 3) + i7];
                                    if (p0Var instanceof q0) {
                                        i.Companion companion = i.INSTANCE;
                                        ((q0) p0Var).y(2);
                                    }
                                    iVar.a(p0Var, value);
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                i4 = -1;
            }
            if (c02 == i4) {
                if (value instanceof q0) {
                    i.Companion companion2 = i.INSTANCE;
                    ((q0) value).y(2);
                }
                this.valueToScopes.a(value, currentScope);
            }
        }

        private final void n(Object scope, Object value) {
            this.valueToScopes.g(value, scope);
            if (!(value instanceof androidx.compose.runtime.r0) || this.valueToScopes.c(value)) {
                return;
            }
            this.dependencyToDerivedStates.h(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void c() {
            this.valueToScopes.b();
            this.scopeToValues.K();
            this.dependencyToDerivedStates.b();
            this.recordedDerivedStateValues.clear();
        }

        public final void e(@fg.l Object scope) {
            g2<Object> k02 = this.scopeToValues.k0(scope);
            if (k02 == null) {
                return;
            }
            Object[] objArr = k02.keys;
            int[] iArr = k02.values;
            long[] jArr = k02.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            int i10 = iArr[i7];
                            n(scope, obj);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length) {
                    return;
                } else {
                    i4++;
                }
            }
        }

        @fg.l
        /* renamed from: f, reason: from getter */
        public final androidx.compose.runtime.s0 getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        @fg.l
        public final ld.l<Object, k2> g() {
            return this.onChanged;
        }

        public final boolean h() {
            return this.scopeToValues.y();
        }

        public final void i() {
            androidx.collection.k2<Object> k2Var = this.invalidated;
            ld.l<Object, k2> lVar = this.onChanged;
            Object[] objArr = k2Var.elements;
            long[] jArr = k2Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j4 = jArr[i4];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j4) < 128) {
                                lVar.invoke(objArr[(i4 << 3) + i6]);
                            }
                            j4 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            k2Var.K();
        }

        public final void j(@fg.l Object scope, @fg.l ld.l<Object, k2> readObserver, @fg.l ld.a<k2> block) {
            Object obj = this.currentScope;
            g2<Object> g2Var = this.currentScopeReads;
            int i4 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.p(scope);
            if (this.currentToken == -1) {
                this.currentToken = v.I().getId();
            }
            androidx.compose.runtime.s0 s0Var = this.derivedStateObserver;
            androidx.compose.runtime.collection.g<androidx.compose.runtime.s0> c5 = o4.c();
            try {
                c5.b(s0Var);
                m.INSTANCE.h(readObserver, null, block);
                c5.n0(c5.getSize() - 1);
                Object obj2 = this.currentScope;
                kotlin.jvm.internal.l0.m(obj2);
                d(obj2);
                this.currentScope = obj;
                this.currentScopeReads = g2Var;
                this.currentToken = i4;
            } catch (Throwable th) {
                c5.n0(c5.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02d5 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean k(@fg.l java.util.Set<? extends java.lang.Object> r38) {
            /*
                Method dump skipped, instructions count: 1530
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.g0.a.k(java.util.Set):boolean");
        }

        public final void l(@fg.l Object value) {
            Object obj = this.currentScope;
            kotlin.jvm.internal.l0.m(obj);
            int i4 = this.currentToken;
            g2<Object> g2Var = this.currentScopeReads;
            if (g2Var == null) {
                g2Var = new g2<>(0, 1, null);
                this.currentScopeReads = g2Var;
                this.scopeToValues.q0(obj, g2Var);
                k2 k2Var = k2.f75408a;
            }
            m(value, i4, obj, g2Var);
        }

        public final void o(@fg.l ld.l<Object, Boolean> predicate) {
            long[] jArr;
            int i4;
            long[] jArr2;
            int i5;
            long j4;
            int i6;
            long j5;
            int i7;
            j2<Object, g2<Object>> j2Var = this.scopeToValues;
            long[] jArr3 = j2Var.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j6 = jArr3[i10];
                long j7 = -9187201950435737472L;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j6 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = j2Var.keys[i14];
                            g2 g2Var = (g2) j2Var.values[i14];
                            Boolean invoke = predicate.invoke(obj);
                            if (invoke.booleanValue()) {
                                Object[] objArr = g2Var.keys;
                                int[] iArr = g2Var.values;
                                long[] jArr4 = g2Var.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i6 = i12;
                                    int i15 = 0;
                                    while (true) {
                                        long j10 = jArr4[i15];
                                        i5 = i10;
                                        j4 = j6;
                                        j5 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                            for (int i17 = 0; i17 < i16; i17++) {
                                                if ((j10 & 255) < 128) {
                                                    int i18 = (i15 << 3) + i17;
                                                    Object obj2 = objArr[i18];
                                                    int i19 = iArr[i18];
                                                    n(obj, obj2);
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i16 != 8) {
                                                break;
                                            }
                                        }
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                        i10 = i5;
                                        j6 = j4;
                                    }
                                } else {
                                    i5 = i10;
                                    j4 = j6;
                                    i6 = i12;
                                    j5 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i5 = i10;
                                j4 = j6;
                                i6 = i12;
                                j5 = j7;
                            }
                            if (invoke.booleanValue()) {
                                j2Var.o0(i14);
                            }
                            i7 = 8;
                        } else {
                            jArr2 = jArr3;
                            i5 = i10;
                            j4 = j6;
                            i6 = i12;
                            j5 = j7;
                            i7 = i11;
                        }
                        j6 = j4 >> i7;
                        i13++;
                        i11 = i7;
                        j7 = j5;
                        jArr3 = jArr2;
                        i12 = i6;
                        i10 = i5;
                    }
                    jArr = jArr3;
                    int i20 = i10;
                    if (i12 != i11) {
                        return;
                    } else {
                        i4 = i20;
                    }
                } else {
                    jArr = jArr3;
                    i4 = i10;
                }
                if (i4 == length) {
                    return;
                }
                i10 = i4 + 1;
                jArr3 = jArr;
            }
        }

        public final void p(@fg.l androidx.compose.runtime.r0<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i4;
            g2<Object> g2Var;
            j2<Object, g2<Object>> j2Var = this.scopeToValues;
            int id2 = v.I().getId();
            Object p4 = this.valueToScopes.e().p(derivedState);
            if (p4 == null) {
                return;
            }
            if (!(p4 instanceof androidx.collection.k2)) {
                g2<Object> p5 = j2Var.p(p4);
                if (p5 == null) {
                    p5 = new g2<>(0, 1, null);
                    j2Var.q0(p4, p5);
                    k2 k2Var = k2.f75408a;
                }
                m(derivedState, id2, p4, p5);
                return;
            }
            androidx.collection.k2 k2Var2 = (androidx.collection.k2) p4;
            Object[] objArr = k2Var2.elements;
            long[] jArr3 = k2Var2.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j4 = jArr3[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i7) {
                        if ((j4 & 255) < 128) {
                            Object obj = objArr[(i5 << 3) + i10];
                            g2<Object> p6 = j2Var.p(obj);
                            jArr2 = jArr3;
                            if (p6 == null) {
                                g2Var = new g2<>(0, 1, null);
                                j2Var.q0(obj, g2Var);
                                k2 k2Var3 = k2.f75408a;
                            } else {
                                g2Var = p6;
                            }
                            m(derivedState, id2, obj, g2Var);
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i4 = i6;
                        }
                        j4 >>= i4;
                        i10++;
                        i6 = i4;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i7 != i6) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i5 == length) {
                    return;
                }
                i5++;
                jArr3 = jArr;
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/m;", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<Set<? extends Object>, m, k2> {
        b() {
            super(2);
        }

        public final void a(@fg.l Set<? extends Object> set, @fg.l m mVar) {
            g0.this.i(set);
            if (g0.this.m()) {
                g0.this.u();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(Set<? extends Object> set, m mVar) {
            a(set, mVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Object, k2> {
        c() {
            super(1);
        }

        public final void a(@fg.l Object obj) {
            if (g0.this.isPaused) {
                return;
            }
            androidx.compose.runtime.collection.g gVar = g0.this.observedScopeMaps;
            g0 g0Var = g0.this;
            synchronized (gVar) {
                a aVar = g0Var.currentMap;
                kotlin.jvm.internal.l0.m(aVar);
                aVar.l(obj);
                k2 k2Var = k2.f75408a;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,652:1\n460#2,11:653\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n87#1:653,11\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        d() {
            super(0);
        }

        public final void a() {
            do {
                androidx.compose.runtime.collection.g gVar = g0.this.observedScopeMaps;
                g0 g0Var = g0.this;
                synchronized (gVar) {
                    try {
                        if (!g0Var.sendingNotifications) {
                            g0Var.sendingNotifications = true;
                            try {
                                androidx.compose.runtime.collection.g gVar2 = g0Var.observedScopeMaps;
                                int size = gVar2.getSize();
                                if (size > 0) {
                                    Object[] L = gVar2.L();
                                    int i4 = 0;
                                    do {
                                        ((a) L[i4]).i();
                                        i4++;
                                    } while (i4 < size);
                                }
                                g0Var.sendingNotifications = false;
                            } finally {
                            }
                        }
                        k2 k2Var = k2.f75408a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (g0.this.m());
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@fg.l ld.l<? super ld.a<k2>, k2> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set<? extends Object> set) {
        Object obj;
        List D4;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                D4 = set;
            } else if (obj instanceof Set) {
                D4 = kotlin.collections.w.O(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    t();
                    throw new KotlinNothingValueException();
                }
                D4 = kotlin.collections.w.D4((Collection) obj, kotlin.collections.w.k(set));
            }
        } while (!k1.a(this.pendingChanges, obj, D4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z4;
        synchronized (this.observedScopeMaps) {
            z4 = this.sendingNotifications;
        }
        if (z4) {
            return false;
        }
        boolean z5 = false;
        while (true) {
            Set<? extends Object> r4 = r();
            if (r4 == null) {
                return z5;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
                    int size = gVar.getSize();
                    if (size > 0) {
                        a[] L = gVar.L();
                        int i4 = 0;
                        do {
                            if (!L[i4].k(r4) && !z5) {
                                z5 = false;
                                i4++;
                            }
                            z5 = true;
                            i4++;
                        } while (i4 < size);
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> a n(ld.l<? super T, k2> onChanged) {
        a aVar;
        androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
        int size = gVar.getSize();
        if (size > 0) {
            a[] L = gVar.L();
            int i4 = 0;
            do {
                aVar = L[i4];
                if (aVar.g() == onChanged) {
                    break;
                }
                i4++;
            } while (i4 < size);
        }
        aVar = null;
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        kotlin.jvm.internal.l0.n(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((ld.l) u1.q(onChanged, 1));
        this.observedScopeMaps.b(aVar3);
        return aVar3;
    }

    private final void o(ld.l<? super a, k2> block) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
                int size = gVar.getSize();
                if (size > 0) {
                    a[] L = gVar.L();
                    int i4 = 0;
                    do {
                        block.invoke(L[i4]);
                        i4++;
                    } while (i4 < size);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Set<Object> r() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    t();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!k1.a(this.pendingChanges, obj, obj2));
        return set;
    }

    private final void s(ld.l<? super a, Boolean> block) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
                int size = gVar.getSize();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    if (block.invoke(gVar.L()[i5]).booleanValue()) {
                        i4++;
                    } else if (i4 > 0) {
                        gVar.L()[i5 - i4] = gVar.L()[i5];
                    }
                }
                int i6 = size - i4;
                kotlin.collections.l.M1(gVar.L(), null, i6, size);
                gVar.u0(i6);
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Void t() {
        throw androidx.compose.runtime.u.a("Unexpected notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        this.onChangedExecutor.invoke(new d());
    }

    public final void j() {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
                int size = gVar.getSize();
                if (size > 0) {
                    a[] L = gVar.L();
                    int i4 = 0;
                    do {
                        L[i4].c();
                        i4++;
                    } while (i4 < size);
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(@fg.l Object scope) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
                int size = gVar.getSize();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    a aVar = gVar.L()[i5];
                    aVar.e(scope);
                    if (!aVar.h()) {
                        i4++;
                    } else if (i4 > 0) {
                        gVar.L()[i5 - i4] = gVar.L()[i5];
                    }
                }
                int i6 = size - i4;
                kotlin.collections.l.M1(gVar.L(), null, i6, size);
                gVar.u0(i6);
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(@fg.l ld.l<Object, Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.g<a> gVar = this.observedScopeMaps;
                int size = gVar.getSize();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    a aVar = gVar.L()[i5];
                    aVar.o(predicate);
                    if (!aVar.h()) {
                        i4++;
                    } else if (i4 > 0) {
                        gVar.L()[i5 - i4] = gVar.L()[i5];
                    }
                }
                int i6 = size - i4;
                kotlin.collections.l.M1(gVar.L(), null, i6, size);
                gVar.u0(i6);
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @fg.p
    public final void p(@fg.l Set<? extends Object> changes, @fg.l m snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void q(@fg.l T scope, @fg.l ld.l<? super T, k2> onValueChangedForScope, @fg.l ld.a<k2> block) {
        a n4;
        synchronized (this.observedScopeMaps) {
            n4 = n(onValueChangedForScope);
        }
        boolean z4 = this.isPaused;
        a aVar = this.currentMap;
        long j4 = this.currentMapThreadId;
        if (j4 != -1 && j4 != androidx.compose.runtime.c.a()) {
            StringBuilder a5 = f0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j4, "), currentThread={id=");
            a5.append(androidx.compose.runtime.c.a());
            a5.append(", name=");
            a5.append(androidx.compose.runtime.c.b());
            a5.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            throw new IllegalArgumentException(a5.toString().toString());
        }
        try {
            this.isPaused = false;
            this.currentMap = n4;
            this.currentMapThreadId = Thread.currentThread().getId();
            n4.j(scope, this.readObserver, block);
        } finally {
            this.currentMap = aVar;
            this.isPaused = z4;
            this.currentMapThreadId = j4;
        }
    }

    public final void v() {
        this.applyUnsubscribe = m.INSTANCE.k(this.applyObserver);
    }

    public final void w() {
        h hVar = this.applyUnsubscribe;
        if (hVar != null) {
            hVar.dispose();
        }
    }

    @kotlin.k(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @x0(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void x(@fg.l ld.a<k2> block) {
        boolean z4 = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z4;
        }
    }
}
