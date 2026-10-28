package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.InterfaceC1469b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.b0;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.u;
import org.apache.http.HttpStatus;

/* compiled from: Migration.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0016\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aj\u0010\u001a\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aX\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010\u001d\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aE\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040 H\u0007¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b#\u0010$\u001a+\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b%\u0010$\u001aP\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042#\u0010'\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040 ¢\u0006\u0002\b&H\u0007¢\u0006\u0004\b(\u0010\"\u001a-\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,\u001aU\u00101\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u000421\u00100\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017\u001a\u0080\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00102\u001a\u00028\u00012H\b\u0001\u00105\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001403H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a-\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b8\u00109\u001aC\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u00002\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020:0 H\u0007¢\u0006\u0004\b<\u0010=\u001a-\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010/\u001a\u00028\u0000H\u0007¢\u0006\u0004\b>\u00109\u001a3\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b@\u0010\r\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010/\u001a\u00028\u0000H\u0007¢\u0006\u0004\bA\u00109\u001a3\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bB\u0010\r\u001al\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010C\"\u0004\b\u0001\u0010D\"\u0004\b\u0002\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010E\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001403H\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a\u0086\u0001\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0000\u0010C\"\u0004\b\u0001\u0010D\"\u0004\b\u0002\u0010H\"\u0004\b\u0003\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042.\u0010E\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140JH\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a \u0001\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00040\u0004\"\u0004\b\u0000\u0010C\"\u0004\b\u0001\u0010D\"\u0004\b\u0002\u0010H\"\u0004\b\u0003\u0010M\"\u0004\b\u0004\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00030\u000424\u0010E\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140OH\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001aº\u0001\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00050\u0004\"\u0004\b\u0000\u0010C\"\u0004\b\u0001\u0010D\"\u0004\b\u0002\u0010H\"\u0004\b\u0003\u0010M\"\u0004\b\u0004\u0010R\"\u0004\b\u0005\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042:\u0010E\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140TH\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a-\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bY\u0010Z\u001a-\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b[\u0010Z\u001ag\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u000427\u0010E\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\\\u0010\u001f\u001ap\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042F\u00105\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001403H\u0007ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a%\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b_\u0010$\u001a-\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010`\u001a\u00020)H\u0007¢\u0006\u0004\ba\u0010,\u001a%\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bb\u0010$\u001a-\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010`\u001a\u00020)H\u0007¢\u0006\u0004\bc\u0010,\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bd\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"", "p", "()Ljava/lang/Void;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "q", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;)Lkotlinx/coroutines/flow/i;", "y", "J", "fallback", "r", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "s", "Lkotlin/k2;", "G", "(Lkotlinx/coroutines/flow/i;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "onEach", "H", "(Lkotlinx/coroutines/flow/i;Lld/p;)V", "", "onError", "I", "(Lkotlinx/coroutines/flow/i;Lld/p;Lld/p;)V", "R", "mapper", "l", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function1;", "g", "(Lkotlinx/coroutines/flow/i;Lld/l;)Lkotlinx/coroutines/flow/i;", "o", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "m", "Lkotlin/u;", "transformer", "f", "", "count", "D", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/i;", "Lkotlin/r0;", "name", "value", "action", "n", "initial", "Lkotlin/Function3;", "accumulator", "operation", "B", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lld/q;)Lkotlinx/coroutines/flow/i;", "t", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "", "predicate", "u", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lld/l;)Lkotlinx/coroutines/flow/i;", "E", "other", "F", "h", "i", "T1", "T2", "transform", "e", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "T3", "other2", "Lkotlin/Function4;", "d", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/r;)Lkotlinx/coroutines/flow/i;", "T4", "other3", "Lkotlin/Function5;", "c", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/s;)Lkotlinx/coroutines/flow/i;", "T5", "other4", "Lkotlin/Function6;", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/t;)Lkotlinx/coroutines/flow/i;", "", "timeMillis", "k", "(Lkotlinx/coroutines/flow/i;J)Lkotlinx/coroutines/flow/i;", "j", "K", "C", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "w", "bufferSize", "x", "z", "A", "a", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,496:1\n193#2:497\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n435#1:497\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Migration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<T, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f80579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j4, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80579c = j4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(t4, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f80579c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80578b;
            if (i4 == 0) {
                a1.n(obj);
                long j4 = this.f80579c;
                this.f80578b = 1;
                if (c1.b(j4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("螨\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Migration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f80581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j4, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f80581c = j4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f80581c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80580b;
            if (i4 == 0) {
                a1.n(obj);
                long j4 = this.f80581c;
                this.f80580b = 1;
                if (c1.b(j4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("螩\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: Migration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Throwable, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f80582b = new c(1);

        c() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l Throwable th) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(Throwable th) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Migration.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "e", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<j<? super T>, Throwable, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80583b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80584c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80585d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Throwable, Boolean> f80586e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f80587f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.l<? super Throwable, Boolean> lVar, T t4, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f80586e = lVar;
            this.f80587f = t4;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l j<? super T> jVar, @fg.l Throwable th, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            d dVar2 = new d(this.f80586e, this.f80587f, dVar);
            dVar2.f80584c = jVar;
            dVar2.f80585d = th;
            return dVar2.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80583b;
            if (i4 == 0) {
                a1.n(obj);
                j jVar = (j) this.f80584c;
                Throwable th = (Throwable) this.f80585d;
                if (!this.f80586e.invoke(th).booleanValue()) {
                    throw th;
                }
                T t4 = this.f80587f;
                this.f80584c = null;
                this.f80583b = 1;
                if (jVar.emit(t4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("螪\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {193, 193}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "kotlinx/coroutines/flow/w$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,218:1\n*E\n"})
    public static final class e<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<j<? super R>, T, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80588b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80589c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f80590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p f80591e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ld.p pVar, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f80591e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l j<? super R> jVar, T t4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            e eVar = new e(this.f80591e, dVar);
            eVar.f80589c = jVar;
            eVar.f80590d = t4;
            return eVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            j jVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80588b;
            if (i4 == 0) {
                a1.n(obj);
                jVar = (j) this.f80589c;
                Object obj2 = this.f80590d;
                ld.p pVar = this.f80591e;
                this.f80589c = jVar;
                this.f80588b = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("螫\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                jVar = (j) this.f80589c;
                a1.n(obj);
            }
            this.f80589c = null;
            this.f80588b = 2;
            if (n.g(jVar, (i) obj, this) == aVar) {
                return aVar;
            }
            return k2.f75408a;
        }
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> A(@fg.l i<? extends T> iVar, int i4) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.x0(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> B(@fg.l i<? extends T> iVar, R r4, @fg.l @InterfaceC1469b ld.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.x0(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> C(@fg.l i<? extends T> iVar, @fg.l ld.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return new a0.k(iVar, qVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.x0(expression = "drop(count)", imports = {}))
    public static final <T> i<T> D(@fg.l i<? extends T> iVar, int i4) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.x0(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> E(@fg.l i<? extends T> iVar, T t4) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.x0(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> F(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@fg.l i<? extends T> iVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l ld.p<? super Throwable, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar2) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'flowOn' instead")
    public static final <T> i<T> J(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.x0(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> K(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.n(iVar, new e(pVar, null));
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> a(@fg.l i<? extends T> iVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> b(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l i<? extends T5> iVar5, @fg.l ld.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> c(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l i<? extends T4> iVar4, @fg.l ld.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> d(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l i<? extends T3> iVar3, @fg.l ld.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.x0(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> e(@fg.l i<? extends T1> iVar, @fg.l i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new b0.d(iVar, iVar2, qVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.x0(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> f(@fg.l i<? extends T> iVar, @fg.l ld.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.x0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> g(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, ? extends i<? extends R>> lVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.x0(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> h(@fg.l i<? extends T> iVar, T t4) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.x0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> i(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.x0(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> j(@fg.l i<? extends T> iVar, long j4) {
        return new a0.h(iVar, new a(j4, null));
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.x0(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> k(@fg.l i<? extends T> iVar, long j4) {
        return new t.e(new b(j4, null), iVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.x0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> l(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.x0(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> m(@fg.l i<? extends i<? extends T>> iVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.x0(expression = "collect(action)", imports = {}))
    public static final <T> void n(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.x0(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> o(@fg.l i<? extends i<? extends T>> iVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    public static final Void p() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("螭\u0001"));
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> q(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.x0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> r(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.x0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> s(@fg.l i<? extends T> iVar, @fg.l i<? extends T> iVar2) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.x0(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> t(@fg.l i<? extends T> iVar, T t4) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.x0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> u(@fg.l i<? extends T> iVar, T t4, @fg.l ld.l<? super Throwable, Boolean> lVar) {
        return new u.a(iVar, new d(lVar, t4, null));
    }

    public static i v(i iVar, Object obj, ld.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = c.f80582b;
        }
        return u(iVar, obj, lVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> w(@fg.l i<? extends T> iVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> x(@fg.l i<? extends T> iVar, int i4) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> y(@fg.l i<? extends T> iVar, @fg.l kotlin.coroutines.g gVar) {
        p();
        throw new KotlinNothingValueException();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.x0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> z(@fg.l i<? extends T> iVar) {
        p();
        throw new KotlinNothingValueException();
    }
}
