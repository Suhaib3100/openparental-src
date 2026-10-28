package androidx.compose.foundation.pager;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.gestures.x0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.foundation.pager.q;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.l1;
import androidx.constraintlayout.core.motion.utils.w;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: PagerState.kt */
@z0
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u000b*\u00020$2\u0006\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u000b*\u00020$2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010\u0007J2\u0010.\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0086@¢\u0006\u0004\b.\u0010/JA\u00107\u001a\u00020\u000b2\u0006\u00101\u001a\u0002002'\u00106\u001a#\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b03\u0012\u0006\u0012\u0004\u0018\u00010402¢\u0006\u0002\b5H\u0096@¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\nJ!\u0010;\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u0015H\u0000¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bA\u0010BR1\u0010K\u001a\u00020C2\u0006\u0010D\u001a\u00020C8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010Q\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR+\u0010Z\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010F\u001a\u0004\bW\u0010\u0019\"\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R$\u0010d\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b7\u0010a\u001a\u0004\bb\u0010cR$\u0010g\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\be\u0010a\u001a\u0004\bf\u0010cR\u001e\u0010i\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010aR\u0016\u0010l\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0014\u0010q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR$\u0010s\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010a\u001a\u0004\ba\u0010cR\"\u0010x\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010\u0019\"\u0004\bw\u0010YR\u0016\u0010z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010aR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010\u007f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010uR\u001f\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010FR)\u0010\u0089\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b;\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R0\u0010\u0094\u0001\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010c\"\u0006\b\u0092\u0001\u0010\u0093\u0001R/\u0010\u0096\u0001\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0005\b\u001e\u0010\u0090\u0001\u001a\u0004\bu\u0010c\"\u0006\b\u0095\u0001\u0010\u0093\u0001R\u001e\u0010\u0099\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0012\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010cR\u001e\u0010'\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u0097\u0001\u001a\u0005\b\u009b\u0001\u0010cR \u0010¡\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R \u0010¦\u0001\u001a\u00030¢\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b\u009d\u0001\u0010¥\u0001R \u0010«\u0001\u001a\u00030§\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\b\u009a\u0001\u0010ª\u0001R7\u0010±\u0001\u001a\u0005\u0018\u00010¬\u00012\t\u0010D\u001a\u0005\u0018\u00010¬\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010F\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u001f\u0010¶\u0001\u001a\u00030²\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bb\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R,\u0010º\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bf\u0010=\u001a\u0005\b¸\u0001\u0010H\"\u0005\b¹\u0001\u0010JR \u0010À\u0001\u001a\u00030»\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R%\u0010Ä\u0001\u001a\u00030Á\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010F\u001a\u0006\bÂ\u0001\u0010Ã\u0001R-\u0010Æ\u0001\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00158F@BX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\bk\u0010F\u001a\u0004\bE\u0010\u0019\"\u0005\bÅ\u0001\u0010YR.\u0010É\u0001\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00158F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bÇ\u0001\u0010F\u001a\u0004\b\\\u0010\u0019\"\u0005\bÈ\u0001\u0010YR\u0016\u0010Ë\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010cR\u0013\u0010Í\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\bk\u0010Ì\u0001R\u0016\u0010Ï\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010cR\u0016\u0010Ñ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010cR\u0016\u0010Ó\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010cR\u0016\u0010Õ\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010NR\u0015\u0010Ø\u0001\u001a\u00030Ö\u00018F¢\u0006\b\u001a\u0006\b¼\u0001\u0010×\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010cR\u0012\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010NR!\u0010Ý\u0001\u001a\u00030Ù\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÇ\u0001\u0010Ú\u0001*\u0006\bÛ\u0001\u0010Ü\u0001R\u0015\u0010Þ\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ß\u0001"}, d2 = {"Landroidx/compose/foundation/pager/c0;", "Landroidx/compose/foundation/gestures/w0;", "", "currentPage", "", "currentPageOffsetFraction", "<init>", "(IF)V", "delta", "j0", "(F)F", "Lkotlin/k2;", "t", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/u;", "result", "z0", "(Landroidx/compose/foundation/pager/u;)V", "v", "(I)I", "scrollDelta", "", "d0", "(F)Z", "e0", "()Z", "Landroidx/compose/foundation/pager/n;", "info", "i0", "(FLandroidx/compose/foundation/pager/n;)V", "u", "(Landroidx/compose/foundation/pager/n;)V", "page", "pageOffsetFraction", "l0", "(IFLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/q0;", "A0", "(Landroidx/compose/foundation/gestures/q0;IF)V", "targetPage", "C0", "(Landroidx/compose/foundation/gestures/q0;I)V", "offsetFraction", "y0", "Landroidx/compose/animation/core/k;", "animationSpec", "p", "(IFLandroidx/compose/animation/core/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "visibleItemsStayedTheSame", "r", "(Landroidx/compose/foundation/pager/u;Z)V", "J", "(I)F", "Landroidx/compose/foundation/pager/r;", "itemProvider", "g0", "(Landroidx/compose/foundation/pager/r;I)I", "Li0/f;", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "c0", "()J", "x0", "(J)V", "upDownDifference", "Landroidx/compose/runtime/h2;", "a0", "()F", "w0", "(F)V", "snapRemainingScrollOffset", "Landroidx/compose/foundation/lazy/layout/g;", "c", "Landroidx/compose/foundation/lazy/layout/g;", "animatedScrollScope", "d", "f0", "u0", "(Z)V", "isScrollingForward", "Landroidx/compose/foundation/pager/x;", "e", "Landroidx/compose/foundation/pager/x;", "X", "()Landroidx/compose/foundation/pager/x;", "scrollPosition", "I", "B", "()I", "firstVisiblePage", "g", "C", "firstVisiblePageOffset", "h", "maxScrollOffset", "i", "F", "accumulator", "j", "previousPassDelta", "k", "Landroidx/compose/foundation/gestures/w0;", "scrollableState", "l", "numMeasurePasses", "m", "Z", "S", "q0", "prefetchingEnabled", "n", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d0$a;", "o", "Landroidx/compose/foundation/lazy/layout/d0$a;", "currentPrefetchHandle", "wasPrefetchingForward", "Landroidx/compose/runtime/k2;", "q", "pagerLayoutInfoState", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "A", "()Landroidx/compose/ui/unit/d;", "p0", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/foundation/interaction/k;", "s", "Landroidx/compose/foundation/interaction/k;", "E", "()Landroidx/compose/foundation/interaction/k;", "internalInteractionSource", "Landroidx/compose/runtime/i2;", "U", "s0", "(I)V", "programmaticScrollTargetPage", "v0", "settledPageState", "Landroidx/compose/runtime/b5;", "Y", "settledPage", "w", "b0", "Landroidx/compose/foundation/lazy/layout/d0;", "x", "Landroidx/compose/foundation/lazy/layout/d0;", "R", "()Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/k;", "y", "Landroidx/compose/foundation/lazy/layout/k;", "()Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/a;", "z", "Landroidx/compose/foundation/lazy/layout/a;", "()Landroidx/compose/foundation/lazy/layout/a;", "awaitLayoutModifier", "Landroidx/compose/ui/layout/k1;", "V", "()Landroidx/compose/ui/layout/k1;", "t0", "(Landroidx/compose/ui/layout/k1;)V", "remeasurement", "Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/layout/l1;", "W", "()Landroidx/compose/ui/layout/l1;", "remeasurementModifier", "Landroidx/compose/ui/unit/b;", "T", "r0", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/c0;", "D", "Landroidx/compose/foundation/lazy/layout/c0;", "O", "()Landroidx/compose/foundation/lazy/layout/c0;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/n0;", "P", "()Landroidx/compose/runtime/k2;", "placementScopeInvalidator", "o0", "canScrollForward", "G", "n0", "canScrollBackward", "K", "pageCount", "()Landroidx/compose/foundation/pager/n;", "layoutInfo", "N", "pageSpacing", "L", "pageSize", "M", "pageSizeWithSpacing", "Q", "positionThresholdFraction", "Landroidx/compose/foundation/interaction/i;", "()Landroidx/compose/foundation/interaction/i;", "interactionSource", "Lkotlin/ranges/l;", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/c0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,787:1\n81#2:788\n107#2,2:789\n81#2:794\n107#2,2:795\n81#2:815\n81#2:816\n81#2:817\n107#2,2:818\n81#2:820\n81#2:821\n107#2,2:822\n81#2:824\n107#2,2:825\n76#3:791\n109#3,2:792\n772#4,4:797\n772#4,4:801\n772#4,4:805\n772#4,4:827\n772#4,4:832\n75#5:809\n108#5,2:810\n75#5:812\n108#5,2:813\n1#6:831\n495#7,4:836\n500#7:845\n495#7,4:846\n500#7:855\n129#8,5:840\n129#8,5:850\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n154#1:788\n154#1:789,2\n159#1:794\n159#1:795,2\n329#1:815\n346#1:816\n400#1:817\n400#1:818,2\n422#1:820\n586#1:821\n586#1:822,2\n588#1:824\n588#1:825,2\n155#1:791\n155#1:792,2\n192#1:797,4\n212#1:801,4\n220#1:805,4\n598#1:827,4\n613#1:832,4\n317#1:809\n317#1:810,2\n319#1:812\n319#1:813,2\n617#1:836,4\n617#1:845\n715#1:846,4\n715#1:855\n617#1:840,5\n715#1:850,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class c0 implements w0 {
    public static final int H = 0;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final k2 remeasurement;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final l1 remeasurementModifier;

    /* renamed from: C, reason: from kotlin metadata */
    private long premeasureConstraints;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.c0 pinnedPages;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final k2<kotlin.k2> placementScopeInvalidator;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    private final k2 canScrollForward;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.l
    private final k2 canScrollBackward;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 upDownDifference;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 snapRemainingScrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.g animatedScrollScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 isScrollingForward;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x scrollPosition;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePageOffset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int maxScrollOffset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 scrollableState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d0.a currentPrefetchHandle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean wasPrefetchingForward;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private k2<u> pagerLayoutInfoState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k internalInteractionSource;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 programmaticScrollTargetPage;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 settledPageState;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 settledPage;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 targetPage;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.d0 prefetchState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.k beyondBoundsInfo;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.a awaitLayoutModifier;

    /* compiled from: PagerState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {w.g.f22541p, 517}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f6723b;

        /* renamed from: c, reason: collision with root package name */
        Object f6724c;

        /* renamed from: d, reason: collision with root package name */
        int f6725d;

        /* renamed from: e, reason: collision with root package name */
        float f6726e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6727f;

        /* renamed from: h, reason: collision with root package name */
        int f6729h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f6727f = obj;
            this.f6729h |= Integer.MIN_VALUE;
            return c0.this.p(0, 0.0f, null, this);
        }
    }

    /* compiled from: PagerState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1", f = "PagerState.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n772#2,4:792\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n*L\n531#1:788,4\n550#1:792,4\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6730b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6731c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6733e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.g f6734f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6735g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.k<Float> f6736h;

        /* compiled from: PagerState.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3\n*L\n555#1:788,4\n*E\n"})
        static final class a extends n0 implements ld.p<Float, Float, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.e f6737b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ q0 f6738c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.e eVar, q0 q0Var) {
                super(2);
                this.f6737b = eVar;
                this.f6738c = q0Var;
            }

            public final void a(float f4, float f5) {
                this.f6737b.f75326b += this.f6738c.a(f4 - this.f6737b.f75326b);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4, Float f5) {
                a(f4.floatValue(), f5.floatValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, androidx.compose.foundation.lazy.layout.g gVar, int i5, androidx.compose.animation.core.k<Float> kVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f6733e = i4;
            this.f6734f = gVar;
            this.f6735g = i5;
            this.f6736h = kVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = c0.this.new b(this.f6733e, this.f6734f, this.f6735g, this.f6736h, dVar);
            bVar.f6731c = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        
            r1 = r3;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r14.f6730b
                r2 = 1
                if (r1 == 0) goto L16
                if (r1 != r2) goto Le
                kotlin.a1.n(r15)
                goto Lc1
            Le:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L16:
                kotlin.a1.n(r15)
                java.lang.Object r15 = r14.f6731c
                androidx.compose.foundation.gestures.q0 r15 = (androidx.compose.foundation.gestures.q0) r15
                androidx.compose.foundation.pager.c0 r1 = androidx.compose.foundation.pager.c0.this
                int r3 = r14.f6733e
                r1.C0(r15, r3)
                int r1 = r14.f6733e
                androidx.compose.foundation.lazy.layout.g r3 = r14.f6734f
                int r3 = r3.d()
                r4 = 0
                if (r1 <= r3) goto L31
                r1 = r2
                goto L32
            L31:
                r1 = r4
            L32:
                androidx.compose.foundation.lazy.layout.g r3 = r14.f6734f
                int r3 = r3.g()
                androidx.compose.foundation.lazy.layout.g r5 = r14.f6734f
                int r5 = r5.d()
                int r3 = r3 - r5
                int r3 = r3 + r2
                if (r1 == 0) goto L4c
                int r5 = r14.f6733e
                androidx.compose.foundation.lazy.layout.g r6 = r14.f6734f
                int r6 = r6.g()
                if (r5 > r6) goto L58
            L4c:
                if (r1 != 0) goto L88
                int r5 = r14.f6733e
                androidx.compose.foundation.lazy.layout.g r6 = r14.f6734f
                int r6 = r6.d()
                if (r5 >= r6) goto L88
            L58:
                int r5 = r14.f6733e
                androidx.compose.foundation.lazy.layout.g r6 = r14.f6734f
                int r6 = r6.d()
                int r5 = r5 - r6
                int r5 = java.lang.Math.abs(r5)
                r6 = 3
                if (r5 < r6) goto L88
                if (r1 == 0) goto L77
                int r1 = r14.f6733e
                int r1 = r1 - r3
                androidx.compose.foundation.lazy.layout.g r3 = r14.f6734f
                int r3 = r3.d()
                if (r1 >= r3) goto L83
            L75:
                r1 = r3
                goto L83
            L77:
                int r1 = r14.f6733e
                int r1 = r1 + r3
                androidx.compose.foundation.lazy.layout.g r3 = r14.f6734f
                int r3 = r3.d()
                if (r1 <= r3) goto L83
                goto L75
            L83:
                androidx.compose.foundation.lazy.layout.g r3 = r14.f6734f
                r3.f(r15, r1, r4)
            L88:
                androidx.compose.foundation.lazy.layout.g r1 = r14.f6734f
                int r1 = r1.e()
                androidx.compose.foundation.pager.c0 r3 = androidx.compose.foundation.pager.c0.this
                int r3 = r3.y()
                int r4 = r14.f6733e
                int r4 = r4 * r1
                int r3 = r3 * r1
                float r1 = (float) r1
                androidx.compose.foundation.pager.c0 r5 = androidx.compose.foundation.pager.c0.this
                float r5 = r5.z()
                float r5 = r5 * r1
                int r4 = r4 - r3
                int r1 = r14.f6735g
                int r4 = r4 + r1
                float r1 = (float) r4
                float r7 = r1 - r5
                kotlin.jvm.internal.k1$e r1 = new kotlin.jvm.internal.k1$e
                r1.<init>()
                androidx.compose.animation.core.k<java.lang.Float> r9 = r14.f6736h
                androidx.compose.foundation.pager.c0$b$a r10 = new androidx.compose.foundation.pager.c0$b$a
                r10.<init>(r1, r15)
                r14.f6730b = r2
                r6 = 0
                r8 = 0
                r12 = 4
                r13 = 0
                r11 = r14
                java.lang.Object r15 = androidx.compose.animation.core.c2.f(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto Lc1
                return r0
            Lc1:
                kotlin.k2 r15 = kotlin.k2.f75408a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.c0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/pager/c0$c", "Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/k2;", "K2", "(Landroidx/compose/ui/layout/k1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements l1 {
        c() {
        }

        @Override // androidx.compose.ui.layout.l1
        public void K2(@fg.l androidx.compose.ui.layout.k1 remeasurement) {
            c0.this.t0(remeasurement);
        }
    }

    /* compiled from: PagerState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {570, 575}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f6740b;

        /* renamed from: c, reason: collision with root package name */
        Object f6741c;

        /* renamed from: d, reason: collision with root package name */
        Object f6742d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6743e;

        /* renamed from: g, reason: collision with root package name */
        int f6745g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f6743e = obj;
            this.f6745g |= Integer.MIN_VALUE;
            return c0.k0(c0.this, null, null, this);
        }
    }

    /* compiled from: PagerState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {438}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n437#1:788,4\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6746b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f6748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6749e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(float f4, int i4, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f6748d = f4;
            this.f6749e = i4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return c0.this.new e(this.f6748d, this.f6749e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6746b;
            if (i4 == 0) {
                a1.n(obj);
                c0 c0Var = c0.this;
                this.f6746b = 1;
                if (c0Var.t(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            float f4 = this.f6748d;
            double d5 = f4;
            if (-0.5d <= d5 && d5 <= 0.5d) {
                c0.this.y0(c0.this.v(this.f6749e), this.f6748d);
                return kotlin.k2.f75408a;
            }
            throw new IllegalArgumentException(("pageOffsetFraction " + f4 + " is not within the range -0.5 to 0.5").toString());
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.l<Float, Float> {
        f() {
            super(1);
        }

        @fg.l
        public final Float a(float f4) {
            return Float.valueOf(c0.this.j0(f4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.a<Integer> {
        g() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(c0.this.d() ? c0.l(c0.this) : c0.this.y());
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.a<Integer> {
        h() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(c0.this.v(!c0.this.d() ? c0.this.y() : c0.k(c0.this) != -1 ? c0.k(c0.this) : c0.this.a0() == 0.0f ? Math.abs(c0.this.z()) >= Math.abs(c0.this.Q()) ? c0.this.f0() ? c0.this.getFirstVisiblePage() + 1 : c0.this.getFirstVisiblePage() : c0.this.y() : kotlin.math.b.L0(c0.this.a0() / c0.this.M()) + c0.this.y()));
        }
    }

    public c0() {
        this(0, 0.0f, 3, null);
    }

    public static /* synthetic */ void B0(c0 c0Var, q0 q0Var, int i4, float f4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i5 & 2) != 0) {
            f4 = 0.0f;
        }
        c0Var.A0(q0Var, i4, f4);
    }

    private static Object H(c0 c0Var) {
        return c0Var.scrollPosition.getNearestRangeState();
    }

    private final int U() {
        return this.programmaticScrollTargetPage.f();
    }

    private final int Z() {
        return this.settledPageState.f();
    }

    private final boolean d0(float scrollDelta) {
        if (F().getOrientation() != j0.Vertical ? Math.signum(scrollDelta) != Math.signum(-i0.f.p(c0())) : Math.signum(scrollDelta) != Math.signum(-i0.f.r(c0()))) {
            if (!e0()) {
                return false;
            }
        }
        return true;
    }

    private final boolean e0() {
        return ((int) i0.f.p(c0())) == 0 && ((int) i0.f.r(c0())) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f0() {
        return ((Boolean) this.isScrollingForward.getValue()).booleanValue();
    }

    public static int h0(c0 c0Var, r rVar, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i5 & 2) != 0) {
            androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    int c6 = c0Var.scrollPosition.c();
                    c5.d();
                    i4 = c6;
                } finally {
                    c5.y(r4);
                }
            } catch (Throwable th) {
                c5.d();
                throw th;
            }
        }
        return c0Var.scrollPosition.g(rVar, i4);
    }

    private final void i0(float delta, n info) {
        d0.a aVar;
        if (this.prefetchingEnabled && !info.y().isEmpty()) {
            boolean z4 = delta > 0.0f;
            int beyondBoundsPageCount = z4 ? info.getBeyondBoundsPageCount() + ((androidx.compose.foundation.pager.f) kotlin.collections.w.p3(info.y())).getIndex() + 1 : (((androidx.compose.foundation.pager.f) kotlin.collections.w.B2(info.y())).getIndex() - info.getBeyondBoundsPageCount()) - 1;
            if (beyondBoundsPageCount == this.indexToPrefetch || beyondBoundsPageCount < 0 || beyondBoundsPageCount >= K()) {
                return;
            }
            if (this.wasPrefetchingForward != z4 && (aVar = this.currentPrefetchHandle) != null) {
                aVar.cancel();
            }
            this.wasPrefetchingForward = z4;
            this.indexToPrefetch = beyondBoundsPageCount;
            this.currentPrefetchHandle = this.prefetchState.b(beyondBoundsPageCount, this.premeasureConstraints);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float j0(float delta) {
        float b5 = this.scrollPosition.b();
        float f4 = b5 + delta + this.accumulator;
        float H2 = kotlin.ranges.s.H(f4, 0.0f, this.maxScrollOffset);
        boolean z4 = f4 == H2;
        float f5 = H2 - b5;
        this.previousPassDelta = f5;
        if (Math.abs(f5) != 0.0f) {
            u0(f5 > 0.0f);
        }
        int L0 = kotlin.math.b.L0(f5);
        u value = this.pagerLayoutInfoState.getValue();
        if (value.t(-L0)) {
            r(value, true);
            androidx.compose.foundation.lazy.layout.n0.h(this.placementScopeInvalidator);
        } else {
            this.scrollPosition.a(L0);
            androidx.compose.ui.layout.k1 V = V();
            if (V != null) {
                V.p();
            }
        }
        this.accumulator = f5 - L0;
        return !z4 ? f5 : delta;
    }

    public static final int k(c0 c0Var) {
        return c0Var.programmaticScrollTargetPage.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object k0(androidx.compose.foundation.pager.c0 r5, androidx.compose.foundation.a2 r6, ld.p<? super androidx.compose.foundation.gestures.q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r7, kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.c0.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.c0$d r0 = (androidx.compose.foundation.pager.c0.d) r0
            int r1 = r0.f6745g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6745g = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.c0$d r0 = new androidx.compose.foundation.pager.c0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6743e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f6745g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f6740b
            androidx.compose.foundation.pager.c0 r5 = (androidx.compose.foundation.pager.c0) r5
            kotlin.a1.n(r8)
            goto L7b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.f6742d
            r7 = r5
            ld.p r7 = (ld.p) r7
            java.lang.Object r5 = r0.f6741c
            r6 = r5
            androidx.compose.foundation.a2 r6 = (androidx.compose.foundation.a2) r6
            java.lang.Object r5 = r0.f6740b
            androidx.compose.foundation.pager.c0 r5 = (androidx.compose.foundation.pager.c0) r5
            kotlin.a1.n(r8)
            goto L5a
        L48:
            kotlin.a1.n(r8)
            r0.f6740b = r5
            r0.f6741c = r6
            r0.f6742d = r7
            r0.f6745g = r4
            java.lang.Object r8 = r5.t(r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            boolean r8 = r5.d()
            if (r8 != 0) goto L69
            androidx.compose.foundation.pager.x r8 = r5.scrollPosition
            int r8 = r8.c()
            r5.v0(r8)
        L69:
            androidx.compose.foundation.gestures.w0 r8 = r5.scrollableState
            r0.f6740b = r5
            r2 = 0
            r0.f6741c = r2
            r0.f6742d = r2
            r0.f6745g = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r6 = -1
            r5.s0(r6)
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.c0.k0(androidx.compose.foundation.pager.c0, androidx.compose.foundation.a2, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    public static final int l(c0 c0Var) {
        return c0Var.settledPageState.f();
    }

    public static /* synthetic */ Object m0(c0 c0Var, int i4, float f4, kotlin.coroutines.d dVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i5 & 2) != 0) {
            f4 = 0.0f;
        }
        return c0Var.l0(i4, f4, dVar);
    }

    private final void n0(boolean z4) {
        this.canScrollBackward.setValue(Boolean.valueOf(z4));
    }

    private final void o0(boolean z4) {
        this.canScrollForward.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object q(c0 c0Var, int i4, float f4, androidx.compose.animation.core.k kVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i5 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            kVar = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
        }
        return c0Var.p(i4, f4, kVar, dVar);
    }

    public static /* synthetic */ void s(c0 c0Var, u uVar, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        c0Var.r(uVar, z4);
    }

    private final void s0(int i4) {
        this.programmaticScrollTargetPage.k(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object b5 = this.awaitLayoutModifier.b(dVar);
        return b5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? b5 : kotlin.k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(androidx.compose.ui.layout.k1 k1Var) {
        this.remeasurement.setValue(k1Var);
    }

    private final void u(n info) {
        int index;
        if (this.indexToPrefetch == -1 || info.y().isEmpty()) {
            return;
        }
        if (this.wasPrefetchingForward) {
            index = info.getBeyondBoundsPageCount() + ((androidx.compose.foundation.pager.f) kotlin.collections.w.p3(info.y())).getIndex() + 1;
        } else {
            index = (((androidx.compose.foundation.pager.f) kotlin.collections.w.B2(info.y())).getIndex() - info.getBeyondBoundsPageCount()) - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            d0.a aVar = this.currentPrefetchHandle;
            if (aVar != null) {
                aVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    private final void u0(boolean z4) {
        this.isScrollingForward.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v(int i4) {
        if (K() > 0) {
            return kotlin.ranges.s.I(i4, 0, K() - 1);
        }
        return 0;
    }

    private final void v0(int i4) {
        this.settledPageState.k(i4);
    }

    private final void z0(u result) {
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && d0(this.previousPassDelta)) {
                    i0(this.previousPassDelta, result);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                c5.y(r4);
            } catch (Throwable th) {
                c5.y(r4);
                throw th;
            }
        } finally {
            c5.d();
        }
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    public final void A0(@fg.l q0 q0Var, int i4, float f4) {
        this.animatedScrollScope.f(q0Var, i4, (int) (f4 * M()));
    }

    /* renamed from: B, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: C, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    public final void C0(@fg.l q0 q0Var, int i4) {
        s0(v(i4));
    }

    @fg.l
    public final androidx.compose.foundation.interaction.i D() {
        return this.internalInteractionSource;
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @fg.l
    public final n F() {
        return this.pagerLayoutInfoState.getValue();
    }

    @fg.l
    public final kotlin.ranges.l G() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: I, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    public final float J(int page) {
        if (page >= 0 && page <= K()) {
            return this.scrollPosition.d() + (this.scrollPosition.c() - page);
        }
        StringBuilder a5 = androidx.collection.s.a("page ", page, " is not within the range 0 to ");
        a5.append(K());
        throw new IllegalArgumentException(a5.toString().toString());
    }

    public abstract int K();

    public final int L() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int M() {
        return N() + L();
    }

    public final int N() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    @fg.l
    /* renamed from: O, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.c0 getPinnedPages() {
        return this.pinnedPages;
    }

    @fg.l
    public final k2<kotlin.k2> P() {
        return this.placementScopeInvalidator;
    }

    public final float Q() {
        return Math.min(this.density.v5(f0.i()), L() / 2.0f) / L();
    }

    @fg.l
    /* renamed from: R, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d0 getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: S, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* renamed from: T, reason: from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    @fg.m
    public final androidx.compose.ui.layout.k1 V() {
        return (androidx.compose.ui.layout.k1) this.remeasurement.getValue();
    }

    @fg.l
    /* renamed from: W, reason: from getter */
    public final l1 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    @fg.l
    /* renamed from: X, reason: from getter */
    public final x getScrollPosition() {
        return this.scrollPosition;
    }

    public final int Y() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.w0
    public final boolean a() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final float a0() {
        return this.snapRemainingScrollOffset.b();
    }

    @Override // androidx.compose.foundation.gestures.w0
    public float b(float delta) {
        return this.scrollableState.b(delta);
    }

    public final int b0() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c0() {
        return ((i0.f) this.upDownDifference.getValue()).getPackedValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean d() {
        return this.scrollableState.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.w0
    public final boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    @fg.m
    public Object f(@fg.l a2 a2Var, @fg.l ld.p<? super q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        return k0(this, a2Var, pVar, dVar);
    }

    public final int g0(@fg.l r itemProvider, int currentPage) {
        return this.scrollPosition.g(itemProvider, currentPage);
    }

    @fg.m
    public final Object l0(int i4, float f4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object h4 = w0.h(this, null, new e(f4, i4, null), dVar, 1, null);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(int r12, float r13, @fg.l androidx.compose.animation.core.k<java.lang.Float> r14, @fg.l kotlin.coroutines.d<? super kotlin.k2> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.c0.a
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.pager.c0$a r0 = (androidx.compose.foundation.pager.c0.a) r0
            int r1 = r0.f6729h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6729h = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.c0$a r0 = new androidx.compose.foundation.pager.c0$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f6727f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f6729h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.a1.n(r15)
            goto Laa
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            float r13 = r0.f6726e
            int r12 = r0.f6725d
            java.lang.Object r14 = r0.f6724c
            androidx.compose.animation.core.k r14 = (androidx.compose.animation.core.k) r14
            java.lang.Object r2 = r0.f6723b
            androidx.compose.foundation.pager.c0 r2 = (androidx.compose.foundation.pager.c0) r2
            kotlin.a1.n(r15)
            r9 = r14
            r5 = r2
            goto L77
        L45:
            kotlin.a1.n(r15)
            androidx.compose.foundation.pager.x r15 = r11.scrollPosition
            int r15 = r15.c()
            if (r12 != r15) goto L5b
            androidx.compose.foundation.pager.x r15 = r11.scrollPosition
            float r15 = r15.d()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L5b
            goto L61
        L5b:
            int r15 = r11.K()
            if (r15 != 0) goto L64
        L61:
            kotlin.k2 r12 = kotlin.k2.f75408a
            return r12
        L64:
            r0.f6723b = r11
            r0.f6724c = r14
            r0.f6725d = r12
            r0.f6726e = r13
            r0.f6729h = r4
            java.lang.Object r15 = r11.t(r0)
            if (r15 != r1) goto L75
            return r1
        L75:
            r5 = r11
            r9 = r14
        L77:
            double r14 = (double) r13
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 > 0) goto Lad
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto Lad
            int r6 = r5.v(r12)
            int r12 = r5.M()
            float r12 = (float) r12
            float r13 = r13 * r12
            int r8 = kotlin.math.b.L0(r13)
            androidx.compose.foundation.lazy.layout.g r12 = r5.animatedScrollScope
            androidx.compose.foundation.pager.c0$b r13 = new androidx.compose.foundation.pager.c0$b
            r10 = 0
            r4 = r13
            r7 = r12
            r4.<init>(r6, r7, r8, r9, r10)
            r14 = 0
            r0.f6723b = r14
            r0.f6724c = r14
            r0.f6729h = r3
            java.lang.Object r12 = r12.h(r13, r0)
            if (r12 != r1) goto Laa
            return r1
        Laa:
            kotlin.k2 r12 = kotlin.k2.f75408a
            return r12
        Lad:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "pageOffsetFraction "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r13 = " is not within the range -0.5 to 0.5"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.c0.p(int, float, androidx.compose.animation.core.k, kotlin.coroutines.d):java.lang.Object");
    }

    public final void p0(@fg.l androidx.compose.ui.unit.d dVar) {
        this.density = dVar;
    }

    public final void q0(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    public final void r(@fg.l u result, boolean visibleItemsStayedTheSame) {
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.l(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.m(result);
            u(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        o0(result.getCanScrollForward());
        n0(result.h());
        this.numMeasurePasses++;
        androidx.compose.foundation.pager.d firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        z0(result);
        this.maxScrollOffset = f0.g(result, K());
    }

    public final void r0(long j4) {
        this.premeasureConstraints = j4;
    }

    @fg.l
    /* renamed from: w, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.a getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    public final void w0(float f4) {
        this.snapRemainingScrollOffset.E(f4);
    }

    @fg.l
    /* renamed from: x, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.k getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final void x0(long j4) {
        this.upDownDifference.setValue(i0.f.d(j4));
    }

    public final int y() {
        return this.scrollPosition.c();
    }

    public final void y0(int page, float offsetFraction) {
        this.scrollPosition.h(page, offsetFraction);
        androidx.compose.ui.layout.k1 V = V();
        if (V != null) {
            V.p();
        }
    }

    public final float z() {
        return this.scrollPosition.d();
    }

    public c0(int i4, float f4) {
        k2 g4;
        k2 g5;
        k2 g6;
        k2 g7;
        k2 g10;
        double d5 = f4;
        if (-0.5d > d5 || d5 > 0.5d) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f4 + " is not within the range -0.5 to 0.5").toString());
        }
        i0.f.INSTANCE.getClass();
        g4 = t4.g(i0.f.d(i0.f.f74147c), null, 2, null);
        this.upDownDifference = g4;
        this.snapRemainingScrollOffset = androidx.compose.runtime.b.b(0.0f);
        this.animatedScrollScope = new q.a(this);
        Boolean bool = Boolean.FALSE;
        g5 = t4.g(bool, null, 2, null);
        this.isScrollingForward = g5;
        x xVar = new x(i4, f4, this);
        this.scrollPosition = xVar;
        this.firstVisiblePage = i4;
        this.maxScrollOffset = Integer.MAX_VALUE;
        this.scrollableState = x0.a(new f());
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = androidx.compose.runtime.b.e(f0.j(), o4.m());
        this.density = f0.f6776e;
        this.internalInteractionSource = androidx.compose.foundation.interaction.j.a();
        this.programmaticScrollTargetPage = androidx.compose.runtime.b.c(-1);
        this.settledPageState = androidx.compose.runtime.b.c(i4);
        this.settledPage = o4.d(o4.x(), new g());
        this.targetPage = o4.d(o4.x(), new h());
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d0();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.k();
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.a();
        g6 = t4.g(null, null, 2, null);
        this.remeasurement = g6;
        this.remeasurementModifier = new c();
        this.premeasureConstraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
        this.pinnedPages = new androidx.compose.foundation.lazy.layout.c0();
        xVar.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.n0.d(null, 1, null);
        g7 = t4.g(bool, null, 2, null);
        this.canScrollForward = g7;
        g10 = t4.g(bool, null, 2, null);
        this.canScrollBackward = g10;
    }

    public /* synthetic */ c0(int i4, float f4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0 : i4, (i5 & 2) != 0 ? 0.0f : f4);
    }
}
