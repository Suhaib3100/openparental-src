package androidx.compose.ui.node;

import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.graphics.y4;
import androidx.compose.ui.graphics.z5;
import androidx.compose.ui.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b \u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¦\u0002\u0084\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J@\u0010,\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-JH\u0010/\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100JH\u00101\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00100J\u0013\u00102\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\"\u00107\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J\"\u00109\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u00108J\"\u0010;\u001a\u00020&2\u0006\u00104\u001a\u00020\u00002\u0006\u0010:\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00182\u0006\u0010B\u001a\u00020=2\u0006\u0010?\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ4\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u00020G2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\u0016H\u0086\b¢\u0006\u0004\bJ\u0010KJ=\u0010M\u001a\u00020\u0018\"\u0006\b\u0000\u0010L\u0018\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u001e\u0010O\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0018H\u0010¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0018H&¢\u0006\u0004\bU\u0010TJ\u001f\u0010X\u001a\u00020\u00182\u0006\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u00020GH\u0014¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0018H\u0000¢\u0006\u0004\bZ\u0010TJ+\u0010_\u001a\u00020^2\u0006\u0010\\\u001a\u00020[2\u000e\b\u0004\u0010I\u001a\b\u0012\u0004\u0012\u00020^0]H\u0084\bø\u0001\u0000¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0018¢\u0006\u0004\ba\u0010TJ=\u0010b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000¢\u0006\u0004\bb\u0010\u001cJ;\u0010c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019ø\u0001\u0000¢\u0006\u0004\bc\u0010\u001cJ\u0015\u0010d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bd\u0010 J\u0017\u0010e\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\be\u0010 J\r\u0010f\u001a\u00020\u0018¢\u0006\u0004\bf\u0010TJ2\u0010h\u001a\u00020\u00182\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\b\u0002\u0010g\u001a\u00020\t¢\u0006\u0004\bh\u0010iJ8\u0010j\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\bj\u0010kJ:\u0010l\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010kJ\r\u0010n\u001a\u00020m¢\u0006\u0004\bn\u0010oJ\u001a\u0010q\u001a\u00020&2\u0006\u0010p\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\bq\u0010FJ\u001a\u0010s\u001a\u00020&2\u0006\u0010r\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010FJ\"\u0010v\u001a\u00020&2\u0006\u0010t\u001a\u00020\u00032\u0006\u0010u\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\bv\u0010wJ\"\u0010L\u001a\u00020\u00182\u0006\u0010t\u001a\u00020\u00032\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010xJ\u001f\u0010y\u001a\u00020m2\u0006\u0010t\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\by\u0010zJ\u001a\u0010{\u001a\u00020&2\u0006\u0010r\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\b{\u0010FJ,\u0010|\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u0016H\u0084\b¢\u0006\u0004\b|\u0010}J\u001a\u0010~\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\b~\u0010FJ\u001a\u0010\u007f\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020&H\u0016ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010FJ$\u0010\u0082\u0001\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0004¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0084\u0001\u0010TJ\u000f\u0010\u0085\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0085\u0001\u0010TJ-\u0010\u0087\u0001\u001a\u00020\u00182\u0006\u0010B\u001a\u00020=2\u0006\u0010?\u001a\u00020\t2\t\b\u0002\u0010\u0086\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001d\u0010\u0089\u0001\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001d\u0010\u008b\u0001\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0004ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008c\u0001\u0010TJ\u0011\u0010\u008d\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008d\u0001\u0010TJ\u001b\u0010\u008f\u0001\u001a\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u000f\u0010\u0091\u0001\u001a\u00020\t¢\u0006\u0005\b\u0091\u0001\u0010RJ\u001f\u0010\u0094\u0001\u001a\u00030\u0092\u00012\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b\u0094\u0001\u0010FJ'\u0010\u0095\u0001\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R+\u0010¡\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R+\u0010¥\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009c\u0001\u001a\u0006\b£\u0001\u0010\u009e\u0001\"\u0006\b¤\u0001\u0010 \u0001R\u0019\u0010¨\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010ª\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010§\u0001RO\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\u001a\u0010«\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00198\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R\u001a\u0010³\u0001\u001a\u00030°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001a\u0010·\u0001\u001a\u00030´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010º\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001c\u0010¾\u0001\u001a\u0005\u0018\u00010»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R)\u0010Ã\u0001\u001a\u0012\u0012\u0005\u0012\u00030À\u0001\u0012\u0004\u0012\u00020G\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R7\u0010\u0013\u001a\u00020\u00122\u0007\u0010«\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010«\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010¹\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R\u001b\u0010Ñ\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001c\u0010Õ\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R*\u0010Ø\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÖ\u0001\u0010\u00ad\u0001\u0012\u0005\b×\u0001\u0010TR\u001d\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180]8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R)\u0010Þ\u0001\u001a\u00020\t2\u0007\u0010«\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bÜ\u0001\u0010§\u0001\u001a\u0005\bÝ\u0001\u0010RR0\u0010ä\u0001\u001a\u0005\u0018\u00010ß\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010ß\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0018\u0010è\u0001\u001a\u00030å\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0017\u0010ë\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010î\u0001\u001a\u00030´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0017\u0010ð\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010Ì\u0001R\u0017\u0010ò\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010Ì\u0001R\u0019\u0010õ\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u0017\u0010ø\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u001b\u0010û\u0001\u001a\u00030ù\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bú\u0001\u0010Ç\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ü\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010ô\u0001R\u0016\u0010\u0083\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010RR\u0016\u0010\u0085\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010RR,\u0010\u008b\u0002\u001a\u00030»\u00012\b\u0010\u0086\u0002\u001a\u00030»\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R0\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u008c\u00022\n\u0010«\u0001\u001a\u0005\u0018\u00010\u008c\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001f\u0010\u0095\u0002\u001a\n\u0012\u0005\u0012\u00030À\u00010\u0092\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u001a\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0096\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0016\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010÷\u0001R\u0016\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010÷\u0001R\u0017\u0010 \u0002\u001a\u00020=8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001d\u0010¢\u0002\u001a\u00020[8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¡\u0002\u0010Ç\u0001R\u0016\u0010¤\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0002\u0010RR\u001b\u0010\u0093\u0001\u001a\u00030\u0092\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¥\u0002\u0010Ç\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006§\u0002"}, d2 = {"Landroidx/compose/ui/node/e1;", "Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/node/q1;", "Landroidx/compose/ui/node/h0;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/h0;)V", "", "includeTail", "Landroidx/compose/ui/q$d;", "x3", "(Z)Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/g1;", "type", "q3", "(I)Z", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "Lkotlin/u;", "layerBlock", "A4", "(JFLld/l;)V", "Landroidx/compose/ui/graphics/v1;", "canvas", "n2", "(Landroidx/compose/ui/graphics/v1;)V", "invokeOnLayoutChange", "A5", "(Z)V", "Landroidx/compose/ui/node/e1$f;", "hitTestSource", "Li0/f;", "pointerPosition", "Landroidx/compose/ui/node/t;", "hitTestResult", "isTouchEvent", "isInLayer", "A3", "(Landroidx/compose/ui/q$d;Landroidx/compose/ui/node/e1$f;JLandroidx/compose/ui/node/t;ZZ)V", "distanceFromEdge", "D3", "(Landroidx/compose/ui/q$d;Landroidx/compose/ui/node/e1$f;JLandroidx/compose/ui/node/t;ZZF)V", "W4", "X4", "(Landroidx/compose/ui/layout/u;)Landroidx/compose/ui/node/e1;", "ancestor", "Landroidx/compose/ui/graphics/y4;", "matrix", "m5", "(Landroidx/compose/ui/node/e1;[F)V", "i5", "offset", "d2", "(Landroidx/compose/ui/node/e1;J)J", "Li0/d;", "rect", "clipBounds", "Z1", "(Landroidx/compose/ui/node/e1;Li0/d;Z)V", "bounds", "B2", "(Li0/d;Z)V", "b4", "(J)J", "", "mask", "block", "F5", "(IZLld/l;)V", "T", "G5", "(ILld/l;)V", "w3", "(I)Landroidx/compose/ui/q$d;", "Y3", "()Z", "h1", "()V", "s2", "width", "height", "l4", "(II)V", "c4", "Landroidx/compose/ui/unit/b;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/i1;", "y4", "(JLld/a;)Landroidx/compose/ui/layout/i1;", "m4", "H0", "D4", "h2", "x4", "p4", "forceUpdateLayerParameters", "o5", "(Lld/l;Z)V", "F3", "(Landroidx/compose/ui/node/e1$f;JLandroidx/compose/ui/node/t;ZZ)V", "J3", "Li0/i;", "g5", "()Li0/i;", "relativeToWindow", "P", "relativeToLocal", "e0", "sourceCoordinates", "relativeToSource", "E", "(Landroidx/compose/ui/layout/u;J)J", "(Landroidx/compose/ui/layout/u;[F)V", "j0", "(Landroidx/compose/ui/layout/u;Z)Li0/i;", "r0", "H5", "(Landroidx/compose/ui/graphics/v1;Lld/l;)V", "e5", "y2", "Landroidx/compose/ui/graphics/d5;", "paint", "m2", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/d5;)V", "k4", "r4", "clipToMinimumTouchTargetSize", "E4", "(Li0/d;ZZ)V", "M5", "(J)Z", "V3", "M3", "e4", "other", "v2", "(Landroidx/compose/ui/node/e1;)Landroidx/compose/ui/node/e1;", "V4", "Li0/n;", "minimumTouchTargetSize", "e2", "f2", "(JJ)F", "l", "Landroidx/compose/ui/node/h0;", "Z5", "()Landroidx/compose/ui/node/h0;", "m", "Landroidx/compose/ui/node/e1;", "l3", "()Landroidx/compose/ui/node/e1;", "R4", "(Landroidx/compose/ui/node/e1;)V", "wrapped", "n", "m3", "T4", "wrappedBy", "o", "Z", "released", "p", "isClipping", "<set-?>", "q", "Lld/l;", "T2", "()Lld/l;", "Landroidx/compose/ui/unit/d;", "r", "Landroidx/compose/ui/unit/d;", "layerDensity", "Landroidx/compose/ui/unit/w;", "s", "Landroidx/compose/ui/unit/w;", "layerLayoutDirection", "t", "F", "lastLayerAlpha", "Landroidx/compose/ui/layout/n0;", "u", "Landroidx/compose/ui/layout/n0;", "_measureResult", "", "Landroidx/compose/ui/layout/a;", "v", "Ljava/util/Map;", "oldAlignmentLines", "w", "J", "Z0", "()J", "P4", "(J)V", "x", "n3", "()F", "U4", "(F)V", "y", "Li0/d;", "_rectCache", "Landroidx/compose/ui/node/a0;", "z", "Landroidx/compose/ui/node/a0;", "layerPositionalProperties", "A", "H2", "drawBlock", "B", "Lld/a;", "invalidateParentLayer", "C", "K2", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/o1;", "D", "Landroidx/compose/ui/node/o1;", "Q2", "()Landroidx/compose/ui/node/o1;", "layer", "Landroidx/compose/ui/node/r1;", "c3", "()Landroidx/compose/ui/node/r1;", "snapshotObserver", "g3", "()Landroidx/compose/ui/q$d;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "b", "density", "U", "fontScale", "V0", "()Landroidx/compose/ui/node/q0;", "parent", "P0", "()Landroidx/compose/ui/layout/u;", "coordinates", "Landroidx/compose/ui/unit/u;", "c", "size", "Landroidx/compose/ui/node/b;", "M0", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "N0", "child", "Q0", "hasMeasureResult", "f", "isAttached", "value", "S0", "()Landroidx/compose/ui/layout/n0;", "M4", "(Landroidx/compose/ui/layout/n0;)V", "measureResult", "Landroidx/compose/ui/node/r0;", "W2", "()Landroidx/compose/ui/node/r0;", "J4", "(Landroidx/compose/ui/node/r0;)V", "lookaheadDelegate", "", "p0", "()Ljava/util/Set;", "providedAlignmentLines", "", "a", "()Ljava/lang/Object;", "parentData", "n0", "parentLayoutCoordinates", "G", "parentCoordinates", "a3", "()Li0/d;", "rectCache", "P2", "lastMeasurementConstraints", "G3", "isValidOwnerScope", "X2", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 11 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1329:1\n95#1,5:1330\n100#1,4:1378\n95#1,9:1382\n106#1:1393\n95#1,13:1394\n108#1:1450\n100#1,10:1451\n106#1:1523\n95#1,13:1524\n108#1:1580\n100#1,10:1581\n106#1:1596\n95#1,13:1597\n108#1:1653\n100#1,10:1654\n385#2,6:1335\n395#2,2:1342\n397#2,8:1347\n405#2,9:1358\n414#2,8:1370\n385#2,6:1407\n395#2,2:1414\n397#2,8:1419\n405#2,9:1430\n414#2,8:1442\n385#2,6:1468\n395#2,2:1475\n397#2,8:1480\n405#2,9:1491\n414#2,8:1503\n385#2,6:1537\n395#2,2:1544\n397#2,8:1549\n405#2,9:1560\n414#2,8:1572\n385#2,6:1610\n395#2,2:1617\n397#2,8:1622\n405#2,9:1633\n414#2,8:1645\n206#2:1666\n207#2,8:1668\n219#2:1678\n190#2:1679\n191#2,6:1681\n220#2:1687\n385#2,6:1688\n395#2,2:1695\n397#2,8:1700\n405#2,9:1711\n414#2,8:1723\n221#2:1731\n198#2,3:1732\n261#3:1341\n261#3:1413\n261#3:1466\n261#3:1474\n261#3:1543\n261#3:1616\n261#3:1694\n234#4,3:1344\n237#4,3:1367\n234#4,3:1416\n237#4,3:1439\n234#4,3:1477\n237#4,3:1500\n234#4,3:1546\n237#4,3:1569\n234#4,3:1619\n237#4,3:1642\n234#4,3:1697\n237#4,3:1720\n1208#5:1355\n1187#5,2:1356\n1208#5:1427\n1187#5,2:1428\n1208#5:1488\n1187#5,2:1489\n1208#5:1557\n1187#5,2:1558\n1208#5:1630\n1187#5,2:1631\n1208#5:1708\n1187#5,2:1709\n1#6:1391\n1#6:1667\n1#6:1680\n74#7:1392\n82#7:1461\n82#7:1465\n82#7:1467\n84#7:1514\n84#7:1522\n74#7:1594\n84#7:1595\n72#7:1664\n72#7:1665\n78#7:1676\n78#7:1677\n756#8,3:1462\n759#8,3:1511\n495#9,4:1515\n500#9:1592\n129#10,3:1519\n133#10:1591\n86#11:1593\n66#12,5:1735\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n106#1:1330,5\n106#1:1378,4\n116#1:1382,9\n214#1:1393\n214#1:1394,13\n214#1:1450\n214#1:1451,10\n293#1:1523\n293#1:1524,13\n293#1:1580\n293#1:1581,10\n373#1:1596\n373#1:1597,13\n373#1:1653\n373#1:1654,10\n107#1:1335,6\n107#1:1342,2\n107#1:1347,8\n107#1:1358,9\n107#1:1370,8\n214#1:1407,6\n214#1:1414,2\n214#1:1419,8\n214#1:1430,9\n214#1:1442,8\n238#1:1468,6\n238#1:1475,2\n238#1:1480,8\n238#1:1491,9\n238#1:1503,8\n293#1:1537,6\n293#1:1544,2\n293#1:1549,8\n293#1:1560,9\n293#1:1572,8\n373#1:1610,6\n373#1:1617,2\n373#1:1622,8\n373#1:1633,9\n373#1:1645,8\n1041#1:1666\n1041#1:1668,8\n1076#1:1678\n1076#1:1679\n1076#1:1681,6\n1076#1:1687\n1076#1:1688,6\n1076#1:1695,2\n1076#1:1700,8\n1076#1:1711,9\n1076#1:1723,8\n1076#1:1731\n1076#1:1732,3\n107#1:1341\n214#1:1413\n237#1:1466\n238#1:1474\n293#1:1543\n373#1:1616\n1076#1:1694\n107#1:1344,3\n107#1:1367,3\n214#1:1416,3\n214#1:1439,3\n238#1:1477,3\n238#1:1500,3\n293#1:1546,3\n293#1:1569,3\n373#1:1619,3\n373#1:1642,3\n1076#1:1697,3\n1076#1:1720,3\n107#1:1355\n107#1:1356,2\n214#1:1427\n214#1:1428,2\n238#1:1488\n238#1:1489,2\n293#1:1557\n293#1:1558,2\n373#1:1630\n373#1:1631,2\n1076#1:1708\n1076#1:1709,2\n1041#1:1667\n1076#1:1680\n214#1:1392\n230#1:1461\n237#1:1465\n238#1:1467\n291#1:1514\n293#1:1522\n359#1:1594\n373#1:1595\n652#1:1664\n1041#1:1665\n1073#1:1676\n1076#1:1677\n236#1:1462,3\n236#1:1511,3\n292#1:1515,4\n292#1:1592\n292#1:1519,3\n292#1:1591\n339#1:1593\n1120#1:1735,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class e1 extends q0 implements androidx.compose.ui.layout.l0, androidx.compose.ui.layout.u, q1 {
    public static final int F = 0;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.graphics.v1, k2> drawBlock;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final ld.a<k2> invalidateParentLayer;

    /* renamed from: C, reason: from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private o1 layer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 layoutNode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e1 wrapped;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e1 wrappedBy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean released;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isClipping;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super q4, k2> layerBlock;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d layerDensity = getLayoutNode().getDensity();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.n0 _measureResult;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Map<androidx.compose.ui.layout.a, Integer> oldAlignmentLines;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long position;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.d _rectCache;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a0 layerPositionalProperties;

    @fg.l
    public static final String G = "LayoutCoordinate operations are only valid when isAttached is true";

    @fg.l
    public static final String H = "Asking for measurement result of unmeasured layout modifier";

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final ld.l<e1, k2> I = d.f19245b;

    @fg.l
    private static final ld.l<e1, k2> J = c.f19244b;

    @fg.l
    private static final z5 K = new z5();

    @fg.l
    private static final a0 L = new a0();

    @fg.l
    private static final float[] M = y4.c(null, 1, null);

    @fg.l
    private static final f N = new a();

    @fg.l
    private static final f O = new b();

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"androidx/compose/ui/node/e1$a", "Landroidx/compose/ui/node/e1$f;", "Landroidx/compose/ui/node/g1;", "Landroidx/compose/ui/node/u1;", "a", "()I", "Landroidx/compose/ui/q$d;", "node", "", "b", "(Landroidx/compose/ui/q$d;)Z", "Landroidx/compose/ui/node/h0;", "parentLayoutNode", "d", "(Landroidx/compose/ui/node/h0;)Z", "layoutNode", "Li0/f;", "pointerPosition", "Landroidx/compose/ui/node/t;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/node/h0;JLandroidx/compose/ui/node/t;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1329:1\n78#2:1330\n78#2:1331\n385#3,6:1332\n395#3,2:1339\n397#3,8:1344\n405#3,9:1355\n414#3,8:1367\n261#4:1338\n234#5,3:1341\n237#5,3:1364\n1208#6:1352\n1187#6,2:1353\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1212#1:1330\n1215#1:1331\n1215#1:1332,6\n1215#1:1339,2\n1215#1:1344,8\n1215#1:1355,9\n1215#1:1367,8\n1215#1:1338\n1215#1:1341,3\n1215#1:1364,3\n1215#1:1352\n1215#1:1353,2\n*E\n"})
    public static final class a implements f {
        a() {
        }

        @Override // androidx.compose.ui.node.e1.f
        public int a() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.q$d] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.q$d] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.q$d] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // androidx.compose.ui.node.e1.f
        public boolean b(@fg.l q.d node) {
            androidx.compose.runtime.collection.g gVar = null;
            while (node != 0) {
                if (node instanceof u1) {
                    if (((u1) node).m1()) {
                        return true;
                    }
                } else if ((node.getKindSet() & 16) != 0 && (node instanceof androidx.compose.ui.node.l)) {
                    q.d delegate = node.getDelegate();
                    int i4 = 0;
                    node = node;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node = delegate;
                            } else {
                                if (gVar == null) {
                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                }
                                if (node != 0) {
                                    gVar.b(node);
                                    node = 0;
                                }
                                gVar.b(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        node = node;
                    }
                    if (i4 == 1) {
                    }
                }
                node = androidx.compose.ui.node.k.l(gVar);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.e1.f
        public void c(@fg.l h0 layoutNode, long pointerPosition, @fg.l t hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.I0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.e1.f
        public boolean d(@fg.l h0 parentLayoutNode) {
            return true;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"androidx/compose/ui/node/e1$b", "Landroidx/compose/ui/node/e1$f;", "Landroidx/compose/ui/node/g1;", "Landroidx/compose/ui/node/y1;", "a", "()I", "Landroidx/compose/ui/q$d;", "node", "", "b", "(Landroidx/compose/ui/q$d;)Z", "Landroidx/compose/ui/node/h0;", "parentLayoutNode", "d", "(Landroidx/compose/ui/node/h0;)Z", "layoutNode", "Li0/f;", "pointerPosition", "Landroidx/compose/ui/node/t;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/node/h0;JLandroidx/compose/ui/node/t;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1329:1\n76#2:1330\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1237#1:1330\n*E\n"})
    public static final class b implements f {
        b() {
        }

        @Override // androidx.compose.ui.node.e1.f
        public int a() {
            return 8;
        }

        @Override // androidx.compose.ui.node.e1.f
        public boolean b(@fg.l q.d node) {
            return false;
        }

        @Override // androidx.compose.ui.node.e1.f
        public void c(@fg.l h0 layoutNode, long pointerPosition, @fg.l t hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.K0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.e1.f
        public boolean d(@fg.l h0 parentLayoutNode) {
            androidx.compose.ui.semantics.l Z = parentLayoutNode.Z();
            boolean z4 = false;
            if (Z != null && Z.getIsClearingSemantics()) {
                z4 = true;
            }
            return !z4;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/e1;", "coordinator", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/e1;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<e1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f19244b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l e1 e1Var) {
            o1 layer = e1Var.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(e1 e1Var) {
            a(e1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/e1;", "coordinator", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/e1;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<e1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f19245b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l e1 e1Var) {
            if (e1Var.G3()) {
                a0 a0Var = e1Var.layerPositionalProperties;
                if (a0Var == null) {
                    e1.B5(e1Var, false, 1, null);
                    return;
                }
                e1.L.b(a0Var);
                e1.B5(e1Var, false, 1, null);
                if (e1.L.c(a0Var)) {
                    return;
                }
                h0 layoutNode = e1Var.getLayoutNode();
                m0 layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        h0.y1(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().L1();
                }
                p1 owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.y(layoutNode);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(e1 e1Var) {
            a(e1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/e1$e;", "", "<init>", "()V", "Landroidx/compose/ui/node/e1$f;", "PointerInputSource", "Landroidx/compose/ui/node/e1$f;", "a", "()Landroidx/compose/ui/node/e1$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/z5;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/z5;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/e1;", "Lkotlin/k2;", "onCommitAffectingLayer", "Lld/l;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/a0;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/a0;", "Landroidx/compose/ui/graphics/y4;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.e1$e, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final f a() {
            return e1.N;
        }

        @fg.l
        public final f b() {
            return e1.O;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/e1$f;", "", "Landroidx/compose/ui/node/g1;", "a", "()I", "Landroidx/compose/ui/q$d;", "node", "", "b", "(Landroidx/compose/ui/q$d;)Z", "Landroidx/compose/ui/node/h0;", "parentLayoutNode", "d", "(Landroidx/compose/ui/node/h0;)Z", "layoutNode", "Li0/f;", "pointerPosition", "Landroidx/compose/ui/node/t;", "hitTestResult", "isTouchEvent", "isInLayer", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/node/h0;JLandroidx/compose/ui/node/t;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface f {
        int a();

        boolean b(@fg.l q.d node);

        void c(@fg.l h0 layoutNode, long pointerPosition, @fg.l t hitTestResult, boolean isTouchEvent, boolean isInLayer);

        boolean d(@fg.l h0 parentLayoutNode);
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/v1;", "canvas", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/v1;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.v1, k2> {

        /* compiled from: NodeCoordinator.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f19247b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.v1 f19248c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e1 e1Var, androidx.compose.ui.graphics.v1 v1Var) {
                super(0);
                this.f19247b = e1Var;
                this.f19248c = v1Var;
            }

            public final void a() {
                this.f19247b.n2(this.f19248c);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        g() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.v1 v1Var) {
            if (!e1.this.getLayoutNode().l()) {
                e1.this.lastLayerDrawingWasSkipped = true;
            } else {
                e1.this.c3().i(e1.this, e1.J, new a(e1.this, v1Var));
                e1.this.lastLayerDrawingWasSkipped = false;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.v1 v1Var) {
            a(v1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1329:1\n72#2:1330\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n*L\n581#1:1330\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q.d f19250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f19251d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f19252e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t f19253f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f19254g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f19255h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(q.d dVar, f fVar, long j4, t tVar, boolean z4, boolean z5) {
            super(0);
            this.f19250c = dVar;
            this.f19251d = fVar;
            this.f19252e = j4;
            this.f19253f = tVar;
            this.f19254g = z4;
            this.f19255h = z5;
        }

        public final void a() {
            q.d b5;
            e1 e1Var = e1.this;
            b5 = f1.b(this.f19250c, this.f19251d.a(), 2);
            e1Var.A3(b5, this.f19251d, this.f19252e, this.f19253f, this.f19254g, this.f19255h);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1329:1\n72#2:1330\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n*L\n608#1:1330\n*E\n"})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q.d f19257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f19258d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f19259e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t f19260f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f19261g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f19262h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f19263i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(q.d dVar, f fVar, long j4, t tVar, boolean z4, boolean z5, float f4) {
            super(0);
            this.f19257c = dVar;
            this.f19258d = fVar;
            this.f19259e = j4;
            this.f19260f = tVar;
            this.f19261g = z4;
            this.f19262h = z5;
            this.f19263i = f4;
        }

        public final void a() {
            q.d b5;
            e1 e1Var = e1.this;
            b5 = f1.b(this.f19257c, this.f19258d.a(), 2);
            e1Var.D3(b5, this.f19258d, this.f19259e, this.f19260f, this.f19261g, this.f19262h, this.f19263i);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        j() {
            super(0);
        }

        public final void a() {
            e1 wrappedBy = e1.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.M3();
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1329:1\n72#2:1330\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n*L\n642#1:1330\n*E\n"})
    static final class k extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q.d f19266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f19267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f19268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t f19269f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f19270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f19271h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f19272i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(q.d dVar, f fVar, long j4, t tVar, boolean z4, boolean z5, float f4) {
            super(0);
            this.f19266c = dVar;
            this.f19267d = fVar;
            this.f19268e = j4;
            this.f19269f = tVar;
            this.f19270g = z4;
            this.f19271h = z5;
            this.f19272i = f4;
        }

        public final void a() {
            q.d b5;
            e1 e1Var = e1.this;
            b5 = f1.b(this.f19266c, this.f19267d.a(), 2);
            e1Var.W4(b5, this.f19267d, this.f19268e, this.f19269f, this.f19270g, this.f19271h, this.f19272i);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<q4, k2> f19273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ld.l<? super q4, k2> lVar) {
            super(0);
            this.f19273b = lVar;
        }

        public final void a() {
            this.f19273b.invoke(e1.K);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public e1(@fg.l h0 h0Var) {
        this.layoutNode = h0Var;
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        this.position = androidx.compose.ui.unit.q.f21519c;
        this.drawBlock = new g();
        this.invalidateParentLayer = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(q.d dVar, f fVar, long j4, t tVar, boolean z4, boolean z5) {
        if (dVar == null) {
            J3(fVar, j4, tVar, z4, z5);
        } else {
            tVar.v(dVar, z5, new h(dVar, fVar, j4, tVar, z4, z5));
        }
    }

    private final void A4(long position, float zIndex, ld.l<? super q4, k2> layerBlock) {
        z5(this, layerBlock, false, 2, null);
        if (!androidx.compose.ui.unit.q.j(getPosition(), position)) {
            P4(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().L1();
            o1 o1Var = this.layer;
            if (o1Var != null) {
                o1Var.m(position);
            } else {
                e1 e1Var = this.wrappedBy;
                if (e1Var != null) {
                    e1Var.M3();
                }
            }
            c1(this);
            p1 owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.A(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
    }

    private final void A5(boolean invokeOnLayoutChange) {
        p1 owner;
        o1 o1Var = this.layer;
        if (o1Var == null) {
            if (this.layerBlock != null) {
                throw new IllegalStateException("null layer with a non-null layerBlock");
            }
            return;
        }
        ld.l<? super q4, k2> lVar = this.layerBlock;
        if (lVar == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock");
        }
        z5 z5Var = K;
        z5Var.l();
        z5Var.p(getLayoutNode().getDensity());
        z5Var.t(androidx.compose.ui.unit.v.f(getMeasuredSize()));
        c3().i(this, I, new l(lVar));
        a0 a0Var = this.layerPositionalProperties;
        if (a0Var == null) {
            a0Var = new a0();
            this.layerPositionalProperties = a0Var;
        }
        a0Var.a(z5Var);
        o1Var.h(z5Var, getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
        this.isClipping = z5Var.getClip();
        this.lastLayerAlpha = z5Var.getAlpha();
        if (!invokeOnLayoutChange || (owner = getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.A(getLayoutNode());
    }

    private final void B2(i0.d bounds, boolean clipBounds) {
        float m4 = androidx.compose.ui.unit.q.m(getPosition());
        bounds.m(bounds.getLeft() - m4);
        bounds.n(bounds.getRight() - m4);
        float position = (int) (getPosition() & 4294967295L);
        bounds.o(bounds.getTop() - position);
        bounds.l(bounds.getBottom() - position);
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.j(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.i(0.0f, 0.0f, androidx.compose.ui.unit.u.m(getMeasuredSize()), (int) (getMeasuredSize() & 4294967295L));
                bounds.j();
            }
        }
    }

    static /* synthetic */ void B5(e1 e1Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        e1Var.A5(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(q.d dVar, f fVar, long j4, t tVar, boolean z4, boolean z5, float f4) {
        if (dVar == null) {
            J3(fVar, j4, tVar, z4, z5);
        } else {
            tVar.w(dVar, f4, z5, new i(dVar, fVar, j4, tVar, z4, z5, f4));
        }
    }

    private static /* synthetic */ void H2() {
    }

    public static /* synthetic */ void H4(e1 e1Var, i0.d dVar, boolean z4, boolean z5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        e1Var.E4(dVar, z4, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W4(q.d dVar, f fVar, long j4, t tVar, boolean z4, boolean z5, float f4) {
        q.d b5;
        if (dVar == null) {
            J3(fVar, j4, tVar, z4, z5);
        } else if (fVar.b(dVar)) {
            tVar.L(dVar, f4, z5, new k(dVar, fVar, j4, tVar, z4, z5, f4));
        } else {
            b5 = f1.b(dVar, fVar.a(), 2);
            W4(b5, fVar, j4, tVar, z4, z5, f4);
        }
    }

    private final e1 X4(androidx.compose.ui.layout.u uVar) {
        e1 a5;
        androidx.compose.ui.layout.g0 g0Var = uVar instanceof androidx.compose.ui.layout.g0 ? (androidx.compose.ui.layout.g0) uVar : null;
        if (g0Var != null && (a5 = g0Var.a()) != null) {
            return a5;
        }
        kotlin.jvm.internal.l0.n(uVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (e1) uVar;
    }

    private final void Z1(e1 ancestor, i0.d rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        e1 e1Var = this.wrappedBy;
        if (e1Var != null) {
            e1Var.Z1(ancestor, rect, clipBounds);
        }
        B2(rect, clipBounds);
    }

    private final long b4(long pointerPosition) {
        float p4 = i0.f.p(pointerPosition);
        float max = Math.max(0.0f, p4 < 0.0f ? -p4 : p4 - W());
        float r4 = i0.f.r(pointerPosition);
        return i0.g.a(max, Math.max(0.0f, r4 < 0.0f ? -r4 : r4 - v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r1 c3() {
        return l0.d(getLayoutNode()).getSnapshotObserver();
    }

    private final long d2(e1 ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        e1 e1Var = this.wrappedBy;
        return (e1Var == null || kotlin.jvm.internal.l0.g(ancestor, e1Var)) ? y2(offset) : y2(e1Var.d2(ancestor, offset));
    }

    private final void i5(e1 ancestor, float[] matrix) {
        if (kotlin.jvm.internal.l0.g(ancestor, this)) {
            return;
        }
        e1 e1Var = this.wrappedBy;
        kotlin.jvm.internal.l0.m(e1Var);
        e1Var.i5(ancestor, matrix);
        long position = getPosition();
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        if (!androidx.compose.ui.unit.q.j(position, androidx.compose.ui.unit.q.f21519c)) {
            float[] fArr = M;
            y4.m(fArr);
            y4.x(fArr, -((int) (getPosition() >> 32)), -((int) (getPosition() & 4294967295L)), 0.0f, 4, null);
            y4.u(matrix, fArr);
        }
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.l(matrix);
        }
    }

    private final void m5(e1 ancestor, float[] matrix) {
        e1 e1Var = this;
        while (!kotlin.jvm.internal.l0.g(e1Var, ancestor)) {
            o1 o1Var = e1Var.layer;
            if (o1Var != null) {
                o1Var.a(matrix);
            }
            long position = e1Var.getPosition();
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            if (!androidx.compose.ui.unit.q.j(position, androidx.compose.ui.unit.q.f21519c)) {
                float[] fArr = M;
                y4.m(fArr);
                y4.x(fArr, (int) (position >> 32), (int) (position & 4294967295L), 0.0f, 4, null);
                y4.u(matrix, fArr);
            }
            e1Var = e1Var.wrappedBy;
            kotlin.jvm.internal.l0.m(e1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2(androidx.compose.ui.graphics.v1 canvas) {
        q.d w32 = w3(4);
        if (w32 == null) {
            x4(canvas);
        } else {
            getLayoutNode().q0().a(canvas, androidx.compose.ui.unit.v.f(getMeasuredSize()), this, w32);
        }
    }

    private final boolean q3(int type) {
        q.d x32 = x3(h1.j(type));
        return x32 != null && androidx.compose.ui.node.k.g(x32, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q.d x3(boolean includeTail) {
        q.d g32;
        if (getLayoutNode().z0() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            e1 e1Var = this.wrappedBy;
            if (e1Var != null && (g32 = e1Var.g3()) != null) {
                return g32.getChild();
            }
        } else {
            e1 e1Var2 = this.wrappedBy;
            if (e1Var2 != null) {
                return e1Var2.g3();
            }
        }
        return null;
    }

    public static /* synthetic */ void z5(e1 e1Var, ld.l lVar, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        e1Var.o5(lVar, z4);
    }

    public final void D4(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
        long apparentToRealOffset = getApparentToRealOffset();
        A4(androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(position) + ((int) (apparentToRealOffset >> 32)), ((int) (position & 4294967295L)) + ((int) (apparentToRealOffset & 4294967295L))), zIndex, layerBlock);
    }

    @Override // androidx.compose.ui.layout.u
    public long E(@fg.l androidx.compose.ui.layout.u sourceCoordinates, long relativeToSource) {
        if (sourceCoordinates instanceof androidx.compose.ui.layout.g0) {
            return i0.f.z(((androidx.compose.ui.layout.g0) sourceCoordinates).E(this, i0.f.z(relativeToSource)));
        }
        e1 X4 = X4(sourceCoordinates);
        X4.c4();
        e1 v22 = v2(X4);
        while (X4 != v22) {
            relativeToSource = X4.e5(relativeToSource);
            X4 = X4.wrappedBy;
            kotlin.jvm.internal.l0.m(X4);
        }
        return d2(v22, relativeToSource);
    }

    public final void E4(@fg.l i0.d bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        o1 o1Var = this.layer;
        if (o1Var != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long X2 = X2();
                    float t4 = i0.n.t(X2) / 2.0f;
                    float m4 = i0.n.m(X2) / 2.0f;
                    bounds.i(-t4, -m4, androidx.compose.ui.unit.u.m(getMeasuredSize()) + t4, ((int) (getMeasuredSize() & 4294967295L)) + m4);
                } else if (clipBounds) {
                    bounds.i(0.0f, 0.0f, androidx.compose.ui.unit.u.m(getMeasuredSize()), (int) (getMeasuredSize() & 4294967295L));
                }
                if (bounds.j()) {
                    return;
                }
            }
            o1Var.j(bounds, false);
        }
        float m5 = androidx.compose.ui.unit.q.m(getPosition());
        bounds.m(bounds.getLeft() + m5);
        bounds.n(bounds.getRight() + m5);
        float position = (int) (getPosition() & 4294967295L);
        bounds.o(bounds.getTop() + position);
        bounds.l(bounds.getBottom() + position);
    }

    public final void F3(@fg.l f hitTestSource, long pointerPosition, @fg.l t hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        q.d w32 = w3(hitTestSource.a());
        if (!M5(pointerPosition)) {
            if (isTouchEvent) {
                float f22 = f2(pointerPosition, X2());
                if (Float.isInfinite(f22) || Float.isNaN(f22) || !hitTestResult.A(f22, false)) {
                    return;
                }
                D3(w32, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, f22);
                return;
            }
            return;
        }
        if (w32 == null) {
            J3(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (V3(pointerPosition)) {
            A3(w32, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float f23 = !isTouchEvent ? Float.POSITIVE_INFINITY : f2(pointerPosition, X2());
        if (!Float.isInfinite(f23) && !Float.isNaN(f23)) {
            if (hitTestResult.A(f23, isInLayer)) {
                D3(w32, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, f23);
                return;
            }
        }
        W4(w32, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, f23);
    }

    public final void F5(int mask, boolean includeTail, @fg.l ld.l<? super q.d, k2> block) {
        q.d g32 = g3();
        if (!includeTail && (g32 = g32.getParent()) == null) {
            return;
        }
        for (q.d x32 = x3(includeTail); x32 != null && (x32.getAggregateChildKindSet() & mask) != 0; x32 = x32.getChild()) {
            if ((x32.getKindSet() & mask) != 0) {
                block.invoke(x32);
            }
            if (x32 == g32) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.u
    @fg.m
    public final androidx.compose.ui.layout.u G() {
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c4();
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.q1
    public boolean G3() {
        return (this.layer == null || this.released || !getLayoutNode().f()) ? false : true;
    }

    public final <T> void G5(int type, ld.l<? super T, k2> block) {
        boolean j4 = h1.j(type);
        q.d g32 = g3();
        if (!j4 && (g32 = g32.getParent()) == null) {
            return;
        }
        for (q.d x32 = x3(j4); x32 != null && (x32.getAggregateChildKindSet() & type) != 0; x32 = x32.getChild()) {
            if ((x32.getKindSet() & type) != 0) {
                for (q.d dVar = x32; dVar != null; dVar = androidx.compose.ui.node.k.l(null)) {
                    kotlin.jvm.internal.l0.P();
                    block.invoke(dVar);
                }
            }
            if (x32 == g32) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.i1
    protected void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
        A4(position, zIndex, layerBlock);
    }

    protected final void H5(@fg.l androidx.compose.ui.graphics.v1 canvas, @fg.l ld.l<? super androidx.compose.ui.graphics.v1, k2> block) {
        float m4 = androidx.compose.ui.unit.q.m(getPosition());
        float position = (int) (getPosition() & 4294967295L);
        canvas.translate(m4, position);
        block.invoke(canvas);
        canvas.translate(-m4, -position);
    }

    public void J3(@fg.l f hitTestSource, long pointerPosition, @fg.l t hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        e1 e1Var = this.wrapped;
        if (e1Var != null) {
            e1Var.F3(hitTestSource, e1Var.y2(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    protected abstract void J4(@fg.m r0 r0Var);

    /* renamed from: K2, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    @Override // androidx.compose.ui.node.q0
    @fg.l
    public androidx.compose.ui.node.b M0() {
        return getLayoutNode().getLayoutDelegate().r();
    }

    public void M3() {
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.invalidate();
            return;
        }
        e1 e1Var = this.wrappedBy;
        if (e1Var != null) {
            e1Var.M3();
        }
    }

    public void M4(@fg.l androidx.compose.ui.layout.n0 n0Var) {
        androidx.compose.ui.layout.n0 n0Var2 = this._measureResult;
        if (n0Var != n0Var2) {
            this._measureResult = n0Var;
            if (n0Var2 == null || n0Var.getF18967a() != n0Var2.getF18967a() || n0Var.getF18968b() != n0Var2.getF18968b()) {
                l4(n0Var.getF18967a(), n0Var.getF18968b());
            }
            Map<androidx.compose.ui.layout.a, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && n0Var.p().isEmpty()) || kotlin.jvm.internal.l0.g(n0Var.p(), this.oldAlignmentLines)) {
                return;
            }
            M0().getAlignmentLines().q();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(n0Var.p());
        }
    }

    protected final boolean M5(long pointerPosition) {
        if (!i0.g.b(pointerPosition)) {
            return false;
        }
        o1 o1Var = this.layer;
        return o1Var == null || !this.isClipping || o1Var.i(pointerPosition);
    }

    @Override // androidx.compose.ui.node.q0
    @fg.m
    public q0 N0() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.layout.u
    public long P(long relativeToWindow) {
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.layout.u d5 = androidx.compose.ui.layout.v.d(this);
        return E(d5, i0.f.u(l0.d(getLayoutNode()).X(relativeToWindow), androidx.compose.ui.layout.v.f(d5)));
    }

    @Override // androidx.compose.ui.node.q0
    @fg.l
    public androidx.compose.ui.layout.u P0() {
        return this;
    }

    public final long P2() {
        return getMeasurementConstraints();
    }

    protected void P4(long j4) {
        this.position = j4;
    }

    @Override // androidx.compose.ui.node.q0
    public boolean Q0() {
        return this._measureResult != null;
    }

    @fg.m
    /* renamed from: Q2, reason: from getter */
    public final o1 getLayer() {
        return this.layer;
    }

    public final void R4(@fg.m e1 e1Var) {
        this.wrapped = e1Var;
    }

    @Override // androidx.compose.ui.node.q0
    @fg.l
    public androidx.compose.ui.layout.n0 S0() {
        androidx.compose.ui.layout.n0 n0Var = this._measureResult;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // androidx.compose.ui.layout.u
    public void T(@fg.l androidx.compose.ui.layout.u sourceCoordinates, @fg.l float[] matrix) {
        e1 X4 = X4(sourceCoordinates);
        X4.c4();
        e1 v22 = v2(X4);
        y4.m(matrix);
        X4.m5(v22, matrix);
        i5(v22, matrix);
    }

    @fg.m
    protected final ld.l<q4, k2> T2() {
        return this.layerBlock;
    }

    public final void T4(@fg.m e1 e1Var) {
        this.wrappedBy = e1Var;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    protected final void U4(float f4) {
        this.zIndex = f4;
    }

    @Override // androidx.compose.ui.node.q0
    @fg.m
    public q0 V0() {
        return this.wrappedBy;
    }

    protected final boolean V3(long pointerPosition) {
        float p4 = i0.f.p(pointerPosition);
        float r4 = i0.f.r(pointerPosition);
        return p4 >= 0.0f && r4 >= 0.0f && p4 < ((float) W()) && r4 < ((float) v());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final boolean V4() {
        q.d x32 = x3(h1.j(16));
        if (x32 != null && x32.getIsAttached()) {
            if (!x32.getNode().getIsAttached()) {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node");
            }
            q.d node = x32.getNode();
            if ((node.getAggregateChildKindSet() & 16) != 0) {
                for (q.d child = node.getChild(); child != null; child = child.getChild()) {
                    if ((child.getKindSet() & 16) != 0) {
                        androidx.compose.ui.node.l lVar = child;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (lVar != 0) {
                            if (lVar instanceof u1) {
                                if (((u1) lVar).W5()) {
                                    return true;
                                }
                            } else if ((lVar.getKindSet() & 16) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                q.d delegate = lVar.getDelegate();
                                int i4 = 0;
                                lVar = lVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar = delegate;
                                        } else {
                                            if (gVar == null) {
                                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                gVar.b(lVar);
                                                lVar = 0;
                                            }
                                            gVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar = lVar;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar = androidx.compose.ui.node.k.l(gVar);
                        }
                    }
                }
            }
        }
        return false;
    }

    @fg.m
    /* renamed from: W2 */
    public abstract r0 getLookaheadDelegate();

    public final long X2() {
        return this.layerDensity.d0(getLayoutNode().getViewConfiguration().d());
    }

    public final boolean Y3() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        e1 e1Var = this.wrappedBy;
        if (e1Var != null) {
            return e1Var.Y3();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.q0
    /* renamed from: Z0, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.q0, androidx.compose.ui.node.v0
    @fg.l
    /* renamed from: Z5, reason: from getter */
    public h0 getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.layout.p0, androidx.compose.ui.layout.p
    @fg.m
    /* renamed from: a */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().t(64)) {
            return null;
        }
        g3();
        k1.h hVar = new k1.h();
        for (q.d tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((tail.getKindSet() & 64) != 0) {
                androidx.compose.runtime.collection.g gVar = null;
                androidx.compose.ui.node.l lVar = tail;
                while (lVar != 0) {
                    if (lVar instanceof s1) {
                        hVar.f75329b = ((s1) lVar).T(getLayoutNode().getDensity(), hVar.f75329b);
                    } else if ((lVar.getKindSet() & 64) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                        q.d delegate = lVar.getDelegate();
                        int i4 = 0;
                        lVar = lVar;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & 64) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    lVar = delegate;
                                } else {
                                    if (gVar == null) {
                                        gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                    }
                                    if (lVar != 0) {
                                        gVar.b(lVar);
                                        lVar = 0;
                                    }
                                    gVar.b(delegate);
                                }
                            }
                            delegate = delegate.getChild();
                            lVar = lVar;
                        }
                        if (i4 == 1) {
                        }
                    }
                    lVar = androidx.compose.ui.node.k.l(gVar);
                }
            }
        }
        return hVar.f75329b;
    }

    @fg.l
    protected final i0.d a3() {
        i0.d dVar = this._rectCache;
        if (dVar != null) {
            return dVar;
        }
        i0.d dVar2 = new i0.d(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = dVar2;
        return dVar2;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.u
    public final long c() {
        return getMeasuredSize();
    }

    public final void c4() {
        getLayoutNode().getLayoutDelegate().P();
    }

    @Override // androidx.compose.ui.layout.u
    public long e0(long relativeToLocal) {
        return l0.d(getLayoutNode()).x(r0(relativeToLocal));
    }

    protected final long e2(long minimumTouchTargetSize) {
        return i0.o.a(Math.max(0.0f, (i0.n.t(minimumTouchTargetSize) - W()) / 2.0f), Math.max(0.0f, (i0.n.m(minimumTouchTargetSize) - v()) / 2.0f));
    }

    public void e4() {
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.invalidate();
        }
    }

    public long e5(long position) {
        o1 o1Var = this.layer;
        if (o1Var != null) {
            position = o1Var.c(position, false);
        }
        return androidx.compose.ui.unit.r.e(position, getPosition());
    }

    @Override // androidx.compose.ui.layout.u
    public boolean f() {
        return g3().getIsAttached();
    }

    protected final float f2(long pointerPosition, long minimumTouchTargetSize) {
        if (W() >= i0.n.t(minimumTouchTargetSize) && v() >= i0.n.m(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long e22 = e2(minimumTouchTargetSize);
        float t4 = i0.n.t(e22);
        float m4 = i0.n.m(e22);
        long b42 = b4(pointerPosition);
        if ((t4 > 0.0f || m4 > 0.0f) && i0.f.p(b42) <= t4 && i0.f.r(b42) <= m4) {
            return i0.f.n(b42);
        }
        return Float.POSITIVE_INFINITY;
    }

    @fg.l
    public abstract q.d g3();

    @fg.l
    public final i0.i g5() {
        if (!f()) {
            i0.i.INSTANCE.getClass();
            return i0.i.f74153g;
        }
        androidx.compose.ui.layout.u d5 = androidx.compose.ui.layout.v.d(this);
        i0.d a32 = a3();
        long e22 = e2(X2());
        a32.m(-i0.n.t(e22));
        a32.o(-i0.n.m(e22));
        a32.n(i0.n.t(e22) + W());
        a32.l(i0.n.m(e22) + v());
        e1 e1Var = this;
        while (e1Var != d5) {
            e1Var.E4(a32, false, true);
            if (a32.j()) {
                i0.i.INSTANCE.getClass();
                return i0.i.f74153g;
            }
            e1Var = e1Var.wrappedBy;
            kotlin.jvm.internal.l0.m(e1Var);
        }
        return i0.e.a(a32);
    }

    @Override // androidx.compose.ui.layout.q
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.q0
    public void h1() {
        H0(getPosition(), this.zIndex, this.layerBlock);
    }

    public final void h2(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.g(canvas);
            return;
        }
        float m4 = androidx.compose.ui.unit.q.m(getPosition());
        float position = (int) (getPosition() & 4294967295L);
        canvas.translate(m4, position);
        n2(canvas);
        canvas.translate(-m4, -position);
    }

    @Override // androidx.compose.ui.layout.u
    @fg.l
    public i0.i j0(@fg.l androidx.compose.ui.layout.u sourceCoordinates, boolean clipBounds) {
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.f()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        e1 X4 = X4(sourceCoordinates);
        X4.c4();
        e1 v22 = v2(X4);
        i0.d a32 = a3();
        a32.m(0.0f);
        a32.o(0.0f);
        a32.n(androidx.compose.ui.unit.u.m(sourceCoordinates.c()));
        a32.l((int) (sourceCoordinates.c() & 4294967295L));
        while (X4 != v22) {
            H4(X4, a32, clipBounds, false, 4, null);
            if (a32.j()) {
                i0.i.INSTANCE.getClass();
                return i0.i.f74153g;
            }
            X4 = X4.wrappedBy;
            kotlin.jvm.internal.l0.m(X4);
        }
        Z1(v22, a32, clipBounds);
        return i0.e.a(a32);
    }

    public final void k4() {
        o5(this.layerBlock, true);
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.invalidate();
        }
    }

    @fg.m
    /* renamed from: l3, reason: from getter */
    public final e1 getWrapped() {
        return this.wrapped;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    protected void l4(int width, int height) {
        o1 o1Var = this.layer;
        if (o1Var != null) {
            o1Var.d(androidx.compose.ui.unit.v.a(width, height));
        } else {
            e1 e1Var = this.wrappedBy;
            if (e1Var != null) {
                e1Var.M3();
            }
        }
        I0(androidx.compose.ui.unit.v.a(width, height));
        A5(false);
        boolean j4 = h1.j(4);
        q.d g32 = g3();
        if (j4 || (g32 = g32.getParent()) != null) {
            for (q.d x32 = x3(j4); x32 != null && (x32.getAggregateChildKindSet() & 4) != 0; x32 = x32.getChild()) {
                if ((x32.getKindSet() & 4) != 0) {
                    androidx.compose.ui.node.l lVar = x32;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (lVar != 0) {
                        if (lVar instanceof q) {
                            ((q) lVar).P4();
                        } else if ((lVar.getKindSet() & 4) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                            q.d delegate = lVar.getDelegate();
                            int i4 = 0;
                            lVar = lVar;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & 4) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        lVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (lVar != 0) {
                                            gVar.b(lVar);
                                            lVar = 0;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                lVar = lVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        lVar = androidx.compose.ui.node.k.l(gVar);
                    }
                }
                if (x32 == g32) {
                    break;
                }
            }
        }
        p1 owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.A(getLayoutNode());
        }
    }

    protected final void m2(@fg.l androidx.compose.ui.graphics.v1 canvas, @fg.l d5 paint) {
        canvas.m(new i0.i(0.5f, 0.5f, androidx.compose.ui.unit.u.m(getMeasuredSize()) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f), paint);
    }

    @fg.m
    /* renamed from: m3, reason: from getter */
    public final e1 getWrappedBy() {
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void m4() {
        q.d parent;
        if (q3(128)) {
            androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    boolean j4 = h1.j(128);
                    if (j4) {
                        parent = g3();
                    } else {
                        parent = g3().getParent();
                        if (parent == null) {
                            k2 k2Var = k2.f75408a;
                            c5.y(r4);
                        }
                    }
                    for (q.d x32 = x3(j4); x32 != null && (x32.getAggregateChildKindSet() & 128) != 0; x32 = x32.getChild()) {
                        if ((x32.getKindSet() & 128) != 0) {
                            androidx.compose.ui.node.l lVar = x32;
                            androidx.compose.runtime.collection.g gVar = null;
                            while (lVar != 0) {
                                if (lVar instanceof b0) {
                                    ((b0) lVar).l(getMeasuredSize());
                                } else if ((lVar.getKindSet() & 128) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                                    q.d delegate = lVar.getDelegate();
                                    int i4 = 0;
                                    lVar = lVar;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & 128) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lVar = delegate;
                                            } else {
                                                if (gVar == null) {
                                                    gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                                }
                                                if (lVar != 0) {
                                                    gVar.b(lVar);
                                                    lVar = 0;
                                                }
                                                gVar.b(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        lVar = lVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                lVar = androidx.compose.ui.node.k.l(gVar);
                            }
                        }
                        if (x32 == parent) {
                            break;
                        }
                    }
                    k2 k2Var2 = k2.f75408a;
                    c5.y(r4);
                } catch (Throwable th) {
                    c5.y(r4);
                    throw th;
                }
            } finally {
                c5.d();
            }
        }
    }

    @Override // androidx.compose.ui.layout.u
    @fg.m
    public final androidx.compose.ui.layout.u n0() {
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c4();
        return getLayoutNode().z0().wrappedBy;
    }

    /* renamed from: n3, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void o5(@fg.m ld.l<? super q4, k2> layerBlock, boolean forceUpdateLayerParameters) {
        p1 owner;
        h0 layoutNode = getLayoutNode();
        boolean z4 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && kotlin.jvm.internal.l0.g(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.f() || layerBlock == null) {
            o1 o1Var = this.layer;
            if (o1Var != null) {
                o1Var.destroy();
                layoutNode.G1(true);
                this.invalidateParentLayer.invoke();
                if (f() && (owner = layoutNode.getOwner()) != null) {
                    owner.A(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z4) {
                B5(this, false, 1, null);
                return;
            }
            return;
        }
        o1 O2 = l0.d(layoutNode).O(this.drawBlock, this.invalidateParentLayer);
        O2.d(getMeasuredSize());
        O2.m(getPosition());
        this.layer = O2;
        B5(this, false, 1, null);
        layoutNode.G1(true);
        this.invalidateParentLayer.invoke();
    }

    @Override // androidx.compose.ui.layout.u
    @fg.l
    public Set<androidx.compose.ui.layout.a> p0() {
        LinkedHashSet linkedHashSet = null;
        for (e1 e1Var = this; e1Var != null; e1Var = e1Var.wrapped) {
            androidx.compose.ui.layout.n0 n0Var = e1Var._measureResult;
            Map<androidx.compose.ui.layout.a, Integer> p4 = n0Var != null ? n0Var.p() : null;
            if (p4 != null && (!p4.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(p4.keySet());
            }
        }
        return linkedHashSet == null ? kotlin.collections.l0.f74939b : linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void p4() {
        boolean j4 = h1.j(128);
        q.d g32 = g3();
        if (!j4 && (g32 = g32.getParent()) == null) {
            return;
        }
        for (q.d x32 = x3(j4); x32 != null && (x32.getAggregateChildKindSet() & 128) != 0; x32 = x32.getChild()) {
            if ((x32.getKindSet() & 128) != 0) {
                androidx.compose.ui.node.l lVar = x32;
                androidx.compose.runtime.collection.g gVar = null;
                while (lVar != 0) {
                    if (lVar instanceof b0) {
                        ((b0) lVar).q(this);
                    } else if ((lVar.getKindSet() & 128) != 0 && (lVar instanceof androidx.compose.ui.node.l)) {
                        q.d delegate = lVar.getDelegate();
                        int i4 = 0;
                        lVar = lVar;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & 128) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    lVar = delegate;
                                } else {
                                    if (gVar == null) {
                                        gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                    }
                                    if (lVar != 0) {
                                        gVar.b(lVar);
                                        lVar = 0;
                                    }
                                    gVar.b(delegate);
                                }
                            }
                            delegate = delegate.getChild();
                            lVar = lVar;
                        }
                        if (i4 == 1) {
                        }
                    }
                    lVar = androidx.compose.ui.node.k.l(gVar);
                }
            }
            if (x32 == g32) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.u
    public long r0(long relativeToLocal) {
        if (!f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c4();
        for (e1 e1Var = this; e1Var != null; e1Var = e1Var.wrappedBy) {
            relativeToLocal = e1Var.e5(relativeToLocal);
        }
        return relativeToLocal;
    }

    public final void r4() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        if (this.layer != null) {
            z5(this, null, false, 2, null);
        }
    }

    public abstract void s2();

    @fg.l
    public final e1 v2(@fg.l e1 other) {
        h0 layoutNode = other.getLayoutNode();
        h0 layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            q.d g32 = other.g3();
            q.d g33 = g3();
            if (!g33.getNode().getIsAttached()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (q.d parent = g33.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & 2) != 0 && parent == g32) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.B0();
            kotlin.jvm.internal.l0.m(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.B0();
            kotlin.jvm.internal.l0.m(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.B0();
            layoutNode2 = layoutNode2.B0();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == other.getLayoutNode() ? other : layoutNode.d0();
    }

    @fg.m
    public final q.d w3(int type) {
        boolean j4 = h1.j(type);
        q.d g32 = g3();
        if (!j4 && (g32 = g32.getParent()) == null) {
            return null;
        }
        for (q.d x32 = x3(j4); x32 != null && (x32.getAggregateChildKindSet() & type) != 0; x32 = x32.getChild()) {
            if ((x32.getKindSet() & type) != 0) {
                return x32;
            }
            if (x32 == g32) {
                return null;
            }
        }
        return null;
    }

    public void x4(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        e1 e1Var = this.wrapped;
        if (e1Var != null) {
            e1Var.h2(canvas);
        }
    }

    public long y2(long position) {
        long c5 = androidx.compose.ui.unit.r.c(position, getPosition());
        o1 o1Var = this.layer;
        return o1Var != null ? o1Var.c(c5, true) : c5;
    }

    @fg.l
    protected final androidx.compose.ui.layout.i1 y4(long constraints, @fg.l ld.a<? extends androidx.compose.ui.layout.i1> block) {
        J0(constraints);
        return block.invoke();
    }
}
