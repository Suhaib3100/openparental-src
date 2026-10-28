package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0003o\u0088\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108JS\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J]\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010.JA\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bC\u0010DJ%\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bE\u0010LJ-\u0010M\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bM\u0010NJ?\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bS\u0010TJ-\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bU\u0010VJA\u0010W\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bW\u0010PJ?\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\\J[\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J#\u0010a\u001a\u00020\u00132\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\ba\u0010bJW\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010eJ_\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bf\u0010gJ£\u0001\u0010o\u001a\u00020m2\u0081\u0001\u0010n\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(k\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(l\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020m0h2\u0006\u0010l\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0004H\u0000¢\u0006\u0004\bq\u0010`J\u0017\u0010r\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\br\u0010\u0015J\u0017\u0010s\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bu\u0010tJ#\u0010v\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\bv\u0010GJ%\u0010x\u001a\u00020\u00132\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bx\u0010yJ'\u0010z\u001a\u0004\u0018\u00018\u00012\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{JQ\u0010|\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b|\u0010}J;\u0010~\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b~\u0010\u007fJP\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J6\u0010\u0082\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JJ\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J>\u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JP\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010w\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0005\b\u0001\u0010\u0081\u0001J\u0096\u0001\u0010\u0088\u0001\u001a\u00020m2\u0081\u0001\u0010n\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(k\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(l\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020m0hH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010]R\u0017\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010]R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R8\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000f\u0010\u008c\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u000f\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0090\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Lf0/f;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Lf0/f;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "d", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "e", "positionMask", "", "u", "(I)Z", "keyIndex", "w", "(I)Ljava/lang/Object;", "a0", "key", "value", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "owner", "E", "(ILjava/lang/Object;Ljava/lang/Object;Lf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "Z", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "mutator", "P", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "nodeIndex", "newNode", "Y", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "O", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;Lf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "W", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "M", "(IILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "newKeyHash", "newKey", "newValue", "shift", "f", "(IIILjava/lang/Object;Ljava/lang/Object;ILf0/f;)[Ljava/lang/Object;", "y", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "F", "(IIILjava/lang/Object;Ljava/lang/Object;ILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "x", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "L", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "i", "m", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "D", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "h", "(Ljava/lang/Object;)Z", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "z", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "k", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "B", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "C", "otherNode", "Lf0/b;", "intersectionCounter", "A", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;Lf0/b;Lf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "I", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;IILf0/b;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "g", "()I", "o", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)Z", "targetNode", "X", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "N", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;IILf0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "Lkotlin/Function5;", "Lkotlin/r0;", "name", "node", "hash", "Lkotlin/k2;", "visitor", "a", "(Lld/s;II)V", "p", "t", "q", "(I)I", "R", "Q", "keyHash", "n", "(ILjava/lang/Object;I)Z", "r", "(ILjava/lang/Object;I)Ljava/lang/Object;", "H", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;ILf0/b;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "S", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "G", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "T", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "J", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "U", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "b", "(Lld/s;)V", "c", "Lf0/f;", "<set-?>", "[Ljava/lang/Object;", "s", "()[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,898:1\n10#2,9:899\n10#2,9:908\n10#2,9:917\n83#3:926\n1#4:927\n26#5:928\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n629#1:899,9\n647#1:908,9\n651#1:917,9\n699#1:926\n699#1:927\n896#1:928\n*E\n"})
/* loaded from: classes.dex */
public final class u<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16273f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int dataMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nodeMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final f0.f ownedBy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] buffer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final u f16274g = new u(0, 0, new Object[0], null);

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$a;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final u a() {
            return u.f16274g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJH\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\nH\u0086\b¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;I)V", "Lkotlin/Function1;", "operation", "c", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "a", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "d", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)V", "b", "I", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,898:1\n1#2:899\n*E\n"})
    public static final class b<K, V> {

        /* renamed from: c, reason: collision with root package name */
        public static final int f16279c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private u<K, V> node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int sizeDelta;

        public b(@fg.l u<K, V> uVar, int i4) {
            this.node = uVar;
            this.sizeDelta = i4;
        }

        @fg.l
        public final u<K, V> a() {
            return this.node;
        }

        /* renamed from: b, reason: from getter */
        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @fg.l
        public final b<K, V> c(@fg.l ld.l<? super u<K, V>, u<K, V>> operation) {
            this.node = operation.invoke(this.node);
            return this;
        }

        public final void d(@fg.l u<K, V> uVar) {
            this.node = uVar;
        }
    }

    public u(int i4, int i5, @fg.l Object[] objArr, @fg.m f0.f fVar) {
        this.dataMap = i4;
        this.nodeMap = i5;
        this.ownedBy = fVar;
        this.buffer = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u<K, V> A(u<K, V> otherNode, f0.b intersectionCounter, f0.f owner) {
        int i4 = otherNode.nodeMap;
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        l0.o(copyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, otherNode.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (h(otherNode.buffer[first])) {
                    intersectionCounter.f(intersectionCounter.d() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    copyOf[length] = objArr2[first];
                    copyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == copyOf.length) {
            return new u<>(0, 0, copyOf, owner);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        l0.o(copyOf2, "copyOf(this, newSize)");
        return new u<>(0, 0, copyOf2, owner);
    }

    private final u<K, V> B(K key, f<K, V> mutator) {
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!l0.g(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return D(first, mutator);
        }
        return this;
    }

    private final u<K, V> C(K key, V value, f<K, V> mutator) {
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!l0.g(key, this.buffer[first]) || !l0.g(value, a0(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return D(first, mutator);
                }
            }
        }
        return this;
    }

    private final u<K, V> D(int i4, f<K, V> mutator) {
        Object[] h4;
        Object[] h5;
        mutator.r(mutator.getSize() - 1);
        mutator.p(a0(i4));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            h4 = y.h(this.buffer, i4);
            return new u<>(0, 0, h4, mutator.getOwnership());
        }
        h5 = y.h(this.buffer, i4);
        this.buffer = h5;
        return this;
    }

    private final u<K, V> E(int positionMask, K key, V value, f0.f owner) {
        Object[] g4;
        Object[] g5;
        int q4 = q(positionMask);
        if (this.ownedBy != owner) {
            g4 = y.g(this.buffer, q4, key, value);
            return new u<>(positionMask | this.dataMap, this.nodeMap, g4, owner);
        }
        g5 = y.g(this.buffer, q4, key, value);
        this.buffer = g5;
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    private final u<K, V> F(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, f0.f owner) {
        if (this.ownedBy != owner) {
            return new u<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, f(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = f(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u<K, V> I(u<K, V> otherNode, int positionMask, int shift, f0.b intersectionCounter, f<K, V> mutator) {
        if (u(positionMask)) {
            u<K, V> uVar = (u<K, V>) Q(R(positionMask));
            if (otherNode.u(positionMask)) {
                return uVar.H(otherNode.Q(otherNode.R(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.t(positionMask)) {
                return uVar;
            }
            int q4 = otherNode.q(positionMask);
            Object obj = otherNode.buffer[q4];
            V a02 = otherNode.a0(q4);
            int size = mutator.getSize();
            u<K, V> G = uVar.G(obj != null ? obj.hashCode() : 0, obj, a02, shift + 5, mutator);
            if (mutator.getSize() != size) {
                return G;
            }
            intersectionCounter.f(intersectionCounter.d() + 1);
            return G;
        }
        if (!otherNode.u(positionMask)) {
            int q5 = q(positionMask);
            Object obj2 = this.buffer[q5];
            Object a03 = a0(q5);
            int q6 = otherNode.q(positionMask);
            Object obj3 = otherNode.buffer[q6];
            return x(obj2 != null ? obj2.hashCode() : 0, obj2, a03, obj3 != null ? obj3.hashCode() : 0, obj3, otherNode.a0(q6), shift + 5, mutator.getOwnership());
        }
        u<K, V> Q = otherNode.Q(otherNode.R(positionMask));
        if (t(positionMask)) {
            int q7 = q(positionMask);
            Object obj4 = this.buffer[q7];
            int i4 = shift + 5;
            if (!Q.n(obj4 != null ? obj4.hashCode() : 0, obj4, i4)) {
                return Q.G(obj4 != null ? obj4.hashCode() : 0, obj4, a0(q7), i4, mutator);
            }
            intersectionCounter.f(intersectionCounter.d() + 1);
        }
        return Q;
    }

    private final u<K, V> L(int keyIndex, int positionMask, f<K, V> mutator) {
        Object[] h4;
        Object[] h5;
        mutator.r(mutator.getSize() - 1);
        mutator.p(a0(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            h4 = y.h(this.buffer, keyIndex);
            return new u<>(positionMask ^ this.dataMap, this.nodeMap, h4, mutator.getOwnership());
        }
        h5 = y.h(this.buffer, keyIndex);
        this.buffer = h5;
        this.dataMap ^= positionMask;
        return this;
    }

    private final u<K, V> M(int nodeIndex, int positionMask, f0.f owner) {
        Object[] i4;
        Object[] i5;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            i4 = y.i(objArr, nodeIndex);
            return new u<>(this.dataMap, positionMask ^ this.nodeMap, i4, owner);
        }
        i5 = y.i(objArr, nodeIndex);
        this.buffer = i5;
        this.nodeMap ^= positionMask;
        return this;
    }

    private final u<K, V> N(u<K, V> targetNode, u<K, V> newNode, int nodeIndex, int positionMask, f0.f owner) {
        return newNode == null ? M(nodeIndex, positionMask, owner) : (this.ownedBy == owner || targetNode != newNode) ? O(nodeIndex, newNode, owner) : this;
    }

    private final u<K, V> O(int nodeIndex, u<K, V> newNode, f0.f owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[nodeIndex] = newNode;
        return new u<>(this.dataMap, this.nodeMap, copyOf, owner);
    }

    private final u<K, V> P(int keyIndex, V value, f<K, V> mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.m(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[keyIndex + 1] = value;
        return new u<>(this.dataMap, this.nodeMap, copyOf, mutator.getOwnership());
    }

    private final u<K, V> V(int keyIndex, int positionMask) {
        Object[] h4;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        h4 = y.h(objArr, keyIndex);
        return new u<>(positionMask ^ this.dataMap, this.nodeMap, h4, null);
    }

    private final u<K, V> W(int nodeIndex, int positionMask) {
        Object[] i4;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        i4 = y.i(objArr, nodeIndex);
        return new u<>(this.dataMap, positionMask ^ this.nodeMap, i4, null);
    }

    private final u<K, V> X(u<K, V> targetNode, u<K, V> newNode, int nodeIndex, int positionMask) {
        return newNode == null ? W(nodeIndex, positionMask) : targetNode != newNode ? Y(nodeIndex, positionMask, newNode) : this;
    }

    private final u<K, V> Y(int nodeIndex, int positionMask, u<K, V> newNode) {
        Object[] k4;
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            l0.o(copyOf, "copyOf(this, newSize)");
            copyOf[nodeIndex] = newNode;
            return new u<>(this.dataMap, this.nodeMap, copyOf, null);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        k4 = y.k(this.buffer, nodeIndex, q(positionMask), objArr[0], objArr[1]);
        return new u<>(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, k4, null);
    }

    private final u<K, V> Z(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[keyIndex + 1] = value;
        return new u<>(this.dataMap, this.nodeMap, copyOf, null);
    }

    private final void a(ld.s<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, k2> visitor, int hash, int shift) {
        visitor.a0(this, Integer.valueOf(shift), Integer.valueOf(hash), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i4 = this.nodeMap;
        while (i4 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i4);
            Q(R(lowestOneBit)).a(visitor, (Integer.numberOfTrailingZeros(lowestOneBit) << shift) + hash, shift + 5);
            i4 -= lowestOneBit;
        }
    }

    private final V a0(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    private final b<K, V> d() {
        return new b<>(this, 1);
    }

    private final b<K, V> e() {
        return new b<>(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object[] f(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, f0.f owner) {
        Object[] j4;
        Object obj = this.buffer[keyIndex];
        j4 = y.j(this.buffer, keyIndex, R(positionMask) + 1, x(obj != null ? obj.hashCode() : 0, obj, a0(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
        return j4;
    }

    private final int g() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i4 = bitCount * 2; i4 < length; i4++) {
            bitCount += Q(i4).g();
        }
        return bitCount;
    }

    private final boolean h(K key) {
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!l0.g(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    private final V i(K key) {
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!l0.g(key, this.buffer[first])) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return a0(first);
    }

    private final b<K, V> j(K key, V value) {
        Object[] g4;
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!l0.g(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            if (value == a0(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            l0.o(copyOf, "copyOf(this, size)");
            copyOf[first + 1] = value;
            return new u(0, 0, copyOf, null).e();
        }
        g4 = y.g(this.buffer, 0, key, value);
        return new u(0, 0, g4, null).d();
    }

    private final u<K, V> k(K key) {
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!l0.g(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return m(first);
        }
        return this;
    }

    private final u<K, V> l(K key, V value) {
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!l0.g(key, this.buffer[first]) || !l0.g(value, a0(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step;
                } else {
                    return m(first);
                }
            }
        }
        return this;
    }

    private final u<K, V> m(int i4) {
        Object[] h4;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        h4 = y.h(objArr, i4);
        return new u<>(0, 0, h4, null);
    }

    private final boolean o(u<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.buffer[i4] != otherNode.buffer[i4]) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    private final u<K, V> v(int positionMask, K key, V value) {
        Object[] g4;
        g4 = y.g(this.buffer, q(positionMask), key, value);
        return new u<>(positionMask | this.dataMap, this.nodeMap, g4, null);
    }

    private final K w(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    private final u<K, V> x(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, f0.f owner) {
        if (shift > 30) {
            return new u<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int f4 = y.f(keyHash1, shift);
        int f5 = y.f(keyHash2, shift);
        if (f4 != f5) {
            return new u<>((1 << f4) | (1 << f5), 0, f4 < f5 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new u<>(0, 1 << f4, new Object[]{x(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final u<K, V> y(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new u<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, f(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null), null);
    }

    private final u<K, V> z(K key, V value, f<K, V> mutator) {
        Object[] g4;
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.buffer.length), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!l0.g(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            mutator.p(a0(first));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[first + 1] = value;
                return this;
            }
            mutator.m(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            l0.o(copyOf, "copyOf(this, size)");
            copyOf[first + 1] = value;
            return new u<>(0, 0, copyOf, mutator.getOwnership());
        }
        mutator.r(mutator.getSize() + 1);
        g4 = y.g(this.buffer, 0, key, value);
        return new u<>(0, 0, g4, mutator.getOwnership());
    }

    @fg.l
    public final u<K, V> G(int keyHash, K key, V value, int shift, @fg.l f<K, V> mutator) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            if (l0.g(key, this.buffer[q4])) {
                mutator.p(a0(q4));
                return a0(q4) == value ? this : P(q4, value, mutator);
            }
            mutator.r(mutator.getSize() + 1);
            return F(q4, f4, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (!u(f4)) {
            mutator.r(mutator.getSize() + 1);
            return E(f4, key, value, mutator.getOwnership());
        }
        int R = R(f4);
        u<K, V> Q = Q(R);
        u<K, V> z4 = shift == 30 ? Q.z(key, value, mutator) : Q.G(keyHash, key, value, shift + 5, mutator);
        return Q == z4 ? this : O(R, z4, mutator.getOwnership());
    }

    @fg.l
    public final u<K, V> H(@fg.l u<K, V> otherNode, int shift, @fg.l f0.b intersectionCounter, @fg.l f<K, V> mutator) {
        if (this == otherNode) {
            intersectionCounter.e(g());
            return this;
        }
        if (shift > 30) {
            return A(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i4 = this.nodeMap | otherNode.nodeMap;
        int i5 = this.dataMap;
        int i6 = otherNode.dataMap;
        int i7 = (i5 ^ i6) & (~i4);
        int i10 = i5 & i6;
        int i11 = i7;
        while (i10 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i10);
            if (l0.g(this.buffer[q(lowestOneBit)], otherNode.buffer[otherNode.q(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i4 |= lowestOneBit;
            }
            i10 ^= lowestOneBit;
        }
        if ((i4 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        u<K, V> uVar = (l0.g(this.ownedBy, mutator.getOwnership()) && this.dataMap == i11 && this.nodeMap == i4) ? this : new u<>(i11, i4, new Object[Integer.bitCount(i4) + (Integer.bitCount(i11) * 2)], null);
        int i12 = 0;
        int i13 = i4;
        int i14 = 0;
        while (i13 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i13);
            uVar.buffer[(r5.length - 1) - i14] = I(otherNode, lowestOneBit2, shift, intersectionCounter, mutator);
            i14++;
            i13 ^= lowestOneBit2;
        }
        while (i11 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i11);
            int i15 = i12 * 2;
            if (otherNode.t(lowestOneBit3)) {
                int q4 = otherNode.q(lowestOneBit3);
                Object[] objArr = uVar.buffer;
                objArr[i15] = otherNode.buffer[q4];
                objArr[i15 + 1] = otherNode.a0(q4);
                if (t(lowestOneBit3)) {
                    intersectionCounter.f(intersectionCounter.d() + 1);
                }
            } else {
                int q5 = q(lowestOneBit3);
                Object[] objArr2 = uVar.buffer;
                objArr2[i15] = this.buffer[q5];
                objArr2[i15 + 1] = a0(q5);
            }
            i12++;
            i11 ^= lowestOneBit3;
        }
        return o(uVar) ? this : otherNode.o(uVar) ? otherNode : uVar;
    }

    @fg.m
    public final u<K, V> J(int keyHash, K key, int shift, @fg.l f<K, V> mutator) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            return l0.g(key, this.buffer[q4]) ? L(q4, f4, mutator) : this;
        }
        if (!u(f4)) {
            return this;
        }
        int R = R(f4);
        u<K, V> Q = Q(R);
        return N(Q, shift == 30 ? Q.B(key, mutator) : Q.J(keyHash, key, shift + 5, mutator), R, f4, mutator.getOwnership());
    }

    @fg.m
    public final u<K, V> K(int keyHash, K key, V value, int shift, @fg.l f<K, V> mutator) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            return (l0.g(key, this.buffer[q4]) && l0.g(value, a0(q4))) ? L(q4, f4, mutator) : this;
        }
        if (!u(f4)) {
            return this;
        }
        int R = R(f4);
        u<K, V> Q = Q(R);
        return N(Q, shift == 30 ? Q.C(key, value, mutator) : Q.K(keyHash, key, value, shift + 5, mutator), R, f4, mutator.getOwnership());
    }

    @fg.l
    public final u<K, V> Q(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (u) obj;
    }

    public final int R(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    @fg.m
    public final b<K, V> S(int keyHash, K key, V value, int shift) {
        b<K, V> S;
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            if (!l0.g(key, this.buffer[q4])) {
                return y(q4, f4, keyHash, key, value, shift).d();
            }
            if (a0(q4) == value) {
                return null;
            }
            return Z(q4, value).e();
        }
        if (!u(f4)) {
            return v(f4, key, value).d();
        }
        int R = R(f4);
        u<K, V> Q = Q(R);
        if (shift == 30) {
            S = Q.j(key, value);
            if (S == null) {
                return null;
            }
        } else {
            S = Q.S(keyHash, key, value, shift + 5);
            if (S == null) {
                return null;
            }
        }
        S.d(Y(R, f4, S.a()));
        return S;
    }

    @fg.m
    public final u<K, V> T(int keyHash, K key, int shift) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            return l0.g(key, this.buffer[q4]) ? V(q4, f4) : this;
        }
        if (!u(f4)) {
            return this;
        }
        int R = R(f4);
        u<K, V> Q = Q(R);
        return X(Q, shift == 30 ? Q.k(key) : Q.T(keyHash, key, shift + 5), R, f4);
    }

    @fg.m
    public final u<K, V> U(int keyHash, K key, V value, int shift) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            return (l0.g(key, this.buffer[q4]) && l0.g(value, a0(q4))) ? V(q4, f4) : this;
        }
        if (!u(f4)) {
            return this;
        }
        int R = R(f4);
        u<K, V> Q = Q(R);
        return X(Q, shift == 30 ? Q.l(key, value) : Q.U(keyHash, key, value, shift + 5), R, f4);
    }

    public final void b(@fg.l ld.s<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, k2> visitor) {
        a(visitor, 0, 0);
    }

    public final boolean n(int keyHash, K key, int shift) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            return l0.g(key, this.buffer[q(f4)]);
        }
        if (!u(f4)) {
            return false;
        }
        u<K, V> Q = Q(R(f4));
        return shift == 30 ? Q.h(key) : Q.n(keyHash, key, shift + 5);
    }

    public final int p() {
        return Integer.bitCount(this.dataMap);
    }

    public final int q(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    @fg.m
    public final V r(int keyHash, K key, int shift) {
        int f4 = 1 << y.f(keyHash, shift);
        if (t(f4)) {
            int q4 = q(f4);
            if (l0.g(key, this.buffer[q4])) {
                return a0(q4);
            }
            return null;
        }
        if (!u(f4)) {
            return null;
        }
        u<K, V> Q = Q(R(f4));
        return shift == 30 ? Q.i(key) : Q.r(keyHash, key, shift + 5);
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean t(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    public u(int i4, int i5, @fg.l Object[] objArr) {
        this(i4, i5, objArr, null);
    }
}
