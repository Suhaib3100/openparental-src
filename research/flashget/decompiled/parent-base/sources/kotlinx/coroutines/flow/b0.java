package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.internal.k;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Zip.kt */
@Metadata(d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b?\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/i;", "flow", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "a", "b", "Lkotlin/coroutines/d;", "", "transform", "p", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "flow2", "f", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "Lkotlin/u;", "q", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/r;)Lkotlinx/coroutines/flow/i;", "l", "T3", "flow3", "e", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/r;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function5;", "k", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/s;)Lkotlinx/coroutines/flow/i;", "T4", "flow4", "d", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/s;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function6;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/t;)Lkotlinx/coroutines/flow/i;", "T5", "flow5", "c", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/t;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function7;", "i", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lld/u;)Lkotlinx/coroutines/flow/i;", "T", "", "flows", "Lkotlin/Function2;", "g", "([Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "m", "([Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "o", "n", "Lkotlin/Function0;", "r", "()Lld/a;", "", "(Ljava/lang/Iterable;Lld/p;)Lkotlinx/coroutines/flow/i;", "h", "(Ljava/lang/Iterable;Lld/q;)Lkotlinx/coroutines/flow/i;", "other", "s", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,332:1\n272#1,3:334\n272#1,3:337\n261#1:340\n263#1:342\n272#1,3:343\n261#1:346\n263#1:348\n272#1,3:349\n261#1:352\n263#1:354\n272#1,3:355\n107#2:333\n107#2:341\n107#2:347\n107#2:353\n107#2:358\n107#2:359\n107#2:362\n37#3,2:360\n37#3,2:363\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n75#1:334,3\n103#1:337,3\n119#1:340\n119#1:342\n138#1:343,3\n156#1:346\n156#1:348\n177#1:349,3\n197#1:352\n197#1:354\n220#1:355,3\n32#1:333\n119#1:341\n156#1:347\n197#1:353\n237#1:358\n261#1:359\n288#1:362\n287#1:360,2\n306#1:363,2\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class b0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$t", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n262#2,2:114\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.r f79876c;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$u"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n120#2,4:333\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.b0$a$a, reason: collision with other inner class name */
        public static final class C1229a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79877b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79878c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79879d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.r f79880e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1229a(kotlin.coroutines.d dVar, ld.r rVar) {
                super(3, dVar);
                this.f79880e = rVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                C1229a c1229a = new C1229a(dVar, this.f79880e);
                c1229a.f79878c = jVar;
                c1229a.f79879d = objArr;
                return c1229a.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlinx.coroutines.flow.j jVar;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79877b;
                if (i4 == 0) {
                    a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f79878c;
                    Object[] objArr = (Object[]) this.f79879d;
                    ld.r rVar = this.f79880e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f79878c = jVar;
                    this.f79877b = 1;
                    obj = rVar.i(obj2, obj3, obj4, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("蛡\u0001"));
                        }
                        a1.n(obj);
                        return k2.f75408a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f79878c;
                    a1.n(obj);
                }
                this.f79878c = null;
                this.f79877b = 2;
                if (jVar.emit(obj, this) == aVar) {
                    return aVar;
                }
                return k2.f75408a;
            }
        }

        public a(kotlinx.coroutines.flow.i[] iVarArr, ld.r rVar) {
            this.f79875b = iVarArr;
            this.f79876c = rVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, this.f79875b, v.f79995b, new C1229a(null, this.f79876c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$t", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n262#2,2:114\n*E\n"})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.s f79882c;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$u"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n157#2,5:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79883b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79884c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79885d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.s f79886e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.s sVar) {
                super(3, dVar);
                this.f79886e = sVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79886e);
                aVar.f79884c = jVar;
                aVar.f79885d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlinx.coroutines.flow.j jVar;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79883b;
                if (i4 == 0) {
                    a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f79884c;
                    Object[] objArr = (Object[]) this.f79885d;
                    ld.s sVar = this.f79886e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f79884c = jVar;
                    this.f79883b = 1;
                    obj = sVar.a0(obj2, obj3, obj4, obj5, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("蛢\u0001"));
                        }
                        a1.n(obj);
                        return k2.f75408a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f79884c;
                    a1.n(obj);
                }
                this.f79884c = null;
                this.f79883b = 2;
                if (jVar.emit(obj, this) == aVar) {
                    return aVar;
                }
                return k2.f75408a;
            }
        }

        public b(kotlinx.coroutines.flow.i[] iVarArr, ld.s sVar) {
            this.f79881b = iVarArr;
            this.f79882c = sVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, this.f79881b, v.f79995b, new a(null, this.f79882c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$t", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n262#2,2:114\n*E\n"})
    public static final class c<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79887b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.t f79888c;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$u"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n198#2,6:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79889b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79890c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79891d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.t f79892e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.t tVar) {
                super(3, dVar);
                this.f79892e = tVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79892e);
                aVar.f79890c = jVar;
                aVar.f79891d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlinx.coroutines.flow.j jVar;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79889b;
                if (i4 == 0) {
                    a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f79890c;
                    Object[] objArr = (Object[]) this.f79891d;
                    ld.t tVar = this.f79892e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f79890c = jVar;
                    this.f79889b = 1;
                    obj = tVar.H(obj2, obj3, obj4, obj5, obj6, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("蛣\u0001"));
                        }
                        a1.n(obj);
                        return k2.f75408a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f79890c;
                    a1.n(obj);
                }
                this.f79890c = null;
                this.f79889b = 2;
                if (jVar.emit(obj, this) == aVar) {
                    return aVar;
                }
                return k2.f75408a;
            }
        }

        public c(kotlinx.coroutines.flow.i[] iVarArr, ld.t tVar) {
            this.f79887b = iVarArr;
            this.f79888c = tVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, this.f79887b, v.f79995b, new a(null, this.f79888c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n33#2,2:114\n*E\n"})
    public static final class d<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f79894c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q f79895d;

        public d(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, ld.q qVar) {
            this.f79893b = iVar;
            this.f79894c = iVar2;
            this.f79895d = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, new kotlinx.coroutines.flow.i[]{this.f79893b, this.f79894c}, v.f79995b, new g(this.f79895d, null), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n238#2,2:114\n*E\n"})
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79897c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79898b;

            /* renamed from: c, reason: collision with root package name */
            int f79899c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79898b = obj;
                this.f79899c |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(kotlinx.coroutines.flow.i[] iVarArr, ld.p pVar) {
            this.f79896b = iVarArr;
            this.f79897c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f79896b;
            kotlin.jvm.internal.l0.P();
            h hVar = new h(this.f79896b);
            kotlin.jvm.internal.l0.P();
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, hVar, new i(this.f79897c, null), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            kotlinx.coroutines.flow.i[] iVarArr = this.f79896b;
            kotlin.jvm.internal.l0.P();
            h hVar = new h(this.f79896b);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, hVar, new i(this.f79897c, null), dVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n289#2,5:114\n*E\n"})
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79901b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79902c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79903b;

            /* renamed from: c, reason: collision with root package name */
            int f79904c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79903b = obj;
                this.f79904c |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(kotlinx.coroutines.flow.i[] iVarArr, ld.p pVar) {
            this.f79901b = iVarArr;
            this.f79902c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f79901b;
            kotlin.jvm.internal.l0.P();
            j jVar2 = new j(this.f79901b);
            kotlin.jvm.internal.l0.P();
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, jVar2, new k(this.f79902c, null), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            kotlinx.coroutines.flow.i[] iVarArr = this.f79901b;
            kotlin.jvm.internal.l0.P();
            j jVar2 = new j(this.f79901b);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, jVar2, new k(this.f79902c, null), dVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
    static final class g<R> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79906b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79907c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79908d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<T1, T2, kotlin.coroutines.d<? super R>, Object> f79909e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super g> dVar) {
            super(3, dVar);
            this.f79909e = qVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            g gVar = new g(this.f79909e, dVar);
            gVar.f79907c = jVar;
            gVar.f79908d = objArr;
            return gVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79906b;
            if (i4 == 0) {
                a1.n(obj);
                jVar = (kotlinx.coroutines.flow.j) this.f79907c;
                Object[] objArr = (Object[]) this.f79908d;
                ld.q<T1, T2, kotlin.coroutines.d<? super R>, Object> qVar = this.f79909e;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                this.f79907c = jVar;
                this.f79906b = 1;
                obj = qVar.R(obj3, obj4, this);
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛤\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                jVar = (kotlinx.coroutines.flow.j) this.f79907c;
                a1.n(obj);
            }
            this.f79907c = null;
            this.f79906b = 2;
            if (jVar.emit(obj, this) == obj2) {
                return obj2;
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$1\n*L\n1#1,332:1\n*E\n"})
    static final class h<T> extends kotlin.jvm.internal.n0 implements ld.a<T[]> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
            super(0);
            this.f79910b = iVarArr;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T[] invoke() {
            int length = this.f79910b.length;
            kotlin.jvm.internal.l0.P();
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2\n*L\n1#1,332:1\n*E\n"})
    public static final class i<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79911b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79912c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79913d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T[], kotlin.coroutines.d<? super R>, Object> f79914e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(ld.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.f79914e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l T[] tArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            kotlin.jvm.internal.l0.P();
            i iVar = new i(this.f79914e, dVar);
            iVar.f79912c = jVar;
            iVar.f79913d = tArr;
            return iVar.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final Object d(@fg.l Object obj) {
            ((kotlinx.coroutines.flow.j) this.f79912c).emit(this.f79914e.invoke((Object[]) this.f79913d, this), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79911b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f79912c;
                Object[] objArr = (Object[]) this.f79913d;
                ld.p<T[], kotlin.coroutines.d<? super R>, Object> pVar = this.f79914e;
                this.f79912c = jVar2;
                this.f79911b = 1;
                obj = pVar.invoke(objArr, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛥\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f79912c;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f79912c = null;
            this.f79911b = 2;
            if (jVar.emit(obj, this) == obj2) {
                return obj2;
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
    static final class j<T> extends kotlin.jvm.internal.n0 implements ld.a<T[]> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlinx.coroutines.flow.i<T>[] iVarArr) {
            super(0);
            this.f79915b = iVarArr;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T[] invoke() {
            int length = this.f79915b.length;
            kotlin.jvm.internal.l0.P();
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n*L\n1#1,332:1\n*E\n"})
    public static final class k<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79916b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79917c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79918d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T[], kotlin.coroutines.d<? super R>, Object> f79919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(ld.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super k> dVar) {
            super(3, dVar);
            this.f79919e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l T[] tArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            kotlin.jvm.internal.l0.P();
            k kVar = new k(this.f79919e, dVar);
            kVar.f79917c = jVar;
            kVar.f79918d = tArr;
            return kVar.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final Object d(@fg.l Object obj) {
            ((kotlinx.coroutines.flow.j) this.f79917c).emit(this.f79919e.invoke((Object[]) this.f79918d, this), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79916b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f79917c;
                Object[] objArr = (Object[]) this.f79918d;
                ld.p<T[], kotlin.coroutines.d<? super R>, Object> pVar = this.f79919e;
                this.f79917c = jVar2;
                this.f79916b = 1;
                obj = pVar.invoke(objArr, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛦\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f79917c;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f79917c = null;
            this.f79916b = 2;
            if (jVar.emit(obj, this) == obj2) {
                return obj2;
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0$s"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    public static final class l<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79920b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79921c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.r f79923e;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$s$a"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n76#2,5:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79924b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79925c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79926d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.r f79927e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.r rVar) {
                super(3, dVar);
                this.f79927e = rVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79927e);
                aVar.f79925c = jVar;
                aVar.f79926d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79924b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79925c;
                    Object[] objArr = (Object[]) this.f79926d;
                    ld.r rVar = this.f79927e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f79924b = 1;
                    if (rVar.i(jVar, obj2, obj3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛧\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, ld.r rVar) {
            super(2, dVar);
            this.f79922d = iVarArr;
            this.f79923e = rVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f79922d, dVar, this.f79923e);
            lVar.f79921c = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79920b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79921c;
                kotlinx.coroutines.flow.i[] iVarArr = this.f79922d;
                v vVar = v.f79995b;
                a aVar2 = new a(null, this.f79923e);
                this.f79920b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛨\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0$s"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    public static final class m<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79928b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.r f79931e;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$s$a"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n104#2,5:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79932b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79933c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79934d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.r f79935e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.r rVar) {
                super(3, dVar);
                this.f79935e = rVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79935e);
                aVar.f79933c = jVar;
                aVar.f79934d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79932b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79933c;
                    Object[] objArr = (Object[]) this.f79934d;
                    ld.r rVar = this.f79935e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f79932b = 1;
                    if (rVar.i(jVar, obj2, obj3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛩\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, ld.r rVar) {
            super(2, dVar);
            this.f79930d = iVarArr;
            this.f79931e = rVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((m) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f79930d, dVar, this.f79931e);
            mVar.f79929c = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79928b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79929c;
                kotlinx.coroutines.flow.i[] iVarArr = this.f79930d;
                v vVar = v.f79995b;
                a aVar2 = new a(null, this.f79931e);
                this.f79928b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛪\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0$s"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    public static final class n<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79936b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79937c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79938d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.s f79939e;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$s$a"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n139#2,6:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79940b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79941c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79942d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.s f79943e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.s sVar) {
                super(3, dVar);
                this.f79943e = sVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79943e);
                aVar.f79941c = jVar;
                aVar.f79942d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79940b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79941c;
                    Object[] objArr = (Object[]) this.f79942d;
                    ld.s sVar = this.f79943e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f79940b = 1;
                    if (sVar.a0(jVar, obj2, obj3, obj4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛫\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, ld.s sVar) {
            super(2, dVar);
            this.f79938d = iVarArr;
            this.f79939e = sVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((n) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f79938d, dVar, this.f79939e);
            nVar.f79937c = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79936b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79937c;
                kotlinx.coroutines.flow.i[] iVarArr = this.f79938d;
                v vVar = v.f79995b;
                a aVar2 = new a(null, this.f79939e);
                this.f79936b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛬\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0$s"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    public static final class o<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79944b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79945c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79946d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.t f79947e;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$s$a"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n178#2,7:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79948b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79949c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79950d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.t f79951e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.t tVar) {
                super(3, dVar);
                this.f79951e = tVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79951e);
                aVar.f79949c = jVar;
                aVar.f79950d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79948b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79949c;
                    Object[] objArr = (Object[]) this.f79950d;
                    ld.t tVar = this.f79951e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f79948b = 1;
                    if (tVar.H(jVar, obj2, obj3, obj4, obj5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛭\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, ld.t tVar) {
            super(2, dVar);
            this.f79946d = iVarArr;
            this.f79947e = tVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((o) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            o oVar = new o(this.f79946d, dVar, this.f79947e);
            oVar.f79945c = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79944b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79945c;
                kotlinx.coroutines.flow.i[] iVarArr = this.f79946d;
                v vVar = v.f79995b;
                a aVar2 = new a(null, this.f79947e);
                this.f79944b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛮\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0$s"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    public static final class p<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79952b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.u f79955e;

        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/b0$s$a"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n221#2,8:333\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79956b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79957c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79958d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.u f79959e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, ld.u uVar) {
                super(3, dVar);
                this.f79959e = uVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l Object[] objArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                a aVar = new a(dVar, this.f79959e);
                aVar.f79957c = jVar;
                aVar.f79958d = objArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79956b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79957c;
                    Object[] objArr = (Object[]) this.f79958d;
                    ld.u uVar = this.f79959e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f79956b = 1;
                    if (uVar.K(jVar, obj2, obj3, obj4, obj5, obj6, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛯\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, ld.u uVar) {
            super(2, dVar);
            this.f79954d = iVarArr;
            this.f79955e = uVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((p) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            p pVar = new p(this.f79954d, dVar, this.f79955e);
            pVar.f79953c = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79952b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79953c;
                kotlinx.coroutines.flow.i[] iVarArr = this.f79954d;
                v vVar = v.f79995b;
                a aVar2 = new a(null, this.f79955e);
                this.f79952b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛰\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6\n*L\n1#1,332:1\n*E\n"})
    public static final class q<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79960b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79962d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f79963e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$1\n*L\n1#1,332:1\n*E\n"})
        public static final class a<T> extends kotlin.jvm.internal.n0 implements ld.a<T[]> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79964b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
                super(0);
                this.f79964b = iVarArr;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T[] invoke() {
                int length = this.f79964b.length;
                kotlin.jvm.internal.l0.P();
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$2\n*L\n1#1,332:1\n*E\n"})
        public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79965b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79966c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79967d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f79968e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f79968e = qVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l T[] tArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                kotlin.jvm.internal.l0.P();
                b bVar = new b(this.f79968e, dVar);
                bVar.f79966c = jVar;
                bVar.f79967d = tArr;
                return bVar.invokeSuspend(k2.f75408a);
            }

            @fg.m
            public final Object d(@fg.l Object obj) {
                this.f79968e.R((kotlinx.coroutines.flow.j) this.f79966c, (Object[]) this.f79967d, this);
                return k2.f75408a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79965b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79966c;
                    Object[] objArr = (Object[]) this.f79967d;
                    ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> qVar = this.f79968e;
                    this.f79966c = null;
                    this.f79965b = 1;
                    if (qVar.R(jVar, objArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛱\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f79962d = iVarArr;
            this.f79963e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((q) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.f79962d, this.f79963e, dVar);
            qVar.f79961c = obj;
            return qVar;
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79961c;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f79962d;
            kotlin.jvm.internal.l0.P();
            a aVar = new a(this.f79962d);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar, new b(this.f79963e, null), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79960b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79961c;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f79962d;
                kotlin.jvm.internal.l0.P();
                a aVar2 = new a(this.f79962d);
                kotlin.jvm.internal.l0.P();
                b bVar = new b(this.f79963e, null);
                this.f79960b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛲\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7\n*L\n1#1,332:1\n*E\n"})
    public static final class r<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79969b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79970c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79971d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f79972e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7$1\n*L\n1#1,332:1\n*E\n"})
        public static final class a<T> extends kotlin.jvm.internal.n0 implements ld.a<T[]> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79973b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.flow.i<T>[] iVarArr) {
                super(0);
                this.f79973b = iVarArr;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T[] invoke() {
                int length = this.f79973b.length;
                kotlin.jvm.internal.l0.P();
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7$2\n*L\n1#1,332:1\n*E\n"})
        public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79974b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79975c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79976d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f79977e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f79977e = qVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l T[] tArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                kotlin.jvm.internal.l0.P();
                b bVar = new b(this.f79977e, dVar);
                bVar.f79975c = jVar;
                bVar.f79976d = tArr;
                return bVar.invokeSuspend(k2.f75408a);
            }

            @fg.m
            public final Object d(@fg.l Object obj) {
                this.f79977e.R((kotlinx.coroutines.flow.j) this.f79975c, (Object[]) this.f79976d, this);
                return k2.f75408a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79974b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79975c;
                    Object[] objArr = (Object[]) this.f79976d;
                    ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> qVar = this.f79977e;
                    this.f79975c = null;
                    this.f79974b = 1;
                    if (qVar.R(jVar, objArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛳\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(kotlinx.coroutines.flow.i<T>[] iVarArr, ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f79971d = iVarArr;
            this.f79972e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((r) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            r rVar = new r(this.f79971d, this.f79972e, dVar);
            rVar.f79970c = obj;
            return rVar;
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79970c;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f79971d;
            kotlin.jvm.internal.l0.P();
            a aVar = new a(this.f79971d);
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar, new b(this.f79972e, null), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79969b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79970c;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f79971d;
                kotlin.jvm.internal.l0.P();
                a aVar2 = new a(this.f79971d);
                kotlin.jvm.internal.l0.P();
                b bVar = new b(this.f79972e, null);
                this.f79969b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛴\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    public static final class s<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79978b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f79980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f79981e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Zip.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n*L\n1#1,332:1\n*E\n"})
        public static final class a<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f79982b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f79983c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f79984d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> f79985e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f79985e = qVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l T[] tArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                kotlin.jvm.internal.l0.P();
                a aVar = new a(this.f79985e, dVar);
                aVar.f79983c = jVar;
                aVar.f79984d = tArr;
                return aVar.invokeSuspend(k2.f75408a);
            }

            @fg.m
            public final Object d(@fg.l Object obj) {
                this.f79985e.R((kotlinx.coroutines.flow.j) this.f79983c, (Object[]) this.f79984d, this);
                return k2.f75408a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f79982b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79983c;
                    Object[] objArr = (Object[]) this.f79984d;
                    ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> qVar = this.f79985e;
                    this.f79983c = null;
                    this.f79982b = 1;
                    if (qVar.R(jVar, objArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛵\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f79980d = iVarArr;
            this.f79981e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((s) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.f79980d, this.f79981e, dVar);
            sVar.f79979c = obj;
            return sVar;
        }

        @fg.m
        public final Object d(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79979c;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f79980d;
            v vVar = v.f79995b;
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, new a(this.f79981e, null), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79978b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f79979c;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f79980d;
                v vVar = v.f79995b;
                kotlin.jvm.internal.l0.P();
                a aVar2 = new a(this.f79981e, null);
                this.f79978b = 1;
                if (kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蛶\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n262#2,2:114\n*E\n"})
    public static final class t<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f79986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f79987c;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f79988b;

            /* renamed from: c, reason: collision with root package name */
            int f79989c;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f79988b = obj;
                this.f79989c |= Integer.MIN_VALUE;
                return t.this.a(null, this);
            }
        }

        public t(kotlinx.coroutines.flow.i[] iVarArr, ld.p pVar) {
            this.f79986b = iVarArr;
            this.f79987c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f79986b;
            v vVar = v.f79995b;
            kotlin.jvm.internal.l0.P();
            Object a5 = kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, new u(this.f79987c, null), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }

        @fg.m
        public Object f(@fg.l kotlinx.coroutines.flow.j jVar, @fg.l kotlin.coroutines.d dVar) {
            new a(dVar);
            kotlinx.coroutines.flow.i[] iVarArr = this.f79986b;
            v vVar = v.f79995b;
            kotlin.jvm.internal.l0.P();
            kotlinx.coroutines.flow.internal.k.a(jVar, iVarArr, vVar, new u(this.f79987c, null), dVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n*L\n1#1,332:1\n*E\n"})
    public static final class u<R, T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79991b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79992c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79993d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<T[], kotlin.coroutines.d<? super R>, Object> f79994e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(ld.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super u> dVar) {
            super(3, dVar);
            this.f79994e = pVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.l T[] tArr, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            kotlin.jvm.internal.l0.P();
            u uVar = new u(this.f79994e, dVar);
            uVar.f79992c = jVar;
            uVar.f79993d = tArr;
            return uVar.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final Object d(@fg.l Object obj) {
            ((kotlinx.coroutines.flow.j) this.f79992c).emit(this.f79994e.invoke((Object[]) this.f79993d, this), this);
            return k2.f75408a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79991b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.f79992c;
                Object[] objArr = (Object[]) this.f79993d;
                ld.p<T[], kotlin.coroutines.d<? super R>, Object> pVar = this.f79994e;
                this.f79992c = jVar2;
                this.f79991b = 1;
                obj = pVar.invoke(objArr, this);
                jVar = jVar2;
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(ProtectedSandApp.s("蛷\u0001"));
                    }
                    a1.n(obj);
                    return k2.f75408a;
                }
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.f79992c;
                a1.n(obj);
                jVar = jVar3;
            }
            this.f79992c = null;
            this.f79991b = 2;
            if (jVar.emit(obj, this) == obj2) {
                return obj2;
            }
            return k2.f75408a;
        }
    }

    /* compiled from: Zip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class v extends kotlin.jvm.internal.n0 implements ld.a {

        /* renamed from: b, reason: collision with root package name */
        public static final v f79995b = new v(0);

        v() {
            super(0);
        }

        @fg.m
        public final Void a() {
            return null;
        }

        @Override // ld.a
        public Object invoke() {
            return null;
        }
    }

    public static final ld.a a() {
        return v.f79995b;
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> b(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, ld.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        kotlinx.coroutines.flow.i[] iVarArr = (kotlinx.coroutines.flow.i[]) kotlin.collections.w.V5(iterable).toArray(new kotlinx.coroutines.flow.i[0]);
        kotlin.jvm.internal.l0.P();
        return new f(iVarArr, pVar);
    }

    @fg.l
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> c(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @fg.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @fg.l kotlinx.coroutines.flow.i<? extends T5> iVar5, @fg.l ld.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return new c(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, tVar);
    }

    @fg.l
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> d(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @fg.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @fg.l ld.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return new b(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, sVar);
    }

    @fg.l
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> e(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @fg.l @InterfaceC1469b ld.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return new a(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, rVar);
    }

    @fg.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> f(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> g(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, ld.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.P();
        return new e(iVarArr, pVar);
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> h(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @InterfaceC1469b ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        kotlinx.coroutines.flow.i[] iVarArr = (kotlinx.coroutines.flow.i[]) kotlin.collections.w.V5(iterable).toArray(new kotlinx.coroutines.flow.i[0]);
        kotlin.jvm.internal.l0.P();
        return new h0(new r(iVarArr, qVar, null));
    }

    @fg.l
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> i(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @fg.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @fg.l kotlinx.coroutines.flow.i<? extends T5> iVar5, @fg.l @InterfaceC1469b ld.u<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super k2>, ? extends Object> uVar) {
        return new h0(new p(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, uVar));
    }

    @fg.l
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> j(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @fg.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @fg.l @InterfaceC1469b ld.t<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super k2>, ? extends Object> tVar) {
        return new h0(new o(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, null, tVar));
    }

    @fg.l
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> k(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @fg.l @InterfaceC1469b ld.s<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super k2>, ? extends Object> sVar) {
        return new h0(new n(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, null, sVar));
    }

    @fg.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> l(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l @InterfaceC1469b ld.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super k2>, ? extends Object> rVar) {
        return new h0(new m(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    public static final <T, R> kotlinx.coroutines.flow.i<R> m(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @InterfaceC1469b ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.P();
        return new h0(new q(iVarArr, qVar, null));
    }

    private static final <T, R> kotlinx.coroutines.flow.i<R> n(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @InterfaceC1469b ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.P();
        return new h0(new s(iVarArr, qVar, null));
    }

    private static final <T, R> kotlinx.coroutines.flow.i<R> o(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, ld.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.P();
        return new t(iVarArr, pVar);
    }

    @fg.l
    @kd.i(name = "flowCombine")
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> p(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    @fg.l
    @kd.i(name = "flowCombineTransform")
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> q(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l @InterfaceC1469b ld.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super k2>, ? extends Object> rVar) {
        return new h0(new l(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    private static final <T> ld.a<T[]> r() {
        return v.f79995b;
    }

    @fg.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> s(@fg.l kotlinx.coroutines.flow.i<? extends T1> iVar, @fg.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @fg.l ld.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new k.b(iVar2, iVar, qVar);
    }
}
