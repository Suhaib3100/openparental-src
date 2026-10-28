package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.snapshots.i;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.runtime.snapshots.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.z0;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Ú\u00012\u00020\u0001:\u0006\\p\u007f\u0082\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001b\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010!J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u001eJ \u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b-\u0010.JN\u00107\u001a\u00020\u00072<\u00106\u001a8\b\u0001\u0012\u0004\u0012\u000200\u0012\u0013\u0012\u00110'¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000703\u0012\u0006\u0012\u0004\u0018\u0001040/¢\u0006\u0002\b5H\u0082@¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010!J)\u0010<\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J3\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010:H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0007H\u0002¢\u0006\u0004\bC\u0010\u001eJ#\u0010D\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010EJ3\u0010F\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u001f\u001a\u00020\u000e2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010:H\u0002¢\u0006\u0004\bF\u0010GJ<\u0010J\u001a\u00028\u0000\"\u0004\b\u0000\u0010H2\u0006\u0010\u001f\u001a\u00020\u000e2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010:2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000IH\u0082\b¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00072\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\r\u0010Q\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bS\u0010.J\u0018\u0010U\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u0002H\u0087@¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0007¢\u0006\u0004\bW\u0010\u001eJ\r\u0010X\u001a\u00020\u0007¢\u0006\u0004\bX\u0010\u001eJ\u0010\u0010Y\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bY\u0010.J*\u0010\\\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000e2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020\u00070I¢\u0006\u0002\bZH\u0010¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b^\u0010.J\r\u0010_\u001a\u00020\u0007¢\u0006\u0004\b_\u0010\u001eJ\r\u0010`\u001a\u00020\u0007¢\u0006\u0004\b`\u0010\u001eJ\u001d\u0010d\u001a\u00020\u00072\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0aH\u0010¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0010¢\u0006\u0004\bf\u0010!J\u0017\u0010g\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0010¢\u0006\u0004\bg\u0010!J\u0017\u0010h\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0010¢\u0006\u0004\bh\u0010!J\u0017\u0010k\u001a\u00020\u00072\u0006\u0010j\u001a\u00020iH\u0010¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u00072\u0006\u0010m\u001a\u00020?H\u0010¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00072\u0006\u0010m\u001a\u00020?H\u0010¢\u0006\u0004\bp\u0010oJ\u001f\u0010s\u001a\u00020\u00072\u0006\u0010m\u001a\u00020?2\u0006\u0010r\u001a\u00020qH\u0010¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000eH\u0010¢\u0006\u0004\bu\u0010!J\u0019\u0010v\u001a\u0004\u0018\u00010q2\u0006\u0010m\u001a\u00020?H\u0010¢\u0006\u0004\bv\u0010wR$\u0010}\u001a\u00020x2\u0006\u0010y\u001a\u00020x8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bp\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0085\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008d\u0001R\u001f\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u0002040:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008d\u0001R\u001d\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bn\u0010\u008d\u0001R\u001d\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020?0\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bh\u0010\u008d\u0001R3\u0010\u009b\u0001\u001a\u001f\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u0001040\u0099\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020?0\u008b\u00010\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u009a\u0001R#\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020q0\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bs\u0010\u009a\u0001R!\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010\u008d\u0001R \u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010\u009e\u0001R!\u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0019\u0010¥\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010¦\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010¬\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¦\u0001R\u001e\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b\u008f\u0001\u0010·\u0001R\u001c\u0010»\u0001\u001a\u00070¸\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001d\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0>8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010\fR\u0016\u0010Â\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\fR\u0016\u0010Ä\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010\fR&\u0010É\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010Å\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÈ\u0001\u0010\u001e\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010Ë\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010\fR\u0016\u0010Í\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\fR\u0016\u0010Ï\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\fR\u0016\u0010T\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010·\u0001R\u001c\u0010Ó\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010Ð\u00018F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0013\u0010Õ\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\fR\u0018\u0010×\u0001\u001a\u00030£\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010Ö\u0001R\u0016\u0010Ø\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\fR\u0015\u0010Ù\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\f¨\u0006Û\u0001"}, d2 = {"Landroidx/compose/runtime/i3;", "Landroidx/compose/runtime/z;", "Lkotlin/coroutines/g;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/g;)V", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "s0", "()Lkotlinx/coroutines/p;", "", "R0", "()Z", "Lkotlin/Function1;", "Landroidx/compose/runtime/n0;", "onEachInvalidComposition", "Q0", "(Lld/l;)V", "Lkotlinx/coroutines/k2;", "callingJob", "S0", "(Lkotlinx/coroutines/k2;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failedInitialComposition", "recoverable", "M0", "(Ljava/lang/Exception;Landroidx/compose/runtime/n0;Z)V", "p0", "()V", "composition", "T0", "(Landroidx/compose/runtime/n0;)V", "j0", "Landroidx/compose/runtime/i3$c;", "U0", "()Landroidx/compose/runtime/i3$c;", "W0", "Landroidx/compose/runtime/a2;", "parentFrameClock", "Landroidx/compose/runtime/x2;", "frameSignal", "X0", "(Landroidx/compose/runtime/a2;Landroidx/compose/runtime/x2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "n0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Lkotlin/r0;", "name", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "P0", "(Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "I0", "Landroidx/compose/runtime/collection/d;", "modifiedValues", "L0", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/collection/d;)Landroidx/compose/runtime/n0;", "", "Landroidx/compose/runtime/f2;", "references", "K0", "(Ljava/util/List;Landroidx/compose/runtime/collection/d;)Ljava/util/List;", "t0", "O0", "(Landroidx/compose/runtime/n0;)Lld/l;", "a1", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/collection/d;)Lld/l;", "T", "Lkotlin/Function0;", "r0", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/collection/d;Lld/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/e;", "snapshot", "k0", "(Landroidx/compose/runtime/snapshots/e;)V", "Landroidx/compose/runtime/k3;", "l0", "()Landroidx/compose/runtime/k3;", "Y0", "recomposeCoroutineContext", "Z0", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o0", "q0", "G0", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/runtime/n0;Lld/p;)V", "m0", "H0", "V0", "", "Landroidx/compose/runtime/tooling/a;", "table", "p", "(Ljava/util/Set;)V", "r", "v", "l", "Landroidx/compose/runtime/f3;", "scope", "m", "(Landroidx/compose/runtime/f3;)V", "reference", "k", "(Landroidx/compose/runtime/f2;)V", "b", "Landroidx/compose/runtime/e2;", "data", "n", "(Landroidx/compose/runtime/f2;Landroidx/compose/runtime/e2;)V", "s", "o", "(Landroidx/compose/runtime/f2;)Landroidx/compose/runtime/e2;", "", "<set-?>", "J", "u0", "()J", "changeCount", "Landroidx/compose/runtime/h;", "c", "Landroidx/compose/runtime/h;", "broadcastFrameClock", "d", "Ljava/lang/Object;", "stateLock", "Lkotlinx/coroutines/k2;", "runnerJob", "", "f", "Ljava/lang/Throwable;", "closeCause", "", "g", "Ljava/util/List;", "_knownCompositions", "h", "_knownCompositionsCache", "i", "Landroidx/compose/runtime/collection/d;", "snapshotInvalidations", "j", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/c2;", "Ljava/util/Map;", "compositionValuesRemoved", "compositionValueStatesAvailable", "failedCompositions", "Ljava/util/Set;", "compositionsRemoved", "q", "Lkotlinx/coroutines/p;", "workContinuation", "", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "t", "Landroidx/compose/runtime/i3$c;", "errorState", "u", "frameClockPaused", "Lkotlinx/coroutines/flow/e0;", "Landroidx/compose/runtime/i3$e;", "Lkotlinx/coroutines/flow/e0;", "_state", "Lkotlinx/coroutines/b0;", "w", "Lkotlinx/coroutines/b0;", "effectJob", "x", "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", "Landroidx/compose/runtime/i3$d;", "y", "Landroidx/compose/runtime/i3$d;", "recomposerInfo", "C0", "()Ljava/util/List;", "knownCompositions", "x0", "hasBroadcastFrameClockAwaitersLocked", "w0", "hasBroadcastFrameClockAwaiters", "D0", "shouldKeepRecomposing", "Lkotlinx/coroutines/flow/i;", "E0", "()Lkotlinx/coroutines/flow/i;", "F0", "state", "B0", "hasSchedulingWork", "z0", "hasFrameWorkLocked", "y0", "hasConcurrentFrameWorkLocked", "Lkotlinx/coroutines/flow/t0;", "v0", "()Lkotlinx/coroutines/flow/t0;", "currentState", "A0", "hasPendingWork", "()I", "compoundHashKey", "collectingParameterInformation", "collectingSourceInformation", "z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1564:1\n1220#1,5:1613\n1226#1:1623\n1220#1,5:1636\n1226#1:1646\n1220#1,5:1667\n1226#1:1688\n82#2:1565\n82#2:1566\n82#2:1569\n82#2:1571\n82#2:1578\n82#2:1579\n82#2:1592\n82#2:1593\n82#2:1594\n82#2:1595\n82#2:1596\n82#2:1597\n82#2:1598\n82#2:1608\n82#2:1611\n82#2:1612\n82#2:1624\n82#2:1625\n82#2:1675\n82#2:1689\n82#2:1712\n82#2:1713\n82#2:1714\n82#2:1715\n82#2:1716\n82#2:1717\n82#2:1718\n82#2:1719\n82#2:1720\n82#2:1721\n82#2:1722\n82#2:1723\n1229#3,2:1567\n1#4:1570\n33#5,6:1572\n33#5,6:1580\n33#5,6:1586\n93#5,2:1626\n33#5,4:1628\n95#5,2:1632\n38#5:1634\n97#5:1635\n120#5,3:1647\n33#5,4:1650\n123#5,2:1654\n125#5,2:1663\n38#5:1665\n127#5:1666\n82#5,3:1676\n33#5,4:1679\n85#5,2:1683\n38#5:1685\n87#5:1686\n82#5,3:1690\n33#5,4:1693\n85#5,2:1697\n38#5:1699\n87#5:1700\n33#5,6:1701\n314#6,9:1599\n323#6,2:1609\n129#7,5:1618\n129#7,5:1641\n129#7,3:1672\n133#7:1687\n129#7,5:1707\n361#8,7:1656\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1070#1:1613,5\n1070#1:1623\n1147#1:1636,5\n1147#1:1646\n1167#1:1667,5\n1167#1:1688\n292#1:1565\n342#1:1566\n436#1:1569\n440#1:1571\n461#1:1578\n466#1:1579\n492#1:1592\n705#1:1593\n743#1:1594\n774#1:1595\n786#1:1596\n803#1:1597\n939#1:1598\n951#1:1608\n1035#1:1611\n1051#1:1612\n1083#1:1624\n1114#1:1625\n1170#1:1675\n1183#1:1689\n1250#1:1712\n1287#1:1713\n1302#1:1714\n1331#1:1715\n1339#1:1716\n1348#1:1717\n1355#1:1718\n1362#1:1719\n1371#1:1720\n1377#1:1721\n1389#1:1722\n1120#1:1723\n343#1:1567,2\n446#1:1572,6\n479#1:1580,6\n484#1:1586,6\n1115#1:1626,2\n1115#1:1628,4\n1115#1:1632,2\n1115#1:1634\n1115#1:1635\n1164#1:1647,3\n1164#1:1650,4\n1164#1:1654,2\n1164#1:1663,2\n1164#1:1665\n1164#1:1666\n1171#1:1676,3\n1171#1:1679,4\n1171#1:1683,2\n1171#1:1685\n1171#1:1686\n1187#1:1690,3\n1187#1:1693,4\n1187#1:1697,2\n1187#1:1699\n1187#1:1700\n1194#1:1701,6\n950#1:1599,9\n950#1:1609,2\n1070#1:1618,5\n1147#1:1641,5\n1167#1:1672,3\n1167#1:1687\n1224#1:1707,5\n1164#1:1656,7\n*E\n"})
/* loaded from: classes.dex */
public final class i3 extends z {
    public static final int A = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h broadcastFrameClock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object stateLock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 runnerJob;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Throwable closeCause;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<n0> _knownCompositions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<? extends n0> _knownCompositionsCache;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.collection.d<Object> snapshotInvalidations;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<n0> compositionInvalidations;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<n0> compositionsAwaitingApply;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<f2> compositionValuesAwaitingInsert;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<c2<Object>, List<f2>> compositionValuesRemoved;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<f2, e2> compositionValueStatesAvailable;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<n0> failedCompositions;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Set<n0> compositionsRemoved;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.p<? super kotlin.k2> workContinuation;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private c errorState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean frameClockPaused;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.e0<e> _state;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.b0 effectJob;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g effectCoroutineContext;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d recomposerInfo;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final kotlinx.coroutines.flow.e0<androidx.compose.runtime.external.kotlinx.collections.immutable.i<d>> B = kotlinx.coroutines.flow.v0.a(androidx.compose.runtime.external.kotlinx.collections.immutable.a.K());

    @fg.l
    private static final AtomicReference<Boolean> C = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\u0003R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010!R4\u0010&\u001a\"\u0012\f\u0012\n $*\u0004\u0018\u00010\u000b0\u000b0#j\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u000b0\u000b`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/runtime/i3$a;", "", "<init>", "()V", "Landroidx/compose/runtime/i3$d;", "Landroidx/compose/runtime/i3;", "info", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/i3$d;)V", "i", "", "value", "k", "(Z)V", "j", "()Ljava/lang/Object;", "token", "h", "(Ljava/lang/Object;)V", "", "key", "g", "(I)V", "", "Landroidx/compose/runtime/j3;", "e", "()Ljava/util/List;", "d", "Lkotlinx/coroutines/flow/t0;", "", "Landroidx/compose/runtime/k3;", "f", "()Lkotlinx/coroutines/flow/t0;", "runningRecomposers", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/e0;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "_runningRecomposers", "Lkotlinx/coroutines/flow/e0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n1360#2:1565\n1446#2,5:1566\n1855#2,2:1571\n1855#2,2:1585\n1855#2,2:1587\n1603#2,9:1589\n1855#2:1598\n1856#2:1600\n1612#2:1601\n1603#2,9:1602\n1855#2:1611\n1856#2:1613\n1612#2:1614\n33#3,6:1573\n33#3,6:1579\n1#4:1599\n1#4:1612\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1440#1:1565\n1440#1:1566,5\n1448#1:1571,2\n1457#1:1585,2\n1464#1:1587,2\n1478#1:1589,9\n1478#1:1598\n1478#1:1600\n1478#1:1601\n1483#1:1602,9\n1483#1:1611\n1483#1:1613\n1483#1:1614\n1454#1:1573,6\n1455#1:1579,6\n1478#1:1599\n1483#1:1612\n*E\n"})
    /* renamed from: androidx.compose.runtime.i3$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(d info) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.i iVar;
            androidx.compose.runtime.external.kotlinx.collections.immutable.i add;
            do {
                iVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.i) i3.B.getValue();
                add = iVar.add((androidx.compose.runtime.external.kotlinx.collections.immutable.i) info);
                if (iVar == add) {
                    return;
                }
            } while (!i3.B.h(iVar, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(d info) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.i iVar;
            androidx.compose.runtime.external.kotlinx.collections.immutable.i remove;
            do {
                iVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.i) i3.B.getValue();
                remove = iVar.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.i) info);
                if (iVar == remove) {
                    return;
                }
            } while (!i3.B.h(iVar, remove));
        }

        public final void d() {
            Iterable iterable = (Iterable) i3.B.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c U0 = i3.this.U0();
                if (U0 != null) {
                    arrayList.add(U0);
                }
            }
        }

        @fg.l
        public final List<j3> e() {
            Iterable iterable = (Iterable) i3.B.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                j3 c5 = ((d) it.next()).c();
                if (c5 != null) {
                    arrayList.add(c5);
                }
            }
            return arrayList;
        }

        @fg.l
        public final kotlinx.coroutines.flow.t0<Set<k3>> f() {
            return i3.B;
        }

        public final void g(int key) {
            i3.C.set(Boolean.TRUE);
            for (d dVar : (Iterable) i3.B.getValue()) {
                j3 c5 = dVar.c();
                if (c5 == null || c5.getRecoverable()) {
                    dVar.e();
                    dVar.d(key);
                    dVar.f();
                }
            }
        }

        public final void h(@fg.l Object token) {
            i3.C.set(Boolean.TRUE);
            Iterator it = ((Iterable) i3.B.getValue()).iterator();
            while (it.hasNext()) {
                ((d) it.next()).e();
            }
            kotlin.jvm.internal.l0.n(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) token;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b) list.get(i4)).c();
            }
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((b) list.get(i5)).b();
            }
            Iterator it2 = ((Iterable) i3.B.getValue()).iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).f();
            }
        }

        @fg.l
        public final Object j() {
            i3.C.set(Boolean.TRUE);
            Iterable iterable = (Iterable) i3.B.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                kotlin.collections.w.q0(arrayList, ((d) it.next()).g());
            }
            return arrayList;
        }

        public final void k(boolean value) {
            i3.C.set(Boolean.valueOf(value));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR!\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/i3$b;", "", "Landroidx/compose/runtime/b0;", "composition", "<init>", "(Landroidx/compose/runtime/b0;)V", "Lkotlin/k2;", "a", "()V", "c", "b", "Landroidx/compose/runtime/b0;", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "Lld/p;", "composable", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b0 composition;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private ld.p<? super t, ? super Integer, kotlin.k2> composable;

        public b(@fg.l b0 b0Var) {
            this.composition = b0Var;
            this.composable = b0Var.u();
        }

        public final void a() {
            if (this.composition.getIsRoot()) {
                b0 b0Var = this.composition;
                androidx.compose.runtime.m.f16843a.getClass();
                b0Var.e(androidx.compose.runtime.m.f16844b);
            }
        }

        public final void b() {
            if (this.composition.getIsRoot()) {
                this.composition.e(this.composable);
            }
        }

        public final void c() {
            this.composition.e0(this.composable);
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/i3$c;", "Landroidx/compose/runtime/j3;", "", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "a", "Z", "b", "()Z", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements j3 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean recoverable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Exception cause;

        public c(boolean z4, @fg.l Exception exc) {
            this.recoverable = z4;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.j3
        @fg.l
        /* renamed from: a, reason: from getter */
        public Exception getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.j3
        /* renamed from: b, reason: from getter */
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/runtime/i3$d;", "Landroidx/compose/runtime/k3;", "<init>", "(Landroidx/compose/runtime/i3;)V", "", "key", "Lkotlin/k2;", "d", "(I)V", "", "Landroidx/compose/runtime/i3$b;", "g", "()Ljava/util/List;", "Landroidx/compose/runtime/i3$c;", "e", "()Landroidx/compose/runtime/i3$c;", "f", "()V", "Lkotlinx/coroutines/flow/i;", "Landroidx/compose/runtime/i3$e;", "getState", "()Lkotlinx/coroutines/flow/i;", "state", "", "b", "()Z", "hasPendingWork", "", "a", "()J", "changeCount", "Landroidx/compose/runtime/j3;", "c", "()Landroidx/compose/runtime/j3;", "currentError", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1566\n82#2:1585\n211#3,3:1567\n33#3,4:1570\n214#3:1574\n215#3:1576\n38#3:1577\n216#3:1578\n33#3,6:1579\n211#3,3:1586\n33#3,4:1589\n214#3:1593\n215#3:1595\n38#3:1596\n216#3:1597\n82#3,3:1598\n33#3,4:1601\n85#3:1605\n86#3:1607\n38#3:1608\n87#3:1609\n1#4:1575\n1#4:1594\n1#4:1606\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n368#1:1565\n373#1:1566\n381#1:1585\n377#1:1567,3\n377#1:1570,4\n377#1:1574\n377#1:1576\n377#1:1577\n377#1:1578\n378#1:1579,6\n385#1:1586,3\n385#1:1589,4\n385#1:1593\n385#1:1595\n385#1:1596\n385#1:1597\n386#1:1598,3\n386#1:1601,4\n386#1:1605\n386#1:1607\n386#1:1608\n386#1:1609\n377#1:1575\n385#1:1594\n*E\n"})
    private final class d implements k3 {
        public d() {
        }

        @Override // androidx.compose.runtime.k3
        public long a() {
            return i3.this.getChangeCount();
        }

        @Override // androidx.compose.runtime.k3
        public boolean b() {
            return i3.this.A0();
        }

        @fg.m
        public final j3 c() {
            c cVar;
            Object obj = i3.this.stateLock;
            i3 i3Var = i3.this;
            synchronized (obj) {
                cVar = i3Var.errorState;
            }
            return cVar;
        }

        public final void d(int key) {
            List C0;
            Object obj = i3.this.stateLock;
            i3 i3Var = i3.this;
            synchronized (obj) {
                C0 = i3Var.C0();
            }
            ArrayList arrayList = new ArrayList(C0.size());
            int size = C0.size();
            for (int i4 = 0; i4 < size; i4++) {
                n0 n0Var = (n0) C0.get(i4);
                b0 b0Var = n0Var instanceof b0 ? (b0) n0Var : null;
                if (b0Var != null) {
                    arrayList.add(b0Var);
                }
            }
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((b0) arrayList.get(i5)).X(key);
            }
        }

        @fg.m
        public final c e() {
            return i3.this.U0();
        }

        public final void f() {
            i3.this.W0();
        }

        @fg.l
        public final List<b> g() {
            List C0;
            Object obj = i3.this.stateLock;
            i3 i3Var = i3.this;
            synchronized (obj) {
                C0 = i3Var.C0();
            }
            ArrayList arrayList = new ArrayList(C0.size());
            int size = C0.size();
            for (int i4 = 0; i4 < size; i4++) {
                n0 n0Var = (n0) C0.get(i4);
                b0 b0Var = n0Var instanceof b0 ? (b0) n0Var : null;
                if (b0Var != null) {
                    arrayList.add(b0Var);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                b bVar = new b((b0) arrayList.get(i5));
                bVar.a();
                arrayList2.add(bVar);
            }
            return arrayList2;
        }

        @Override // androidx.compose.runtime.k3
        @fg.l
        public kotlinx.coroutines.flow.i<e> getState() {
            return i3.this.v0();
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/i3$e;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum e {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/i3$e;", "it", "", "<anonymous>", "(Landroidx/compose/runtime/i3$e;)Z"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<e, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16490b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16491c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l e eVar, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((f) create(eVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(2, dVar);
            fVar.f16491c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f16490b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return Boolean.valueOf(((e) this.f16491c).compareTo(e.Idle) > 0);
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1564:1\n82#2:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n141#1:1565\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        g() {
            super(0);
        }

        public final void a() {
            kotlinx.coroutines.p s02;
            Object obj = i3.this.stateLock;
            i3 i3Var = i3.this;
            synchronized (obj) {
                s02 = i3Var.s0();
                if (((e) i3Var._state.getValue()).compareTo(e.ShuttingDown) <= 0) {
                    throw kotlinx.coroutines.v1.a("Recomposer shutdown; frame clock awaiter will never resume", i3Var.closeCause);
                }
            }
            if (s02 != null) {
                z0.Companion companion = kotlin.z0.INSTANCE;
                s02.resumeWith(kotlin.k2.f75408a);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1564:1\n82#2:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n246#1:1565\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n1#3:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n*L\n261#1:1565\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i3 f16494b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f16495c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i3 i3Var, Throwable th) {
                super(1);
                this.f16494b = i3Var;
                this.f16495c = th;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
                invoke2(th);
                return kotlin.k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                Object obj = this.f16494b.stateLock;
                i3 i3Var = this.f16494b;
                Throwable th2 = this.f16495c;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                kotlin.o.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    i3Var.closeCause = th2;
                    i3Var._state.setValue(e.ShutDown);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                }
            }
        }

        h() {
            super(1);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            invoke2(th);
            return kotlin.k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            kotlinx.coroutines.p pVar;
            kotlinx.coroutines.p pVar2;
            CancellationException a5 = kotlinx.coroutines.v1.a("Recomposer effect job completed", th);
            Object obj = i3.this.stateLock;
            i3 i3Var = i3.this;
            synchronized (obj) {
                try {
                    kotlinx.coroutines.k2 k2Var = i3Var.runnerJob;
                    pVar = null;
                    if (k2Var != null) {
                        i3Var._state.setValue(e.ShuttingDown);
                        if (!i3Var.isClosed) {
                            k2Var.b(a5);
                        } else if (i3Var.workContinuation != null) {
                            pVar2 = i3Var.workContinuation;
                            i3Var.workContinuation = null;
                            k2Var.F(new a(i3Var, th));
                            pVar = pVar2;
                        }
                        pVar2 = null;
                        i3Var.workContinuation = null;
                        k2Var.F(new a(i3Var, th));
                        pVar = pVar2;
                    } else {
                        i3Var.closeCause = a5;
                        i3Var._state.setValue(e.ShutDown);
                        kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pVar != null) {
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(kotlin.k2.f75408a);
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/i3$e;", "it", "", "<anonymous>", "(Landroidx/compose/runtime/i3$e;)Z"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<e, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16496b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16497c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l e eVar, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((i) create(eVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(2, dVar);
            iVar.f16497c = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f16496b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return Boolean.valueOf(((e) this.f16497c) == e.ShutDown);
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,1564:1\n108#2,7:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1152#1:1565,7\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.collection.d<Object> f16498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f16499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.runtime.collection.d<Object> dVar, n0 n0Var) {
            super(0);
            this.f16498b = dVar;
            this.f16499c = n0Var;
        }

        public final void a() {
            androidx.compose.runtime.collection.d<Object> dVar = this.f16498b;
            n0 n0Var = this.f16499c;
            Object[] values = dVar.getValues();
            int size = dVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = values[i4];
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                n0Var.K(obj);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<Object, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f16500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(n0 n0Var) {
            super(1);
            this.f16500b = n0Var;
        }

        public final void a(@fg.l Object obj) {
            this.f16500b.a(obj);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
            a(obj);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1003}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1572\n33#3,6:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n999#1:1565\n1008#1:1572\n1001#1:1566,6\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f16501b;

        /* renamed from: c, reason: collision with root package name */
        int f16502c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f16503d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, a2, kotlin.coroutines.d<? super kotlin.k2>, Object> f16505f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a2 f16506g;

        /* compiled from: Recomposer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1004}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f16507b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f16508c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlinx.coroutines.r0, a2, kotlin.coroutines.d<? super kotlin.k2>, Object> f16509d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a2 f16510e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.q<? super kotlinx.coroutines.r0, ? super a2, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, a2 a2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f16509d = qVar;
                this.f16510e = a2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f16509d, this.f16510e, dVar);
                aVar.f16508c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f16507b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16508c;
                    ld.q<kotlinx.coroutines.r0, a2, kotlin.coroutines.d<? super kotlin.k2>, Object> qVar = this.f16509d;
                    a2 a2Var = this.f16510e;
                    this.f16507b = 1;
                    if (qVar.R(r0Var, a2Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/m;", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/m;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1564:1\n82#2:1565\n396#3,2:1566\n399#3:1575\n401#3:1578\n108#4,5:1568\n114#4:1574\n50#5:1573\n1855#6,2:1576\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n977#1:1565\n979#1:1566,2\n979#1:1575\n979#1:1578\n979#1:1568,5\n979#1:1574\n982#1:1573\n979#1:1576,2\n*E\n"})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<Set<? extends Object>, androidx.compose.runtime.snapshots.m, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i3 f16511b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i3 i3Var) {
                super(2);
                this.f16511b = i3Var;
            }

            public final void a(@fg.l Set<? extends Object> set, @fg.l androidx.compose.runtime.snapshots.m mVar) {
                kotlinx.coroutines.p pVar;
                int i4;
                Object obj = this.f16511b.stateLock;
                i3 i3Var = this.f16511b;
                synchronized (obj) {
                    try {
                        if (((e) i3Var._state.getValue()).compareTo(e.Idle) >= 0) {
                            if (set instanceof androidx.compose.runtime.collection.d) {
                                androidx.compose.runtime.collection.d dVar = (androidx.compose.runtime.collection.d) set;
                                Object[] values = dVar.getValues();
                                int size = dVar.size();
                                while (i4 < size) {
                                    Object obj2 = values[i4];
                                    kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (obj2 instanceof androidx.compose.runtime.snapshots.q0) {
                                        i.Companion companion = androidx.compose.runtime.snapshots.i.INSTANCE;
                                        i4 = ((androidx.compose.runtime.snapshots.q0) obj2).a(1) ? 0 : i4 + 1;
                                    }
                                    i3Var.snapshotInvalidations.add(obj2);
                                }
                            } else {
                                for (Object obj3 : set) {
                                    if (obj3 instanceof androidx.compose.runtime.snapshots.q0) {
                                        i.Companion companion2 = androidx.compose.runtime.snapshots.i.INSTANCE;
                                        if (!((androidx.compose.runtime.snapshots.q0) obj3).a(1)) {
                                        }
                                    }
                                    i3Var.snapshotInvalidations.add(obj3);
                                }
                            }
                            pVar = i3Var.s0();
                        } else {
                            pVar = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (pVar != null) {
                    z0.Companion companion3 = kotlin.z0.INSTANCE;
                    pVar.resumeWith(kotlin.k2.f75408a);
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.m mVar) {
                a(set, mVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ld.q<? super kotlinx.coroutines.r0, ? super a2, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, a2 a2Var, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f16505f = qVar;
            this.f16506g = a2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l lVar = i3.this.new l(this.f16505f, this.f16506g, dVar);
            lVar.f16503d = obj;
            return lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.i3.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((l) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {871, 878}, m = "runFrameLoop", n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f16512b;

        /* renamed from: c, reason: collision with root package name */
        Object f16513c;

        /* renamed from: d, reason: collision with root package name */
        Object f16514d;

        /* renamed from: e, reason: collision with root package name */
        Object f16515e;

        /* renamed from: f, reason: collision with root package name */
        Object f16516f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f16517g;

        /* renamed from: i, reason: collision with root package name */
        int f16519i;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f16517g = obj;
            this.f16519i |= Integer.MIN_VALUE;
            return i3.this.X0(null, null, this);
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "frameTime", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "a", "(J)Lkotlinx/coroutines/p;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n46#2,5:1565\n46#2,3:1570\n50#2:1599\n82#3:1573\n82#3:1598\n33#4,6:1574\n33#4,6:1580\n33#4,6:1586\n33#4,6:1592\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n882#1:1565,5\n892#1:1570,3\n892#1:1599\n897#1:1573\n930#1:1598\n898#1:1574,6\n900#1:1580,6\n908#1:1586,6\n923#1:1592,6\n*E\n"})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlinx.coroutines.p<? super kotlin.k2>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<n0> f16521c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<n0> f16522d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x2 f16523e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List<n0> list, List<n0> list2, x2 x2Var) {
            super(1);
            this.f16521c = list;
            this.f16522d = list2;
            this.f16523e = x2Var;
        }

        @fg.m
        public final kotlinx.coroutines.p<kotlin.k2> a(long j4) {
            int i4;
            kotlinx.coroutines.p<kotlin.k2> s02;
            if (i3.this.w0()) {
                i3 i3Var = i3.this;
                g5 g5Var = g5.f16432a;
                g5Var.getClass();
                Trace.beginSection("Recomposer:animation");
                try {
                    i3Var.broadcastFrameClock.A(j4);
                    androidx.compose.runtime.snapshots.m.INSTANCE.q();
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    g5Var.getClass();
                    Trace.endSection();
                } finally {
                }
            }
            i3 i3Var2 = i3.this;
            List<n0> list = this.f16521c;
            List<n0> list2 = this.f16522d;
            x2 x2Var = this.f16523e;
            g5.f16432a.getClass();
            Trace.beginSection("Recomposer:recompose");
            try {
                i3Var2.R0();
                synchronized (i3Var2.stateLock) {
                    try {
                        List list3 = i3Var2.compositionsAwaitingApply;
                        int size = list3.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            list2.add((n0) list3.get(i5));
                        }
                        i3Var2.compositionsAwaitingApply.clear();
                        List list4 = i3Var2.compositionInvalidations;
                        int size2 = list4.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            list.add((n0) list4.get(i6));
                        }
                        i3Var2.compositionInvalidations.clear();
                        x2Var.e();
                        kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d();
                try {
                    int size3 = list.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        n0 L0 = i3Var2.L0(list.get(i7), dVar);
                        if (L0 != null) {
                            list2.add(L0);
                        }
                    }
                    list.clear();
                    if (!list2.isEmpty()) {
                        i3Var2.changeCount = i3Var2.getChangeCount() + 1;
                    }
                    try {
                        int size4 = list2.size();
                        for (i4 = 0; i4 < size4; i4++) {
                            list2.get(i4).I();
                        }
                        list2.clear();
                        synchronized (i3Var2.stateLock) {
                            s02 = i3Var2.s0();
                        }
                        return s02;
                    } catch (Throwable th2) {
                        list2.clear();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    list.clear();
                    throw th3;
                }
            } finally {
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlinx.coroutines.p<? super kotlin.k2> invoke(Long l4) {
            return a(l4.longValue());
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {540, 551}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/runtime/a2;", "parentFrameClock", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Landroidx/compose/runtime/a2;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n82#2:1565\n33#3,6:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n533#1:1565\n534#1:1566,6\n*E\n"})
    static final class o extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, a2, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f16524b;

        /* renamed from: c, reason: collision with root package name */
        Object f16525c;

        /* renamed from: d, reason: collision with root package name */
        Object f16526d;

        /* renamed from: e, reason: collision with root package name */
        Object f16527e;

        /* renamed from: f, reason: collision with root package name */
        Object f16528f;

        /* renamed from: g, reason: collision with root package name */
        Object f16529g;

        /* renamed from: h, reason: collision with root package name */
        Object f16530h;

        /* renamed from: i, reason: collision with root package name */
        int f16531i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f16532j;

        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1564:1\n46#2,5:1565\n46#2,3:1570\n50#2:1586\n82#3:1573\n82#3:1587\n82#3:1610\n33#4,6:1574\n33#4,6:1580\n33#4,6:1588\n33#4,6:1594\n33#4,6:1600\n1855#5,2:1606\n1855#5,2:1608\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n555#1:1565,5\n565#1:1570,3\n565#1:1586\n569#1:1573\n600#1:1587\n679#1:1610\n570#1:1574,6\n581#1:1580,6\n601#1:1588,6\n635#1:1594,6\n638#1:1600,6\n653#1:1606,2\n667#1:1608,2\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i3 f16534b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.collection.d<Object> f16535c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.collection.d<n0> f16536d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<n0> f16537e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<f2> f16538f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Set<n0> f16539g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ List<n0> f16540h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Set<n0> f16541i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i3 i3Var, androidx.compose.runtime.collection.d<Object> dVar, androidx.compose.runtime.collection.d<n0> dVar2, List<n0> list, List<f2> list2, Set<n0> set, List<n0> list3, Set<n0> set2) {
                super(1);
                this.f16534b = i3Var;
                this.f16535c = dVar;
                this.f16536d = dVar2;
                this.f16537e = list;
                this.f16538f = list2;
                this.f16539g = set;
                this.f16540h = list3;
                this.f16541i = set2;
            }

            public final void a(long j4) {
                int i4;
                if (this.f16534b.w0()) {
                    i3 i3Var = this.f16534b;
                    g5 g5Var = g5.f16432a;
                    g5Var.getClass();
                    Trace.beginSection("Recomposer:animation");
                    try {
                        i3Var.broadcastFrameClock.A(j4);
                        androidx.compose.runtime.snapshots.m.INSTANCE.q();
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                        g5Var.getClass();
                        Trace.endSection();
                    } finally {
                        g5.f16432a.getClass();
                        Trace.endSection();
                    }
                }
                i3 i3Var2 = this.f16534b;
                androidx.compose.runtime.collection.d<Object> dVar = this.f16535c;
                androidx.compose.runtime.collection.d<n0> dVar2 = this.f16536d;
                List<n0> list = this.f16537e;
                List<f2> list2 = this.f16538f;
                Set<n0> set = this.f16539g;
                List<n0> list3 = this.f16540h;
                Set<n0> set2 = this.f16541i;
                g5.f16432a.getClass();
                Trace.beginSection("Recomposer:recompose");
                try {
                    i3Var2.R0();
                    synchronized (i3Var2.stateLock) {
                        try {
                            List list4 = i3Var2.compositionInvalidations;
                            int size = list4.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                list.add((n0) list4.get(i5));
                            }
                            i3Var2.compositionInvalidations.clear();
                            kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                        } finally {
                        }
                    }
                    dVar.clear();
                    dVar2.clear();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            break;
                        }
                        try {
                            try {
                                int size2 = list.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    n0 n0Var = list.get(i6);
                                    dVar2.add(n0Var);
                                    n0 L0 = i3Var2.L0(n0Var, dVar);
                                    if (L0 != null) {
                                        list3.add(L0);
                                    }
                                }
                                list.clear();
                                if (dVar.q()) {
                                    synchronized (i3Var2.stateLock) {
                                        try {
                                            List C0 = i3Var2.C0();
                                            int size3 = C0.size();
                                            for (int i7 = 0; i7 < size3; i7++) {
                                                n0 n0Var2 = (n0) C0.get(i7);
                                                if (!dVar2.contains(n0Var2) && n0Var2.F(dVar)) {
                                                    list.add(n0Var2);
                                                }
                                            }
                                            kotlin.k2 k2Var3 = kotlin.k2.f75408a;
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        o.q(list2, i3Var2);
                                        while (!list2.isEmpty()) {
                                            kotlin.collections.w.q0(set, i3Var2.K0(list2, dVar));
                                            o.q(list2, i3Var2);
                                        }
                                    } catch (Exception e4) {
                                        i3.N0(i3Var2, e4, null, true, 2, null);
                                        o.n(list, list2, list3, set, set2, dVar, dVar2);
                                        return;
                                    }
                                }
                            } catch (Exception e5) {
                                i3.N0(i3Var2, e5, null, true, 2, null);
                                o.n(list, list2, list3, set, set2, dVar, dVar2);
                                list.clear();
                                return;
                            }
                        } catch (Throwable th) {
                            list.clear();
                            throw th;
                        }
                    }
                    if (!list3.isEmpty()) {
                        i3Var2.changeCount = i3Var2.getChangeCount() + 1;
                        try {
                            try {
                                int size4 = list3.size();
                                for (int i10 = 0; i10 < size4; i10++) {
                                    set2.add(list3.get(i10));
                                }
                                int size5 = list3.size();
                                for (i4 = 0; i4 < size5; i4++) {
                                    list3.get(i4).I();
                                }
                                list3.clear();
                            } catch (Exception e6) {
                                i3.N0(i3Var2, e6, null, false, 6, null);
                                o.n(list, list2, list3, set, set2, dVar, dVar2);
                                list3.clear();
                                return;
                            }
                        } finally {
                            list3.clear();
                        }
                    }
                    try {
                        if (!set.isEmpty()) {
                            kotlin.collections.w.q0(set2, set);
                            Iterator<T> it = set.iterator();
                            while (it.hasNext()) {
                                ((n0) it.next()).z();
                            }
                        }
                        if (!set2.isEmpty()) {
                            try {
                                Iterator<T> it2 = set2.iterator();
                                while (it2.hasNext()) {
                                    ((n0) it2.next()).M();
                                }
                            } catch (Exception e7) {
                                i3.N0(i3Var2, e7, null, false, 6, null);
                                o.n(list, list2, list3, set, set2, dVar, dVar2);
                                return;
                            } finally {
                                set2.clear();
                            }
                        }
                        synchronized (i3Var2.stateLock) {
                            i3Var2.s0();
                        }
                        androidx.compose.runtime.snapshots.m.INSTANCE.g();
                        dVar2.clear();
                        dVar.clear();
                        i3Var2.compositionsRemoved = null;
                        kotlin.k2 k2Var4 = kotlin.k2.f75408a;
                    } catch (Exception e10) {
                        i3.N0(i3Var2, e10, null, false, 6, null);
                        o.n(list, list2, list3, set, set2, dVar, dVar2);
                    } finally {
                        set.clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4.longValue());
                return kotlin.k2.f75408a;
            }
        }

        o(kotlin.coroutines.d<? super o> dVar) {
            super(3, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(List<n0> list, List<f2> list2, List<n0> list3, Set<n0> set, Set<n0> set2, androidx.compose.runtime.collection.d<Object> dVar, androidx.compose.runtime.collection.d<n0> dVar2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
            dVar.clear();
            dVar2.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(List<f2> list, i3 i3Var) {
            list.clear();
            synchronized (i3Var.stateLock) {
                try {
                    List list2 = i3Var.compositionValuesAwaitingInsert;
                    int size = list2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        list.add((f2) list2.get(i4));
                    }
                    i3Var.compositionValuesAwaitingInsert.clear();
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0132  */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0114 -> B:6:0x0118). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0124 -> B:7:0x0120). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.i3.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.q
        @fg.m
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.r0 r0Var, @fg.l a2 a2Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            o oVar = i3.this.new o(dVar);
            oVar.f16532j = a2Var;
            return oVar.invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {840, 860, 861}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/runtime/a2;", "parentFrameClock", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Landroidx/compose/runtime/a2;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1564:1\n477#2,3:1565\n480#2,2:1572\n482#2,3:1575\n485#2,5:1579\n33#3,4:1568\n38#3:1574\n82#4:1578\n82#4:1584\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n843#1:1565,3\n843#1:1572,2\n843#1:1575,3\n843#1:1579,5\n843#1:1568,4\n843#1:1574\n844#1:1578\n856#1:1584\n*E\n"})
    static final class p extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, a2, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f16542b;

        /* renamed from: c, reason: collision with root package name */
        int f16543c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f16544d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16545e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.g f16546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i3 f16547g;

        /* compiled from: Recomposer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n1#3:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n*L\n849#1:1565\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f16548b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i3 f16549c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f16550d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i3 i3Var, n0 n0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f16549c = i3Var;
                this.f16550d = n0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f16549c, this.f16550d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlinx.coroutines.p s02;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f16548b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                n0 L0 = this.f16549c.L0(this.f16550d, null);
                Object obj2 = this.f16549c.stateLock;
                i3 i3Var = this.f16549c;
                synchronized (obj2) {
                    if (L0 != null) {
                        try {
                            i3Var.compositionsAwaitingApply.add(L0);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    i3Var.concurrentCompositionsOutstanding--;
                    s02 = i3Var.s0();
                }
                if (s02 != null) {
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    s02.resumeWith(kotlin.k2.f75408a);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: Recomposer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", f = "Recomposer.kt", i = {}, l = {838}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f16551b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i3 f16552c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a2 f16553d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x2 f16554e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i3 i3Var, a2 a2Var, x2 x2Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f16552c = i3Var;
                this.f16553d = a2Var;
                this.f16554e = x2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f16552c, this.f16553d, this.f16554e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f16551b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    i3 i3Var = this.f16552c;
                    a2 a2Var = this.f16553d;
                    x2 x2Var = this.f16554e;
                    this.f16551b = 1;
                    if (i3Var.X0(a2Var, x2Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kotlin.coroutines.g gVar, i3 i3Var, kotlin.coroutines.d<? super p> dVar) {
            super(3, dVar);
            this.f16546f = gVar;
            this.f16547g = i3Var;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.r0 r0Var, @fg.l a2 a2Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            p pVar = new p(this.f16546f, this.f16547g, dVar);
            pVar.f16544d = r0Var;
            pVar.f16545e = a2Var;
            return pVar.invokeSuspend(kotlin.k2.f75408a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0179 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00a1 -> B:17:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 409
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.i3.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<Object, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f16555b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.collection.d<Object> f16556c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(n0 n0Var, androidx.compose.runtime.collection.d<Object> dVar) {
            super(1);
            this.f16555b = n0Var;
            this.f16556c = dVar;
        }

        public final void a(@fg.l Object obj) {
            this.f16555b.K(obj);
            androidx.compose.runtime.collection.d<Object> dVar = this.f16556c;
            if (dVar != null) {
                dVar.add(obj);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
            a(obj);
            return kotlin.k2.f75408a;
        }
    }

    public i3(@fg.l kotlin.coroutines.g gVar) {
        androidx.compose.runtime.h hVar = new androidx.compose.runtime.h(new g());
        this.broadcastFrameClock = hVar;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = kotlinx.coroutines.flow.v0.a(e.Inactive);
        kotlinx.coroutines.m2 m2Var = new kotlinx.coroutines.m2((kotlinx.coroutines.k2) gVar.c(kotlinx.coroutines.k2.INSTANCE));
        m2Var.F(new h());
        this.effectJob = m2Var;
        this.effectCoroutineContext = gVar.O(hVar).O(m2Var);
        this.recomposerInfo = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B0() {
        boolean z4;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.q() && this.compositionInvalidations.isEmpty()) {
                z4 = x0();
            }
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<n0> C0() {
        List list = this._knownCompositionsCache;
        if (list == null) {
            List<n0> list2 = this._knownCompositions;
            list = list2.isEmpty() ? kotlin.collections.j0.f74919b : new ArrayList(list2);
            this._knownCompositionsCache = list;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D0() {
        boolean z4;
        synchronized (this.stateLock) {
            z4 = this.isClosed;
        }
        if (z4) {
            Iterator<kotlinx.coroutines.k2> it = this.effectJob.o().iterator();
            while (it.hasNext()) {
                if (it.next().isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    @kotlin.k(message = "Replaced by currentState as a StateFlow", replaceWith = @kotlin.x0(expression = "currentState", imports = {}))
    public static /* synthetic */ void F0() {
    }

    private final void I0(n0 composition) {
        synchronized (this.stateLock) {
            List<f2> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (kotlin.jvm.internal.l0.g(list.get(i4).getComposition(), composition)) {
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    ArrayList arrayList = new ArrayList();
                    J0(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        K0(arrayList, null);
                        J0(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void J0(List<f2> list, i3 i3Var, n0 n0Var) {
        list.clear();
        synchronized (i3Var.stateLock) {
            try {
                Iterator<f2> it = i3Var.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    f2 next = it.next();
                    if (kotlin.jvm.internal.l0.g(next.getComposition(), n0Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<n0> K0(List<f2> references, androidx.compose.runtime.collection.d<Object> modifiedValues) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(references.size());
        int size = references.size();
        for (int i4 = 0; i4 < size; i4++) {
            f2 f2Var = references.get(i4);
            n0 composition = f2Var.getComposition();
            Object obj = hashMap.get(composition);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition, obj);
            }
            ((ArrayList) obj).add(f2Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            n0 n0Var = (n0) entry.getKey();
            List list = (List) entry.getValue();
            x.l0(!n0Var.J());
            androidx.compose.runtime.snapshots.e r4 = androidx.compose.runtime.snapshots.m.INSTANCE.r(new k(n0Var), new q(n0Var, modifiedValues));
            try {
                androidx.compose.runtime.snapshots.m r5 = r4.r();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            f2 f2Var2 = (f2) list.get(i5);
                            arrayList.add(new kotlin.q0<>(f2Var2, m3.d(this.compositionValuesRemoved, f2Var2.c())));
                        }
                    }
                    n0Var.C(arrayList);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } finally {
                    r4.y(r5);
                }
            } finally {
                k0(r4);
            }
        }
        return kotlin.collections.w.V5(hashMap.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0 L0(n0 composition, androidx.compose.runtime.collection.d<Object> modifiedValues) {
        Set<n0> set;
        if (composition.J() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        androidx.compose.runtime.snapshots.e r4 = androidx.compose.runtime.snapshots.m.INSTANCE.r(new k(composition), new q(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.m r5 = r4.r();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.q()) {
                        composition.L(new j(modifiedValues, composition));
                    }
                } catch (Throwable th) {
                    r4.y(r5);
                    throw th;
                }
            }
            boolean E = composition.E();
            r4.y(r5);
            if (E) {
                return composition;
            }
            return null;
        } finally {
            k0(r4);
        }
    }

    private final void M0(Exception e4, n0 failedInitialComposition, boolean recoverable) {
        if (!C.get().booleanValue() || (e4 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                c cVar = this.errorState;
                if (cVar != null) {
                    throw cVar.getCause();
                }
                this.errorState = new c(false, e4);
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
            throw e4;
        }
        synchronized (this.stateLock) {
            try {
                androidx.compose.runtime.b.i("Error was captured in composition while live edit was enabled.", e4);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new c(recoverable, e4);
                if (failedInitialComposition != null) {
                    List list = this.failedCompositions;
                    if (list == null) {
                        list = new ArrayList();
                        this.failedCompositions = list;
                    }
                    if (!list.contains(failedInitialComposition)) {
                        list.add(failedInitialComposition);
                    }
                    T0(failedInitialComposition);
                }
                s0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void N0(i3 i3Var, Exception exc, n0 n0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            n0Var = null;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        i3Var.M0(exc, n0Var, z4);
    }

    private final ld.l<Object, kotlin.k2> O0(n0 composition) {
        return new k(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P0(ld.q<? super kotlinx.coroutines.r0, ? super a2, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object h4 = kotlinx.coroutines.i.h(this.broadcastFrameClock, new l(qVar, b2.a(dVar.getContext()), null), dVar);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
    }

    private final void Q0(ld.l<? super n0, kotlin.k2> onEachInvalidComposition) {
        androidx.compose.runtime.collection.d<Object> dVar = this.snapshotInvalidations;
        if (dVar.q()) {
            List<n0> C0 = C0();
            int size = C0.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0.get(i4).H(dVar);
            }
            this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
        }
        List<n0> list = this.compositionInvalidations;
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            onEachInvalidComposition.invoke(list.get(i5));
        }
        this.compositionInvalidations.clear();
        if (s0() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0() {
        List<n0> C0;
        boolean z02;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return z0();
            }
            androidx.compose.runtime.collection.d<Object> dVar = this.snapshotInvalidations;
            this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
            synchronized (this.stateLock) {
                C0 = C0();
            }
            try {
                int size = C0.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0.get(i4).H(dVar);
                    if (this._state.getValue().compareTo(e.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
                synchronized (this.stateLock) {
                    if (s0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    z02 = z0();
                }
                return z02;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.c(dVar);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(kotlinx.coroutines.k2 callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(e.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            s0();
        }
    }

    private final void T0(n0 composition) {
        this._knownCompositions.remove(composition);
        this._knownCompositionsCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c U0() {
        c cVar;
        synchronized (this.stateLock) {
            cVar = this.errorState;
            if (cVar != null) {
                this.errorState = null;
                s0();
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0() {
        List<n0> list;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                n0 n0Var = (n0) kotlin.collections.w.O0(list);
                if (n0Var instanceof b0) {
                    b0 b0Var = (b0) n0Var;
                    b0Var.x();
                    b0Var.e(((b0) n0Var).u());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            List<n0> list2 = this.failedCompositions;
                            if (list2 != null) {
                                list2.addAll(list);
                                list = list2;
                            }
                            this.failedCompositions = list;
                            kotlin.k2 k2Var = kotlin.k2.f75408a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            try {
                List<n0> list3 = this.failedCompositions;
                if (list3 != null) {
                    list3.addAll(list);
                    list = list3;
                }
                this.failedCompositions = list;
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009c -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X0(androidx.compose.runtime.a2 r8, androidx.compose.runtime.x2 r9, kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.i3.m
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.i3$m r0 = (androidx.compose.runtime.i3.m) r0
            int r1 = r0.f16519i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16519i = r1
            goto L18
        L13:
            androidx.compose.runtime.i3$m r0 = new androidx.compose.runtime.i3$m
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16517g
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f16519i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L63
            if (r2 == r4) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r8 = r0.f16516f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f16515e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f16514d
            androidx.compose.runtime.x2 r2 = (androidx.compose.runtime.x2) r2
            java.lang.Object r5 = r0.f16513c
            androidx.compose.runtime.a2 r5 = (androidx.compose.runtime.a2) r5
            java.lang.Object r6 = r0.f16512b
            androidx.compose.runtime.i3 r6 = (androidx.compose.runtime.i3) r6
            kotlin.a1.n(r10)
        L3d:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L6d
        L43:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4b:
            java.lang.Object r8 = r0.f16516f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.f16515e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f16514d
            androidx.compose.runtime.x2 r2 = (androidx.compose.runtime.x2) r2
            java.lang.Object r5 = r0.f16513c
            androidx.compose.runtime.a2 r5 = (androidx.compose.runtime.a2) r5
            java.lang.Object r6 = r0.f16512b
            androidx.compose.runtime.i3 r6 = (androidx.compose.runtime.i3) r6
            kotlin.a1.n(r10)
            goto L87
        L63:
            java.util.ArrayList r10 = androidx.compose.foundation.interaction.b.a(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L6d:
            java.lang.Object r6 = r5.stateLock
            r0.f16512b = r5
            r0.f16513c = r8
            r0.f16514d = r9
            r0.f16515e = r10
            r0.f16516f = r2
            r0.f16519i = r4
            java.lang.Object r6 = r9.c(r6, r0)
            if (r6 != r1) goto L82
            return r1
        L82:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L87:
            androidx.compose.runtime.i3$n r10 = new androidx.compose.runtime.i3$n
            r10.<init>(r9, r8, r2)
            r0.f16512b = r6
            r0.f16513c = r5
            r0.f16514d = r2
            r0.f16515e = r9
            r0.f16516f = r8
            r0.f16519i = r3
            java.lang.Object r10 = r5.u(r10, r0)
            if (r10 != r1) goto L3d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.i3.X0(androidx.compose.runtime.a2, androidx.compose.runtime.x2, kotlin.coroutines.d):java.lang.Object");
    }

    private final ld.l<Object, kotlin.k2> a1(n0 composition, androidx.compose.runtime.collection.d<Object> modifiedValues) {
        return new q(composition, modifiedValues);
    }

    private final void j0(n0 composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void k0(androidx.compose.runtime.snapshots.e snapshot) {
        try {
            if (snapshot.M() instanceof n.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n0(kotlin.coroutines.d<? super kotlin.k2> dVar) {
        kotlinx.coroutines.q qVar;
        if (B0()) {
            return kotlin.k2.f75408a;
        }
        kotlinx.coroutines.q qVar2 = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar2.e0();
        synchronized (this.stateLock) {
            if (B0()) {
                qVar = qVar2;
            } else {
                this.workContinuation = qVar2;
                qVar = null;
            }
        }
        if (qVar != null) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            qVar.resumeWith(kotlin.k2.f75408a);
        }
        Object y4 = qVar2.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : kotlin.k2.f75408a;
    }

    private final void p0() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = kotlin.collections.j0.f74919b;
    }

    private final <T> T r0(n0 composition, androidx.compose.runtime.collection.d<Object> modifiedValues, ld.a<? extends T> block) {
        androidx.compose.runtime.snapshots.e r4 = androidx.compose.runtime.snapshots.m.INSTANCE.r(new k(composition), new q(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.m r5 = r4.r();
            try {
                return block.invoke();
            } finally {
                r4.y(r5);
            }
        } finally {
            k0(r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.p<kotlin.k2> s0() {
        e eVar;
        if (this._state.getValue().compareTo(e.ShuttingDown) <= 0) {
            p0();
            this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            kotlinx.coroutines.p<? super kotlin.k2> pVar = this.workContinuation;
            if (pVar != null) {
                p.a.a(pVar, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            eVar = e.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new androidx.compose.runtime.collection.d<>();
            this.compositionInvalidations.clear();
            eVar = x0() ? e.InactivePendingWork : e.Inactive;
        } else {
            eVar = (!this.compositionInvalidations.isEmpty() || this.snapshotInvalidations.q() || !this.compositionsAwaitingApply.isEmpty() || !this.compositionValuesAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || x0()) ? e.PendingWork : e.Idle;
        }
        this._state.setValue(eVar);
        if (eVar != e.PendingWork) {
            return null;
        }
        kotlinx.coroutines.p pVar2 = this.workContinuation;
        this.workContinuation = null;
        return pVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        int i4;
        List list;
        synchronized (this.stateLock) {
            try {
                if (this.compositionValuesRemoved.isEmpty()) {
                    list = kotlin.collections.j0.f74919b;
                } else {
                    List d02 = kotlin.collections.w.d0(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    list = new ArrayList(d02.size());
                    int size = d02.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        f2 f2Var = (f2) d02.get(i5);
                        list.add(new kotlin.q0(f2Var, this.compositionValueStatesAvailable.get(f2Var)));
                    }
                    this.compositionValueStatesAvailable.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = list.size();
        for (i4 = 0; i4 < size2; i4++) {
            kotlin.q0 q0Var = (kotlin.q0) list.get(i4);
            f2 f2Var2 = (f2) q0Var.a();
            e2 e2Var = (e2) q0Var.b();
            if (e2Var != null) {
                f2Var2.getComposition().B(e2Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0() {
        boolean x02;
        synchronized (this.stateLock) {
            x02 = x0();
        }
        return x02;
    }

    private final boolean x0() {
        return !this.frameClockPaused && this.broadcastFrameClock.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0() {
        return !this.compositionsAwaitingApply.isEmpty() || x0();
    }

    private final boolean z0() {
        return !this.compositionInvalidations.isEmpty() || x0();
    }

    public final boolean A0() {
        boolean z4;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.q() && this.compositionInvalidations.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && this.compositionsAwaitingApply.isEmpty()) {
                z4 = x0();
            }
        }
        return z4;
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<e> E0() {
        return this._state;
    }

    @fg.m
    public final Object G0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object v02 = kotlinx.coroutines.flow.k.v0(this._state, new i(2, null), dVar);
        return v02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? v02 : kotlin.k2.f75408a;
    }

    public final void H0() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    public final void V0() {
        kotlinx.coroutines.p<kotlin.k2> pVar;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                pVar = s0();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(kotlin.k2.f75408a);
        }
    }

    @fg.m
    public final Object Y0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object P0 = P0(new o(null), dVar);
        return P0 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? P0 : kotlin.k2.f75408a;
    }

    @fg.m
    @c1
    public final Object Z0(@fg.l kotlin.coroutines.g gVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object P0 = P0(new p(gVar, this, null), dVar);
        return P0 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? P0 : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.runtime.z
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    public void a(@fg.l n0 composition, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
        boolean J = composition.J();
        try {
            m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
            androidx.compose.runtime.snapshots.e r4 = companion.r(new k(composition), new q(composition, null));
            try {
                androidx.compose.runtime.snapshots.m r5 = r4.r();
                try {
                    composition.y(content);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    if (!J) {
                        companion.g();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(e.ShuttingDown) > 0 && !C0().contains(composition)) {
                            j0(composition);
                        }
                    }
                    try {
                        I0(composition);
                        try {
                            composition.I();
                            composition.z();
                            if (J) {
                                return;
                            }
                            companion.g();
                        } catch (Exception e4) {
                            N0(this, e4, null, false, 6, null);
                        }
                    } catch (Exception e5) {
                        M0(e5, composition, true);
                    }
                } finally {
                    r4.y(r5);
                }
            } finally {
                k0(r4);
            }
        } catch (Exception e6) {
            M0(e6, composition, true);
        }
    }

    @Override // androidx.compose.runtime.z
    public void b(@fg.l f2 reference) {
        synchronized (this.stateLock) {
            m3.c(this.compositionValuesRemoved, reference.c(), reference);
        }
    }

    @Override // androidx.compose.runtime.z
    public boolean d() {
        return false;
    }

    @Override // androidx.compose.runtime.z
    public boolean e() {
        return false;
    }

    @Override // androidx.compose.runtime.z
    public int g() {
        return 1000;
    }

    @Override // androidx.compose.runtime.z
    @fg.l
    /* renamed from: h, reason: from getter */
    public kotlin.coroutines.g getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.z
    @fg.l
    public kotlin.coroutines.g j() {
        return kotlin.coroutines.i.f75057b;
    }

    @Override // androidx.compose.runtime.z
    public void k(@fg.l f2 reference) {
        kotlinx.coroutines.p<kotlin.k2> s02;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            s02 = s0();
        }
        if (s02 != null) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            s02.resumeWith(kotlin.k2.f75408a);
        }
    }

    @Override // androidx.compose.runtime.z
    public void l(@fg.l n0 composition) {
        kotlinx.coroutines.p<kotlin.k2> pVar;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                pVar = null;
            } else {
                this.compositionInvalidations.add(composition);
                pVar = s0();
            }
        }
        if (pVar != null) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(kotlin.k2.f75408a);
        }
    }

    @fg.l
    public final k3 l0() {
        return this.recomposerInfo;
    }

    @Override // androidx.compose.runtime.z
    public void m(@fg.l f3 scope) {
        kotlinx.coroutines.p<kotlin.k2> s02;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(scope);
            s02 = s0();
        }
        if (s02 != null) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            s02.resumeWith(kotlin.k2.f75408a);
        }
    }

    @fg.m
    public final Object m0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object x4 = kotlinx.coroutines.flow.k.x(new v.j(this._state, new f(2, null)), dVar);
        return x4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? x4 : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.runtime.z
    public void n(@fg.l f2 reference, @fg.l e2 data) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    @Override // androidx.compose.runtime.z
    @fg.m
    public e2 o(@fg.l f2 reference) {
        e2 remove;
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(reference);
        }
        return remove;
    }

    public final void o0() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(e.Idle) >= 0) {
                    this._state.setValue(e.ShuttingDown);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        k2.a.b(this.effectJob, null, 1, null);
    }

    @Override // androidx.compose.runtime.z
    public void p(@fg.l Set<androidx.compose.runtime.tooling.a> table) {
    }

    public final void q0() {
        if (this.effectJob.h()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
        }
    }

    @Override // androidx.compose.runtime.z
    public void r(@fg.l n0 composition) {
    }

    @Override // androidx.compose.runtime.z
    public void s(@fg.l n0 composition) {
        synchronized (this.stateLock) {
            try {
                Set set = this.compositionsRemoved;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.compositionsRemoved = set;
                }
                set.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.z
    public void v(@fg.l n0 composition) {
        synchronized (this.stateLock) {
            T0(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    @fg.l
    public final kotlinx.coroutines.flow.t0<e> v0() {
        return this._state;
    }
}
