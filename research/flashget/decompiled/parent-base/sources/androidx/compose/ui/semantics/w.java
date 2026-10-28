package androidx.compose.ui.semantics;

import androidx.compose.ui.text.t0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u0011\u0010\u0017\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0011\u0010\u0018\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0013\u001a\u0019\u0010\u001a\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010 \u001a\u00020\u0011*\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0004\b \u0010!\u001a\u0011\u0010\"\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\"\u0010\u0013\u001a9\u0010'\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u001a\u0010&\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b'\u0010(\u001a-\u0010*\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\b*\u0010+\u001a-\u0010,\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\b,\u0010+\u001aW\u00101\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000328\u0010&\u001a4\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b1\u00102\u001a1\u00103\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b3\u0010(\u001a3\u00104\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b4\u0010(\u001a3\u00106\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b6\u0010(\u001a3\u00107\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b7\u0010(\u001a3\u00108\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b8\u0010(\u001a-\u00109\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\b9\u0010+\u001a3\u0010:\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b:\u0010(\u001a8\u0010=\u001a\u00020\u0011*\u00020\u00102\u0006\u0010<\u001a\u00020;2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a/\u0010?\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)H\u0007¢\u0006\u0004\b?\u0010+\u001al\u0010D\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032M\u0010&\u001aI\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(B\u0012\u0013\u0012\u00110\r¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\r\u0018\u00010@¢\u0006\u0004\bD\u0010E\u001a-\u0010F\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bF\u0010+\u001a-\u0010G\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bG\u0010+\u001a-\u0010H\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bH\u0010+\u001a-\u0010I\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bI\u0010+\u001a-\u0010J\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bJ\u0010+\u001a-\u0010K\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bK\u0010+\u001a-\u0010L\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bL\u0010+\u001a-\u0010M\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bM\u0010+\u001a-\u0010N\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bN\u0010+\u001a-\u0010O\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bO\u0010+\u001a-\u0010P\u001a\u00020\u0011*\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)¢\u0006\u0004\bP\u0010+\"(\u0010T\u001a\u00020\u0003*\u00020\u00102\u0006\u0010Q\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010R\"\u0004\bS\u0010\u001b\"/\u0010Y\u001a\u00020\u0003*\u00020\u00102\u0006\u0010U\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0000\u0010R\"\u0004\bV\u0010\u001b*\u0004\bW\u0010X\"/\u0010`\u001a\u00020Z*\u00020\u00102\u0006\u0010U\u001a\u00020Z8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^*\u0004\b_\u0010X\"/\u0010d\u001a\u00020\u0003*\u00020\u00102\u0006\u0010U\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010R\"\u0004\bb\u0010\u001b*\u0004\bc\u0010X\"/\u0010k\u001a\u00020e*\u00020\u00102\u0006\u0010U\u001a\u00020e8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i*\u0004\bj\u0010X\"/\u0010q\u001a\u00020\r*\u00020\u00102\u0006\u0010U\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o*\u0004\bp\u0010X\"5\u0010v\u001a\u00020\r*\u00020\u00102\u0006\u0010U\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bt\u0010\u0013\u001a\u0004\br\u0010m\"\u0004\bs\u0010o*\u0004\bu\u0010X\"/\u0010z\u001a\u00020\r*\u00020\u00102\u0006\u0010U\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bw\u0010m\"\u0004\bx\u0010o*\u0004\by\u0010X\"0\u0010\u0080\u0001\u001a\u00020-*\u00020\u00102\u0006\u0010U\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~*\u0004\b\u007f\u0010X\"7\u0010\u0087\u0001\u001a\u00030\u0081\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030\u0081\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001*\u0005\b\u0086\u0001\u0010X\"7\u0010\u008b\u0001\u001a\u00030\u0081\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030\u0081\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001\"\u0006\b\u0089\u0001\u0010\u0085\u0001*\u0005\b\u008a\u0001\u0010X\"5\u0010\u0090\u0001\u001a\u00030\u008c\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030\u008c\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008d\u0001\u0010g\"\u0005\b\u008e\u0001\u0010i*\u0005\b\u008f\u0001\u0010X\"3\u0010\u0094\u0001\u001a\u00020\u0003*\u00020\u00102\u0006\u0010U\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0091\u0001\u0010R\"\u0005\b\u0092\u0001\u0010\u001b*\u0005\b\u0093\u0001\u0010X\"-\u0010\u0099\u0001\u001a\u000205*\u00020\u00102\u0006\u0010Q\u001a\u0002058F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001\"5\u0010\u009d\u0001\u001a\u000205*\u00020\u00102\u0006\u0010U\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009a\u0001\u0010\u0096\u0001\"\u0006\b\u009b\u0001\u0010\u0098\u0001*\u0005\b\u009c\u0001\u0010X\"3\u0010¡\u0001\u001a\u00020\r*\u00020\u00102\u0006\u0010U\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u009e\u0001\u0010m\"\u0005\b\u009f\u0001\u0010o*\u0005\b \u0001\u0010X\"5\u0010¥\u0001\u001a\u000205*\u00020\u00102\u0006\u0010U\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¢\u0001\u0010\u0096\u0001\"\u0006\b£\u0001\u0010\u0098\u0001*\u0005\b¤\u0001\u0010X\"7\u0010¬\u0001\u001a\u00030¦\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030¦\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001*\u0005\b«\u0001\u0010X\":\u0010±\u0001\u001a\u00020;*\u00020\u00102\u0006\u0010U\u001a\u00020;8G@GX\u0087\u008e\u0002¢\u0006\u001c\u0012\u0005\b¯\u0001\u0010\u0013\u001a\u0005\b\u00ad\u0001\u0010g\"\u0005\b®\u0001\u0010i*\u0005\b°\u0001\u0010X\"3\u0010µ\u0001\u001a\u00020\r*\u00020\u00102\u0006\u0010U\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b²\u0001\u0010m\"\u0005\b³\u0001\u0010o*\u0005\b´\u0001\u0010X\"7\u0010¼\u0001\u001a\u00030¶\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030¶\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001*\u0005\b»\u0001\u0010X\"7\u0010Ã\u0001\u001a\u00030½\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030½\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001*\u0005\bÂ\u0001\u0010X\"7\u0010Ê\u0001\u001a\u00030Ä\u0001*\u00020\u00102\u0007\u0010U\u001a\u00030Ä\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001*\u0005\bÉ\u0001\u0010X\"D\u0010Ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010Ë\u0001*\u00020\u00102\u000e\u0010U\u001a\n\u0012\u0005\u0012\u00030Ì\u00010Ë\u00018F@FX\u0086\u008e\u0002¢\u0006\u0016\u001a\u0005\b0\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001*\u0005\bÐ\u0001\u0010X\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Ò\u0001"}, d2 = {"T", "F1", "()Ljava/lang/Object;", "", "name", "Landroidx/compose/ui/semantics/y;", "a", "(Ljava/lang/String;)Landroidx/compose/ui/semantics/y;", "Lkotlin/Function2;", "mergePolicy", "b", "(Ljava/lang/String;Lld/p;)Landroidx/compose/ui/semantics/y;", "Lkotlin/v;", "", "Landroidx/compose/ui/semantics/a;", "c", "Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "k0", "(Landroidx/compose/ui/semantics/z;)V", "n", "o0", "P0", "m", "K0", "description", "q", "(Landroidx/compose/ui/semantics/z;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "l0", "(Landroidx/compose/ui/semantics/z;Lld/l;)V", "W0", "label", "", "Landroidx/compose/ui/text/n0;", "action", "Y", "(Landroidx/compose/ui/semantics/z;Ljava/lang/String;Lld/l;)V", "Lkotlin/Function0;", "w0", "(Landroidx/compose/ui/semantics/z;Ljava/lang/String;Lld/a;)V", "A0", "", "Lkotlin/r0;", "x", "y", "S0", "(Landroidx/compose/ui/semantics/z;Ljava/lang/String;Lld/p;)V", "U0", "i1", "Landroidx/compose/ui/text/e;", "t1", "x1", "D1", "e", "m0", "Landroidx/compose/ui/text/input/y;", "imeActionType", "y0", "(Landroidx/compose/ui/semantics/z;ILjava/lang/String;Lld/a;)V", "N0", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "n1", "(Landroidx/compose/ui/semantics/z;Ljava/lang/String;Lld/q;)V", "i", "k", "L0", "r", "g", "o", "Q0", "I0", "C0", "E0", "G0", "value", "(Landroidx/compose/ui/semantics/z;)Ljava/lang/String;", "a1", "contentDescription", "<set-?>", "q1", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/z;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/h;", "N", "(Landroidx/compose/ui/semantics/z;)Landroidx/compose/ui/semantics/h;", "k1", "(Landroidx/compose/ui/semantics/z;Landroidx/compose/ui/semantics/h;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "L", "h1", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/g;", "J", "(Landroidx/compose/ui/semantics/z;)I", "g1", "(Landroidx/compose/ui/semantics/z;I)V", "getLiveRegion$delegate", "liveRegion", "C", "(Landroidx/compose/ui/semantics/z;)Z", "d1", "(Landroidx/compose/ui/semantics/z;Z)V", "getFocused$delegate", "focused", "p0", "Z0", "q0", "isContainer$delegate", "isContainer", "u0", "A1", "isTraversalGroup$delegate", "isTraversalGroup", "g0", "(Landroidx/compose/ui/semantics/z;)F", "B1", "(Landroidx/compose/ui/semantics/z;F)V", "getTraversalIndex$delegate", "traversalIndex", "Landroidx/compose/ui/semantics/j;", "E", "(Landroidx/compose/ui/semantics/z;)Landroidx/compose/ui/semantics/j;", "e1", "(Landroidx/compose/ui/semantics/z;Landroidx/compose/ui/semantics/j;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "i0", "C1", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/i;", "P", "l1", "getRole$delegate", "role", "V", "r1", "getTestTag$delegate", "testTag", "X", "(Landroidx/compose/ui/semantics/z;)Landroidx/compose/ui/text/e;", "s1", "(Landroidx/compose/ui/semantics/z;Landroidx/compose/ui/text/e;)V", "text", "c0", "w1", "getTextSubstitution$delegate", "textSubstitution", "s0", "p1", "isShowingTextSubstitution$delegate", "isShowingTextSubstitution", "A", "c1", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/t0;", "a0", "(Landroidx/compose/ui/semantics/z;)J", "v1", "(Landroidx/compose/ui/semantics/z;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "G", "f1", "H", "getImeAction$delegate", "imeAction", "R", "m1", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/b;", "t", "(Landroidx/compose/ui/semantics/z;)Landroidx/compose/ui/semantics/b;", "X0", "(Landroidx/compose/ui/semantics/z;Landroidx/compose/ui/semantics/b;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/semantics/c;", "v", "(Landroidx/compose/ui/semantics/z;)Landroidx/compose/ui/semantics/c;", "Y0", "(Landroidx/compose/ui/semantics/z;Landroidx/compose/ui/semantics/c;)V", "getCollectionItemInfo$delegate", "collectionItemInfo", "Lp0/a;", "e0", "(Landroidx/compose/ui/semantics/z;)Lp0/a;", "z1", "(Landroidx/compose/ui/semantics/z;Lp0/a;)V", "getToggleableState$delegate", "toggleableState", "", "Landroidx/compose/ui/semantics/e;", "(Landroidx/compose/ui/semantics/z;)Ljava/util/List;", "b1", "(Landroidx/compose/ui/semantics/z;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f20408a = {v.a(w.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), v.a(w.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), v.a(w.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), v.a(w.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), v.a(w.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), v.a(w.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), v.a(w.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), v.a(w.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), v.a(w.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), v.a(w.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), v.a(w.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), v.a(w.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), v.a(w.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), v.a(w.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), v.a(w.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), v.a(w.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), v.a(w.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), v.a(w.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), v.a(w.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), v.a(w.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), v.a(w.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), v.a(w.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/v;", "", "T", "Landroidx/compose/ui/semantics/a;", "parentValue", "childValue", "a", "(Landroidx/compose/ui/semantics/a;Landroidx/compose/ui/semantics/a;)Landroidx/compose/ui/semantics/a;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1469:1\n*E\n"})
    public static final class a<T> extends n0 implements ld.p<androidx.compose.ui.semantics.a<T>, androidx.compose.ui.semantics.a<T>, androidx.compose.ui.semantics.a<T>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20409b = new a(2);

        public a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.semantics.a<T> invoke(@fg.m androidx.compose.ui.semantics.a<T> aVar, @fg.l androidx.compose.ui.semantics.a<T> aVar2) {
            String label;
            T a5;
            if (aVar == null || (label = aVar.getLabel()) == null) {
                label = aVar2.getLabel();
            }
            if (aVar == null || (a5 = aVar.a()) == null) {
                a5 = aVar2.a();
            }
            return new androidx.compose.ui.semantics.a<>(label, a5);
        }
    }

    static {
        t tVar = t.f20369a;
        tVar.A();
        tVar.w();
        tVar.u();
        tVar.t();
        tVar.g();
        tVar.s();
        tVar.s();
        tVar.G();
        tVar.i();
        tVar.H();
        tVar.x();
        tVar.B();
        tVar.E();
        tVar.r();
        tVar.e();
        tVar.D();
        tVar.j();
        tVar.z();
        tVar.a();
        tVar.b();
        tVar.F();
        k.f20321a.d();
    }

    @fg.l
    public static final androidx.compose.ui.text.e A(@fg.l z zVar) {
        y<androidx.compose.ui.text.e> e4 = t.f20369a.e();
        kotlin.reflect.o<Object> oVar = f20408a[14];
        e4.getClass();
        return (androidx.compose.ui.text.e) F1();
    }

    public static final void A0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.l(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final void A1(@fg.l z zVar, boolean z4) {
        y<Boolean> s4 = t.f20369a.s();
        kotlin.reflect.o<Object> oVar = f20408a[6];
        Boolean valueOf = Boolean.valueOf(z4);
        s4.getClass();
        zVar.b(s4, valueOf);
    }

    private static Object B(z zVar) {
        return t.f20369a.e();
    }

    public static /* synthetic */ void B0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        A0(zVar, str, aVar);
    }

    public static final void B1(@fg.l z zVar, float f4) {
        y<Float> G = t.f20369a.G();
        kotlin.reflect.o<Object> oVar = f20408a[7];
        Float valueOf = Float.valueOf(f4);
        G.getClass();
        zVar.b(G, valueOf);
    }

    public static final boolean C(@fg.l z zVar) {
        y<Boolean> g4 = t.f20369a.g();
        kotlin.reflect.o<Object> oVar = f20408a[4];
        g4.getClass();
        return ((Boolean) F1()).booleanValue();
    }

    public static final void C0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.m(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final void C1(@fg.l z zVar, @fg.l j jVar) {
        y<j> H = t.f20369a.H();
        kotlin.reflect.o<Object> oVar = f20408a[9];
        H.getClass();
        zVar.b(H, jVar);
    }

    private static Object D(z zVar) {
        return t.f20369a.g();
    }

    public static /* synthetic */ void D0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        C0(zVar, str, aVar);
    }

    public static final void D1(@fg.l z zVar, @fg.m String str, @fg.m ld.l<? super Boolean, Boolean> lVar) {
        zVar.b(k.f20321a.A(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    @fg.l
    public static final j E(@fg.l z zVar) {
        y<j> i4 = t.f20369a.i();
        kotlin.reflect.o<Object> oVar = f20408a[8];
        i4.getClass();
        return (j) F1();
    }

    public static final void E0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.n(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static /* synthetic */ void E1(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        D1(zVar, str, lVar);
    }

    private static Object F(z zVar) {
        return t.f20369a.i();
    }

    public static /* synthetic */ void F0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        E0(zVar, str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T F1() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @kotlin.k(message = "Pass the ImeAction to onImeAction instead.")
    public static final int G(@fg.l z zVar) {
        y<androidx.compose.ui.text.input.y> j4 = t.f20369a.j();
        kotlin.reflect.o<Object> oVar = f20408a[16];
        j4.getClass();
        return ((androidx.compose.ui.text.input.y) F1()).getValue();
    }

    public static final void G0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.o(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    @kotlin.k(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void H(z zVar) {
    }

    public static /* synthetic */ void H0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        G0(zVar, str, aVar);
    }

    private static Object I(z zVar) {
        return t.f20369a.j();
    }

    public static final void I0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.p(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final int J(@fg.l z zVar) {
        y<g> t4 = t.f20369a.t();
        kotlin.reflect.o<Object> oVar = f20408a[3];
        t4.getClass();
        return ((g) F1()).getValue();
    }

    public static /* synthetic */ void J0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        I0(zVar, str, aVar);
    }

    private static Object K(z zVar) {
        return t.f20369a.t();
    }

    public static final void K0(@fg.l z zVar) {
        zVar.b(t.f20369a.v(), k2.f75408a);
    }

    @fg.l
    public static final String L(@fg.l z zVar) {
        y<String> u4 = t.f20369a.u();
        kotlin.reflect.o<Object> oVar = f20408a[2];
        u4.getClass();
        return (String) F1();
    }

    public static final void L0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.q(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    private static Object M(z zVar) {
        return t.f20369a.u();
    }

    public static /* synthetic */ void M0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        L0(zVar, str, aVar);
    }

    @fg.l
    public static final h N(@fg.l z zVar) {
        y<h> w4 = t.f20369a.w();
        kotlin.reflect.o<Object> oVar = f20408a[1];
        w4.getClass();
        return (h) F1();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @x0(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void N0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.k(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    private static Object O(z zVar) {
        return t.f20369a.w();
    }

    public static /* synthetic */ void O0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        N0(zVar, str, aVar);
    }

    public static final int P(@fg.l z zVar) {
        y<i> x4 = t.f20369a.x();
        kotlin.reflect.o<Object> oVar = f20408a[10];
        x4.getClass();
        return ((i) F1()).getValue();
    }

    public static final void P0(@fg.l z zVar) {
        zVar.b(t.f20369a.q(), k2.f75408a);
    }

    private static Object Q(z zVar) {
        return t.f20369a.x();
    }

    public static final void Q0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.t(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final boolean R(@fg.l z zVar) {
        y<Boolean> z4 = t.f20369a.z();
        kotlin.reflect.o<Object> oVar = f20408a[17];
        z4.getClass();
        return ((Boolean) F1()).booleanValue();
    }

    public static /* synthetic */ void R0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        Q0(zVar, str, aVar);
    }

    private static Object S(z zVar) {
        return t.f20369a.z();
    }

    public static final void S0(@fg.l z zVar, @fg.m String str, @fg.m ld.p<? super Float, ? super Float, Boolean> pVar) {
        zVar.b(k.f20321a.u(), new androidx.compose.ui.semantics.a(str, pVar));
    }

    @fg.l
    public static final String T(@fg.l z zVar) {
        y<String> A = t.f20369a.A();
        kotlin.reflect.o<Object> oVar = f20408a[0];
        A.getClass();
        return (String) F1();
    }

    public static /* synthetic */ void T0(z zVar, String str, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        S0(zVar, str, pVar);
    }

    private static Object U(z zVar) {
        return t.f20369a.A();
    }

    public static final void U0(@fg.l z zVar, @fg.m String str, @fg.l ld.l<? super Integer, Boolean> lVar) {
        zVar.b(k.f20321a.v(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    @fg.l
    public static final String V(@fg.l z zVar) {
        y<String> B = t.f20369a.B();
        kotlin.reflect.o<Object> oVar = f20408a[11];
        B.getClass();
        return (String) F1();
    }

    public static /* synthetic */ void V0(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        U0(zVar, str, lVar);
    }

    private static Object W(z zVar) {
        return t.f20369a.B();
    }

    public static final void W0(@fg.l z zVar) {
        zVar.b(t.f20369a.y(), k2.f75408a);
    }

    @fg.l
    public static final androidx.compose.ui.text.e X(@fg.l z zVar) {
        return (androidx.compose.ui.text.e) F1();
    }

    public static final void X0(@fg.l z zVar, @fg.l b bVar) {
        y<b> a5 = t.f20369a.a();
        kotlin.reflect.o<Object> oVar = f20408a[18];
        a5.getClass();
        zVar.b(a5, bVar);
    }

    public static final void Y(@fg.l z zVar, @fg.m String str, @fg.m ld.l<? super List<androidx.compose.ui.text.n0>, Boolean> lVar) {
        zVar.b(k.f20321a.h(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    public static final void Y0(@fg.l z zVar, @fg.l c cVar) {
        y<c> b5 = t.f20369a.b();
        kotlin.reflect.o<Object> oVar = f20408a[19];
        b5.getClass();
        zVar.b(b5, cVar);
    }

    public static /* synthetic */ void Z(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        Y(zVar, str, lVar);
    }

    public static final void Z0(@fg.l z zVar, boolean z4) {
        y<Boolean> s4 = t.f20369a.s();
        kotlin.reflect.o<Object> oVar = f20408a[5];
        Boolean valueOf = Boolean.valueOf(z4);
        s4.getClass();
        zVar.b(s4, valueOf);
    }

    @fg.l
    public static final <T> y<T> a(@fg.l String str) {
        return new y<>(str, true);
    }

    public static final long a0(@fg.l z zVar) {
        y<t0> D = t.f20369a.D();
        kotlin.reflect.o<Object> oVar = f20408a[15];
        D.getClass();
        return ((t0) F1()).getPackedValue();
    }

    public static final void a1(@fg.l z zVar, @fg.l String str) {
        zVar.b(t.f20369a.c(), kotlin.collections.w.k(str));
    }

    @fg.l
    public static final <T> y<T> b(@fg.l String str, @fg.l ld.p<? super T, ? super T, ? extends T> pVar) {
        return new y<>(str, true, pVar);
    }

    private static Object b0(z zVar) {
        return t.f20369a.D();
    }

    public static final void b1(@fg.l z zVar, @fg.l List<e> list) {
        y<List<e>> d5 = k.f20321a.d();
        kotlin.reflect.o<Object> oVar = f20408a[21];
        d5.getClass();
        zVar.b(d5, list);
    }

    private static final <T extends kotlin.v<? extends Boolean>> y<androidx.compose.ui.semantics.a<T>> c(String str) {
        return b(str, a.f20409b);
    }

    @fg.l
    public static final androidx.compose.ui.text.e c0(@fg.l z zVar) {
        y<androidx.compose.ui.text.e> E = t.f20369a.E();
        kotlin.reflect.o<Object> oVar = f20408a[12];
        E.getClass();
        return (androidx.compose.ui.text.e) F1();
    }

    public static final void c1(@fg.l z zVar, @fg.l androidx.compose.ui.text.e eVar) {
        y<androidx.compose.ui.text.e> e4 = t.f20369a.e();
        kotlin.reflect.o<Object> oVar = f20408a[14];
        e4.getClass();
        zVar.b(e4, eVar);
    }

    private static Object d0(z zVar) {
        return t.f20369a.E();
    }

    public static final void d1(@fg.l z zVar, boolean z4) {
        y<Boolean> g4 = t.f20369a.g();
        kotlin.reflect.o<Object> oVar = f20408a[4];
        Boolean valueOf = Boolean.valueOf(z4);
        g4.getClass();
        zVar.b(g4, valueOf);
    }

    public static final void e(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.a(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    @fg.l
    public static final p0.a e0(@fg.l z zVar) {
        y<p0.a> F = t.f20369a.F();
        kotlin.reflect.o<Object> oVar = f20408a[20];
        F.getClass();
        return (p0.a) F1();
    }

    public static final void e1(@fg.l z zVar, @fg.l j jVar) {
        y<j> i4 = t.f20369a.i();
        kotlin.reflect.o<Object> oVar = f20408a[8];
        i4.getClass();
        zVar.b(i4, jVar);
    }

    public static /* synthetic */ void f(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        e(zVar, str, aVar);
    }

    private static Object f0(z zVar) {
        return t.f20369a.F();
    }

    @kotlin.k(message = "Pass the ImeAction to onImeAction instead.")
    public static final void f1(@fg.l z zVar, int i4) {
        y<androidx.compose.ui.text.input.y> j4 = t.f20369a.j();
        kotlin.reflect.o<Object> oVar = f20408a[16];
        androidx.compose.ui.text.input.y i5 = androidx.compose.ui.text.input.y.i(i4);
        j4.getClass();
        zVar.b(j4, i5);
    }

    public static final void g(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.b(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final float g0(@fg.l z zVar) {
        y<Float> G = t.f20369a.G();
        kotlin.reflect.o<Object> oVar = f20408a[7];
        G.getClass();
        return ((Number) F1()).floatValue();
    }

    public static final void g1(@fg.l z zVar, int i4) {
        y<g> t4 = t.f20369a.t();
        kotlin.reflect.o<Object> oVar = f20408a[3];
        g c5 = g.c(i4);
        t4.getClass();
        zVar.b(t4, c5);
    }

    public static /* synthetic */ void h(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        g(zVar, str, aVar);
    }

    private static Object h0(z zVar) {
        return t.f20369a.G();
    }

    public static final void h1(@fg.l z zVar, @fg.l String str) {
        y<String> u4 = t.f20369a.u();
        kotlin.reflect.o<Object> oVar = f20408a[2];
        u4.getClass();
        zVar.b(u4, str);
    }

    public static final void i(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.c(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    @fg.l
    public static final j i0(@fg.l z zVar) {
        y<j> H = t.f20369a.H();
        kotlin.reflect.o<Object> oVar = f20408a[9];
        H.getClass();
        return (j) F1();
    }

    public static final void i1(@fg.l z zVar, @fg.m String str, @fg.m ld.l<? super Float, Boolean> lVar) {
        zVar.b(k.f20321a.w(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    public static /* synthetic */ void j(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        i(zVar, str, aVar);
    }

    private static Object j0(z zVar) {
        return t.f20369a.H();
    }

    public static /* synthetic */ void j1(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        i1(zVar, str, lVar);
    }

    public static final void k(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.e(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final void k0(@fg.l z zVar) {
        zVar.b(t.f20369a.h(), k2.f75408a);
    }

    public static final void k1(@fg.l z zVar, @fg.l h hVar) {
        y<h> w4 = t.f20369a.w();
        kotlin.reflect.o<Object> oVar = f20408a[1];
        w4.getClass();
        zVar.b(w4, hVar);
    }

    public static /* synthetic */ void l(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        k(zVar, str, aVar);
    }

    public static final void l0(@fg.l z zVar, @fg.l ld.l<Object, Integer> lVar) {
        zVar.b(t.f20369a.k(), lVar);
    }

    public static final void l1(@fg.l z zVar, int i4) {
        y<i> x4 = t.f20369a.x();
        kotlin.reflect.o<Object> oVar = f20408a[10];
        i h4 = i.h(i4);
        x4.getClass();
        zVar.b(x4, h4);
    }

    public static final void m(@fg.l z zVar) {
        zVar.b(t.f20369a.p(), k2.f75408a);
    }

    public static final void m0(@fg.l z zVar, @fg.m String str, @fg.m ld.l<? super androidx.compose.ui.text.e, Boolean> lVar) {
        zVar.b(k.f20321a.i(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    public static final void m1(@fg.l z zVar, boolean z4) {
        y<Boolean> z5 = t.f20369a.z();
        kotlin.reflect.o<Object> oVar = f20408a[17];
        Boolean valueOf = Boolean.valueOf(z4);
        z5.getClass();
        zVar.b(z5, valueOf);
    }

    public static final void n(@fg.l z zVar) {
        zVar.b(t.f20369a.d(), k2.f75408a);
    }

    public static /* synthetic */ void n0(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        m0(zVar, str, lVar);
    }

    public static final void n1(@fg.l z zVar, @fg.m String str, @fg.m ld.q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        zVar.b(k.f20321a.x(), new androidx.compose.ui.semantics.a(str, qVar));
    }

    public static final void o(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.f(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    @androidx.compose.ui.k
    public static final void o0(@fg.l z zVar) {
        zVar.b(t.f20369a.l(), k2.f75408a);
    }

    public static /* synthetic */ void o1(z zVar, String str, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        n1(zVar, str, qVar);
    }

    public static /* synthetic */ void p(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        o(zVar, str, aVar);
    }

    public static final boolean p0(@fg.l z zVar) {
        y<Boolean> s4 = t.f20369a.s();
        kotlin.reflect.o<Object> oVar = f20408a[5];
        s4.getClass();
        return ((Boolean) F1()).booleanValue();
    }

    public static final void p1(@fg.l z zVar, boolean z4) {
        y<Boolean> r4 = t.f20369a.r();
        kotlin.reflect.o<Object> oVar = f20408a[13];
        Boolean valueOf = Boolean.valueOf(z4);
        r4.getClass();
        zVar.b(r4, valueOf);
    }

    public static final void q(@fg.l z zVar, @fg.l String str) {
        zVar.b(t.f20369a.f(), str);
    }

    @kotlin.k(message = "Use `isTraversalGroup` instead.", replaceWith = @x0(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void q0(z zVar) {
    }

    public static final void q1(@fg.l z zVar, @fg.l String str) {
        y<String> A = t.f20369a.A();
        kotlin.reflect.o<Object> oVar = f20408a[0];
        A.getClass();
        zVar.b(A, str);
    }

    public static final void r(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.g(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    private static Object r0(z zVar) {
        return t.f20369a.s();
    }

    public static final void r1(@fg.l z zVar, @fg.l String str) {
        y<String> B = t.f20369a.B();
        kotlin.reflect.o<Object> oVar = f20408a[11];
        B.getClass();
        zVar.b(B, str);
    }

    public static /* synthetic */ void s(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        r(zVar, str, aVar);
    }

    public static final boolean s0(@fg.l z zVar) {
        y<Boolean> r4 = t.f20369a.r();
        kotlin.reflect.o<Object> oVar = f20408a[13];
        r4.getClass();
        return ((Boolean) F1()).booleanValue();
    }

    public static final void s1(@fg.l z zVar, @fg.l androidx.compose.ui.text.e eVar) {
        zVar.b(t.f20369a.C(), kotlin.collections.w.k(eVar));
    }

    @fg.l
    public static final b t(@fg.l z zVar) {
        y<b> a5 = t.f20369a.a();
        kotlin.reflect.o<Object> oVar = f20408a[18];
        a5.getClass();
        return (b) F1();
    }

    private static Object t0(z zVar) {
        return t.f20369a.r();
    }

    public static final void t1(@fg.l z zVar, @fg.m String str, @fg.m ld.l<? super androidx.compose.ui.text.e, Boolean> lVar) {
        zVar.b(k.f20321a.y(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    private static Object u(z zVar) {
        return t.f20369a.a();
    }

    public static final boolean u0(@fg.l z zVar) {
        y<Boolean> s4 = t.f20369a.s();
        kotlin.reflect.o<Object> oVar = f20408a[6];
        s4.getClass();
        return ((Boolean) F1()).booleanValue();
    }

    public static /* synthetic */ void u1(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        t1(zVar, str, lVar);
    }

    @fg.l
    public static final c v(@fg.l z zVar) {
        y<c> b5 = t.f20369a.b();
        kotlin.reflect.o<Object> oVar = f20408a[19];
        b5.getClass();
        return (c) F1();
    }

    private static Object v0(z zVar) {
        return t.f20369a.s();
    }

    public static final void v1(@fg.l z zVar, long j4) {
        y<t0> D = t.f20369a.D();
        kotlin.reflect.o<Object> oVar = f20408a[15];
        t0 b5 = t0.b(j4);
        D.getClass();
        zVar.b(D, b5);
    }

    private static Object w(z zVar) {
        return t.f20369a.b();
    }

    public static final void w0(@fg.l z zVar, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(k.f20321a.j(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static final void w1(@fg.l z zVar, @fg.l androidx.compose.ui.text.e eVar) {
        y<androidx.compose.ui.text.e> E = t.f20369a.E();
        kotlin.reflect.o<Object> oVar = f20408a[12];
        E.getClass();
        zVar.b(E, eVar);
    }

    @fg.l
    public static final String x(@fg.l z zVar) {
        return (String) F1();
    }

    public static /* synthetic */ void x0(z zVar, String str, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        w0(zVar, str, aVar);
    }

    public static final void x1(@fg.l z zVar, @fg.m String str, @fg.m ld.l<? super androidx.compose.ui.text.e, Boolean> lVar) {
        zVar.b(k.f20321a.z(), new androidx.compose.ui.semantics.a(str, lVar));
    }

    @fg.l
    public static final List<e> y(@fg.l z zVar) {
        y<List<e>> d5 = k.f20321a.d();
        kotlin.reflect.o<Object> oVar = f20408a[21];
        d5.getClass();
        return (List) F1();
    }

    public static final void y0(@fg.l z zVar, int i4, @fg.m String str, @fg.m ld.a<Boolean> aVar) {
        zVar.b(t.f20369a.j(), androidx.compose.ui.text.input.y.i(i4));
        zVar.b(k.f20321a.k(), new androidx.compose.ui.semantics.a(str, aVar));
    }

    public static /* synthetic */ void y1(z zVar, String str, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        x1(zVar, str, lVar);
    }

    private static Object z(z zVar) {
        return k.f20321a.d();
    }

    public static /* synthetic */ void z0(z zVar, int i4, String str, ld.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        y0(zVar, i4, str, aVar);
    }

    public static final void z1(@fg.l z zVar, @fg.l p0.a aVar) {
        y<p0.a> F = t.f20369a.F();
        kotlin.reflect.o<Object> oVar = f20408a[20];
        F.getClass();
        zVar.b(F, aVar);
    }
}
