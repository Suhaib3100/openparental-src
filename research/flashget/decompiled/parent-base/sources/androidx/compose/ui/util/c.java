package androidx.compose.ui.util;

import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: ListUtils.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001aE\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001aA\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a_\u0010\u001f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0010\b\u0002\u0010\u001d*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00028\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b!\u0010\u0012\u001aE\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010\u0019\u001ab\u0010(\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010#\u001a\u00028\u00012'\u0010'\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010)\u001a`\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u0017\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b+\u0010,\u001ab\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012)\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010,\u001aQ\u0010.\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010/\u001aQ\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010,\u001a^\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u00101\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012'\u0010'\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u00103\u001a\u0083\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u00104*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u000126\u0010\u0017\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00020\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001d\u00107\u001aM\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b8\u0010\u0019\u001ag\u0010@\u001a\u00020?\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u0002092\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\u0002¢\u0006\u0004\b@\u0010A\u001aK\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010B*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bC\u0010\u0019\u001aQ\u0010D\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010\u0012\u001aQ\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010E0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bF\u0010\u0019\u001a)\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020G*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\bH\u0010I\u001a?\u0010J\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bJ\u0010\u0012\u001a\u007f\u0010N\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u00102*\u00060Kj\u0002`L*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010M\u001a\u00028\u00012\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u0002092\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\u0002H\u0002¢\u0006\u0004\bN\u0010O\u001a;\u00106\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060Kj\u0002`L2\u0006\u0010P\u001a\u00028\u00002\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\u0002H\u0002¢\u0006\u0004\b6\u0010Q¨\u0006R"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/k2;", "action", "k", "(Ljava/util/List;Lld/l;)V", "m", "Lkotlin/Function2;", "", "l", "(Ljava/util/List;Lld/p;)V", "", "predicate", "b", "(Ljava/util/List;Lld/l;)Z", "c", "h", "(Ljava/util/List;Lld/l;)Ljava/lang/Object;", "selector", "B", "(Ljava/util/List;Lld/l;)I", "R", "transform", "s", "(Ljava/util/List;Lld/l;)Ljava/util/List;", "", "x", "", "C", "destination", "w", "(Ljava/util/List;Ljava/util/Collection;Lld/l;)Ljava/util/Collection;", "r", "e", "initial", "Lkotlin/r0;", "name", "acc", "operation", "j", "(Ljava/util/List;Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "index", "t", "(Ljava/util/List;Lld/p;)Ljava/util/List;", "u", "y", "(Ljava/util/List;Lld/l;)Ljava/lang/Comparable;", "D", "S", "A", "(Ljava/util/List;Lld/p;)Ljava/lang/Object;", "V", "other", "a", "(Ljava/util/List;Ljava/util/List;Lld/p;)Ljava/util/List;", "v", "", "separator", "prefix", "postfix", "limit", "truncated", "", "p", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/String;", "K", "d", "z", "", "i", "", "f", "(Ljava/util/List;)Ljava/util/List;", "g", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "n", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/Appendable;", "element", "(Ljava/lang/Appendable;Ljava/lang/Object;Lld/l;)V", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n33#1,6:596\n33#1,6:602\n33#1,6:608\n33#1,6:614\n33#1,6:620\n33#1,6:626\n33#1,6:632\n33#1,6:638\n69#1,6:644\n69#1,4:650\n74#1:655\n33#1,6:656\n33#1,6:662\n33#1,6:668\n33#1,6:674\n33#1,6:680\n1#2:654\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:596,6\n102#1:602,6\n117#1:608,6\n134#1:614,6\n153#1:620,6\n201#1:626,6\n237#1:632,6\n258#1:638,6\n279#1:644,6\n300#1:650,4\n300#1:655\n418#1:656,6\n464#1:662,6\n510#1:668,6\n526#1:674,6\n545#1:680,6\n*E\n"})
/* loaded from: classes.dex */
public final class c {
    public static final <S, T extends S> S A(@l List<? extends T> list, @l p<? super S, ? super T, ? extends S> pVar) {
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s4 = (Object) w.B2(list);
        int J = w.J(list);
        int i4 = 1;
        if (1 <= J) {
            while (true) {
                s4 = pVar.invoke(s4, list.get(i4));
                if (i4 == J) {
                    break;
                }
                i4++;
            }
        }
        return s4;
    }

    public static final <T> int B(@l List<? extends T> list, @l ld.l<? super T, Integer> lVar) {
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += lVar.invoke(list.get(i5)).intValue();
        }
        return i4;
    }

    @l
    public static final <T, R, V> List<V> C(@l List<? extends T> list, @l List<? extends R> list2, @l p<? super T, ? super R, ? extends V> pVar) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(pVar.invoke(list.get(i4), list2.get(i4)));
        }
        return arrayList;
    }

    @l
    public static final <T, R> List<R> D(@l List<? extends T> list, @l p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() == 0 || list.size() == 1) {
            return j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        a0.c cVar = list.get(0);
        int J = w.J(list);
        while (i4 < J) {
            i4++;
            T t4 = list.get(i4);
            arrayList.add(pVar.invoke(cVar, t4));
            cVar = t4;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void a(Appendable appendable, T t4, ld.l<? super T, ? extends CharSequence> lVar) {
        if (lVar != null) {
            appendable.append(lVar.invoke(t4));
            return;
        }
        if (t4 == 0 ? true : t4 instanceof CharSequence) {
            appendable.append((CharSequence) t4);
        } else if (t4 instanceof Character) {
            appendable.append(((Character) t4).charValue());
        } else {
            appendable.append(String.valueOf(t4));
        }
    }

    public static final <T> boolean b(@l List<? extends T> list, @l ld.l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!lVar.invoke(list.get(i4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean c(@l List<? extends T> list, @l ld.l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (lVar.invoke(list.get(i4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final <T, K> List<T> d(@l List<? extends T> list, @l ld.l<? super T, ? extends K> lVar) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            if (hashSet.add(lVar.invoke(t4))) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @l
    public static final <T> List<T> e(@l List<? extends T> list, @l ld.l<? super T, Boolean> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            if (lVar.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @l
    public static final <T> List<T> f(@l List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            if (t4 != null) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T g(@l List<? extends T> list, @l ld.l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            if (lVar.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @m
    public static final <T> T h(@l List<? extends T> list, @l ld.l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            if (lVar.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        return null;
    }

    @l
    public static final <T, R> List<R> i(@l List<? extends T> list, @l ld.l<? super T, ? extends Iterable<? extends R>> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            w.q0(arrayList, lVar.invoke(list.get(i4)));
        }
        return arrayList;
    }

    public static final <T, R> R j(@l List<? extends T> list, R r4, @l p<? super R, ? super T, ? extends R> pVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            r4 = pVar.invoke(r4, list.get(i4));
        }
        return r4;
    }

    public static final <T> void k(@l List<? extends T> list, @l ld.l<? super T, k2> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            lVar.invoke(list.get(i4));
        }
    }

    public static final <T> void l(@l List<? extends T> list, @l p<? super Integer, ? super T, k2> pVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(i4), list.get(i4));
        }
    }

    public static final <T> void m(@l List<? extends T> list, @l ld.l<? super T, k2> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            lVar.invoke(list.get(size));
            if (i4 < 0) {
                return;
            } else {
                size = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A n(List<? extends T> list, A a5, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.l<? super T, ? extends CharSequence> lVar) {
        a5.append(charSequence2);
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            T t4 = list.get(i6);
            i5++;
            if (i5 > 1) {
                a5.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            a(a5, t4, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            a5.append(charSequence4);
        }
        a5.append(charSequence3);
        return a5;
    }

    @l
    public static final <T> String p(@l List<? extends T> list, @l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3, int i4, @l CharSequence charSequence4, @m ld.l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) n(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String q(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, ld.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return p(list, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @m
    public static final <T> T r(@l List<? extends T> list, @l ld.l<? super T, Boolean> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i4 = size - 1;
            T t4 = list.get(size);
            if (lVar.invoke(t4).booleanValue()) {
                return t4;
            }
            if (i4 < 0) {
                return null;
            }
            size = i4;
        }
    }

    @l
    public static final <T, R> List<R> s(@l List<? extends T> list, @l ld.l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(lVar.invoke(list.get(i4)));
        }
        return arrayList;
    }

    @l
    public static final <T, R> List<R> t(@l List<? extends T> list, @l p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(pVar.invoke(Integer.valueOf(i4), list.get(i4)));
        }
        return arrayList;
    }

    @l
    public static final <T, R> List<R> u(@l List<? extends T> list, @l p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            R invoke = pVar.invoke(Integer.valueOf(i4), list.get(i4));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @l
    public static final <T, R> List<R> v(@l List<? extends T> list, @l ld.l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            R invoke = lVar.invoke(list.get(i4));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @l
    public static final <T, R, C extends Collection<? super R>> C w(@l List<? extends T> list, @l C c5, @l ld.l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            c5.add(lVar.invoke(list.get(i4)));
        }
        return c5;
    }

    @m
    public static final <T, R extends Comparable<? super R>> T x(@l List<? extends T> list, @l ld.l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t4 = list.get(0);
        R invoke = lVar.invoke(t4);
        int J = w.J(list);
        int i4 = 1;
        if (1 <= J) {
            while (true) {
                T t5 = list.get(i4);
                R invoke2 = lVar.invoke(t5);
                if (invoke.compareTo(invoke2) < 0) {
                    t4 = t5;
                    invoke = invoke2;
                }
                if (i4 == J) {
                    break;
                }
                i4++;
            }
        }
        return (T) t4;
    }

    @m
    public static final <T, R extends Comparable<? super R>> R y(@l List<? extends T> list, @l ld.l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        R invoke = lVar.invoke(list.get(0));
        int J = w.J(list);
        int i4 = 1;
        if (1 <= J) {
            while (true) {
                R invoke2 = lVar.invoke(list.get(i4));
                if (invoke2.compareTo(invoke) > 0) {
                    invoke = invoke2;
                }
                if (i4 == J) {
                    break;
                }
                i4++;
            }
        }
        return invoke;
    }

    @m
    public static final <T, R extends Comparable<? super R>> T z(@l List<? extends T> list, @l ld.l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t4 = list.get(0);
        R invoke = lVar.invoke(t4);
        int J = w.J(list);
        int i4 = 1;
        if (1 <= J) {
            while (true) {
                T t5 = list.get(i4);
                R invoke2 = lVar.invoke(t5);
                if (invoke.compareTo(invoke2) > 0) {
                    t4 = t5;
                    invoke = invoke2;
                }
                if (i4 == J) {
                    break;
                }
                i4++;
            }
        }
        return (T) t4;
    }
}
