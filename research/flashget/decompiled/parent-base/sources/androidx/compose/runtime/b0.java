package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.w2;
import androidx.compose.runtime.snapshots.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001[B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0014JK\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018*\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)JM\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010*25\u00100\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010-0,¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00000+H\u0082\b¢\u0006\u0004\b1\u00102J$\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010*2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0082\b¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u0014J!\u00108\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020<2\u0006\u00106\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:2\b\u00107\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010-0,H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ$\u0010E\u001a\u00028\u0000\"\u0004\b\u0000\u0010*2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0082\b¢\u0006\u0004\bE\u00104J\u0011\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bG\u0010HJ\"\u0010I\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\bI\u0010\u0012J\"\u0010J\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\bJ\u0010\u0012J\u0017\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020FH\u0000¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\"\u0010S\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\bS\u0010\u0012J\u000f\u0010T\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0014J\u001d\u0010U\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0016¢\u0006\u0004\bU\u0010VJ\u001d\u0010W\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0016¢\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b[\u0010%J\u0017\u0010\\\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\\\u0010%J\u000f\u0010]\u001a\u00020\u001bH\u0016¢\u0006\u0004\b]\u0010^J+\u0010c\u001a\u00020\u000e2\u001a\u0010b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020a\u0012\u0006\u0012\u0004\u0018\u00010a0`0_H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u000eH\u0016¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\u000eH\u0016¢\u0006\u0004\bj\u0010\u0014J\u000f\u0010k\u001a\u00020\u000eH\u0016¢\u0006\u0004\bk\u0010\u0014J\u000f\u0010l\u001a\u00020\u000eH\u0016¢\u0006\u0004\bl\u0010\u0014J\u000f\u0010m\u001a\u00020\u000eH\u0016¢\u0006\u0004\bm\u0010\u0014J5\u0010q\u001a\u00028\u0000\"\u0004\b\u0000\u0010n2\b\u0010o\u001a\u0004\u0018\u00010\u00012\u0006\u0010p\u001a\u00020O2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\bq\u0010rJ!\u0010s\u001a\u00020<2\u0006\u00106\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\bu\u0010vJ%\u0010x\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010*2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000wH\u0016¢\u0006\u0004\bx\u0010yJ\u001f\u0010z\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0017H\u0000¢\u0006\u0004\bz\u0010{J\u001b\u0010}\u001a\u00020\u000e2\n\u0010f\u001a\u0006\u0012\u0002\b\u00030|H\u0000¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u007f\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bu\u0010\u0082\u0001R,\u0010\u0086\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0083\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019`\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bs\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010\u0087\u0001R(\u0010\u008b\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u0089\u00010\u0016j\t\u0012\u0005\u0012\u00030\u0089\u0001`\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u008a\u0001R#\u0010B\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\u0015\n\u0005\bJ\u0010\u008c\u0001\u0012\u0004\b*\u0010\u0014\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001d\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bx\u0010\u0090\u0001R'\u0010\u0093\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008a\u0001R\"\u0010\u0095\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030|0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0090\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u0099\u0001\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0097\u0001R\u001d\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0090\u0001R,\u0010\u009c\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u009b\u0001R.\u0010¢\u0001\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b(\u0010\u009d\u0001\u0012\u0005\b¡\u0001\u0010\u0014\u001a\u0005\b\u009e\u0001\u0010^\"\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010¤\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010£\u0001R\u0017\u0010¥\u0001\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010iR\u001f\u0010ª\u0001\u001a\u00030¦\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0013\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010\u00ad\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¬\u0001R\u0019\u0010°\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010²\u0001\u001a\u00020\u001b8\u0006¢\u0006\u000f\n\u0006\b±\u0001\u0010\u009d\u0001\u001a\u0005\b\u009d\u0001\u0010^R\u0019\u0010´\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u009d\u0001R3\u0010¹\u0001\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b±\u0001\u0010·\u0001\"\u0005\b¸\u0001\u0010\u0012R\u0016\u0010º\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010^R\u001d\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8AX\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u001d\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8AX\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¼\u0001R\u001d\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170_8AX\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010¿\u0001R\u0012\u0010\n\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bn\u0010Á\u0001R\u0016\u0010Ã\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010^R\u0016\u0010Ä\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010^R\u0016\u0010Æ\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010^R\u0016\u0010Ç\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010^¨\u0006È\u0001"}, d2 = {"Landroidx/compose/runtime/b0;", "Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/r3;", "Landroidx/compose/runtime/h3;", "Landroidx/compose/runtime/l0;", "Landroidx/compose/runtime/z;", "parent", "Landroidx/compose/runtime/e;", "applier", "Lkotlin/coroutines/g;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/e;Lkotlin/coroutines/g;)V", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "q", "(Lld/p;)V", "r", "()V", "s", "Ljava/util/HashSet;", "Landroidx/compose/runtime/f3;", "Lkotlin/collections/HashSet;", "", "value", "", "forgetConditionalScopes", "m", "(Ljava/util/HashSet;Ljava/lang/Object;Z)Ljava/util/HashSet;", "", "values", "n", "(Ljava/util/Set;Z)V", "p", "Y", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/changelist/d;", "changes", "o", "(Landroidx/compose/runtime/changelist/d;)V", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/c;", "Landroidx/compose/runtime/collection/d;", "Lkotlin/r0;", "name", "block", "V", "(Lld/l;)Ljava/lang/Object;", "U", "(Lld/a;)Ljava/lang/Object;", "f", "scope", "instance", "i0", "(Landroidx/compose/runtime/f3;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/d;", "anchor", "Landroidx/compose/runtime/s1;", "W", "(Landroidx/compose/runtime/f3;Landroidx/compose/runtime/d;Ljava/lang/Object;)Landroidx/compose/runtime/s1;", "g0", "()Landroidx/compose/runtime/collection/c;", "Landroidx/compose/runtime/x3;", "slotTable", "j0", "(Landroidx/compose/runtime/x3;)V", "h0", "Landroidx/compose/runtime/tooling/c;", "b0", "()Landroidx/compose/runtime/tooling/c;", "e", "g", "observer", "Landroidx/compose/runtime/tooling/d;", "a0", "(Landroidx/compose/runtime/tooling/c;)Landroidx/compose/runtime/tooling/d;", "", "key", "X", "(I)V", "y", "dispose", "H", "(Ljava/util/Set;)V", "F", "(Ljava/util/Set;)Z", "L", "(Lld/a;)V", "a", "K", "E", "()Z", "", "Lkotlin/q0;", "Landroidx/compose/runtime/f2;", "references", "C", "(Ljava/util/List;)V", "Landroidx/compose/runtime/e2;", "state", "B", "(Landroidx/compose/runtime/e2;)V", "I", "z", "M", "x", "G", "R", "to", "groupIndex", "A", "(Landroidx/compose/runtime/n0;ILld/a;)Ljava/lang/Object;", "d", "(Landroidx/compose/runtime/f3;Ljava/lang/Object;)Landroidx/compose/runtime/s1;", "c", "(Landroidx/compose/runtime/f3;)V", "Landroidx/compose/runtime/k0;", "h", "(Landroidx/compose/runtime/k0;)Ljava/lang/Object;", "d0", "(Ljava/lang/Object;Landroidx/compose/runtime/f3;)V", "Landroidx/compose/runtime/r0;", "c0", "(Landroidx/compose/runtime/r0;)V", "deactivate", "b", "Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/e;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "Landroidx/compose/runtime/p3;", "Ljava/util/HashSet;", "abandonSet", "Landroidx/compose/runtime/x3;", "S", "()Landroidx/compose/runtime/x3;", "Landroidx/compose/runtime/collection/i;", "Landroidx/compose/runtime/collection/i;", "observations", "i", "conditionallyInvalidatedScopes", "j", "derivedStates", "k", "Landroidx/compose/runtime/changelist/d;", "l", "lateChanges", "observationsProcessed", "Landroidx/compose/runtime/collection/c;", "invalidations", "Z", "P", "f0", "(Z)V", "Q", "pendingInvalidScopes", "Landroidx/compose/runtime/b0;", "invalidationDelegate", "invalidationDelegateGroup", "Landroidx/compose/runtime/i0;", "Landroidx/compose/runtime/i0;", "O", "()Landroidx/compose/runtime/i0;", "observerHolder", "Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/v;", "composer", "t", "Lkotlin/coroutines/g;", "_recomposeContext", "u", "isRoot", "v", "disposed", "w", "Lld/p;", "()Lld/p;", "e0", "composable", "areChildrenComposing", "N", "()Ljava/util/Set;", "observedObjects", "derivedStateDependencies", "()Ljava/util/List;", "conditionalScopes", "()Lkotlin/coroutines/g;", "J", "isComposing", "isDisposed", "D", "hasPendingChanges", "hasInvalidations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 7 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 16 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 17 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 18 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1381:1\n1047#1,2:1396\n1205#1,3:1398\n1037#1,6:1402\n1208#1,7:1408\n1049#1,4:1415\n1047#1,2:1850\n1205#1,3:1852\n1037#1,6:1855\n1208#1,7:1861\n1049#1,4:1868\n1047#1,2:1881\n1205#1,10:1883\n1049#1,4:1893\n1047#1,2:1988\n1205#1,10:1990\n1049#1,4:2000\n1047#1,2:2005\n1205#1,10:2007\n1049#1,4:2017\n1047#1,2:2022\n1205#1,10:2024\n1049#1,4:2034\n1205#1,10:2038\n82#2:1382\n82#2:1384\n82#2:1385\n82#2:1401\n82#2:1419\n82#2:1428\n82#2:1429\n82#2:1812\n82#2:1849\n82#2:1987\n82#2:2004\n82#2:2021\n82#2:2048\n82#2:2051\n82#2:2052\n82#2:2053\n1#3:1383\n1#3:2064\n93#4,2:1386\n33#4,4:1388\n95#4,2:1392\n38#4:1394\n97#4:1395\n110#4,2:1872\n33#4,6:1874\n112#4:1880\n33#4,6:2067\n166#5,8:1420\n166#5,8:1897\n166#5,8:1908\n166#5,8:2076\n108#6,7:1430\n108#6,5:1475\n114#6:1516\n70#7,5:1437\n78#7,4:1469\n70#7,5:1480\n78#7,4:1512\n124#7:1546\n125#7,5:1562\n130#7,5:1594\n138#7:1609\n124#7:1610\n125#7,5:1626\n130#7,5:1660\n138#7:1675\n124#7:1676\n125#7,5:1692\n130#7,5:1726\n138#7:1741\n70#7,5:1776\n78#7,4:1808\n70#7,5:1813\n78#7,4:1845\n124#7:1920\n125#7,5:1936\n130#7,5:1970\n138#7:1985\n267#8,4:1442\n237#8,7:1446\n248#8,3:1454\n251#8,2:1458\n272#8,2:1460\n254#8,6:1462\n274#8:1468\n267#8,4:1485\n237#8,7:1489\n248#8,3:1497\n251#8,2:1501\n272#8,2:1503\n254#8,6:1505\n274#8:1511\n237#8,16:1519\n272#8,2:1535\n254#8,6:1537\n274#8:1543\n237#8,7:1569\n248#8,3:1577\n251#8,2:1581\n254#8,6:1587\n237#8,16:1633\n254#8,6:1653\n237#8,16:1699\n254#8,6:1719\n267#8,4:1781\n237#8,7:1785\n248#8,3:1793\n251#8,2:1797\n272#8,2:1799\n254#8,6:1801\n274#8:1807\n267#8,4:1818\n237#8,7:1822\n248#8,3:1830\n251#8,2:1834\n272#8,2:1836\n254#8,6:1838\n274#8:1844\n237#8,16:1943\n254#8,6:1963\n1810#9:1453\n1672#9:1457\n1810#9:1496\n1672#9:1500\n1810#9:1554\n1672#9:1558\n1810#9:1576\n1672#9:1580\n1810#9:1618\n1672#9:1622\n1810#9:1684\n1672#9:1688\n1810#9:1759\n1672#9:1763\n1810#9:1792\n1672#9:1796\n1810#9:1829\n1672#9:1833\n1810#9:1928\n1672#9:1932\n396#10,2:1473\n399#10:1517\n401#10:1545\n1855#11:1518\n1856#11:1544\n1047#12:1547\n1049#12:1561\n1050#12,3:1599\n1053#12:1608\n1047#12:1611\n1049#12:1625\n1050#12,3:1665\n1053#12:1674\n1047#12:1677\n1049#12:1691\n1050#12,3:1731\n1053#12:1740\n1047#12:1921\n1049#12:1935\n1050#12,3:1975\n1053#12:1984\n363#13,6:1548\n373#13,3:1555\n376#13,2:1559\n379#13,6:1602\n363#13,6:1612\n373#13,3:1619\n376#13,2:1623\n379#13,6:1668\n363#13,6:1678\n373#13,3:1685\n376#13,2:1689\n379#13,6:1734\n363#13,6:1922\n373#13,3:1929\n376#13,2:1933\n379#13,6:1978\n842#14,2:1567\n845#14,4:1583\n849#14:1593\n842#14,2:1631\n845#14,4:1649\n849#14:1659\n842#14,2:1697\n845#14,4:1715\n849#14:1725\n842#14,2:1941\n845#14,4:1959\n849#14:1969\n1368#15,7:1742\n50#16:1749\n50#16:1767\n415#17,3:1750\n373#17,6:1753\n383#17,3:1760\n386#17,2:1764\n419#17:1766\n420#17:1768\n389#17,6:1769\n421#17:1775\n46#18,3:1905\n50#18:1916\n46#18,3:1917\n50#18:1986\n46#18,3:2073\n50#18:2084\n13579#19,2:2049\n11653#19,9:2054\n13579#19:2063\n13580#19:2065\n11662#19:2066\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n715#1:1396,2\n715#1:1398,3\n718#1:1402,6\n715#1:1408,7\n715#1:1415,4\n932#1:1850,2\n932#1:1852,3\n933#1:1855,6\n932#1:1861,7\n932#1:1868,4\n953#1:1881,2\n953#1:1883,10\n953#1:1893,4\n1004#1:1988,2\n1004#1:1990,10\n1004#1:2000,4\n1013#1:2005,2\n1013#1:2007,10\n1013#1:2017,4\n1023#1:2022,2\n1023#1:2024,10\n1023#1:2034,4\n1048#1:2038,10\n616#1:1382\n638#1:1384\n655#1:1385\n716#1:1401\n733#1:1419\n779#1:1428\n800#1:1429\n920#1:1812\n930#1:1849\n1003#1:1987\n1012#1:2004\n1022#1:2021\n1062#1:2048\n1068#1:2051\n1103#1:2052\n1130#1:2053\n1192#1:2064\n662#1:1386,2\n662#1:1388,4\n662#1:1392,2\n662#1:1394\n662#1:1395\n952#1:1872,2\n952#1:1874,6\n952#1:1880\n1193#1:2067,6\n764#1:1420,8\n961#1:1897,8\n975#1:1908,8\n1335#1:2076,8\n811#1:1430,7\n848#1:1475,5\n848#1:1516\n829#1:1437,5\n829#1:1469,4\n854#1:1480,5\n854#1:1512,4\n862#1:1546\n862#1:1562,5\n862#1:1594,5\n862#1:1609\n869#1:1610\n869#1:1626,5\n869#1:1660,5\n869#1:1675\n876#1:1676\n876#1:1692,5\n876#1:1726,5\n876#1:1741\n912#1:1776,5\n912#1:1808,4\n925#1:1813,5\n925#1:1845,4\n990#1:1920\n990#1:1936,5\n990#1:1970,5\n990#1:1985\n829#1:1442,4\n829#1:1446,7\n829#1:1454,3\n829#1:1458,2\n829#1:1460,2\n829#1:1462,6\n829#1:1468\n854#1:1485,4\n854#1:1489,7\n854#1:1497,3\n854#1:1501,2\n854#1:1503,2\n854#1:1505,6\n854#1:1511\n854#1:1519,16\n854#1:1535,2\n854#1:1537,6\n854#1:1543\n862#1:1569,7\n862#1:1577,3\n862#1:1581,2\n862#1:1587,6\n869#1:1633,16\n869#1:1653,6\n876#1:1699,16\n876#1:1719,6\n912#1:1781,4\n912#1:1785,7\n912#1:1793,3\n912#1:1797,2\n912#1:1799,2\n912#1:1801,6\n912#1:1807\n925#1:1818,4\n925#1:1822,7\n925#1:1830,3\n925#1:1834,2\n925#1:1836,2\n925#1:1838,6\n925#1:1844\n990#1:1943,16\n990#1:1963,6\n829#1:1453\n829#1:1457\n854#1:1496\n854#1:1500\n862#1:1554\n862#1:1558\n862#1:1576\n862#1:1580\n869#1:1618\n869#1:1622\n876#1:1684\n876#1:1688\n898#1:1759\n898#1:1763\n912#1:1792\n912#1:1796\n925#1:1829\n925#1:1833\n990#1:1928\n990#1:1932\n848#1:1473,2\n848#1:1517\n848#1:1545\n848#1:1518\n848#1:1544\n862#1:1547\n862#1:1561\n862#1:1599,3\n862#1:1608\n869#1:1611\n869#1:1625\n869#1:1665,3\n869#1:1674\n876#1:1677\n876#1:1691\n876#1:1731,3\n876#1:1740\n990#1:1921\n990#1:1935\n990#1:1975,3\n990#1:1984\n862#1:1548,6\n862#1:1555,3\n862#1:1559,2\n862#1:1602,6\n869#1:1612,6\n869#1:1619,3\n869#1:1623,2\n869#1:1668,6\n876#1:1678,6\n876#1:1685,3\n876#1:1689,2\n876#1:1734,6\n990#1:1922,6\n990#1:1929,3\n990#1:1933,2\n990#1:1978,6\n862#1:1567,2\n862#1:1583,4\n862#1:1593\n869#1:1631,2\n869#1:1649,4\n869#1:1659\n876#1:1697,2\n876#1:1715,4\n876#1:1725\n990#1:1941,2\n990#1:1959,4\n990#1:1969\n878#1:1742,7\n890#1:1749\n900#1:1767\n898#1:1750,3\n898#1:1753,6\n898#1:1760,3\n898#1:1764,2\n898#1:1766\n898#1:1768\n898#1:1769,6\n898#1:1775\n971#1:1905,3\n971#1:1916\n988#1:1917,3\n988#1:1986\n1331#1:2073,3\n1331#1:2084\n1063#1:2049,2\n1192#1:2054,9\n1192#1:2063\n1192#1:2065\n1192#1:2066\n*E\n"})
/* loaded from: classes.dex */
public final class b0 implements n0, r3, h3, l0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int f15942x = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z parent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e<?> applier;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<Object> pendingModifications;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashSet<p3> abandonSet;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 slotTable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.i<f3> observations;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashSet<f3> conditionallyInvalidatedScopes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.i<r0<?>> derivedStates;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.changelist.d changes;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.changelist.d lateChanges;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.i<f3> observationsProcessed;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> invalidations;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b0 invalidationDelegate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int invalidationDelegateGroup;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0 observerHolder;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v composer;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final kotlin.coroutines.g _recomposeContext;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.p<? super t, ? super Integer, kotlin.k2> composable;

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/runtime/b0$a;", "Landroidx/compose/runtime/o3;", "", "Landroidx/compose/runtime/p3;", "abandoning", "<init>", "(Ljava/util/Set;)V", "instance", "Lkotlin/k2;", "e", "(Landroidx/compose/runtime/p3;)V", "b", "Lkotlin/Function0;", "effect", "a", "(Lld/a;)V", "Landroidx/compose/runtime/r;", "d", "(Landroidx/compose/runtime/r;)V", "c", "g", "()V", "h", "f", "Ljava/util/Set;", "", "Ljava/util/List;", "remembering", "", "forgetting", "sideEffects", "Landroidx/collection/k2;", "Landroidx/collection/k2;", "releasing", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1381:1\n1#2:1382\n46#3,5:1383\n46#3,3:1388\n50#3:1397\n46#3,3:1398\n50#3:1407\n46#3,5:1408\n33#4,6:1391\n33#4,6:1401\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1270#1:1383,5\n1292#1:1388,3\n1292#1:1397\n1303#1:1398,3\n1303#1:1407\n1314#1:1408,5\n1293#1:1391,6\n1304#1:1401,6\n*E\n"})
    private static final class a implements o3 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Set<p3> abandoning;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<p3> remembering = new ArrayList();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<Object> forgetting = new ArrayList();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<ld.a<kotlin.k2>> sideEffects = new ArrayList();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private androidx.collection.k2<r> releasing;

        public a(@fg.l Set<p3> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.o3
        public void a(@fg.l ld.a<kotlin.k2> effect) {
            this.sideEffects.add(effect);
        }

        @Override // androidx.compose.runtime.o3
        public void b(@fg.l p3 instance) {
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.o3
        public void c(@fg.l r instance) {
            androidx.collection.k2<r> k2Var = this.releasing;
            if (k2Var == null) {
                k2Var = androidx.collection.z2.b();
                this.releasing = k2Var;
            }
            k2Var.Z(instance);
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.o3
        public void d(@fg.l r instance) {
            this.forgetting.add(instance);
        }

        @Override // androidx.compose.runtime.o3
        public void e(@fg.l p3 instance) {
            this.remembering.add(instance);
        }

        public final void f() {
            if (this.abandoning.isEmpty()) {
                return;
            }
            g5.f16432a.getClass();
            Trace.beginSection("Compose:abandons");
            try {
                Iterator<p3> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    p3 next = it.next();
                    it.remove();
                    next.c();
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                g5.f16432a.getClass();
                Trace.endSection();
            } catch (Throwable th) {
                g5.f16432a.getClass();
                Trace.endSection();
                throw th;
            }
        }

        public final void g() {
            if (!this.forgetting.isEmpty()) {
                g5.f16432a.getClass();
                Trace.beginSection("Compose:onForgotten");
                try {
                    androidx.collection.y2 y2Var = this.releasing;
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        Object obj = this.forgetting.get(size);
                        kotlin.jvm.internal.u1.a(this.abandoning).remove(obj);
                        if (obj instanceof p3) {
                            ((p3) obj).d();
                        }
                        if (obj instanceof r) {
                            if (y2Var == null || !y2Var.e(obj)) {
                                ((r) obj).k();
                            } else {
                                ((r) obj).e();
                            }
                        }
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                    g5.f16432a.getClass();
                    Trace.endSection();
                } finally {
                }
            }
            if (this.remembering.isEmpty()) {
                return;
            }
            g5.f16432a.getClass();
            Trace.beginSection("Compose:onRemembered");
            try {
                List<p3> list = this.remembering;
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    p3 p3Var = list.get(i4);
                    this.abandoning.remove(p3Var);
                    p3Var.b();
                }
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                g5.f16432a.getClass();
                Trace.endSection();
            } finally {
            }
        }

        public final void h() {
            if (this.sideEffects.isEmpty()) {
                return;
            }
            g5.f16432a.getClass();
            Trace.beginSection("Compose:sideeffects");
            try {
                List<ld.a<kotlin.k2>> list = this.sideEffects;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    list.get(i4).invoke();
                }
                this.sideEffects.clear();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                g5.f16432a.getClass();
                Trace.endSection();
            } catch (Throwable th) {
                g5.f16432a.getClass();
                Trace.endSection();
                throw th;
            }
        }
    }

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/b0$b", "Landroidx/compose/runtime/tooling/d;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$observe$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1381:1\n82#2:1382\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$observe$2\n*L\n644#1:1382\n*E\n"})
    public static final class b implements androidx.compose.runtime.tooling.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.tooling.c f15971b;

        b(androidx.compose.runtime.tooling.c cVar) {
            this.f15971b = cVar;
        }

        @Override // androidx.compose.runtime.tooling.d
        public void dispose() {
            Object obj = b0.this.lock;
            b0 b0Var = b0.this;
            androidx.compose.runtime.tooling.c cVar = this.f15971b;
            synchronized (obj) {
                try {
                    if (kotlin.jvm.internal.l0.g(b0Var.getObserverHolder().getObserver(), cVar)) {
                        b0Var.getObserverHolder().c(null);
                        b0Var.getObserverHolder().d(false);
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public b0(@fg.l z zVar, @fg.l e<?> eVar, @fg.m kotlin.coroutines.g gVar) {
        this.parent = zVar;
        this.applier = eVar;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<p3> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        x3 x3Var = new x3();
        this.slotTable = x3Var;
        this.observations = new androidx.compose.runtime.collection.i<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new androidx.compose.runtime.collection.i<>();
        androidx.compose.runtime.changelist.d dVar = new androidx.compose.runtime.changelist.d();
        this.changes = dVar;
        androidx.compose.runtime.changelist.d dVar2 = new androidx.compose.runtime.changelist.d();
        this.lateChanges = dVar2;
        this.observationsProcessed = new androidx.compose.runtime.collection.i<>();
        int i4 = 0;
        this.invalidations = new androidx.compose.runtime.collection.c<>(i4, 1, null);
        this.observerHolder = new i0(null, false, 3, null);
        v vVar = new v(eVar, zVar, x3Var, hashSet, dVar, dVar2, this);
        zVar.q(vVar);
        this.composer = vVar;
        this._recomposeContext = gVar;
        this.isRoot = zVar instanceof i3;
        l.f16830a.getClass();
        this.composable = l.f16831b;
    }

    public static /* synthetic */ void Q() {
    }

    public static /* synthetic */ void T() {
    }

    private final <T> T U(ld.a<? extends T> block) {
        try {
            return block.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).f();
                }
                throw th;
            } catch (Exception e4) {
                f();
                throw e4;
            }
        }
    }

    private final <T> T V(ld.l<? super androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>>, ? extends T> block) {
        androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> g02 = g0();
        try {
            return block.invoke(g02);
        } catch (Exception e4) {
            this.invalidations = g02;
            throw e4;
        }
    }

    private final s1 W(f3 scope, d anchor, Object instance) {
        synchronized (this.lock) {
            try {
                b0 b0Var = this.invalidationDelegate;
                if (b0Var == null || !this.slotTable.V(this.invalidationDelegateGroup, anchor)) {
                    b0Var = null;
                }
                if (b0Var == null) {
                    if (i0(scope, instance)) {
                        return s1.IMMINENT;
                    }
                    if (instance == null) {
                        this.invalidations.q(scope, null);
                    } else {
                        c0.h(this.invalidations, scope, instance);
                    }
                }
                if (b0Var != null) {
                    return b0Var.W(scope, anchor, instance);
                }
                this.parent.l(this);
                return this.composer.getIsComposing() ? s1.DEFERRED : s1.SCHEDULED;
            } finally {
            }
        }
    }

    private final void Y(Object value) {
        Object p4 = this.observations.e().p(value);
        if (p4 == null) {
            return;
        }
        if (!(p4 instanceof androidx.collection.k2)) {
            f3 f3Var = (f3) p4;
            if (f3Var.w(value) == s1.IMMINENT) {
                this.observationsProcessed.a(value, f3Var);
                return;
            }
            return;
        }
        androidx.collection.k2 k2Var = (androidx.collection.k2) p4;
        Object[] objArr = k2Var.elements;
        long[] jArr = k2Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        f3 f3Var2 = (f3) objArr[(i4 << 3) + i6];
                        if (f3Var2.w(value) == s1.IMMINENT) {
                            this.observationsProcessed.a(value, f3Var2);
                        }
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    private final androidx.compose.runtime.tooling.c b0() {
        i0 i0Var = this.observerHolder;
        if (i0Var.getRoot()) {
            return i0Var.getObserver();
        }
        i0 observerHolder = this.parent.getObserverHolder();
        androidx.compose.runtime.tooling.c observer = observerHolder != null ? observerHolder.getObserver() : null;
        if (!kotlin.jvm.internal.l0.g(observer, i0Var.getObserver())) {
            i0Var.c(observer);
        }
        return observer;
    }

    private final void f() {
        this.pendingModifications.set(null);
        this.changes.c();
        this.lateChanges.c();
        this.abandonSet.clear();
    }

    private final androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> g0() {
        androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> cVar = this.invalidations;
        this.invalidations = new androidx.compose.runtime.collection.c<>(0, 1, null);
        return cVar;
    }

    private final <T> T h0(ld.a<? extends T> block) {
        try {
            return block.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new a(this.abandonSet).f();
            }
            throw th;
        }
    }

    private final boolean i0(f3 scope, Object instance) {
        return this.composer.getIsComposing() && this.composer.S1(scope, instance);
    }

    private final void j0(x3 slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            f3 f3Var = obj instanceof f3 ? (f3) obj : null;
            if (f3Var != null) {
                arrayList.add(f3Var);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            f3 f3Var2 = (f3) arrayList.get(i4);
            d anchor = f3Var2.getAnchor();
            if (anchor != null && !slotTable.n0(slotTable.i(anchor)).contains(f3Var2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + f3Var2 + " encountered, scope found at " + kotlin.collections.l.If(slotTable.getSlots(), f3Var2)).toString());
            }
        }
    }

    private final HashSet<f3> m(HashSet<f3> hashSet, Object obj, boolean z4) {
        HashSet<f3> hashSet2;
        Object p4 = this.observations.e().p(obj);
        if (p4 != null) {
            if (p4 instanceof androidx.collection.k2) {
                androidx.collection.k2 k2Var = (androidx.collection.k2) p4;
                Object[] objArr = k2Var.elements;
                long[] jArr = k2Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr[i4];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j4) < 128) {
                                    f3 f3Var = (f3) objArr[(i4 << 3) + i6];
                                    if (!this.observationsProcessed.g(obj, f3Var) && f3Var.w(obj) != s1.IGNORED) {
                                        if (!f3Var.x() || z4) {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet<>();
                                            }
                                            hashSet2.add(f3Var);
                                        } else {
                                            this.conditionallyInvalidatedScopes.add(f3Var);
                                        }
                                    }
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            f3 f3Var2 = (f3) p4;
            if (!this.observationsProcessed.g(obj, f3Var2) && f3Var2.w(obj) != s1.IGNORED) {
                if (!f3Var2.x() || z4) {
                    HashSet<f3> hashSet3 = hashSet == null ? new HashSet<>() : hashSet;
                    hashSet3.add(f3Var2);
                    return hashSet3;
                }
                this.conditionallyInvalidatedScopes.add(f3Var2);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0251, code lost:
    
        if (r15.contains(r14) == true) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(java.util.Set<? extends java.lang.Object> r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.b0.n(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(androidx.compose.runtime.changelist.d r30) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.b0.o(androidx.compose.runtime.changelist.d):void");
    }

    private final void p() {
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        long j4;
        int i10;
        boolean z4;
        Object[] objArr;
        int i11;
        Object[] objArr2;
        androidx.collection.j2<Object, Object> e4 = this.derivedStates.e();
        long[] jArr3 = e4.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j5 = jArr3[i12];
                char c5 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j5 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = e4.keys[i16];
                            Object obj2 = e4.values[i16];
                            if (obj2 instanceof androidx.collection.k2) {
                                kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                androidx.collection.k2 k2Var = (androidx.collection.k2) obj2;
                                Object[] objArr3 = k2Var.elements;
                                long[] jArr4 = k2Var.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i5 = length;
                                if (length2 >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j7 = jArr4[i17];
                                        i7 = i14;
                                        long[] jArr5 = jArr4;
                                        j4 = -9187201950435737472L;
                                        if ((((~j7) << c5) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j7 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    objArr2 = objArr3;
                                                    i11 = i12;
                                                    if (!this.observations.c((r0) objArr3[i20])) {
                                                        k2Var.j0(i20);
                                                    }
                                                } else {
                                                    i11 = i12;
                                                    objArr2 = objArr3;
                                                }
                                                j7 >>= 8;
                                                i19++;
                                                i12 = i11;
                                                objArr3 = objArr2;
                                            }
                                            i6 = i12;
                                            objArr = objArr3;
                                            if (i18 != 8) {
                                                break;
                                            }
                                        } else {
                                            i6 = i12;
                                            objArr = objArr3;
                                        }
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        i14 = i7;
                                        jArr4 = jArr5;
                                        i12 = i6;
                                        objArr3 = objArr;
                                        c5 = 7;
                                    }
                                } else {
                                    i6 = i12;
                                    i7 = i14;
                                    j4 = -9187201950435737472L;
                                }
                                z4 = k2Var.r();
                            } else {
                                jArr2 = jArr3;
                                i5 = length;
                                i6 = i12;
                                i7 = i14;
                                j4 = j6;
                                kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                z4 = !this.observations.c((r0) obj2);
                            }
                            if (z4) {
                                e4.o0(i16);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i5 = length;
                            i6 = i12;
                            i7 = i14;
                            j4 = j6;
                            i10 = i13;
                        }
                        j5 >>= i10;
                        i15++;
                        i13 = i10;
                        j6 = j4;
                        jArr3 = jArr2;
                        length = i5;
                        i14 = i7;
                        i12 = i6;
                        c5 = 7;
                    }
                    jArr = jArr3;
                    int i21 = length;
                    int i22 = i12;
                    if (i14 != i13) {
                        break;
                    }
                    length = i21;
                    i4 = i22;
                } else {
                    jArr = jArr3;
                    i4 = i12;
                }
                if (i4 == length) {
                    break;
                }
                i12 = i4 + 1;
                jArr3 = jArr;
            }
        }
        if (this.conditionallyInvalidatedScopes.isEmpty()) {
            return;
        }
        Iterator<f3> it = this.conditionallyInvalidatedScopes.iterator();
        while (it.hasNext()) {
            if (!it.next().x()) {
                it.remove();
            }
        }
    }

    private final void q(ld.p<? super t, ? super Integer, kotlin.k2> content) {
        if (this.disposed) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.parent.a(this, content);
    }

    private final void r() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = c0.f15978a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = c0.f15978a;
            if (kotlin.jvm.internal.l0.g(andSet, obj2)) {
                throw u.a("pending composition has not been applied");
            }
            if (andSet instanceof Set) {
                n((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                x.x("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                n(set, true);
            }
        }
    }

    private final void s() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = c0.f15978a;
        if (kotlin.jvm.internal.l0.g(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            n((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw u.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
            x.x("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            n(set, false);
        }
    }

    private final boolean t() {
        return this.composer.b1();
    }

    @Override // androidx.compose.runtime.n0
    public <R> R A(@fg.m n0 to, int groupIndex, @fg.l ld.a<? extends R> block) {
        if (to == null || kotlin.jvm.internal.l0.g(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (b0) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.n0
    public void B(@fg.l e2 state) {
        a aVar = new a(this.abandonSet);
        a4 e02 = state.getSlotTable().e0();
        try {
            x.h0(e02, aVar);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            e02.N();
            aVar.g();
        } catch (Throwable th) {
            e02.N();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.n0
    public void C(@fg.l List<kotlin.q0<f2, f2>> references) {
        int size = references.size();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z4 = true;
                break;
            } else if (!kotlin.jvm.internal.l0.g(references.get(i4).e().getComposition(), this)) {
                break;
            } else {
                i4++;
            }
        }
        x.l0(z4);
        try {
            this.composer.q(references);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.n0
    public boolean D() {
        boolean g12;
        synchronized (this.lock) {
            g12 = this.composer.g1();
        }
        return g12;
    }

    @Override // androidx.compose.runtime.n0
    public boolean E() {
        boolean w12;
        synchronized (this.lock) {
            try {
                r();
                try {
                    androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> g02 = g0();
                    try {
                        androidx.compose.runtime.tooling.c b02 = b0();
                        if (b02 != null) {
                            Map<f3, androidx.compose.runtime.collection.d<Object>> b5 = g02.b();
                            kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                            b02.a(this, b5);
                        }
                        w12 = this.composer.w1(g02);
                        if (!w12) {
                            s();
                        }
                        if (b02 != null) {
                            b02.b(this);
                        }
                    } catch (Exception e4) {
                        this.invalidations = g02;
                        throw e4;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w12;
    }

    @Override // androidx.compose.runtime.n0
    public boolean F(@fg.l Set<? extends Object> values) {
        if (!(values instanceof androidx.compose.runtime.collection.d)) {
            for (Object obj : values) {
                if (this.observations.c(obj) || this.derivedStates.c(obj)) {
                    return true;
                }
            }
            return false;
        }
        androidx.compose.runtime.collection.d dVar = (androidx.compose.runtime.collection.d) values;
        Object[] values2 = dVar.getValues();
        int size = dVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj2 = values2[i4];
            kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.observations.c(obj2) || this.derivedStates.c(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.n0
    public void G() {
        synchronized (this.lock) {
            try {
                if (!this.composer.getIsComposing()) {
                    this.composer.g2();
                    this.slotTable.r0();
                    j0(this.slotTable);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.n0
    public void H(@fg.l Set<? extends Object> values) {
        Object obj;
        Object obj2;
        boolean g4;
        Set<? extends Object> set;
        do {
            obj = this.pendingModifications.get();
            if (obj == null) {
                g4 = true;
            } else {
                obj2 = c0.f15978a;
                g4 = kotlin.jvm.internal.l0.g(obj, obj2);
            }
            if (g4) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set = kotlin.collections.l.w3((Set[]) obj, values);
            }
        } while (!androidx.compose.animation.core.k1.a(this.pendingModifications, obj, set));
        if (obj == null) {
            synchronized (this.lock) {
                s();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
        }
    }

    @Override // androidx.compose.runtime.n0
    public void I() {
        synchronized (this.lock) {
            try {
                o(this.changes);
                s();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th;
                    } catch (Exception e4) {
                        f();
                        throw e4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.n0
    public boolean J() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.n0
    public void K(@fg.l Object value) {
        synchronized (this.lock) {
            try {
                Y(value);
                Object p4 = this.derivedStates.e().p(value);
                if (p4 != null) {
                    if (p4 instanceof androidx.collection.k2) {
                        androidx.collection.k2 k2Var = (androidx.collection.k2) p4;
                        Object[] objArr = k2Var.elements;
                        long[] jArr = k2Var.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j4 = jArr[i4];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j4) < 128) {
                                            Y((r0) objArr[(i4 << 3) + i6]);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i5 != 8) {
                                        break;
                                    }
                                }
                                if (i4 == length) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        Y((r0) p4);
                    }
                }
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.n0
    public void L(@fg.l ld.a<kotlin.k2> block) {
        this.composer.v1(block);
    }

    @Override // androidx.compose.runtime.n0
    public void M() {
        synchronized (this.lock) {
            try {
                this.composer.G0();
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).f();
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th;
                    } catch (Exception e4) {
                        f();
                        throw e4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @fg.l
    @fg.p
    public final Set<Object> N() {
        androidx.collection.j2<Object, Object> e4 = this.observations.e();
        e4.getClass();
        return new w2.a().keySet();
    }

    @fg.l
    /* renamed from: O, reason: from getter */
    public final i0 getObserverHolder() {
        return this.observerHolder;
    }

    /* renamed from: P, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @fg.l
    public final kotlin.coroutines.g R() {
        kotlin.coroutines.g gVar = this._recomposeContext;
        return gVar == null ? this.parent.j() : gVar;
    }

    @fg.l
    /* renamed from: S, reason: from getter */
    public final x3 getSlotTable() {
        return this.slotTable;
    }

    public final void X(int key) {
        List<f3> Z;
        synchronized (this.lock) {
            Z = this.slotTable.Z(key);
        }
        if (Z != null) {
            int size = Z.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (Z.get(i4).w(null) != s1.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.a1()) {
            this.parent.l(this);
        }
    }

    /* renamed from: Z, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.n0, androidx.compose.runtime.h3
    public void a(@fg.l Object value) {
        f3 d12;
        if (this.composer.b1() || (d12 = this.composer.d1()) == null) {
            return;
        }
        d12.L(true);
        if (d12.A(value)) {
            return;
        }
        if (value instanceof androidx.compose.runtime.snapshots.q0) {
            i.Companion companion = androidx.compose.runtime.snapshots.i.INSTANCE;
            ((androidx.compose.runtime.snapshots.q0) value).y(1);
        }
        this.observations.a(value, d12);
        if (!(value instanceof r0)) {
            return;
        }
        this.derivedStates.h(value);
        androidx.collection.n2<androidx.compose.runtime.snapshots.p0> b5 = ((r0) value).P().b();
        Object[] objArr = b5.keys;
        long[] jArr = b5.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128) {
                        androidx.compose.runtime.snapshots.p0 p0Var = (androidx.compose.runtime.snapshots.p0) objArr[(i4 << 3) + i6];
                        if (p0Var instanceof androidx.compose.runtime.snapshots.q0) {
                            i.Companion companion2 = androidx.compose.runtime.snapshots.i.INSTANCE;
                            ((androidx.compose.runtime.snapshots.q0) p0Var).y(1);
                        }
                        this.derivedStates.a(p0Var, value);
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    @fg.l
    public final androidx.compose.runtime.tooling.d a0(@fg.l androidx.compose.runtime.tooling.c observer) {
        synchronized (this.lock) {
            this.observerHolder.c(observer);
            this.observerHolder.d(true);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
        return new b(observer);
    }

    @Override // androidx.compose.runtime.y
    /* renamed from: b, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.h3
    public void c(@fg.l f3 scope) {
        this.pendingInvalidScopes = true;
    }

    public final void c0(@fg.l r0<?> state) {
        if (this.observations.c(state)) {
            return;
        }
        this.derivedStates.h(state);
    }

    @Override // androidx.compose.runtime.h3
    @fg.l
    public s1 d(@fg.l f3 scope, @fg.m Object instance) {
        b0 b0Var;
        if (scope.n()) {
            scope.G(true);
        }
        d anchor = scope.getAnchor();
        if (anchor == null || !anchor.b()) {
            return s1.IGNORED;
        }
        if (this.slotTable.f0(anchor)) {
            return !scope.m() ? s1.IGNORED : W(scope, anchor, instance);
        }
        synchronized (this.lock) {
            b0Var = this.invalidationDelegate;
        }
        return (b0Var == null || !b0Var.i0(scope, instance)) ? s1.IGNORED : s1.IMMINENT;
    }

    public final void d0(@fg.l Object instance, @fg.l f3 scope) {
        this.observations.g(instance, scope);
    }

    @Override // androidx.compose.runtime.r3
    public void deactivate() {
        boolean z4 = this.slotTable.getGroupsSize() > 0;
        if (z4 || !this.abandonSet.isEmpty()) {
            g5 g5Var = g5.f16432a;
            g5Var.getClass();
            Trace.beginSection("Compose:deactivate");
            try {
                a aVar = new a(this.abandonSet);
                if (z4) {
                    this.applier.j();
                    a4 e02 = this.slotTable.e0();
                    try {
                        x.y(e02, aVar);
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                        e02.N();
                        this.applier.f();
                        aVar.g();
                    } catch (Throwable th) {
                        e02.N();
                        throw th;
                    }
                }
                aVar.f();
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                g5Var.getClass();
                Trace.endSection();
            } catch (Throwable th2) {
                g5.f16432a.getClass();
                Trace.endSection();
                throw th2;
            }
        }
        this.observations.b();
        this.derivedStates.b();
        this.invalidations.c();
        this.changes.c();
        this.composer.O0();
    }

    @Override // androidx.compose.runtime.y
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    boolean z4 = true;
                    this.disposed = true;
                    l.f16830a.getClass();
                    this.composable = l.f16832c;
                    androidx.compose.runtime.changelist.d deferredChanges = this.composer.getDeferredChanges();
                    if (deferredChanges != null) {
                        o(deferredChanges);
                    }
                    if (this.slotTable.getGroupsSize() <= 0) {
                        z4 = false;
                    }
                    if (z4 || !this.abandonSet.isEmpty()) {
                        a aVar = new a(this.abandonSet);
                        if (z4) {
                            this.applier.j();
                            a4 e02 = this.slotTable.e0();
                            try {
                                x.h0(e02, aVar);
                                kotlin.k2 k2Var = kotlin.k2.f75408a;
                                e02.N();
                                this.applier.clear();
                                this.applier.f();
                                aVar.g();
                            } catch (Throwable th) {
                                e02.N();
                                throw th;
                            }
                        }
                        aVar.f();
                    }
                    this.composer.P0();
                }
                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.v(this);
    }

    @Override // androidx.compose.runtime.y
    public void e(@fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
        q(content);
    }

    public final void e0(@fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar) {
        this.composable = pVar;
    }

    public final void f0(boolean z4) {
        this.pendingInvalidScopes = z4;
    }

    @Override // androidx.compose.runtime.r3
    public void g(@fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
        this.composer.Q1();
        q(content);
        this.composer.U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.l0
    @fg.m
    public <T> T h(@fg.l k0<T> key) {
        if (kotlin.jvm.internal.l0.g(key, c0.i())) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.runtime.y
    public boolean i() {
        boolean z4;
        synchronized (this.lock) {
            z4 = this.invalidations.getSize() > 0;
        }
        return z4;
    }

    @fg.l
    public final ld.p<t, Integer, kotlin.k2> u() {
        return this.composable;
    }

    @fg.l
    @fg.p
    public final List<f3> v() {
        return kotlin.collections.w.V5(this.conditionallyInvalidatedScopes);
    }

    @fg.l
    @fg.p
    public final Set<Object> w() {
        androidx.collection.j2<Object, Object> e4 = this.derivedStates.e();
        e4.getClass();
        return new w2.a().keySet();
    }

    @Override // androidx.compose.runtime.n0
    public void x() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    f3 f3Var = obj instanceof f3 ? (f3) obj : null;
                    if (f3Var != null) {
                        f3Var.invalidate();
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.n0
    public void y(@fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
        androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> g02;
        try {
            synchronized (this.lock) {
                try {
                    r();
                    g02 = g0();
                    androidx.compose.runtime.tooling.c b02 = b0();
                    if (b02 != null) {
                        Map<f3, androidx.compose.runtime.collection.d<Object>> b5 = g02.b();
                        kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        b02.a(this, b5);
                    }
                    this.composer.J0(g02, content);
                    if (b02 != null) {
                        b02.b(this);
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                    }
                } catch (Exception e4) {
                    this.invalidations = g02;
                    throw e4;
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.n0
    public void z() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.g()) {
                    o(this.lateChanges);
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th;
                    } catch (Exception e4) {
                        f();
                        throw e4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ b0(z zVar, e eVar, kotlin.coroutines.g gVar, int i4, kotlin.jvm.internal.w wVar) {
        this(zVar, eVar, (i4 & 4) != 0 ? null : gVar);
    }
}
