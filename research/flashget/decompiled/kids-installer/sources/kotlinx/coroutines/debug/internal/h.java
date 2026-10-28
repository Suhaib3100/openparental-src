package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.a1;
import kotlin.collections.b0;
import kotlin.collections.e1;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.sequences.v;
import kotlin.text.Typography;
import kotlin.text.e0;
import kotlin.text.x;
import kotlinx.coroutines.internal.n0;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u2;
import q3.p;

/* compiled from: DebugProbesImpl.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0095\u0001B\n\b\u0002¢\u0006\u0005\b\u0094\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010>J\u0016\u0010?\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0082\u0010¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bI\u0010JJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010B*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bc\u0010$J)\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010\\\u001a\u00020[2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010gJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR$\u0010v\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010uR\u0016\u0010w\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010?R\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010yR#\u0010\u0080\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010{\u001a\u0005\b\u0081\u0001\u0010}\"\u0005\b\u0082\u0001\u0010\u007fR$\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0084\u0001R!\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010uR\"\u0010\u008a\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u008e\u0001\u001a\u00020\u0011*\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008b\u0001\u0010XR\u001b\u0010\u0091\u0001\u001a\u00020\u0003*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010}¨\u0006\u0096\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/h;", "", "Lkotlin/Function1;", "", "Lkotlin/m2;", "t", "()Lq3/l;", "M", "()V", "N", "Lkotlinx/coroutines/n2;", "", "Lkotlinx/coroutines/debug/internal/f;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "d", "(Lkotlinx/coroutines/n2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/h$a;", "Lkotlin/coroutines/g;", "create", "", "i", "(Lq3/p;)Ljava/util/List;", "P", "(Ljava/lang/Object;)Ljava/lang/String;", "y", "(Lkotlinx/coroutines/debug/internal/h$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/q0;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/q0;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/d;", "frame", "S", "(Lkotlin/coroutines/d;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/e;", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/String;)V", "I", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlin/coroutines/jvm/internal/e;", "owner", "T", "(Lkotlinx/coroutines/debug/internal/h$a;Lkotlin/coroutines/d;Ljava/lang/String;)V", "B", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/debug/internal/h$a;", "C", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlinx/coroutines/debug/internal/h$a;", "Lkotlinx/coroutines/debug/internal/n;", "O", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/n;", "completion", "e", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/n;)Lkotlin/coroutines/d;", "E", "(Lkotlinx/coroutines/debug/internal/h$a;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", "job", "w", "(Lkotlinx/coroutines/n2;)Ljava/lang/String;", "h", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/e;", "info", "m", "(Lkotlinx/coroutines/debug/internal/e;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/k;", "k", "f", "l", "(Lkotlinx/coroutines/debug/internal/e;Ljava/util/List;)Ljava/util/List;", "G", "(Lkotlin/coroutines/d;)V", "H", "F", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "b", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/c;", "Lkotlinx/coroutines/debug/internal/c;", "capturedCoroutinesMap", "installations", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", "u", "K", "enableCreationStackTraces", "Lq3/l;", "dynamicAttach", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "getDebugString$annotations", "(Lkotlinx/coroutines/n2;)V", "debugString", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "z", "isInstalled", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final h f27675a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final String ARTIFICIAL_FRAME_MESSAGE = ProtectedSandApp.s("崅");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final SimpleDateFormat dateFormat;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private static Thread weakRefCleanerThread;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final kotlinx.coroutines.debug.internal.c<a<?>, Boolean> capturedCoroutinesMap;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final /* synthetic */ i f27680f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27681g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final ReentrantReadWriteLock coroutineStateLock;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static boolean sanitizeStackTraces;
    private static volatile int installations;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static boolean enableCreationStackTraces;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private static final q3.l<Boolean, m2> dynamicAttach;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final kotlinx.coroutines.debug.internal.c<CoroutineStackFrame, kotlinx.coroutines.debug.internal.f> callerInfoCache;

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/debug/internal/h$a;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/lang/StackTraceElement;", "I", "Lkotlin/z0;", "result", "Lkotlin/m2;", "s", "(Ljava/lang/Object;)V", "", "toString", "o", "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/debug/internal/f;", "p", "Lkotlinx/coroutines/debug/internal/f;", "info", "q", "Lkotlin/coroutines/jvm/internal/e;", "frame", "Lkotlin/coroutines/g;", "l", "()Lkotlin/coroutines/g;", "context", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/f;Lkotlin/coroutines/jvm/internal/e;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class a<T> implements Continuation<T>, CoroutineStackFrame {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final Continuation<T> delegate;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.debug.internal.f info;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final CoroutineStackFrame frame;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d Continuation<? super T> continuation, @d5.d kotlinx.coroutines.debug.internal.f fVar, @d5.e CoroutineStackFrame coroutineStackFrame) {
            this.delegate = continuation;
            this.info = fVar;
            this.frame = coroutineStackFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @d5.e
        /* renamed from: I */
        public StackTraceElement getStackTraceElement() {
            CoroutineStackFrame coroutineStackFrame = this.frame;
            if (coroutineStackFrame != null) {
                return coroutineStackFrame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @d5.e
        /* renamed from: i */
        public CoroutineStackFrame getCallerFrame() {
            CoroutineStackFrame coroutineStackFrame = this.frame;
            if (coroutineStackFrame != null) {
                return coroutineStackFrame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        @d5.d
        /* renamed from: l */
        public CoroutineContext getF23291o() {
            return this.delegate.getF23291o();
        }

        @Override // kotlin.coroutines.Continuation
        public void s(@d5.d Object result) {
            h.f27675a.E(this);
            this.delegate.s(result);
        }

        @d5.d
        public String toString() {
            return this.delegate.toString();
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/h$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/h$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/h$c"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<a<?>, kotlinx.coroutines.debug.internal.e> {
        public b() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.debug.internal.e N(@d5.d a<?> aVar) {
            CoroutineContext c6;
            if (h.f27675a.y(aVar) || (c6 = aVar.info.c()) == null) {
                return null;
            }
            return new kotlinx.coroutines.debug.internal.e(aVar.info, c6);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/h$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/h$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c<R> extends Lambda implements q3.l<a<?>, R> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<a<?>, CoroutineContext, R> f27690p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p<? super a<?>, ? super CoroutineContext, ? extends R> pVar) {
            super(1);
            this.f27690p = pVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R N(@d5.d a<?> aVar) {
            CoroutineContext c6;
            if (h.f27675a.y(aVar) || (c6 = aVar.info.c()) == null) {
                return null;
            }
            return this.f27690p.g0(aVar, c6);
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(Long.valueOf(((a) t5).info.sequenceNumber), Long.valueOf(((a) t6).info.sequenceNumber));
            return l5;
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/h$a;", "it", "", "a", "(Lkotlinx/coroutines/debug/internal/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<a<?>, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f27691p = new e();

        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d a<?> aVar) {
            return Boolean.valueOf(!h.f27675a.y(aVar));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(Long.valueOf(((a) t5).info.sequenceNumber), Long.valueOf(((a) t6).info.sequenceNumber));
            return l5;
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/h$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/h$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/h$c"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class g extends Lambda implements q3.l<a<?>, k> {
        public g() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k N(@d5.d a<?> aVar) {
            CoroutineContext c6;
            if (h.f27675a.y(aVar) || (c6 = aVar.info.c()) == null) {
                return null;
            }
            return new k(aVar.info, c6);
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.debug.internal.h$h, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0415h extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0415h f27692p = new C0415h();

        C0415h() {
            super(0);
        }

        public final void a() {
            h.callerInfoCache.p();
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            a();
            return m2.f23662a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.i] */
    static {
        h hVar = new h();
        f27675a = hVar;
        dateFormat = new SimpleDateFormat(ProtectedSandApp.s("崆"));
        capturedCoroutinesMap = new kotlinx.coroutines.debug.internal.c<>(false, 1, null);
        final long j5 = 0;
        f27680f = new Object(j5) { // from class: kotlinx.coroutines.debug.internal.i
            volatile long sequenceNumber;

            {
                this.sequenceNumber = j5;
            }
        };
        coroutineStateLock = new ReentrantReadWriteLock();
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        dynamicAttach = hVar.t();
        callerInfoCache = new kotlinx.coroutines.debug.internal.c<>(true);
        f27681g = AtomicLongFieldUpdater.newUpdater(i.class, ProtectedSandApp.s("崇"));
    }

    private h() {
    }

    private final boolean A(StackTraceElement stackTraceElement) {
        boolean s22;
        s22 = e0.s2(stackTraceElement.getClassName(), ProtectedSandApp.s("崈"), false, 2, null);
        return s22;
    }

    private final a<?> B(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return C(coroutineStackFrame);
        }
        return null;
    }

    private final a<?> C(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof a)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (a) coroutineStackFrame;
    }

    private final void D(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print(ProtectedSandApp.s("崉") + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(a<?> owner) {
        CoroutineStackFrame I;
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame f6 = owner.info.f();
        if (f6 == null || (I = I(f6)) == null) {
            return;
        }
        callerInfoCache.remove(I);
    }

    private final CoroutineStackFrame I(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> J(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i5 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i6 = length2 - 1;
                if (l0.g(stackTrace[length2].getClassName(), ProtectedSandApp.s("崊"))) {
                    i5 = length2;
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                length2 = i6;
            }
        }
        boolean z5 = sanitizeStackTraces;
        String s5 = ProtectedSandApp.s("崋");
        if (!z5) {
            int i7 = length - i5;
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            while (i8 < i7) {
                arrayList.add(i8 == 0 ? q0.d(s5) : stackTrace[i8 + i5]);
                i8++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i5) + 1);
        arrayList2.add(q0.d(s5));
        while (true) {
            i5++;
            while (i5 < length) {
                if (A(stackTrace[i5])) {
                    arrayList2.add(stackTrace[i5]);
                    int i9 = i5 + 1;
                    while (i9 < length && A(stackTrace[i9])) {
                        i9++;
                    }
                    int i10 = i9 - 1;
                    int i11 = i10;
                    while (i11 > i5 && stackTrace[i11].getFileName() == null) {
                        i11--;
                    }
                    if (i11 > i5 && i11 < i10) {
                        arrayList2.add(stackTrace[i11]);
                    }
                    arrayList2.add(stackTrace[i10]);
                    i5 = i9;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i5]);
        }
    }

    private final void M() {
        weakRefCleanerThread = kotlin.concurrent.b.c(false, true, null, ProtectedSandApp.s("崌"), 0, C0415h.f27692p, 21, null);
    }

    private final void N() {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final n O(List<StackTraceElement> list) {
        n nVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                nVar = new n(nVar, listIterator.previous());
            }
        }
        return nVar;
    }

    private final String P(Object obj) {
        return ProtectedSandApp.s("崍") + obj + Typography.f27126b;
    }

    private final void R(CoroutineStackFrame frame, String state) {
        ReentrantReadWriteLock.ReadLock readLock = coroutineStateLock.readLock();
        readLock.lock();
        try {
            h hVar = f27675a;
            if (hVar.z()) {
                kotlinx.coroutines.debug.internal.c<CoroutineStackFrame, kotlinx.coroutines.debug.internal.f> cVar = callerInfoCache;
                kotlinx.coroutines.debug.internal.f remove = cVar.remove(frame);
                if (remove == null) {
                    a<?> C = hVar.C(frame);
                    if (C != null && (remove = C.info) != null) {
                        CoroutineStackFrame f6 = remove.f();
                        CoroutineStackFrame I = f6 != null ? hVar.I(f6) : null;
                        if (I != null) {
                            cVar.remove(I);
                        }
                    }
                    return;
                }
                remove.j(state, (Continuation) frame);
                CoroutineStackFrame I2 = hVar.I(frame);
                if (I2 == null) {
                    return;
                }
                cVar.put(I2, remove);
                m2 m2Var = m2.f23662a;
            }
        } finally {
            readLock.unlock();
        }
    }

    private final void S(Continuation<?> frame, String state) {
        if (z()) {
            if (l0.g(state, ProtectedSandApp.s("崎")) && KotlinVersion.f27230u.p(1, 3, 30)) {
                CoroutineStackFrame coroutineStackFrame = frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                R(coroutineStackFrame, state);
                return;
            }
            a<?> B = B(frame);
            if (B == null) {
                return;
            }
            T(B, frame, state);
        }
    }

    private final void T(a<?> owner, Continuation<?> frame, String state) {
        ReentrantReadWriteLock.ReadLock readLock = coroutineStateLock.readLock();
        readLock.lock();
        try {
            if (f27675a.z()) {
                owner.info.j(state, frame);
                m2 m2Var = m2.f23662a;
            }
        } finally {
            readLock.unlock();
        }
    }

    private final void d(n2 n2Var, Map<n2, kotlinx.coroutines.debug.internal.f> map, StringBuilder sb, String str) {
        Object G2;
        kotlinx.coroutines.debug.internal.f fVar = map.get(n2Var);
        if (fVar != null) {
            G2 = j0.G2(fVar.h());
            String str2 = fVar.get_state();
            StringBuilder a6 = r.a(str);
            a6.append(r(n2Var));
            a6.append(ProtectedSandApp.s("崏"));
            a6.append(str2);
            a6.append(ProtectedSandApp.s("崐"));
            a6.append((StackTraceElement) G2);
            a6.append('\n');
            sb.append(a6.toString());
            str = str + '\t';
        } else if (!(n2Var instanceof n0)) {
            StringBuilder a7 = r.a(str);
            a7.append(r(n2Var));
            a7.append('\n');
            sb.append(a7.toString());
            str = str + '\t';
        }
        Iterator<n2> it = n2Var.F().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> e(Continuation<? super T> completion, n frame) {
        if (!z()) {
            return completion;
        }
        a<?> aVar = new a<>(completion, new kotlinx.coroutines.debug.internal.f(completion.getF23291o(), frame, f27681g.incrementAndGet(f27680f)), frame);
        kotlinx.coroutines.debug.internal.c<a<?>, Boolean> cVar = capturedCoroutinesMap;
        cVar.put(aVar, Boolean.TRUE);
        if (!z()) {
            cVar.clear();
        }
        return aVar;
    }

    private final <R> List<R> i(p<? super a<?>, ? super CoroutineContext, ? extends R> create) {
        Sequence A1;
        Sequence K2;
        Sequence p12;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f27675a;
            if (!hVar.z()) {
                throw new IllegalStateException(ProtectedSandApp.s("崑").toString());
            }
            A1 = j0.A1(hVar.q());
            K2 = v.K2(A1, new d());
            p12 = v.p1(K2, new c(create));
            return v.c3(p12);
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    private final void j(PrintStream out) {
        Sequence A1;
        Sequence p02;
        Sequence<a> K2;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f27675a;
            if (!hVar.z()) {
                throw new IllegalStateException(ProtectedSandApp.s("崙").toString());
            }
            out.print(ProtectedSandApp.s("崒") + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
            A1 = j0.A1(hVar.q());
            p02 = v.p0(A1, e.f27691p);
            K2 = v.K2(p02, new f());
            for (a aVar : K2) {
                kotlinx.coroutines.debug.internal.f fVar = aVar.info;
                List<StackTraceElement> h5 = fVar.h();
                h hVar2 = f27675a;
                List<StackTraceElement> n5 = hVar2.n(fVar.get_state(), fVar.lastObservedThread, h5);
                out.print(ProtectedSandApp.s("崕") + aVar.delegate + ProtectedSandApp.s("崖") + ((l0.g(fVar.get_state(), ProtectedSandApp.s("崓")) && n5 == h5) ? fVar.get_state() + ProtectedSandApp.s("崔") : fVar.get_state()));
                if (h5.isEmpty()) {
                    out.print(ProtectedSandApp.s("崗") + q0.d(ProtectedSandApp.s("崘")));
                    hVar2.D(out, fVar.e());
                } else {
                    hVar2.D(out, n5);
                }
            }
            m2 m2Var = m2.f23662a;
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    private final List<StackTraceElement> n(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object a6;
        if (!l0.g(state, ProtectedSandApp.s("崚")) || thread == null) {
            return coroutineTrace;
        }
        try {
            Result.a aVar = Result.f27242p;
            a6 = Result.b(thread.getStackTrace());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = a1.a(th);
        }
        if (Result.i(a6)) {
            a6 = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a6;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i5];
            if (l0.g(stackTraceElement.getClassName(), ProtectedSandApp.s("崛")) && l0.g(stackTraceElement.getMethodName(), ProtectedSandApp.s("崜")) && l0.g(stackTraceElement.getFileName(), ProtectedSandApp.s("崝"))) {
                break;
            }
            i5++;
        }
        Pair<Integer, Integer> o5 = o(i5, stackTraceElementArr, coroutineTrace);
        int intValue = o5.a().intValue();
        int intValue2 = o5.b().intValue();
        if (intValue == -1) {
            return coroutineTrace;
        }
        ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i5) - intValue) - 1) - intValue2);
        int i6 = i5 - intValue2;
        for (int i7 = 0; i7 < i6; i7++) {
            arrayList.add(stackTraceElementArr[i7]);
        }
        int size = coroutineTrace.size();
        for (int i8 = intValue + 1; i8 < size; i8++) {
            arrayList.add(coroutineTrace.get(i8));
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> o(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i5 = 0; i5 < 3; i5++) {
            int p5 = f27675a.p((indexOfResumeWith - 1) - i5, actualTrace, coroutineTrace);
            if (p5 != -1) {
                return new Pair<>(Integer.valueOf(p5), Integer.valueOf(i5));
            }
        }
        return new Pair<>(-1, 0);
    }

    private final int p(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        Object Pe;
        Pe = t.Pe(actualTrace, frameIndex);
        StackTraceElement stackTraceElement = (StackTraceElement) Pe;
        if (stackTraceElement == null) {
            return -1;
        }
        int i5 = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (l0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && l0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && l0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return capturedCoroutinesMap.f();
    }

    private final String r(n2 n2Var) {
        return n2Var instanceof u2 ? ((u2) n2Var).z1() : n2Var.toString();
    }

    private static /* synthetic */ void s(n2 n2Var) {
    }

    private final q3.l<Boolean, m2> t() {
        Object a6;
        Object newInstance;
        try {
            Result.a aVar = Result.f27242p;
            newInstance = Class.forName(ProtectedSandApp.s("崞")).getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = a1.a(th);
        }
        if (newInstance == null) {
            throw new NullPointerException(ProtectedSandApp.s("崟"));
        }
        a6 = Result.b((q3.l) u1.q(newInstance, 1));
        if (Result.i(a6)) {
            a6 = null;
        }
        return (q3.l) a6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(a<?> aVar) {
        n2 n2Var;
        CoroutineContext c6 = aVar.info.c();
        if (c6 == null || (n2Var = (n2) c6.b(n2.INSTANCE)) == null || !n2Var.m()) {
            return false;
        }
        capturedCoroutinesMap.remove(aVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public final <T> Continuation<T> F(@d5.d Continuation<? super T> completion) {
        if (!z()) {
            return completion;
        }
        if (B(completion) != null) {
            return completion;
        }
        return e(completion, enableCreationStackTraces ? O(J(new Exception())) : null);
    }

    public final void G(@d5.d Continuation<?> frame) {
        S(frame, ProtectedSandApp.s("崠"));
    }

    public final void H(@d5.d Continuation<?> frame) {
        S(frame, ProtectedSandApp.s("崡"));
    }

    public final void K(boolean z5) {
        enableCreationStackTraces = z5;
    }

    public final void L(boolean z5) {
        sanitizeStackTraces = z5;
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f27675a;
            if (!hVar.z()) {
                throw new IllegalStateException(ProtectedSandApp.s("崢").toString());
            }
            installations--;
            if (installations != 0) {
                return;
            }
            hVar.N();
            capturedCoroutinesMap.clear();
            callerInfoCache.clear();
            if (kotlinx.coroutines.debug.internal.a.f27621a.a()) {
                while (i5 < readHoldCount) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return;
            }
            q3.l<Boolean, m2> lVar = dynamicAttach;
            if (lVar != null) {
                lVar.N(Boolean.FALSE);
            }
            m2 m2Var = m2.f23662a;
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    public final void f(@d5.d PrintStream out) {
        synchronized (out) {
            f27675a.j(out);
            m2 m2Var = m2.f23662a;
        }
    }

    @d5.d
    public final List<kotlinx.coroutines.debug.internal.e> g() {
        Sequence A1;
        Sequence K2;
        Sequence p12;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f27675a;
            if (!hVar.z()) {
                throw new IllegalStateException(ProtectedSandApp.s("崣").toString());
            }
            A1 = j0.A1(hVar.q());
            K2 = v.K2(A1, new d());
            p12 = v.p1(K2, new b());
            return v.c3(p12);
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    @d5.d
    public final Object[] h() {
        String m32;
        String p5;
        String name;
        List<kotlinx.coroutines.debug.internal.e> g5 = g();
        int size = g5.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.e eVar : g5) {
            CoroutineContext context = eVar.getContext();
            t0 t0Var = (t0) context.b(t0.INSTANCE);
            Long l5 = null;
            String P = (t0Var == null || (name = t0Var.getName()) == null) ? null : P(name);
            o0 o0Var = (o0) context.b(o0.INSTANCE);
            String P2 = o0Var != null ? P(o0Var) : null;
            StringBuilder a6 = androidx.appcompat.view.g.a(ProtectedSandApp.s("崤"), P, ProtectedSandApp.s("崥"));
            s0 s0Var = (s0) context.b(s0.INSTANCE);
            if (s0Var != null) {
                l5 = Long.valueOf(s0Var.getId());
            }
            a6.append(l5);
            a6.append(ProtectedSandApp.s("崦"));
            a6.append(P2);
            a6.append(ProtectedSandApp.s("崧"));
            a6.append(eVar.getSequenceNumber());
            a6.append(ProtectedSandApp.s("崨"));
            a6.append(eVar.getState());
            a6.append(ProtectedSandApp.s("崩"));
            p5 = x.p(a6.toString());
            arrayList3.add(p5);
            arrayList2.add(eVar.getLastObservedFrame());
            arrayList.add(eVar.getLastObservedThread());
        }
        Object[] objArr = new Object[4];
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("崪"));
        m32 = j0.m3(arrayList3, null, null, null, 0, null, null, 63, null);
        objArr[0] = c1.c.a(sb, m32, ']');
        Object[] array = arrayList.toArray(new Thread[0]);
        String s5 = ProtectedSandApp.s("崫");
        if (array == null) {
            throw new NullPointerException(s5);
        }
        objArr[1] = array;
        Object[] array2 = arrayList2.toArray(new CoroutineStackFrame[0]);
        if (array2 == null) {
            throw new NullPointerException(s5);
        }
        objArr[2] = array2;
        Object[] array3 = g5.toArray(new kotlinx.coroutines.debug.internal.e[0]);
        if (array3 == null) {
            throw new NullPointerException(s5);
        }
        objArr[3] = array3;
        return objArr;
    }

    @d5.d
    public final List<k> k() {
        Sequence A1;
        Sequence K2;
        Sequence p12;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f27675a;
            if (!hVar.z()) {
                throw new IllegalStateException(ProtectedSandApp.s("崬").toString());
            }
            A1 = j0.A1(hVar.q());
            K2 = v.K2(A1, new d());
            p12 = v.p1(K2, new g());
            return v.c3(p12);
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    @d5.d
    public final List<StackTraceElement> l(@d5.d kotlinx.coroutines.debug.internal.e info, @d5.d List<StackTraceElement> coroutineTrace) {
        return n(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    @d5.d
    public final String m(@d5.d kotlinx.coroutines.debug.internal.e info) {
        String m32;
        String p5;
        List<StackTraceElement> l5 = l(info, info.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l5) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("崭"));
            sb.append(stackTraceElement.getClassName());
            sb.append(ProtectedSandApp.s("崮"));
            sb.append(stackTraceElement.getMethodName());
            sb.append(ProtectedSandApp.s("崯"));
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? P(fileName) : null);
            sb.append(ProtectedSandApp.s("崰"));
            sb.append(stackTraceElement.getLineNumber());
            sb.append(ProtectedSandApp.s("崱"));
            p5 = x.p(sb.toString());
            arrayList.add(p5);
        }
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("崲"));
        m32 = j0.m3(arrayList, null, null, null, 0, null, null, 63, null);
        return c1.c.a(sb2, m32, ']');
    }

    public final boolean u() {
        return enableCreationStackTraces;
    }

    public final boolean v() {
        return sanitizeStackTraces;
    }

    @d5.d
    public final String w(@d5.d n2 job) {
        int b02;
        int j5;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f27675a;
            if (!hVar.z()) {
                throw new IllegalStateException(ProtectedSandApp.s("崴").toString());
            }
            Set<a<?>> q5 = hVar.q();
            ArrayList arrayList = new ArrayList();
            for (Object obj : q5) {
                if (((a) obj).delegate.getF23291o().b(n2.INSTANCE) != null) {
                    arrayList.add(obj);
                }
            }
            b02 = b0.b0(arrayList, 10);
            j5 = e1.j(b02);
            if (j5 < 16) {
                j5 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(q2.B(((a) obj2).delegate.getF23291o()), ((a) obj2).info);
            }
            StringBuilder sb = new StringBuilder();
            f27675a.d(job, linkedHashMap, sb, "");
            String sb2 = sb.toString();
            l0.o(sb2, ProtectedSandApp.s("崳"));
            return sb2;
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                return;
            }
            f27675a.M();
            if (kotlinx.coroutines.debug.internal.a.f27621a.a()) {
                while (i5 < readHoldCount) {
                    readLock.lock();
                    i5++;
                }
                writeLock.unlock();
                return;
            }
            q3.l<Boolean, m2> lVar = dynamicAttach;
            if (lVar != null) {
                lVar.N(Boolean.TRUE);
            }
            m2 m2Var = m2.f23662a;
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        } finally {
            while (i5 < readHoldCount) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    public final boolean z() {
        return installations > 0;
    }
}
