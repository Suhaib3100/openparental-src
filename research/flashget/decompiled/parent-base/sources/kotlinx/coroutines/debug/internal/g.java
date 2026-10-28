package kotlinx.coroutines.debug.internal;

import androidx.compose.foundation.layout.f3;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kd.x;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.q0;
import kotlin.text.v;
import kotlin.w0;
import kotlin.z0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.r2;
import ld.p;

/* compiled from: DebugProbesImpl.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0098\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J;\u0010\u0014\u001a\u00020\u0006*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0016*\u00020\u00012\u001e\b\u0004\u0010\u001a\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001b2\u0006\u0010)\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00062\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00062\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b@\u0010AJ/\u0010C\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bE\u0010FJ\u001a\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020=H\u0082\u0010¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I*\b\u0012\u0004\u0012\u00020%0\u001bH\u0002¢\u0006\u0004\bJ\u0010KJ3\u0010M\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010>2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bM\u0010NJ\u001b\u0010O\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\bO\u0010PJ'\u0010S\u001a\b\u0012\u0004\u0012\u00020%0\u001b\"\b\b\u0000\u0010>*\u00020Q2\u0006\u0010R\u001a\u00028\u0000H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0006H\u0000¢\u0006\u0004\bU\u0010\u0003J\u000f\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bV\u0010\u0003J\u0017\u0010X\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u000bH\u0000¢\u0006\u0004\bX\u0010YJ\u0013\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0013\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0\u001b¢\u0006\u0004\b`\u0010aJ\u0013\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u001b¢\u0006\u0004\bc\u0010aJ\u0017\u0010d\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\bd\u0010$J)\u0010e\u001a\b\u0012\u0004\u0012\u00020%0\u001b2\u0006\u0010]\u001a\u00020\\2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001b¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020\u00062\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bg\u0010hJ\u001b\u0010i\u001a\u00020\u00062\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bi\u0010hJ)\u0010j\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010>2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010sR$\u0010w\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u00050u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010vR\"\u0010}\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R#\u0010\u0080\u0001\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010x\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R%\u0010\u0083\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bZ\u0010x\u001a\u0005\b\u0081\u0001\u0010z\"\u0005\b\u0082\u0001\u0010|R$\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0084\u0001R!\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\r0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010vR\"\u0010\u008a\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u008e\u0001\u001a\u00020\u0012*\u00020\u000b8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008b\u0001\u0010YR\u001b\u0010\u0091\u0001\u001a\u00020\u0005*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0013\u0010\u0093\u0001\u001a\u00020\u00058G¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010zR\r\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004R\r\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¨\u0006\u0099\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/g;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/k2;", "t", "()Lld/l;", "O", "P", "Lkotlinx/coroutines/k2;", "", "Lkotlinx/coroutines/debug/internal/e;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "d", "(Lkotlinx/coroutines/k2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/g$a;", "Lkotlin/coroutines/g;", "create", "", "i", "(Lld/p;)Ljava/util/List;", "(Ljava/lang/Object;)Ljava/lang/String;", "z", "(Lkotlinx/coroutines/debug/internal/g$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "E", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/q0;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/q0;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/d;", "frame", "U", "(Lkotlin/coroutines/d;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/e;", "T", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/String;)V", "J", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlin/coroutines/jvm/internal/e;", "owner", "V", "(Lkotlinx/coroutines/debug/internal/g$a;Lkotlin/coroutines/d;Ljava/lang/String;)V", "C", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/debug/internal/g$a;", "D", "(Lkotlin/coroutines/jvm/internal/e;)Lkotlinx/coroutines/debug/internal/g$a;", "Lkotlinx/coroutines/debug/internal/m;", "Q", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/m;", "completion", "e", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/m;)Lkotlin/coroutines/d;", "F", "(Lkotlinx/coroutines/debug/internal/g$a;)V", "", "throwable", "K", "(Ljava/lang/Throwable;)Ljava/util/List;", "y", "S", "job", "x", "(Lkotlinx/coroutines/k2;)Ljava/lang/String;", "h", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/d;", "info", "m", "(Lkotlinx/coroutines/debug/internal/d;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/j;", "k", "f", "l", "(Lkotlinx/coroutines/debug/internal/d;Ljava/util/List;)Ljava/util/List;", "H", "(Lkotlin/coroutines/d;)V", "I", "G", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "b", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/b;", "Lkotlinx/coroutines/debug/internal/b;", "capturedCoroutinesMap", "Z", "w", "()Z", "N", "(Z)V", "sanitizeStackTraces", "u", "L", "enableCreationStackTraces", "v", "M", "ignoreCoroutinesWithEmptyContext", "Lld/l;", "dynamicAttach", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "s", "(Lkotlinx/coroutines/k2;)V", "debugString", "B", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "A", "isInstalled", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
@r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,620:1\n150#1:638\n151#1,4:640\n156#1,5:645\n150#1:650\n151#1,4:652\n156#1,5:657\n1#2:621\n1#2:639\n1#2:651\n766#3:622\n857#3,2:623\n1208#3,2:625\n1238#3,4:627\n1855#3,2:665\n350#3,7:673\n1819#3,8:680\n603#4:631\n603#4:644\n603#4:656\n603#4:662\n1295#4,2:663\n37#5,2:632\n37#5,2:634\n37#5,2:636\n1627#6,6:667\n1735#6,6:688\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n245#1:638\n245#1:640,4\n245#1:645,5\n252#1:650\n252#1:652,4\n252#1:657,5\n245#1:639\n252#1:651\n110#1:622\n110#1:623,2\n111#1:625,2\n111#1:627,4\n307#1:665,2\n416#1:673,7\n506#1:680,8\n154#1:631\n245#1:644\n252#1:656\n287#1:662\n288#1:663,2\n211#1:632,2\n212#1:634,2\n213#1:636,2\n355#1:667,6\n558#1:688,6\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f79700a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final StackTraceElement ARTIFICIAL_FRAME;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final SimpleDateFormat dateFormat;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static Thread weakRefCleanerThread;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final kotlinx.coroutines.debug.internal.b<a<?>, Boolean> capturedCoroutinesMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static boolean sanitizeStackTraces;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static boolean enableCreationStackTraces;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static boolean ignoreCoroutinesWithEmptyContext;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static final ld.l<Boolean, k2> dynamicAttach;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.e, kotlinx.coroutines.debug.internal.e> callerInfoCache;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final b f79710k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final c f79711l;

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlinx/coroutines/debug/internal/g$a;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "delegate", "Lkotlinx/coroutines/debug/internal/e;", "info", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/debug/internal/e;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/z0;", "result", "Lkotlin/k2;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/coroutines/d;", "c", "Lkotlinx/coroutines/debug/internal/e;", "Lkotlinx/coroutines/debug/internal/m;", "a", "()Lkotlinx/coroutines/debug/internal/m;", "frame", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.e {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final kotlin.coroutines.d<T> delegate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final kotlinx.coroutines.debug.internal.e info;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l kotlin.coroutines.d<? super T> dVar, @fg.l kotlinx.coroutines.debug.internal.e eVar) {
            this.delegate = dVar;
            this.info = eVar;
        }

        private final m a() {
            return this.info.getCreationStackBottom();
        }

        @Override // kotlin.coroutines.jvm.internal.e
        @fg.m
        public kotlin.coroutines.jvm.internal.e getCallerFrame() {
            m creationStackBottom = this.info.getCreationStackBottom();
            if (creationStackBottom != null) {
                return creationStackBottom.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        @fg.l
        public kotlin.coroutines.g getContext() {
            return this.delegate.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.e
        @fg.m
        public StackTraceElement getStackTraceElement() {
            m creationStackBottom = this.info.getCreationStackBottom();
            if (creationStackBottom != null) {
                return creationStackBottom.stackTraceElement;
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@fg.l Object result) {
            g.f79700a.F(this);
            this.delegate.resumeWith(result);
        }

        @fg.l
        public String toString() {
            return this.delegate.toString();
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private static final AtomicIntegerFieldUpdater f79714a = AtomicIntegerFieldUpdater.newUpdater(b.class, ProtectedSandApp.s("蚝\u0001"));

        @x
        private volatile int installations;

        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private static final AtomicLongFieldUpdater f79715a = AtomicLongFieldUpdater.newUpdater(c.class, ProtectedSandApp.s("蚞\u0001"));

        @x
        private volatile long sequenceNumber;

        private c() {
        }

        public /* synthetic */ c(w wVar) {
            this();
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/g$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/g$f"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,620:1\n1#2:621\n245#3:622\n*E\n"})
    public static final class d extends n0 implements ld.l<a<?>, kotlinx.coroutines.debug.internal.d> {
        public d() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.debug.internal.d invoke(@fg.l a<?> aVar) {
            kotlin.coroutines.g c5;
            if (g.f79700a.z(aVar) || (c5 = aVar.info.c()) == null) {
                return null;
            }
            return new kotlinx.coroutines.debug.internal.d(aVar.info, c5);
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n154#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Long.valueOf(((a) t4).info.sequenceNumber), Long.valueOf(((a) t5).info.sequenceNumber));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/g$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,620:1\n1#2:621\n*E\n"})
    public static final class f<R> extends n0 implements ld.l<a<?>, R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<a<?>, kotlin.coroutines.g, R> f79716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(p<? super a<?>, ? super kotlin.coroutines.g, ? extends R> pVar) {
            super(1);
            this.f79716b = pVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(@fg.l a<?> aVar) {
            kotlin.coroutines.g c5;
            if (g.f79700a.z(aVar) || (c5 = aVar.info.c()) == null) {
                return null;
            }
            return this.f79716b.invoke(aVar, c5);
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,328:1\n287#2:329\n*E\n"})
    /* renamed from: kotlinx.coroutines.debug.internal.g$g, reason: collision with other inner class name */
    public static final class C1221g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Long.valueOf(((a) t4).info.sequenceNumber), Long.valueOf(((a) t5).info.sequenceNumber));
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/g$a;", "it", "", "a", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.l<a<?>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f79717b = new h(1);

        h() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l a<?> aVar) {
            return Boolean.valueOf(!g.f79700a.z(aVar));
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/g$a;", "owner", "a", "(Lkotlinx/coroutines/debug/internal/g$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/g$f"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,620:1\n1#2:621\n252#3:622\n*E\n"})
    public static final class i extends n0 implements ld.l<a<?>, kotlinx.coroutines.debug.internal.j> {
        public i() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.debug.internal.j invoke(@fg.l a<?> aVar) {
            kotlin.coroutines.g c5;
            if (g.f79700a.z(aVar) || (c5 = aVar.info.c()) == null) {
                return null;
            }
            return new kotlinx.coroutines.debug.internal.j(aVar.info, c5);
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f79718b = new j(0);

        j() {
            super(0);
        }

        public final void a() {
            g.callerInfoCache.o();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    static {
        g gVar = new g();
        f79700a = gVar;
        ARTIFICIAL_FRAME = new _COROUTINE.a().b();
        dateFormat = new SimpleDateFormat(ProtectedSandApp.s("蚟\u0001"));
        w wVar = null;
        capturedCoroutinesMap = new kotlinx.coroutines.debug.internal.b<>(false, 1, null);
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = gVar.t();
        callerInfoCache = new kotlinx.coroutines.debug.internal.b<>(true);
        f79710k = new b(wVar);
        f79711l = new c(wVar);
    }

    private g() {
    }

    private final boolean B(StackTraceElement stackTraceElement) {
        return v.s2(stackTraceElement.getClassName(), ProtectedSandApp.s("蚠\u0001"), false, 2, null);
    }

    private final a<?> C(kotlin.coroutines.d<?> dVar) {
        kotlin.coroutines.jvm.internal.e eVar = dVar instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) dVar : null;
        if (eVar != null) {
            return D(eVar);
        }
        return null;
    }

    private final a<?> D(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof a)) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        }
        return (a) eVar;
    }

    private final void E(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print(ProtectedSandApp.s("蚡\u0001") + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(a<?> owner) {
        kotlin.coroutines.jvm.internal.e J;
        capturedCoroutinesMap.remove(owner);
        kotlin.coroutines.jvm.internal.e f4 = owner.info.f();
        if (f4 == null || (J = J(f4)) == null) {
            return;
        }
        callerInfoCache.remove(J);
    }

    private final kotlin.coroutines.jvm.internal.e J(kotlin.coroutines.jvm.internal.e eVar) {
        do {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        } while (eVar.getStackTraceElement() == null);
        return eVar;
    }

    private final <T extends Throwable> List<StackTraceElement> K(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                if (l0.g(stackTrace[length2].getClassName(), ProtectedSandApp.s("蚢\u0001"))) {
                    i4 = length2;
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length2 = i5;
            }
        }
        int i6 = i4 + 1;
        if (!sanitizeStackTraces) {
            int i7 = length - i6;
            ArrayList arrayList = new ArrayList(i7);
            for (int i10 = 0; i10 < i7; i10++) {
                arrayList.add(stackTrace[i10 + i6]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i6) + 1);
        while (i6 < length) {
            if (B(stackTrace[i6])) {
                arrayList2.add(stackTrace[i6]);
                int i11 = i6 + 1;
                while (i11 < length && B(stackTrace[i11])) {
                    i11++;
                }
                int i12 = i11 - 1;
                int i13 = i12;
                while (i13 > i6 && stackTrace[i13].getFileName() == null) {
                    i13--;
                }
                if (i13 > i6 && i13 < i12) {
                    arrayList2.add(stackTrace[i13]);
                }
                arrayList2.add(stackTrace[i12]);
                i6 = i11;
            } else {
                arrayList2.add(stackTrace[i6]);
                i6++;
            }
        }
        return arrayList2;
    }

    private final void O() {
        weakRefCleanerThread = kotlin.concurrent.b.c(false, true, null, ProtectedSandApp.s("蚣\u0001"), 0, j.f79718b, 21, null);
    }

    private final void P() {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final m Q(List<StackTraceElement> list) {
        m mVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                mVar = new m(mVar, listIterator.previous());
            }
        }
        return new m(mVar, ARTIFICIAL_FRAME);
    }

    private final String R(Object obj) {
        String b5;
        b5 = kotlinx.coroutines.debug.internal.h.b(obj.toString());
        return b5;
    }

    private final void T(kotlin.coroutines.jvm.internal.e frame, String state) {
        boolean z4;
        if (A()) {
            kotlinx.coroutines.debug.internal.b<kotlin.coroutines.jvm.internal.e, kotlinx.coroutines.debug.internal.e> bVar = callerInfoCache;
            kotlinx.coroutines.debug.internal.e remove = bVar.remove(frame);
            if (remove != null) {
                z4 = false;
            } else {
                a<?> D = D(frame);
                if (D == null || (remove = D.info) == null) {
                    return;
                }
                kotlin.coroutines.jvm.internal.e f4 = remove.f();
                kotlin.coroutines.jvm.internal.e J = f4 != null ? J(f4) : null;
                if (J != null) {
                    bVar.remove(J);
                }
                z4 = true;
            }
            l0.n(frame, ProtectedSandApp.s("蚤\u0001"));
            remove.j(state, (kotlin.coroutines.d) frame, z4);
            kotlin.coroutines.jvm.internal.e J2 = J(frame);
            if (J2 == null) {
                return;
            }
            bVar.put(J2, remove);
        }
    }

    private final void U(kotlin.coroutines.d<?> frame, String state) {
        if (A()) {
            if (ignoreCoroutinesWithEmptyContext && frame.getContext() == kotlin.coroutines.i.f75057b) {
                return;
            }
            if (l0.g(state, ProtectedSandApp.s("蚥\u0001"))) {
                kotlin.coroutines.jvm.internal.e eVar = frame instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) frame : null;
                if (eVar == null) {
                    return;
                }
                T(eVar, state);
                return;
            }
            a<?> C = C(frame);
            if (C == null) {
                return;
            }
            V(C, frame, state);
        }
    }

    private final void V(a<?> owner, kotlin.coroutines.d<?> frame, String state) {
        if (A()) {
            owner.info.j(state, frame, true);
        }
    }

    private final void d(kotlinx.coroutines.k2 k2Var, Map<kotlinx.coroutines.k2, kotlinx.coroutines.debug.internal.e> map, StringBuilder sb, String str) {
        kotlinx.coroutines.debug.internal.e eVar = map.get(k2Var);
        if (eVar != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) kotlin.collections.w.G2(eVar.h());
            String str2 = eVar._state;
            StringBuilder a5 = j4.a(str);
            androidx.room.l0.a(a5, r(k2Var), ProtectedSandApp.s("蚦\u0001"), str2, ProtectedSandApp.s("蚧\u0001"));
            a5.append(stackTraceElement);
            a5.append('\n');
            sb.append(a5.toString());
            str = str + '\t';
        } else if (!(k2Var instanceof o0)) {
            StringBuilder a6 = j4.a(str);
            a6.append(r(k2Var));
            a6.append('\n');
            sb.append(a6.toString());
            str = str + '\t';
        }
        Iterator<kotlinx.coroutines.k2> it = k2Var.o().iterator();
        while (it.hasNext()) {
            d(it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.d<T> e(kotlin.coroutines.d<? super T> completion, m frame) {
        if (!A()) {
            return completion;
        }
        a<?> aVar = new a<>(completion, new kotlinx.coroutines.debug.internal.e(completion.getContext(), frame, c.f79715a.incrementAndGet(f79711l)));
        kotlinx.coroutines.debug.internal.b<a<?>, Boolean> bVar = capturedCoroutinesMap;
        bVar.put(aVar, Boolean.TRUE);
        if (!A()) {
            bVar.clear();
        }
        return aVar;
    }

    private final <R> List<R> i(p<? super a<?>, ? super kotlin.coroutines.g, ? extends R> create) {
        if (A()) {
            return kotlin.sequences.p.c3(kotlin.sequences.p.p1(kotlin.sequences.p.K2(kotlin.collections.w.A1(capturedCoroutinesMap.c()), new e()), new f(create)));
        }
        throw new IllegalStateException(ProtectedSandApp.s("蚨\u0001"));
    }

    private final void j(PrintStream out) {
        if (!A()) {
            throw new IllegalStateException(ProtectedSandApp.s("蚨\u0001"));
        }
        out.print(ProtectedSandApp.s("蚩\u0001") + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        for (a aVar : kotlin.sequences.p.K2(kotlin.sequences.p.p0(kotlin.collections.w.A1(capturedCoroutinesMap.c()), h.f79717b), new C1221g())) {
            kotlinx.coroutines.debug.internal.e eVar = aVar.info;
            List<StackTraceElement> h4 = eVar.h();
            g gVar = f79700a;
            List<StackTraceElement> n4 = gVar.n(eVar._state, eVar.lastObservedThread, h4);
            out.print(ProtectedSandApp.s("蚫\u0001") + aVar.delegate + ProtectedSandApp.s("蚬\u0001") + ((l0.g(eVar._state, ProtectedSandApp.s("蚥\u0001")) && n4 == h4) ? android.support.v4.media.c.a(new StringBuilder(), eVar._state, ProtectedSandApp.s("蚪\u0001")) : eVar._state));
            if (h4.isEmpty()) {
                out.print(ProtectedSandApp.s("蚡\u0001") + ARTIFICIAL_FRAME);
                gVar.E(out, eVar.e());
            } else {
                gVar.E(out, n4);
            }
        }
    }

    private final List<StackTraceElement> n(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object a5;
        if (!l0.g(state, ProtectedSandApp.s("蚥\u0001")) || thread == null) {
            return coroutineTrace;
        }
        try {
            z0.Companion companion = z0.INSTANCE;
            a5 = thread.getStackTrace();
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        if (z0.i(a5)) {
            a5 = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a5;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i4];
            if (l0.g(stackTraceElement.getClassName(), ProtectedSandApp.s("蚭\u0001")) && l0.g(stackTraceElement.getMethodName(), ProtectedSandApp.s("蚮\u0001")) && l0.g(stackTraceElement.getFileName(), ProtectedSandApp.s("蚯\u0001"))) {
                break;
            }
            i4++;
        }
        q0<Integer, Integer> o4 = o(i4, stackTraceElementArr, coroutineTrace);
        int intValue = o4.a().intValue();
        int intValue2 = o4.b().intValue();
        if (intValue == -1) {
            return coroutineTrace;
        }
        ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i4) - intValue) - 1) - intValue2);
        int i5 = i4 - intValue2;
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(stackTraceElementArr[i6]);
        }
        int size = coroutineTrace.size();
        for (int i7 = intValue + 1; i7 < size; i7++) {
            arrayList.add(coroutineTrace.get(i7));
        }
        return arrayList;
    }

    private final q0<Integer, Integer> o(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i4 = 0; i4 < 3; i4++) {
            int p4 = f79700a.p((indexOfResumeWith - 1) - i4, actualTrace, coroutineTrace);
            if (p4 != -1) {
                return new q0<>(Integer.valueOf(p4), Integer.valueOf(i4));
            }
        }
        return new q0<>(-1, 0);
    }

    private final int p(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (StackTraceElement) kotlin.collections.l.Pe(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i4 = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (l0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && l0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && l0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return capturedCoroutinesMap.c();
    }

    private final String r(kotlinx.coroutines.k2 k2Var) {
        return k2Var instanceof r2 ? ((r2) k2Var).Q1() : k2Var.toString();
    }

    private static /* synthetic */ void s(kotlinx.coroutines.k2 k2Var) {
    }

    private final ld.l<Boolean, k2> t() {
        Object a5;
        try {
            z0.Companion companion = z0.INSTANCE;
            Object newInstance = Class.forName(ProtectedSandApp.s("蚰\u0001")).getConstructors()[0].newInstance(null);
            l0.n(newInstance, ProtectedSandApp.s("蚱\u0001"));
            a5 = (ld.l) u1.q(newInstance, 1);
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        return (ld.l) (z0.i(a5) ? null : a5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z(a<?> aVar) {
        kotlinx.coroutines.k2 k2Var;
        kotlin.coroutines.g c5 = aVar.info.c();
        if (c5 == null || (k2Var = (kotlinx.coroutines.k2) c5.c(kotlinx.coroutines.k2.INSTANCE)) == null || !k2Var.l()) {
            return false;
        }
        capturedCoroutinesMap.remove(aVar);
        return true;
    }

    @kd.i(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean A() {
        return b.f79714a.get(f79710k) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final <T> kotlin.coroutines.d<T> G(@fg.l kotlin.coroutines.d<? super T> completion) {
        if (!A()) {
            return completion;
        }
        if (ignoreCoroutinesWithEmptyContext && completion.getContext() == kotlin.coroutines.i.f75057b) {
            return completion;
        }
        if (C(completion) != null) {
            return completion;
        }
        return e(completion, enableCreationStackTraces ? Q(K(new Exception())) : null);
    }

    public final void H(@fg.l kotlin.coroutines.d<?> frame) {
        U(frame, ProtectedSandApp.s("蚥\u0001"));
    }

    public final void I(@fg.l kotlin.coroutines.d<?> frame) {
        U(frame, ProtectedSandApp.s("蚲\u0001"));
    }

    public final void L(boolean z4) {
        enableCreationStackTraces = z4;
    }

    public final void M(boolean z4) {
        ignoreCoroutinesWithEmptyContext = z4;
    }

    public final void N(boolean z4) {
        sanitizeStackTraces = z4;
    }

    public final void S() {
        ld.l<Boolean, k2> lVar;
        if (!A()) {
            throw new IllegalStateException(ProtectedSandApp.s("蚳\u0001"));
        }
        if (b.f79714a.decrementAndGet(f79710k) != 0) {
            return;
        }
        P();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (kotlinx.coroutines.debug.internal.a.f79647a.a() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
    }

    @kd.i(name = "dumpCoroutines")
    public final void f(@fg.l PrintStream out) {
        synchronized (out) {
            f79700a.j(out);
            k2 k2Var = k2.f75408a;
        }
    }

    @fg.l
    public final List<kotlinx.coroutines.debug.internal.d> g() {
        if (A()) {
            return kotlin.sequences.p.c3(kotlin.sequences.p.p1(kotlin.sequences.p.K2(kotlin.collections.w.A1(capturedCoroutinesMap.c()), new e()), new d(1)));
        }
        throw new IllegalStateException(ProtectedSandApp.s("蚨\u0001"));
    }

    @fg.l
    public final Object[] h() {
        String name;
        List<kotlinx.coroutines.debug.internal.d> g4 = g();
        int size = g4.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (kotlinx.coroutines.debug.internal.d dVar : g4) {
            kotlin.coroutines.g context = dVar.getContext();
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) context.c(kotlinx.coroutines.q0.INSTANCE);
            Long l4 = null;
            String R = (q0Var == null || (name = q0Var.getName()) == null) ? null : R(name);
            m0 m0Var = (m0) context.c(m0.INSTANCE);
            String R2 = m0Var != null ? R(m0Var) : null;
            StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("蚴\u0001"), R, ProtectedSandApp.s("蚵\u0001"));
            p0 p0Var = (p0) context.c(p0.INSTANCE);
            if (p0Var != null) {
                l4 = Long.valueOf(p0Var.e1());
            }
            a5.append(l4);
            a5.append(ProtectedSandApp.s("蚶\u0001"));
            a5.append(R2);
            a5.append(ProtectedSandApp.s("蚷\u0001"));
            a5.append(dVar.getSequenceNumber());
            a5.append(ProtectedSandApp.s("蚸\u0001"));
            a5.append(dVar.getState());
            a5.append(ProtectedSandApp.s("蚹\u0001"));
            arrayList3.add(v.p(a5.toString()));
            arrayList2.add(dVar.getLastObservedFrame());
            arrayList.add(dVar.getLastObservedThread());
        }
        return new Object[]{f3.a(new StringBuilder(ProtectedSandApp.s("蚺\u0001")), kotlin.collections.w.m3(arrayList3, null, null, null, 0, null, null, 63, null), ']'), arrayList.toArray(new Thread[0]), arrayList2.toArray(new kotlin.coroutines.jvm.internal.e[0]), g4.toArray(new kotlinx.coroutines.debug.internal.d[0])};
    }

    @fg.l
    public final List<kotlinx.coroutines.debug.internal.j> k() {
        if (A()) {
            return kotlin.sequences.p.c3(kotlin.sequences.p.p1(kotlin.sequences.p.K2(kotlin.collections.w.A1(capturedCoroutinesMap.c()), new e()), new i(1)));
        }
        throw new IllegalStateException(ProtectedSandApp.s("蚨\u0001"));
    }

    @fg.l
    public final List<StackTraceElement> l(@fg.l kotlinx.coroutines.debug.internal.d info, @fg.l List<StackTraceElement> coroutineTrace) {
        return n(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    @fg.l
    public final String m(@fg.l kotlinx.coroutines.debug.internal.d info) {
        List<StackTraceElement> l4 = l(info, info.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l4) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("蚻\u0001"));
            sb.append(stackTraceElement.getClassName());
            sb.append(ProtectedSandApp.s("蚼\u0001"));
            sb.append(stackTraceElement.getMethodName());
            sb.append(ProtectedSandApp.s("蚽\u0001"));
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? R(fileName) : null);
            sb.append(ProtectedSandApp.s("蚾\u0001"));
            sb.append(stackTraceElement.getLineNumber());
            sb.append(ProtectedSandApp.s("蚿\u0001"));
            arrayList.add(v.p(sb.toString()));
        }
        return f3.a(new StringBuilder(ProtectedSandApp.s("蚺\u0001")), kotlin.collections.w.m3(arrayList, null, null, null, 0, null, null, 63, null), ']');
    }

    public final boolean u() {
        return enableCreationStackTraces;
    }

    public final boolean v() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean w() {
        return sanitizeStackTraces;
    }

    @fg.l
    public final String x(@fg.l kotlinx.coroutines.k2 job) {
        if (!A()) {
            throw new IllegalStateException(ProtectedSandApp.s("蚨\u0001"));
        }
        Set<a<?>> c5 = capturedCoroutinesMap.c();
        ArrayList<a> arrayList = new ArrayList();
        for (Object obj : c5) {
            if (((a) obj).delegate.getContext().c(kotlinx.coroutines.k2.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        int j4 = kotlin.collections.z0.j(kotlin.collections.w.b0(arrayList, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        for (a aVar : arrayList) {
            linkedHashMap.put(n2.B(aVar.delegate.getContext()), aVar.info);
        }
        StringBuilder sb = new StringBuilder();
        f79700a.d(job, linkedHashMap, sb, "");
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("蛀\u0001"));
        return sb2;
    }

    public final void y() {
        ld.l<Boolean, k2> lVar;
        if (b.f79714a.incrementAndGet(f79710k) > 1) {
            return;
        }
        O();
        if (kotlinx.coroutines.debug.internal.a.f79647a.a() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.TRUE);
    }
}
