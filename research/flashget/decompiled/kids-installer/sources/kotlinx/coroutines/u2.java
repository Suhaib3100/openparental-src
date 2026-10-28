package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.n2;

/* compiled from: JobSupport.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005~Ï\u0001Ð\u0001B\u0012\u0012\u0007\u0010Ì\u0001\u001a\u00020\u001b¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001b¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u0007H\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\u00122\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u0007\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010&J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010&J\u0019\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0085\u0001\u0010&J\u001c\u0010\u0086\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0089\u0001\u001a\u00030\u0088\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010hJ\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u0087\u0001J\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u008d\u0001\u0010CJ\u0019\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0006\b\u0092\u0001\u0010\u0080\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0006\b\u0093\u0001\u0010\u0080\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0094\u0001\u0010&J\u001c\u0010\u0095\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0098\u0001\u0010}J\u0011\u0010\u0099\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0099\u0001\u0010}J\u0011\u0010\u009a\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u009a\u0001\u0010}J\u0012\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010AJT\u0010¡\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010ER\u001b\u0010¨\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¬\u0001\u001a\u0007\u0012\u0002\b\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008e\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u009e\u0001R\u0016\u0010µ\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010?R\u0013\u0010¸\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010?R\u0019\u0010º\u0001\u001a\u0004\u0018\u00010\u00128DX\u0084\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u009c\u0001R\u0016\u0010¼\u0001\u001a\u00020\u001b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010?R\u0014\u0010¿\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010Á\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010?R\u001b\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010Ç\u0001\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010?R\u0016\u0010É\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010?R\u0013\u0010Ë\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ñ\u0001"}, d2 = {"Lkotlinx/coroutines/u2;", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/z;", "Lkotlinx/coroutines/e3;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "", "Lkotlin/m2;", "block", "", "c1", "(Lq3/l;)Ljava/lang/Void;", "Lkotlinx/coroutines/u2$c;", "state", "proposedUpdate", "I0", "(Lkotlinx/coroutines/u2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "O0", "(Lkotlinx/coroutines/u2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "r0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/g2;", "update", "", "A1", "(Lkotlinx/coroutines/g2;Ljava/lang/Object;)Z", "D0", "(Lkotlinx/coroutines/g2;Ljava/lang/Object;)V", "Lkotlinx/coroutines/z2;", "list", "cause", "j1", "(Lkotlinx/coroutines/z2;Ljava/lang/Throwable;)V", "A0", "(Ljava/lang/Throwable;)Z", "k1", "Lkotlinx/coroutines/t2;", "T", "l1", "", "v1", "(Ljava/lang/Object;)I", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "g1", "(Lq3/l;Z)Lkotlinx/coroutines/t2;", "expect", "node", "q0", "(Ljava/lang/Object;Lkotlinx/coroutines/z2;Lkotlinx/coroutines/t2;)Z", "Lkotlinx/coroutines/s1;", "p1", "(Lkotlinx/coroutines/s1;)V", "q1", "(Lkotlinx/coroutines/t2;)V", "a1", "()Z", "b1", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "z0", "(Ljava/lang/Object;)Ljava/lang/Object;", "F0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "d1", "R0", "(Lkotlinx/coroutines/g2;)Lkotlinx/coroutines/z2;", "B1", "(Lkotlinx/coroutines/g2;Ljava/lang/Throwable;)Z", "C1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "D1", "(Lkotlinx/coroutines/g2;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/y;", "J0", "(Lkotlinx/coroutines/g2;)Lkotlinx/coroutines/y;", "child", "E1", "(Lkotlinx/coroutines/u2$c;Lkotlinx/coroutines/y;Ljava/lang/Object;)Z", "lastChild", "E0", "(Lkotlinx/coroutines/u2$c;Lkotlinx/coroutines/y;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/y;", "i1", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/y;", "", "w1", "(Ljava/lang/Object;)Ljava/lang/String;", "u0", "parent", "W0", "(Lkotlinx/coroutines/n2;)V", "start", "o1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "O", "()Ljava/util/concurrent/CancellationException;", "message", "x1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/p1;", "m0", "(Lq3/l;)Lkotlinx/coroutines/p1;", "invokeImmediately", "P", "(ZZLq3/l;)Lkotlinx/coroutines/p1;", "H", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/coroutines/d;", "x", "(Lkotlinx/coroutines/selects/f;Lq3/l;)V", "s1", "e", "(Ljava/util/concurrent/CancellationException;)V", "B0", "()Ljava/lang/String;", "a", "y0", "(Ljava/lang/Throwable;)V", "parentJob", "U", "(Lkotlinx/coroutines/e3;)V", "C0", "w0", "x0", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/JobCancellationException;", "G0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "l0", "e1", "f1", "Lkotlinx/coroutines/x;", "p0", "(Lkotlinx/coroutines/z;)Lkotlinx/coroutines/x;", "exception", "V0", "m1", "U0", "n1", "(Ljava/lang/Object;)V", "s0", "toString", "z1", "h1", "G", "()Ljava/lang/Throwable;", "K0", "()Ljava/lang/Object;", "t0", "Lkotlin/Function2;", "r1", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "t1", "N0", "exceptionOrNull", "X0", "(Lkotlinx/coroutines/g2;)Z", "isCancelling", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "value", "S0", "()Lkotlinx/coroutines/x;", "u1", "(Lkotlinx/coroutines/x;)V", "parentHandle", "T0", "d", "isActive", "m", "isCompleted", "isCancelled", "L0", "completionCause", "M0", "completionCauseHandled", "g0", "()Lkotlinx/coroutines/selects/c;", "onJoin", "Q0", "onCancelComplete", "Lkotlin/sequences/m;", "F", "()Lkotlin/sequences/m;", "children", "Z0", "isScopedCoroutine", "P0", "handlesException", "Y0", "isCompletedExceptionally", "active", "<init>", "(Z)V", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public class u2 implements n2, z, e3, kotlinx.coroutines.selects.c {

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29026o = AtomicReferenceFieldUpdater.newUpdater(u2.class, Object.class, ProtectedSandApp.s("遐"));

    @d5.d
    private volatile /* synthetic */ Object _parentHandle;

    @d5.d
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/u2$a;", "T", "Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/n2;", "parent", "", "z", "", "H", "Lkotlinx/coroutines/u2;", "w", "Lkotlinx/coroutines/u2;", "job", "Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/u2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class a<T> extends s<T> {

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final u2 job;

        public a(@d5.d Continuation<? super T> continuation, @d5.d u2 u2Var) {
            super(continuation, 1);
            this.job = u2Var;
        }

        @Override // kotlinx.coroutines.s
        @d5.d
        protected String H() {
            return ProtectedSandApp.s("醌");
        }

        @Override // kotlinx.coroutines.s
        @d5.d
        public Throwable z(@d5.d n2 parent) {
            Throwable e6;
            Object T0 = this.job.T0();
            return (!(T0 instanceof c) || (e6 = ((c) T0).e()) == null) ? T0 instanceof f0 ? ((f0) T0).cause : parent.O() : e6;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/u2$b;", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "Lkotlinx/coroutines/u2;", "s", "Lkotlinx/coroutines/u2;", "parent", "Lkotlinx/coroutines/u2$c;", "t", "Lkotlinx/coroutines/u2$c;", "state", "Lkotlinx/coroutines/y;", "u", "Lkotlinx/coroutines/y;", "child", "", "v", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/u2;Lkotlinx/coroutines/u2$c;Lkotlinx/coroutines/y;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class b extends t2 {

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final u2 parent;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final c state;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final y child;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Object proposedUpdate;

        public b(@d5.d u2 u2Var, @d5.d c cVar, @d5.d y yVar, @d5.e Object obj) {
            this.parent = u2Var;
            this.state = cVar;
            this.child = yVar;
            this.proposedUpdate = obj;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
            Z0(th);
            return kotlin.m2.f23662a;
        }

        @Override // kotlinx.coroutines.h0
        public void Z0(@d5.e Throwable th) {
            this.parent.E0(this.state, this.child, this.proposedUpdate);
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b0\u00101J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0010R\u0011\u0010+\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0011\u0010-\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"¨\u00062"}, d2 = {"Lkotlinx/coroutines/u2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/g2;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/z2;", "o", "Lkotlinx/coroutines/z2;", "x", "()Lkotlinx/coroutines/z2;", "list", "value", "c", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "g", "()Z", "j", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "l", "rootCause", "h", "isSealed", "f", "isCancelling", "d", "isActive", "<init>", "(Lkotlinx/coroutines/z2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private static final class c implements g2 {

        @d5.d
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @d5.d
        private volatile /* synthetic */ int _isCompleting;

        @d5.d
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final z2 list;

        public c(@d5.d z2 z2Var, boolean z5, @d5.e Throwable th) {
            this.list = z2Var;
            this._isCompleting = z5 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        /* renamed from: c, reason: from getter */
        private final Object get_exceptionsHolder() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@d5.d Throwable exception) {
            Throwable th = (Throwable) this._rootCause;
            if (th == null) {
                this._rootCause = exception;
                return;
            }
            if (exception == th) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = exception;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("庅"), obj));
                }
                ((ArrayList) obj).add(exception);
            } else {
                if (exception == obj) {
                    return;
                }
                ArrayList<Throwable> b6 = b();
                b6.add(obj);
                b6.add(exception);
                this._exceptionsHolder = b6;
            }
        }

        @Override // kotlinx.coroutines.g2
        /* renamed from: d */
        public boolean getIsActive() {
            return ((Throwable) this._rootCause) == null;
        }

        @d5.e
        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.r0 r0Var;
            Object obj = this._exceptionsHolder;
            r0Var = v2.f29051h;
            return obj == r0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public final List<Throwable> i(@d5.e Throwable proposedException) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.r0 r0Var;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = b();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> b6 = b();
                b6.add(obj);
                arrayList = b6;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("庆"), obj));
                }
                arrayList = (ArrayList) obj;
            }
            Throwable th = (Throwable) this._rootCause;
            if (th != null) {
                arrayList.add(0, th);
            }
            if (proposedException != null && !kotlin.jvm.internal.l0.g(proposedException, th)) {
                arrayList.add(proposedException);
            }
            r0Var = v2.f29051h;
            this._exceptionsHolder = r0Var;
            return arrayList;
        }

        public final void j(boolean z5) {
            this._isCompleting = z5 ? 1 : 0;
        }

        public final void l(@d5.e Throwable th) {
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("庇") + f() + ProtectedSandApp.s("庈") + ((boolean) this._isCompleting) + ProtectedSandApp.s("庉") + ((Throwable) this._rootCause) + ProtectedSandApp.s("床") + this._exceptionsHolder + ProtectedSandApp.s("庋") + this.list + ']';
        }

        @Override // kotlinx.coroutines.g2
        @d5.d
        /* renamed from: x, reason: from getter */
        public z2 getList() {
            return this.list;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/y$f", "Lkotlinx/coroutines/internal/y$c;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends y.c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u2 f29033d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f29034e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.y yVar, u2 u2Var, Object obj) {
            super(yVar);
            this.f29033d = u2Var;
            this.f29034e = obj;
        }

        @Override // kotlinx.coroutines.internal.d
        @d5.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@d5.d kotlinx.coroutines.internal.y affected) {
            if (this.f29033d.T0() == this.f29034e) {
                return null;
            }
            return kotlinx.coroutines.internal.x.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Lkotlinx/coroutines/n2;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class e extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super n2>, Continuation<? super kotlin.m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f29035q;

        /* renamed from: r, reason: collision with root package name */
        Object f29036r;

        /* renamed from: s, reason: collision with root package name */
        int f29037s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f29038t;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006a -> B:6:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007d -> B:6:0x0080). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.f29037s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L29
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f29036r
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                java.lang.Object r3 = r7.f29035q
                kotlinx.coroutines.internal.w r3 = (kotlinx.coroutines.internal.w) r3
                java.lang.Object r4 = r7.f29038t
                kotlin.sequences.o r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.a1.n(r8)
                r8 = r7
                goto L80
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "醍"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L29:
                kotlin.a1.n(r8)
                goto L85
            L2d:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f29038t
                kotlin.sequences.o r8 = (kotlin.sequences.SequenceScope) r8
                kotlinx.coroutines.u2 r1 = kotlinx.coroutines.u2.this
                java.lang.Object r1 = r1.T0()
                boolean r4 = r1 instanceof kotlinx.coroutines.y
                if (r4 == 0) goto L4b
                kotlinx.coroutines.y r1 = (kotlinx.coroutines.y) r1
                kotlinx.coroutines.z r1 = r1.childJob
                r7.f29037s = r3
                java.lang.Object r8 = r8.f(r1, r7)
                if (r8 != r0) goto L85
                return r0
            L4b:
                boolean r3 = r1 instanceof kotlinx.coroutines.g2
                if (r3 == 0) goto L85
                kotlinx.coroutines.g2 r1 = (kotlinx.coroutines.g2) r1
                kotlinx.coroutines.z2 r1 = r1.getList()
                if (r1 == 0) goto L85
                java.lang.Object r3 = r1.K0()
                kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L62:
                boolean r5 = kotlin.jvm.internal.l0.g(r1, r3)
                if (r5 != 0) goto L85
                boolean r5 = r1 instanceof kotlinx.coroutines.y
                if (r5 == 0) goto L80
                r5 = r1
                kotlinx.coroutines.y r5 = (kotlinx.coroutines.y) r5
                kotlinx.coroutines.z r5 = r5.childJob
                r8.f29038t = r4
                r8.f29035q = r3
                r8.f29036r = r1
                r8.f29037s = r2
                java.lang.Object r5 = r4.f(r5, r8)
                if (r5 != r0) goto L80
                return r0
            L80:
                kotlinx.coroutines.internal.y r1 = r1.L0()
                goto L62
            L85:
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.u2.e.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super n2> sequenceScope, @d5.e Continuation<? super kotlin.m2> continuation) {
            return ((e) c(sequenceScope, continuation)).A(kotlin.m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<kotlin.m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            e eVar = u2.this.new e(continuation);
            eVar.f29038t = obj;
            return eVar;
        }
    }

    public u2(boolean z5) {
        this._state = z5 ? v2.f29053j : v2.f29052i;
        this._parentHandle = null;
    }

    private final boolean A0(Throwable cause) {
        if (Z0()) {
            return true;
        }
        boolean z5 = cause instanceof CancellationException;
        x S0 = S0();
        return (S0 == null || S0 == b3.f27276o) ? z5 : S0.w(cause) || z5;
    }

    private final boolean A1(g2 state, Object update) {
        if (!androidx.concurrent.futures.d.a(f29026o, this, state, v2.g(update))) {
            return false;
        }
        m1(null);
        n1(update);
        D0(state, update);
        return true;
    }

    private final boolean B1(g2 state, Throwable rootCause) {
        z2 R0 = R0(state);
        if (R0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.d.a(f29026o, this, state, new c(R0, false, rootCause))) {
            return false;
        }
        j1(R0, rootCause);
        return true;
    }

    private final Object C1(Object state, Object proposedUpdate) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        if (!(state instanceof g2)) {
            r0Var2 = v2.f29044a;
            return r0Var2;
        }
        if ((!(state instanceof s1) && !(state instanceof t2)) || (state instanceof y) || (proposedUpdate instanceof f0)) {
            return D1((g2) state, proposedUpdate);
        }
        if (A1((g2) state, proposedUpdate)) {
            return proposedUpdate;
        }
        r0Var = v2.f29046c;
        return r0Var;
    }

    private final void D0(g2 state, Object update) {
        x S0 = S0();
        if (S0 != null) {
            S0.g();
            u1(b3.f27276o);
        }
        f0 f0Var = update instanceof f0 ? (f0) update : null;
        Throwable th = f0Var != null ? f0Var.cause : null;
        if (!(state instanceof t2)) {
            z2 list = state.getList();
            if (list != null) {
                k1(list, th);
                return;
            }
            return;
        }
        try {
            ((t2) state).Z0(th);
        } catch (Throwable th2) {
            V0(new CompletionHandlerException(ProtectedSandApp.s("遑") + state + ProtectedSandApp.s("遒") + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object D1(g2 state, Object proposedUpdate) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        z2 R0 = R0(state);
        if (R0 == null) {
            r0Var3 = v2.f29046c;
            return r0Var3;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(R0, false, null);
        }
        k1.h hVar = new k1.h();
        synchronized (cVar) {
            if (cVar.g()) {
                r0Var2 = v2.f29044a;
                return r0Var2;
            }
            cVar.j(true);
            if (cVar != state && !androidx.concurrent.futures.d.a(f29026o, this, state, cVar)) {
                r0Var = v2.f29046c;
                return r0Var;
            }
            boolean f6 = cVar.f();
            f0 f0Var = proposedUpdate instanceof f0 ? (f0) proposedUpdate : null;
            if (f0Var != null) {
                cVar.a(f0Var.cause);
            }
            ?? e6 = Boolean.valueOf(f6 ? false : true).booleanValue() ? cVar.e() : 0;
            hVar.f23572o = e6;
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            if (e6 != 0) {
                j1(R0, e6);
            }
            y J0 = J0(state);
            return (J0 == null || !E1(cVar, J0, proposedUpdate)) ? I0(cVar, proposedUpdate) : v2.f29045b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(c state, y lastChild, Object proposedUpdate) {
        y i12 = i1(lastChild);
        if (i12 == null || !E1(state, i12, proposedUpdate)) {
            s0(I0(state, proposedUpdate));
        }
    }

    private final boolean E1(c state, y child, Object proposedUpdate) {
        while (n2.a.f(child.childJob, false, false, new b(this, state, child, proposedUpdate), 1, null) == b3.f27276o) {
            child = i1(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable F0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th = (Throwable) cause;
            return th == null ? new JobCancellationException(B0(), null, this) : th;
        }
        if (cause != null) {
            return ((e3) cause).l0();
        }
        throw new NullPointerException(ProtectedSandApp.s("道"));
    }

    public static /* synthetic */ JobCancellationException H0(u2 u2Var, String str, Throwable th, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("達"));
        }
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = u2Var.B0();
        }
        return new JobCancellationException(str, th, u2Var);
    }

    private final Object I0(c state, Object proposedUpdate) {
        boolean f6;
        Throwable O0;
        f0 f0Var = proposedUpdate instanceof f0 ? (f0) proposedUpdate : null;
        Throwable th = f0Var != null ? f0Var.cause : null;
        synchronized (state) {
            f6 = state.f();
            List<Throwable> i5 = state.i(th);
            O0 = O0(state, i5);
            if (O0 != null) {
                r0(O0, i5);
            }
        }
        if (O0 != null && O0 != th) {
            proposedUpdate = new f0(O0, false, 2, null);
        }
        if (O0 != null) {
            if (A0(O0) || U0(O0)) {
                if (proposedUpdate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("違"));
                }
                ((f0) proposedUpdate).b();
            }
        }
        if (!f6) {
            m1(O0);
        }
        n1(proposedUpdate);
        androidx.concurrent.futures.d.a(f29026o, this, state, v2.g(proposedUpdate));
        D0(state, proposedUpdate);
        return proposedUpdate;
    }

    private final y J0(g2 state) {
        y yVar = state instanceof y ? (y) state : null;
        if (yVar != null) {
            return yVar;
        }
        z2 list = state.getList();
        if (list != null) {
            return i1(list);
        }
        return null;
    }

    private final Throwable N0(Object obj) {
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (f0Var != null) {
            return f0Var.cause;
        }
        return null;
    }

    private final Throwable O0(c state, List<? extends Throwable> exceptions) {
        Object obj;
        Object obj2 = null;
        if (exceptions.isEmpty()) {
            if (state.f()) {
                return new JobCancellationException(B0(), null, this);
            }
            return null;
        }
        Iterator<T> it = exceptions.iterator();
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
            Iterator<T> it2 = exceptions.iterator();
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

    private final z2 R0(g2 state) {
        z2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof s1) {
            return new z2();
        }
        if (state instanceof t2) {
            q1((t2) state);
            return null;
        }
        throw new IllegalStateException((ProtectedSandApp.s("遖") + state).toString());
    }

    private final boolean X0(g2 g2Var) {
        return (g2Var instanceof c) && ((c) g2Var).f();
    }

    private final boolean a1() {
        Object T0;
        do {
            T0 = T0();
            if (!(T0 instanceof g2)) {
                return false;
            }
        } while (v1(T0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b1(Continuation<? super kotlin.m2> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s sVar = new s(e6, 1);
        sVar.X();
        u.a(sVar, m0(new h3(sVar)));
        Object A = sVar.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : kotlin.m2.f23662a;
    }

    private final Void c1(q3.l<Object, kotlin.m2> block) {
        while (true) {
            block.N(T0());
        }
    }

    private final Object d1(Object cause) {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        kotlinx.coroutines.internal.r0 r0Var4;
        kotlinx.coroutines.internal.r0 r0Var5;
        kotlinx.coroutines.internal.r0 r0Var6;
        Throwable th = null;
        while (true) {
            Object T0 = T0();
            if (T0 instanceof c) {
                synchronized (T0) {
                    if (((c) T0).h()) {
                        r0Var2 = v2.f29047d;
                        return r0Var2;
                    }
                    boolean f6 = ((c) T0).f();
                    if (cause != null || !f6) {
                        if (th == null) {
                            th = F0(cause);
                        }
                        ((c) T0).a(th);
                    }
                    Throwable e6 = f6 ^ true ? ((c) T0).e() : null;
                    if (e6 != null) {
                        j1(((c) T0).getList(), e6);
                    }
                    r0Var = v2.f29044a;
                    return r0Var;
                }
            }
            if (!(T0 instanceof g2)) {
                r0Var3 = v2.f29047d;
                return r0Var3;
            }
            if (th == null) {
                th = F0(cause);
            }
            g2 g2Var = (g2) T0;
            if (!g2Var.getIsActive()) {
                Object C1 = C1(T0, new f0(th, false, 2, null));
                r0Var5 = v2.f29044a;
                if (C1 == r0Var5) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("遗"), T0));
                }
                r0Var6 = v2.f29046c;
                if (C1 != r0Var6) {
                    return C1;
                }
            } else if (B1(g2Var, th)) {
                r0Var4 = v2.f29044a;
                return r0Var4;
            }
        }
    }

    private final t2 g1(q3.l<? super Throwable, kotlin.m2> handler, boolean onCancelling) {
        t2 t2Var;
        if (onCancelling) {
            t2Var = handler instanceof o2 ? (o2) handler : null;
            if (t2Var == null) {
                t2Var = new l2(handler);
            }
        } else {
            t2Var = handler instanceof t2 ? (t2) handler : null;
            if (t2Var == null) {
                t2Var = new m2(handler);
            }
        }
        t2Var.b1(this);
        return t2Var;
    }

    private final y i1(kotlinx.coroutines.internal.y yVar) {
        while (yVar.P0()) {
            yVar = yVar.M0();
        }
        while (true) {
            yVar = yVar.L0();
            if (!yVar.P0()) {
                if (yVar instanceof y) {
                    return (y) yVar;
                }
                if (yVar instanceof z2) {
                    return null;
                }
            }
        }
    }

    private final void j1(z2 list, Throwable cause) {
        m1(cause);
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) list.K0(); !kotlin.jvm.internal.l0.g(yVar, list); yVar = yVar.L0()) {
            if (yVar instanceof o2) {
                t2 t2Var = (t2) yVar;
                try {
                    t2Var.Z0(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        kotlin.p.a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException(ProtectedSandApp.s("遘") + t2Var + ProtectedSandApp.s("遙") + this, th);
                        kotlin.m2 m2Var = kotlin.m2.f23662a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V0(completionHandlerException);
        }
        A0(cause);
    }

    private final void k1(z2 z2Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) z2Var.K0(); !kotlin.jvm.internal.l0.g(yVar, z2Var); yVar = yVar.L0()) {
            if (yVar instanceof t2) {
                t2 t2Var = (t2) yVar;
                try {
                    t2Var.Z0(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.p.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException(ProtectedSandApp.s("遚") + t2Var + ProtectedSandApp.s("遛") + this, th2);
                        kotlin.m2 m2Var = kotlin.m2.f23662a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V0(completionHandlerException);
        }
    }

    private final <T extends t2> void l1(z2 list, Throwable cause) {
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) list.K0(); !kotlin.jvm.internal.l0.g(yVar, list); yVar = yVar.L0()) {
            kotlin.jvm.internal.l0.P();
            if (yVar instanceof kotlinx.coroutines.internal.y) {
                t2 t2Var = (t2) yVar;
                try {
                    t2Var.Z0(cause);
                } catch (Throwable th) {
                    if (completionHandlerException != null) {
                        kotlin.p.a(completionHandlerException, th);
                    } else {
                        completionHandlerException = new CompletionHandlerException(ProtectedSandApp.s("遜") + t2Var + ProtectedSandApp.s("遝") + this, th);
                        kotlin.m2 m2Var = kotlin.m2.f23662a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            V0(completionHandlerException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.f2] */
    private final void p1(s1 state) {
        z2 z2Var = new z2();
        if (!state.getIsActive()) {
            z2Var = new f2(z2Var);
        }
        androidx.concurrent.futures.d.a(f29026o, this, state, z2Var);
    }

    private final boolean q0(Object expect, z2 list, t2 node) {
        int X0;
        d dVar = new d(node, this, expect);
        do {
            X0 = list.M0().X0(node, list, dVar);
            if (X0 == 1) {
                return true;
            }
        } while (X0 != 2);
        return false;
    }

    private final void q1(t2 state) {
        state.E0(new z2());
        androidx.concurrent.futures.d.a(f29026o, this, state, state.L0());
    }

    private final void r0(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th : exceptions) {
            if (th != rootCause && th != rootCause && !(th instanceof CancellationException) && newSetFromMap.add(th)) {
                kotlin.p.a(rootCause, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u0(Continuation<Object> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        a aVar = new a(e6, this);
        aVar.X();
        u.a(aVar, m0(new g3(aVar)));
        Object A = aVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }

    private final int v1(Object state) {
        s1 s1Var;
        if (!(state instanceof s1)) {
            if (!(state instanceof f2)) {
                return 0;
            }
            if (!androidx.concurrent.futures.d.a(f29026o, this, state, ((f2) state).getList())) {
                return -1;
            }
            o1();
            return 1;
        }
        if (((s1) state).getIsActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29026o;
        s1Var = v2.f29053j;
        if (!androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, state, s1Var)) {
            return -1;
        }
        o1();
        return 1;
    }

    private final String w1(Object state) {
        boolean z5 = state instanceof c;
        String s5 = ProtectedSandApp.s("遞");
        if (!z5) {
            return state instanceof g2 ? ((g2) state).getIsActive() ? s5 : ProtectedSandApp.s("遡") : state instanceof f0 ? ProtectedSandApp.s("遢") : ProtectedSandApp.s("遣");
        }
        c cVar = (c) state;
        return cVar.f() ? ProtectedSandApp.s("遟") : cVar.g() ? ProtectedSandApp.s("遠") : s5;
    }

    public static /* synthetic */ CancellationException y1(u2 u2Var, Throwable th, String str, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("遤"));
        }
        if ((i5 & 1) != 0) {
            str = null;
        }
        return u2Var.x1(th, str);
    }

    private final Object z0(Object cause) {
        kotlinx.coroutines.internal.r0 r0Var;
        Object C1;
        kotlinx.coroutines.internal.r0 r0Var2;
        do {
            Object T0 = T0();
            if (!(T0 instanceof g2) || ((T0 instanceof c) && ((c) T0).g())) {
                r0Var = v2.f29044a;
                return r0Var;
            }
            C1 = C1(T0, new f0(F0(cause), false, 2, null));
            r0Var2 = v2.f29046c;
        } while (C1 == r0Var2);
        return C1;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext B(@d5.d CoroutineContext coroutineContext) {
        return CoroutineContext.b.a.d(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @d5.d
    public String B0() {
        return ProtectedSandApp.s("遥");
    }

    public boolean C0(@d5.d Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return x0(cause) && getHandlesException();
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public final Sequence<n2> F() {
        Sequence<n2> b6;
        b6 = kotlin.sequences.q.b(new e(null));
        return b6;
    }

    @d5.e
    public final Throwable G() {
        Object T0 = T0();
        if (!(T0 instanceof g2)) {
            return N0(T0);
        }
        throw new IllegalStateException(ProtectedSandApp.s("遦").toString());
    }

    @d5.d
    public final JobCancellationException G0(@d5.e String message, @d5.e Throwable cause) {
        if (message == null) {
            message = B0();
        }
        return new JobCancellationException(message, cause, this);
    }

    @Override // kotlinx.coroutines.n2
    @d5.e
    public final Object H(@d5.d Continuation<? super kotlin.m2> continuation) {
        if (a1()) {
            Object b12 = b1(continuation);
            return b12 == CoroutineSingletons.COROUTINE_SUSPENDED ? b12 : kotlin.m2.f23662a;
        }
        s2.x(continuation.getContext());
        return kotlin.m2.f23662a;
    }

    @d5.e
    public final Object K0() {
        Object T0 = T0();
        if (!(!(T0 instanceof g2))) {
            throw new IllegalStateException(ProtectedSandApp.s("遧").toString());
        }
        if (T0 instanceof f0) {
            throw ((f0) T0).cause;
        }
        return v2.o(T0);
    }

    @d5.e
    protected final Throwable L0() {
        Object T0 = T0();
        boolean z5 = T0 instanceof c;
        String s5 = ProtectedSandApp.s("遨");
        if (z5) {
            Throwable e6 = ((c) T0).e();
            if (e6 != null) {
                return e6;
            }
            throw new IllegalStateException((s5 + this).toString());
        }
        if (T0 instanceof g2) {
            throw new IllegalStateException((s5 + this).toString());
        }
        if (T0 instanceof f0) {
            return ((f0) T0).cause;
        }
        return null;
    }

    protected final boolean M0() {
        Object T0 = T0();
        return (T0 instanceof f0) && ((f0) T0).a();
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public final CancellationException O() {
        Object T0 = T0();
        boolean z5 = T0 instanceof c;
        String s5 = ProtectedSandApp.s("適");
        if (!z5) {
            if (T0 instanceof g2) {
                throw new IllegalStateException((s5 + this).toString());
            }
            if (T0 instanceof f0) {
                return y1(this, ((f0) T0).cause, null, 1, null);
            }
            return new JobCancellationException(z0.a(this) + ProtectedSandApp.s("遫"), null, this);
        }
        Throwable e6 = ((c) T0).e();
        if (e6 != null) {
            CancellationException x12 = x1(e6, z0.a(this) + ProtectedSandApp.s("遪"));
            if (x12 != null) {
                return x12;
            }
        }
        throw new IllegalStateException((s5 + this).toString());
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public final p1 P(boolean onCancelling, boolean invokeImmediately, @d5.d q3.l<? super Throwable, kotlin.m2> handler) {
        t2 g12 = g1(handler, onCancelling);
        while (true) {
            Object T0 = T0();
            if (T0 instanceof s1) {
                s1 s1Var = (s1) T0;
                if (!s1Var.getIsActive()) {
                    p1(s1Var);
                } else if (androidx.concurrent.futures.d.a(f29026o, this, T0, g12)) {
                    return g12;
                }
            } else {
                if (!(T0 instanceof g2)) {
                    if (invokeImmediately) {
                        f0 f0Var = T0 instanceof f0 ? (f0) T0 : null;
                        handler.N(f0Var != null ? f0Var.cause : null);
                    }
                    return b3.f27276o;
                }
                z2 list = ((g2) T0).getList();
                if (list != null) {
                    p1 p1Var = b3.f27276o;
                    if (onCancelling && (T0 instanceof c)) {
                        synchronized (T0) {
                            r3 = ((c) T0).e();
                            if (r3 == null || ((handler instanceof y) && !((c) T0).g())) {
                                if (q0(T0, list, g12)) {
                                    if (r3 == null) {
                                        return g12;
                                    }
                                    p1Var = g12;
                                }
                            }
                            kotlin.m2 m2Var = kotlin.m2.f23662a;
                        }
                    }
                    if (r3 != null) {
                        if (invokeImmediately) {
                            handler.N(r3);
                        }
                        return p1Var;
                    }
                    if (q0(T0, list, g12)) {
                        return g12;
                    }
                } else {
                    if (T0 == null) {
                        throw new NullPointerException(ProtectedSandApp.s("遬"));
                    }
                    q1((t2) T0);
                }
            }
        }
    }

    /* renamed from: P0 */
    public boolean getHandlesException() {
        return true;
    }

    public boolean Q0() {
        return false;
    }

    @d5.e
    public final x S0() {
        return (x) this._parentHandle;
    }

    @d5.e
    public final Object T0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.j0)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.j0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.z
    public final void U(@d5.d e3 parentJob) {
        x0(parentJob);
    }

    protected boolean U0(@d5.d Throwable exception) {
        return false;
    }

    public void V0(@d5.d Throwable exception) {
        throw exception;
    }

    protected final void W0(@d5.e n2 parent) {
        if (parent == null) {
            u1(b3.f27276o);
            return;
        }
        parent.start();
        x p02 = parent.p0(this);
        u1(p02);
        if (m()) {
            p02.g();
            u1(b3.f27276o);
        }
    }

    public final boolean Y0() {
        return T0() instanceof f0;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @d5.d
    public n2 Z(@d5.d n2 n2Var) {
        return n2Var;
    }

    protected boolean Z0() {
        return false;
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable cause) {
        Throwable jobCancellationException;
        if (cause == null || (jobCancellationException = y1(this, cause, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(B0(), null, this);
        }
        y0(jobCancellationException);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.e
    public <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> cVar) {
        return (E) CoroutineContext.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext c(@d5.d CoroutineContext.c<?> cVar) {
        return CoroutineContext.b.a.c(this, cVar);
    }

    @Override // kotlinx.coroutines.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        e(null);
    }

    @Override // kotlinx.coroutines.n2
    public boolean d() {
        Object T0 = T0();
        return (T0 instanceof g2) && ((g2) T0).getIsActive();
    }

    @Override // kotlinx.coroutines.n2
    public void e(@d5.e CancellationException cause) {
        if (cause == null) {
            cause = new JobCancellationException(B0(), null, this);
        }
        y0(cause);
    }

    public final boolean e1(@d5.e Object proposedUpdate) {
        Object C1;
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        do {
            C1 = C1(T0(), proposedUpdate);
            r0Var = v2.f29044a;
            if (C1 == r0Var) {
                return false;
            }
            if (C1 == v2.f29045b) {
                return true;
            }
            r0Var2 = v2.f29046c;
        } while (C1 == r0Var2);
        s0(C1);
        return true;
    }

    @d5.e
    public final Object f1(@d5.e Object proposedUpdate) {
        Object C1;
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        do {
            C1 = C1(T0(), proposedUpdate);
            r0Var = v2.f29044a;
            if (C1 == r0Var) {
                throw new IllegalStateException(ProtectedSandApp.s("遭") + this + ProtectedSandApp.s("遮") + proposedUpdate, N0(proposedUpdate));
            }
            r0Var2 = v2.f29046c;
        } while (C1 == r0Var2);
        return C1;
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public final kotlinx.coroutines.selects.c g0() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    @d5.d
    public final CoroutineContext.c<?> getKey() {
        return n2.INSTANCE;
    }

    @d5.d
    public String h1() {
        return z0.a(this);
    }

    @Override // kotlinx.coroutines.n2
    public final boolean isCancelled() {
        Object T0 = T0();
        return (T0 instanceof f0) || ((T0 instanceof c) && ((c) T0).f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.e3
    @d5.d
    public CancellationException l0() {
        CancellationException cancellationException;
        Object T0 = T0();
        if (T0 instanceof c) {
            cancellationException = ((c) T0).e();
        } else if (T0 instanceof f0) {
            cancellationException = ((f0) T0).cause;
        } else {
            if (T0 instanceof g2) {
                throw new IllegalStateException(r.a(ProtectedSandApp.s("遰"), T0));
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException(ProtectedSandApp.s("遯") + w1(T0), cancellationException, this);
    }

    @Override // kotlinx.coroutines.n2
    public final boolean m() {
        return !(T0() instanceof g2);
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public final p1 m0(@d5.d q3.l<? super Throwable, kotlin.m2> handler) {
        return P(false, true, handler);
    }

    protected void m1(@d5.e Throwable cause) {
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <R> R n(R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
        return (R) CoroutineContext.b.a.a(this, r5, pVar);
    }

    protected void n1(@d5.e Object state) {
    }

    protected void o1() {
    }

    @Override // kotlinx.coroutines.n2
    @d5.d
    public final x p0(@d5.d z child) {
        return (x) n2.a.f(this, true, false, new y(child), 2, null);
    }

    public final <T, R> void r1(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> block) {
        Object T0;
        do {
            T0 = T0();
            if (select.C()) {
                return;
            }
            if (!(T0 instanceof g2)) {
                if (select.t()) {
                    if (T0 instanceof f0) {
                        select.j0(((f0) T0).cause);
                        return;
                    } else {
                        q4.b.d(block, v2.o(T0), select.L());
                        return;
                    }
                }
                return;
            }
        } while (v1(T0) != 0);
        select.t0(m0(new l3(select, block)));
    }

    protected void s0(@d5.e Object state) {
    }

    public final void s1(@d5.d t2 node) {
        Object T0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s1 s1Var;
        do {
            T0 = T0();
            if (!(T0 instanceof t2)) {
                if (!(T0 instanceof g2) || ((g2) T0).getList() == null) {
                    return;
                }
                node.S0();
                return;
            }
            if (T0 != node) {
                return;
            }
            atomicReferenceFieldUpdater = f29026o;
            s1Var = v2.f29053j;
        } while (!androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, T0, s1Var));
    }

    @Override // kotlinx.coroutines.n2
    public final boolean start() {
        int v12;
        do {
            v12 = v1(T0());
            if (v12 == 0) {
                return false;
            }
        } while (v12 != 1);
        return true;
    }

    @d5.e
    public final Object t0(@d5.d Continuation<Object> continuation) {
        Object T0;
        do {
            T0 = T0();
            if (!(T0 instanceof g2)) {
                if (T0 instanceof f0) {
                    throw ((f0) T0).cause;
                }
                return v2.o(T0);
            }
        } while (v1(T0) < 0);
        return u0(continuation);
    }

    public final <T, R> void t1(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> block) {
        Object T0 = T0();
        if (T0 instanceof f0) {
            select.j0(((f0) T0).cause);
        } else {
            q4.a.f(block, v2.o(T0), select.L(), null, 4, null);
        }
    }

    @d5.d
    public String toString() {
        return z1() + '@' + z0.b(this);
    }

    public final void u1(@d5.e x xVar) {
        this._parentHandle = xVar;
    }

    public final boolean w0(@d5.e Throwable cause) {
        return x0(cause);
    }

    @Override // kotlinx.coroutines.selects.c
    public final <R> void x(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.l<? super Continuation<? super R>, ? extends Object> block) {
        Object T0;
        do {
            T0 = T0();
            if (select.C()) {
                return;
            }
            if (!(T0 instanceof g2)) {
                if (select.t()) {
                    q4.b.c(block, select.L());
                    return;
                }
                return;
            }
        } while (v1(T0) != 0);
        select.t0(m0(new m3(select, block)));
    }

    public final boolean x0(@d5.e Object cause) {
        Object obj;
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        kotlinx.coroutines.internal.r0 r0Var3;
        obj = v2.f29044a;
        if (Q0() && (obj = z0(cause)) == v2.f29045b) {
            return true;
        }
        r0Var = v2.f29044a;
        if (obj == r0Var) {
            obj = d1(cause);
        }
        r0Var2 = v2.f29044a;
        if (obj == r0Var2 || obj == v2.f29045b) {
            return true;
        }
        r0Var3 = v2.f29047d;
        if (obj == r0Var3) {
            return false;
        }
        s0(obj);
        return true;
    }

    @d5.d
    protected final CancellationException x1(@d5.d Throwable th, @d5.e String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = B0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public void y0(@d5.d Throwable cause) {
        x0(cause);
    }

    @d5.d
    @i2
    public final String z1() {
        StringBuilder sb = new StringBuilder();
        sb.append(h1());
        sb.append('{');
        return c1.c.a(sb, w1(T0()), '}');
    }
}
