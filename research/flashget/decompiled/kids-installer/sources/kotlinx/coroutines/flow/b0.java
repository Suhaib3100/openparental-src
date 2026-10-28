package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.flow.internal.k;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Zip.kt */
@Metadata(d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b?\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/i;", "flow", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "a", "b", "Lkotlin/coroutines/d;", "", "transform", "p", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "flow2", "f", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "Lkotlin/u;", "q", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/r;)Lkotlinx/coroutines/flow/i;", "l", "T3", "flow3", "e", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/r;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function5;", "k", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/s;)Lkotlinx/coroutines/flow/i;", "T4", "flow4", "d", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/s;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function6;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/t;)Lkotlinx/coroutines/flow/i;", "T5", "flow5", "c", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/t;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function7;", "i", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lq3/u;)Lkotlinx/coroutines/flow/i;", "T", "", "flows", "Lkotlin/Function2;", "g", "([Lkotlinx/coroutines/flow/i;Lq3/p;)Lkotlinx/coroutines/flow/i;", "m", "([Lkotlinx/coroutines/flow/i;Lq3/q;)Lkotlinx/coroutines/flow/i;", "o", "n", "Lkotlin/Function0;", "r", "()Lq3/a;", "", "(Ljava/lang/Iterable;Lq3/p;)Lkotlinx/coroutines/flow/i;", "h", "(Ljava/lang/Iterable;Lq3/q;)Lkotlinx/coroutines/flow/i;", "other", "s", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class b0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/b0$t"}, k = 1, mv = {1, 6, 0})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27844o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.r f27845p;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.b0$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0422a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27846s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27847t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27848u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.r f27849v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0422a(Continuation continuation, q3.r rVar) {
                super(3, continuation);
                this.f27849v = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                kotlinx.coroutines.flow.j jVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27846s;
                if (i5 == 0) {
                    a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f27847t;
                    Object[] objArr = (Object[]) this.f27848u;
                    q3.r rVar = this.f27849v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f27847t = jVar;
                    this.f27846s = 1;
                    obj = rVar.S(obj2, obj3, obj4, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("郐"));
                        }
                        a1.n(obj);
                        return m2.f23662a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f27847t;
                    a1.n(obj);
                }
                this.f27847t = null;
                this.f27846s = 2;
                if (jVar.b(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                C0422a c0422a = new C0422a(continuation, this.f27849v);
                c0422a.f27847t = jVar;
                c0422a.f27848u = objArr;
                return c0422a.A(m2.f23662a);
            }
        }

        public a(kotlinx.coroutines.flow.i[] iVarArr, q3.r rVar) {
            this.f27844o = iVarArr;
            this.f27845p = rVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, this.f27844o, v.f27964p, new C0422a(null, this.f27845p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/b0$t"}, k = 1, mv = {1, 6, 0})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27850o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.s f27851p;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes6.dex */
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27852s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27853t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27854u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.s f27855v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.s sVar) {
                super(3, continuation);
                this.f27855v = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                kotlinx.coroutines.flow.j jVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27852s;
                if (i5 == 0) {
                    a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f27853t;
                    Object[] objArr = (Object[]) this.f27854u;
                    q3.s sVar = this.f27855v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f27853t = jVar;
                    this.f27852s = 1;
                    obj = sVar.i0(obj2, obj3, obj4, obj5, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("郑"));
                        }
                        a1.n(obj);
                        return m2.f23662a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f27853t;
                    a1.n(obj);
                }
                this.f27853t = null;
                this.f27852s = 2;
                if (jVar.b(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27855v);
                aVar.f27853t = jVar;
                aVar.f27854u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        public b(kotlinx.coroutines.flow.i[] iVarArr, q3.s sVar) {
            this.f27850o = iVarArr;
            this.f27851p = sVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, this.f27850o, v.f27964p, new a(null, this.f27851p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/b0$t"}, k = 1, mv = {1, 6, 0})
    public static final class c<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27856o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.t f27857p;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes6.dex */
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27858s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27859t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27860u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.t f27861v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.t tVar) {
                super(3, continuation);
                this.f27861v = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                kotlinx.coroutines.flow.j jVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27858s;
                if (i5 == 0) {
                    a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f27859t;
                    Object[] objArr = (Object[]) this.f27860u;
                    q3.t tVar = this.f27861v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f27859t = jVar;
                    this.f27858s = 1;
                    obj = tVar.d0(obj2, obj3, obj4, obj5, obj6, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("郒"));
                        }
                        a1.n(obj);
                        return m2.f23662a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f27859t;
                    a1.n(obj);
                }
                this.f27859t = null;
                this.f27858s = 2;
                if (jVar.b(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27861v);
                aVar.f27859t = jVar;
                aVar.f27860u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        public c(kotlinx.coroutines.flow.i[] iVarArr, q3.t tVar) {
            this.f27856o = iVarArr;
            this.f27857p = tVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, this.f27856o, v.f27964p, new a(null, this.f27857p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27862o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f27863p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.q f27864q;

        public d(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, q3.q qVar) {
            this.f27862o = iVar;
            this.f27863p = iVar2;
            this.f27864q = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, new kotlinx.coroutines.flow.i[]{this.f27862o, this.f27863p}, v.f27964p, new g(this.f27864q, null), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27865o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27866p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27867r;

            /* renamed from: s, reason: collision with root package name */
            int f27868s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27867r = obj;
                this.f27868s |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(kotlinx.coroutines.flow.i[] iVarArr, q3.p pVar) {
            this.f27865o = iVarArr;
            this.f27866p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f27865o;
            kotlin.jvm.internal.l0.P();
            h hVar = new h(this.f27865o);
            kotlin.jvm.internal.l0.P();
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, hVar, new i(this.f27866p, null), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            kotlinx.coroutines.flow.i[] iVarArr = this.f27865o;
            kotlin.jvm.internal.l0.P();
            h hVar = new h(this.f27865o);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, hVar, new i(this.f27866p, null), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27870o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27871p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27872r;

            /* renamed from: s, reason: collision with root package name */
            int f27873s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27872r = obj;
                this.f27873s |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(kotlinx.coroutines.flow.i[] iVarArr, q3.p pVar) {
            this.f27870o = iVarArr;
            this.f27871p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f27870o;
            kotlin.jvm.internal.l0.P();
            j jVar2 = new j(this.f27870o);
            kotlin.jvm.internal.l0.P();
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, jVar2, new k(this.f27871p, null), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            kotlinx.coroutines.flow.i[] iVarArr = this.f27870o;
            kotlin.jvm.internal.l0.P();
            j jVar2 = new j(this.f27870o);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, jVar2, new k(this.f27871p, null), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class g<R> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27875s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27876t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27877u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.q<T1, T2, Continuation<? super R>, Object> f27878v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f27878v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27875s;
            if (i5 == 0) {
                a1.n(obj);
                jVar = (kotlinx.coroutines.flow.j) this.f27876t;
                Object[] objArr = (Object[]) this.f27877u;
                q3.q<T1, T2, Continuation<? super R>, Object> qVar = this.f27878v;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                this.f27876t = jVar;
                this.f27875s = 1;
                obj = qVar.G(obj3, obj4, this);
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("郓"));
                    }
                    a1.n(obj);
                    return m2.f23662a;
                }
                jVar = (kotlinx.coroutines.flow.j) this.f27876t;
                a1.n(obj);
            }
            this.f27876t = null;
            this.f27875s = 2;
            if (jVar.b(obj, this) == obj2) {
                return obj2;
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
            g gVar = new g(this.f27878v, continuation);
            gVar.f27876t = jVar;
            gVar.f27877u = objArr;
            return gVar.A(m2.f23662a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class h<T> extends Lambda implements q3.a<T[]> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27879p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
            super(0);
            this.f27879p = iVarArr;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T[] n() {
            int length = this.f27879p.length;
            kotlin.jvm.internal.l0.P();
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class i<R, T> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27880s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27881t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27882u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.p<T[], Continuation<? super R>, Object> f27883v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(q3.p<? super T[], ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super i> continuation) {
            super(3, continuation);
            this.f27883v = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27880s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f27881t;
                Object[] objArr = (Object[]) this.f27882u;
                q3.p<T[], Continuation<? super R>, Object> pVar = this.f27883v;
                this.f27881t = jVar2;
                this.f27880s = 1;
                obj = pVar.g0(objArr, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("郔"));
                    }
                    a1.n(obj);
                    return m2.f23662a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f27881t;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f27881t = null;
            this.f27880s = 2;
            if (jVar.b(obj, this) == obj2) {
                return obj2;
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d T[] tArr, @d5.e Continuation<? super m2> continuation) {
            i iVar = new i(this.f27883v, continuation);
            iVar.f27881t = jVar;
            iVar.f27882u = tArr;
            return iVar.A(m2.f23662a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.e
        public final Object Z(@d5.d Object obj) {
            ((kotlinx.coroutines.flow.j) this.f27881t).b(this.f27883v.g0((Object[]) this.f27882u, this), this);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class j<T> extends Lambda implements q3.a<T[]> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27884p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlinx.coroutines.flow.i<T>[] iVarArr) {
            super(0);
            this.f27884p = iVarArr;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T[] n() {
            int length = this.f27884p.length;
            kotlin.jvm.internal.l0.P();
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class k<R, T> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27885s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27886t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27887u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.p<T[], Continuation<? super R>, Object> f27888v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(q3.p<? super T[], ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super k> continuation) {
            super(3, continuation);
            this.f27888v = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27885s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f27886t;
                Object[] objArr = (Object[]) this.f27887u;
                q3.p<T[], Continuation<? super R>, Object> pVar = this.f27888v;
                this.f27886t = jVar2;
                this.f27885s = 1;
                obj = pVar.g0(objArr, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("郕"));
                    }
                    a1.n(obj);
                    return m2.f23662a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f27886t;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f27886t = null;
            this.f27885s = 2;
            if (jVar.b(obj, this) == obj2) {
                return obj2;
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d T[] tArr, @d5.e Continuation<? super m2> continuation) {
            k kVar = new k(this.f27888v, continuation);
            kVar.f27886t = jVar;
            kVar.f27887u = tArr;
            return kVar.A(m2.f23662a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.e
        public final Object Z(@d5.d Object obj) {
            ((kotlinx.coroutines.flow.j) this.f27886t).b(this.f27888v.g0((Object[]) this.f27887u, this), this);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class l<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27889s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27890t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27891u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.r f27892v;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27893s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27894t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27895u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.r f27896v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.r rVar) {
                super(3, continuation);
                this.f27896v = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27893s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27894t;
                    Object[] objArr = (Object[]) this.f27895u;
                    q3.r rVar = this.f27896v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f27893s = 1;
                    if (rVar.S(jVar, obj2, obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郖"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27896v);
                aVar.f27894t = jVar;
                aVar.f27895u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlinx.coroutines.flow.i[] iVarArr, Continuation continuation, q3.r rVar) {
            super(2, continuation);
            this.f27891u = iVarArr;
            this.f27892v = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27889s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27890t;
                kotlinx.coroutines.flow.i[] iVarArr = this.f27891u;
                v vVar = v.f27964p;
                a aVar = new a(null, this.f27892v);
                this.f27889s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郗"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((l) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            l lVar = new l(this.f27891u, continuation, this.f27892v);
            lVar.f27890t = obj;
            return lVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class m<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27897s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27898t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27899u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.r f27900v;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27901s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27902t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27903u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.r f27904v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.r rVar) {
                super(3, continuation);
                this.f27904v = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27901s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27902t;
                    Object[] objArr = (Object[]) this.f27903u;
                    q3.r rVar = this.f27904v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f27901s = 1;
                    if (rVar.S(jVar, obj2, obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郘"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27904v);
                aVar.f27902t = jVar;
                aVar.f27903u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlinx.coroutines.flow.i[] iVarArr, Continuation continuation, q3.r rVar) {
            super(2, continuation);
            this.f27899u = iVarArr;
            this.f27900v = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27897s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27898t;
                kotlinx.coroutines.flow.i[] iVarArr = this.f27899u;
                v vVar = v.f27964p;
                a aVar = new a(null, this.f27900v);
                this.f27897s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郙"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((m) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            m mVar = new m(this.f27899u, continuation, this.f27900v);
            mVar.f27898t = obj;
            return mVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class n<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27905s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27906t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27907u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.s f27908v;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27909s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27910t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27911u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.s f27912v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.s sVar) {
                super(3, continuation);
                this.f27912v = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27909s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27910t;
                    Object[] objArr = (Object[]) this.f27911u;
                    q3.s sVar = this.f27912v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f27909s = 1;
                    if (sVar.i0(jVar, obj2, obj3, obj4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郚"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27912v);
                aVar.f27910t = jVar;
                aVar.f27911u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlinx.coroutines.flow.i[] iVarArr, Continuation continuation, q3.s sVar) {
            super(2, continuation);
            this.f27907u = iVarArr;
            this.f27908v = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27905s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27906t;
                kotlinx.coroutines.flow.i[] iVarArr = this.f27907u;
                v vVar = v.f27964p;
                a aVar = new a(null, this.f27908v);
                this.f27905s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郛"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((n) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            n nVar = new n(this.f27907u, continuation, this.f27908v);
            nVar.f27906t = obj;
            return nVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class o<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27913s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27914t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27915u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.t f27916v;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27917s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27918t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27919u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.t f27920v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.t tVar) {
                super(3, continuation);
                this.f27920v = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27917s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27918t;
                    Object[] objArr = (Object[]) this.f27919u;
                    q3.t tVar = this.f27920v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f27917s = 1;
                    if (tVar.d0(jVar, obj2, obj3, obj4, obj5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郜"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27920v);
                aVar.f27918t = jVar;
                aVar.f27919u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlinx.coroutines.flow.i[] iVarArr, Continuation continuation, q3.t tVar) {
            super(2, continuation);
            this.f27915u = iVarArr;
            this.f27916v = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27913s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27914t;
                kotlinx.coroutines.flow.i[] iVarArr = this.f27915u;
                v vVar = v.f27964p;
                a aVar = new a(null, this.f27916v);
                this.f27913s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郝"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((o) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            o oVar = new o(this.f27915u, continuation, this.f27916v);
            oVar.f27914t = obj;
            return oVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class p<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27921s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27922t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27923u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.u f27924v;

        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, Object[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27925s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27926t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27927u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.u f27928v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, q3.u uVar) {
                super(3, continuation);
                this.f27928v = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27925s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27926t;
                    Object[] objArr = (Object[]) this.f27927u;
                    q3.u uVar = this.f27928v;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f27925s = 1;
                    if (uVar.n0(jVar, obj2, obj3, obj4, obj5, obj6, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郞"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Object[] objArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(continuation, this.f27928v);
                aVar.f27926t = jVar;
                aVar.f27927u = objArr;
                return aVar.A(m2.f23662a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlinx.coroutines.flow.i[] iVarArr, Continuation continuation, q3.u uVar) {
            super(2, continuation);
            this.f27923u = iVarArr;
            this.f27924v = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27921s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27922t;
                kotlinx.coroutines.flow.i[] iVarArr = this.f27923u;
                v vVar = v.f27964p;
                a aVar = new a(null, this.f27924v);
                this.f27921s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郟"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((p) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            p pVar = new p(this.f27923u, continuation, this.f27924v);
            pVar.f27922t = obj;
            return pVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class q<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27929s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27930t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27931u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> f27932v;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> extends Lambda implements q3.a<T[]> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27933p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
                super(0);
                this.f27933p = iVarArr;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T[] n() {
                int length = this.f27933p.length;
                kotlin.jvm.internal.l0.P();
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27934s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27935t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27936u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> f27937v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f27937v = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27934s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27935t;
                    Object[] objArr = (Object[]) this.f27936u;
                    q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> qVar = this.f27937v;
                    this.f27935t = null;
                    this.f27934s = 1;
                    if (qVar.G(jVar, objArr, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郠"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d T[] tArr, @d5.e Continuation<? super m2> continuation) {
                b bVar = new b(this.f27937v, continuation);
                bVar.f27935t = jVar;
                bVar.f27936u = tArr;
                return bVar.A(m2.f23662a);
            }

            @d5.e
            public final Object Z(@d5.d Object obj) {
                this.f27937v.G((kotlinx.coroutines.flow.j) this.f27935t, (Object[]) this.f27936u, this);
                return m2.f23662a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f27931u = iVarArr;
            this.f27932v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27929s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27930t;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f27931u;
                kotlin.jvm.internal.l0.P();
                a aVar = new a(this.f27931u);
                kotlin.jvm.internal.l0.P();
                b bVar = new b(this.f27932v, null);
                this.f27929s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar, bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郡"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((q) c(jVar, continuation)).A(m2.f23662a);
        }

        @d5.e
        public final Object Z(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27930t;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f27931u;
            kotlin.jvm.internal.l0.P();
            a aVar = new a(this.f27931u);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar, new b(this.f27932v, null), this);
            return m2.f23662a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            q qVar = new q(this.f27931u, this.f27932v, continuation);
            qVar.f27930t = obj;
            return qVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {okhttp3.internal.http.k.f30972e}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class r<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27938s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27939t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27940u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> f27941v;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> extends Lambda implements q3.a<T[]> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27942p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.flow.i<T>[] iVarArr) {
                super(0);
                this.f27942p = iVarArr;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T[] n() {
                int length = this.f27942p.length;
                kotlin.jvm.internal.l0.P();
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {okhttp3.internal.http.k.f30972e}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27943s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27944t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27945u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> f27946v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f27946v = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27943s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27944t;
                    Object[] objArr = (Object[]) this.f27945u;
                    q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> qVar = this.f27946v;
                    this.f27944t = null;
                    this.f27943s = 1;
                    if (qVar.G(jVar, objArr, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郢"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d T[] tArr, @d5.e Continuation<? super m2> continuation) {
                b bVar = new b(this.f27946v, continuation);
                bVar.f27944t = jVar;
                bVar.f27945u = tArr;
                return bVar.A(m2.f23662a);
            }

            @d5.e
            public final Object Z(@d5.d Object obj) {
                this.f27946v.G((kotlinx.coroutines.flow.j) this.f27944t, (Object[]) this.f27945u, this);
                return m2.f23662a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(kotlinx.coroutines.flow.i<T>[] iVarArr, q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f27940u = iVarArr;
            this.f27941v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27938s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27939t;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f27940u;
                kotlin.jvm.internal.l0.P();
                a aVar = new a(this.f27940u);
                kotlin.jvm.internal.l0.P();
                b bVar = new b(this.f27941v, null);
                this.f27938s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar, bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郣"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((r) c(jVar, continuation)).A(m2.f23662a);
        }

        @d5.e
        public final Object Z(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27939t;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f27940u;
            kotlin.jvm.internal.l0.P();
            a aVar = new a(this.f27940u);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar, new b(this.f27941v, null), this);
            return m2.f23662a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            r rVar = new r(this.f27940u, this.f27941v, continuation);
            rVar.f27939t = obj;
            return rVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class s<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.flow.j<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27947s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27948t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f27949u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> f27950v;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f27951s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f27952t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f27953u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> f27954v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f27954v = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f27951s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27952t;
                    Object[] objArr = (Object[]) this.f27953u;
                    q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> qVar = this.f27954v;
                    this.f27952t = null;
                    this.f27951s = 1;
                    if (qVar.G(jVar, objArr, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("郤"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.q
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d T[] tArr, @d5.e Continuation<? super m2> continuation) {
                a aVar = new a(this.f27954v, continuation);
                aVar.f27952t = jVar;
                aVar.f27953u = tArr;
                return aVar.A(m2.f23662a);
            }

            @d5.e
            public final Object Z(@d5.d Object obj) {
                this.f27954v.G((kotlinx.coroutines.flow.j) this.f27952t, (Object[]) this.f27953u, this);
                return m2.f23662a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f27949u = iVarArr;
            this.f27950v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27947s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27948t;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f27949u;
                v vVar = v.f27964p;
                kotlin.jvm.internal.l0.P();
                a aVar = new a(this.f27950v, null);
                this.f27947s = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郥"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((s) c(jVar, continuation)).A(m2.f23662a);
        }

        @d5.e
        public final Object Z(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f27948t;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f27949u;
            v vVar = v.f27964p;
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, new a(this.f27950v, null), this);
            return m2.f23662a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            s sVar = new s(this.f27949u, this.f27950v, continuation);
            sVar.f27948t = obj;
            return sVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class t<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f27955o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p f27956p;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27957r;

            /* renamed from: s, reason: collision with root package name */
            int f27958s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27957r = obj;
                this.f27958s |= Integer.MIN_VALUE;
                return t.this.a(null, this);
            }
        }

        public t(kotlinx.coroutines.flow.i[] iVarArr, q3.p pVar) {
            this.f27955o = iVarArr;
            this.f27956p = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f27955o;
            v vVar = v.f27964p;
            kotlin.jvm.internal.l0.P();
            Object a6 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, new u(this.f27956p, null), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }

        @d5.e
        public Object e(@d5.d kotlinx.coroutines.flow.j jVar, @d5.d Continuation continuation) {
            new a(continuation);
            kotlinx.coroutines.flow.i[] iVarArr = this.f27955o;
            v vVar = v.f27964p;
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, new u(this.f27956p, null), continuation);
            return m2.f23662a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class u<R, T> extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super R>, T[], Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27960s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27961t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27962u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.p<T[], Continuation<? super R>, Object> f27963v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(q3.p<? super T[], ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super u> continuation) {
            super(3, continuation);
            this.f27963v = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27960s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f27961t;
                Object[] objArr = (Object[]) this.f27962u;
                q3.p<T[], Continuation<? super R>, Object> pVar = this.f27963v;
                this.f27961t = jVar2;
                this.f27960s = 1;
                obj = pVar.g0(objArr, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("郦"));
                    }
                    a1.n(obj);
                    return m2.f23662a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f27961t;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f27961t = null;
            this.f27960s = 2;
            if (jVar.b(obj, this) == obj2) {
                return obj2;
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d T[] tArr, @d5.e Continuation<? super m2> continuation) {
            u uVar = new u(this.f27963v, continuation);
            uVar.f27961t = jVar;
            uVar.f27962u = tArr;
            return uVar.A(m2.f23662a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.e
        public final Object Z(@d5.d Object obj) {
            ((kotlinx.coroutines.flow.j) this.f27961t).b(this.f27963v.g0((Object[]) this.f27962u, this), this);
            return m2.f23662a;
        }
    }

    /* compiled from: Zip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class v extends Lambda implements q3.a {

        /* renamed from: p, reason: collision with root package name */
        public static final v f27964p = new v();

        v() {
            super(0);
        }

        @d5.e
        public final Void a() {
            return null;
        }

        @Override // q3.a
        public Object n() {
            return null;
        }
    }

    public static final q3.a a() {
        return v.f27964p;
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> b(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, q3.p<? super T[], ? super Continuation<? super R>, ? extends Object> pVar) {
        List V5;
        V5 = kotlin.collections.j0.V5(iterable);
        Object[] array = V5.toArray(new kotlinx.coroutines.flow.i[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("嵌"));
        }
        kotlin.jvm.internal.l0.P();
        return new f((kotlinx.coroutines.flow.i[]) array, pVar);
    }

    @d5.d
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> c(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @d5.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @d5.d kotlinx.coroutines.flow.i<? extends T5> iVar5, @d5.d q3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> tVar) {
        return new c(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, tVar);
    }

    @d5.d
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> d(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @d5.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @d5.d q3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> sVar) {
        return new b(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, sVar);
    }

    @d5.d
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> e(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @BuilderInference @d5.d q3.r<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> rVar) {
        return new a(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, rVar);
    }

    @d5.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> f(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> g(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, q3.p<? super T[], ? super Continuation<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.P();
        return new e(iVarArr, pVar);
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> h(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @BuilderInference q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar) {
        List V5;
        V5 = kotlin.collections.j0.V5(iterable);
        Object[] array = V5.toArray(new kotlinx.coroutines.flow.i[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("嵍"));
        }
        kotlin.jvm.internal.l0.P();
        return new h0(new r((kotlinx.coroutines.flow.i[]) array, qVar, null));
    }

    @d5.d
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> i(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @d5.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @d5.d kotlinx.coroutines.flow.i<? extends T5> iVar5, @BuilderInference @d5.d q3.u<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super m2>, ? extends Object> uVar) {
        return new h0(new p(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, uVar));
    }

    @d5.d
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> j(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @d5.d kotlinx.coroutines.flow.i<? extends T4> iVar4, @BuilderInference @d5.d q3.t<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super m2>, ? extends Object> tVar) {
        return new h0(new o(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, null, tVar));
    }

    @d5.d
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> k(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d kotlinx.coroutines.flow.i<? extends T3> iVar3, @BuilderInference @d5.d q3.s<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super m2>, ? extends Object> sVar) {
        return new h0(new n(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, null, sVar));
    }

    @d5.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> l(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @BuilderInference @d5.d q3.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super Continuation<? super m2>, ? extends Object> rVar) {
        return new h0(new m(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> m(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @BuilderInference q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.P();
        return new h0(new q(iVarArr, qVar, null));
    }

    private static final <T, R> kotlinx.coroutines.flow.i<R> n(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @BuilderInference q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super Continuation<? super m2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.P();
        return new h0(new s(iVarArr, qVar, null));
    }

    private static final <T, R> kotlinx.coroutines.flow.i<R> o(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, q3.p<? super T[], ? super Continuation<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.P();
        return new t(iVarArr, pVar);
    }

    @p3.i(name = "flowCombine")
    @d5.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> p(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    @p3.i(name = "flowCombineTransform")
    @d5.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> q(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @BuilderInference @d5.d q3.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super Continuation<? super m2>, ? extends Object> rVar) {
        return new h0(new l(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    private static final <T> q3.a<T[]> r() {
        return v.f27964p;
    }

    @d5.d
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> s(@d5.d kotlinx.coroutines.flow.i<? extends T1> iVar, @d5.d kotlinx.coroutines.flow.i<? extends T2> iVar2, @d5.d q3.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new k.b(iVar2, iVar, qVar);
    }
}
