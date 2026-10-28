package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.k2;

/* compiled from: JobSupport.kt */
@kotlin.k(level = kotlin.m.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\t×\u0001~Ø\u0001Ù\u0001Ú\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\n*\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b)\u0010&J.\u0010,\u001a\u00020\n\"\n\b\u0000\u0010+\u0018\u0001*\u00020*2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0082\b¢\u0006\u0004\b,\u0010&J\u0019\u0010.\u001a\u00020-2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b.\u0010/J@\u00105\u001a\u00020*2'\u00103\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\bj\u0002`22\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u00106J'\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u00108\u001a\u00020*H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020*H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010AJ\u0013\u0010B\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ%\u0010G\u001a\u00020\n2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030D2\b\u0010F\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bM\u0010JJ\u0019\u0010N\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u001cH\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bR\u0010SJ#\u0010T\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0010\u001a\u00020\u001cH\u0002¢\u0006\u0004\bW\u0010XJ*\u0010Z\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020V2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0082\u0010¢\u0006\u0004\bZ\u0010[J)\u0010]\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020V2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\u0004\u0018\u00010V*\u00020_H\u0002¢\u0006\u0004\b`\u0010aJ\u0019\u0010c\u001a\u00020b2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bc\u0010dJ\u0015\u0010e\u001a\u0004\u0018\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\be\u0010CJ%\u0010f\u001a\u00020\n2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030D2\b\u0010F\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bf\u0010HJ%\u0010h\u001a\u0004\u0018\u00010\t2\b\u0010F\u001a\u0004\u0018\u00010\t2\b\u0010g\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bh\u0010SJ\u0019\u0010j\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\u0004¢\u0006\u0004\bl\u0010AJ\u000f\u0010m\u001a\u00020\nH\u0014¢\u0006\u0004\bm\u0010nJ\u0011\u0010q\u001a\u00060oj\u0002`p¢\u0006\u0004\bq\u0010rJ#\u0010t\u001a\u00060oj\u0002`p*\u00020\u00152\n\b\u0002\u0010s\u001a\u0004\u0018\u00010bH\u0004¢\u0006\u0004\bt\u0010uJ6\u0010w\u001a\u00020v2'\u00103\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\bj\u0002`2¢\u0006\u0004\bw\u0010xJF\u0010z\u001a\u00020v2\u0006\u00104\u001a\u00020\u00042\u0006\u0010y\u001a\u00020\u00042'\u00103\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\bj\u0002`2¢\u0006\u0004\bz\u0010{J\u0013\u0010|\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b|\u0010CJ\u0017\u0010}\u001a\u00020\n2\u0006\u00108\u001a\u00020*H\u0000¢\u0006\u0004\b}\u0010?J\u001f\u0010~\u001a\u00020\n2\u000e\u0010$\u001a\n\u0018\u00010oj\u0004\u0018\u0001`pH\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020bH\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0005\b\u0082\u0001\u0010(J\u001a\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0088\u0001\u0010(J\u0019\u0010\u0089\u0001\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0015¢\u0006\u0005\b\u0089\u0001\u0010(J\u001c\u0010\u008a\u0001\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J,\u0010\u008d\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0080\b¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0015\u0010\u008f\u0001\u001a\u00060oj\u0002`pH\u0016¢\u0006\u0005\b\u008f\u0001\u0010rJ\u001c\u0010\u0090\u0001\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u008b\u0001J\u001d\u0010\u0091\u0001\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0005\b\u0091\u0001\u0010JJ\u0019\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0006\u0010Y\u001a\u00020\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001b\u0010\u0096\u0001\u001a\u00020\n2\u0007\u0010\u0095\u0001\u001a\u00020\u0015H\u0010¢\u0006\u0006\b\u0096\u0001\u0010\u0084\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0084\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u00042\u0007\u0010\u0095\u0001\u001a\u00020\u0015H\u0014¢\u0006\u0005\b\u0098\u0001\u0010(J\u001c\u0010\u0099\u0001\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009b\u0001\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J\u0012\u0010\u009c\u0001\u001a\u00020bH\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u0081\u0001J\u0012\u0010\u009d\u0001\u001a\u00020bH\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u0081\u0001J\u0012\u0010\u009e\u0001\u001a\u00020bH\u0010¢\u0006\u0006\b\u009e\u0001\u0010\u0081\u0001J\u0012\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0017\u0010£\u0001\u001a\u0004\u0018\u00010\tH\u0084@ø\u0001\u0000¢\u0006\u0005\b£\u0001\u0010CR\u001c\u0010¨\u0001\u001a\u00030¤\u00018F¢\u0006\u000f\u0012\u0005\b§\u0001\u0010n\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001e\u0010ª\u0001\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010LR\u001b\u0010\u00ad\u0001\u001a\u00020\u0004*\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R#\u0010²\u0001\u001a\u0007\u0012\u0002\b\u00030®\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b±\u0001\u0010n\u001a\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010¶\u0001\u001a\u0007\u0012\u0002\b\u00030³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R0\u0010¼\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010·\u0001\u001a\u0005\u0018\u00010\u0092\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R\u0018\u0010i\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010¢\u0001R\u0016\u0010À\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010AR\u0013\u0010Â\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010AR\u0013\u0010Ã\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010AR\u0019\u0010Å\u0001\u001a\u0004\u0018\u00010\u00158DX\u0084\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010 \u0001R\u0016\u0010Ç\u0001\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010AR\u0016\u0010É\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010AR\u001b\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Ê\u00018F¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0016\u0010Ï\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010AR\u0016\u0010Ñ\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010AR\u0013\u0010Ó\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010AR\u0016\u0010Õ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0092\u00010Ô\u00018\u0002X\u0082\u0004R\u0015\u0010Ö\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0Ô\u00018\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Û\u0001"}, d2 = {"Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/b3;", "", "active", "<init>", "(Z)V", "Lkotlin/Function1;", "", "Lkotlin/k2;", "block", "", "s1", "(Lld/l;)Ljava/lang/Void;", "Lkotlinx/coroutines/r2$c;", "state", "proposedUpdate", "U0", "(Lkotlinx/coroutines/r2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "a1", "(Lkotlinx/coroutines/r2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "x0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/d2;", "update", "R1", "(Lkotlinx/coroutines/d2;Ljava/lang/Object;)Z", "P0", "(Lkotlinx/coroutines/d2;Ljava/lang/Object;)V", "Lkotlinx/coroutines/w2;", "list", "cause", "z1", "(Lkotlinx/coroutines/w2;Ljava/lang/Throwable;)V", "J0", "(Ljava/lang/Throwable;)Z", "A1", "Lkotlinx/coroutines/q2;", "T", "B1", "", "M1", "(Ljava/lang/Object;)I", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "w1", "(Lld/l;Z)Lkotlinx/coroutines/q2;", "expect", "node", "w0", "(Ljava/lang/Object;Lkotlinx/coroutines/w2;Lkotlinx/coroutines/q2;)Z", "Lkotlinx/coroutines/p1;", "H1", "(Lkotlinx/coroutines/p1;)V", "I1", "(Lkotlinx/coroutines/q2;)V", "p1", "()Z", "q1", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/m;", "select", "ignoredParam", "J1", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "I0", "(Ljava/lang/Object;)Ljava/lang/Object;", "R0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "t1", "g1", "(Lkotlinx/coroutines/d2;)Lkotlinx/coroutines/w2;", "S1", "(Lkotlinx/coroutines/d2;Ljava/lang/Throwable;)Z", "T1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "U1", "(Lkotlinx/coroutines/d2;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/w;", "V0", "(Lkotlinx/coroutines/d2;)Lkotlinx/coroutines/w;", "child", "V1", "(Lkotlinx/coroutines/r2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)Z", "lastChild", "Q0", "(Lkotlinx/coroutines/r2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/y;", "y1", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/w;", "", "N1", "(Ljava/lang/Object;)Ljava/lang/String;", "D0", "D1", "result", "C1", "parent", "l1", "(Lkotlinx/coroutines/k2;)V", "start", "G1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "message", "O1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/m1;", "F", "(Lld/l;)Lkotlinx/coroutines/m1;", "invokeImmediately", "K0", "(ZZLld/l;)Lkotlinx/coroutines/m1;", "j0", "K1", "b", "(Ljava/util/concurrent/CancellationException;)V", "L0", "()Ljava/lang/String;", "f", "G0", "(Ljava/lang/Throwable;)V", "parentJob", "C", "(Lkotlinx/coroutines/b3;)V", "O0", "E0", "F0", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/JobCancellationException;", "S0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "L", "u1", "v1", "Lkotlinx/coroutines/v;", "N0", "(Lkotlinx/coroutines/x;)Lkotlinx/coroutines/v;", "exception", "k1", "E1", "j1", "F1", "(Ljava/lang/Object;)V", "y0", "toString", "Q1", "x1", "s", "()Ljava/lang/Throwable;", "W0", "()Ljava/lang/Object;", "z0", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "f1", "onJoin", "Z0", "exceptionOrNull", "m1", "(Lkotlinx/coroutines/d2;)Z", "isCancelling", "Lkotlinx/coroutines/selects/g;", "c1", "()Lkotlinx/coroutines/selects/g;", "d1", "onAwaitInternal", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "value", "h1", "()Lkotlinx/coroutines/v;", "L1", "(Lkotlinx/coroutines/v;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/k2;", "i1", "isActive", "l", "isCompleted", "isCancelled", "X0", "completionCause", "Y0", "completionCauseHandled", "e1", "onCancelComplete", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "children", "o1", "isScopedCoroutine", "b1", "handlesException", "n1", "isCompletedExceptionally", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "a", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1454:1\n706#1,2:1461\n367#1,2:1471\n369#1,4:1476\n373#1,4:1482\n377#1,2:1489\n367#1,2:1491\n369#1,4:1496\n373#1,4:1502\n377#1,2:1509\n178#1,2:1518\n707#1:1520\n178#1,2:1521\n178#1,2:1540\n178#1,2:1555\n706#1,2:1557\n706#1,2:1559\n178#1,2:1561\n706#1,2:1563\n178#1,2:1565\n178#1,2:1572\n178#1,2:1574\n1#2:1455\n1#2:1480\n1#2:1500\n28#3,4:1456\n28#3,4:1523\n28#3,4:1567\n28#3,4:1576\n20#4:1460\n20#4:1527\n20#4:1571\n20#4:1580\n288#5,2:1463\n288#5,2:1465\n19#6:1467\n163#7:1468\n163#7:1469\n153#7,4:1583\n75#8:1470\n75#8:1481\n75#8:1501\n75#8:1514\n341#9,3:1473\n344#9,3:1486\n341#9,3:1493\n344#9,3:1506\n341#9,3:1511\n344#9,3:1515\n47#10:1528\n22#11:1529\n22#11:1530\n13#11:1551\n13#11:1554\n13#11:1581\n13#11:1582\n13#11:1587\n13#11:1588\n134#12:1531\n73#12,3:1532\n135#12,5:1535\n314#13,9:1542\n323#13,2:1552\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n250#1:1461,2\n332#1:1471,2\n332#1:1476,4\n332#1:1482,4\n332#1:1489,2\n364#1:1491,2\n364#1:1496,4\n364#1:1502,4\n364#1:1509,2\n381#1:1518,2\n426#1:1520\n461#1:1521,2\n553#1:1540,2\n594#1:1555,2\n621#1:1557,2\n630#1:1559,2\n694#1:1561,2\n723#1:1563,2\n736#1:1565,2\n809#1:1572,2\n831#1:1574,2\n332#1:1480\n364#1:1500\n213#1:1456,4\n478#1:1523,4\n739#1:1567,4\n884#1:1576,4\n213#1:1460\n478#1:1527\n739#1:1571\n884#1:1580\n261#1:1463,2\n265#1:1465,2\n273#1:1467\n279#1:1468\n281#1:1469\n1218#1:1583,4\n284#1:1470\n332#1:1481\n364#1:1501\n372#1:1514\n332#1:1473,3\n332#1:1486,3\n364#1:1493,3\n364#1:1506,3\n368#1:1511,3\n368#1:1515,3\n483#1:1528\n495#1:1529\n505#1:1530\n561#1:1551\n577#1:1554\n924#1:1581\n974#1:1582\n1237#1:1587\n1259#1:1588\n526#1:1531\n526#1:1532,3\n526#1:1535,5\n559#1:1542,9\n559#1:1552,2\n*E\n"})
/* loaded from: classes7.dex */
public class r2 implements k2, x, b3 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80907b = AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, ProtectedSandApp.s("蕺\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80908c = AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, ProtectedSandApp.s("蕻\u0001"));

    @fg.m
    @kd.x
    private volatile Object _parentHandle;

    @fg.m
    @kd.x
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/r2$a;", "T", "Lkotlinx/coroutines/q;", "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/r2;", "job", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/r2;)V", "Lkotlinx/coroutines/k2;", "parent", "", "w", "(Lkotlinx/coroutines/k2;)Ljava/lang/Throwable;", "", "L", "()Ljava/lang/String;", "j", "Lkotlinx/coroutines/r2;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
    private static final class a<T> extends q<T> {

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final r2 job;

        public a(@fg.l kotlin.coroutines.d<? super T> dVar, @fg.l r2 r2Var) {
            super(dVar, 1);
            this.job = r2Var;
        }

        @Override // kotlinx.coroutines.q
        @fg.l
        protected String L() {
            return ProtectedSandApp.s("衑\u0001");
        }

        @Override // kotlinx.coroutines.q
        @fg.l
        public Throwable w(@fg.l k2 parent) {
            Throwable e4;
            Object i12 = this.job.i1();
            return (!(i12 instanceof c) || (e4 = ((c) i12).e()) == null) ? i12 instanceof d0 ? ((d0) i12).cause : parent.x() : e4;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/r2$b;", "Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/r2;", "parent", "Lkotlinx/coroutines/r2$c;", "state", "Lkotlinx/coroutines/w;", "child", "", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/r2;Lkotlinx/coroutines/r2$c;Lkotlinx/coroutines/w;Ljava/lang/Object;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/r2;", "g", "Lkotlinx/coroutines/r2$c;", "h", "Lkotlinx/coroutines/w;", "i", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends q2 {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final r2 parent;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c state;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final w child;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object proposedUpdate;

        public b(@fg.l r2 r2Var, @fg.l c cVar, @fg.l w wVar, @fg.m Object obj) {
            this.parent = r2Var;
            this.state = cVar;
            this.child = wVar;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.f0
        public void Z(@fg.m Throwable cause) {
            this.parent.Q0(this.state, this.child, this.proposedUpdate);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            Z(th);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0017R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010.\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0014\u0010/\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010%R\u0013\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001008\u0002X\u0082\u0004R\u000b\u00103\u001a\u0002028\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b008\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lkotlinx/coroutines/r2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/w2;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/w2;ZLjava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lkotlin/k2;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/w2;", "a", "()Lkotlinx/coroutines/w2;", "value", "d", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "g", "()Z", "j", "(Z)V", "e", "()Ljava/lang/Throwable;", "l", "h", "isSealed", "f", "isCancelling", "isActive", "Lkotlinx/atomicfu/AtomicRef;", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "_rootCause", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
    private static final class c implements d2 {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private static final AtomicIntegerFieldUpdater f80914c = AtomicIntegerFieldUpdater.newUpdater(c.class, ProtectedSandApp.s("衒\u0001"));

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private static final AtomicReferenceFieldUpdater f80915d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, ProtectedSandApp.s("術\u0001"));

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        private static final AtomicReferenceFieldUpdater f80916e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, ProtectedSandApp.s("衔\u0001"));

        @fg.m
        @kd.x
        private volatile Object _exceptionsHolder;

        @kd.x
        private volatile int _isCompleting;

        @fg.m
        @kd.x
        private volatile Object _rootCause;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final w2 list;

        public c(@fg.l w2 w2Var, boolean z4, @fg.m Throwable th) {
            this.list = w2Var;
            this._isCompleting = z4 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f80916e.get(this);
        }

        private final void k(Object obj) {
            f80916e.set(this, obj);
        }

        @Override // kotlinx.coroutines.d2
        @fg.l
        /* renamed from: a, reason: from getter */
        public w2 getList() {
            return this.list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(@fg.l Throwable exception) {
            Throwable e4 = e();
            if (e4 == null) {
                l(exception);
                return;
            }
            if (exception == e4) {
                return;
            }
            Object obj = f80916e.get(this);
            if (obj == null) {
                k(exception);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(exception);
                    return;
                } else {
                    throw new IllegalStateException((ProtectedSandApp.s("衕\u0001") + obj).toString());
                }
            }
            if (exception == obj) {
                return;
            }
            ArrayList<Throwable> c5 = c();
            c5.add(obj);
            c5.add(exception);
            k(c5);
        }

        @fg.m
        public final Throwable e() {
            return (Throwable) f80915d.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return f80914c.get(this) != 0;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.s0 s0Var;
            Object obj = f80916e.get(this);
            s0Var = s2.f80939h;
            return obj == s0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public final List<Throwable> i(@fg.m Throwable proposedException) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.s0 s0Var;
            Object obj = f80916e.get(this);
            if (obj == null) {
                arrayList = c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c5 = c();
                c5.add(obj);
                arrayList = c5;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException((ProtectedSandApp.s("衕\u0001") + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable e4 = e();
            if (e4 != null) {
                arrayList.add(0, e4);
            }
            if (proposedException != null && !kotlin.jvm.internal.l0.g(proposedException, e4)) {
                arrayList.add(proposedException);
            }
            s0Var = s2.f80939h;
            k(s0Var);
            return arrayList;
        }

        @Override // kotlinx.coroutines.d2
        /* renamed from: isActive */
        public boolean getIsActive() {
            return e() == null;
        }

        public final void j(boolean z4) {
            f80914c.set(this, z4 ? 1 : 0);
        }

        public final void l(@fg.m Throwable th) {
            f80915d.set(this, th);
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("衖\u0001") + f() + ProtectedSandApp.s("街\u0001") + g() + ProtectedSandApp.s("衘\u0001") + e() + ProtectedSandApp.s("衙\u0001") + f80916e.get(this) + ProtectedSandApp.s("衚\u0001") + this.list + ']';
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/r2$d;", "Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/selects/m;", "select", "<init>", "(Lkotlinx/coroutines/r2;Lkotlinx/coroutines/selects/m;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/selects/m;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class d extends q2 {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.selects.m<?> select;

        public d(@fg.l kotlinx.coroutines.selects.m<?> mVar) {
            this.select = mVar;
        }

        @Override // kotlinx.coroutines.f0
        public void Z(@fg.m Throwable cause) {
            Object i12 = r2.this.i1();
            if (!(i12 instanceof d0)) {
                i12 = s2.h(i12);
            }
            this.select.l(r2.this, i12);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            Z(th);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/r2$e;", "Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/selects/m;", "select", "<init>", "(Lkotlinx/coroutines/r2;Lkotlinx/coroutines/selects/m;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/selects/m;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class e extends q2 {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.selects.m<?> select;

        public e(@fg.l kotlinx.coroutines.selects.m<?> mVar) {
            this.select = mVar;
        }

        @Override // kotlinx.coroutines.f0
        public void Z(@fg.m Throwable cause) {
            this.select.l(r2.this, kotlin.k2.f75408a);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            Z(th);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/y$b", "Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "g", "(Lkotlinx/coroutines/internal/y;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n526#2:368\n*E\n"})
    public static final class f extends y.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r2 f80922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f80923e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.internal.y yVar, r2 r2Var, Object obj) {
            super(yVar);
            this.f80922d = r2Var;
            this.f80923e = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        @fg.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(@fg.l kotlinx.coroutines.internal.y affected) {
            if (this.f80922d.i1() == this.f80923e) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Lkotlinx/coroutines/k2;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n958#1:1455,6\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super k2>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f80924c;

        /* renamed from: d, reason: collision with root package name */
        Object f80925d;

        /* renamed from: e, reason: collision with root package name */
        int f80926e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f80927f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.sequences.o<? super k2> oVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = r2.this.new g(dVar);
            gVar.f80927f = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0071 -> B:6:0x0087). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0084 -> B:6:0x0087). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r6.f80926e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L28
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r6.f80925d
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                java.lang.Object r3 = r6.f80924c
                kotlinx.coroutines.internal.w r3 = (kotlinx.coroutines.internal.w) r3
                java.lang.Object r4 = r6.f80927f
                kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                kotlin.a1.n(r7)
                goto L87
            L1c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "衛\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r7.<init>(r0)
                throw r7
            L28:
                kotlin.a1.n(r7)
                goto L8c
            L2c:
                kotlin.a1.n(r7)
                java.lang.Object r7 = r6.f80927f
                kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                kotlinx.coroutines.r2 r1 = kotlinx.coroutines.r2.this
                java.lang.Object r1 = r1.i1()
                boolean r4 = r1 instanceof kotlinx.coroutines.w
                if (r4 == 0) goto L4a
                kotlinx.coroutines.w r1 = (kotlinx.coroutines.w) r1
                kotlinx.coroutines.x r1 = r1.childJob
                r6.f80926e = r3
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L8c
                return r0
            L4a:
                boolean r3 = r1 instanceof kotlinx.coroutines.d2
                if (r3 == 0) goto L8c
                kotlinx.coroutines.d2 r1 = (kotlinx.coroutines.d2) r1
                kotlinx.coroutines.w2 r1 = r1.getList()
                if (r1 == 0) goto L8c
                java.lang.Object r3 = r1.q()
                java.lang.String r4 = "衜\u0001"
                java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
                kotlin.jvm.internal.l0.n(r3, r4)
                kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L69:
                boolean r7 = kotlin.jvm.internal.l0.g(r1, r3)
                if (r7 != 0) goto L8c
                boolean r7 = r1 instanceof kotlinx.coroutines.w
                if (r7 == 0) goto L87
                r7 = r1
                kotlinx.coroutines.w r7 = (kotlinx.coroutines.w) r7
                kotlinx.coroutines.x r7 = r7.childJob
                r6.f80927f = r4
                r6.f80924c = r3
                r6.f80925d = r1
                r6.f80926e = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L87
                return r0
            L87:
                kotlinx.coroutines.internal.y r1 = r1.r()
                goto L69
            L8c:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.r2.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class h extends kotlin.jvm.internal.h0 implements ld.q<r2, kotlinx.coroutines.selects.m<?>, Object, kotlin.k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final h f80929d = new h();

        h() {
            super(3, r2.class, ProtectedSandApp.s("衞\u0001"), ProtectedSandApp.s("衝\u0001"), 0);
        }

        @Override // ld.q
        public kotlin.k2 R(r2 r2Var, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            r2Var.D1(mVar, obj);
            return kotlin.k2.f75408a;
        }

        public final void Z(@fg.l r2 r2Var, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            r2Var.D1(mVar, obj);
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class i extends kotlin.jvm.internal.h0 implements ld.q<r2, Object, Object, Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final i f80930d = new i();

        i() {
            super(3, r2.class, ProtectedSandApp.s("衠\u0001"), ProtectedSandApp.s("衟\u0001"), 0);
        }

        @Override // ld.q
        public Object R(r2 r2Var, Object obj, Object obj2) {
            return r2Var.C1(obj, obj2);
        }

        @fg.m
        public final Object Z(@fg.l r2 r2Var, @fg.m Object obj, @fg.m Object obj2) {
            return r2Var.C1(obj, obj2);
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends kotlin.jvm.internal.h0 implements ld.q<r2, kotlinx.coroutines.selects.m<?>, Object, kotlin.k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final j f80931d = new j();

        j() {
            super(3, r2.class, ProtectedSandApp.s("衢\u0001"), ProtectedSandApp.s("衡\u0001"), 0);
        }

        @Override // ld.q
        public kotlin.k2 R(r2 r2Var, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            r2Var.J1(mVar, obj);
            return kotlin.k2.f75408a;
        }

        public final void Z(@fg.l r2 r2Var, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            r2Var.J1(mVar, obj);
        }
    }

    public r2(boolean z4) {
        this._state = z4 ? s2.f80941j : s2.f80940i;
    }

    private final void A1(w2 w2Var, Throwable th) {
        Object q4 = w2Var.q();
        kotlin.jvm.internal.l0.n(q4, ProtectedSandApp.s("蕼\u0001"));
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) q4; !kotlin.jvm.internal.l0.g(yVar, w2Var); yVar = yVar.r()) {
            if (yVar instanceof q2) {
                q2 q2Var = (q2) yVar;
                try {
                    q2Var.Z(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.o.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException(ProtectedSandApp.s("蕽\u0001") + q2Var + ProtectedSandApp.s("蕾\u0001") + this, th2);
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            k1(completionHandlerException);
        }
    }

    private final <T extends q2> void B1(w2 list, Throwable cause) {
        Object q4 = list.q();
        kotlin.jvm.internal.l0.n(q4, ProtectedSandApp.s("蕼\u0001"));
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) q4; !kotlin.jvm.internal.l0.g(yVar, list); yVar = yVar.r()) {
            kotlin.jvm.internal.l0.P();
            if (yVar != null) {
                q2 q2Var = (q2) yVar;
                try {
                    q2Var.Z(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        kotlin.o.a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException(ProtectedSandApp.s("蕽\u0001") + q2Var + ProtectedSandApp.s("蕾\u0001") + this, th);
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            k1(completionHandlerException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C1(Object ignoredParam, Object result) {
        if (result instanceof d0) {
            throw ((d0) result).cause;
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D0(kotlin.coroutines.d<Object> dVar) {
        a aVar = new a(kotlin.coroutines.intrinsics.b.e(dVar), this);
        aVar.e0();
        s.a(aVar, K0(false, true, new c3(aVar)));
        Object y4 = aVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(kotlinx.coroutines.selects.m<?> select, Object ignoredParam) {
        Object i12;
        do {
            i12 = i1();
            if (!(i12 instanceof d2)) {
                if (!(i12 instanceof d0)) {
                    i12 = s2.h(i12);
                }
                select.d(i12);
                return;
            }
        } while (M1(i12) < 0);
        select.f(K0(false, true, new d(select)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.c2] */
    private final void H1(p1 state) {
        w2 w2Var = new w2();
        if (!state.getIsActive()) {
            w2Var = new c2(w2Var);
        }
        androidx.concurrent.futures.c.a(f80907b, this, state, w2Var);
    }

    private final Object I0(Object cause) {
        kotlinx.coroutines.internal.s0 s0Var;
        Object T1;
        kotlinx.coroutines.internal.s0 s0Var2;
        do {
            Object i12 = i1();
            if (!(i12 instanceof d2) || ((i12 instanceof c) && ((c) i12).g())) {
                s0Var = s2.f80932a;
                return s0Var;
            }
            T1 = T1(i12, new d0(R0(cause), false, 2, null));
            s0Var2 = s2.f80934c;
        } while (T1 == s0Var2);
        return T1;
    }

    private final void I1(q2 state) {
        state.l(new w2());
        androidx.concurrent.futures.c.a(f80907b, this, state, state.r());
    }

    private final boolean J0(Throwable cause) {
        if (o1()) {
            return true;
        }
        boolean z4 = cause instanceof CancellationException;
        v h12 = h1();
        return (h12 == null || h12 == y2.f81204b) ? z4 : h12.b(cause) || z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(kotlinx.coroutines.selects.m<?> select, Object ignoredParam) {
        if (p1()) {
            select.f(K0(false, true, new e(select)));
        } else {
            select.d(kotlin.k2.f75408a);
        }
    }

    private final int M1(Object state) {
        p1 p1Var;
        if (!(state instanceof p1)) {
            if (!(state instanceof c2)) {
                return 0;
            }
            if (!androidx.concurrent.futures.c.a(f80907b, this, state, ((c2) state).getList())) {
                return -1;
            }
            G1();
            return 1;
        }
        if (((p1) state).getIsActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80907b;
        p1Var = s2.f80941j;
        if (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, state, p1Var)) {
            return -1;
        }
        G1();
        return 1;
    }

    private final String N1(Object state) {
        boolean z4 = state instanceof c;
        String s4 = ProtectedSandApp.s("蕿\u0001");
        if (!z4) {
            return state instanceof d2 ? ((d2) state).getIsActive() ? s4 : ProtectedSandApp.s("薂\u0001") : state instanceof d0 ? ProtectedSandApp.s("薃\u0001") : ProtectedSandApp.s("薄\u0001");
        }
        c cVar = (c) state;
        return cVar.f() ? ProtectedSandApp.s("薀\u0001") : cVar.g() ? ProtectedSandApp.s("薁\u0001") : s4;
    }

    private final void P0(d2 state, Object update) {
        v h12 = h1();
        if (h12 != null) {
            h12.dispose();
            L1(y2.f81204b);
        }
        d0 d0Var = update instanceof d0 ? (d0) update : null;
        Throwable th = d0Var != null ? d0Var.cause : null;
        if (!(state instanceof q2)) {
            w2 list = state.getList();
            if (list != null) {
                A1(list, th);
                return;
            }
            return;
        }
        try {
            ((q2) state).Z(th);
        } catch (Throwable th2) {
            k1(new CompletionHandlerException(ProtectedSandApp.s("蕽\u0001") + state + ProtectedSandApp.s("蕾\u0001") + this, th2));
        }
    }

    public static /* synthetic */ CancellationException P1(r2 r2Var, Throwable th, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("薅\u0001"));
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        return r2Var.O1(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(c state, w lastChild, Object proposedUpdate) {
        w y12 = y1(lastChild);
        if (y12 == null || !V1(state, y12, proposedUpdate)) {
            y0(U0(state, proposedUpdate));
        }
    }

    private final Throwable R0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th = (Throwable) cause;
            return th == null ? new JobCancellationException(L0(), null, this) : th;
        }
        kotlin.jvm.internal.l0.n(cause, ProtectedSandApp.s("薆\u0001"));
        return ((b3) cause).L();
    }

    private final boolean R1(d2 state, Object update) {
        if (!androidx.concurrent.futures.c.a(f80907b, this, state, s2.g(update))) {
            return false;
        }
        E1(null);
        F1(update);
        P0(state, update);
        return true;
    }

    private final boolean S1(d2 state, Throwable rootCause) {
        w2 g12 = g1(state);
        if (g12 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.c.a(f80907b, this, state, new c(g12, false, rootCause))) {
            return false;
        }
        z1(g12, rootCause);
        return true;
    }

    public static /* synthetic */ JobCancellationException T0(r2 r2Var, String str, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("薇\u0001"));
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = r2Var.L0();
        }
        return new JobCancellationException(str, th, r2Var);
    }

    private final Object T1(Object state, Object proposedUpdate) {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        if (!(state instanceof d2)) {
            s0Var2 = s2.f80932a;
            return s0Var2;
        }
        if ((!(state instanceof p1) && !(state instanceof q2)) || (state instanceof w) || (proposedUpdate instanceof d0)) {
            return U1((d2) state, proposedUpdate);
        }
        if (R1((d2) state, proposedUpdate)) {
            return proposedUpdate;
        }
        s0Var = s2.f80934c;
        return s0Var;
    }

    private final Object U0(c state, Object proposedUpdate) {
        boolean f4;
        Throwable a12;
        d0 d0Var = proposedUpdate instanceof d0 ? (d0) proposedUpdate : null;
        Throwable th = d0Var != null ? d0Var.cause : null;
        synchronized (state) {
            f4 = state.f();
            List<Throwable> i4 = state.i(th);
            a12 = a1(state, i4);
            if (a12 != null) {
                x0(a12, i4);
            }
        }
        if (a12 != null && a12 != th) {
            proposedUpdate = new d0(a12, false, 2, null);
        }
        if (a12 != null && (J0(a12) || j1(a12))) {
            kotlin.jvm.internal.l0.n(proposedUpdate, ProtectedSandApp.s("薈\u0001"));
            ((d0) proposedUpdate).b();
        }
        if (!f4) {
            E1(a12);
        }
        F1(proposedUpdate);
        androidx.concurrent.futures.c.a(f80907b, this, state, s2.g(proposedUpdate));
        P0(state, proposedUpdate);
        return proposedUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object U1(d2 state, Object proposedUpdate) {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        kotlinx.coroutines.internal.s0 s0Var3;
        w2 g12 = g1(state);
        if (g12 == null) {
            s0Var3 = s2.f80934c;
            return s0Var3;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(g12, false, null);
        }
        k1.h hVar = new k1.h();
        synchronized (cVar) {
            if (cVar.g()) {
                s0Var2 = s2.f80932a;
                return s0Var2;
            }
            cVar.j(true);
            if (cVar != state && !androidx.concurrent.futures.c.a(f80907b, this, state, cVar)) {
                s0Var = s2.f80934c;
                return s0Var;
            }
            boolean f4 = cVar.f();
            d0 d0Var = proposedUpdate instanceof d0 ? (d0) proposedUpdate : null;
            if (d0Var != null) {
                cVar.b(d0Var.cause);
            }
            ?? e4 = f4 ? 0 : cVar.e();
            hVar.f75329b = e4;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            if (e4 != 0) {
                z1(g12, e4);
            }
            w V0 = V0(state);
            return (V0 == null || !V1(cVar, V0, proposedUpdate)) ? U0(cVar, proposedUpdate) : s2.f80933b;
        }
    }

    private final w V0(d2 state) {
        w wVar = state instanceof w ? (w) state : null;
        if (wVar != null) {
            return wVar;
        }
        w2 list = state.getList();
        if (list != null) {
            return y1(list);
        }
        return null;
    }

    private final boolean V1(c state, w child, Object proposedUpdate) {
        while (k2.a.g(child.childJob, false, false, new b(this, state, child, proposedUpdate), 1, null) == y2.f81204b) {
            child = y1(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable Z0(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.cause;
        }
        return null;
    }

    private final Throwable a1(c state, List<? extends Throwable> exceptions) {
        Object obj;
        Object obj2 = null;
        if (exceptions.isEmpty()) {
            if (state.f()) {
                return new JobCancellationException(L0(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = exceptions.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    protected static /* synthetic */ void d1() {
    }

    public static /* synthetic */ void f1() {
    }

    private final w2 g1(d2 state) {
        w2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof p1) {
            return new w2();
        }
        if (state instanceof q2) {
            I1((q2) state);
            return null;
        }
        throw new IllegalStateException((ProtectedSandApp.s("薉\u0001") + state).toString());
    }

    private final boolean m1(d2 d2Var) {
        return (d2Var instanceof c) && ((c) d2Var).f();
    }

    private final boolean p1() {
        Object i12;
        do {
            i12 = i1();
            if (!(i12 instanceof d2)) {
                return false;
            }
        } while (M1(i12) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q1(kotlin.coroutines.d<? super kotlin.k2> dVar) {
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        s.a(qVar, K0(false, true, new d3(qVar)));
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : kotlin.k2.f75408a;
    }

    private final void r1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, kotlin.k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Void s1(ld.l<Object, kotlin.k2> block) {
        while (true) {
            block.invoke(i1());
        }
    }

    private final Object t1(Object cause) {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        kotlinx.coroutines.internal.s0 s0Var3;
        kotlinx.coroutines.internal.s0 s0Var4;
        kotlinx.coroutines.internal.s0 s0Var5;
        kotlinx.coroutines.internal.s0 s0Var6;
        Throwable th = null;
        while (true) {
            Object i12 = i1();
            if (i12 instanceof c) {
                synchronized (i12) {
                    if (((c) i12).h()) {
                        s0Var2 = s2.f80935d;
                        return s0Var2;
                    }
                    boolean f4 = ((c) i12).f();
                    if (cause != null || !f4) {
                        if (th == null) {
                            th = R0(cause);
                        }
                        ((c) i12).b(th);
                    }
                    Throwable e4 = f4 ? null : ((c) i12).e();
                    if (e4 != null) {
                        z1(((c) i12).getList(), e4);
                    }
                    s0Var = s2.f80932a;
                    return s0Var;
                }
            }
            if (!(i12 instanceof d2)) {
                s0Var3 = s2.f80935d;
                return s0Var3;
            }
            if (th == null) {
                th = R0(cause);
            }
            d2 d2Var = (d2) i12;
            if (!d2Var.getIsActive()) {
                Object T1 = T1(i12, new d0(th, false, 2, null));
                s0Var5 = s2.f80932a;
                if (T1 == s0Var5) {
                    throw new IllegalStateException((ProtectedSandApp.s("薊\u0001") + i12).toString());
                }
                s0Var6 = s2.f80934c;
                if (T1 != s0Var6) {
                    return T1;
                }
            } else if (S1(d2Var, th)) {
                s0Var4 = s2.f80932a;
                return s0Var4;
            }
        }
    }

    private final boolean w0(Object expect, w2 list, q2 node) {
        int N;
        f fVar = new f(node, this, expect);
        do {
            N = list.s().N(node, list, fVar);
            if (N == 1) {
                return true;
            }
        } while (N != 2);
        return false;
    }

    private final q2 w1(ld.l<? super Throwable, kotlin.k2> handler, boolean onCancelling) {
        q2 q2Var;
        if (onCancelling) {
            q2Var = handler instanceof l2 ? (l2) handler : null;
            if (q2Var == null) {
                q2Var = new i2(handler);
            }
        } else {
            q2Var = handler instanceof q2 ? (q2) handler : null;
            if (q2Var == null) {
                q2Var = new j2(handler);
            }
        }
        q2Var.job = this;
        return q2Var;
    }

    private final void x0(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th : exceptions) {
            if (th != rootCause && th != rootCause && !(th instanceof CancellationException) && newSetFromMap.add(th)) {
                kotlin.o.a(rootCause, th);
            }
        }
    }

    private final w y1(kotlinx.coroutines.internal.y yVar) {
        while (yVar.v()) {
            yVar = yVar.s();
        }
        while (true) {
            yVar = yVar.r();
            if (!yVar.v()) {
                if (yVar instanceof w) {
                    return (w) yVar;
                }
                if (yVar instanceof w2) {
                    return null;
                }
            }
        }
    }

    private final void z1(w2 list, Throwable cause) {
        E1(cause);
        Object q4 = list.q();
        kotlin.jvm.internal.l0.n(q4, ProtectedSandApp.s("蕼\u0001"));
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) q4; !kotlin.jvm.internal.l0.g(yVar, list); yVar = yVar.r()) {
            if (yVar instanceof l2) {
                q2 q2Var = (q2) yVar;
                try {
                    q2Var.Z(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        kotlin.o.a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException(ProtectedSandApp.s("蕽\u0001") + q2Var + ProtectedSandApp.s("蕾\u0001") + this, th);
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            k1(completionHandlerException);
        }
        J0(cause);
    }

    @Override // kotlinx.coroutines.x
    public final void C(@fg.l b3 parentJob) {
        F0(parentJob);
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public k2 E(@fg.l k2 k2Var) {
        return k2Var;
    }

    public final boolean E0(@fg.m Throwable cause) {
        return F0(cause);
    }

    protected void E1(@fg.m Throwable cause) {
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public final m1 F(@fg.l ld.l<? super Throwable, kotlin.k2> handler) {
        return K0(false, true, handler);
    }

    public final boolean F0(@fg.m Object cause) {
        Object obj;
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        kotlinx.coroutines.internal.s0 s0Var3;
        obj = s2.f80932a;
        if (e1() && (obj = I0(cause)) == s2.f80933b) {
            return true;
        }
        s0Var = s2.f80932a;
        if (obj == s0Var) {
            obj = t1(cause);
        }
        s0Var2 = s2.f80932a;
        if (obj == s0Var2 || obj == s2.f80933b) {
            return true;
        }
        s0Var3 = s2.f80935d;
        if (obj == s0Var3) {
            return false;
        }
        y0(obj);
        return true;
    }

    protected void F1(@fg.m Object state) {
    }

    public void G0(@fg.l Throwable cause) {
        F0(cause);
    }

    protected void G1() {
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public final m1 K0(boolean onCancelling, boolean invokeImmediately, @fg.l ld.l<? super Throwable, kotlin.k2> handler) {
        q2 w12 = w1(handler, onCancelling);
        while (true) {
            Object i12 = i1();
            if (i12 instanceof p1) {
                p1 p1Var = (p1) i12;
                if (!p1Var.getIsActive()) {
                    H1(p1Var);
                } else if (androidx.concurrent.futures.c.a(f80907b, this, i12, w12)) {
                    return w12;
                }
            } else {
                if (!(i12 instanceof d2)) {
                    if (invokeImmediately) {
                        d0 d0Var = i12 instanceof d0 ? (d0) i12 : null;
                        handler.invoke(d0Var != null ? d0Var.cause : null);
                    }
                    return y2.f81204b;
                }
                w2 list = ((d2) i12).getList();
                if (list == null) {
                    kotlin.jvm.internal.l0.n(i12, ProtectedSandApp.s("薋\u0001"));
                    I1((q2) i12);
                } else {
                    m1 m1Var = y2.f81204b;
                    if (onCancelling && (i12 instanceof c)) {
                        synchronized (i12) {
                            try {
                                r3 = ((c) i12).e();
                                if (r3 != null) {
                                    if ((handler instanceof w) && !((c) i12).g()) {
                                    }
                                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                                }
                                if (w0(i12, list, w12)) {
                                    if (r3 == null) {
                                        return w12;
                                    }
                                    m1Var = w12;
                                    kotlin.k2 k2Var2 = kotlin.k2.f75408a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (invokeImmediately) {
                            handler.invoke(r3);
                        }
                        return m1Var;
                    }
                    if (w0(i12, list, w12)) {
                        return w12;
                    }
                }
            }
        }
    }

    public final void K1(@fg.l q2 node) {
        Object i12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p1 p1Var;
        do {
            i12 = i1();
            if (!(i12 instanceof q2)) {
                if (!(i12 instanceof d2) || ((d2) i12).getList() == null) {
                    return;
                }
                node.D();
                return;
            }
            if (i12 != node) {
                return;
            }
            atomicReferenceFieldUpdater = f80907b;
            p1Var = s2.f80941j;
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, i12, p1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.b3
    @fg.l
    public CancellationException L() {
        CancellationException cancellationException;
        Object i12 = i1();
        if (i12 instanceof c) {
            cancellationException = ((c) i12).e();
        } else if (i12 instanceof d0) {
            cancellationException = ((d0) i12).cause;
        } else {
            if (i12 instanceof d2) {
                throw new IllegalStateException((ProtectedSandApp.s("薍\u0001") + i12).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException(ProtectedSandApp.s("薌\u0001") + N1(i12), cancellationException, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @fg.l
    public String L0() {
        return ProtectedSandApp.s("薎\u0001");
    }

    public final void L1(@fg.m v vVar) {
        f80908c.set(this, vVar);
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public final v N0(@fg.l x child) {
        m1 g4 = k2.a.g(this, true, false, new w(child), 2, null);
        kotlin.jvm.internal.l0.n(g4, ProtectedSandApp.s("薏\u0001"));
        return (v) g4;
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public boolean O0(@fg.l Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return F0(cause) && getHandlesException();
    }

    @fg.l
    protected final CancellationException O1(@fg.l Throwable th, @fg.m String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = L0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    @fg.l
    @f2
    public final String Q1() {
        StringBuilder sb = new StringBuilder();
        sb.append(x1());
        sb.append('{');
        return androidx.compose.foundation.layout.f3.a(sb, N1(i1()), '}');
    }

    @fg.l
    public final JobCancellationException S0(@fg.m String message, @fg.m Throwable cause) {
        if (message == null) {
            message = L0();
        }
        return new JobCancellationException(message, cause, this);
    }

    @fg.m
    public final Object W0() {
        Object i12 = i1();
        if (i12 instanceof d2) {
            throw new IllegalStateException(ProtectedSandApp.s("薐\u0001"));
        }
        if (i12 instanceof d0) {
            throw ((d0) i12).cause;
        }
        return s2.h(i12);
    }

    @fg.m
    protected final Throwable X0() {
        Object i12 = i1();
        boolean z4 = i12 instanceof c;
        String s4 = ProtectedSandApp.s("薑\u0001");
        if (z4) {
            Throwable e4 = ((c) i12).e();
            if (e4 != null) {
                return e4;
            }
            throw new IllegalStateException((s4 + this).toString());
        }
        if (i12 instanceof d2) {
            throw new IllegalStateException((s4 + this).toString());
        }
        if (i12 instanceof d0) {
            return ((d0) i12).cause;
        }
        return null;
    }

    protected final boolean Y0() {
        Object i12 = i1();
        return (i12 instanceof d0) && ((d0) i12).a();
    }

    @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    public void b(@fg.m CancellationException cause) {
        if (cause == null) {
            cause = new JobCancellationException(L0(), null, this);
        }
        G0(cause);
    }

    /* renamed from: b1 */
    public boolean getHandlesException() {
        return true;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @fg.l
    protected final kotlinx.coroutines.selects.g<?> c1() {
        h hVar = h.f80929d;
        kotlin.jvm.internal.l0.n(hVar, ProtectedSandApp.s("薒\u0001"));
        ld.q qVar = (ld.q) kotlin.jvm.internal.u1.q(hVar, 3);
        i iVar = i.f80930d;
        kotlin.jvm.internal.l0.n(iVar, ProtectedSandApp.s("薓\u0001"));
        return new kotlinx.coroutines.selects.h(this, qVar, (ld.q) kotlin.jvm.internal.u1.q(iVar, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d0
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        b(null);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public boolean e1() {
        return false;
    }

    @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean f(Throwable cause) {
        Throwable jobCancellationException;
        if (cause == null || (jobCancellationException = P1(this, cause, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(L0(), null, this);
        }
        G0(jobCancellationException);
        return true;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // kotlin.coroutines.g.b
    @fg.l
    public final g.c<?> getKey() {
        return k2.INSTANCE;
    }

    @Override // kotlinx.coroutines.k2
    @fg.m
    public k2 getParent() {
        v h12 = h1();
        if (h12 != null) {
            return h12.getParent();
        }
        return null;
    }

    @fg.m
    public final v h1() {
        return (v) f80908c.get(this);
    }

    @fg.m
    public final Object i1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80907b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.k0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.k0) obj).b(this);
        }
    }

    @Override // kotlinx.coroutines.k2
    public boolean isActive() {
        Object i12 = i1();
        return (i12 instanceof d2) && ((d2) i12).getIsActive();
    }

    @Override // kotlinx.coroutines.k2
    public final boolean isCancelled() {
        Object i12 = i1();
        return (i12 instanceof d0) || ((i12 instanceof c) && ((c) i12).f());
    }

    @Override // kotlinx.coroutines.k2
    @fg.m
    public final Object j0(@fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (p1()) {
            Object q12 = q1(dVar);
            return q12 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? q12 : kotlin.k2.f75408a;
        }
        p2.x(dVar.getContext());
        return kotlin.k2.f75408a;
    }

    protected boolean j1(@fg.l Throwable exception) {
        return false;
    }

    public void k1(@fg.l Throwable exception) {
        throw exception;
    }

    @Override // kotlinx.coroutines.k2
    public final boolean l() {
        return !(i1() instanceof d2);
    }

    protected final void l1(@fg.m k2 parent) {
        if (parent == null) {
            L1(y2.f81204b);
            return;
        }
        parent.start();
        v N0 = parent.N0(this);
        L1(N0);
        if (l()) {
            N0.dispose();
            L1(y2.f81204b);
        }
    }

    public final boolean n1() {
        return i1() instanceof d0;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public final kotlin.sequences.m<k2> o() {
        return kotlin.sequences.p.b(new g(null));
    }

    protected boolean o1() {
        return false;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public final kotlinx.coroutines.selects.e r0() {
        j jVar = j.f80931d;
        kotlin.jvm.internal.l0.n(jVar, ProtectedSandApp.s("薒\u0001"));
        return new kotlinx.coroutines.selects.f(this, (ld.q) kotlin.jvm.internal.u1.q(jVar, 3), null, 4, null);
    }

    @fg.m
    public final Throwable s() {
        Object i12 = i1();
        if (i12 instanceof d2) {
            throw new IllegalStateException(ProtectedSandApp.s("薐\u0001"));
        }
        return Z0(i12);
    }

    @Override // kotlinx.coroutines.k2
    public final boolean start() {
        int M1;
        do {
            M1 = M1(i1());
            if (M1 == 0) {
                return false;
            }
        } while (M1 != 1);
        return true;
    }

    @fg.l
    public String toString() {
        return Q1() + '@' + w0.b(this);
    }

    public final boolean u1(@fg.m Object proposedUpdate) {
        Object T1;
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        do {
            T1 = T1(i1(), proposedUpdate);
            s0Var = s2.f80932a;
            if (T1 == s0Var) {
                return false;
            }
            if (T1 == s2.f80933b) {
                return true;
            }
            s0Var2 = s2.f80934c;
        } while (T1 == s0Var2);
        y0(T1);
        return true;
    }

    @fg.m
    public final Object v1(@fg.m Object proposedUpdate) {
        Object T1;
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        do {
            T1 = T1(i1(), proposedUpdate);
            s0Var = s2.f80932a;
            if (T1 == s0Var) {
                throw new IllegalStateException(ProtectedSandApp.s("薔\u0001") + this + ProtectedSandApp.s("薕\u0001") + proposedUpdate, Z0(proposedUpdate));
            }
            s0Var2 = s2.f80934c;
        } while (T1 == s0Var2);
        return T1;
    }

    @Override // kotlinx.coroutines.k2
    @fg.l
    public final CancellationException x() {
        Object i12 = i1();
        boolean z4 = i12 instanceof c;
        String s4 = ProtectedSandApp.s("薑\u0001");
        if (!z4) {
            if (i12 instanceof d2) {
                throw new IllegalStateException((s4 + this).toString());
            }
            if (i12 instanceof d0) {
                return P1(this, ((d0) i12).cause, null, 1, null);
            }
            return new JobCancellationException(w0.a(this) + ProtectedSandApp.s("薗\u0001"), null, this);
        }
        Throwable e4 = ((c) i12).e();
        if (e4 != null) {
            CancellationException O1 = O1(e4, w0.a(this) + ProtectedSandApp.s("薖\u0001"));
            if (O1 != null) {
                return O1;
            }
        }
        throw new IllegalStateException((s4 + this).toString());
    }

    @fg.l
    public String x1() {
        return w0.a(this);
    }

    protected void y0(@fg.m Object state) {
    }

    @fg.m
    protected final Object z0(@fg.l kotlin.coroutines.d<Object> dVar) {
        Object i12;
        do {
            i12 = i1();
            if (!(i12 instanceof d2)) {
                if (i12 instanceof d0) {
                    throw ((d0) i12).cause;
                }
                return s2.h(i12);
            }
        } while (M1(i12) < 0);
        return D0(dVar);
    }
}
