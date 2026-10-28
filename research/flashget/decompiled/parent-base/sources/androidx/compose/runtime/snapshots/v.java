package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.n5;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.runtime.snapshots.t;
import androidx.compose.runtime.u4;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a$\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0081\b¢\u0006\u0004\b\u001f\u0010 \u001a@\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010!\u001a\u00020\n2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b$\u0010%\u001a8\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)\u001a<\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\n2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.\u001a'\u00101\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102\u001a'\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u0002032\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106\u001a3\u00108\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u0002032\u0006\u00107\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010<\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=\u001a+\u0010>\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\n¢\u0006\u0004\b>\u0010?\u001a\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010B\u001a\u0019\u0010C\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010E\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bE\u0010F\u001a(\u0010H\u001a\u000203*\u0002032\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00110\u000eH\u0082\b¢\u0006\u0004\bH\u0010I\u001a\u000f\u0010J\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010)\u001a\u0017\u0010K\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\nH\u0001¢\u0006\u0004\bM\u0010?\u001a5\u0010O\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\n2\u0006\u0010N\u001a\u00028\u0000H\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010Q\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\nH\u0000¢\u0006\u0004\bQ\u0010?\u001a-\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010?\u001a%\u0010R\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u000203*\u00028\u00002\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\bR\u0010=\u001a\u001f\u0010S\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\n2\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bS\u0010T\u001aM\u0010V\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000203\"\u0004\b\u0001\u0010R*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\n2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\bUH\u0086\b¢\u0006\u0004\bV\u0010W\u001aE\u0010X\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000203\"\u0004\b\u0001\u0010R*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\bUH\u0086\b¢\u0006\u0004\bX\u0010Y\u001aM\u0010Z\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000203\"\u0004\b\u0001\u0010R*\u00028\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010N\u001a\u00028\u00002\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\bUH\u0080\b¢\u0006\u0004\bZ\u0010[\u001a5\u0010`\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0018\u00010_2\u0006\u0010/\u001a\u00020\\2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u0002H\u0002¢\u0006\u0004\b`\u0010a\u001a\u000f\u0010b\u001a\u00020@H\u0002¢\u0006\u0004\bb\u0010B\u001a)\u0010c\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u0002032\u0006\u00107\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\nH\u0001¢\u0006\u0004\bc\u0010d\u001a!\u0010e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u0002032\u0006\u00107\u001a\u00028\u0000H\u0001¢\u0006\u0004\be\u0010f\u001aG\u0010g\u001a\u00028\u0001\"\b\b\u0000\u0010\u001c*\u000203\"\u0004\b\u0001\u0010R*\u00028\u00002!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(7\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\b¢\u0006\u0004\bg\u0010h\u001a#\u0010k\u001a\u00020\u0002*\u00020\u00022\u0006\u0010i\u001a\u00020\u00002\u0006\u0010j\u001a\u00020\u0000H\u0000¢\u0006\u0004\bk\u0010l\"/\u0010o\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u0014\u0010q\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010\u000b\"\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\n0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t\" \u0010{\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bv\u0010w\u0012\u0004\bz\u0010)\u001a\u0004\bx\u0010y\"\u0016\u0010~\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}\"\u0017\u0010\u0080\u0001\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010\u000b\"\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001\":\u0010\u008e\u0001\u001a#\u0012\u001e\u0012\u001c\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u000f0\u008b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u008a\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001\",\u0010\u0090\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e0\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008d\u0001\"?\u0010\u0097\u0001\u001a*\u0012\u000f\u0012\r \u0093\u0001*\u0005\u0018\u00010\u0092\u00010\u0092\u00010\u0091\u0001j\u0014\u0012\u000f\u0012\r \u0093\u0001*\u0005\u0018\u00010\u0092\u00010\u0092\u0001`\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001\"%\u0010\u009c\u0001\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u0012\u0005\b\u009b\u0001\u0010)\u001a\u0005\b\u009a\u0001\u0010\f\"\u001a\u0010 \u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¡\u0001"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "j0", "(ILandroidx/compose/runtime/snapshots/t;)I", "handle", "Lkotlin/k2;", "e0", "(I)V", "Landroidx/compose/runtime/snapshots/m;", "I", "()Landroidx/compose/runtime/snapshots/m;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "E", "(Landroidx/compose/runtime/snapshots/m;Lld/l;Z)Landroidx/compose/runtime/snapshots/m;", "parentObserver", "mergeReadObserver", "O", "(Lld/l;Lld/l;Z)Lld/l;", "writeObserver", "Q", "(Lld/l;Lld/l;)Lld/l;", "T", "Lkotlin/Function0;", "block", "g0", "(Lld/a;)Ljava/lang/Object;", "previousGlobalSnapshot", "Lkotlin/r0;", "name", "h0", "(Landroidx/compose/runtime/snapshots/m;Lld/l;)Ljava/lang/Object;", "B", "(Lld/l;)Ljava/lang/Object;", "C", "()V", "i0", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "snapshot", "n0", "(Landroidx/compose/runtime/snapshots/m;)V", "currentSnapshot", "candidateSnapshot", "l0", "(IILandroidx/compose/runtime/snapshots/t;)Z", "Landroidx/compose/runtime/snapshots/r0;", "data", "m0", "(Landroidx/compose/runtime/snapshots/r0;ILandroidx/compose/runtime/snapshots/t;)Z", "r", "b0", "(Landroidx/compose/runtime/snapshots/r0;ILandroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/r0;", "Landroidx/compose/runtime/snapshots/p0;", "state", "c0", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/p0;)Landroidx/compose/runtime/snapshots/r0;", "d0", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/p0;Landroidx/compose/runtime/snapshots/m;)Landroidx/compose/runtime/snapshots/r0;", "", "a0", "()Ljava/lang/Void;", "k0", "(Landroidx/compose/runtime/snapshots/p0;)Landroidx/compose/runtime/snapshots/r0;", "Y", "(Landroidx/compose/runtime/snapshots/p0;)Z", "predicate", "J", "(Landroidx/compose/runtime/snapshots/r0;Lld/l;)Landroidx/compose/runtime/snapshots/r0;", "D", "Z", "(Landroidx/compose/runtime/snapshots/p0;)V", "r0", "candidate", "X", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/p0;Landroidx/compose/runtime/snapshots/m;Landroidx/compose/runtime/snapshots/r0;)Landroidx/compose/runtime/snapshots/r0;", "S", "R", "U", "(Landroidx/compose/runtime/snapshots/m;Landroidx/compose/runtime/snapshots/p0;)V", "Lkotlin/u;", "p0", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/p0;Landroidx/compose/runtime/snapshots/m;Lld/l;)Ljava/lang/Object;", "q0", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/p0;Lld/l;)Ljava/lang/Object;", "W", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/p0;Landroidx/compose/runtime/snapshots/r0;Lld/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/e;", "applyingSnapshot", "invalidSnapshots", "", "V", "(Landroidx/compose/runtime/snapshots/e;Landroidx/compose/runtime/snapshots/e;Landroidx/compose/runtime/snapshots/t;)Ljava/util/Map;", "f0", "H", "(Landroidx/compose/runtime/snapshots/r0;Landroidx/compose/runtime/snapshots/m;)Landroidx/compose/runtime/snapshots/r0;", "G", "(Landroidx/compose/runtime/snapshots/r0;)Landroidx/compose/runtime/snapshots/r0;", "o0", "(Landroidx/compose/runtime/snapshots/r0;Lld/l;)Ljava/lang/Object;", "from", "until", "A", "(Landroidx/compose/runtime/snapshots/t;II)Landroidx/compose/runtime/snapshots/t;", "a", "Lld/l;", "emptyLambda", "b", "INVALID_SNAPSHOT", "Landroidx/compose/runtime/u4;", "c", "Landroidx/compose/runtime/u4;", "threadSnapshot", "d", "Ljava/lang/Object;", "K", "()Ljava/lang/Object;", "L", "lock", "e", "Landroidx/compose/runtime/snapshots/t;", "openSnapshots", "f", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/r;", "g", "Landroidx/compose/runtime/snapshots/r;", "pinningTable", "Landroidx/compose/runtime/snapshots/h0;", "h", "Landroidx/compose/runtime/snapshots/h0;", "extraStateObjects", "", "Lkotlin/Function2;", "", "i", "Ljava/util/List;", "applyObservers", "j", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/c;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "k", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "l", "Landroidx/compose/runtime/snapshots/m;", "M", "N", "snapshotInitializer", "Landroidx/compose/runtime/f;", "m", "Landroidx/compose/runtime/f;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#1:2295\n1714#1:2298\n1714#1:2300\n1714#1:2308\n1714#1:2317\n1714#1:2319\n2033#1,9:2321\n1714#1:2358\n1714#1:2360\n1714#1:2362\n1714#1:2365\n1714#1:2367\n1714#1:2376\n82#2:2296\n82#2:2297\n82#2:2299\n82#2:2301\n82#2:2309\n82#2:2318\n82#2:2320\n82#2:2359\n82#2:2361\n82#2:2363\n82#2:2366\n82#2:2368\n82#2:2377\n33#3,6:2302\n108#4,7:2310\n108#4,7:2369\n125#5,28:2330\n1#6:2364\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n611#1:2295\n1774#1:2298\n1800#1:2300\n1822#1:2308\n1852#1:2317\n1905#1:2319\n2015#1:2321,9\n2088#1:2358\n2097#1:2360\n2165#1:2362\n2177#1:2365\n2205#1:2367\n2270#1:2376\n611#1:2296\n1714#1:2297\n1774#1:2299\n1800#1:2301\n1822#1:2309\n1852#1:2318\n1905#1:2320\n2088#1:2359\n2097#1:2361\n2165#1:2363\n2177#1:2366\n2205#1:2368\n2270#1:2377\n1814#1:2302,6\n1824#1:2310,7\n2228#1:2369,7\n2045#1:2330,28\n*E\n"})
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    private static final int f17169b = 0;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static t f17172e;

    /* renamed from: f, reason: collision with root package name */
    private static int f17173f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final r f17174g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final h0<p0> f17175h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static List<? extends ld.p<? super Set<? extends Object>, ? super m, k2>> f17176i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static List<? extends ld.l<Object, k2>> f17177j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final AtomicReference<androidx.compose.runtime.snapshots.c> f17178k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final m f17179l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static androidx.compose.runtime.f f17180m;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.l<t, k2> f17168a = b.f17182b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final u4<m> f17170c = new u4<>();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Object f17171d = new Object();

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/snapshots/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<t, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17181b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l t tVar) {
        }

        @Override // ld.l
        public k2 invoke(t tVar) {
            return k2.f75408a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/snapshots/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<t, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f17182b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l t tVar) {
        }

        @Override // ld.l
        public k2 invoke(t tVar) {
            return k2.f75408a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ld.l<Object, k2> lVar, ld.l<Object, k2> lVar2) {
            super(1);
            this.f17183b = lVar;
            this.f17184c = lVar2;
        }

        public final void a(@fg.l Object obj) {
            this.f17183b.invoke(obj);
            this.f17184c.invoke(obj);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ld.l<Object, k2> lVar, ld.l<Object, k2> lVar2) {
            super(1);
            this.f17185b = lVar;
            this.f17186c = lVar2;
        }

        public final void a(@fg.l Object obj) {
            this.f17185b.invoke(obj);
            this.f17186c.invoke(obj);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/m;", "T", "Landroidx/compose/runtime/snapshots/t;", "invalid", "a", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/m;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1714#2:2295\n82#3:2296\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1835#1:2295\n1835#1:2296\n*E\n"})
    static final class e<T> extends kotlin.jvm.internal.n0 implements ld.l<t, T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<t, T> f17187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.l<? super t, ? extends T> lVar) {
            super(1);
            this.f17187b = lVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/t;)TT; */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke(@fg.l t tVar) {
            m mVar = (m) this.f17187b.invoke(tVar);
            synchronized (v.K()) {
                v.f17172e = v.f17172e.v(mVar.getId());
                k2 k2Var = k2.f75408a;
            }
            return mVar;
        }
    }

    static {
        t.Companion companion = t.INSTANCE;
        companion.getClass();
        f17172e = t.f17146h;
        f17173f = 1;
        f17174g = new r();
        f17175h = new h0<>();
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
        f17176i = j0Var;
        f17177j = j0Var;
        int i4 = f17173f;
        f17173f = i4 + 1;
        companion.getClass();
        androidx.compose.runtime.snapshots.c cVar = new androidx.compose.runtime.snapshots.c(i4, t.f17146h);
        f17172e = f17172e.v(cVar.getId());
        AtomicReference<androidx.compose.runtime.snapshots.c> atomicReference = new AtomicReference<>(cVar);
        f17178k = atomicReference;
        f17179l = atomicReference.get();
        f17180m = new androidx.compose.runtime.f(0);
    }

    @fg.l
    public static final t A(@fg.l t tVar, int i4, int i5) {
        while (i4 < i5) {
            tVar = tVar.v(i4);
            i4++;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T B(ld.l<? super t, ? extends T> lVar) {
        androidx.compose.runtime.snapshots.c cVar;
        androidx.compose.runtime.collection.d<p0> i4;
        T t4;
        m mVar = f17179l;
        kotlin.jvm.internal.l0.n(mVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f17171d) {
            try {
                cVar = f17178k.get();
                i4 = cVar.i();
                if (i4 != null) {
                    f17180m.addAndGet(1);
                }
                t4 = (T) h0(cVar, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i4 != null) {
            try {
                List<? extends ld.p<? super Set<? extends Object>, ? super m, k2>> list = f17176i;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    list.get(i5).invoke(i4, cVar);
                }
            } finally {
                f17180m.addAndGet(-1);
            }
        }
        synchronized (f17171d) {
            try {
                D();
                if (i4 != null) {
                    Object[] values = i4.getValues();
                    int size2 = i4.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        Object obj = values[i6];
                        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        Z((p0) obj);
                    }
                    k2 k2Var = k2.f75408a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        B(a.f17181b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D() {
        h0<p0> h0Var = f17175h;
        int size = h0Var.getSize();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            n5<p0> n5Var = h0Var.f()[i4];
            p0 p0Var = n5Var != null ? n5Var.get() : null;
            if (p0Var != null && Y(p0Var)) {
                if (i5 != i4) {
                    h0Var.f()[i5] = n5Var;
                    h0Var.getHashes()[i5] = h0Var.getHashes()[i4];
                }
                i5++;
            }
            i4++;
        }
        for (int i6 = i5; i6 < size; i6++) {
            h0Var.f()[i6] = null;
            h0Var.getHashes()[i6] = 0;
        }
        if (i5 != size) {
            h0Var.j(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m E(m mVar, ld.l<Object, k2> lVar, boolean z4) {
        boolean z5 = mVar instanceof androidx.compose.runtime.snapshots.e;
        if (z5 || mVar == null) {
            return new t0(z5 ? (androidx.compose.runtime.snapshots.e) mVar : null, lVar, null, false, z4);
        }
        return new u0(mVar, lVar, false, z4);
    }

    static /* synthetic */ m F(m mVar, ld.l lVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return E(mVar, lVar, z4);
    }

    @fg.l
    @w0
    public static final <T extends r0> T G(@fg.l T t4) {
        T t5;
        m.Companion companion = m.INSTANCE;
        companion.getClass();
        m I = I();
        T t6 = (T) b0(t4, I.getId(), I.getInvalid());
        if (t6 != null) {
            return t6;
        }
        synchronized (f17171d) {
            companion.getClass();
            m I2 = I();
            t5 = (T) b0(t4, I2.getId(), I2.getInvalid());
        }
        if (t5 != null) {
            return t5;
        }
        a0();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @w0
    public static final <T extends r0> T H(@fg.l T t4, @fg.l m mVar) {
        T t5 = (T) b0(t4, mVar.getId(), mVar.getInvalid());
        if (t5 != null) {
            return t5;
        }
        a0();
        throw new KotlinNothingValueException();
    }

    @fg.l
    public static final m I() {
        m a5 = f17170c.a();
        return a5 == null ? f17178k.get() : a5;
    }

    private static final r0 J(r0 r0Var, ld.l<? super r0, Boolean> lVar) {
        r0 r0Var2 = r0Var;
        while (r0Var != null) {
            if (lVar.invoke(r0Var).booleanValue()) {
                return r0Var;
            }
            if (r0Var2.getSnapshotId() < r0Var.getSnapshotId()) {
                r0Var2 = r0Var;
            }
            r0Var = r0Var.getNext();
        }
        return r0Var2;
    }

    @fg.l
    public static final Object K() {
        return f17171d;
    }

    @w0
    public static /* synthetic */ void L() {
    }

    @fg.l
    public static final m M() {
        return f17179l;
    }

    @w0
    public static /* synthetic */ void N() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.l<Object, k2> O(ld.l<Object, k2> lVar, ld.l<Object, k2> lVar2, boolean z4) {
        if (!z4) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || kotlin.jvm.internal.l0.g(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new c(lVar, lVar2);
    }

    static /* synthetic */ ld.l P(ld.l lVar, ld.l lVar2, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return O(lVar, lVar2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.l<Object, k2> Q(ld.l<Object, k2> lVar, ld.l<Object, k2> lVar2) {
        return (lVar == null || lVar2 == null || kotlin.jvm.internal.l0.g(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new d(lVar, lVar2);
    }

    @fg.l
    public static final <T extends r0> T R(@fg.l T t4, @fg.l p0 p0Var) {
        T t5 = (T) k0(p0Var);
        if (t5 != null) {
            t5.h(Integer.MAX_VALUE);
            return t5;
        }
        T t6 = (T) t4.d();
        t6.h(Integer.MAX_VALUE);
        t6.g(p0Var.getFirstStateRecord());
        kotlin.jvm.internal.l0.n(t6, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        p0Var.A(t6);
        kotlin.jvm.internal.l0.n(t6, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t6;
    }

    @fg.l
    public static final <T extends r0> T S(@fg.l T t4, @fg.l p0 p0Var, @fg.l m mVar) {
        T t5;
        synchronized (f17171d) {
            t5 = (T) T(t4, p0Var, mVar);
        }
        return t5;
    }

    private static final <T extends r0> T T(T t4, p0 p0Var, m mVar) {
        T t5 = (T) R(t4, p0Var);
        t5.c(t4);
        t5.h(mVar.getId());
        return t5;
    }

    @w0
    public static final void U(@fg.l m mVar, @fg.l p0 p0Var) {
        mVar.C(mVar.getWriteCount() + 1);
        ld.l<Object, k2> o4 = mVar.o();
        if (o4 != null) {
            o4.invoke(p0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<r0, r0> V(androidx.compose.runtime.snapshots.e eVar, androidx.compose.runtime.snapshots.e eVar2, t tVar) {
        r0 b02;
        androidx.compose.runtime.collection.d<p0> i4 = eVar2.i();
        int id2 = eVar.getId();
        if (i4 == null) {
            return null;
        }
        t s4 = eVar2.getInvalid().v(eVar2.getId()).s(eVar2.getPreviousIds());
        Object[] values = i4.getValues();
        int size = i4.size();
        HashMap hashMap = null;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = values[i5];
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            p0 p0Var = (p0) obj;
            r0 firstStateRecord = p0Var.getFirstStateRecord();
            r0 b03 = b0(firstStateRecord, id2, tVar);
            if (b03 != null && (b02 = b0(firstStateRecord, id2, s4)) != null && !kotlin.jvm.internal.l0.g(b03, b02)) {
                r0 b04 = b0(firstStateRecord, eVar2.getId(), eVar2.getInvalid());
                if (b04 == null) {
                    a0();
                    throw new KotlinNothingValueException();
                }
                r0 H = p0Var.H(b02, b03, b04);
                if (H == null) {
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(b03, H);
                hashMap = hashMap;
            }
        }
        return hashMap;
    }

    public static final <T extends r0, R> R W(@fg.l T t4, @fg.l p0 p0Var, @fg.l T t5, @fg.l ld.l<? super T, ? extends R> lVar) {
        m I;
        R invoke;
        synchronized (f17171d) {
            m.INSTANCE.getClass();
            I = I();
            invoke = lVar.invoke(X(t4, p0Var, I, t5));
        }
        U(I, p0Var);
        return invoke;
    }

    @fg.l
    public static final <T extends r0> T X(@fg.l T t4, @fg.l p0 p0Var, @fg.l m mVar, @fg.l T t5) {
        T t6;
        if (mVar.l()) {
            mVar.v(p0Var);
        }
        int id2 = mVar.getId();
        if (t5.getSnapshotId() == id2) {
            return t5;
        }
        synchronized (f17171d) {
            t6 = (T) R(t4, p0Var);
        }
        t6.h(id2);
        mVar.v(p0Var);
        return t6;
    }

    private static final boolean Y(p0 p0Var) {
        r0 r0Var;
        int f4 = f17174g.f(f17173f);
        r0 r0Var2 = null;
        r0 r0Var3 = null;
        int i4 = 0;
        for (r0 firstStateRecord = p0Var.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            int snapshotId = firstStateRecord.getSnapshotId();
            if (snapshotId != 0) {
                if (snapshotId >= f4) {
                    i4++;
                } else if (r0Var2 == null) {
                    i4++;
                    r0Var2 = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId() < r0Var2.getSnapshotId()) {
                        r0Var = r0Var2;
                        r0Var2 = firstStateRecord;
                    } else {
                        r0Var = firstStateRecord;
                    }
                    if (r0Var3 == null) {
                        r0Var3 = p0Var.getFirstStateRecord();
                        r0 r0Var4 = r0Var3;
                        while (true) {
                            if (r0Var3 == null) {
                                r0Var3 = r0Var4;
                                break;
                            }
                            if (r0Var3.getSnapshotId() >= f4) {
                                break;
                            }
                            if (r0Var4.getSnapshotId() < r0Var3.getSnapshotId()) {
                                r0Var4 = r0Var3;
                            }
                            r0Var3 = r0Var3.getNext();
                        }
                    }
                    r0Var2.h(0);
                    r0Var2.c(r0Var3);
                    r0Var2 = r0Var;
                }
            }
        }
        return i4 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(p0 p0Var) {
        if (Y(p0Var)) {
            f17175h.a(p0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void a0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends r0> T b0(T t4, int i4, t tVar) {
        T t5 = null;
        while (t4 != null) {
            if (m0(t4, i4, tVar) && (t5 == null || t5.getSnapshotId() < t4.getSnapshotId())) {
                t5 = t4;
            }
            t4 = (T) t4.getNext();
        }
        if (t5 != null) {
            return t5;
        }
        return null;
    }

    @fg.l
    public static final <T extends r0> T c0(@fg.l T t4, @fg.l p0 p0Var) {
        T t5;
        m.Companion companion = m.INSTANCE;
        companion.getClass();
        m I = I();
        ld.l<Object, k2> k4 = I.k();
        if (k4 != null) {
            k4.invoke(p0Var);
        }
        T t6 = (T) b0(t4, I.getId(), I.getInvalid());
        if (t6 != null) {
            return t6;
        }
        synchronized (f17171d) {
            companion.getClass();
            m I2 = I();
            r0 firstStateRecord = p0Var.getFirstStateRecord();
            kotlin.jvm.internal.l0.n(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t5 = (T) b0(firstStateRecord, I2.getId(), I2.getInvalid());
            if (t5 == null) {
                a0();
                throw new KotlinNothingValueException();
            }
        }
        return t5;
    }

    @fg.l
    public static final <T extends r0> T d0(@fg.l T t4, @fg.l p0 p0Var, @fg.l m mVar) {
        ld.l<Object, k2> k4 = mVar.k();
        if (k4 != null) {
            k4.invoke(p0Var);
        }
        T t5 = (T) b0(t4, mVar.getId(), mVar.getInvalid());
        if (t5 != null) {
            return t5;
        }
        a0();
        throw new KotlinNothingValueException();
    }

    public static final void e0(int i4) {
        f17174g.h(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void f0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @w0
    public static final <T> T g0(@fg.l ld.a<? extends T> aVar) {
        T invoke;
        synchronized (f17171d) {
            invoke = aVar.invoke();
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T h0(m mVar, ld.l<? super t, ? extends T> lVar) {
        T invoke = lVar.invoke(f17172e.m(mVar.getId()));
        synchronized (f17171d) {
            int i4 = f17173f;
            f17173f = i4 + 1;
            f17172e = f17172e.m(mVar.getId());
            f17178k.set(new androidx.compose.runtime.snapshots.c(i4, f17172e));
            mVar.d();
            f17172e = f17172e.v(i4);
            k2 k2Var = k2.f75408a;
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends m> T i0(ld.l<? super t, ? extends T> lVar) {
        return (T) B(new e(lVar));
    }

    public static final int j0(int i4, @fg.l t tVar) {
        int a5;
        int r4 = tVar.r(i4);
        synchronized (f17171d) {
            a5 = f17174g.a(r4);
        }
        return a5;
    }

    private static final r0 k0(p0 p0Var) {
        int f4 = f17174g.f(f17173f) - 1;
        t.INSTANCE.getClass();
        t tVar = t.f17146h;
        r0 r0Var = null;
        for (r0 firstStateRecord = p0Var.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() == 0) {
                return firstStateRecord;
            }
            if (m0(firstStateRecord, f4, tVar)) {
                if (r0Var != null) {
                    return firstStateRecord.getSnapshotId() < r0Var.getSnapshotId() ? firstStateRecord : r0Var;
                }
                r0Var = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean l0(int i4, int i5, t tVar) {
        return (i5 == 0 || i5 > i4 || tVar.q(i5)) ? false : true;
    }

    private static final boolean m0(r0 r0Var, int i4, t tVar) {
        return l0(i4, r0Var.getSnapshotId(), tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(m mVar) {
        int f4;
        if (f17172e.q(mVar.getId())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(mVar.getId());
        sb.append(", disposed=");
        sb.append(mVar.getDisposed());
        sb.append(", applied=");
        androidx.compose.runtime.snapshots.e eVar = mVar instanceof androidx.compose.runtime.snapshots.e ? (androidx.compose.runtime.snapshots.e) mVar : null;
        sb.append(eVar != null ? Boolean.valueOf(eVar.getApplied()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f17171d) {
            f4 = f17174g.f(-1);
        }
        sb.append(f4);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final <T extends r0, R> R o0(@fg.l T t4, @fg.l ld.l<? super T, ? extends R> lVar) {
        return lVar.invoke(G(t4));
    }

    public static final <T extends r0, R> R p0(@fg.l T t4, @fg.l p0 p0Var, @fg.l m mVar, @fg.l ld.l<? super T, ? extends R> lVar) {
        R invoke;
        synchronized (f17171d) {
            invoke = lVar.invoke(r0(t4, p0Var, mVar));
        }
        U(mVar, p0Var);
        return invoke;
    }

    public static final <T extends r0, R> R q0(@fg.l T t4, @fg.l p0 p0Var, @fg.l ld.l<? super T, ? extends R> lVar) {
        m I;
        R invoke;
        synchronized (f17171d) {
            m.INSTANCE.getClass();
            I = I();
            invoke = lVar.invoke(r0(t4, p0Var, I));
        }
        U(I, p0Var);
        return invoke;
    }

    @fg.l
    @w0
    public static final <T extends r0> T r0(@fg.l T t4, @fg.l p0 p0Var, @fg.l m mVar) {
        if (mVar.l()) {
            mVar.v(p0Var);
        }
        T t5 = (T) b0(t4, mVar.getId(), mVar.getInvalid());
        if (t5 == null) {
            a0();
            throw new KotlinNothingValueException();
        }
        if (t5.getSnapshotId() == mVar.getId()) {
            return t5;
        }
        T t6 = (T) S(t5, p0Var, mVar);
        mVar.v(p0Var);
        return t6;
    }
}
