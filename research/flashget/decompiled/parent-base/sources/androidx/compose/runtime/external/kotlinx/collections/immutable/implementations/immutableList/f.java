package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.internal.u;
import fg.m;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: PersistentVectorBuilder.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010,\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070-H\u0002¢\u0006\u0004\b/\u00100JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b3\u00104JO\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060-H\u0002¢\u0006\u0004\b6\u00107J1\u00109\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:JI\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J]\u0010D\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJW\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bG\u0010HJm\u0010K\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010J\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u0004\u0018\u00010\u00072\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ?\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJA\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bV\u0010SJ#\u0010Y\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150WH\u0002¢\u0006\u0004\bY\u0010ZJ1\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u001cJ7\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010`\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\b`\u0010aJC\u0010c\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\bc\u0010dJw\u0010h\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\u0006\u0010_\u001a\u00020;2\u0014\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060f2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060fH\u0002¢\u0006\u0004\bh\u0010iJG\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010j\u001a\u00028\u00002\u0006\u0010k\u001a\u00020;H\u0002¢\u0006\u0004\bl\u0010>J%\u0010n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060m2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\nH\u0000¢\u0006\u0004\bp\u0010\u000fJ\u0015\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bs\u0010tJ\u001d\u0010u\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bu\u0010vJ\u001f\u0010s\u001a\u00020%2\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bs\u0010wJ%\u0010u\u001a\u00020\u00152\u0006\u00108\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bu\u0010xJ\u0018\u0010y\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b{\u0010zJ\u001d\u0010|\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\b|\u0010vJ!\u0010}\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W¢\u0006\u0004\b}\u0010ZJ \u0010~\u001a\u00028\u00002\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0080\u0001H\u0096\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0083\u00012\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0084\u0001\u0010oR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u0088\u0001R \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R%\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bj\u00106\u001a\u0005\b\u008a\u0001\u0010\u000f\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u008e\u0001R<\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u0090\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0088\u0001\u001a\u0005\b\u0092\u0001\u0010!R7\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u0090\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b/\u0010\u0088\u0001\u001a\u0005\b\u0093\u0001\u0010!R&\u0010\u0010\u001a\u00020\n2\u0007\u0010\u0090\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\bp\u00106\u001a\u0005\b\u0086\u0001\u0010\u000f¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", "E", "Lkotlin/collections/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "Z", "()I", "size", "g0", "(I)I", "f0", "buffer", "", "s", "([Ljava/lang/Object;)Z", "w", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "x", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "D", "(Ljava/lang/Object;)[Ljava/lang/Object;", "A", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Lkotlin/k2;", "O", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "P", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "h", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "L", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "I", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "r", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;", "elementCarry", "q", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "p", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "d0", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "e0", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "f", "(I)[Ljava/lang/Object;", "W", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "V", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;)[Ljava/lang/Object;", "H", "([Ljava/lang/Object;II)V", "G", "Lkotlin/Function1;", "predicate", "S", "(Lld/l;)Z", "X", "F", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "T", "(Lld/l;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;)I", "bufferSize", "R", "(Lld/l;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;)I", "toBufferSize", "", "recyclableBuffers", "Q", "(Lld/l;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "a0", "", "v", "(I)Ljava/util/ListIterator;", "i", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "c", "removeAll", "U", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "[Ljava/lang/Object;", "d", "l", "b0", "(I)V", "Lf0/f;", "Lf0/f;", "ownership", "<set-?>", "g", "j", "m", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,991:1\n1#2:992\n26#3:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n622#1:993\n*E\n"})
/* loaded from: classes.dex */
public final class f<E> extends kotlin.collections.f<E> implements g.a<E> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f16192j = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends E> vector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Object[] vectorRoot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] vectorTail;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int rootShift;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f0.f ownership = new f0.f();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private Object[] root;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] tail;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: PersistentVectorBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<E, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<E> f16201b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f16201b = collection;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e4) {
            return Boolean.valueOf(this.f16201b.contains(e4));
        }
    }

    public f(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends E> gVar, @m Object[] objArr, @fg.l Object[] objArr2, int i4) {
        this.vector = gVar;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i4;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] A() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] D(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] F(Object[] root, int index, int shift) {
        if (shift < 0) {
            throw new IllegalArgumentException("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int a5 = l.a(index, shift);
        Object obj = root[a5];
        l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object F = F((Object[]) obj, index, shift - 5);
        if (a5 < 31) {
            int i4 = a5 + 1;
            if (root[i4] != null) {
                if (s(root)) {
                    kotlin.collections.l.M1(root, null, i4, 32);
                }
                root = kotlin.collections.l.B0(root, A(), 0, 0, i4);
            }
        }
        if (F == root[a5]) {
            return root;
        }
        Object[] w4 = w(root);
        w4[a5] = F;
        return w4;
    }

    private final Object[] G(Object[] root, int shift, int rootSize, d tailCarry) {
        Object[] G;
        int a5 = l.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[a5]);
            G = null;
        } else {
            Object obj = root[a5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            G = G((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (G == null && a5 == 0) {
            return null;
        }
        Object[] w4 = w(root);
        w4[a5] = G;
        return w4;
    }

    private final void H(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        d dVar = new d(null);
        l0.m(root);
        Object[] G = G(root, shift, rootSize, dVar);
        l0.m(G);
        Object value = dVar.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (G[1] == null) {
            this.root = (Object[]) G[0];
            this.rootShift = shift - 5;
        } else {
            this.root = G;
            this.rootShift = shift;
        }
    }

    private final Object[] I(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            throw new IllegalArgumentException("invalid buffersIterator");
        }
        if (shift < 0) {
            throw new IllegalArgumentException("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] w4 = w(root);
        int a5 = l.a(rootSize, shift);
        int i4 = shift - 5;
        w4[a5] = I((Object[]) w4[a5], rootSize, i4, buffersIterator);
        while (true) {
            a5++;
            if (a5 >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            w4[a5] = I((Object[]) w4[a5], 0, i4, buffersIterator);
        }
        return w4;
    }

    private final Object[] L(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> a5 = kotlin.jvm.internal.i.a(buffers);
        int i4 = rootSize >> 5;
        int i5 = this.rootShift;
        Object[] I = i4 < (1 << i5) ? I(root, rootSize, i5, a5) : w(root);
        while (a5.hasNext()) {
            this.rootShift += 5;
            I = D(I);
            int i6 = this.rootShift;
            I(I, 1 << i6, i6, a5);
        }
        return I;
    }

    private final void O(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = getSize() >> 5;
        int i4 = this.rootShift;
        if (size > (1 << i4)) {
            this.root = P(D(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = getSize() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = getSize() + 1;
        } else {
            this.root = P(root, filledTail, i4);
            this.tail = newTail;
            this.size = getSize() + 1;
        }
    }

    private final Object[] P(Object[] root, Object[] tail, int shift) {
        int a5 = l.a(getSize() - 1, shift);
        Object[] w4 = w(root);
        if (shift == 5) {
            w4[a5] = tail;
        } else {
            w4[a5] = P((Object[]) w4[a5], tail, shift - 5);
        }
        return w4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int Q(ld.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, d bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (s(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArr2 = objArr;
        for (int i4 = 0; i4 < bufferSize; i4++) {
            Object obj = buffer[i4];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArr2 = !recyclableBuffers.isEmpty() ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : A();
                    toBufferSize = 0;
                }
                objArr2[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArr2);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int R(ld.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, d bufferRef) {
        Object[] objArr = buffer;
        int i4 = bufferSize;
        boolean z4 = false;
        for (int i5 = 0; i5 < bufferSize; i5++) {
            Object obj = buffer[i5];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z4) {
                    objArr = w(buffer);
                    z4 = true;
                    i4 = i5;
                }
            } else if (z4) {
                objArr[i4] = obj;
                i4++;
            }
        }
        bufferRef.b(objArr);
        return i4;
    }

    private final boolean S(ld.l<? super E, Boolean> predicate) {
        Object[] I;
        int f02 = f0();
        d dVar = new d(null);
        if (this.root == null) {
            return T(predicate, f02, dVar) != f02;
        }
        ListIterator<Object[]> v4 = v(0);
        int i4 = 32;
        while (i4 == 32 && v4.hasNext()) {
            i4 = R(predicate, v4.next(), 32, dVar);
        }
        if (i4 == 32) {
            v4.hasNext();
            int T = T(predicate, f02, dVar);
            if (T == 0) {
                H(this.root, getSize(), this.rootShift);
            }
            return T != f02;
        }
        int previousIndex = v4.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = i4;
        while (v4.hasNext()) {
            i5 = Q(predicate, v4.next(), 32, i5, dVar, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i6 = previousIndex;
        int Q = Q(predicate, this.tail, f02, i5, dVar, arrayList2, arrayList);
        Object value = dVar.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        kotlin.collections.l.M1(objArr, null, Q, 32);
        if (arrayList.isEmpty()) {
            I = this.root;
            l0.m(I);
        } else {
            I = I(this.root, i6, this.rootShift, arrayList.iterator());
        }
        int size = i6 + (arrayList.size() << 5);
        this.root = X(I, size);
        this.tail = objArr;
        this.size = size + Q;
        return true;
    }

    private final int T(ld.l<? super E, Boolean> predicate, int tailSize, d bufferRef) {
        int R = R(predicate, this.tail, tailSize, bufferRef);
        if (R == tailSize) {
            bufferRef.getValue();
            return tailSize;
        }
        Object value = bufferRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        kotlin.collections.l.M1(objArr, null, R, tailSize);
        this.tail = objArr;
        this.size = getSize() - (tailSize - R);
        return R;
    }

    private final Object[] V(Object[] root, int shift, int index, d tailCarry) {
        int a5 = l.a(index, shift);
        if (shift == 0) {
            Object obj = root[a5];
            Object[] B0 = kotlin.collections.l.B0(root, w(root), a5, a5 + 1, 32);
            B0[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return B0;
        }
        int a6 = root[31] == null ? l.a(Z() - 1, shift) : 31;
        Object[] w4 = w(root);
        int i4 = shift - 5;
        int i5 = a5 + 1;
        if (i5 <= a6) {
            while (true) {
                Object obj2 = w4[a6];
                l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                w4[a6] = V((Object[]) obj2, i4, 0, tailCarry);
                if (a6 == i5) {
                    break;
                }
                a6--;
            }
        }
        Object obj3 = w4[a5];
        l0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        w4[a5] = V((Object[]) obj3, i4, index, tailCarry);
        return w4;
    }

    private final Object W(Object[] root, int rootSize, int shift, int index) {
        int size = getSize() - rootSize;
        if (size == 1) {
            Object obj = this.tail[0];
            H(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] B0 = kotlin.collections.l.B0(objArr, w(objArr), index, index + 1, size);
        B0[size - 1] = null;
        this.root = root;
        this.tail = B0;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] X(Object[] root, int size) {
        if ((size & 31) != 0) {
            throw new IllegalArgumentException("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i4 = size - 1;
        while (true) {
            int i5 = this.rootShift;
            if ((i4 >> i5) != 0) {
                return F(root, i4, i5);
            }
            this.rootShift = i5 - 5;
            Object[] objArr = root[0];
            l0.n(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final int Z() {
        if (getSize() <= 32) {
            return 0;
        }
        return l.d(getSize());
    }

    private final Object[] a0(Object[] root, int shift, int index, E e4, d oldElementCarry) {
        int a5 = l.a(index, shift);
        Object[] w4 = w(root);
        if (shift != 0) {
            Object obj = w4[a5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            w4[a5] = a0((Object[]) obj, shift - 5, index, e4, oldElementCarry);
            return w4;
        }
        if (w4 != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.b(w4[a5]);
        w4[a5] = e4;
        return w4;
    }

    private final Object[] d0(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> v4 = v(Z() >> 5);
        while (v4.previousIndex() != startLeafIndex) {
            Object[] previous = v4.previous();
            kotlin.collections.l.B0(previous, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = x(previous, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return v4.previous();
    }

    private final void e0(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] A;
        if (nullBuffers < 1) {
            throw new IllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] w4 = w(startBuffer);
        buffers[0] = w4;
        int i4 = index & 31;
        int size = ((elements.size() + index) - 1) & 31;
        int i5 = (startBufferSize - i4) + size;
        if (i5 < 32) {
            kotlin.collections.l.B0(w4, nextBuffer, size + 1, i4, startBufferSize);
        } else {
            int i6 = i5 - 31;
            if (nullBuffers == 1) {
                A = w4;
            } else {
                A = A();
                nullBuffers--;
                buffers[nullBuffers] = A;
            }
            int i7 = startBufferSize - i6;
            kotlin.collections.l.B0(w4, nextBuffer, 0, i7, startBufferSize);
            kotlin.collections.l.B0(w4, A, size + 1, i4, i7);
            nextBuffer = A;
        }
        Iterator<? extends E> it = elements.iterator();
        h(w4, i4, it);
        for (int i10 = 1; i10 < nullBuffers; i10++) {
            buffers[i10] = h(A(), 0, it);
        }
        h(nextBuffer, 0, it);
    }

    private final Object[] f(int index) {
        if (Z() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        l0.m(objArr);
        for (int i4 = this.rootShift; i4 > 0; i4 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i4)];
            l0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final int f0() {
        return g0(getSize());
    }

    private final int g0(int size) {
        return size <= 32 ? size : size - l.d(size);
    }

    private final Object[] h(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final void p(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = index >> 5;
        Object[] d02 = d0(i4, rightShift, buffers, nullBuffers, nextBuffer);
        int Z = nullBuffers - (((Z() >> 5) - 1) - i4);
        if (Z < nullBuffers) {
            nextBuffer = buffers[Z];
            l0.m(nextBuffer);
        }
        e0(elements, index, d02, 32, buffers, Z, nextBuffer);
    }

    private final Object[] q(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object obj;
        int a5 = l.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] B0 = kotlin.collections.l.B0(root, w(root), a5 + 1, a5, 31);
            B0[a5] = element;
            return B0;
        }
        Object[] w4 = w(root);
        int i4 = shift - 5;
        Object obj2 = w4[a5];
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        w4[a5] = q((Object[]) obj2, i4, index, element, elementCarry);
        while (true) {
            a5++;
            if (a5 >= 32 || (obj = w4[a5]) == null) {
                break;
            }
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            w4[a5] = q((Object[]) obj, i4, 0, elementCarry.getValue(), elementCarry);
        }
        return w4;
    }

    private final void r(Object[] root, int index, E element) {
        int f02 = f0();
        Object[] w4 = w(this.tail);
        if (f02 < 32) {
            kotlin.collections.l.B0(this.tail, w4, index + 1, index, f02);
            w4[index] = element;
            this.root = root;
            this.tail = w4;
            this.size = getSize() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        kotlin.collections.l.B0(objArr, w4, index + 1, index, 31);
        w4[index] = element;
        O(root, w4, D(obj));
    }

    private final boolean s(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final ListIterator<Object[]> v(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int Z = Z() >> 5;
        f0.e.b(index, Z);
        int i4 = this.rootShift;
        return i4 == 0 ? new i(objArr, index) : new k(objArr, index, Z, i4 / 5);
    }

    private final Object[] w(Object[] buffer) {
        if (buffer == null) {
            return A();
        }
        if (s(buffer)) {
            return buffer;
        }
        Object[] A = A();
        int length = buffer.length;
        return kotlin.collections.l.K0(buffer, A, 0, 0, length > 32 ? 32 : length, 6, null);
    }

    private final Object[] x(Object[] buffer, int distance) {
        return s(buffer) ? kotlin.collections.l.B0(buffer, buffer, distance, 0, 32 - distance) : kotlin.collections.l.B0(buffer, A(), distance, 0, 32 - distance);
    }

    public final boolean U(@fg.l ld.l<? super E, Boolean> predicate) {
        boolean S = S(predicate);
        if (S) {
            ((AbstractList) this).modCount++;
        }
        return S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        f0.e.b(index, getSize());
        if (index == getSize()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int Z = Z();
        if (index >= Z) {
            r(this.root, index - Z, element);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.root;
        l0.m(objArr);
        r(q(objArr, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @fg.l Collection<? extends E> elements) {
        Object[] B0;
        f0.e.b(index, getSize());
        if (index == getSize()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i4 = (index >> 5) << 5;
        int size = ((elements.size() + (getSize() - i4)) - 1) / 32;
        if (size == 0) {
            Z();
            int i5 = index & 31;
            int size2 = ((elements.size() + index) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] B02 = kotlin.collections.l.B0(objArr, w(objArr), size2 + 1, i5, f0());
            h(B02, i5, elements.iterator());
            this.tail = B02;
            this.size = elements.size() + getSize();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int f02 = f0();
        int g02 = g0(elements.size() + getSize());
        if (index >= Z()) {
            B0 = A();
            e0(elements, index, this.tail, f02, objArr2, size, B0);
        } else if (g02 > f02) {
            int i6 = g02 - f02;
            B0 = x(this.tail, i6);
            p(elements, index, i6, objArr2, size, B0);
        } else {
            int i7 = f02 - g02;
            B0 = kotlin.collections.l.B0(this.tail, A(), 0, i7, f02);
            int i10 = 32 - i7;
            Object[] x4 = x(this.tail, i10);
            int i11 = size - 1;
            objArr2[i11] = x4;
            p(elements, index, i10, objArr2, i11, x4);
        }
        this.root = L(this.root, i4, objArr2);
        this.tail = B0;
        this.size = elements.size() + getSize();
        return true;
    }

    @Override // kotlin.collections.f
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final void b0(int i4) {
        this.rootShift = i4;
    }

    @Override // kotlin.collections.f
    public E c(int index) {
        f0.e.a(index, getSize());
        ((AbstractList) this).modCount++;
        int Z = Z();
        if (index >= Z) {
            return (E) W(this.root, Z, this.rootShift, index - Z);
        }
        d dVar = new d(this.tail[0]);
        Object[] objArr = this.root;
        l0.m(objArr);
        W(V(objArr, this.rootShift, index, dVar), Z, this.rootShift, 0);
        return (E) dVar.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        f0.e.a(index, getSize());
        return (E) f(index)[index & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @m
    /* renamed from: j, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* renamed from: l, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @Override // java.util.AbstractList, java.util.List
    @fg.l
    public ListIterator<E> listIterator(int index) {
        f0.e.b(index, getSize());
        return new h(this, index);
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@fg.l Collection<? extends Object> elements) {
        return U(new a(elements));
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        f0.e.a(index, getSize());
        if (Z() > index) {
            d dVar = new d(null);
            Object[] objArr = this.root;
            l0.m(objArr);
            this.root = a0(objArr, this.rootShift, index, element, dVar);
            return (E) dVar.getValue();
        }
        Object[] w4 = w(this.tail);
        if (w4 != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i4 = index & 31;
        E e4 = (E) w4[i4];
        w4[i4] = element;
        this.tail = w4;
        return e4;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> a() {
        e eVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            eVar = this.vector;
        } else {
            this.ownership = new f0.f();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                l0.m(objArr3);
                eVar = new e(objArr3, this.tail, getSize(), this.rootShift);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] copyOf = Arrays.copyOf(this.tail, getSize());
                l0.o(copyOf, "copyOf(this, newSize)");
                eVar = new j(copyOf);
            }
        }
        this.vector = eVar;
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.g<E>) eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    @fg.l
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int f02 = f0();
        if (f02 < 32) {
            Object[] w4 = w(this.tail);
            w4[f02] = element;
            this.tail = w4;
            this.size = getSize() + 1;
        } else {
            O(this.root, this.tail, D(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@fg.l Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int f02 = f0();
        Iterator<? extends E> it = elements.iterator();
        if (32 - f02 >= elements.size()) {
            this.tail = h(w(this.tail), f02, it);
            this.size = elements.size() + getSize();
        } else {
            int size = ((elements.size() + f02) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = h(w(this.tail), f02, it);
            for (int i4 = 1; i4 < size; i4++) {
                objArr[i4] = h(A(), 0, it);
            }
            this.root = L(this.root, Z(), objArr);
            this.tail = h(A(), 0, it);
            this.size = elements.size() + getSize();
        }
        return true;
    }
}
