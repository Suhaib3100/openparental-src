package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.k2;
import kotlin.w0;
import ld.p;
import ld.q;

/* compiled from: MutableVector.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0010\f\u0016B!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u000b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00020\u000b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b'\u0010&J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b-\u0010\rJ\u001b\u0010.\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b.\u0010\u0019J\u001b\u0010/\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b/\u0010\"J\u001b\u00100\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b0\u0010\u001bJ\u001b\u00102\u001a\u00020\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b2\u0010\u001bJ\u0015\u00104\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u00107J/\u00108\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b:\u00107J1\u0010;\u001a\u0004\u0018\u00018\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u00109JR\u0010C\u001a\u00028\u0001\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u00028\u00012'\u0010B\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bC\u0010DJg\u0010F\u001a\u00028\u0001\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u00028\u00012<\u0010B\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bF\u0010GJR\u0010H\u001a\u00028\u0001\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u00028\u00012'\u0010B\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00028\u00010>H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bH\u0010DJg\u0010I\u001a\u00028\u0001\"\u0004\b\u0001\u0010<2\u0006\u0010=\u001a\u00028\u00012<\u0010B\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00028\u00010EH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bI\u0010GJ/\u0010K\u001a\u00020\u000f2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010LJ5\u0010M\u001a\u00020\u000f2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0>H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bM\u0010NJ/\u0010O\u001a\u00020\u000f2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bO\u0010LJ5\u0010P\u001a\u00020\u000f2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0>H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bP\u0010NJ\u0018\u0010Q\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\bQ\u0010RJ\u0015\u0010<\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b<\u0010SJ/\u0010T\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bT\u0010UJ/\u0010\u0001\u001a\u00020\u00062\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0001\u0010UJ\r\u0010V\u001a\u00020\u000b¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u000b¢\u0006\u0004\bX\u0010WJ\r\u0010Y\u001a\u00028\u0000¢\u0006\u0004\bY\u00107J/\u0010Z\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bZ\u00109J\u0015\u0010[\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b[\u0010SJ\u0012\u0010\\\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\\\u00107J1\u0010]\u001a\u0004\u0018\u00018\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b]\u00109J=\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u0010<\u0018\u00012\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b_\u0010`JR\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u0010<\u0018\u00012'\u0010^\u001a#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\ba\u0010bJT\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010<\u0018\u00012)\u0010^\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010>H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bc\u0010dJ?\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010<\u0018\u00012\u0014\u0010^\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\be\u0010fJ\u0018\u0010g\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bg\u0010hJ\u0018\u0010i\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bi\u0010hJ\u0015\u0010j\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\bj\u0010\rJ\u001b\u0010k\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\bk\u0010\u0019J\u001b\u0010l\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bl\u0010\u001bJ\u001b\u0010m\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\bm\u0010\"J\u0015\u0010n\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\bn\u0010RJ\u001d\u0010q\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u0006¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020\u0006H\u0001¢\u0006\u0004\bt\u00105J$\u0010u\u001a\u00020\u000f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0#H\u0086\b¢\u0006\u0004\bu\u0010LJ\u001b\u0010v\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\bv\u0010\"J \u0010w\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bw\u0010xJ%\u0010|\u001a\u00020\u000f2\u0016\u0010{\u001a\u0012\u0012\u0004\u0012\u00028\u00000yj\b\u0012\u0004\u0012\u00028\u0000`z¢\u0006\u0004\b|\u0010}J/\u0010\u007f\u001a\u00020\u00062\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060#H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u007f\u0010UJ\u0013\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R6\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b\f\u0010\u0083\u0001\u0012\u0005\b\u0088\u0001\u0010,\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0089\u0001R'\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u008b\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b\u001f\u0010P\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0015\u0010\u008f\u0001\u001a\u00020\u00068Æ\u0002¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008d\u0001R\u0016\u0010\u0093\u0001\u001a\u00030\u0090\u00018Æ\u0002¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/runtime/collection/g;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "b", "(Ljava/lang/Object;)Z", "index", "Lkotlin/k2;", "a", "(ILjava/lang/Object;)V", "", "elements", "f", "(ILjava/util/List;)Z", "c", "(ILandroidx/compose/runtime/collection/g;)Z", "i", "(Ljava/util/List;)Z", "g", "(Landroidx/compose/runtime/collection/g;)Z", "j", "([Ljava/lang/Object;)Z", "", "d", "(ILjava/util/Collection;)Z", "h", "(Ljava/util/Collection;)Z", "Lkotlin/Function1;", "predicate", "k", "(Lld/l;)Z", "r0", "", "l", "()Ljava/util/List;", "m", "()V", "n", "q", "p", "o", "other", "r", "capacity", "s", "(I)V", "u", "()Ljava/lang/Object;", "v", "(Lld/l;)Ljava/lang/Object;", "w", "x", "R", "initial", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "acc", "operation", "y", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "A", "(Ljava/lang/Object;Lld/q;)Ljava/lang/Object;", "B", "D", "block", "F", "(Lld/l;)V", "G", "(Lld/p;)V", "H", "I", "K", "(I)Ljava/lang/Object;", "(Ljava/lang/Object;)I", "S", "(Lld/l;)I", "U", "()Z", "V", "W", "X", "Z", "a0", "b0", "transform", "d0", "(Lld/l;)[Ljava/lang/Object;", "e0", "(Lld/p;)[Ljava/lang/Object;", "f0", "(Lld/p;)Landroidx/compose/runtime/collection/g;", "g0", "(Lld/l;)Landroidx/compose/runtime/collection/g;", "i0", "(Ljava/lang/Object;)V", "h0", "j0", "m0", "k0", "l0", "n0", "start", "end", "p0", "(II)V", "newSize", "u0", "o0", "q0", "s0", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "v0", "(Ljava/util/Comparator;)V", "selector", "w0", "", "x0", "()Ljava/lang/Void;", "[Ljava/lang/Object;", "L", "()[Ljava/lang/Object;", "t0", "([Ljava/lang/Object;)V", "N", "Ljava/util/List;", "list", "<set-?>", "Q", "()I", "P", "lastIndex", "Lkotlin/ranges/l;", "O", "()Lkotlin/ranges/l;", "indices", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
/* loaded from: classes.dex */
public final class g<T> implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final int f16132e = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private T[] content;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private List<T> list;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00102¨\u00064"}, d2 = {"Landroidx/compose/runtime/collection/g$a;", "T", "", "Landroidx/compose/runtime/collection/g;", "vector", "<init>", "(Landroidx/compose/runtime/collection/g;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Lkotlin/k2;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "c", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "b", "Landroidx/compose/runtime/collection/g;", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1220:1\n523#2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n967#1:1221\n*E\n"})
    private static final class a<T> implements List<T>, md.e {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final g<T> vector;

        public a(@l g<T> gVar) {
            this.vector = gVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.b(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @l Collection<? extends T> elements) {
            return this.vector.d(index, elements);
        }

        public int b() {
            return this.vector.getSize();
        }

        public T c(int index) {
            h.f(this, index);
            return this.vector.n0(index);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.m();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.n(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> elements) {
            return this.vector.p(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            h.f(this, index);
            return this.vector.L()[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.R(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.U();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.Z(element);
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i4) {
            return c(i4);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> elements) {
            return this.vector.l0(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> elements) {
            return this.vector.q0(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            h.f(this, index);
            return this.vector.s0(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        @l
        public List<T> subList(int fromIndex, int toIndex) {
            h.g(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.a(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@l Collection<? extends T> elements) {
            return this.vector.h(elements);
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.j0(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00103R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00105¨\u00067"}, d2 = {"Landroidx/compose/runtime/collection/g$b;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Lkotlin/k2;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "c", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "b", "Ljava/util/List;", "I", "d", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n1855#2,2:1221\n1855#2,2:1223\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1039#1:1221,2\n1121#1:1223,2\n*E\n"})
    private static final class b<T> implements List<T>, md.e {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<T> list;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int end;

        public b(@l List<T> list, int i4, int i5) {
            this.list = list;
            this.start = i4;
            this.end = i5;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i4 = this.end;
            this.end = i4 + 1;
            list.add(i4, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, @l Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }

        public int b() {
            return this.end - this.start;
        }

        public T c(int index) {
            h.f(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i4 = this.end - 1;
            int i5 = this.start;
            if (i5 <= i4) {
                while (true) {
                    this.list.remove(i4);
                    if (i4 == i5) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i4 = this.end;
            for (int i5 = this.start; i5 < i4; i5++) {
                if (l0.g(this.list.get(i5), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            h.f(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i4 = this.end;
            for (int i5 = this.start; i5 < i4; i5++) {
                if (l0.g(this.list.get(i5), element)) {
                    return i5 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i4 = this.end - 1;
            int i5 = this.start;
            if (i5 > i4) {
                return -1;
            }
            while (!l0.g(this.list.get(i4), element)) {
                if (i4 == i5) {
                    return -1;
                }
                i4--;
            }
            return i4 - this.start;
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i4) {
            return c(i4);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> elements) {
            int i4 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i4 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> elements) {
            int i4 = this.end;
            int i5 = i4 - 1;
            int i6 = this.start;
            if (i6 <= i5) {
                while (true) {
                    if (!elements.contains(this.list.get(i5))) {
                        this.list.remove(i5);
                        this.end--;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5--;
                }
            }
            return i4 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            h.f(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        @l
        public List<T> subList(int fromIndex, int toIndex) {
            h.g(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i4 = this.end;
            for (int i5 = this.start; i5 < i4; i5++) {
                if (l0.g(this.list.get(i5), element)) {
                    this.list.remove(i5);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@l Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            this.end = elements.size() + this.end;
            return elements.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/collection/g$c;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Lkotlin/k2;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "b", "Ljava/util/List;", "c", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<T> implements ListIterator<T>, md.f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<T> list;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        public c(@l List<T> list, int i4) {
            this.list = list;
            this.index = i4;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i4 = this.index;
            this.index = i4 + 1;
            return list.get(i4);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i4 = this.index - 1;
            this.index = i4;
            return this.list.get(i4);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i4 = this.index - 1;
            this.index = i4;
            this.list.remove(i4);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    @w0
    public g(@l T[] tArr, int i4) {
        this.content = tArr;
        this.size = i4;
    }

    @w0
    public static /* synthetic */ void N() {
    }

    public final <R> R A(R initial, @l q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        int i4 = this.size;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i5 = 0;
            do {
                initial = operation.R(Integer.valueOf(i5), initial, tArr[i5]);
                i5++;
            } while (i5 < i4);
        }
        return initial;
    }

    public final <R> R B(R initial, @l p<? super T, ? super R, ? extends R> operation) {
        int i4 = this.size;
        if (i4 > 0) {
            int i5 = i4 - 1;
            T[] tArr = this.content;
            do {
                initial = operation.invoke(tArr[i5], initial);
                i5--;
            } while (i5 >= 0);
        }
        return initial;
    }

    public final <R> R D(R initial, @l q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        int i4 = this.size;
        if (i4 > 0) {
            int i5 = i4 - 1;
            T[] tArr = this.content;
            do {
                initial = operation.R(Integer.valueOf(i5), tArr[i5], initial);
                i5--;
            } while (i5 >= 0);
        }
        return initial;
    }

    public final void F(@l ld.l<? super T, k2> block) {
        int i4 = this.size;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i5 = 0;
            do {
                block.invoke(tArr[i5]);
                i5++;
            } while (i5 < i4);
        }
    }

    public final void G(@l p<? super Integer, ? super T, k2> block) {
        int i4 = this.size;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i5 = 0;
            do {
                block.invoke(Integer.valueOf(i5), tArr[i5]);
                i5++;
            } while (i5 < i4);
        }
    }

    public final void H(@l ld.l<? super T, k2> block) {
        int i4 = this.size;
        if (i4 > 0) {
            int i5 = i4 - 1;
            T[] tArr = this.content;
            do {
                block.invoke(tArr[i5]);
                i5--;
            } while (i5 >= 0);
        }
    }

    public final void I(@l p<? super Integer, ? super T, k2> block) {
        int i4 = this.size;
        if (i4 > 0) {
            int i5 = i4 - 1;
            T[] tArr = this.content;
            do {
                block.invoke(Integer.valueOf(i5), tArr[i5]);
                i5--;
            } while (i5 >= 0);
        }
    }

    public final T K(int index) {
        return this.content[index];
    }

    @l
    public final T[] L() {
        return this.content;
    }

    @l
    public final kotlin.ranges.l O() {
        return new kotlin.ranges.l(0, this.size - 1, 1);
    }

    public final int P() {
        return this.size - 1;
    }

    /* renamed from: Q, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int R(T element) {
        int i4 = this.size;
        if (i4 <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i5 = 0;
        while (!l0.g(element, tArr[i5])) {
            i5++;
            if (i5 >= i4) {
                return -1;
            }
        }
        return i5;
    }

    public final int S(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i5 = 0;
        while (!predicate.invoke(tArr[i5]).booleanValue()) {
            i5++;
            if (i5 >= i4) {
                return -1;
            }
        }
        return i5;
    }

    public final int T(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = i4 - 1;
        T[] tArr = this.content;
        while (!predicate.invoke(tArr[i5]).booleanValue()) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
        }
        return i5;
    }

    public final boolean U() {
        return this.size == 0;
    }

    public final boolean V() {
        return this.size != 0;
    }

    public final T W() {
        if (U()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.content[this.size - 1];
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T X(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 > 0) {
            int i5 = i4 - 1;
            T[] tArr = this.content;
            do {
                ?? r22 = (Object) tArr[i5];
                if (predicate.invoke(r22).booleanValue()) {
                    return r22;
                }
                i5--;
            } while (i5 >= 0);
        }
        x0();
        throw new KotlinNothingValueException();
    }

    public final int Z(T element) {
        int i4 = this.size;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = i4 - 1;
        T[] tArr = this.content;
        while (!l0.g(element, tArr[i5])) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
        }
        return i5;
    }

    public final void a(int index, T element) {
        s(this.size + 1);
        T[] tArr = this.content;
        int i4 = this.size;
        if (index != i4) {
            kotlin.collections.l.B0(tArr, tArr, index + 1, index, i4);
        }
        tArr[index] = element;
        this.size++;
    }

    @m
    public final T a0() {
        if (U()) {
            return null;
        }
        return this.content[this.size - 1];
    }

    public final boolean b(T element) {
        s(this.size + 1);
        T[] tArr = this.content;
        int i4 = this.size;
        tArr[i4] = element;
        this.size = i4 + 1;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @m
    public final T b0(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        T[] tArr = this.content;
        do {
            ?? r22 = (Object) tArr[i5];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i5--;
        } while (i5 >= 0);
        return null;
    }

    public final boolean c(int index, @l g<T> elements) {
        if (elements.U()) {
            return false;
        }
        s(this.size + elements.size);
        T[] tArr = this.content;
        int i4 = this.size;
        if (index != i4) {
            kotlin.collections.l.B0(tArr, tArr, elements.size + index, index, i4);
        }
        kotlin.collections.l.B0(elements.content, tArr, index, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public final boolean d(int index, @l Collection<? extends T> elements) {
        int i4 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        s(elements.size() + this.size);
        T[] tArr = this.content;
        if (index != this.size) {
            kotlin.collections.l.B0(tArr, tArr, elements.size() + index, index, this.size);
        }
        for (T t4 : elements) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                w.Z();
            }
            tArr[i4 + index] = t4;
            i4 = i5;
        }
        this.size = elements.size() + this.size;
        return true;
    }

    public final <R> R[] d0(ld.l<? super T, ? extends R> transform) {
        int i4 = this.size;
        l0.P();
        R[] rArr = (R[]) new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            rArr[i5] = transform.invoke(this.content[i5]);
        }
        return rArr;
    }

    public final <R> R[] e0(p<? super Integer, ? super T, ? extends R> transform) {
        int i4 = this.size;
        l0.P();
        R[] rArr = (R[]) new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            rArr[i5] = transform.invoke(Integer.valueOf(i5), this.content[i5]);
        }
        return rArr;
    }

    public final boolean f(int index, @l List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        s(elements.size() + this.size);
        T[] tArr = this.content;
        if (index != this.size) {
            kotlin.collections.l.B0(tArr, tArr, elements.size() + index, index, this.size);
        }
        int size = elements.size();
        for (int i4 = 0; i4 < size; i4++) {
            tArr[index + i4] = elements.get(i4);
        }
        this.size = elements.size() + this.size;
        return true;
    }

    public final <R> g<R> f0(p<? super Integer, ? super T, ? extends R> transform) {
        int i4 = this.size;
        l0.P();
        Object[] objArr = new Object[i4];
        int i5 = 0;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i6 = 0;
            do {
                R invoke = transform.invoke(Integer.valueOf(i5), tArr[i5]);
                if (invoke != null) {
                    objArr[i6] = invoke;
                    i6++;
                }
                i5++;
            } while (i5 < i4);
            i5 = i6;
        }
        return new g<>(objArr, i5);
    }

    public final boolean g(@l g<T> elements) {
        return c(this.size, elements);
    }

    public final <R> g<R> g0(ld.l<? super T, ? extends R> transform) {
        int i4 = this.size;
        l0.P();
        Object[] objArr = new Object[i4];
        int i5 = 0;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i6 = 0;
            do {
                R invoke = transform.invoke(tArr[i5]);
                if (invoke != null) {
                    objArr[i6] = invoke;
                    i6++;
                }
                i5++;
            } while (i5 < i4);
            i5 = i6;
        }
        return new g<>(objArr, i5);
    }

    public final boolean h(@l Collection<? extends T> elements) {
        return d(this.size, elements);
    }

    public final void h0(T element) {
        j0(element);
    }

    public final boolean i(@l List<? extends T> elements) {
        return f(this.size, elements);
    }

    public final void i0(T element) {
        b(element);
    }

    public final boolean j(@l T[] elements) {
        if (elements.length == 0) {
            return false;
        }
        s(this.size + elements.length);
        kotlin.collections.l.K0(elements, this.content, this.size, 0, 0, 12, null);
        this.size += elements.length;
        return true;
    }

    public final boolean j0(T element) {
        int R = R(element);
        if (R < 0) {
            return false;
        }
        n0(R);
        return true;
    }

    public final boolean k(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i5 = 0;
            while (!predicate.invoke(tArr[i5]).booleanValue()) {
                i5++;
                if (i5 >= i4) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k0(@l g<T> elements) {
        int i4 = this.size;
        int i5 = elements.size - 1;
        if (i5 >= 0) {
            int i6 = 0;
            while (true) {
                j0(elements.content[i6]);
                if (i6 == i5) {
                    break;
                }
                i6++;
            }
        }
        return i4 != this.size;
    }

    @l
    public final List<T> l() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.list = aVar;
        return aVar;
    }

    public final boolean l0(@l Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i4 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            j0(it.next());
        }
        return i4 != this.size;
    }

    public final void m() {
        T[] tArr = this.content;
        int i4 = this.size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                this.size = 0;
                return;
            }
            tArr[i4] = null;
        }
    }

    public final boolean m0(@l List<? extends T> elements) {
        int i4 = this.size;
        int size = elements.size();
        for (int i5 = 0; i5 < size; i5++) {
            j0(elements.get(i5));
        }
        return i4 != this.size;
    }

    public final boolean n(T element) {
        int i4 = this.size - 1;
        if (i4 >= 0) {
            for (int i5 = 0; !l0.g(this.content[i5], element); i5++) {
                if (i5 != i4) {
                }
            }
            return true;
        }
        return false;
    }

    public final T n0(int index) {
        T[] tArr = this.content;
        T t4 = tArr[index];
        int i4 = this.size;
        if (index != i4 - 1) {
            kotlin.collections.l.B0(tArr, tArr, index, index + 1, i4);
        }
        int i5 = this.size - 1;
        this.size = i5;
        tArr[i5] = null;
        return t4;
    }

    public final boolean o(@l g<T> elements) {
        kotlin.ranges.l lVar = new kotlin.ranges.l(0, elements.size - 1, 1);
        int first = lVar.getFirst();
        int last = lVar.getLast();
        if (first <= last) {
            while (n(elements.content[first])) {
                if (first != last) {
                    first++;
                }
            }
            return false;
        }
        return true;
    }

    public final void o0(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (predicate.invoke(this.content[i6]).booleanValue()) {
                i5++;
            } else if (i5 > 0) {
                T[] tArr = this.content;
                tArr[i6 - i5] = tArr[i6];
            }
        }
        int i7 = i4 - i5;
        kotlin.collections.l.M1(this.content, null, i7, i4);
        this.size = i7;
    }

    public final boolean p(@l Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!n(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void p0(int start, int end) {
        if (end > start) {
            int i4 = this.size;
            if (end < i4) {
                T[] tArr = this.content;
                kotlin.collections.l.B0(tArr, tArr, start, end, i4);
            }
            int i5 = this.size;
            int i6 = i5 - (end - start);
            int i7 = i5 - 1;
            if (i6 <= i7) {
                int i10 = i6;
                while (true) {
                    this.content[i10] = null;
                    if (i10 == i7) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.size = i6;
        }
    }

    public final boolean q(@l List<? extends T> elements) {
        int size = elements.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!n(elements.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean q0(@l Collection<? extends T> elements) {
        int i4 = this.size;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!elements.contains(this.content[i5])) {
                n0(i5);
            }
        }
        return i4 != this.size;
    }

    public final boolean r(@l g<T> other) {
        int i4 = other.size;
        int i5 = this.size;
        if (i4 != i5) {
            return false;
        }
        int i6 = i5 - 1;
        if (i6 >= 0) {
            for (int i7 = 0; l0.g(other.content[i7], this.content[i7]); i7++) {
                if (i7 != i6) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean r0(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 <= 0) {
            return false;
        }
        int i5 = i4 - 1;
        T[] tArr = this.content;
        while (!predicate.invoke(tArr[i5]).booleanValue()) {
            i5--;
            if (i5 < 0) {
                return false;
            }
        }
        return true;
    }

    public final void s(int capacity) {
        T[] tArr = this.content;
        if (tArr.length < capacity) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(capacity, tArr.length * 2));
            l0.o(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T s0(int index, T element) {
        T[] tArr = this.content;
        T t4 = tArr[index];
        tArr[index] = element;
        return t4;
    }

    public final void t0(@l T[] tArr) {
        this.content = tArr;
    }

    public final T u() {
        if (U()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.content[0];
    }

    @w0
    public final void u0(int newSize) {
        this.size = newSize;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T v(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i5 = 0;
            do {
                ?? r32 = (Object) tArr[i5];
                if (predicate.invoke(r32).booleanValue()) {
                    return r32;
                }
                i5++;
            } while (i5 < i4);
        }
        x0();
        throw new KotlinNothingValueException();
    }

    public final void v0(@l Comparator<T> comparator) {
        kotlin.collections.l.i4(this.content, comparator, 0, this.size);
    }

    @m
    public final T w() {
        if (U()) {
            return null;
        }
        return this.content[0];
    }

    public final int w0(@l ld.l<? super T, Integer> selector) {
        int i4 = this.size;
        int i5 = 0;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i6 = 0;
            do {
                i5 += selector.invoke(tArr[i6]).intValue();
                i6++;
            } while (i6 < i4);
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @m
    public final T x(@l ld.l<? super T, Boolean> predicate) {
        int i4 = this.size;
        if (i4 <= 0) {
            return null;
        }
        T[] tArr = this.content;
        int i5 = 0;
        do {
            ?? r32 = (Object) tArr[i5];
            if (predicate.invoke(r32).booleanValue()) {
                return r32;
            }
            i5++;
        } while (i5 < i4);
        return null;
    }

    @l
    @w0
    public final Void x0() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final <R> R y(R initial, @l p<? super R, ? super T, ? extends R> operation) {
        int i4 = this.size;
        if (i4 > 0) {
            T[] tArr = this.content;
            int i5 = 0;
            do {
                initial = operation.invoke(initial, tArr[i5]);
                i5++;
            } while (i5 < i4);
        }
        return initial;
    }
}
