package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.i1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u008e\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0002È\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0083\u0003Í\u0001BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020$2\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020$H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u0010\u0014J\u000f\u00102\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u0010\u0014J!\u00106\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b6\u00107J6\u0010;\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u00010\u001b2\u0006\u0010:\u001a\u0002092\b\u00105\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u000203H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010\u0014J\u0017\u0010I\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0017H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u0017H\u0002¢\u0006\u0004\bL\u0010MJ/\u0010Q\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u0017H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\bS\u0010JJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010MJ\u000f\u0010V\u001a\u00020\u0012H\u0002¢\u0006\u0004\bV\u0010\u0014J'\u0010Z\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010]\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u0017H\u0002¢\u0006\u0004\b]\u0010MJ'\u0010_\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u001b\u0010b\u001a\u00020\u0017*\u00020a2\u0006\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0012H\u0002¢\u0006\u0004\bd\u0010\u0014J\u000f\u0010e\u001a\u00020\u0012H\u0002¢\u0006\u0004\be\u0010\u0014J9\u0010k\u001a\u00020\u00122\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0f2\u0006\u0010h\u001a\u00020$2\b\u0010i\u001a\u0004\u0018\u00010\u001b2\u0006\u0010j\u001a\u000203H\u0002¢\u0006\u0004\bk\u0010lJ+\u0010q\u001a\u00020\u00122\u001a\u0010p\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020o\u0012\u0006\u0012\u0004\u0018\u00010o0n0mH\u0002¢\u0006\u0004\bq\u0010rJ,\u0010w\u001a\u00028\u0000\"\u0004\b\u0000\u0010s2\u0006\u0010t\u001a\u00020a2\f\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000uH\u0082\b¢\u0006\u0004\bw\u0010xJk\u0010~\u001a\u00028\u0000\"\u0004\b\u0000\u0010s2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00172\"\b\u0002\u0010}\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020{\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010|0n0m2\f\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000uH\u0002¢\u0006\u0004\b~\u0010\u007fJF\u0010\u0083\u0001\u001a\u00020\u00122\u001c\u0010\u0081\u0001\u001a\u0017\u0012\u0004\u0012\u00020{\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010|0\u0080\u00012\u0014\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010u¢\u0006\u0003\b\u0082\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001b*\u00020a2\u0006\u0010H\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0014J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0014J\u001c\u0010\u008b\u0001\u001a\u00020\u00122\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u0014J\u001a\u0010\u008f\u0001\u001a\u00020\u00122\u0007\u0010\u008e\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u001aJ\u0011\u0010\u0090\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0014J\u0011\u0010\u0092\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0014J/\u0010\u0094\u0001\u001a\u00020\u00122\u0007\u0010\u0093\u0001\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u00105\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u001aJ/\u0010\u0098\u0001\u001a\u00020\u00122\u0007\u0010\u0093\u0001\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u00105\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0095\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u00122\u0007\u0010\u0093\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u001aJ\u0019\u0010\u009a\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u009a\u0001\u0010\u001aJ\u0011\u0010\u009b\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u009b\u0001\u0010\u0014J\u0011\u0010\u009c\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u009c\u0001\u0010\u0014J\u0011\u0010\u009d\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u009d\u0001\u0010\u0014J#\u0010\u009e\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\b\u009e\u0001\u0010\u001eJ\u0011\u0010\u009f\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u009f\u0001\u0010\u0014J\u0011\u0010 \u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b \u0001\u0010\u0014J\u0011\u0010¡\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0014J\u0011\u0010¢\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b¢\u0001\u0010\u0014J\u0011\u0010£\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b£\u0001\u0010\u0014J\u0012\u0010¤\u0001\u001a\u000203H\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0011\u0010¦\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¦\u0001\u0010\u0014J\u0011\u0010§\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b§\u0001\u0010\u0014J(\u0010©\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010\u009c\u00012\r\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000uH\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b«\u0001\u0010\u0014J\u0011\u0010¬\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¬\u0001\u0010\u0014J#\u0010\u00ad\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b\u00ad\u0001\u0010\u001eJ\u0011\u0010®\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b®\u0001\u0010\u0014J\u0011\u0010¯\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¯\u0001\u0010\u0014J\u0011\u0010°\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b°\u0001\u0010\u0014J\u000f\u0010±\u0001\u001a\u00020\u0012¢\u0006\u0005\b±\u0001\u0010\u0014J\u000f\u0010²\u0001\u001a\u00020\u0012¢\u0006\u0005\b²\u0001\u0010\u0014J\u001a\u0010´\u0001\u001a\u00020\u00122\u0007\u0010³\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b´\u0001\u0010\u001aJI\u0010¸\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010µ\u0001\"\u0005\b\u0001\u0010\u009c\u00012\u0006\u0010!\u001a\u00028\u00002\u001f\u0010v\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120¶\u0001¢\u0006\u0003\b·\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J(\u0010¼\u0001\u001a\u00020\u001b2\t\u0010º\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010»\u0001\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0014\u0010¾\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0014\u0010À\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\bÀ\u0001\u0010¿\u0001J\u001c\u0010Á\u0001\u001a\u0002032\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001c\u0010Ã\u0001\u001a\u0002032\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\bÃ\u0001\u0010Â\u0001J\u001b\u0010Å\u0001\u001a\u0002032\u0007\u0010!\u001a\u00030Ä\u0001H\u0017¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001b\u0010È\u0001\u001a\u0002032\u0007\u0010!\u001a\u00030Ç\u0001H\u0017¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001b\u0010Ë\u0001\u001a\u0002032\u0007\u0010!\u001a\u00030Ê\u0001H\u0017¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001a\u0010Í\u0001\u001a\u0002032\u0006\u0010!\u001a\u000203H\u0017¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u001b\u0010Ð\u0001\u001a\u0002032\u0007\u0010!\u001a\u00030Ï\u0001H\u0017¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001b\u0010Ó\u0001\u001a\u0002032\u0007\u0010!\u001a\u00030Ò\u0001H\u0017¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u001b\u0010Ö\u0001\u001a\u0002032\u0007\u0010!\u001a\u00030Õ\u0001H\u0017¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001a\u0010Ø\u0001\u001a\u0002032\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J1\u0010Û\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u009c\u00012\u0007\u0010Ú\u0001\u001a\u0002032\f\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000uH\u0087\b¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u001b\u0010Ý\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÝ\u0001\u0010#J\u001b\u0010Þ\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÞ\u0001\u0010#J!\u0010à\u0001\u001a\u00020\u00122\r\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120uH\u0016¢\u0006\u0006\bà\u0001\u0010ª\u0001J\u001f\u0010â\u0001\u001a\u00020\u00122\u000b\u0010!\u001a\u0007\u0012\u0002\b\u00030á\u0001H\u0017¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0011\u0010ä\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bä\u0001\u0010\u0014J)\u0010ç\u0001\u001a\u00020\u00122\u0015\u0010æ\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030á\u00010å\u0001H\u0017¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0011\u0010é\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bé\u0001\u0010\u0014J(\u0010ë\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u009c\u00012\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000ê\u0001H\u0017¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u0012\u0010í\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J&\u0010ñ\u0001\u001a\u0002032\u0007\u0010ï\u0001\u001a\u00020{2\t\u0010ð\u0001\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u0012\u0010ó\u0001\u001a\u00020\u0017H\u0001¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u0011\u0010õ\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bõ\u0001\u0010\u0014J\u0011\u0010ö\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bö\u0001\u0010\u0014J\u001a\u0010ø\u0001\u001a\u00020\u00122\u0007\u0010÷\u0001\u001a\u000203H\u0017¢\u0006\u0005\bø\u0001\u0010FJ\u001a\u0010ù\u0001\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u0015\u0010ü\u0001\u001a\u0005\u0018\u00010û\u0001H\u0017¢\u0006\u0006\bü\u0001\u0010ý\u0001J(\u0010þ\u0001\u001a\u00020\u00122\n\u0010!\u001a\u0006\u0012\u0002\b\u00030f2\b\u0010i\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J-\u0010\u0080\u0002\u001a\u00020\u00122\u001a\u0010p\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020o\u0012\u0006\u0012\u0004\u0018\u00010o0n0mH\u0017¢\u0006\u0005\b\u0080\u0002\u0010rJ\u001c\u0010\u0083\u0002\u001a\u00020\u00122\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0017¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J$\u0010\u0085\u0002\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0017¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u0011\u0010\u0087\u0002\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0087\u0002\u0010\u0014J\u0011\u0010\u0088\u0002\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0088\u0002\u0010\u0014JD\u0010\u0089\u0002\u001a\u00020\u00122\u001c\u0010\u0081\u0001\u001a\u0017\u0012\u0004\u0012\u00020{\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010|0\u0080\u00012\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0003\b\u0082\u0001H\u0000¢\u0006\u0006\b\u0089\u0002\u0010\u0084\u0001J \u0010\u008a\u0002\u001a\u00020\u00122\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00120uH\u0000¢\u0006\u0006\b\u008a\u0002\u0010ª\u0001J0\u0010\u008b\u0002\u001a\u0002032\u001c\u0010\u0081\u0001\u001a\u0017\u0012\u0004\u0012\u00020{\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010|0\u0080\u0001H\u0000¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u0011\u0010\u008d\u0002\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u008d\u0002\u0010\u0014J\u0014\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0006\b\u008e\u0002\u0010¿\u0001J\u001b\u0010\u008f\u0002\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b\u008f\u0002\u0010#J\u001c\u0010\u0091\u0002\u001a\u00020\u00122\b\u0010ï\u0001\u001a\u00030\u0090\u0002H\u0016¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÍ\u0001\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010\u0096\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0097\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010\u0098\u0002R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010\u0099\u0002R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010\u0099\u0002R\u001e\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R \u0010 \u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010=0\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010\u009f\u0002R\u001b\u0010¢\u0002\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010¡\u0002R\u0019\u0010£\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u009d\u0001R\u001a\u0010§\u0002\u001a\u00030¤\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0019\u0010¨\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010\u009d\u0001R\u001a\u0010©\u0002\u001a\u00030¤\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010¦\u0002R\u001c\u0010¬\u0002\u001a\u0005\u0018\u00010ª\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010«\u0002R\u001c\u0010°\u0002\u001a\u0005\u0018\u00010\u00ad\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u0019\u0010±\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u00ad\u0001R\u0019\u0010²\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010\u00ad\u0001R\u0019\u0010³\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u00ad\u0001R\u001e\u0010}\u001a\n\u0012\u0005\u0012\u00030µ\u00020´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010¶\u0002R\u0018\u0010·\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¦\u0002R\u0019\u0010¹\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010¸\u0002R\"\u0010¼\u0002\u001a\u000b\u0012\u0004\u0012\u00020$\u0018\u00010º\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010»\u0002R\u0019\u0010½\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010\u00ad\u0001R\u0018\u0010¿\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¦\u0002R\u0019\u0010À\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u00ad\u0001R\u0019\u0010Â\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010\u009d\u0001R\u0019\u0010Ä\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010\u009d\u0001R\u0019\u0010Å\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u009d\u0001R\u0019\u0010Ç\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010\u00ad\u0001R\u0018\u0010Ê\u0002\u001a\u00030È\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0002\u0010É\u0002R\u001e\u0010Ë\u0002\u001a\t\u0012\u0004\u0012\u00020{0\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u009f\u0002R*\u0010Î\u0002\u001a\u0002032\u0007\u0010Ì\u0002\u001a\u0002038\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bä\u0001\u0010\u00ad\u0001\u001a\u0006\bÍ\u0002\u0010¥\u0001R*\u0010Ð\u0002\u001a\u0002032\u0007\u0010Ì\u0002\u001a\u0002038\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\bÏ\u0002\u0010¥\u0001R(\u0010t\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010Ñ\u0002\u001a\u0006\bÒ\u0002\u0010Ó\u0002\"\u0006\bÔ\u0002\u0010Õ\u0002R)\u0010Û\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÖ\u0002\u0010\u0097\u0002\u001a\u0006\b×\u0002\u0010Ø\u0002\"\u0006\bÙ\u0002\u0010Ú\u0002R\u001a\u0010Þ\u0002\u001a\u00030Ü\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010Ý\u0002R\u0019\u0010ß\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u00ad\u0001R\u001b\u0010à\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¸\u0002R+\u0010æ\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bá\u0002\u0010\u0099\u0002\u001a\u0006\bâ\u0002\u0010ã\u0002\"\u0006\bä\u0002\u0010å\u0002R\u0018\u0010é\u0002\u001a\u00030ç\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010è\u0002R\u001a\u0010ë\u0002\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010ê\u0002R\u001a\u0010î\u0002\u001a\u00030ì\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010í\u0002R/\u0010B\u001a\u0002032\u0007\u0010Ì\u0002\u001a\u0002038\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bs\u0010\u00ad\u0001\u0012\u0005\b\u009a\u0002\u0010\u0014\u001a\u0006\b¥\u0002\u0010¥\u0001R1\u0010ð\u0002\u001a\u00020\u00172\u0007\u0010Ì\u0002\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bÃ\u0001\u0010\u009d\u0001\u0012\u0005\bÖ\u0002\u0010\u0014\u001a\u0006\bï\u0002\u0010ô\u0001R\u0019\u0010ñ\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u00ad\u0001R\u0019\u0010ò\u0002\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u00ad\u0001R\u0018\u0010ó\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¦\u0002R\u001e\u0010ö\u0002\u001a\u0002038VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bõ\u0002\u0010\u0014\u001a\u0006\bô\u0002\u0010¥\u0001R\u001e\u0010ø\u0002\u001a\u0002038VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b÷\u0002\u0010\u0014\u001a\u0006\b®\u0002\u0010¥\u0001R\u001d\u0010û\u0002\u001a\u0004\u0018\u00010\u001b*\u00020a8BX\u0082\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010ú\u0002R\u0017\u0010ý\u0002\u001a\u0002038@X\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0002\u0010¥\u0001R\u0017\u0010ÿ\u0002\u001a\u0002038@X\u0080\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010¥\u0001R\u0018\u0010\u0082\u0003\u001a\u00030\u0080\u00038WX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010\u0081\u0003R\u0017\u0010\u0084\u0003\u001a\u00020\u00178VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0003\u0010ô\u0001R\u0017\u0010\u0087\u0003\u001a\u00030\u0085\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bs\u0010\u0086\u0003R\u0018\u0010\u008a\u0003\u001a\u00030\u0088\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010\u0089\u0003R\u0017\u0010\u008c\u0003\u001a\u00020\u00178@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010ô\u0001R\u0019\u0010\u008f\u0003\u001a\u0004\u0018\u00010{8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0003\u0010\u008e\u0003R\u0014\u0010\u0091\u0003\u001a\u0002038F¢\u0006\b\u001a\u0006\b\u0090\u0003\u0010¥\u0001R\u001a\u0010\u0093\u0003\u001a\u0005\u0018\u00010\u0090\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bá\u0002\u0010\u0092\u0003R\u0019\u0010\u0095\u0003\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0003\u0010¿\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0096\u0003"}, d2 = {"Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/t;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/z;", "parentContext", "Landroidx/compose/runtime/x3;", "slotTable", "", "Landroidx/compose/runtime/p3;", "abandonSet", "Landroidx/compose/runtime/changelist/d;", "changes", "lateChanges", "Landroidx/compose/runtime/n0;", "composition", "<init>", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/z;Landroidx/compose/runtime/x3;Ljava/util/Set;Landroidx/compose/runtime/changelist/d;Landroidx/compose/runtime/changelist/d;Landroidx/compose/runtime/n0;)V", "Lkotlin/k2;", "R1", "()V", "V0", "t0", "", "key", "N1", "(I)V", "", "dataKey", "O1", "(ILjava/lang/Object;)V", "T0", "K1", "value", "b2", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/t2;", "M0", "()Landroidx/compose/runtime/t2;", "group", "N0", "(I)Landroidx/compose/runtime/t2;", "parentScope", "currentProviders", "a2", "(Landroidx/compose/runtime/t2;Landroidx/compose/runtime/t2;)Landroidx/compose/runtime/t2;", "providers", "C1", "(Landroidx/compose/runtime/t2;)V", "W0", "L0", "", "isNode", "data", "P1", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/i1;", "kind", "M1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/s2;", "newPending", "X0", "(ZLandroidx/compose/runtime/s2;)V", "expectedNodeCount", "inserting", "Y0", "(IZ)V", "S0", "(Z)V", "z1", "index", "m1", "(I)I", "newCount", "Z1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "t1", "(IIII)I", "d2", "count", "Y1", "I0", "oldGroup", "newGroup", "commonRoot", "D1", "(III)V", "nearestCommonRoot", "R0", "recomposeKey", "K0", "(III)I", "Landroidx/compose/runtime/w3;", "k1", "(Landroidx/compose/runtime/w3;I)I", "L1", "E0", "Landroidx/compose/runtime/c2;", "content", "locals", "parameter", "force", "n1", "(Landroidx/compose/runtime/c2;Landroidx/compose/runtime/t2;Ljava/lang/Object;Z)V", "", "Lkotlin/q0;", "Landroidx/compose/runtime/f2;", "references", "l1", "(Ljava/util/List;)V", "R", "reader", "Lkotlin/Function0;", "block", "h2", "(Landroidx/compose/runtime/w3;Lld/a;)Ljava/lang/Object;", "from", "to", "Landroidx/compose/runtime/f3;", "Landroidx/compose/runtime/collection/d;", "invalidations", "x1", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/n0;Ljava/lang/Integer;Ljava/util/List;Lld/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/c;", "invalidationsRequested", "Landroidx/compose/runtime/i;", "Q0", "(Landroidx/compose/runtime/collection/c;Lld/p;)V", "s1", "(Landroidx/compose/runtime/w3;I)Ljava/lang/Object;", "e2", "f2", "Landroidx/compose/runtime/d;", "anchor", "B1", "(Landroidx/compose/runtime/d;)V", "A1", "groupBeingRemoved", "F1", "E1", "Z0", "H0", "groupKey", "U1", "(ILjava/lang/Object;Ljava/lang/Object;)V", "keyHash", "V1", "W1", "X1", "P", "p0", "T", "I", "U", "o0", "G0", "M", "P0", "O0", "a1", "()Z", "v", "W", "factory", "F", "(Lld/a;)V", "C", "H", "Z", "O", "X", "e", "Q1", "U0", "marker", "z", "V", "Lkotlin/Function2;", "Lkotlin/u;", "w", "(Ljava/lang/Object;Lld/p;)V", "left", "right", "u", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "q1", "()Ljava/lang/Object;", "r1", "q0", "(Ljava/lang/Object;)Z", "S", "", "j", "(C)Z", "", "i", "(B)Z", "", "c", "(S)Z", "b", "(Z)Z", "", "d", "(F)Z", "", "g", "(J)Z", "", "k", "(D)Z", "f", "(I)Z", "invalid", "F0", "(ZLld/a;)Ljava/lang/Object;", "c2", "T1", "effect", "r", "Landroidx/compose/runtime/b3;", "Y", "(Landroidx/compose/runtime/b3;)V", "G", "", "values", "s0", "([Landroidx/compose/runtime/b3;)V", "h0", "Landroidx/compose/runtime/d0;", "x", "(Landroidx/compose/runtime/d0;)Ljava/lang/Object;", "m0", "()Landroidx/compose/runtime/z;", "scope", "instance", "S1", "(Landroidx/compose/runtime/f3;Ljava/lang/Object;)Z", "u1", "()I", "n", "d0", "changed", "m", "o", "(I)Landroidx/compose/runtime/t;", "Landroidx/compose/runtime/t3;", "t", "()Landroidx/compose/runtime/t3;", "K", "(Landroidx/compose/runtime/c2;Ljava/lang/Object;)V", "q", "", "sourceInformation", "b0", "(Ljava/lang/String;)V", "f0", "(ILjava/lang/String;)V", "n0", "L", "J0", "v1", "w1", "(Landroidx/compose/runtime/collection/c;)Z", "g2", "Q", "E", "Landroidx/compose/runtime/e3;", "j0", "(Landroidx/compose/runtime/e3;)V", "Landroidx/compose/runtime/e;", "s", "()Landroidx/compose/runtime/e;", "Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/x3;", "Ljava/util/Set;", "Landroidx/compose/runtime/changelist/d;", "h", "Landroidx/compose/runtime/n0;", "g0", "()Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/a5;", "Landroidx/compose/runtime/a5;", "pendingStack", "Landroidx/compose/runtime/s2;", "pending", "nodeIndex", "Landroidx/compose/runtime/n1;", "l", "Landroidx/compose/runtime/n1;", "nodeIndexStack", "groupNodeCount", "groupNodeCountStack", "", "[I", "nodeCountOverrides", "Landroidx/collection/t1;", "p", "Landroidx/collection/t1;", "nodeCountVirtualOverrides", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/r1;", "Ljava/util/List;", "entersStack", "Landroidx/compose/runtime/t2;", "parentProvider", "Landroidx/compose/runtime/collection/f;", "Landroidx/compose/runtime/collection/f;", "providerUpdates", "providersInvalid", "y", "providersInvalidStack", "reusing", "A", "reusingGroup", "B", "childrenComposing", "compositionToken", "D", "sourceInformationEnabled", "androidx/compose/runtime/v$c", "Landroidx/compose/runtime/v$c;", "derivedStateObserver", "invalidateStack", "<set-?>", "o1", "isComposing", "p1", "isDisposed", "Landroidx/compose/runtime/w3;", "j1", "()Landroidx/compose/runtime/w3;", "J1", "(Landroidx/compose/runtime/w3;)V", "J", "h1", "()Landroidx/compose/runtime/x3;", "I1", "(Landroidx/compose/runtime/x3;)V", "insertTable", "Landroidx/compose/runtime/a4;", "Landroidx/compose/runtime/a4;", "writer", "writerHasAProvider", "providerCache", "N", "e1", "()Landroidx/compose/runtime/changelist/d;", "H1", "(Landroidx/compose/runtime/changelist/d;)V", "deferredChanges", "Landroidx/compose/runtime/changelist/e;", "Landroidx/compose/runtime/changelist/e;", "changeListWriter", "Landroidx/compose/runtime/d;", "insertAnchor", "Landroidx/compose/runtime/changelist/f;", "Landroidx/compose/runtime/changelist/f;", "insertFixups", "l0", "compoundKeyHash", "startedGroup", "implicitRootStart", "startedGroups", "i0", "e0", "defaultsInvalid", "k0", "skipping", "i1", "(Landroidx/compose/runtime/w3;)Ljava/lang/Object;", "node", "b1", "areChildrenComposing", "g1", "hasPendingChanges", "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", "applyCoroutineContext", "a", "currentMarker", "Landroidx/compose/runtime/tooling/a;", "()Landroidx/compose/runtime/tooling/a;", "compositionData", "Landroidx/compose/runtime/g0;", "()Landroidx/compose/runtime/g0;", "currentCompositionLocalMap", "c1", "changeCount", "d1", "()Landroidx/compose/runtime/f3;", "currentRecomposeScope", "f1", "hasInvalidations", "()Landroidx/compose/runtime/e3;", "recomposeScope", "a0", "recomposeScopeIdentity", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 7 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 8 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 9 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 10 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 11 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 12 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 13 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 14 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4197:1\n3157#1,8:4256\n3166#1,3:4279\n1#2:4198\n150#3,8:4199\n150#3,8:4244\n150#3,4:4252\n155#3,3:4282\n150#3,4:4348\n155#3,3:4360\n46#4,5:4207\n46#4,3:4321\n50#4:4327\n4178#5,5:4212\n4178#5,5:4217\n4178#5,5:4226\n4178#5,5:4231\n4178#5,5:4301\n4178#5,5:4306\n4178#5,5:4311\n4178#5,5:4316\n4178#5,5:4338\n4178#5,5:4343\n4178#5,5:4363\n75#6:4222\n4100#7:4223\n4101#7:4224\n26#8:4225\n26#8:4368\n22#8:4369\n180#9,4:4236\n180#9,4:4264\n190#9,8:4268\n185#9,3:4276\n185#9,3:4286\n180#9,8:4352\n33#10,4:4240\n38#10:4285\n33#10,4:4289\n38#10:4300\n82#10,3:4370\n33#10,4:4373\n85#10,2:4377\n38#10:4379\n87#10:4380\n108#11,7:4293\n153#12,3:4324\n157#12:4328\n388#13,6:4329\n394#13,2:4336\n48#14:4335\n1855#15,2:4381\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3120#1:4256,8\n3120#1:4279,3\n1313#1:4199,8\n3061#1:4244,8\n3119#1:4252,4\n3119#1:4282,3\n3497#1:4348,4\n3497#1:4360,3\n1565#1:4207,5\n3276#1:4321,3\n3276#1:4327\n1638#1:4212,5\n1651#1:4217,5\n2843#1:4226,5\n2856#1:4231,5\n3234#1:4301,5\n3239#1:4306,5\n3255#1:4311,5\n3275#1:4316,5\n3335#1:4338,5\n3342#1:4343,5\n3509#1:4363,5\n2020#1:4222\n2214#1:4223\n2238#1:4224\n2766#1:4225\n3689#1:4368\n3705#1:4369\n3038#1:4236,4\n3125#1:4264,4\n3126#1:4268,8\n3125#1:4276,3\n3038#1:4286,3\n3499#1:4352,8\n3040#1:4240,4\n3040#1:4285\n3184#1:4289,4\n3184#1:4300\n3408#1:4370,3\n3408#1:4373,4\n3408#1:4377,2\n3408#1:4379\n3408#1:4380\n3186#1:4293,7\n3279#1:4324,3\n3279#1:4328\n3299#1:4329,6\n3299#1:4336,2\n3299#1:4335\n3440#1:4381,2\n*E\n"})
/* loaded from: classes.dex */
public final class v implements t {
    public static final int W = 8;

    /* renamed from: B, reason: from kotlin metadata */
    private int childrenComposing;

    /* renamed from: C, reason: from kotlin metadata */
    private int compositionToken;

    /* renamed from: D, reason: from kotlin metadata */
    private boolean sourceInformationEnabled;

    /* renamed from: G, reason: from kotlin metadata */
    private boolean isComposing;

    /* renamed from: H, reason: from kotlin metadata */
    private boolean isDisposed;

    /* renamed from: I, reason: from kotlin metadata */
    @fg.l
    private w3 reader;

    /* renamed from: J, reason: from kotlin metadata */
    @fg.l
    private x3 insertTable;

    /* renamed from: K, reason: from kotlin metadata */
    @fg.l
    private a4 writer;

    /* renamed from: L, reason: from kotlin metadata */
    private boolean writerHasAProvider;

    /* renamed from: M, reason: from kotlin metadata */
    @fg.m
    private t2 providerCache;

    /* renamed from: N, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.changelist.d deferredChanges;

    /* renamed from: O, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.changelist.e changeListWriter;

    /* renamed from: P, reason: from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.d insertAnchor;

    /* renamed from: Q, reason: from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.changelist.f insertFixups;

    /* renamed from: R, reason: from kotlin metadata */
    private boolean inserting;

    /* renamed from: S, reason: from kotlin metadata */
    private int compoundKeyHash;

    /* renamed from: T, reason: from kotlin metadata */
    private boolean startedGroup;

    /* renamed from: U, reason: from kotlin metadata */
    private boolean implicitRootStart;

    /* renamed from: V, reason: from kotlin metadata */
    @fg.l
    private final n1 startedGroups;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.e<?> applier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z parentContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 slotTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<p3> abandonSet;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.changelist.d changes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.changelist.d lateChanges;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n0 composition;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s2 pending;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private int[] nodeCountOverrides;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.collection.t1 nodeCountVirtualOverrides;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.collection.f<t2> providerUpdates;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean reusing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a5<s2> pendingStack = new a5<>();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private n1 nodeIndexStack = new n1();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private n1 groupNodeCountStack = new n1();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<r1> invalidations = new ArrayList();

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 entersStack = new n1();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private t2 parentProvider = androidx.compose.runtime.internal.t.b();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 providersInvalidStack = new n1();

    /* renamed from: A, reason: from kotlin metadata */
    private int reusingGroup = -1;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final c derivedStateObserver = new c();

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    private final a5<f3> invalidateStack = new a5<>();

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/v$a;", "Landroidx/compose/runtime/s3;", "Landroidx/compose/runtime/v$b;", "Landroidx/compose/runtime/v;", "ref", "<init>", "(Landroidx/compose/runtime/v$b;)V", "Lkotlin/k2;", "b", "()V", "c", "d", "Landroidx/compose/runtime/v$b;", "a", "()Landroidx/compose/runtime/v$b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements s3 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b ref;

        public a(@fg.l b bVar) {
            this.ref = bVar;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.p3
        public void b() {
        }

        @Override // androidx.compose.runtime.p3
        public void c() {
            this.ref.w();
        }

        @Override // androidx.compose.runtime.p3
        public void d() {
            this.ref.w();
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0017\u0010\u0016J*\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0010¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0010¢\u0006\u0004\b,\u0010\rJ\u000f\u0010-\u001a\u00020\u000bH\u0010¢\u0006\u0004\b-\u0010\rJ\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0010¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0010¢\u0006\u0004\b2\u00101J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010/\u001a\u00020.H\u0010¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00106\u001a\u000203H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b9\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b@\u0010?R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR0\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010+R\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020I0'8\u0006¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\bJ\u0010FR+\u0010Q\u001a\u00020\"2\u0006\u0010L\u001a\u00020\"8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010V\u001a\u00020R8PX\u0090\u0004¢\u0006\f\u0012\u0004\bU\u0010\r\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010T¨\u0006X"}, d2 = {"Landroidx/compose/runtime/v$b;", "Landroidx/compose/runtime/z;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/i0;", "observerHolder", "<init>", "(Landroidx/compose/runtime/v;IZZLandroidx/compose/runtime/i0;)V", "Lkotlin/k2;", "w", "()V", "Landroidx/compose/runtime/t;", "composer", "q", "(Landroidx/compose/runtime/t;)V", "u", "Landroidx/compose/runtime/n0;", "composition", "r", "(Landroidx/compose/runtime/n0;)V", "v", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/runtime/n0;Lld/p;)V", "l", "Landroidx/compose/runtime/f3;", "scope", "m", "(Landroidx/compose/runtime/f3;)V", "Landroidx/compose/runtime/t2;", "f", "()Landroidx/compose/runtime/t2;", "D", "(Landroidx/compose/runtime/t2;)V", "", "Landroidx/compose/runtime/tooling/a;", "table", "p", "(Ljava/util/Set;)V", "t", "c", "Landroidx/compose/runtime/f2;", "reference", "k", "(Landroidx/compose/runtime/f2;)V", "b", "Landroidx/compose/runtime/e2;", "o", "(Landroidx/compose/runtime/f2;)Landroidx/compose/runtime/e2;", "data", "n", "(Landroidx/compose/runtime/f2;Landroidx/compose/runtime/e2;)V", "s", "I", "g", "()I", "Z", "d", "()Z", "e", "Landroidx/compose/runtime/i0;", "i", "()Landroidx/compose/runtime/i0;", "Ljava/util/Set;", "z", "()Ljava/util/Set;", "C", "inspectionTables", "Landroidx/compose/runtime/v;", "x", "composers", "<set-?>", "h", "Landroidx/compose/runtime/k2;", "y", "B", "compositionLocalScope", "Lkotlin/coroutines/g;", "j", "()Lkotlin/coroutines/g;", "A", "recomposeCoroutineContext", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4197:1\n1855#2,2:4198\n81#3:4200\n107#3,2:4201\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3574#1:4198,2\n3624#1:4200\n3624#1:4201,2\n*E\n"})
    private final class b extends z {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int compoundHashKey;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final i0 observerHolder;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Set<Set<androidx.compose.runtime.tooling.a>> inspectionTables;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Set<v> composers = new LinkedHashSet();

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final k2 compositionLocalScope = androidx.compose.runtime.b.e(androidx.compose.runtime.internal.t.b(), s4.b());

        public b(int i4, boolean z4, boolean z5, @fg.m i0 i0Var) {
            this.compoundHashKey = i4;
            this.collectingParameterInformation = z4;
            this.collectingSourceInformation = z5;
            this.observerHolder = i0Var;
        }

        public static /* synthetic */ void A() {
        }

        private final void B(t2 t2Var) {
            this.compositionLocalScope.setValue(t2Var);
        }

        private final t2 y() {
            return (t2) this.compositionLocalScope.getValue();
        }

        public final void C(@fg.m Set<Set<androidx.compose.runtime.tooling.a>> set) {
            this.inspectionTables = set;
        }

        public final void D(@fg.l t2 scope) {
            B(scope);
        }

        @Override // androidx.compose.runtime.z
        @j(scheme = "[0[0]]")
        public void a(@fg.l n0 composition, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
            v.this.parentContext.a(composition, content);
        }

        @Override // androidx.compose.runtime.z
        public void b(@fg.l f2 reference) {
            v.this.parentContext.b(reference);
        }

        @Override // androidx.compose.runtime.z
        public void c() {
            v vVar = v.this;
            vVar.childrenComposing--;
        }

        @Override // androidx.compose.runtime.z
        /* renamed from: d, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.z
        /* renamed from: e, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.z
        @fg.l
        public t2 f() {
            return y();
        }

        @Override // androidx.compose.runtime.z
        /* renamed from: g, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.z
        @fg.l
        /* renamed from: h */
        public kotlin.coroutines.g getEffectCoroutineContext() {
            return v.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.z
        @fg.m
        /* renamed from: i, reason: from getter */
        public i0 getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.z
        @fg.l
        public kotlin.coroutines.g j() {
            return c0.k(v.this.getComposition());
        }

        @Override // androidx.compose.runtime.z
        public void k(@fg.l f2 reference) {
            v.this.parentContext.k(reference);
        }

        @Override // androidx.compose.runtime.z
        public void l(@fg.l n0 composition) {
            v.this.parentContext.l(v.this.getComposition());
            v.this.parentContext.l(composition);
        }

        @Override // androidx.compose.runtime.z
        public void m(@fg.l f3 scope) {
            v.this.parentContext.m(scope);
        }

        @Override // androidx.compose.runtime.z
        public void n(@fg.l f2 reference, @fg.l e2 data) {
            v.this.parentContext.n(reference, data);
        }

        @Override // androidx.compose.runtime.z
        @fg.m
        public e2 o(@fg.l f2 reference) {
            return v.this.parentContext.o(reference);
        }

        @Override // androidx.compose.runtime.z
        public void p(@fg.l Set<androidx.compose.runtime.tooling.a> table) {
            Set set = this.inspectionTables;
            if (set == null) {
                set = new HashSet();
                this.inspectionTables = set;
            }
            set.add(table);
        }

        @Override // androidx.compose.runtime.z
        public void q(@fg.l t composer) {
            kotlin.jvm.internal.l0.n(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.z
        public void r(@fg.l n0 composition) {
            v.this.parentContext.r(composition);
        }

        @Override // androidx.compose.runtime.z
        public void s(@fg.l n0 composition) {
            v.this.parentContext.s(composition);
        }

        @Override // androidx.compose.runtime.z
        public void t() {
            v.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.z
        public void u(@fg.l t composer) {
            Set<Set<androidx.compose.runtime.tooling.a>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    kotlin.jvm.internal.l0.n(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((v) composer).slotTable);
                }
            }
            kotlin.jvm.internal.u1.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.z
        public void v(@fg.l n0 composition) {
            v.this.parentContext.v(composition);
        }

        public final void w() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<androidx.compose.runtime.tooling.a>> set = this.inspectionTables;
            if (set != null) {
                for (v vVar : this.composers) {
                    Iterator<Set<androidx.compose.runtime.tooling.a>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(vVar.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @fg.l
        public final Set<v> x() {
            return this.composers;
        }

        @fg.m
        public final Set<Set<androidx.compose.runtime.tooling.a>> z() {
            return this.inspectionTables;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/v$c", "Landroidx/compose/runtime/s0;", "Landroidx/compose/runtime/r0;", "derivedState", "Lkotlin/k2;", "b", "(Landroidx/compose/runtime/r0;)V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements s0 {
        c() {
        }

        @Override // androidx.compose.runtime.s0
        public void a(@fg.l r0<?> derivedState) {
            v vVar = v.this;
            vVar.childrenComposing--;
        }

        @Override // androidx.compose.runtime.s0
        public void b(@fg.l r0<?> derivedState) {
            v.this.childrenComposing++;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n+ 2 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4197:1\n180#2,4:4198\n190#2,8:4210\n185#2,3:4221\n3157#3,8:4202\n3166#3,3:4218\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n*L\n3066#1:4198,4\n3068#1:4210,8\n3066#1:4221,3\n3067#1:4202,8\n3067#1:4218,3\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.changelist.d f17249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w3 f17250d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f2 f17251e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.runtime.changelist.d dVar, w3 w3Var, f2 f2Var) {
            super(0);
            this.f17249c = dVar;
            this.f17250d = w3Var;
            this.f17251e = f2Var;
        }

        public final void a() {
            androidx.compose.runtime.changelist.e eVar = v.this.changeListWriter;
            androidx.compose.runtime.changelist.d dVar = this.f17249c;
            v vVar = v.this;
            w3 w3Var = this.f17250d;
            f2 f2Var = this.f17251e;
            androidx.compose.runtime.changelist.d changeList = eVar.getChangeList();
            try {
                eVar.S(dVar);
                w3 reader = vVar.getReader();
                int[] iArr = vVar.nodeCountOverrides;
                androidx.compose.runtime.collection.f fVar = vVar.providerUpdates;
                vVar.nodeCountOverrides = null;
                vVar.providerUpdates = null;
                try {
                    vVar.J1(w3Var);
                    androidx.compose.runtime.changelist.e eVar2 = vVar.changeListWriter;
                    boolean implicitRootStart = eVar2.getImplicitRootStart();
                    try {
                        eVar2.T(false);
                        vVar.n1(f2Var.c(), f2Var.getLocals(), f2Var.getParameter(), true);
                        eVar2.T(implicitRootStart);
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                    } catch (Throwable th) {
                        eVar2.T(implicitRootStart);
                        throw th;
                    }
                } finally {
                    vVar.J1(reader);
                    vVar.nodeCountOverrides = iArr;
                    vVar.providerUpdates = fVar;
                }
            } finally {
                eVar.S(changeList);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2 f17253c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f2 f2Var) {
            super(0);
            this.f17253c = f2Var;
        }

        public final void a() {
            v.this.n1(this.f17253c.c(), this.f17253c.getLocals(), this.f17253c.getParameter(), true);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c2<Object> f17254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f17255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c2<Object> c2Var, Object obj) {
            super(2);
            this.f17254b = c2Var;
            this.f17255c = obj;
        }

        @i
        public final void a(@fg.m t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(316014703, i4, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3004)");
            }
            this.f17254b.a().R(this.f17255c, tVar, 8);
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    public v(@fg.l androidx.compose.runtime.e<?> eVar, @fg.l z zVar, @fg.l x3 x3Var, @fg.l Set<p3> set, @fg.l androidx.compose.runtime.changelist.d dVar, @fg.l androidx.compose.runtime.changelist.d dVar2, @fg.l n0 n0Var) {
        this.applier = eVar;
        this.parentContext = zVar;
        this.slotTable = x3Var;
        this.abandonSet = set;
        this.changes = dVar;
        this.lateChanges = dVar2;
        this.composition = n0Var;
        w3 d02 = x3Var.d0();
        d02.e();
        this.reader = d02;
        x3 x3Var2 = new x3();
        this.insertTable = x3Var2;
        a4 e02 = x3Var2.e0();
        e02.N();
        this.writer = e02;
        this.changeListWriter = new androidx.compose.runtime.changelist.e(this, this.changes);
        w3 d03 = this.insertTable.d0();
        try {
            androidx.compose.runtime.d a5 = d03.a(0);
            d03.e();
            this.insertAnchor = a5;
            this.insertFixups = new androidx.compose.runtime.changelist.f();
            this.implicitRootStart = true;
            this.startedGroups = new n1();
        } catch (Throwable th) {
            d03.e();
            throw th;
        }
    }

    private final void A1() {
        F1(this.reader.getCurrentGroup());
        this.changeListWriter.O();
    }

    private final void B1(androidx.compose.runtime.d anchor) {
        if (this.insertFixups.h()) {
            this.changeListWriter.s(anchor, this.insertTable);
        } else {
            this.changeListWriter.t(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new androidx.compose.runtime.changelist.f();
        }
    }

    private final void C1(t2 providers) {
        androidx.compose.runtime.collection.f<t2> fVar = this.providerUpdates;
        if (fVar == null) {
            fVar = new androidx.compose.runtime.collection.f<>(0, 1, null);
            this.providerUpdates = fVar;
        }
        fVar.g(this.reader.getCurrentGroup(), providers);
    }

    private final void D1(int oldGroup, int newGroup, int commonRoot) {
        int d02;
        w3 w3Var = this.reader;
        d02 = x.d0(w3Var, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != d02) {
            if (w3Var.O(oldGroup)) {
                this.changeListWriter.z();
            }
            oldGroup = w3Var.U(oldGroup);
        }
        R0(newGroup, d02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r0 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E0() {
        /*
            r4 = this;
            boolean r0 = r4.inserting
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L20
            androidx.compose.runtime.f3 r0 = new androidx.compose.runtime.f3
            androidx.compose.runtime.n0 r2 = r4.composition
            kotlin.jvm.internal.l0.n(r2, r1)
            androidx.compose.runtime.b0 r2 = (androidx.compose.runtime.b0) r2
            r0.<init>(r2)
            androidx.compose.runtime.a5<androidx.compose.runtime.f3> r1 = r4.invalidateStack
            r1.h(r0)
            r4.c2(r0)
            int r1 = r4.compositionToken
            r0.M(r1)
            goto L71
        L20:
            java.util.List<androidx.compose.runtime.r1> r0 = r4.invalidations
            androidx.compose.runtime.w3 r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.r1 r0 = androidx.compose.runtime.x.p(r0, r2)
            androidx.compose.runtime.w3 r2 = r4.reader
            java.lang.Object r2 = r2.P()
            androidx.compose.runtime.t$a r3 = androidx.compose.runtime.t.INSTANCE
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.l0.g(r2, r3)
            if (r3 == 0) goto L4e
            androidx.compose.runtime.f3 r2 = new androidx.compose.runtime.f3
            androidx.compose.runtime.n0 r3 = r4.composition
            kotlin.jvm.internal.l0.n(r3, r1)
            androidx.compose.runtime.b0 r3 = (androidx.compose.runtime.b0) r3
            r2.<init>(r3)
            r4.c2(r2)
            goto L55
        L4e:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.l0.n(r2, r1)
            androidx.compose.runtime.f3 r2 = (androidx.compose.runtime.f3) r2
        L55:
            if (r0 != 0) goto L63
            boolean r0 = r2.p()
            r1 = 0
            if (r0 == 0) goto L61
            r2.H(r1)
        L61:
            if (r0 == 0) goto L64
        L63:
            r1 = 1
        L64:
            r2.I(r1)
            androidx.compose.runtime.a5<androidx.compose.runtime.f3> r0 = r4.invalidateStack
            r0.h(r2)
            int r0 = r4.compositionToken
            r2.M(r0)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.v.E0():void");
    }

    private final void E1() {
        if (this.slotTable.p()) {
            androidx.compose.runtime.changelist.d dVar = new androidx.compose.runtime.changelist.d();
            this.deferredChanges = dVar;
            w3 d02 = this.slotTable.d0();
            try {
                this.reader = d02;
                androidx.compose.runtime.changelist.e eVar = this.changeListWriter;
                androidx.compose.runtime.changelist.d changeList = eVar.getChangeList();
                try {
                    eVar.S(dVar);
                    F1(0);
                    this.changeListWriter.L();
                    eVar.S(changeList);
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    eVar.S(changeList);
                    throw th;
                }
            } finally {
                d02.e();
            }
        }
    }

    private final void F1(int groupBeingRemoved) {
        G1(this, groupBeingRemoved, false, 0);
        this.changeListWriter.h();
    }

    private static final int G1(v vVar, int i4, boolean z4, int i5) {
        List A;
        w3 w3Var = vVar.reader;
        if (!w3Var.K(i4)) {
            if (!w3Var.f(i4)) {
                if (w3Var.O(i4)) {
                    return 1;
                }
                return w3Var.S(i4);
            }
            int J = w3Var.J(i4) + i4;
            int i6 = 0;
            for (int i7 = i4 + 1; i7 < J; i7 += w3Var.J(i7)) {
                boolean O = w3Var.O(i7);
                if (O) {
                    vVar.changeListWriter.h();
                    vVar.changeListWriter.v(w3Var.Q(i7));
                }
                i6 += G1(vVar, i7, O || z4, O ? 0 : i5 + i6);
                if (O) {
                    vVar.changeListWriter.h();
                    vVar.changeListWriter.z();
                }
            }
            if (w3Var.O(i4)) {
                return 1;
            }
            return i6;
        }
        int G = w3Var.G(i4);
        Object I = w3Var.I(i4);
        if (G != 126665345 || !(I instanceof c2)) {
            if (G != 206 || !kotlin.jvm.internal.l0.g(I, x.W())) {
                if (w3Var.O(i4)) {
                    return 1;
                }
                return w3Var.S(i4);
            }
            Object F = w3Var.F(i4, 0);
            a aVar = F instanceof a ? (a) F : null;
            if (aVar != null) {
                for (v vVar2 : aVar.getRef().x()) {
                    vVar2.E1();
                    vVar.parentContext.s(vVar2.composition);
                }
            }
            return w3Var.S(i4);
        }
        c2 c2Var = (c2) I;
        Object F2 = w3Var.F(i4, 0);
        androidx.compose.runtime.d a5 = w3Var.a(i4);
        A = x.A(vVar.invalidations, i4, w3Var.J(i4) + i4);
        ArrayList arrayList = new ArrayList(A.size());
        int size = A.size();
        for (int i10 = 0; i10 < size; i10++) {
            r1 r1Var = (r1) A.get(i10);
            arrayList.add(new kotlin.q0(r1Var.getScope(), r1Var.a()));
        }
        f2 f2Var = new f2(c2Var, F2, vVar.composition, vVar.slotTable, a5, arrayList, vVar.N0(i4));
        vVar.parentContext.b(f2Var);
        vVar.changeListWriter.K();
        vVar.changeListWriter.M(vVar.composition, vVar.parentContext, f2Var);
        if (!z4) {
            return w3Var.S(i4);
        }
        vVar.changeListWriter.i(i5, i4);
        return 0;
    }

    private final void H0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.R();
        this.invalidateStack.a();
        I0();
    }

    private final void I0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    @p1
    public static /* synthetic */ void J() {
    }

    private final int K0(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int k12 = k1(this.reader, group);
        return k12 == 126665345 ? k12 : Integer.rotateLeft(K0(this.reader.U(group), recomposeGroup, recomposeKey), 3) ^ k12;
    }

    private final void K1() {
        this.groupNodeCount = this.reader.Y() + this.groupNodeCount;
    }

    private final void L0() {
        x.l0(this.writer.getClosed());
        x3 x3Var = new x3();
        this.insertTable = x3Var;
        a4 e02 = x3Var.e0();
        e02.N();
        this.writer = e02;
    }

    private final void L1() {
        this.groupNodeCount = this.reader.y();
        this.reader.Z();
    }

    private final t2 M0() {
        t2 t2Var = this.providerCache;
        return t2Var != null ? t2Var : N0(this.reader.getParent());
    }

    private final void M1(int key, Object objectKey, int kind, Object data) {
        Object obj = objectKey;
        f2();
        U1(key, objectKey, data);
        i1.Companion companion = i1.INSTANCE;
        companion.getClass();
        boolean z4 = kind != i1.f16456c;
        s2 s2Var = null;
        if (this.inserting) {
            this.reader.d();
            int currentGroup = this.writer.getCurrentGroup();
            if (z4) {
                this.writer.y1(key, t.INSTANCE.a());
            } else if (data != null) {
                a4 a4Var = this.writer;
                if (obj == null) {
                    obj = t.INSTANCE.a();
                }
                a4Var.t1(key, obj, data);
            } else {
                a4 a4Var2 = this.writer;
                if (obj == null) {
                    obj = t.INSTANCE.a();
                }
                a4Var2.w1(key, obj);
            }
            s2 s2Var2 = this.pending;
            if (s2Var2 != null) {
                u1 u1Var = new u1(key, -1, (-2) - currentGroup, -1, 0);
                s2Var2.i(u1Var, this.nodeIndex - s2Var2.getStartIndex());
                s2Var2.h(u1Var);
            }
            X0(z4, null);
            return;
        }
        companion.getClass();
        boolean z5 = kind == i1.f16457d && this.reusing;
        if (this.pending == null) {
            int p4 = this.reader.p();
            if (!z5 && p4 == key && kotlin.jvm.internal.l0.g(objectKey, this.reader.r())) {
                P1(z4, data);
            } else {
                this.pending = new s2(this.reader.i(), this.nodeIndex);
            }
        }
        s2 s2Var3 = this.pending;
        if (s2Var3 != null) {
            u1 d5 = s2Var3.d(key, objectKey);
            if (z5 || d5 == null) {
                this.reader.d();
                this.inserting = true;
                this.providerCache = null;
                W0();
                this.writer.K();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z4) {
                    this.writer.y1(key, t.INSTANCE.a());
                } else if (data != null) {
                    a4 a4Var3 = this.writer;
                    if (obj == null) {
                        obj = t.INSTANCE.a();
                    }
                    a4Var3.t1(key, obj, data);
                } else {
                    a4 a4Var4 = this.writer;
                    if (obj == null) {
                        obj = t.INSTANCE.a();
                    }
                    a4Var4.w1(key, obj);
                }
                this.insertAnchor = this.writer.F(currentGroup2);
                u1 u1Var2 = new u1(key, -1, (-2) - currentGroup2, -1, 0);
                s2Var3.i(u1Var2, this.nodeIndex - s2Var3.getStartIndex());
                s2Var3.h(u1Var2);
                s2Var = new s2(new ArrayList(), z4 ? 0 : this.nodeIndex);
            } else {
                s2Var3.h(d5);
                int location = d5.getLocation();
                this.nodeIndex = s2Var3.g(d5) + s2Var3.getStartIndex();
                int m4 = s2Var3.m(d5);
                int groupIndex = m4 - s2Var3.getGroupIndex();
                s2Var3.k(m4, s2Var3.getGroupIndex());
                this.changeListWriter.x(location);
                this.reader.W(location);
                if (groupIndex > 0) {
                    this.changeListWriter.u(groupIndex);
                }
                P1(z4, data);
            }
        }
        X0(z4, s2Var);
    }

    private final t2 N0(int group) {
        t2 t2Var;
        if (this.inserting && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.n0(parent) == 202 && kotlin.jvm.internal.l0.g(this.writer.o0(parent), x.E())) {
                    Object l02 = this.writer.l0(parent);
                    kotlin.jvm.internal.l0.n(l02, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    t2 t2Var2 = (t2) l02;
                    this.providerCache = t2Var2;
                    return t2Var2;
                }
                parent = this.writer.R0(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.G(group) == 202 && kotlin.jvm.internal.l0.g(this.reader.I(group), x.E())) {
                    androidx.compose.runtime.collection.f<t2> fVar = this.providerUpdates;
                    if (fVar == null || (t2Var = fVar.c(group)) == null) {
                        Object C = this.reader.C(group);
                        kotlin.jvm.internal.l0.n(C, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        t2Var = (t2) C;
                    }
                    this.providerCache = t2Var;
                    return t2Var;
                }
                group = this.reader.U(group);
            }
        }
        t2 t2Var3 = this.parentProvider;
        this.providerCache = t2Var3;
        return t2Var3;
    }

    private final void N1(int key) {
        i1.INSTANCE.getClass();
        M1(key, null, i1.f16456c, null);
    }

    private final void O1(int key, Object dataKey) {
        i1.INSTANCE.getClass();
        M1(key, dataKey, i1.f16456c, null);
    }

    private final void P1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.b0();
            return;
        }
        if (data != null && this.reader.n() != data) {
            this.changeListWriter.W(data);
        }
        this.reader.a0();
    }

    private final void Q0(androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> invalidationsRequested, ld.p<? super t, ? super Integer, kotlin.k2> content) {
        Comparator comparator;
        if (this.isComposing) {
            throw u.a("Reentrant composition is not supported");
        }
        g5.f16432a.getClass();
        Trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = androidx.compose.runtime.snapshots.v.I().getId();
            this.providerUpdates = null;
            int size = invalidationsRequested.getSize();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = invalidationsRequested.getKeys()[i4];
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                androidx.compose.runtime.collection.d dVar = (androidx.compose.runtime.collection.d) invalidationsRequested.getValues()[i4];
                f3 f3Var = (f3) obj;
                androidx.compose.runtime.d anchor = f3Var.getAnchor();
                if (anchor == null) {
                    return;
                }
                this.invalidations.add(new r1(f3Var, anchor.getLocation(), dVar));
            }
            List<r1> list = this.invalidations;
            comparator = x.f17313s;
            kotlin.collections.w.p0(list, comparator);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                R1();
                Object q12 = q1();
                if (q12 != content && content != null) {
                    c2(content);
                }
                c cVar = this.derivedStateObserver;
                androidx.compose.runtime.collection.g<s0> b5 = p4.b();
                try {
                    b5.b(cVar);
                    if (content != null) {
                        O1(200, x.I());
                        androidx.compose.runtime.c.e(this, content);
                        S0(false);
                    } else if (!(this.forciblyRecompose || this.providersInvalid) || q12 == null || kotlin.jvm.internal.l0.g(q12, t.INSTANCE.a())) {
                        n();
                    } else {
                        O1(200, x.I());
                        androidx.compose.runtime.c.e(this, (ld.p) kotlin.jvm.internal.u1.q(q12, 2));
                        S0(false);
                    }
                    b5.n0(b5.getSize() - 1);
                    V0();
                    this.isComposing = false;
                    this.invalidations.clear();
                    L0();
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    b5.n0(b5.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.isComposing = false;
                this.invalidations.clear();
                t0();
                L0();
                throw th2;
            }
        } finally {
            g5.f16432a.getClass();
            Trace.endSection();
        }
    }

    private final void R0(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        R0(this.reader.U(group), nearestCommonRoot);
        if (this.reader.O(group)) {
            this.changeListWriter.v(this.reader.Q(group));
        }
    }

    private final void R1() {
        this.reader = this.slotTable.d0();
        N1(100);
        this.parentContext.t();
        this.parentProvider = this.parentContext.f();
        this.providersInvalidStack.j(x.d(this.providersInvalid));
        this.providersInvalid = q0(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceInformationEnabled) {
            this.sourceInformationEnabled = this.parentContext.getCollectingSourceInformation();
        }
        Set<androidx.compose.runtime.tooling.a> set = (Set) h0.d(this.parentProvider, androidx.compose.runtime.tooling.f.a());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.p(set);
        }
        N1(this.parentContext.getCompoundHashKey());
    }

    private final void S0(boolean isNode) {
        Set set;
        List<u1> list;
        if (this.inserting) {
            int parent = this.writer.getParent();
            W1(this.writer.n0(parent), this.writer.o0(parent), this.writer.l0(parent));
        } else {
            int parent2 = this.reader.getParent();
            W1(this.reader.G(parent2), this.reader.I(parent2), this.reader.C(parent2));
        }
        int i4 = this.groupNodeCount;
        s2 s2Var = this.pending;
        if (s2Var != null && s2Var.b().size() > 0) {
            List<u1> b5 = s2Var.b();
            List<u1> f4 = s2Var.f();
            Set n4 = androidx.compose.runtime.snapshots.d.n(f4);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f4.size();
            int size2 = b5.size();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < size2) {
                u1 u1Var = b5.get(i5);
                if (n4.contains(u1Var)) {
                    set = n4;
                    if (!linkedHashSet.contains(u1Var)) {
                        if (i6 < size) {
                            u1 u1Var2 = f4.get(i6);
                            if (u1Var2 != u1Var) {
                                int g4 = s2Var.g(u1Var2);
                                linkedHashSet.add(u1Var2);
                                if (g4 != i7) {
                                    int o4 = s2Var.o(u1Var2);
                                    list = f4;
                                    this.changeListWriter.w(s2Var.getStartIndex() + g4, i7 + s2Var.getStartIndex(), o4);
                                    s2Var.j(g4, i7, o4);
                                } else {
                                    list = f4;
                                }
                            } else {
                                list = f4;
                                i5++;
                            }
                            i6++;
                            i7 += s2Var.o(u1Var2);
                            n4 = set;
                            f4 = list;
                        } else {
                            n4 = set;
                        }
                    }
                } else {
                    this.changeListWriter.P(s2Var.g(u1Var) + s2Var.getStartIndex(), u1Var.getNodes());
                    s2Var.n(u1Var.getLocation(), 0);
                    this.changeListWriter.x(u1Var.getLocation());
                    this.reader.W(u1Var.getLocation());
                    A1();
                    this.reader.Y();
                    set = n4;
                    x.k0(this.invalidations, u1Var.getLocation(), this.reader.J(u1Var.getLocation()) + u1Var.getLocation());
                }
                i5++;
                n4 = set;
            }
            this.changeListWriter.h();
            if (b5.size() > 0) {
                this.changeListWriter.x(this.reader.o());
                this.reader.Z();
            }
        }
        int i10 = this.nodeIndex;
        while (!this.reader.M()) {
            int currentGroup = this.reader.getCurrentGroup();
            A1();
            this.changeListWriter.P(i10, this.reader.Y());
            x.k0(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean z4 = this.inserting;
        if (z4) {
            if (isNode) {
                this.insertFixups.e();
                i4 = 1;
            }
            this.reader.g();
            int parent3 = this.writer.getParent();
            this.writer.W();
            if (!this.reader.v()) {
                int i11 = (-2) - parent3;
                this.writer.X();
                this.writer.N();
                B1(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    Y1(i11, 0);
                    Z1(i11, i4);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.z();
            }
            this.changeListWriter.f();
            int parent4 = this.reader.getParent();
            if (i4 != d2(parent4)) {
                Z1(parent4, i4);
            }
            if (isNode) {
                i4 = 1;
            }
            this.reader.h();
            this.changeListWriter.h();
        }
        Y0(i4, z4);
    }

    private final void T0() {
        S0(false);
    }

    private final void U1(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                V1(((Enum) dataKey).ordinal());
                return;
            } else {
                V1(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || kotlin.jvm.internal.l0.g(data, t.INSTANCE.a())) {
            V1(groupKey);
        } else {
            V1(data.hashCode());
        }
    }

    private final void V0() {
        S0(false);
        this.parentContext.c();
        S0(false);
        this.changeListWriter.j();
        Z0();
        this.reader.e();
        this.forciblyRecompose = false;
    }

    private final void V1(int keyHash) {
        this.compoundKeyHash = keyHash ^ Integer.rotateLeft(this.compoundKeyHash, 3);
    }

    private final void W0() {
        if (this.writer.getClosed()) {
            a4 e02 = this.insertTable.e0();
            this.writer = e02;
            e02.n1();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void W1(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                X1(((Enum) dataKey).ordinal());
                return;
            } else {
                X1(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || kotlin.jvm.internal.l0.g(data, t.INSTANCE.a())) {
            X1(groupKey);
        } else {
            X1(data.hashCode());
        }
    }

    private final void X0(boolean isNode, s2 newPending) {
        this.pendingStack.h(this.pending);
        this.pending = newPending;
        this.nodeIndexStack.j(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.j(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void X1(int groupKey) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(groupKey) ^ this.compoundKeyHash, 3);
    }

    private final void Y0(int expectedNodeCount, boolean inserting) {
        s2 g4 = this.pendingStack.g();
        if (g4 != null && !inserting) {
            g4.l(g4.getGroupIndex() + 1);
        }
        this.pending = g4;
        this.nodeIndex = this.nodeIndexStack.i() + expectedNodeCount;
        this.groupNodeCount = this.groupNodeCountStack.i() + expectedNodeCount;
    }

    private final void Y1(int group, int count) {
        if (d2(group) != count) {
            if (group < 0) {
                androidx.collection.t1 t1Var = this.nodeCountVirtualOverrides;
                if (t1Var == null) {
                    t1Var = new androidx.collection.t1(0, 1, null);
                    this.nodeCountVirtualOverrides = t1Var;
                }
                t1Var.k0(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                kotlin.collections.l.T1(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void Z0() {
        this.changeListWriter.m();
        if (!this.pendingStack.c()) {
            throw u.a("Start/end imbalance");
        }
        H0();
    }

    private final void Z1(int group, int newCount) {
        int d22 = d2(group);
        if (d22 != newCount) {
            int i4 = newCount - d22;
            int b5 = this.pendingStack.b() - 1;
            while (group != -1) {
                int d23 = d2(group) + i4;
                Y1(group, d23);
                int i5 = b5;
                while (true) {
                    if (-1 < i5) {
                        s2 f4 = this.pendingStack.f(i5);
                        if (f4 != null && f4.n(group, d23)) {
                            b5 = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.O(group)) {
                    return;
                } else {
                    group = this.reader.U(group);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.t2, java.lang.Object] */
    private final t2 a2(t2 parentScope, t2 currentProviders) {
        h.a<d0<Object>, b5<? extends Object>> g4 = parentScope.g();
        g4.putAll(currentProviders);
        ?? a22 = g4.a2();
        O1(204, x.Q());
        b2(a22);
        b2(currentProviders);
        S0(false);
        return a22;
    }

    private final void b2(Object value) {
        q1();
        c2(value);
    }

    private final int d2(int group) {
        int i4;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i4 = iArr[group]) < 0) ? this.reader.S(group) : i4;
        }
        androidx.collection.t1 t1Var = this.nodeCountVirtualOverrides;
        if (t1Var == null || !t1Var.d(group)) {
            return 0;
        }
        return t1Var.n(group);
    }

    @q
    public static /* synthetic */ void e0() {
    }

    private final void e2() {
        if (!this.nodeExpected) {
            throw u.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void f2() {
        if (this.nodeExpected) {
            throw u.a("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    @q
    public static /* synthetic */ void h() {
    }

    private final <R> R h2(w3 reader, ld.a<? extends R> block) {
        w3 w3Var = this.reader;
        int[] iArr = this.nodeCountOverrides;
        androidx.compose.runtime.collection.f<t2> fVar = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            this.reader = reader;
            return block.invoke();
        } finally {
            this.reader = w3Var;
            this.nodeCountOverrides = iArr;
            this.providerUpdates = fVar;
        }
    }

    private final Object i1(w3 w3Var) {
        return w3Var.Q(w3Var.getParent());
    }

    @q
    public static /* synthetic */ void k0() {
    }

    private final int k1(w3 w3Var, int i4) {
        Object C;
        if (w3Var.L(i4)) {
            Object I = w3Var.I(i4);
            if (I != null) {
                return I instanceof Enum ? ((Enum) I).ordinal() : I instanceof c2 ? d2.f16148a : I.hashCode();
            }
            return 0;
        }
        int G = w3Var.G(i4);
        if (G == 207 && (C = w3Var.C(i4)) != null && !kotlin.jvm.internal.l0.g(C, t.INSTANCE.a())) {
            G = C.hashCode();
        }
        return G;
    }

    private final void l1(List<kotlin.q0<f2, f2>> references) {
        androidx.compose.runtime.changelist.e eVar;
        androidx.compose.runtime.changelist.d dVar;
        androidx.compose.runtime.changelist.e eVar2;
        androidx.compose.runtime.changelist.d dVar2;
        x3 slotTable;
        androidx.compose.runtime.d anchor;
        List<? extends Object> v4;
        w3 w3Var;
        androidx.compose.runtime.collection.f<t2> fVar;
        int[] iArr;
        androidx.compose.runtime.changelist.d dVar3;
        androidx.compose.runtime.changelist.e eVar3;
        androidx.compose.runtime.changelist.d changeList;
        androidx.compose.runtime.changelist.d dVar4;
        androidx.compose.runtime.changelist.e eVar4;
        androidx.compose.runtime.changelist.e eVar5;
        int i4;
        int i5;
        x3 slotTable2;
        w3 w3Var2;
        androidx.compose.runtime.changelist.d dVar5;
        androidx.compose.runtime.changelist.e eVar6 = this.changeListWriter;
        androidx.compose.runtime.changelist.d dVar6 = this.lateChanges;
        androidx.compose.runtime.changelist.d changeList2 = eVar6.getChangeList();
        try {
            eVar6.S(dVar6);
            this.changeListWriter.Q();
            int size = references.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                try {
                    kotlin.q0<f2, f2> q0Var = references.get(i7);
                    f2 a5 = q0Var.a();
                    f2 b5 = q0Var.b();
                    androidx.compose.runtime.d anchor2 = a5.getAnchor();
                    int i10 = a5.getSlotTable().i(anchor2);
                    androidx.compose.runtime.internal.n nVar = new androidx.compose.runtime.internal.n(i6, 1, null);
                    this.changeListWriter.d(nVar, anchor2);
                    if (b5 == null) {
                        if (kotlin.jvm.internal.l0.g(a5.getSlotTable(), this.insertTable)) {
                            L0();
                        }
                        w3 d02 = a5.getSlotTable().d0();
                        try {
                            d02.W(i10);
                            this.changeListWriter.y(i10);
                            dVar5 = new androidx.compose.runtime.changelist.d();
                            w3Var2 = d02;
                        } catch (Throwable th) {
                            th = th;
                            w3Var2 = d02;
                        }
                        try {
                            y1(this, null, null, null, null, new d(dVar5, d02, a5), 15, null);
                            this.changeListWriter.q(dVar5, nVar);
                            kotlin.k2 k2Var = kotlin.k2.f75408a;
                            w3Var2.e();
                            i4 = size;
                            eVar2 = eVar6;
                            dVar2 = changeList2;
                            i5 = i7;
                        } catch (Throwable th2) {
                            th = th2;
                            w3Var2.e();
                            throw th;
                        }
                    } else {
                        e2 o4 = this.parentContext.o(b5);
                        if (o4 == null || (slotTable = o4.getSlotTable()) == null) {
                            slotTable = b5.getSlotTable();
                        }
                        if (o4 == null || (slotTable2 = o4.getSlotTable()) == null || (anchor = slotTable2.h(0)) == null) {
                            anchor = b5.getAnchor();
                        }
                        v4 = x.v(slotTable, anchor);
                        if (!v4.isEmpty()) {
                            this.changeListWriter.a(v4, nVar);
                            if (kotlin.jvm.internal.l0.g(a5.getSlotTable(), this.slotTable)) {
                                int i11 = this.slotTable.i(anchor2);
                                Y1(i11, d2(i11) + v4.size());
                            }
                        }
                        this.changeListWriter.b(o4, this.parentContext, b5, a5);
                        w3 d03 = slotTable.d0();
                        try {
                            w3 w3Var3 = this.reader;
                            int[] iArr2 = this.nodeCountOverrides;
                            androidx.compose.runtime.collection.f<t2> fVar2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = d03;
                                int i12 = slotTable.i(anchor);
                                d03.W(i12);
                                this.changeListWriter.y(i12);
                                dVar3 = new androidx.compose.runtime.changelist.d();
                                eVar3 = this.changeListWriter;
                                changeList = eVar3.getChangeList();
                                try {
                                    eVar3.S(dVar3);
                                    eVar5 = this.changeListWriter;
                                    eVar2 = eVar6;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fVar = fVar2;
                                    iArr = iArr2;
                                    w3Var = d03;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fVar = fVar2;
                                iArr = iArr2;
                                w3Var = d03;
                            }
                            try {
                                boolean implicitRootStart = eVar5.getImplicitRootStart();
                                i4 = size;
                                try {
                                    eVar5.T(false);
                                    n0 composition = b5.getComposition();
                                    n0 composition2 = a5.getComposition();
                                    Integer valueOf = Integer.valueOf(d03.getCurrentGroup());
                                    dVar2 = changeList2;
                                    dVar4 = changeList;
                                    i5 = i7;
                                    w3Var = d03;
                                    eVar4 = eVar3;
                                    iArr = iArr2;
                                    try {
                                        x1(composition, composition2, valueOf, b5.d(), new e(a5));
                                        try {
                                            eVar5.T(implicitRootStart);
                                            try {
                                                eVar4.S(dVar4);
                                                this.changeListWriter.q(dVar3, nVar);
                                                kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                                                try {
                                                    this.reader = w3Var3;
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = fVar2;
                                                    try {
                                                        w3Var.e();
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        eVar = eVar2;
                                                        dVar = dVar2;
                                                        eVar.S(dVar);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    w3Var.e();
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                fVar = fVar2;
                                                this.reader = w3Var3;
                                                this.nodeCountOverrides = iArr;
                                                this.providerUpdates = fVar;
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            fVar = fVar2;
                                            try {
                                                eVar4.S(dVar4);
                                                throw th;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                this.reader = w3Var3;
                                                this.nodeCountOverrides = iArr;
                                                this.providerUpdates = fVar;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        fVar = fVar2;
                                        try {
                                            eVar5.T(implicitRootStart);
                                            throw th;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            eVar4.S(dVar4);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    fVar = fVar2;
                                    iArr = iArr2;
                                    w3Var = d03;
                                    dVar4 = changeList;
                                    eVar4 = eVar3;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                fVar = fVar2;
                                iArr = iArr2;
                                w3Var = d03;
                                dVar4 = changeList;
                                eVar4 = eVar3;
                                eVar4.S(dVar4);
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            w3Var = d03;
                        }
                    }
                    this.changeListWriter.V();
                    i7 = i5 + 1;
                    eVar6 = eVar2;
                    size = i4;
                    changeList2 = dVar2;
                    i6 = 0;
                } catch (Throwable th15) {
                    th = th15;
                    eVar2 = eVar6;
                    dVar2 = changeList2;
                }
            }
            androidx.compose.runtime.changelist.e eVar7 = eVar6;
            androidx.compose.runtime.changelist.d dVar7 = changeList2;
            this.changeListWriter.g();
            this.changeListWriter.y(0);
            eVar7.S(dVar7);
        } catch (Throwable th16) {
            th = th16;
            eVar = eVar6;
            dVar = changeList2;
        }
    }

    private final int m1(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(c2<Object> content, t2 locals, Object parameter, boolean force) {
        U(d2.f16148a, content);
        b2(parameter);
        int i4 = this.compoundKeyHash;
        try {
            this.compoundKeyHash = d2.f16148a;
            if (this.inserting) {
                a4.E0(this.writer, 0, 1, null);
            }
            boolean z4 = (this.inserting || kotlin.jvm.internal.l0.g(this.reader.n(), locals)) ? false : true;
            if (z4) {
                C1(locals);
            }
            Object E = x.E();
            i1.INSTANCE.getClass();
            M1(202, E, i1.f16456c, locals);
            this.providerCache = null;
            if (!this.inserting || force) {
                boolean z5 = this.providersInvalid;
                this.providersInvalid = z4;
                androidx.compose.runtime.c.e(this, new androidx.compose.runtime.internal.b(316014703, true, new f(content, parameter)));
                this.providersInvalid = z5;
            } else {
                this.writerHasAProvider = true;
                a4 a4Var = this.writer;
                this.parentContext.k(new f2(content, parameter, this.composition, this.insertTable, a4Var.F(a4Var.R0(a4Var.getParent())), kotlin.collections.j0.f74919b, M0()));
            }
            S0(false);
            this.providerCache = null;
            this.compoundKeyHash = i4;
            S0(false);
        } catch (Throwable th) {
            S0(false);
            this.providerCache = null;
            this.compoundKeyHash = i4;
            S0(false);
            throw th;
        }
    }

    private final Object s1(w3 w3Var, int i4) {
        return w3Var.Q(i4);
    }

    private final void t0() {
        H0();
        this.pendingStack.a();
        this.nodeIndexStack.a();
        this.groupNodeCountStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates = null;
        if (!this.reader.getClosed()) {
            this.reader.e();
        }
        if (!this.writer.getClosed()) {
            this.writer.N();
        }
        this.insertFixups.c();
        L0();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
    }

    private final int t1(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int U = this.reader.U(group);
        while (U != recomposeGroup && !this.reader.O(U)) {
            U = this.reader.U(U);
        }
        if (this.reader.O(U)) {
            recomposeIndex = 0;
        }
        if (U == group) {
            return recomposeIndex;
        }
        int d22 = (d2(U) - this.reader.S(group)) + recomposeIndex;
        loop1: while (recomposeIndex < d22 && U != groupLocation) {
            U++;
            while (U < groupLocation) {
                int J = this.reader.J(U) + U;
                if (groupLocation >= J) {
                    recomposeIndex += d2(U);
                    U = J;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final <R> R x1(n0 from, n0 to, Integer index, List<kotlin.q0<f3, androidx.compose.runtime.collection.d<Object>>> invalidations, ld.a<? extends R> block) {
        R r4;
        boolean z4 = this.isComposing;
        int i4 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i5 = 0; i5 < size; i5++) {
                kotlin.q0<f3, androidx.compose.runtime.collection.d<Object>> q0Var = invalidations.get(i5);
                f3 a5 = q0Var.a();
                androidx.compose.runtime.collection.d<Object> b5 = q0Var.b();
                if (b5 != null) {
                    Object[] values = b5.getValues();
                    int size2 = b5.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        Object obj = values[i6];
                        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        S1(a5, obj);
                    }
                } else {
                    S1(a5, null);
                }
            }
            if (from != null) {
                r4 = (R) from.A(to, index != null ? index.intValue() : -1, block);
                if (r4 == null) {
                }
                this.isComposing = z4;
                this.nodeIndex = i4;
                return r4;
            }
            r4 = block.invoke();
            this.isComposing = z4;
            this.nodeIndex = i4;
            return r4;
        } catch (Throwable th) {
            this.isComposing = z4;
            this.nodeIndex = i4;
            throw th;
        }
    }

    static Object y1(v vVar, n0 n0Var, n0 n0Var2, Integer num, List list, ld.a aVar, int i4, Object obj) {
        n0 n0Var3 = (i4 & 1) != 0 ? null : n0Var;
        n0 n0Var4 = (i4 & 2) != 0 ? null : n0Var2;
        Integer num2 = (i4 & 4) != 0 ? null : num;
        if ((i4 & 8) != 0) {
            list = kotlin.collections.j0.f74919b;
        }
        return vVar.x1(n0Var3, n0Var4, num2, list, aVar);
    }

    private final void z1() {
        r1 D;
        boolean z4 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int J = this.reader.J(parent) + parent;
        int i4 = this.nodeIndex;
        int i5 = this.compoundKeyHash;
        int i6 = this.groupNodeCount;
        D = x.D(this.invalidations, this.reader.getCurrentGroup(), J);
        boolean z5 = false;
        int i7 = parent;
        while (D != null) {
            int location = D.getLocation();
            x.j0(this.invalidations, location);
            if (D.d()) {
                this.reader.W(location);
                int currentGroup = this.reader.getCurrentGroup();
                D1(i7, currentGroup, parent);
                this.nodeIndex = t1(location, currentGroup, parent, i4);
                this.compoundKeyHash = K0(this.reader.U(currentGroup), parent, i5);
                this.providerCache = null;
                D.getScope().j(this);
                this.providerCache = null;
                this.reader.X(parent);
                i7 = currentGroup;
                z5 = true;
            } else {
                this.invalidateStack.h(D.getScope());
                D.getScope().C();
                this.invalidateStack.g();
            }
            D = x.D(this.invalidations, this.reader.getCurrentGroup(), J);
        }
        if (z5) {
            D1(i7, parent, parent);
            this.reader.Z();
            int d22 = d2(parent);
            this.nodeIndex = i4 + d22;
            this.groupNodeCount = i6 + d22;
        } else {
            L1();
        }
        this.compoundKeyHash = i5;
        this.isComposing = z4;
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    @fg.p
    public kotlin.coroutines.g A() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    public g0 B() {
        return M0();
    }

    @Override // androidx.compose.runtime.t
    public void C() {
        e2();
        if (this.inserting) {
            throw u.a("useNode() called while inserting");
        }
        Object i12 = i1(this.reader);
        this.changeListWriter.v(i12);
        if (this.reusing && (i12 instanceof r)) {
            this.changeListWriter.Z(i12);
        }
    }

    @Override // androidx.compose.runtime.t
    public void E(@fg.m Object value) {
        T1(value);
    }

    @Override // androidx.compose.runtime.t
    public <T> void F(@fg.l ld.a<? extends T> factory) {
        e2();
        if (!this.inserting) {
            throw u.a("createNode() can only be called when inserting");
        }
        int f4 = this.nodeIndexStack.f();
        a4 a4Var = this.writer;
        androidx.compose.runtime.d F = a4Var.F(a4Var.getParent());
        this.groupNodeCount++;
        this.insertFixups.d(factory, f4, F);
    }

    @q
    public final <T> T F0(boolean invalid, @fg.l ld.a<? extends T> block) {
        T t4 = (T) r1();
        if (t4 != t.INSTANCE.a() && !invalid) {
            return t4;
        }
        T invoke = block.invoke();
        T1(invoke);
        return invoke;
    }

    @Override // androidx.compose.runtime.t
    @p1
    public void G() {
        boolean s4;
        S0(false);
        S0(false);
        s4 = x.s(this.providersInvalidStack.i());
        this.providersInvalid = s4;
        this.providerCache = null;
    }

    public final void G0() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.t
    public void H() {
        S0(true);
    }

    public final void H1(@fg.m androidx.compose.runtime.changelist.d dVar) {
        this.deferredChanges = dVar;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void I() {
        S0(false);
        f3 d12 = d1();
        if (d12 == null || !d12.u()) {
            return;
        }
        d12.F(true);
    }

    public final void I1(@fg.l x3 x3Var) {
        this.insertTable = x3Var;
    }

    public final void J0(@fg.l androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> invalidationsRequested, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> content) {
        if (!this.changes.f()) {
            throw u.a("Expected applyChanges() to have been called");
        }
        Q0(invalidationsRequested, content);
    }

    public final void J1(@fg.l w3 w3Var) {
        this.reader = w3Var;
    }

    @Override // androidx.compose.runtime.t
    @p1
    public void K(@fg.l c2<?> value, @fg.m Object parameter) {
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        n1(value, M0(), parameter, false);
    }

    @Override // androidx.compose.runtime.t
    public void L() {
        this.sourceInformationEnabled = false;
    }

    @Override // androidx.compose.runtime.t
    public void M() {
        this.forceRecomposeScopes = true;
        this.sourceInformationEnabled = true;
    }

    @Override // androidx.compose.runtime.t
    @fg.m
    public e3 N() {
        return d1();
    }

    @Override // androidx.compose.runtime.t
    public void O() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        S0(false);
    }

    public final void O0() {
        this.invalidateStack.a();
        this.invalidations.clear();
        this.changes.c();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void P(int key) {
        i1.INSTANCE.getClass();
        M1(key, null, i1.f16456c, null);
    }

    public final void P0() {
        g5 g5Var = g5.f16432a;
        g5Var.getClass();
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.u(this);
            O0();
            this.applier.clear();
            this.isDisposed = true;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            g5Var.getClass();
            Trace.endSection();
        } catch (Throwable th) {
            g5.f16432a.getClass();
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.t
    @fg.m
    public Object Q() {
        return r1();
    }

    public final void Q1() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    public androidx.compose.runtime.tooling.a R() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean S(@fg.m Object value) {
        if (q1() == value) {
            return false;
        }
        c2(value);
        return true;
    }

    public final boolean S1(@fg.l f3 scope, @fg.m Object instance) {
        androidx.compose.runtime.d anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int i4 = this.reader.getTable().i(anchor);
        if (!this.isComposing || i4 < this.reader.getCurrentGroup()) {
            return false;
        }
        x.a0(this.invalidations, i4, scope, instance);
        return true;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void T() {
        i1.INSTANCE.getClass();
        M1(-127, null, i1.f16456c, null);
    }

    @kotlin.w0
    public final void T1(@fg.m Object value) {
        if (value instanceof p3) {
            if (this.inserting) {
                this.changeListWriter.N((p3) value);
            }
            this.abandonSet.add(value);
            value = new q3((p3) value);
        }
        c2(value);
    }

    @Override // androidx.compose.runtime.t
    @q
    public void U(int key, @fg.m Object dataKey) {
        i1.INSTANCE.getClass();
        M1(key, dataKey, i1.f16456c, null);
    }

    public final void U0() {
        if (this.isComposing || this.reusingGroup != 100) {
            throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.t
    public void W() {
        i1.INSTANCE.getClass();
        M1(125, null, i1.f16458e, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.t
    public void X() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.t
    @p1
    public void Y(@fg.l b3<?> value) {
        b5<? extends Object> b5Var;
        t2 u02;
        t2 M0 = M0();
        O1(201, x.N());
        Object r12 = r1();
        if (kotlin.jvm.internal.l0.g(r12, t.INSTANCE.a())) {
            b5Var = null;
        } else {
            kotlin.jvm.internal.l0.n(r12, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            b5Var = (b5) r12;
        }
        d0<?> b5 = value.b();
        kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        b5<?> d5 = b5.d(value.c(), b5Var);
        boolean g4 = kotlin.jvm.internal.l0.g(d5, b5Var);
        if (!g4) {
            T1(d5);
        }
        boolean z4 = true;
        boolean z5 = false;
        if (this.inserting) {
            u02 = M0.u0(b5, d5);
            this.writerHasAProvider = true;
        } else {
            w3 w3Var = this.reader;
            Object C = w3Var.C(w3Var.getCurrentGroup());
            kotlin.jvm.internal.l0.n(C, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            t2 t2Var = (t2) C;
            u02 = (!(p() && g4) && (value.getCanOverride() || !h0.a(M0, b5))) ? M0.u0(b5, d5) : t2Var;
            if (!this.reusing && t2Var == u02) {
                z4 = false;
            }
            z5 = z4;
        }
        if (z5 && !this.inserting) {
            C1(u02);
        }
        this.providersInvalidStack.j(this.providersInvalid ? 1 : 0);
        this.providersInvalid = z5;
        this.providerCache = u02;
        Object E = x.E();
        i1.INSTANCE.getClass();
        M1(202, E, i1.f16456c, u02);
    }

    @Override // androidx.compose.runtime.t
    public void Z(int key, @fg.m Object dataKey) {
        if (!this.inserting && this.reader.p() == key && !kotlin.jvm.internal.l0.g(this.reader.n(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        i1.INSTANCE.getClass();
        M1(key, null, i1.f16456c, dataKey);
    }

    @Override // androidx.compose.runtime.t
    public int a() {
        return this.inserting ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.t
    @fg.m
    public Object a0() {
        f3 d12 = d1();
        if (d12 != null) {
            return d12.getAnchor();
        }
        return null;
    }

    public final boolean a1() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean b(boolean value) {
        Object q12 = q1();
        if ((q12 instanceof Boolean) && value == ((Boolean) q12).booleanValue()) {
            return false;
        }
        c2(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void b0(@fg.l String sourceInformation) {
        if (this.inserting && this.sourceInformationEnabled) {
            this.writer.X0(sourceInformation);
        }
    }

    public final boolean b1() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean c(short value) {
        Object q12 = q1();
        if ((q12 instanceof Short) && value == ((Number) q12).shortValue()) {
            return false;
        }
        c2(Short.valueOf(value));
        return true;
    }

    public final int c1() {
        return this.changes.e();
    }

    @kotlin.w0
    public final void c2(@fg.m Object value) {
        if (this.inserting) {
            this.writer.B1(value);
        } else {
            this.changeListWriter.Y(value, this.reader.u() - 1);
        }
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean d(float value) {
        Object q12 = q1();
        if ((q12 instanceof Float) && value == ((Number) q12).floatValue()) {
            return false;
        }
        c2(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void d0() {
        if (!(this.groupNodeCount == 0)) {
            throw u.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        f3 d12 = d1();
        if (d12 != null) {
            d12.D();
        }
        if (this.invalidations.isEmpty()) {
            L1();
        } else {
            z1();
        }
    }

    @fg.m
    public final f3 d1() {
        a5<f3> a5Var = this.invalidateStack;
        if (this.childrenComposing == 0 && a5Var.d()) {
            return a5Var.e();
        }
        return null;
    }

    @Override // androidx.compose.runtime.t
    public void e() {
        this.reusing = this.reusingGroup >= 0;
    }

    @fg.m
    /* renamed from: e1, reason: from getter */
    public final androidx.compose.runtime.changelist.d getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean f(int value) {
        Object q12 = q1();
        if ((q12 instanceof Integer) && value == ((Number) q12).intValue()) {
            return false;
        }
        c2(Integer.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void f0(int key, @fg.l String sourceInformation) {
        if (this.inserting && this.sourceInformationEnabled) {
            this.writer.Z0(key, sourceInformation);
        }
    }

    public final boolean f1() {
        return !this.invalidations.isEmpty();
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean g(long value) {
        Object q12 = q1();
        if ((q12 instanceof Long) && value == ((Number) q12).longValue()) {
            return false;
        }
        c2(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    /* renamed from: g0, reason: from getter */
    public n0 getComposition() {
        return this.composition;
    }

    public final boolean g1() {
        return this.changes.g();
    }

    public final void g2() {
        this.insertTable.r0();
    }

    @Override // androidx.compose.runtime.t
    @p1
    public void h0() {
        boolean s4;
        S0(false);
        S0(false);
        s4 = x.s(this.providersInvalidStack.i());
        this.providersInvalid = s4;
        this.providerCache = null;
    }

    @fg.l
    /* renamed from: h1, reason: from getter */
    public final x3 getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean i(byte value) {
        Object q12 = q1();
        if ((q12 instanceof Byte) && value == ((Number) q12).byteValue()) {
            return false;
        }
        c2(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    public boolean i0() {
        if (!p() || this.providersInvalid) {
            return true;
        }
        f3 d12 = d1();
        return d12 != null && d12.o();
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean j(char value) {
        Object q12 = q1();
        if ((q12 instanceof Character) && value == ((Character) q12).charValue()) {
            return false;
        }
        c2(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    public void j0(@fg.l e3 scope) {
        f3 f3Var = scope instanceof f3 ? (f3) scope : null;
        if (f3Var == null) {
            return;
        }
        f3Var.L(true);
    }

    @fg.l
    /* renamed from: j1, reason: from getter */
    public final w3 getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean k(double value) {
        Object q12 = q1();
        if ((q12 instanceof Double) && value == ((Number) q12).doubleValue()) {
            return false;
        }
        c2(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.t
    /* renamed from: l, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.t
    /* renamed from: l0, reason: from getter */
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void m(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            throw u.a("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.inserting) {
            return;
        }
        if (!changed) {
            L1();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.c();
        x.k0(this.invalidations, currentGroup, currentEnd);
        this.reader.Z();
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    public z m0() {
        O1(206, x.W());
        if (this.inserting) {
            a4.E0(this.writer, 0, 1, null);
        }
        Object q12 = q1();
        a aVar = q12 instanceof a ? (a) q12 : null;
        if (aVar == null) {
            int i4 = this.compoundKeyHash;
            boolean z4 = this.forceRecomposeScopes;
            boolean z5 = this.sourceInformationEnabled;
            n0 n0Var = this.composition;
            b0 b0Var = n0Var instanceof b0 ? (b0) n0Var : null;
            aVar = new a(new b(i4, z4, z5, b0Var != null ? b0Var.getObserverHolder() : null));
            c2(aVar);
        }
        aVar.getRef().D(M0());
        S0(false);
        return aVar.getRef();
    }

    @Override // androidx.compose.runtime.t
    @q
    public void n() {
        if (this.invalidations.isEmpty()) {
            K1();
            return;
        }
        w3 w3Var = this.reader;
        int p4 = w3Var.p();
        Object r4 = w3Var.r();
        Object n4 = w3Var.n();
        U1(p4, r4, n4);
        P1(w3Var.N(), null);
        z1();
        w3Var.h();
        W1(p4, r4, n4);
    }

    @Override // androidx.compose.runtime.t
    @q
    public void n0() {
        if (this.inserting && this.sourceInformationEnabled) {
            this.writer.Y0();
        }
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    @q
    public t o(int key) {
        i1.INSTANCE.getClass();
        M1(key, null, i1.f16456c, null);
        E0();
        return this;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void o0() {
        S0(false);
    }

    /* renamed from: o1, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    @Override // androidx.compose.runtime.t
    public boolean p() {
        f3 d12;
        return (this.inserting || this.reusing || this.providersInvalid || (d12 = d1()) == null || d12.r() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.t
    @q
    public void p0() {
        S0(false);
    }

    /* renamed from: p1, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.t
    @p1
    public void q(@fg.l List<kotlin.q0<f2, f2>> references) {
        try {
            l1(references);
            H0();
        } catch (Throwable th) {
            t0();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.t
    @q
    public boolean q0(@fg.m Object value) {
        if (kotlin.jvm.internal.l0.g(q1(), value)) {
            return false;
        }
        c2(value);
        return true;
    }

    @fg.m
    @kotlin.w0
    public final Object q1() {
        if (this.inserting) {
            f2();
            return t.INSTANCE.a();
        }
        Object P = this.reader.P();
        return (!this.reusing || (P instanceof s3)) ? P : t.INSTANCE.a();
    }

    @Override // androidx.compose.runtime.t
    public void r(@fg.l ld.a<kotlin.k2> effect) {
        this.changeListWriter.U(effect);
    }

    @fg.m
    @kotlin.w0
    public final Object r1() {
        if (this.inserting) {
            f2();
            return t.INSTANCE.a();
        }
        Object P = this.reader.P();
        return (!this.reusing || (P instanceof s3)) ? P instanceof q3 ? ((q3) P).getWrapped() : P : t.INSTANCE.a();
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    public androidx.compose.runtime.e<?> s() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.t
    @p1
    public void s0(@fg.l b3<?>[] values) {
        t2 a22;
        t2 M0 = M0();
        O1(201, x.N());
        boolean z4 = true;
        boolean z5 = false;
        if (this.inserting) {
            a22 = a2(M0, h0.f(values, M0, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object E = this.reader.E(0);
            kotlin.jvm.internal.l0.n(E, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            t2 t2Var = (t2) E;
            Object E2 = this.reader.E(1);
            kotlin.jvm.internal.l0.n(E2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            t2 t2Var2 = (t2) E2;
            t2 e4 = h0.e(values, M0, t2Var2);
            if (p() && !this.reusing && kotlin.jvm.internal.l0.g(t2Var2, e4)) {
                K1();
                a22 = t2Var;
            } else {
                a22 = a2(M0, e4);
                if (!this.reusing && kotlin.jvm.internal.l0.g(a22, t2Var)) {
                    z4 = false;
                }
                z5 = z4;
            }
        }
        if (z5 && !this.inserting) {
            C1(a22);
        }
        this.providersInvalidStack.j(this.providersInvalid ? 1 : 0);
        this.providersInvalid = z5;
        this.providerCache = a22;
        Object E3 = x.E();
        i1.INSTANCE.getClass();
        M1(202, E3, i1.f16456c, a22);
    }

    @Override // androidx.compose.runtime.t
    @fg.m
    @q
    public t3 t() {
        androidx.compose.runtime.d a5;
        ld.l<y, kotlin.k2> k4;
        f3 f3Var = null;
        f3 g4 = this.invalidateStack.d() ? this.invalidateStack.g() : null;
        if (g4 != null) {
            g4.I(false);
        }
        if (g4 != null && (k4 = g4.k(this.compositionToken)) != null) {
            this.changeListWriter.e(k4, this.composition);
        }
        if (g4 != null && !g4.t() && (g4.u() || this.forceRecomposeScopes)) {
            if (g4.getAnchor() == null) {
                if (this.inserting) {
                    a4 a4Var = this.writer;
                    a5 = a4Var.F(a4Var.getParent());
                } else {
                    w3 w3Var = this.reader;
                    a5 = w3Var.a(w3Var.getParent());
                }
                g4.E(a5);
            }
            g4.G(false);
            f3Var = g4;
        }
        S0(false);
        return f3Var;
    }

    @Override // androidx.compose.runtime.t
    @fg.l
    @q
    public Object u(@fg.m Object left, @fg.m Object right) {
        Object M;
        M = x.M(this.reader.r(), left, right);
        return M == null ? new t1(left, right) : M;
    }

    @fg.p
    public final int u1() {
        if (this.inserting) {
            a4 a4Var = this.writer;
            return a4Var.n0(a4Var.getParent());
        }
        w3 w3Var = this.reader;
        return w3Var.G(w3Var.getParent());
    }

    @Override // androidx.compose.runtime.t
    public void v() {
        i1.INSTANCE.getClass();
        M1(125, null, i1.f16457d, null);
        this.nodeExpected = true;
    }

    public final void v1(@fg.l ld.a<kotlin.k2> block) {
        if (this.isComposing) {
            throw u.a("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // androidx.compose.runtime.t
    public <V, T> void w(V value, @fg.l ld.p<? super T, ? super V, kotlin.k2> block) {
        if (this.inserting) {
            this.insertFixups.j(value, block);
        } else {
            this.changeListWriter.X(value, block);
        }
    }

    public final boolean w1(@fg.l androidx.compose.runtime.collection.c<f3, androidx.compose.runtime.collection.d<Object>> invalidationsRequested) {
        if (!this.changes.f()) {
            throw u.a("Expected applyChanges() to have been called");
        }
        if (!invalidationsRequested.m() && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        Q0(invalidationsRequested, null);
        return this.changes.g();
    }

    @Override // androidx.compose.runtime.t
    @p1
    public <T> T x(@fg.l d0<T> key) {
        return (T) h0.d(M0(), key);
    }

    @Override // androidx.compose.runtime.t
    public void z(int marker) {
        if (marker < 0) {
            int i4 = -marker;
            a4 a4Var = this.writer;
            while (true) {
                int parent = a4Var.getParent();
                if (parent <= i4) {
                    return;
                } else {
                    S0(a4Var.B0(parent));
                }
            }
        } else {
            if (this.inserting) {
                a4 a4Var2 = this.writer;
                while (this.inserting) {
                    S0(a4Var2.B0(a4Var2.getParent()));
                }
            }
            w3 w3Var = this.reader;
            while (true) {
                int parent2 = w3Var.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    S0(w3Var.O(parent2));
                }
            }
        }
    }
}
