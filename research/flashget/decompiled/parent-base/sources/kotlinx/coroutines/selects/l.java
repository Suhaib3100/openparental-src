package kotlinx.coroutines.selects;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.x;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;
import kotlin.x0;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.z1;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001<B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nJ/\u0010\u001b\u001a\u00028\u00002\u0010\u0010\u001a\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\r2\u0010\u0010\u001d\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0004\b \u0010\nJ5\u0010%\u001a\u00020\r*\u00020!2\u001c\u0010$\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\"H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&JG\u0010*\u001a\u00020\r\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00010(2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0)H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J[\u0010/\u001a\u00020\r\"\u0004\b\u0001\u0010,\"\u0004\b\u0002\u0010'*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020-2\u0006\u0010.\u001a\u00028\u00012\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u000b0)H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\r*\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J#\u0010<\u001a\u00020\r2\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010;\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b>\u0010\u000fJ!\u0010@\u001a\u0002012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010?\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010?\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010EH\u0096\u0002¢\u0006\u0004\bG\u0010HR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010I\u001a\u0004\bJ\u0010KR(\u0010N\u001a\u0014\u0012\u000e\u0012\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010OR\u0016\u0010S\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010OR\u0014\u0010V\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0014\u0010Z\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0011\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000b0[8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lkotlinx/coroutines/selects/l;", "R", "Lkotlinx/coroutines/n;", "Lkotlinx/coroutines/selects/c;", "Lkotlinx/coroutines/selects/n;", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;)V", "e0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "clauseObject", "Lkotlin/k2;", "E", "(Ljava/lang/Object;)V", "r0", "n0", "internalResult", "", "p0", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lkotlinx/coroutines/selects/l$a;", "f0", "(Ljava/lang/Object;)Lkotlinx/coroutines/selects/l$a;", "N", "clause", "k0", "(Lkotlinx/coroutines/selects/l$a;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "selectedClause", "F", "(Lkotlinx/coroutines/selects/l$a;)V", "W", "Lkotlinx/coroutines/selects/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "b", "(Lkotlinx/coroutines/selects/e;Lld/l;)V", "Q", "Lkotlinx/coroutines/selects/g;", "Lkotlin/Function2;", "c", "(Lkotlinx/coroutines/selects/g;Lld/p;)V", "P", "Lkotlinx/coroutines/selects/i;", "param", "m", "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lld/p;)V", "", "reregister", "l0", "(Lkotlinx/coroutines/selects/l$a;Z)V", "Lkotlinx/coroutines/m1;", "disposableHandle", "f", "(Lkotlinx/coroutines/m1;)V", "Lkotlinx/coroutines/internal/p0;", "segment", "index", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "d", "result", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/r;", "o0", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/r;", "", "cause", "n", "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "e", "I", "indexInSegment", "g0", "()Z", "inRegistrationPhase", "i0", "isSelected", "h0", "isCancelled", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
@r1({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
/* loaded from: classes7.dex */
public class l<R> extends kotlinx.coroutines.n implements kotlinx.coroutines.selects.c<R>, n<R> {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f81048g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, ProtectedSandApp.s("袱\u0001"));

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object disposableHandleOrSegment;

    @fg.m
    @x
    private volatile Object state = o.f81075f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<l<R>.a> clauses = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int indexInSegment = -1;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object internalResult = o.f81078i;

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¸\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n\u0012U\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012g\u0010\u0014\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010%Rc\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&Rc\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%Ru\u0010\u0014\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010-\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lkotlinx/coroutines/selects/l$a;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/selects/m;", "select", "param", "Lkotlin/k2;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/l;Ljava/lang/Object;Lld/q;Lld/q;Ljava/lang/Object;Ljava/lang/Object;Lld/q;)V", "Lkotlinx/coroutines/selects/l;", "", "e", "(Lkotlinx/coroutines/selects/l;)Z", "result", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "()V", "a", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)Lld/l;", "Ljava/lang/Object;", "Lld/q;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    public final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final Object clauseObject;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.q<Object, m<?>, Object, k2> regFunc;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.q<Object, Object, Object, Object> processResFunc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object param;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object block;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public final ld.q<m<?>, Object, Object, ld.l<Throwable, k2>> onCancellationConstructor;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public Object disposableHandleOrSegment;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l Object obj, @fg.l ld.q<Object, ? super m<?>, Object, k2> qVar, @fg.l ld.q<Object, Object, Object, ? extends Object> qVar2, @fg.m Object obj2, @fg.l Object obj3, @fg.m ld.q<? super m<?>, Object, Object, ? extends ld.l<? super Throwable, k2>> qVar3) {
            this.clauseObject = obj;
            this.regFunc = qVar;
            this.processResFunc = qVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = qVar3;
        }

        @fg.m
        public final ld.l<Throwable, k2> a(@fg.l m<?> select, @fg.m Object internalResult) {
            ld.q<m<?>, Object, Object, ld.l<Throwable, k2>> qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return qVar.R(select, this.param, internalResult);
            }
            return null;
        }

        public final void b() {
            Object obj = this.disposableHandleOrSegment;
            l<R> lVar = l.this;
            if (obj instanceof p0) {
                ((p0) obj).q(this.indexInSegment, null, lVar.getContext());
                return;
            }
            m1 m1Var = obj instanceof m1 ? (m1) obj : null;
            if (m1Var != null) {
                m1Var.dispose();
            }
        }

        @fg.m
        public final Object c(@fg.m Object obj, @fg.l kotlin.coroutines.d<? super R> dVar) {
            Object obj2 = this.block;
            if (this.param == o.l()) {
                l0.n(obj2, ProtectedSandApp.s("袺\u0001"));
                return ((ld.l) obj2).invoke(dVar);
            }
            l0.n(obj2, ProtectedSandApp.s("袻\u0001"));
            return ((ld.p) obj2).invoke(obj, dVar);
        }

        @fg.m
        public final Object d(@fg.m Object result) {
            return this.processResFunc.R(this.clauseObject, this.param, result);
        }

        public final boolean e(@fg.l l<R> select) {
            this.regFunc.R(this.clauseObject, select, this.param);
            return ((l) select).internalResult == o.f81078i;
        }
    }

    /* compiled from: Select.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {431, 434}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f81063b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f81064c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<R> f81065d;

        /* renamed from: e, reason: collision with root package name */
        int f81066e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<R> lVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f81065d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f81064c = obj;
            this.f81066e |= Integer.MIN_VALUE;
            return this.f81065d.e0(this);
        }
    }

    /* compiled from: Select.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {w.h.f22560p}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f81067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<R> f81068c;

        /* renamed from: d, reason: collision with root package name */
        int f81069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l<R> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f81068c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f81067b = obj;
            this.f81069d |= Integer.MIN_VALUE;
            return this.f81068c.k0(null, null, this);
        }
    }

    public l(@fg.l kotlin.coroutines.g gVar) {
        this.context = gVar;
    }

    private final void E(Object clauseObject) {
        List<l<R>.a> list = this.clauses;
        l0.m(list);
        List<l<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(androidx.databinding.a.a(ProtectedSandApp.s("袲\u0001"), clauseObject).toString());
            }
        }
    }

    private final void F(l<R>.a selectedClause) {
        List<l<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (l<R>.a aVar : list) {
            if (aVar != selectedClause) {
                aVar.b();
            }
        }
        f81048g.set(this, o.f81076g);
        this.internalResult = o.f81078i;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(kotlin.coroutines.d<? super R> dVar) {
        Object obj = f81048g.get(this);
        l0.n(obj, ProtectedSandApp.s("袳\u0001"));
        l<R>.a aVar = (a) obj;
        Object obj2 = this.internalResult;
        F(aVar);
        return aVar.c(aVar.d(obj2), dVar);
    }

    @w0
    static /* synthetic */ <R> Object Z(l<R> lVar, kotlin.coroutines.d<? super R> dVar) {
        return lVar.i0() ? lVar.N(dVar) : lVar.e0(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059 A[PHI: r6
      0x0059: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0056, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(kotlin.coroutines.d<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.l.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.l$b r0 = (kotlinx.coroutines.selects.l.b) r0
            int r1 = r0.f81066e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81066e = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.l$b r0 = new kotlinx.coroutines.selects.l$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f81064c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81066e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2a
            kotlin.a1.n(r6)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "袴\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            throw r6
        L36:
            java.lang.Object r2 = r0.f81063b
            kotlinx.coroutines.selects.l r2 = (kotlinx.coroutines.selects.l) r2
            kotlin.a1.n(r6)
            goto L4d
        L3e:
            kotlin.a1.n(r6)
            r0.f81063b = r5
            r0.f81066e = r4
            java.lang.Object r6 = r5.r0(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            r6 = 0
            r0.f81063b = r6
            r0.f81066e = r3
            java.lang.Object r6 = r2.N(r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.l.e0(kotlin.coroutines.d):java.lang.Object");
    }

    private final l<R>.a f0(Object clauseObject) {
        List<l<R>.a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        l<R>.a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException((ProtectedSandApp.s("袵\u0001") + clauseObject + ProtectedSandApp.s("袶\u0001")).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0() {
        Object obj = f81048g.get(this);
        return obj == o.f81075f || (obj instanceof List);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        return f81048g.get(this) == o.f81077h;
    }

    private final boolean i0() {
        return f81048g.get(this) instanceof a;
    }

    private final void j0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(kotlinx.coroutines.selects.l<R>.a r5, java.lang.Object r6, kotlin.coroutines.d<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.l.c
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.l$c r0 = (kotlinx.coroutines.selects.l.c) r0
            int r1 = r0.f81069d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81069d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.l$c r0 = new kotlinx.coroutines.selects.l$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f81067b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81069d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L27
            kotlin.a1.n(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "袴\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.a1.n(r7)
            java.lang.Object r6 = r5.d(r6)
            r0.f81069d = r3
            java.lang.Object r7 = r5.c(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.l.k0(kotlinx.coroutines.selects.l$a, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ void m0(l lVar, a aVar, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("袷\u0001"));
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        lVar.l0(aVar, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(Object clauseObject) {
        l<R>.a f02 = f0(clauseObject);
        l0.m(f02);
        f02.disposableHandleOrSegment = null;
        f02.indexInSegment = -1;
        l0(f02, true);
    }

    private final int p0(Object clauseObject, Object internalResult) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81048g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.p) {
                l<R>.a f02 = f0(clauseObject);
                if (f02 == null) {
                    continue;
                } else {
                    ld.l<Throwable, k2> a5 = f02.a(this, internalResult);
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, f02)) {
                        this.internalResult = internalResult;
                        if (o.o((kotlinx.coroutines.p) obj, a5)) {
                            return 0;
                        }
                        this.internalResult = null;
                        return 2;
                    }
                }
            } else {
                if (l0.g(obj, o.f81076g) ? true : obj instanceof a) {
                    return 3;
                }
                if (l0.g(obj, o.f81077h)) {
                    return 2;
                }
                if (l0.g(obj, o.f81075f)) {
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, kotlin.collections.w.k(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException((ProtectedSandApp.s("袸\u0001") + obj).toString());
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, kotlin.collections.w.E4((Collection) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final void q0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r0(kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81048g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == o.f81075f) {
                if (androidx.concurrent.futures.c.a(f81048g, this, obj, qVar)) {
                    qVar.k0(this);
                    break;
                }
            } else if (obj instanceof List) {
                if (androidx.concurrent.futures.c.a(f81048g, this, obj, o.f81075f)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        n0(it.next());
                    }
                }
            } else {
                if (!(obj instanceof a)) {
                    throw new IllegalStateException((ProtectedSandApp.s("袹\u0001") + obj).toString());
                }
                qVar.W(k2.f75408a, ((a) obj).a(this, this.internalResult));
            }
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : k2.f75408a;
    }

    @fg.m
    @w0
    public Object W(@fg.l kotlin.coroutines.d<? super R> dVar) {
        return Z(this, dVar);
    }

    @Override // kotlinx.coroutines.y3
    public void a(@fg.l p0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // kotlinx.coroutines.selects.c
    public void b(@fg.l e eVar, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        m0(this, new a(eVar.getClauseObject(), eVar.a(), eVar.c(), o.l(), lVar, eVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.c
    public <Q> void c(@fg.l g<? extends Q> gVar, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        m0(this, new a(gVar.getClauseObject(), gVar.a(), gVar.c(), null, pVar, gVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.m
    public void d(@fg.m Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // kotlinx.coroutines.selects.m
    public void f(@fg.l m1 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // kotlinx.coroutines.selects.m
    @fg.l
    public kotlin.coroutines.g getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.selects.c
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Replaced with the same extension function", replaceWith = @x0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @z1
    public void h(long j4, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        kotlinx.coroutines.selects.b.a(this, j4, lVar);
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
        n(th);
        return k2.f75408a;
    }

    @Override // kotlinx.coroutines.selects.c
    public <P, Q> void j(@fg.l i<? super P, ? extends Q> iVar, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        m(iVar, null, pVar);
    }

    @Override // kotlinx.coroutines.selects.m
    public boolean l(@fg.l Object clauseObject, @fg.m Object result) {
        return p0(clauseObject, result) == 0;
    }

    @kd.i(name = "register")
    public final void l0(@fg.l l<R>.a aVar, boolean z4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81048g;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z4) {
            E(aVar.clauseObject);
        }
        if (!aVar.e(this)) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z4) {
            List<l<R>.a> list = this.clauses;
            l0.m(list);
            list.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
        aVar.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.c
    public <P, Q> void m(@fg.l i<? super P, ? extends Q> iVar, P p4, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        m0(this, new a(iVar.getClauseObject(), iVar.a(), iVar.c(), p4, pVar, iVar.b()), false, 1, null);
    }

    @Override // kotlinx.coroutines.o
    public void n(@fg.m Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81048g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == o.f81076g) {
                return;
            }
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, o.f81077h));
        List<l<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.internalResult = o.f81078i;
        this.clauses = null;
    }

    @fg.l
    public final r o0(@fg.l Object clauseObject, @fg.m Object result) {
        return o.d(p0(clauseObject, result));
    }
}
