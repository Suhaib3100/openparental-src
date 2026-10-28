package kotlinx.coroutines.channels;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlin.x0;
import kotlin.z0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.y3;
import kotlinx.coroutines.z1;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003ú\u0001LB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJZ\u0010 \u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0082\b¢\u0006\u0004\b \u0010!JG\u0010%\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&JG\u0010'\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0011H\u0003¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010*J\u001b\u0010-\u001a\u00020#*\u00020\"2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.J1\u00100\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J)\u00102\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u0010\u0017J\u001d\u00103\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b3\u00104J@\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0011H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00101J&\u00107\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00104Jù\u0001\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u001082\b\u0010\u001c\u001a\u0004\u0018\u00010\"2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00010\u00052Q\u0010?\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u00010<2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2S\b\u0002\u0010@\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u00010<H\u0082\b¢\u0006\u0004\bA\u0010BJg\u0010C\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00152!\u0010;\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0082\b¢\u0006\u0004\bC\u0010DJ9\u0010E\u001a\u0004\u0018\u00010\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bE\u0010FJ9\u0010G\u001a\u0004\u0018\u00010\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bG\u0010FJ)\u0010H\u001a\u00020#*\u00020\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ-\u0010M\u001a\u00020#2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u00020#2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010NJ\u0019\u0010Q\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ#\u0010U\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010T\u001a\u0006\u0012\u0002\b\u00030SH\u0002¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00062\n\u0010T\u001a\u0006\u0012\u0002\b\u00030S2\b\u0010W\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b[\u0010\\J\u001b\u0010]\u001a\u00020\u00062\n\u0010T\u001a\u0006\u0012\u0002\b\u00030SH\u0002¢\u0006\u0004\b]\u0010^J%\u0010_\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b_\u0010ZJ%\u0010`\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b`\u0010ZJ%\u0010a\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\ba\u0010ZJ\u000f\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010KJ\u000f\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010KJ\u000f\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010KJ\u000f\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010KJ\u000f\u0010f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bf\u0010KJ\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010g\u001a\u00020\u0011H\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010RJ\u0015\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bk\u0010lJ\u001d\u0010n\u001a\u00020\u00112\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bn\u0010oJ\u001d\u0010p\u001a\u00020\u00062\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bp\u0010qJ%\u0010s\u001a\u00020\u00062\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010r\u001a\u00020\u0011H\u0002¢\u0006\u0004\bs\u0010tJ\u0013\u0010u\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bw\u0010vJ\u001b\u0010y\u001a\u00020\u0006*\u00020\u00152\u0006\u0010x\u001a\u00020#H\u0002¢\u0006\u0004\by\u0010zJ\u001f\u0010}\u001a\u00020#2\u0006\u0010{\u001a\u00020\u00112\u0006\u0010|\u001a\u00020#H\u0002¢\u0006\u0004\b}\u0010~J/\u0010\u0080\u0001\u001a\u00020#2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u007f\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0080\u0001\u0010NJ2\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\u00112\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J2\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\u00112\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J;\u0010\u0087\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\u00112\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0007\u0010\u0086\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J*\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00020\u00112\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008b\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008c\u0001\u0010RJ\u001a\u0010\u008d\u0001\u001a\u00020\u00062\u0007\u0010\u008b\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008d\u0001\u0010RJ\u001d\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008e\u0001\u0010\rJ)\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0006\u0010\u000b\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001d\u0010\u0091\u0001\u001a\u00020#2\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0005\b\u0091\u0001\u0010\rJñ\u0001\u0010\u0094\u0001\u001a\u00028\u0001\"\u0004\b\u0001\u001082\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2=\u0010?\u001a9\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0004\u0012\u00028\u00010\u0092\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2i\b\u0002\u0010@\u001ac\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u0093\u0001H\u0084\b¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0012\u0010\u0096\u0001\u001a\u00020#H\u0010¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0098\u0001\u0010KJ\u0011\u0010\u0099\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0099\u0001\u0010KJ\u0016\u0010\u009a\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J%\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009b\u0001J!\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010 \u0001\u001a\u00020\u00062\u0007\u0010\u009f\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b \u0001\u0010RJ\u0019\u0010¡\u0001\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u00020\u0011H\u0000¢\u0006\u0005\b¡\u0001\u0010RJ'\u0010¢\u0001\u001a\u00020\u00062\n\u0010T\u001a\u0006\u0012\u0002\b\u00030S2\b\u0010\u000b\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0005\b¢\u0001\u0010\\J\u001a\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000£\u0001H\u0096\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0011\u0010¦\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b¦\u0001\u0010KJ\u001e\u0010©\u0001\u001a\u00020#2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001c\u0010«\u0001\u001a\u00020#2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001¢\u0006\u0006\b«\u0001\u0010ª\u0001J\u000f\u0010¬\u0001\u001a\u00020\u0006¢\u0006\u0005\b¬\u0001\u0010KJ!\u0010L\u001a\u00020\u00062\u0011\u0010¨\u0001\u001a\f\u0018\u00010\u00ad\u0001j\u0005\u0018\u0001`®\u0001¢\u0006\u0005\bL\u0010¯\u0001J\u001e\u0010°\u0001\u001a\u00020#2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0010¢\u0006\u0006\b°\u0001\u0010ª\u0001J'\u0010±\u0001\u001a\u00020#2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00012\u0007\u0010¬\u0001\u001a\u00020#H\u0014¢\u0006\u0006\b±\u0001\u0010²\u0001J:\u0010´\u0001\u001a\u00020\u00062&\u0010³\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010§\u0001¢\u0006\r\b9\u0012\t\b:\u0012\u0005\b\b(¨\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0012\u0010¶\u0001\u001a\u00020#H\u0000¢\u0006\u0006\b¶\u0001\u0010\u0097\u0001J\u0013\u0010¸\u0001\u001a\u00030·\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0013\u0010º\u0001\u001a\u00030·\u0001H\u0000¢\u0006\u0006\bº\u0001\u0010¹\u0001J\u000f\u0010»\u0001\u001a\u00020\u0006¢\u0006\u0005\b»\u0001\u0010KR\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010»\u0001R0\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0083\u0001\u0010Ä\u0001\u001ag\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030S¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(T\u0012\u0016\u0012\u0014\u0018\u00010\"¢\u0006\r\b9\u0012\t\b:\u0012\u0005\b\b(¾\u0001\u0012\u0016\u0012\u0014\u0018\u00010\"¢\u0006\r\b9\u0012\t\b:\u0012\u0005\b\b(¿\u0001\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030§\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010<j\u0005\u0018\u0001`À\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÁ\u0001\u0010Â\u0001\u0012\u0005\bÃ\u0001\u0010KR\u0017\u0010Ç\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010É\u0001\u001a\u00020#8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010\u0097\u0001R0\u0010Í\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000Ê\u00018VX\u0096\u0004¢\u0006\u000e\u0012\u0005\bÌ\u0001\u0010K\u001a\u0005\b/\u0010Ë\u0001R%\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Î\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÑ\u0001\u0010K\u001a\u0006\bÏ\u0001\u0010Ð\u0001R.\u0010Õ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050Î\u00018VX\u0096\u0004ø\u0001\u0000¢\u0006\u000f\u0012\u0005\bÔ\u0001\u0010K\u001a\u0006\bÓ\u0001\u0010Ð\u0001R&\u0010×\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000Î\u00018VX\u0096\u0004¢\u0006\u000e\u0012\u0005\bÖ\u0001\u0010K\u001a\u0005\b8\u0010Ð\u0001R\u0018\u0010Ú\u0001\u001a\u00030§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u001e\u0010Ý\u0001\u001a\u00020#8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÜ\u0001\u0010K\u001a\u0006\bÛ\u0001\u0010\u0097\u0001R\u001a\u0010ß\u0001\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÞ\u0001\u0010*R\u001d\u0010|\u001a\u00020#8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bá\u0001\u0010K\u001a\u0006\bà\u0001\u0010\u0097\u0001R\u001a\u0010ã\u0001\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010*R\u001e\u0010ä\u0001\u001a\u00020#8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bå\u0001\u0010K\u001a\u0006\bä\u0001\u0010\u0097\u0001R\u0016\u0010r\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010Æ\u0001R\u0017\u0010è\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010Æ\u0001R\u001a\u0010ê\u0001\u001a\u0005\u0018\u00010§\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010Ù\u0001R\u0018\u0010ì\u0001\u001a\u00030§\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010Ù\u0001R\u0017\u0010î\u0001\u001a\u00020#8TX\u0094\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010\u0097\u0001R\u0015\u0010ð\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0ï\u00018\u0002X\u0082\u0004R\r\u0010ò\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004R\u0019\u0010ó\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0ï\u00018\u0002X\u0082\u0004R\u0015\u0010ô\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0ï\u00018\u0002X\u0082\u0004R\r\u0010õ\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004R\u0019\u0010ö\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0ï\u00018\u0002X\u0082\u0004R\r\u0010÷\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004R\u0019\u0010ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0ï\u00018\u0002X\u0082\u0004R\r\u0010ù\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006û\u0001"}, d2 = {"Lkotlinx/coroutines/channels/j;", "E", "Lkotlinx/coroutines/channels/l;", "", "capacity", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILld/l;)V", "element", "Q0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/q;", "segment", "index", "", "s", "t1", "(Lkotlinx/coroutines/channels/q;ILjava/lang/Object;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/y3;", "V0", "(Lkotlinx/coroutines/y3;Lkotlinx/coroutines/channels/q;I)V", "Lkotlinx/coroutines/p;", "cont", "R0", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)V", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "onClosed", "s1", "(Lkotlinx/coroutines/channels/q;ILjava/lang/Object;JLkotlinx/coroutines/y3;Lld/a;Lld/a;)V", "", "", "closed", "E1", "(Lkotlinx/coroutines/channels/q;ILjava/lang/Object;JLjava/lang/Object;Z)I", "F1", "curSendersAndCloseStatus", "u1", "(J)Z", "curSenders", "F", "x1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "g1", "(Lkotlinx/coroutines/channels/q;IJLkotlin/coroutines/d;)Ljava/lang/Object;", "U0", "N0", "(Lkotlinx/coroutines/p;)V", "Lkotlinx/coroutines/channels/p;", "c1", "M0", "R", "Lkotlin/r0;", "name", "onElementRetrieved", "Lkotlin/Function3;", "segm", "i", "onSuspend", "onNoWaiterSuspend", "d1", "(Ljava/lang/Object;Lld/l;Lld/q;Lld/a;Lld/q;)Ljava/lang/Object;", "f1", "(Lkotlinx/coroutines/channels/q;IJLkotlinx/coroutines/y3;Lld/l;Lld/a;)V", "C1", "(Lkotlinx/coroutines/channels/q;IJLjava/lang/Object;)Ljava/lang/Object;", "D1", "y1", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/q;I)Z", "W", "()V", "b", "A1", "(Lkotlinx/coroutines/channels/q;IJ)Z", "B1", "nAttempts", "s0", "(J)V", "Lkotlinx/coroutines/selects/m;", "select", "P0", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/m;)V", "ignoredParam", "selectResult", "Z0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "h1", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "O0", "(Lkotlinx/coroutines/selects/m;)V", "W0", "Y0", "X0", "u0", "J0", "I0", "H0", "O", "sendersCur", "N", "(J)Lkotlinx/coroutines/channels/q;", "L", "J", "()Lkotlinx/coroutines/channels/q;", "lastSegment", "G0", "(Lkotlinx/coroutines/channels/q;)J", "j1", "(Lkotlinx/coroutines/channels/q;)V", "sendersCounter", "H", "(Lkotlinx/coroutines/channels/q;J)V", "k1", "(Lkotlinx/coroutines/y3;)V", "l1", "receiver", "m1", "(Lkotlinx/coroutines/y3;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "w0", "(JZ)Z", "globalIndex", "v0", "id", "startFrom", "Z", "(JLkotlinx/coroutines/channels/q;)Lkotlinx/coroutines/channels/q;", "Y", "currentBufferEndCounter", "X", "(JLkotlinx/coroutines/channels/q;J)Lkotlinx/coroutines/channels/q;", "K0", "(JLkotlinx/coroutines/channels/q;)V", "value", "H1", "G1", "f0", "M", "(Ljava/lang/Object;)Ljava/lang/Object;", "o1", "Lkotlin/Function2;", "Lkotlin/Function4;", "q1", "(Ljava/lang/Object;Ljava/lang/Object;Lld/a;Lld/p;Lld/a;Lld/r;)Ljava/lang/Object;", "v1", "()Z", "T0", "S0", "a0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "V", "T", "()Ljava/lang/Object;", "globalCellIndex", "S", "I1", "i1", "Lkotlinx/coroutines/channels/n;", "iterator", "()Lkotlinx/coroutines/channels/n;", "L0", "", "cause", "b0", "(Ljava/lang/Throwable;)Z", "f", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "G", "K", "(Ljava/lang/Throwable;Z)Z", "handler", "d0", "(Lld/l;)V", "r0", "", "toString", "()Ljava/lang/String;", "w1", "I", "c", "Lld/l;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "d", "Lld/q;", "m0", "onUndeliveredElementReceiveCancellationConstructor", "e0", "()J", "bufferEndCounter", "D0", "isRendezvousOrUnlimited", "Lkotlinx/coroutines/selects/i;", "()Lkotlinx/coroutines/selects/i;", "l0", "onSend", "Lkotlinx/coroutines/selects/g;", "P", "()Lkotlinx/coroutines/selects/g;", "i0", "onReceive", "Q", "j0", "onReceiveCatching", "k0", "onReceiveOrNull", "n0", "()Ljava/lang/Throwable;", "receiveException", "g0", "z0", "isClosedForSend", "A0", "isClosedForSend0", "j", "x0", "y0", "isClosedForReceive0", "isEmpty", "C0", "q0", "o0", "receiversCounter", "h0", "closeCause", "p0", "sendException", "B0", "isConflatedDropOldest", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n220#5:3142\n221#5:3145\n220#5:3146\n221#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* loaded from: classes7.dex */
public class j<E> implements kotlinx.coroutines.channels.l<E> {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f79323e = AtomicLongFieldUpdater.newUpdater(j.class, ProtectedSandApp.s("薷\u0001"));

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f79324f = AtomicLongFieldUpdater.newUpdater(j.class, ProtectedSandApp.s("薸\u0001"));

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f79325g = AtomicLongFieldUpdater.newUpdater(j.class, ProtectedSandApp.s("薹\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final AtomicLongFieldUpdater f79326h = AtomicLongFieldUpdater.newUpdater(j.class, ProtectedSandApp.s("薺\u0001"));

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f79327i = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, ProtectedSandApp.s("薻\u0001"));

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f79328j = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, ProtectedSandApp.s("薼\u0001"));

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f79329k = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, ProtectedSandApp.s("薽\u0001"));

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f79330l = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, ProtectedSandApp.s("薾\u0001"));

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f79331m = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, ProtectedSandApp.s("薿\u0001"));

    @fg.m
    @kd.x
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    @kd.x
    private volatile long bufferEnd;

    @fg.m
    @kd.x
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final ld.l<E, k2> onUndeliveredElement;

    @fg.m
    @kd.x
    private volatile Object closeHandler;

    @kd.x
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.q<kotlinx.coroutines.selects.m<?>, Object, Object, ld.l<Throwable, k2>> onUndeliveredElementReceiveCancellationConstructor;

    @fg.m
    @kd.x
    private volatile Object receiveSegment;

    @kd.x
    private volatile long receivers;

    @fg.m
    @kd.x
    private volatile Object sendSegment;

    @kd.x
    private volatile long sendersAndCloseStatus;

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/j$a;", "Lkotlinx/coroutines/channels/n;", "Lkotlinx/coroutines/y3;", "<init>", "(Lkotlinx/coroutines/channels/j;)V", "", "i", "()Z", "Lkotlinx/coroutines/channels/q;", "segment", "", "index", "", "r", "h", "(Lkotlinx/coroutines/channels/q;IJLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k2;", "j", "()V", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/p0;", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "next", "()Ljava/lang/Object;", "element", "k", "(Ljava/lang/Object;)Z", "l", "", "b", "Ljava/lang/Object;", "receiveResult", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/q;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    private final class a implements kotlinx.coroutines.channels.n<E>, y3 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Object receiveResult;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private kotlinx.coroutines.q<? super Boolean> continuation;

        public a() {
            s0 s0Var;
            s0Var = kotlinx.coroutines.channels.k.f79387x;
            this.receiveResult = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object h(q<E> qVar, int i4, long j4, kotlin.coroutines.d<? super Boolean> dVar) {
            s0 s0Var;
            s0 s0Var2;
            Boolean bool;
            s0 s0Var3;
            s0 s0Var4;
            s0 s0Var5;
            j<E> jVar = j.this;
            kotlinx.coroutines.q<? super Boolean> b5 = kotlinx.coroutines.s.b(kotlin.coroutines.intrinsics.b.e(dVar));
            try {
                this.continuation = b5;
                Object C1 = jVar.C1(qVar, i4, j4, this);
                s0Var = kotlinx.coroutines.channels.k.f79378o;
                if (C1 == s0Var) {
                    jVar.U0(this, qVar, i4);
                } else {
                    s0Var2 = kotlinx.coroutines.channels.k.f79380q;
                    ld.l<Throwable, k2> lVar = null;
                    if (C1 == s0Var2) {
                        if (j4 < jVar.q0()) {
                            qVar.b();
                        }
                        q qVar2 = (q) j.f79328j.get(jVar);
                        while (true) {
                            if (jVar.j()) {
                                j();
                                break;
                            }
                            long andIncrement = j.f79324f.getAndIncrement(jVar);
                            int i5 = kotlinx.coroutines.channels.k.f79365b;
                            long j5 = andIncrement / i5;
                            int i6 = (int) (andIncrement % i5);
                            if (qVar2.id != j5) {
                                q Y = jVar.Y(j5, qVar2);
                                if (Y != null) {
                                    qVar2 = Y;
                                }
                            }
                            Object C12 = jVar.C1(qVar2, i6, andIncrement, this);
                            s0Var3 = kotlinx.coroutines.channels.k.f79378o;
                            if (C12 == s0Var3) {
                                jVar.U0(this, qVar2, i6);
                                break;
                            }
                            s0Var4 = kotlinx.coroutines.channels.k.f79380q;
                            if (C12 != s0Var4) {
                                s0Var5 = kotlinx.coroutines.channels.k.f79379p;
                                if (C12 == s0Var5) {
                                    throw new IllegalStateException(ProtectedSandApp.s("蘬\u0001"));
                                }
                                qVar2.b();
                                this.receiveResult = C12;
                                this.continuation = null;
                                bool = Boolean.TRUE;
                                ld.l<E, k2> lVar2 = jVar.onUndeliveredElement;
                                if (lVar2 != null) {
                                    lVar = j0.a(lVar2, C12, b5.getContext());
                                }
                            } else if (andIncrement < jVar.q0()) {
                                qVar2.b();
                            }
                        }
                    } else {
                        qVar.b();
                        this.receiveResult = C1;
                        this.continuation = null;
                        bool = Boolean.TRUE;
                        ld.l<E, k2> lVar3 = jVar.onUndeliveredElement;
                        if (lVar3 != null) {
                            lVar = j0.a(lVar3, C1, b5.getContext());
                        }
                    }
                    b5.W(bool, lVar);
                }
                Object y4 = b5.y();
                if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return y4;
            } catch (Throwable th) {
                b5.N();
                throw th;
            }
        }

        private final boolean i() {
            this.receiveResult = kotlinx.coroutines.channels.k.z();
            Throwable h02 = j.this.h0();
            if (h02 == null) {
                return false;
            }
            throw r0.o(h02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j() {
            kotlinx.coroutines.q<? super Boolean> qVar = this.continuation;
            l0.m(qVar);
            this.continuation = null;
            this.receiveResult = kotlinx.coroutines.channels.k.z();
            Throwable h02 = j.this.h0();
            if (h02 == null) {
                z0.Companion companion = z0.INSTANCE;
                qVar.resumeWith(Boolean.FALSE);
            } else {
                z0.Companion companion2 = z0.INSTANCE;
                qVar.resumeWith(a1.a(h02));
            }
        }

        @Override // kotlinx.coroutines.y3
        public void a(@fg.l p0<?> segment, int index) {
            kotlinx.coroutines.q<? super Boolean> qVar = this.continuation;
            if (qVar != null) {
                qVar.a(segment, index);
            }
        }

        @Override // kotlinx.coroutines.channels.n
        @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @kd.i(name = "next")
        public /* synthetic */ Object b(kotlin.coroutines.d dVar) {
            return n.a.a(this, dVar);
        }

        @Override // kotlinx.coroutines.channels.n
        @fg.m
        public Object c(@fg.l kotlin.coroutines.d<? super Boolean> dVar) {
            q<E> qVar;
            s0 s0Var;
            s0 s0Var2;
            s0 s0Var3;
            j<E> jVar = j.this;
            q<E> qVar2 = (q) j.f79328j.get(jVar);
            while (!jVar.j()) {
                long andIncrement = j.f79324f.getAndIncrement(jVar);
                int i4 = kotlinx.coroutines.channels.k.f79365b;
                long j4 = andIncrement / i4;
                int i5 = (int) (andIncrement % i4);
                if (qVar2.id != j4) {
                    q<E> Y = jVar.Y(j4, qVar2);
                    if (Y == null) {
                        continue;
                    } else {
                        qVar = Y;
                    }
                } else {
                    qVar = qVar2;
                }
                Object C1 = jVar.C1(qVar, i5, andIncrement, null);
                s0Var = kotlinx.coroutines.channels.k.f79378o;
                if (C1 == s0Var) {
                    throw new IllegalStateException(ProtectedSandApp.s("蘭\u0001"));
                }
                s0Var2 = kotlinx.coroutines.channels.k.f79380q;
                if (C1 != s0Var2) {
                    s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                    if (C1 == s0Var3) {
                        return h(qVar, i5, andIncrement, dVar);
                    }
                    qVar.b();
                    this.receiveResult = C1;
                    return Boolean.TRUE;
                }
                if (andIncrement < jVar.q0()) {
                    qVar.b();
                }
                qVar2 = qVar;
            }
            return Boolean.valueOf(i());
        }

        public final boolean k(E element) {
            boolean F;
            kotlinx.coroutines.q<? super Boolean> qVar = this.continuation;
            l0.m(qVar);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            ld.l<E, k2> lVar = j.this.onUndeliveredElement;
            F = kotlinx.coroutines.channels.k.F(qVar, bool, lVar != null ? j0.a(lVar, element, qVar.getContext()) : null);
            return F;
        }

        public final void l() {
            kotlinx.coroutines.q<? super Boolean> qVar = this.continuation;
            l0.m(qVar);
            this.continuation = null;
            this.receiveResult = kotlinx.coroutines.channels.k.z();
            Throwable h02 = j.this.h0();
            if (h02 == null) {
                z0.Companion companion = z0.INSTANCE;
                qVar.resumeWith(Boolean.FALSE);
            } else {
                z0.Companion companion2 = z0.INSTANCE;
                qVar.resumeWith(a1.a(h02));
            }
        }

        @Override // kotlinx.coroutines.channels.n
        public E next() {
            s0 s0Var;
            s0 s0Var2;
            E e4 = (E) this.receiveResult;
            s0Var = kotlinx.coroutines.channels.k.f79387x;
            if (e4 == s0Var) {
                throw new IllegalStateException(ProtectedSandApp.s("蘮\u0001"));
            }
            s0Var2 = kotlinx.coroutines.channels.k.f79387x;
            this.receiveResult = s0Var2;
            if (e4 != kotlinx.coroutines.channels.k.z()) {
                return e4;
            }
            throw r0.o(j.this.n0());
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/j$b;", "Lkotlinx/coroutines/y3;", "Lkotlinx/coroutines/p;", "", "cont", "<init>", "(Lkotlinx/coroutines/p;)V", "Lkotlinx/coroutines/internal/p0;", "segment", "", "index", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "b", "Lkotlinx/coroutines/p;", "()Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements y3 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.p<Boolean> cont;

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ kotlinx.coroutines.q<Boolean> f79339c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@fg.l kotlinx.coroutines.p<? super Boolean> pVar) {
            this.cont = pVar;
            l0.n(pVar, ProtectedSandApp.s("蘯\u0001"));
            this.f79339c = (kotlinx.coroutines.q) pVar;
        }

        @Override // kotlinx.coroutines.y3
        public void a(@fg.l p0<?> segment, int index) {
            this.f79339c.a(segment, index);
        }

        @fg.l
        public final kotlinx.coroutines.p<Boolean> b() {
            return this.cont;
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends kotlin.jvm.internal.h0 implements ld.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final c f79340d = new c();

        c() {
            super(3, j.class, ProtectedSandApp.s("蘱\u0001"), ProtectedSandApp.s("蘰\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            jVar.h1(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@fg.l j<?> jVar, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            jVar.h1(mVar, obj);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class d extends kotlin.jvm.internal.h0 implements ld.q<j<?>, Object, Object, Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f79341d = new d();

        d() {
            super(3, j.class, ProtectedSandApp.s("蘳\u0001"), ProtectedSandApp.s("蘲\u0001"), 0);
        }

        @Override // ld.q
        public Object R(j<?> jVar, Object obj, Object obj2) {
            return jVar.W0(obj, obj2);
        }

        @fg.m
        public final Object Z(@fg.l j<?> jVar, @fg.m Object obj, @fg.m Object obj2) {
            return jVar.W0(obj, obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class e extends kotlin.jvm.internal.h0 implements ld.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final e f79342d = new e();

        e() {
            super(3, j.class, ProtectedSandApp.s("蘵\u0001"), ProtectedSandApp.s("蘴\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            jVar.h1(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@fg.l j<?> jVar, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            jVar.h1(mVar, obj);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class f extends kotlin.jvm.internal.h0 implements ld.q<j<?>, Object, Object, Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final f f79343d = new f();

        f() {
            super(3, j.class, ProtectedSandApp.s("蘷\u0001"), ProtectedSandApp.s("蘶\u0001"), 0);
        }

        @Override // ld.q
        public Object R(j<?> jVar, Object obj, Object obj2) {
            return jVar.X0(obj, obj2);
        }

        @fg.m
        public final Object Z(@fg.l j<?> jVar, @fg.m Object obj, @fg.m Object obj2) {
            return jVar.X0(obj, obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class g extends kotlin.jvm.internal.h0 implements ld.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final g f79344d = new g();

        g() {
            super(3, j.class, ProtectedSandApp.s("蘹\u0001"), ProtectedSandApp.s("蘸\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            jVar.h1(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@fg.l j<?> jVar, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            jVar.h1(mVar, obj);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class h extends kotlin.jvm.internal.h0 implements ld.q<j<?>, Object, Object, Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final h f79345d = new h();

        h() {
            super(3, j.class, ProtectedSandApp.s("蘻\u0001"), ProtectedSandApp.s("蘺\u0001"), 0);
        }

        @Override // ld.q
        public Object R(j<?> jVar, Object obj, Object obj2) {
            return jVar.Y0(obj, obj2);
        }

        @fg.m
        public final Object Z(@fg.l j<?> jVar, @fg.m Object obj, @fg.m Object obj2) {
            return jVar.Y0(obj, obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class i extends kotlin.jvm.internal.h0 implements ld.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final i f79346d = new i();

        i() {
            super(3, j.class, ProtectedSandApp.s("蘽\u0001"), ProtectedSandApp.s("蘼\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            jVar.i1(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@fg.l j<?> jVar, @fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj) {
            jVar.i1(mVar, obj);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.j$j, reason: collision with other inner class name */
    /* synthetic */ class C1216j extends kotlin.jvm.internal.h0 implements ld.q<j<?>, Object, Object, Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final C1216j f79347d = new C1216j();

        C1216j() {
            super(3, j.class, ProtectedSandApp.s("蘿\u0001"), ProtectedSandApp.s("蘾\u0001"), 0);
        }

        @Override // ld.q
        public Object R(j<?> jVar, Object obj, Object obj2) {
            return jVar.Z0(obj, obj2);
        }

        @fg.m
        public final Object Z(@fg.l j<?> jVar, @fg.m Object obj, @fg.m Object obj2) {
            return jVar.Z0(obj, obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"E", "Lkotlinx/coroutines/selects/m;", "select", "", "<anonymous parameter 1>", "element", "Lkotlin/Function1;", "", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lld/l;"}, k = 3, mv = {1, 8, 0})
    static final class k extends n0 implements ld.q<kotlinx.coroutines.selects.m<?>, Object, Object, ld.l<? super Throwable, ? extends k2>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<E> f79348b;

        /* compiled from: BufferedChannel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<Throwable, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f79349b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<E> f79350c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.selects.m<?> f79351d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, j<E> jVar, kotlinx.coroutines.selects.m<?> mVar) {
                super(1);
                this.f79349b = obj;
                this.f79350c = jVar;
                this.f79351d = mVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
                invoke2(th);
                return k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.l Throwable th) {
                if (this.f79349b != kotlinx.coroutines.channels.k.z()) {
                    j0.b(this.f79350c.onUndeliveredElement, this.f79349b, this.f79351d.getContext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(j<E> jVar) {
            super(3);
            this.f79348b = jVar;
        }

        @Override // ld.q
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ld.l<Throwable, k2> R(@fg.l kotlinx.coroutines.selects.m<?> mVar, @fg.m Object obj, @fg.m Object obj2) {
            return new a(obj2, this.f79348b, mVar);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f79352b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<E> f79353c;

        /* renamed from: d, reason: collision with root package name */
        int f79354d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(j<E> jVar, kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
            this.f79353c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79352b = obj;
            this.f79354d |= Integer.MIN_VALUE;
            Object b12 = j.b1(this.f79353c, this);
            return b12 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? b12 : p.b(b12);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79355b;

        /* renamed from: c, reason: collision with root package name */
        Object f79356c;

        /* renamed from: d, reason: collision with root package name */
        int f79357d;

        /* renamed from: e, reason: collision with root package name */
        long f79358e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79359f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j<E> f79360g;

        /* renamed from: h, reason: collision with root package name */
        int f79361h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(j<E> jVar, kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
            this.f79360g = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79359f = obj;
            this.f79361h |= Integer.MIN_VALUE;
            Object c12 = this.f79360g.c1(null, 0, 0L, this);
            return c12 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? c12 : p.b(c12);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"R", "E", "Lkotlinx/coroutines/channels/q;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "a", "(Lkotlinx/coroutines/channels/q;IJ)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n*L\n1#1,3055:1\n*E\n"})
    public static final class n extends n0 implements ld.q {

        /* renamed from: b, reason: collision with root package name */
        public static final n f79362b = new n(3);

        public n() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(Object obj, Object obj2, Object obj3) {
            return a((q) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }

        @fg.l
        public final Void a(@fg.l q<E> qVar, int i4, long j4) {
            throw new IllegalStateException(ProtectedSandApp.s("虀\u0001"));
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"R", "E", "Lkotlinx/coroutines/channels/q;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "", "a", "(Lkotlinx/coroutines/channels/q;ILjava/lang/Object;J)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,3055:1\n*E\n"})
    public static final class o extends n0 implements ld.r {

        /* renamed from: b, reason: collision with root package name */
        public static final o f79363b = new o(4);

        public o() {
            super(4);
        }

        @fg.l
        public final Void a(@fg.l q<E> qVar, int i4, E e4, long j4) {
            throw new IllegalStateException(ProtectedSandApp.s("虁\u0001"));
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((q) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(int i4, @fg.m ld.l<? super E, k2> lVar) {
        long E;
        s0 s0Var;
        this.capacity = i4;
        this.onUndeliveredElement = lVar;
        if (i4 < 0) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("藁\u0001"), i4, ProtectedSandApp.s("藂\u0001")).toString());
        }
        E = kotlinx.coroutines.channels.k.E(i4);
        this.bufferEnd = E;
        this.completedExpandBuffersAndPauseFlag = f79325g.get(this);
        q qVar = new q(0L, null, this, 3);
        this.sendSegment = qVar;
        this.receiveSegment = qVar;
        if (D0()) {
            qVar = kotlinx.coroutines.channels.k.f79364a;
            l0.n(qVar, ProtectedSandApp.s("藀\u0001"));
        }
        this.bufferEndSegment = qVar;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != 0 ? new k(this) : null;
        s0Var = kotlinx.coroutines.channels.k.A;
        this._closeCause = s0Var;
    }

    private final boolean A0(long j4) {
        return w0(j4, false);
    }

    private final boolean A1(q<E> segment, int index, long b5) {
        s0 s0Var;
        s0 s0Var2;
        Object y4 = segment.y(index);
        if ((y4 instanceof y3) && b5 >= f79324f.get(this)) {
            s0Var = kotlinx.coroutines.channels.k.f79372i;
            if (segment.t(index, y4, s0Var)) {
                if (y1(y4, segment, index)) {
                    segment.C(index, kotlinx.coroutines.channels.k.f79369f);
                    return true;
                }
                s0Var2 = kotlinx.coroutines.channels.k.f79375l;
                segment.C(index, s0Var2);
                segment.z(index, false);
                return false;
            }
        }
        return B1(segment, index, b5);
    }

    private final boolean B1(q<E> segment, int index, long b5) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        s0 s0Var6;
        s0 s0Var7;
        s0 s0Var8;
        while (true) {
            Object y4 = segment.y(index);
            if (!(y4 instanceof y3)) {
                s0Var3 = kotlinx.coroutines.channels.k.f79375l;
                if (y4 != s0Var3) {
                    if (y4 != null) {
                        if (y4 != kotlinx.coroutines.channels.k.f79369f) {
                            s0Var5 = kotlinx.coroutines.channels.k.f79373j;
                            if (y4 == s0Var5) {
                                break;
                            }
                            s0Var6 = kotlinx.coroutines.channels.k.f79374k;
                            if (y4 == s0Var6) {
                                break;
                            }
                            s0Var7 = kotlinx.coroutines.channels.k.f79376m;
                            if (y4 == s0Var7 || y4 == kotlinx.coroutines.channels.k.z()) {
                                return true;
                            }
                            s0Var8 = kotlinx.coroutines.channels.k.f79371h;
                            if (y4 != s0Var8) {
                                throw new IllegalStateException((ProtectedSandApp.s("藃\u0001") + y4).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        s0Var4 = kotlinx.coroutines.channels.k.f79370g;
                        if (segment.t(index, y4, s0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (b5 >= f79324f.get(this)) {
                s0Var = kotlinx.coroutines.channels.k.f79372i;
                if (segment.t(index, y4, s0Var)) {
                    if (y1(y4, segment, index)) {
                        segment.C(index, kotlinx.coroutines.channels.k.f79369f);
                        return true;
                    }
                    s0Var2 = kotlinx.coroutines.channels.k.f79375l;
                    segment.C(index, s0Var2);
                    segment.z(index, false);
                    return false;
                }
            } else if (segment.t(index, y4, new h0((y3) y4))) {
                return true;
            }
        }
    }

    @z1
    public static /* synthetic */ void C0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C1(q<E> segment, int index, long r4, Object waiter) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        Object y4 = segment.y(index);
        if (y4 == null) {
            if (r4 >= (f79323e.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                    return s0Var3;
                }
                if (segment.t(index, y4, waiter)) {
                    W();
                    s0Var2 = kotlinx.coroutines.channels.k.f79378o;
                    return s0Var2;
                }
            }
        } else if (y4 == kotlinx.coroutines.channels.k.f79369f) {
            s0Var = kotlinx.coroutines.channels.k.f79374k;
            if (segment.t(index, y4, s0Var)) {
                W();
                return segment.A(index);
            }
        }
        return D1(segment, index, r4, waiter);
    }

    private final boolean D0() {
        long j4 = f79325g.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    private final Object D1(q<E> segment, int index, long r4, Object waiter) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        s0 s0Var6;
        s0 s0Var7;
        s0 s0Var8;
        s0 s0Var9;
        s0 s0Var10;
        s0 s0Var11;
        s0 s0Var12;
        s0 s0Var13;
        s0 s0Var14;
        s0 s0Var15;
        s0 s0Var16;
        while (true) {
            Object y4 = segment.y(index);
            if (y4 != null) {
                s0Var5 = kotlinx.coroutines.channels.k.f79370g;
                if (y4 != s0Var5) {
                    if (y4 == kotlinx.coroutines.channels.k.f79369f) {
                        s0Var6 = kotlinx.coroutines.channels.k.f79374k;
                        if (segment.t(index, y4, s0Var6)) {
                            W();
                            return segment.A(index);
                        }
                    } else {
                        s0Var7 = kotlinx.coroutines.channels.k.f79375l;
                        if (y4 == s0Var7) {
                            s0Var8 = kotlinx.coroutines.channels.k.f79380q;
                            return s0Var8;
                        }
                        s0Var9 = kotlinx.coroutines.channels.k.f79373j;
                        if (y4 == s0Var9) {
                            s0Var10 = kotlinx.coroutines.channels.k.f79380q;
                            return s0Var10;
                        }
                        if (y4 == kotlinx.coroutines.channels.k.z()) {
                            W();
                            s0Var11 = kotlinx.coroutines.channels.k.f79380q;
                            return s0Var11;
                        }
                        s0Var12 = kotlinx.coroutines.channels.k.f79372i;
                        if (y4 != s0Var12) {
                            s0Var13 = kotlinx.coroutines.channels.k.f79371h;
                            if (segment.t(index, y4, s0Var13)) {
                                boolean z4 = y4 instanceof h0;
                                if (z4) {
                                    y4 = ((h0) y4).waiter;
                                }
                                if (y1(y4, segment, index)) {
                                    s0Var16 = kotlinx.coroutines.channels.k.f79374k;
                                    segment.C(index, s0Var16);
                                    W();
                                    return segment.A(index);
                                }
                                s0Var14 = kotlinx.coroutines.channels.k.f79375l;
                                segment.C(index, s0Var14);
                                segment.z(index, false);
                                if (z4) {
                                    W();
                                }
                                s0Var15 = kotlinx.coroutines.channels.k.f79380q;
                                return s0Var15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (r4 < (f79323e.get(this) & 1152921504606846975L)) {
                s0Var = kotlinx.coroutines.channels.k.f79373j;
                if (segment.t(index, y4, s0Var)) {
                    W();
                    s0Var2 = kotlinx.coroutines.channels.k.f79380q;
                    return s0Var2;
                }
            } else {
                if (waiter == null) {
                    s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                    return s0Var3;
                }
                if (segment.t(index, y4, waiter)) {
                    W();
                    s0Var4 = kotlinx.coroutines.channels.k.f79378o;
                    return s0Var4;
                }
            }
        }
    }

    private final void E0(AtomicLongFieldUpdater atomicLongFieldUpdater, ld.l<? super Long, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E1(q<E> segment, int index, E element, long s4, Object waiter, boolean closed) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        segment.D(index, element);
        if (closed) {
            return F1(segment, index, element, s4, waiter, closed);
        }
        Object y4 = segment.y(index);
        if (y4 == null) {
            if (F(s4)) {
                if (segment.t(index, null, kotlinx.coroutines.channels.k.f79369f)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.t(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (y4 instanceof y3) {
            segment.u(index);
            if (x1(y4, element)) {
                s0Var3 = kotlinx.coroutines.channels.k.f79374k;
                segment.C(index, s0Var3);
                S0();
                return 0;
            }
            s0Var = kotlinx.coroutines.channels.k.f79376m;
            Object v4 = segment.v(index, s0Var);
            s0Var2 = kotlinx.coroutines.channels.k.f79376m;
            if (v4 != s0Var2) {
                segment.z(index, true);
            }
            return 5;
        }
        return F1(segment, index, element, s4, waiter, closed);
    }

    private final boolean F(long curSenders) {
        return curSenders < f79325g.get(this) || curSenders < f79324f.get(this) + ((long) this.capacity);
    }

    private final void F0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final int F1(q<E> segment, int index, E element, long s4, Object waiter, boolean closed) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        s0 s0Var6;
        s0 s0Var7;
        while (true) {
            Object y4 = segment.y(index);
            if (y4 != null) {
                s0Var2 = kotlinx.coroutines.channels.k.f79370g;
                if (y4 != s0Var2) {
                    s0Var3 = kotlinx.coroutines.channels.k.f79376m;
                    if (y4 == s0Var3) {
                        segment.u(index);
                        return 5;
                    }
                    s0Var4 = kotlinx.coroutines.channels.k.f79373j;
                    if (y4 == s0Var4) {
                        segment.u(index);
                        return 5;
                    }
                    if (y4 == kotlinx.coroutines.channels.k.z()) {
                        segment.u(index);
                        g0();
                        return 4;
                    }
                    segment.u(index);
                    if (y4 instanceof h0) {
                        y4 = ((h0) y4).waiter;
                    }
                    if (x1(y4, element)) {
                        s0Var7 = kotlinx.coroutines.channels.k.f79374k;
                        segment.C(index, s0Var7);
                        S0();
                        return 0;
                    }
                    s0Var5 = kotlinx.coroutines.channels.k.f79376m;
                    Object v4 = segment.v(index, s0Var5);
                    s0Var6 = kotlinx.coroutines.channels.k.f79376m;
                    if (v4 != s0Var6) {
                        segment.z(index, true);
                    }
                    return 5;
                }
                if (segment.t(index, y4, kotlinx.coroutines.channels.k.f79369f)) {
                    return 1;
                }
            } else if (!F(s4) || closed) {
                if (closed) {
                    s0Var = kotlinx.coroutines.channels.k.f79375l;
                    if (segment.t(index, null, s0Var)) {
                        segment.z(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.t(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (segment.t(index, null, kotlinx.coroutines.channels.k.f79369f)) {
                return 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        r8 = (kotlinx.coroutines.channels.q) r8.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long G0(kotlinx.coroutines.channels.q<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.k.f79365b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3e
            long r3 = r8.id
            int r5 = kotlinx.coroutines.channels.k.f79365b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.channels.j.f79324f
            long r5 = r5.get(r7)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1c
            return r1
        L1c:
            java.lang.Object r1 = r8.y(r0)
            if (r1 == 0) goto L2e
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.k()
            if (r1 != r2) goto L29
            goto L2e
        L29:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.f79369f
            if (r1 != r2) goto L3b
            return r3
        L2e:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.z()
            boolean r1 = r8.t(r0, r1, r2)
            if (r1 == 0) goto L1c
            r8.r()
        L3b:
            int r0 = r0 + (-1)
            goto L4
        L3e:
            kotlinx.coroutines.internal.g r8 = r8.g()
            kotlinx.coroutines.channels.q r8 = (kotlinx.coroutines.channels.q) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.G0(kotlinx.coroutines.channels.q):long");
    }

    private final void G1(long value) {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f79324f;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= value) {
                return;
            }
        } while (!f79324f.compareAndSet(this, j4, value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void H(q<E> lastSegment, long sendersCounter) {
        s0 s0Var;
        Object c5 = kotlinx.coroutines.internal.q.c(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i4 = kotlinx.coroutines.channels.k.f79365b - 1; -1 < i4; i4--) {
                if ((lastSegment.id * kotlinx.coroutines.channels.k.f79365b) + i4 < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object y4 = lastSegment.y(i4);
                    if (y4 != null) {
                        s0Var = kotlinx.coroutines.channels.k.f79370g;
                        if (y4 != s0Var) {
                            if (!(y4 instanceof h0)) {
                                if (!(y4 instanceof y3)) {
                                    break;
                                }
                                if (lastSegment.t(i4, y4, kotlinx.coroutines.channels.k.z())) {
                                    c5 = kotlinx.coroutines.internal.q.h(c5, y4);
                                    lastSegment.z(i4, true);
                                    break;
                                }
                            } else {
                                if (lastSegment.t(i4, y4, kotlinx.coroutines.channels.k.z())) {
                                    c5 = kotlinx.coroutines.internal.q.h(c5, ((h0) y4).waiter);
                                    lastSegment.z(i4, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (lastSegment.t(i4, y4, kotlinx.coroutines.channels.k.z())) {
                        lastSegment.r();
                        break;
                    }
                }
            }
            lastSegment = (q) lastSegment.g();
        }
        if (c5 != null) {
            if (!(c5 instanceof ArrayList)) {
                m1((y3) c5, true);
                return;
            }
            l0.n(c5, ProtectedSandApp.s("藄\u0001"));
            ArrayList arrayList = (ArrayList) c5;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m1((y3) arrayList.get(size), true);
            }
        }
    }

    private final void H0() {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f79323e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                return;
            } else {
                w4 = kotlinx.coroutines.channels.k.w(1152921504606846975L & j4, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, w4));
    }

    private final void H1(long value) {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f79323e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            long j5 = 1152921504606846975L & j4;
            if (j5 >= value) {
                return;
            } else {
                w4 = kotlinx.coroutines.channels.k.w(j5, (int) (j4 >> 60));
            }
        } while (!f79323e.compareAndSet(this, j4, w4));
    }

    private final void I0() {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f79323e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            w4 = kotlinx.coroutines.channels.k.w(1152921504606846975L & j4, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, w4));
    }

    private final q<E> J() {
        Object obj = f79329k.get(this);
        q qVar = (q) f79327i.get(this);
        if (qVar.id > ((q) obj).id) {
            obj = qVar;
        }
        q qVar2 = (q) f79328j.get(this);
        if (qVar2.id > ((q) obj).id) {
            obj = qVar2;
        }
        return (q) kotlinx.coroutines.internal.f.d((kotlinx.coroutines.internal.g) obj);
    }

    private final void J0() {
        long j4;
        long w4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f79323e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (j4 >> 60);
            if (i4 == 0) {
                w4 = kotlinx.coroutines.channels.k.w(j4 & 1152921504606846975L, 2);
            } else if (i4 != 1) {
                return;
            } else {
                w4 = kotlinx.coroutines.channels.k.w(j4 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, w4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void K0(long r5, kotlinx.coroutines.channels.q<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.g r0 = r7.e()
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.q) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.g r5 = r7.e()
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.q) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.channels.j.f79329k
        L24:
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.p0 r6 = (kotlinx.coroutines.internal.p0) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.s()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.c.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.o()
            if (r5 == 0) goto L49
            r6.l()
        L49:
            return
        L4a:
            boolean r6 = r7.o()
            if (r6 == 0) goto L24
            r7.l()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.K0(long, kotlinx.coroutines.channels.q):void");
    }

    private final void L(long sendersCur) {
        j1(N(sendersCur));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(kotlinx.coroutines.p<? super p<? extends E>> cont) {
        z0.Companion companion = z0.INSTANCE;
        cont.resumeWith(p.b(p.INSTANCE.a(h0())));
    }

    private final q<E> N(long sendersCur) {
        q<E> J = J();
        if (B0()) {
            long G0 = G0(J);
            if (G0 != -1) {
                S(G0);
            }
        }
        H(J, sendersCur);
        return J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(kotlinx.coroutines.p<? super E> cont) {
        z0.Companion companion = z0.INSTANCE;
        cont.resumeWith(a1.a(n0()));
    }

    private final void O() {
        g0();
    }

    private final void O0(kotlinx.coroutines.selects.m<?> select) {
        select.d(kotlinx.coroutines.channels.k.z());
    }

    private final void P0(E element, kotlinx.coroutines.selects.m<?> select) {
        ld.l<E, k2> lVar = this.onUndeliveredElement;
        if (lVar != null) {
            j0.b(lVar, element, select.getContext());
        }
        select.d(kotlinx.coroutines.channels.k.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q0(E e4, kotlin.coroutines.d<? super k2> dVar) {
        UndeliveredElementException d5;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        ld.l<E, k2> lVar = this.onUndeliveredElement;
        if (lVar == null || (d5 = j0.d(lVar, e4, null, 2, null)) == null) {
            Throwable p02 = p0();
            z0.Companion companion = z0.INSTANCE;
            qVar.resumeWith(a1.a(p02));
        } else {
            kotlin.o.a(d5, p0());
            z0.Companion companion2 = z0.INSTANCE;
            qVar.resumeWith(a1.a(d5));
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar ? y4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(E element, kotlinx.coroutines.p<? super k2> cont) {
        ld.l<E, k2> lVar = this.onUndeliveredElement;
        if (lVar != null) {
            j0.b(lVar, element, cont.getContext());
        }
        Throwable p02 = p0();
        z0.Companion companion = z0.INSTANCE;
        cont.resumeWith(a1.a(p02));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(y3 y3Var, q<E> qVar, int i4) {
        T0();
        y3Var.a(qVar, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(y3 y3Var, q<E> qVar, int i4) {
        y3Var.a(qVar, i4 + kotlinx.coroutines.channels.k.f79365b);
    }

    private final void W() {
        if (D0()) {
            return;
        }
        q<E> qVar = (q) f79329k.get(this);
        while (true) {
            long andIncrement = f79325g.getAndIncrement(this);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j4 = andIncrement / i4;
            if (q0() <= andIncrement) {
                if (qVar.id < j4 && qVar.e() != 0) {
                    K0(j4, qVar);
                }
                t0(this, 0L, 1, null);
                return;
            }
            if (qVar.id != j4) {
                q<E> X = X(j4, qVar, andIncrement);
                if (X == null) {
                    continue;
                } else {
                    qVar = X;
                }
            }
            if (A1(qVar, (int) (andIncrement % i4), andIncrement)) {
                t0(this, 0L, 1, null);
                return;
            }
            t0(this, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W0(Object ignoredParam, Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.k.z()) {
            return selectResult;
        }
        throw n0();
    }

    private final q<E> X(long id2, q<E> startFrom, long currentBufferEndCounter) {
        Object g4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79329k;
        ld.p pVar = (ld.p) kotlinx.coroutines.channels.k.y();
        loop0: while (true) {
            g4 = kotlinx.coroutines.internal.f.g(startFrom, id2, pVar);
            if (!q0.h(g4)) {
                p0 f4 = q0.f(g4);
                while (true) {
                    p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
                    if (p0Var.id >= f4.id) {
                        break loop0;
                    }
                    if (!f4.s()) {
                        break;
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, p0Var, f4)) {
                        if (p0Var.o()) {
                            p0Var.l();
                        }
                    } else if (f4.o()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        if (q0.h(g4)) {
            O();
            K0(id2, startFrom);
            t0(this, 0L, 1, null);
            return null;
        }
        q<E> qVar = (q) q0.f(g4);
        long j4 = qVar.id;
        if (j4 <= id2) {
            return qVar;
        }
        int i4 = kotlinx.coroutines.channels.k.f79365b;
        if (f79325g.compareAndSet(this, currentBufferEndCounter + 1, i4 * j4)) {
            s0((qVar.id * i4) - currentBufferEndCounter);
            return null;
        }
        t0(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X0(Object ignoredParam, Object selectResult) {
        Object c5;
        if (selectResult == kotlinx.coroutines.channels.k.z()) {
            c5 = p.INSTANCE.a(h0());
        } else {
            p.INSTANCE.getClass();
            c5 = p.c(selectResult);
        }
        return p.b(c5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q<E> Y(long id2, q<E> startFrom) {
        Object g4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79328j;
        ld.p pVar = (ld.p) kotlinx.coroutines.channels.k.y();
        loop0: while (true) {
            g4 = kotlinx.coroutines.internal.f.g(startFrom, id2, pVar);
            if (!q0.h(g4)) {
                p0 f4 = q0.f(g4);
                while (true) {
                    p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
                    if (p0Var.id >= f4.id) {
                        break loop0;
                    }
                    if (!f4.s()) {
                        break;
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, p0Var, f4)) {
                        if (p0Var.o()) {
                            p0Var.l();
                        }
                    } else if (f4.o()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        if (q0.h(g4)) {
            O();
            if (startFrom.id * kotlinx.coroutines.channels.k.f79365b >= q0()) {
                return null;
            }
            startFrom.b();
            return null;
        }
        q<E> qVar = (q) q0.f(g4);
        if (!D0() && id2 <= f79325g.get(this) / kotlinx.coroutines.channels.k.f79365b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f79329k;
            while (true) {
                p0 p0Var2 = (p0) atomicReferenceFieldUpdater2.get(this);
                if (p0Var2.id >= qVar.id || !qVar.s()) {
                    break;
                }
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater2, this, p0Var2, qVar)) {
                    if (p0Var2.o()) {
                        p0Var2.l();
                    }
                } else if (qVar.o()) {
                    qVar.l();
                }
            }
        }
        long j4 = qVar.id;
        if (j4 <= id2) {
            return qVar;
        }
        int i4 = kotlinx.coroutines.channels.k.f79365b;
        G1(j4 * i4);
        if (qVar.id * i4 >= q0()) {
            return null;
        }
        qVar.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(Object ignoredParam, Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.k.z()) {
            return selectResult;
        }
        if (h0() == null) {
            return null;
        }
        throw n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q<E> Z(long id2, q<E> startFrom) {
        Object g4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79327i;
        ld.p pVar = (ld.p) kotlinx.coroutines.channels.k.y();
        loop0: while (true) {
            g4 = kotlinx.coroutines.internal.f.g(startFrom, id2, pVar);
            if (!q0.h(g4)) {
                p0 f4 = q0.f(g4);
                while (true) {
                    p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
                    if (p0Var.id >= f4.id) {
                        break loop0;
                    }
                    if (!f4.s()) {
                        break;
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, p0Var, f4)) {
                        if (p0Var.o()) {
                            p0Var.l();
                        }
                    } else if (f4.o()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        if (q0.h(g4)) {
            g0();
            if (startFrom.id * kotlinx.coroutines.channels.k.f79365b >= f79324f.get(this)) {
                return null;
            }
            startFrom.b();
            return null;
        }
        q<E> qVar = (q) q0.f(g4);
        long j4 = qVar.id;
        if (j4 <= id2) {
            return qVar;
        }
        int i4 = kotlinx.coroutines.channels.k.f79365b;
        H1(j4 * i4);
        if (qVar.id * i4 >= f79324f.get(this)) {
            return null;
        }
        qVar.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z0(Object ignoredParam, Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.k.z()) {
            return this;
        }
        throw p0();
    }

    static /* synthetic */ <E> Object a1(j<E> jVar, kotlin.coroutines.d<? super E> dVar) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        q<E> qVar = (q) f79328j.get(jVar);
        while (!jVar.j()) {
            long andIncrement = f79324f.getAndIncrement(jVar);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j4 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (qVar.id != j4) {
                q<E> Y = jVar.Y(j4, qVar);
                if (Y == null) {
                    continue;
                } else {
                    qVar = Y;
                }
            }
            Object C1 = jVar.C1(qVar, i5, andIncrement, null);
            s0Var = kotlinx.coroutines.channels.k.f79378o;
            if (C1 == s0Var) {
                throw new IllegalStateException(ProtectedSandApp.s("藅\u0001"));
            }
            s0Var2 = kotlinx.coroutines.channels.k.f79380q;
            if (C1 != s0Var2) {
                s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                if (C1 == s0Var3) {
                    return jVar.g1(qVar, i5, andIncrement, dVar);
                }
                qVar.b();
                return C1;
            }
            if (andIncrement < jVar.q0()) {
                qVar.b();
            }
        }
        throw r0.o(jVar.n0());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <E> java.lang.Object b1(kotlinx.coroutines.channels.j<E> r13, kotlin.coroutines.d<? super kotlinx.coroutines.channels.p<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.j.l
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.j$l r0 = (kotlinx.coroutines.channels.j.l) r0
            int r1 = r0.f79354d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f79354d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.j$l r0 = new kotlinx.coroutines.channels.j$l
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f79352b
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r1 = r6.f79354d
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L30
            kotlin.a1.n(r14)
            kotlinx.coroutines.channels.p r14 = (kotlinx.coroutines.channels.p) r14
            java.lang.Object r13 = r14.getHolder()
            goto Lb3
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "藆\u0001"
            java.lang.String r14 = com.flashget.parentalcontrol.ProtectedSandApp.s(r14)
            r13.<init>(r14)
            throw r13
        L3c:
            kotlin.a1.n(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.channels.j.f79328j
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.q r14 = (kotlinx.coroutines.channels.q) r14
        L47:
            boolean r1 = r13.j()
            if (r1 == 0) goto L58
            kotlinx.coroutines.channels.p$b r14 = kotlinx.coroutines.channels.p.INSTANCE
            java.lang.Throwable r13 = r13.h0()
            java.lang.Object r13 = r14.a(r13)
            goto Lb3
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.j.f79324f
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.k.f79365b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L75
            kotlinx.coroutines.channels.q r1 = r13.Y(r7, r14)
            if (r1 != 0) goto L74
            goto L47
        L74:
            r14 = r1
        L75:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.C1(r8, r9, r10, r12)
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.k.r()
            if (r1 == r7) goto Lb4
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.k.h()
            if (r1 != r7) goto L96
            long r7 = r13.q0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.b()
            goto L47
        L96:
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.channels.k.s()
            if (r1 != r7) goto La7
            r6.f79354d = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.c1(r2, r3, r4, r6)
            if (r13 != r0) goto Lb3
            return r0
        La7:
            r14.b()
            kotlinx.coroutines.channels.p$b r13 = kotlinx.coroutines.channels.p.INSTANCE
            r13.getClass()
            java.lang.Object r13 = kotlinx.coroutines.channels.p.c(r1)
        Lb3:
            return r13
        Lb4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "藅\u0001"
            java.lang.String r14 = com.flashget.parentalcontrol.ProtectedSandApp.s(r14)
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.b1(kotlinx.coroutines.channels.j, kotlin.coroutines.d):java.lang.Object");
    }

    private final Object c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(kotlinx.coroutines.channels.q<E> r11, int r12, long r13, kotlin.coroutines.d<? super kotlinx.coroutines.channels.p<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.c1(kotlinx.coroutines.channels.q, int, long, kotlin.coroutines.d):java.lang.Object");
    }

    private final <R> R d1(Object waiter, ld.l<? super E, ? extends R> onElementRetrieved, ld.q<? super q<E>, ? super Integer, ? super Long, ? extends R> onSuspend, ld.a<? extends R> onClosed, ld.q<? super q<E>, ? super Integer, ? super Long, ? extends R> onNoWaiterSuspend) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        q<E> qVar = (q) f79328j.get(this);
        while (!j()) {
            long andIncrement = f79324f.getAndIncrement(this);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j4 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (qVar.id != j4) {
                q<E> Y = Y(j4, qVar);
                if (Y == null) {
                    continue;
                } else {
                    qVar = Y;
                }
            }
            s0 s0Var4 = (Object) C1(qVar, i5, andIncrement, waiter);
            s0Var = kotlinx.coroutines.channels.k.f79378o;
            if (s0Var4 == s0Var) {
                y3 y3Var = waiter instanceof y3 ? (y3) waiter : null;
                if (y3Var != null) {
                    U0(y3Var, qVar, i5);
                }
                return onSuspend.R(qVar, Integer.valueOf(i5), Long.valueOf(andIncrement));
            }
            s0Var2 = kotlinx.coroutines.channels.k.f79380q;
            if (s0Var4 != s0Var2) {
                s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                if (s0Var4 == s0Var3) {
                    return onNoWaiterSuspend.R(qVar, Integer.valueOf(i5), Long.valueOf(andIncrement));
                }
                qVar.b();
                return onElementRetrieved.invoke(s0Var4);
            }
            if (andIncrement < q0()) {
                qVar.b();
            }
        }
        return onClosed.invoke();
    }

    private final long e0() {
        return f79325g.get(this);
    }

    static /* synthetic */ Object e1(j jVar, Object obj, ld.l lVar, ld.q qVar, ld.a aVar, ld.q qVar2, int i4, Object obj2) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("藈\u0001"));
        }
        if ((i4 & 16) != 0) {
            qVar2 = n.f79362b;
        }
        q<E> qVar3 = (q) f79328j.get(jVar);
        while (!jVar.j()) {
            long andIncrement = f79324f.getAndIncrement(jVar);
            int i5 = kotlinx.coroutines.channels.k.f79365b;
            long j4 = andIncrement / i5;
            int i6 = (int) (andIncrement % i5);
            if (qVar3.id != j4) {
                q<E> Y = jVar.Y(j4, qVar3);
                if (Y == null) {
                    continue;
                } else {
                    qVar3 = Y;
                }
            }
            Object C1 = jVar.C1(qVar3, i6, andIncrement, obj);
            s0Var = kotlinx.coroutines.channels.k.f79378o;
            if (C1 == s0Var) {
                y3 y3Var = obj instanceof y3 ? (y3) obj : null;
                if (y3Var != null) {
                    jVar.U0(y3Var, qVar3, i6);
                }
                return qVar.R(qVar3, Integer.valueOf(i6), Long.valueOf(andIncrement));
            }
            s0Var2 = kotlinx.coroutines.channels.k.f79380q;
            if (C1 != s0Var2) {
                s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                if (C1 == s0Var3) {
                    return qVar2.R(qVar3, Integer.valueOf(i6), Long.valueOf(andIncrement));
                }
                qVar3.b();
                return lVar.invoke(C1);
            }
            if (andIncrement < jVar.q0()) {
                qVar3.b();
            }
        }
        return aVar.invoke();
    }

    private final void f1(q<E> segment, int index, long r4, y3 waiter, ld.l<? super E, k2> onElementRetrieved, ld.a<k2> onClosed) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        s0 s0Var6 = (Object) C1(segment, index, r4, waiter);
        s0Var = kotlinx.coroutines.channels.k.f79378o;
        if (s0Var6 == s0Var) {
            U0(waiter, segment, index);
            return;
        }
        s0Var2 = kotlinx.coroutines.channels.k.f79380q;
        if (s0Var6 != s0Var2) {
            segment.b();
            onElementRetrieved.invoke(s0Var6);
            return;
        }
        if (r4 < q0()) {
            segment.b();
        }
        q<E> qVar = (q) f79328j.get(this);
        while (!j()) {
            long andIncrement = f79324f.getAndIncrement(this);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j4 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (qVar.id != j4) {
                q<E> Y = Y(j4, qVar);
                if (Y == null) {
                    continue;
                } else {
                    qVar = Y;
                }
            }
            s0 s0Var7 = (Object) C1(qVar, i5, andIncrement, waiter);
            s0Var3 = kotlinx.coroutines.channels.k.f79378o;
            if (s0Var7 == s0Var3) {
                if (waiter == null) {
                    waiter = null;
                }
                if (waiter != null) {
                    U0(waiter, qVar, i5);
                }
                k2 k2Var = k2.f75408a;
                return;
            }
            s0Var4 = kotlinx.coroutines.channels.k.f79380q;
            if (s0Var7 != s0Var4) {
                s0Var5 = kotlinx.coroutines.channels.k.f79379p;
                if (s0Var7 == s0Var5) {
                    throw new IllegalStateException(ProtectedSandApp.s("藅\u0001"));
                }
                qVar.b();
                onElementRetrieved.invoke(s0Var7);
                return;
            }
            if (andIncrement < q0()) {
                qVar.b();
            }
        }
        onClosed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g1(q<E> qVar, int i4, long j4, kotlin.coroutines.d<? super E> dVar) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        kotlinx.coroutines.q b5 = kotlinx.coroutines.s.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            Object C1 = C1(qVar, i4, j4, b5);
            s0Var = kotlinx.coroutines.channels.k.f79378o;
            if (C1 == s0Var) {
                U0(b5, qVar, i4);
            } else {
                s0Var2 = kotlinx.coroutines.channels.k.f79380q;
                ld.l<Throwable, k2> lVar = null;
                lVar = null;
                if (C1 == s0Var2) {
                    if (j4 < q0()) {
                        qVar.b();
                    }
                    q<E> qVar2 = (q) f79328j.get(this);
                    while (true) {
                        if (j()) {
                            N0(b5);
                            break;
                        }
                        long andIncrement = f79324f.getAndIncrement(this);
                        int i5 = kotlinx.coroutines.channels.k.f79365b;
                        long j5 = andIncrement / i5;
                        int i6 = (int) (andIncrement % i5);
                        if (qVar2.id != j5) {
                            q<E> Y = Y(j5, qVar2);
                            if (Y != null) {
                                qVar2 = Y;
                            }
                        }
                        C1 = C1(qVar2, i6, andIncrement, b5);
                        s0Var3 = kotlinx.coroutines.channels.k.f79378o;
                        if (C1 == s0Var3) {
                            kotlinx.coroutines.q qVar3 = b5 != null ? b5 : null;
                            if (qVar3 != null) {
                                U0(qVar3, qVar2, i6);
                            }
                        } else {
                            s0Var4 = kotlinx.coroutines.channels.k.f79380q;
                            if (C1 != s0Var4) {
                                s0Var5 = kotlinx.coroutines.channels.k.f79379p;
                                if (C1 == s0Var5) {
                                    throw new IllegalStateException(ProtectedSandApp.s("藅\u0001"));
                                }
                                qVar2.b();
                                ld.l<E, k2> lVar2 = this.onUndeliveredElement;
                                if (lVar2 != null) {
                                    lVar = j0.a(lVar2, C1, b5.getContext());
                                }
                            } else if (andIncrement < q0()) {
                                qVar2.b();
                            }
                        }
                    }
                } else {
                    qVar.b();
                    ld.l<E, k2> lVar3 = this.onUndeliveredElement;
                    if (lVar3 != null) {
                        lVar = j0.a(lVar3, C1, b5.getContext());
                    }
                }
                b5.W(C1, lVar);
            }
            Object y4 = b5.y();
            if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y4;
        } catch (Throwable th) {
            b5.N();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(kotlinx.coroutines.selects.m<?> select, Object ignoredParam) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        q<E> qVar = (q) f79328j.get(this);
        while (!j()) {
            long andIncrement = f79324f.getAndIncrement(this);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j4 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (qVar.id != j4) {
                q<E> Y = Y(j4, qVar);
                if (Y == null) {
                    continue;
                } else {
                    qVar = Y;
                }
            }
            Object C1 = C1(qVar, i5, andIncrement, select);
            s0Var = kotlinx.coroutines.channels.k.f79378o;
            if (C1 == s0Var) {
                y3 y3Var = select instanceof y3 ? (y3) select : null;
                if (y3Var != null) {
                    U0(y3Var, qVar, i5);
                    return;
                }
                return;
            }
            s0Var2 = kotlinx.coroutines.channels.k.f79380q;
            if (C1 != s0Var2) {
                s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                if (C1 == s0Var3) {
                    throw new IllegalStateException(ProtectedSandApp.s("藅\u0001"));
                }
                qVar.b();
                select.d(C1);
                return;
            }
            if (andIncrement < q0()) {
                qVar.b();
            }
        }
        O0(select);
    }

    public static /* synthetic */ void i0() {
    }

    public static /* synthetic */ void j0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b7, code lost:
    
        r12 = (kotlinx.coroutines.channels.q) r12.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j1(kotlinx.coroutines.channels.q<E> r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.j1(kotlinx.coroutines.channels.q):void");
    }

    public static /* synthetic */ void k0() {
    }

    private final void k1(y3 y3Var) {
        m1(y3Var, true);
    }

    public static final boolean l(j jVar, long j4) {
        return jVar.w0(j4, false);
    }

    public static /* synthetic */ void l0() {
    }

    private final void l1(y3 y3Var) {
        m1(y3Var, false);
    }

    private static /* synthetic */ void m0() {
    }

    private final void m1(y3 y3Var, boolean z4) {
        if (y3Var instanceof b) {
            kotlinx.coroutines.p<Boolean> b5 = ((b) y3Var).b();
            z0.Companion companion = z0.INSTANCE;
            b5.resumeWith(Boolean.FALSE);
            return;
        }
        if (y3Var instanceof kotlinx.coroutines.p) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) y3Var;
            z0.Companion companion2 = z0.INSTANCE;
            dVar.resumeWith(a1.a(z4 ? n0() : p0()));
        } else if (y3Var instanceof c0) {
            kotlinx.coroutines.q<p<? extends E>> qVar = ((c0) y3Var).cont;
            z0.Companion companion3 = z0.INSTANCE;
            qVar.resumeWith(p.b(p.INSTANCE.a(h0())));
        } else if (y3Var instanceof a) {
            ((a) y3Var).l();
        } else if (y3Var instanceof kotlinx.coroutines.selects.m) {
            ((kotlinx.coroutines.selects.m) y3Var).l(this, kotlinx.coroutines.channels.k.z());
        } else {
            throw new IllegalStateException((ProtectedSandApp.s("藉\u0001") + y3Var).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable n0() {
        Throwable h02 = h0();
        return h02 == null ? new ClosedReceiveChannelException(ProtectedSandApp.s("藊\u0001")) : h02;
    }

    static <E> Object n1(j<E> jVar, E e4, kotlin.coroutines.d<? super k2> dVar) {
        q<E> qVar = (q) f79327i.get(jVar);
        while (true) {
            long andIncrement = f79323e.getAndIncrement(jVar);
            long j4 = 1152921504606846975L & andIncrement;
            boolean w02 = jVar.w0(andIncrement, false);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j5 = j4 / i4;
            int i5 = (int) (j4 % i4);
            if (qVar.id != j5) {
                q<E> Z = jVar.Z(j5, qVar);
                if (Z != null) {
                    qVar = Z;
                } else if (w02) {
                    Object Q0 = jVar.Q0(e4, dVar);
                    if (Q0 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                        return Q0;
                    }
                }
            }
            int E1 = jVar.E1(qVar, i5, e4, j4, null, w02);
            if (E1 == 0) {
                qVar.b();
                break;
            }
            if (E1 == 1) {
                break;
            }
            if (E1 != 2) {
                if (E1 == 3) {
                    Object t12 = jVar.t1(qVar, i5, e4, j4, dVar);
                    if (t12 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                        return t12;
                    }
                } else if (E1 == 4) {
                    if (j4 < f79324f.get(jVar)) {
                        qVar.b();
                    }
                    Object Q02 = jVar.Q0(e4, dVar);
                    if (Q02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                        return Q02;
                    }
                } else if (E1 == 5) {
                    qVar.b();
                }
            } else if (w02) {
                qVar.r();
                Object Q03 = jVar.Q0(e4, dVar);
                if (Q03 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                    return Q03;
                }
            }
        }
        return k2.f75408a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r9.resumeWith(java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <E> java.lang.Object p1(kotlinx.coroutines.channels.j<E> r17, E r18, kotlin.coroutines.d<? super java.lang.Boolean> r19) {
        /*
            r8 = r17
            kotlinx.coroutines.q r9 = new kotlinx.coroutines.q
            kotlin.coroutines.d r0 = kotlin.coroutines.intrinsics.b.e(r19)
            r10 = 1
            r9.<init>(r0, r10)
            r9.e0()
            ld.l<E, kotlin.k2> r0 = r8.onUndeliveredElement
            if (r0 != 0) goto Lc1
            kotlinx.coroutines.channels.j$b r11 = new kotlinx.coroutines.channels.j$b
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.j.f79327i
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.q) r0
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.j.f79323e
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            r3 = 0
            boolean r14 = r8.w0(r1, r3)
            int r1 = kotlinx.coroutines.channels.k.f79365b
            long r2 = (long) r1
            long r2 = r12 / r2
            long r4 = (long) r1
            long r4 = r12 % r4
            int r15 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L54
            kotlinx.coroutines.channels.q r1 = r8.Z(r2, r0)
            if (r1 != 0) goto L52
            if (r14 == 0) goto L20
            kotlin.z0$a r0 = kotlin.z0.INSTANCE
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.resumeWith(r0)
            goto Lb5
        L52:
            r7 = r1
            goto L55
        L54:
            r7 = r0
        L55:
            r0 = r17
            r1 = r7
            r2 = r15
            r3 = r18
            r4 = r12
            r6 = r11
            r16 = r7
            r7 = r14
            int r0 = r0.E1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lad
            if (r0 == r10) goto La5
            r1 = 2
            if (r0 == r1) goto L97
            r1 = 3
            if (r0 == r1) goto L8b
            r1 = 4
            if (r0 == r1) goto L7b
            r1 = 5
            if (r0 == r1) goto L75
            goto L78
        L75:
            r16.b()
        L78:
            r0 = r16
            goto L20
        L7b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.j.f79324f
            long r0 = r0.get(r8)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L88
            r16.b()
        L88:
            kotlin.z0$a r0 = kotlin.z0.INSTANCE
            goto L4b
        L8b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "藅\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            throw r0
        L97:
            if (r14 == 0) goto L9f
            r16.r()
            kotlin.z0$a r0 = kotlin.z0.INSTANCE
            goto L4b
        L9f:
            r0 = r16
            r8.V0(r11, r0, r15)
            goto Lb5
        La5:
            kotlin.z0$a r0 = kotlin.z0.INSTANCE
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.resumeWith(r0)
            goto Lb5
        Lad:
            r0 = r16
            r0.b()
            kotlin.z0$a r0 = kotlin.z0.INSTANCE
            goto La7
        Lb5:
            java.lang.Object r0 = r9.y()
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lc0
            kotlin.coroutines.jvm.internal.h.c(r19)
        Lc0:
            return r0
        Lc1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "藋\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.p1(kotlinx.coroutines.channels.j, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    public static Object r1(j jVar, Object obj, Object obj2, ld.a aVar, ld.p pVar, ld.a aVar2, ld.r rVar, int i4, Object obj3) {
        q<E> qVar;
        if (obj3 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("藌\u0001"));
        }
        ld.r rVar2 = (i4 & 32) != 0 ? o.f79363b : rVar;
        q<E> qVar2 = (q) f79327i.get(jVar);
        while (true) {
            long andIncrement = f79323e.getAndIncrement(jVar);
            long j4 = andIncrement & 1152921504606846975L;
            boolean w02 = jVar.w0(andIncrement, false);
            int i5 = kotlinx.coroutines.channels.k.f79365b;
            long j5 = j4 / i5;
            int i6 = (int) (j4 % i5);
            if (qVar2.id != j5) {
                q<E> Z = jVar.Z(j5, qVar2);
                if (Z != null) {
                    qVar = Z;
                } else if (w02) {
                    return aVar2.invoke();
                }
            } else {
                qVar = qVar2;
            }
            int E1 = jVar.E1(qVar, i6, obj, j4, obj2, w02);
            if (E1 == 0) {
                qVar.b();
                return aVar.invoke();
            }
            if (E1 == 1) {
                return aVar.invoke();
            }
            if (E1 == 2) {
                if (w02) {
                    qVar.r();
                    return aVar2.invoke();
                }
                y3 y3Var = obj2 instanceof y3 ? (y3) obj2 : null;
                if (y3Var != null) {
                    jVar.V0(y3Var, qVar, i6);
                }
                return pVar.invoke(qVar, Integer.valueOf(i6));
            }
            if (E1 == 3) {
                return rVar2.i(qVar, Integer.valueOf(i6), obj, Long.valueOf(j4));
            }
            if (E1 == 4) {
                if (j4 < f79324f.get(jVar)) {
                    qVar.b();
                }
                return aVar2.invoke();
            }
            if (E1 == 5) {
                qVar.b();
            }
            qVar2 = qVar;
        }
    }

    private final void s0(long nAttempts) {
        if ((f79326h.addAndGet(this, nAttempts) & com.google.common.primitives.n.f57520b) != 0) {
            while ((f79326h.get(this) & com.google.common.primitives.n.f57520b) != 0) {
            }
        }
    }

    private final void s1(q<E> segment, int index, E element, long s4, y3 waiter, ld.a<k2> onRendezvousOrBuffered, ld.a<k2> onClosed) {
        q<E> qVar;
        y3 y3Var = waiter;
        int E1 = E1(segment, index, element, s4, waiter, false);
        if (E1 == 0) {
            segment.b();
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (E1 == 1) {
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (E1 == 2) {
            V0(y3Var, segment, index);
            return;
        }
        if (E1 == 4) {
            if (s4 < f79324f.get(this)) {
                segment.b();
            }
            onClosed.invoke();
            return;
        }
        String s5 = ProtectedSandApp.s("藅\u0001");
        if (E1 != 5) {
            throw new IllegalStateException(s5);
        }
        segment.b();
        q<E> qVar2 = (q) f79327i.get(this);
        while (true) {
            long andIncrement = f79323e.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean w02 = w0(andIncrement, false);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j5 = j4 / i4;
            int i5 = (int) (j4 % i4);
            if (qVar2.id != j5) {
                q<E> Z = Z(j5, qVar2);
                if (Z != null) {
                    qVar = Z;
                } else if (w02) {
                    onClosed.invoke();
                    return;
                }
            } else {
                qVar = qVar2;
            }
            q<E> qVar3 = qVar;
            int E12 = E1(qVar, i5, element, j4, waiter, w02);
            if (E12 == 0) {
                qVar3.b();
                onRendezvousOrBuffered.invoke();
                return;
            }
            if (E12 == 1) {
                onRendezvousOrBuffered.invoke();
                return;
            }
            if (E12 == 2) {
                if (w02) {
                    qVar3.r();
                    onClosed.invoke();
                    return;
                }
                if (y3Var == null) {
                    y3Var = null;
                }
                if (y3Var != null) {
                    V0(y3Var, qVar3, i5);
                }
                k2 k2Var = k2.f75408a;
                return;
            }
            if (E12 == 3) {
                throw new IllegalStateException(s5);
            }
            if (E12 == 4) {
                if (j4 < f79324f.get(this)) {
                    qVar3.b();
                }
                onClosed.invoke();
                return;
            } else {
                if (E12 == 5) {
                    qVar3.b();
                }
                qVar2 = qVar3;
            }
        }
    }

    static /* synthetic */ void t0(j jVar, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("藍\u0001"));
        }
        if ((i4 & 1) != 0) {
            j4 = 1;
        }
        jVar.s0(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(kotlinx.coroutines.channels.q<E> r21, int r22, E r23, long r24, kotlin.coroutines.d<? super kotlin.k2> r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.t1(kotlinx.coroutines.channels.q, int, java.lang.Object, long, kotlin.coroutines.d):java.lang.Object");
    }

    private final void u0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79331m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, obj == null ? kotlinx.coroutines.channels.k.f79388y : kotlinx.coroutines.channels.k.f79389z));
        if (obj == null) {
            return;
        }
        ((ld.l) obj).invoke(h0());
    }

    private final boolean u1(long curSendersAndCloseStatus) {
        if (w0(curSendersAndCloseStatus, false)) {
            return false;
        }
        return !F(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean v0(q<E> segment, int index, long globalIndex) {
        Object y4;
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        s0 s0Var6;
        s0 s0Var7;
        do {
            y4 = segment.y(index);
            if (y4 != null) {
                s0Var2 = kotlinx.coroutines.channels.k.f79370g;
                if (y4 != s0Var2) {
                    if (y4 == kotlinx.coroutines.channels.k.f79369f) {
                        return true;
                    }
                    s0Var3 = kotlinx.coroutines.channels.k.f79375l;
                    if (y4 == s0Var3 || y4 == kotlinx.coroutines.channels.k.z()) {
                        return false;
                    }
                    s0Var4 = kotlinx.coroutines.channels.k.f79374k;
                    if (y4 == s0Var4) {
                        return false;
                    }
                    s0Var5 = kotlinx.coroutines.channels.k.f79373j;
                    if (y4 == s0Var5) {
                        return false;
                    }
                    s0Var6 = kotlinx.coroutines.channels.k.f79372i;
                    if (y4 == s0Var6) {
                        return true;
                    }
                    s0Var7 = kotlinx.coroutines.channels.k.f79371h;
                    return y4 != s0Var7 && globalIndex == f79324f.get(this);
                }
            }
            s0Var = kotlinx.coroutines.channels.k.f79373j;
        } while (!segment.t(index, y4, s0Var));
        W();
        return false;
    }

    private final boolean w0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i4 = (int) (sendersAndCloseStatusCur >> 60);
        if (i4 == 0 || i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            N(sendersAndCloseStatusCur & 1152921504606846975L);
            if (isClosedForReceive && r0()) {
                return false;
            }
        } else {
            if (i4 != 3) {
                throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("藎\u0001"), i4).toString());
            }
            L(sendersAndCloseStatusCur & 1152921504606846975L);
        }
        return true;
    }

    @z1
    public static /* synthetic */ void x0() {
    }

    private final boolean x1(Object obj, E e4) {
        boolean F;
        boolean F2;
        if (obj instanceof kotlinx.coroutines.selects.m) {
            return ((kotlinx.coroutines.selects.m) obj).l(this, e4);
        }
        if (obj instanceof c0) {
            l0.n(obj, ProtectedSandApp.s("藏\u0001"));
            c0 c0Var = (c0) obj;
            kotlinx.coroutines.q<p<? extends E>> qVar = c0Var.cont;
            p.INSTANCE.getClass();
            p b5 = p.b(p.c(e4));
            ld.l<E, k2> lVar = this.onUndeliveredElement;
            F2 = kotlinx.coroutines.channels.k.F(qVar, b5, lVar != null ? j0.a(lVar, e4, c0Var.cont.getContext()) : null);
            return F2;
        }
        if (obj instanceof a) {
            l0.n(obj, ProtectedSandApp.s("藐\u0001"));
            return ((a) obj).k(e4);
        }
        if (!(obj instanceof kotlinx.coroutines.p)) {
            throw new IllegalStateException((ProtectedSandApp.s("藒\u0001") + obj).toString());
        }
        l0.n(obj, ProtectedSandApp.s("藑\u0001"));
        kotlinx.coroutines.p pVar = (kotlinx.coroutines.p) obj;
        ld.l<E, k2> lVar2 = this.onUndeliveredElement;
        F = kotlinx.coroutines.channels.k.F(pVar, e4, lVar2 != null ? j0.a(lVar2, e4, pVar.getContext()) : null);
        return F;
    }

    private final boolean y0(long j4) {
        return w0(j4, true);
    }

    private final boolean y1(Object obj, q<E> qVar, int i4) {
        if (obj instanceof kotlinx.coroutines.p) {
            l0.n(obj, ProtectedSandApp.s("藓\u0001"));
            return kotlinx.coroutines.channels.k.G((kotlinx.coroutines.p) obj, k2.f75408a, null, 2, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.m) {
            l0.n(obj, ProtectedSandApp.s("藔\u0001"));
            kotlinx.coroutines.selects.r o02 = ((kotlinx.coroutines.selects.l) obj).o0(this, k2.f75408a);
            if (o02 == kotlinx.coroutines.selects.r.REREGISTER) {
                qVar.u(i4);
            }
            return o02 == kotlinx.coroutines.selects.r.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return kotlinx.coroutines.channels.k.G(((b) obj).b(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException((ProtectedSandApp.s("藉\u0001") + obj).toString());
    }

    @z1
    public static /* synthetic */ void z0() {
    }

    private final void z1(AtomicLongFieldUpdater atomicLongFieldUpdater, ld.l<? super Long, Long> lVar, Object obj) {
        long j4;
        do {
            j4 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j4, lVar.invoke(Long.valueOf(j4)).longValue()));
    }

    protected boolean B0() {
        return false;
    }

    public boolean G(@fg.m Throwable cause) {
        if (cause == null) {
            cause = new CancellationException(ProtectedSandApp.s("藕\u0001"));
        }
        return K(cause, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I() {
        s0 s0Var;
        s0 s0Var2;
        boolean g4;
        s0 s0Var3;
        s0 s0Var4;
        boolean g5;
        q qVar;
        q qVar2;
        if (D0()) {
            Object obj = f79329k.get(this);
            qVar2 = kotlinx.coroutines.channels.k.f79364a;
            if (obj != qVar2) {
                throw new IllegalStateException((ProtectedSandApp.s("藖\u0001") + this).toString());
            }
        } else if (((q) f79328j.get(this)).id > ((q) f79329k.get(this)).id) {
            throw new IllegalStateException((ProtectedSandApp.s("藝\u0001") + this).toString());
        }
        List O = kotlin.collections.w.O(f79328j.get(this), f79327i.get(this), f79329k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : O) {
            q qVar3 = (q) obj2;
            qVar = kotlinx.coroutines.channels.k.f79364a;
            if (qVar3 != qVar) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((q) next).id;
            do {
                Object next2 = it.next();
                long j5 = ((q) next2).id;
                if (j4 > j5) {
                    next = next2;
                    j4 = j5;
                }
            } while (it.hasNext());
        }
        q qVar4 = (q) next;
        if (qVar4.g() != 0) {
            throw new IllegalStateException((ProtectedSandApp.s("藜\u0001") + this).toString());
        }
        while (qVar4.e() != 0) {
            S e4 = qVar4.e();
            l0.m(e4);
            if (((q) e4).g() != 0) {
                S e5 = qVar4.e();
                l0.m(e5);
                if (((q) e5).g() != qVar4) {
                    throw new IllegalStateException((ProtectedSandApp.s("藗\u0001") + this).toString());
                }
            }
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object y4 = qVar4.y(i6);
                if (!l0.g(y4, kotlinx.coroutines.channels.k.f79369f) && !(y4 instanceof y3)) {
                    s0Var = kotlinx.coroutines.channels.k.f79376m;
                    if (l0.g(y4, s0Var)) {
                        g4 = true;
                    } else {
                        s0Var2 = kotlinx.coroutines.channels.k.f79375l;
                        g4 = l0.g(y4, s0Var2);
                    }
                    boolean g6 = g4 ? true : l0.g(y4, kotlinx.coroutines.channels.k.z());
                    String s4 = ProtectedSandApp.s("藘\u0001");
                    if (g6) {
                        if (!(qVar4.x(i6) == null)) {
                            throw new IllegalStateException(s4);
                        }
                        i5++;
                    } else {
                        s0Var3 = kotlinx.coroutines.channels.k.f79373j;
                        if (l0.g(y4, s0Var3)) {
                            g5 = true;
                        } else {
                            s0Var4 = kotlinx.coroutines.channels.k.f79374k;
                            g5 = l0.g(y4, s0Var4);
                        }
                        if (!g5) {
                            throw new IllegalStateException((ProtectedSandApp.s("藙\u0001") + y4 + ProtectedSandApp.s("藚\u0001") + this).toString());
                        }
                        if (!(qVar4.x(i6) == null)) {
                            throw new IllegalStateException(s4);
                        }
                    }
                }
            }
            if (i5 == kotlinx.coroutines.channels.k.f79365b) {
                if (!(qVar4 == f79328j.get(this) || qVar4 == f79327i.get(this) || qVar4 == f79329k.get(this))) {
                    throw new IllegalStateException((ProtectedSandApp.s("藛\u0001") + this).toString());
                }
            }
            S e6 = qVar4.e();
            l0.m(e6);
            qVar4 = (q) e6;
        }
    }

    public final void I1(long globalIndex) {
        int i4;
        long j4;
        long v4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long v5;
        long j5;
        long v6;
        if (D0()) {
            return;
        }
        while (f79325g.get(this) <= globalIndex) {
        }
        i4 = kotlinx.coroutines.channels.k.f79366c;
        for (int i5 = 0; i5 < i4; i5++) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f79325g;
            long j6 = atomicLongFieldUpdater2.get(this);
            if (j6 == (kotlin.time.g.f79218c & f79326h.get(this)) && j6 == atomicLongFieldUpdater2.get(this)) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f79326h;
        do {
            j4 = atomicLongFieldUpdater3.get(this);
            v4 = kotlinx.coroutines.channels.k.v(j4 & kotlin.time.g.f79218c, true);
        } while (!atomicLongFieldUpdater3.compareAndSet(this, j4, v4));
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = f79325g;
            long j7 = atomicLongFieldUpdater4.get(this);
            atomicLongFieldUpdater = f79326h;
            long j10 = atomicLongFieldUpdater.get(this);
            long j11 = j10 & kotlin.time.g.f79218c;
            boolean z4 = (com.google.common.primitives.n.f57520b & j10) != 0;
            if (j7 == j11 && j7 == atomicLongFieldUpdater4.get(this)) {
                break;
            } else if (!z4) {
                v5 = kotlinx.coroutines.channels.k.v(j11, true);
                atomicLongFieldUpdater.compareAndSet(this, j10, v5);
            }
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            v6 = kotlinx.coroutines.channels.k.v(j5 & kotlin.time.g.f79218c, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, v6));
    }

    protected boolean K(@fg.m Throwable cause, boolean cancel) {
        s0 s0Var;
        if (cancel) {
            H0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79330l;
        s0Var = kotlinx.coroutines.channels.k.A;
        boolean a5 = androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, s0Var, cause);
        if (cancel) {
            I0();
        } else {
            J0();
        }
        g0();
        L0();
        if (a5) {
            u0();
        }
        return a5;
    }

    protected void L0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return kotlinx.coroutines.channels.p.c(r0);
     */
    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.j.f79323e
            long r0 = r0.get(r14)
            boolean r0 = r14.u1(r0)
            if (r0 == 0) goto L16
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.INSTANCE
            r15.getClass()
            kotlinx.coroutines.channels.p$c r15 = kotlinx.coroutines.channels.p.a()
            return r15
        L16:
            kotlinx.coroutines.internal.s0 r8 = kotlinx.coroutines.channels.k.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.j.f79327i
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.q) r0
        L22:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.j.f79323e
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            r3 = 0
            boolean r11 = r14.w0(r1, r3)
            int r1 = kotlinx.coroutines.channels.k.f79365b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            kotlinx.coroutines.channels.q r1 = r14.Z(r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L22
        L4b:
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.INSTANCE
            java.lang.Throwable r0 = r14.p0()
            java.lang.Object r15 = r15.a(r0)
            goto Lca
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.E1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lc2
            r1 = 1
            if (r0 == r1) goto Lb6
            r1 = 2
            if (r0 == r1) goto L96
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L22
        L7c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r15 = kotlinx.coroutines.channels.j.f79324f
            long r0 = r15.get(r14)
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "藅\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r15.<init>(r0)
            throw r15
        L96:
            if (r11 == 0) goto L9c
            r13.r()
            goto L4b
        L9c:
            boolean r15 = r8 instanceof kotlinx.coroutines.y3
            if (r15 == 0) goto La3
            kotlinx.coroutines.y3 r8 = (kotlinx.coroutines.y3) r8
            goto La4
        La3:
            r8 = 0
        La4:
            if (r8 == 0) goto La9
            r14.V0(r8, r13, r12)
        La9:
            r13.r()
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.INSTANCE
            r15.getClass()
            kotlinx.coroutines.channels.p$c r15 = kotlinx.coroutines.channels.p.a()
            goto Lca
        Lb6:
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.INSTANCE
            kotlin.k2 r0 = kotlin.k2.f75408a
        Lba:
            r15.getClass()
            java.lang.Object r15 = kotlinx.coroutines.channels.p.c(r0)
            goto Lca
        Lc2:
            r13.b()
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.INSTANCE
            kotlin.k2 r0 = kotlin.k2.f75408a
            goto Lba
        Lca:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.M(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.selects.g<E> P() {
        c cVar = c.f79340d;
        l0.n(cVar, ProtectedSandApp.s("藞\u0001"));
        ld.q qVar = (ld.q) u1.q(cVar, 3);
        d dVar = d.f79341d;
        l0.n(dVar, ProtectedSandApp.s("藟\u0001"));
        return new kotlinx.coroutines.selects.h(this, qVar, (ld.q) u1.q(dVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.selects.g<p<E>> Q() {
        e eVar = e.f79342d;
        l0.n(eVar, ProtectedSandApp.s("藞\u0001"));
        ld.q qVar = (ld.q) u1.q(eVar, 3);
        f fVar = f.f79343d;
        l0.n(fVar, ProtectedSandApp.s("藟\u0001"));
        return new kotlinx.coroutines.selects.h(this, qVar, (ld.q) u1.q(fVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.selects.g<E> R() {
        g gVar = g.f79344d;
        l0.n(gVar, ProtectedSandApp.s("藞\u0001"));
        ld.q qVar = (ld.q) u1.q(gVar, 3);
        h hVar = h.f79345d;
        l0.n(hVar, ProtectedSandApp.s("藟\u0001"));
        return new kotlinx.coroutines.selects.h(this, qVar, (ld.q) u1.q(hVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    protected final void S(long globalCellIndex) {
        s0 s0Var;
        UndeliveredElementException d5;
        q<E> qVar = (q) f79328j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f79324f;
            long j4 = atomicLongFieldUpdater.get(this);
            if (globalCellIndex < Math.max(this.capacity + j4, f79325g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                int i4 = kotlinx.coroutines.channels.k.f79365b;
                long j5 = j4 / i4;
                int i5 = (int) (j4 % i4);
                if (qVar.id != j5) {
                    q<E> Y = Y(j5, qVar);
                    if (Y == null) {
                        continue;
                    } else {
                        qVar = Y;
                    }
                }
                Object C1 = C1(qVar, i5, j4, null);
                s0Var = kotlinx.coroutines.channels.k.f79380q;
                if (C1 != s0Var) {
                    qVar.b();
                    ld.l<E, k2> lVar = this.onUndeliveredElement;
                    if (lVar != null && (d5 = j0.d(lVar, C1, null, 2, null)) != null) {
                        throw d5;
                    }
                } else if (j4 < q0()) {
                    qVar.b();
                }
            }
        }
    }

    protected void S0() {
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public Object T() {
        Object obj;
        q<E> qVar;
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        long j4 = f79324f.get(this);
        long j5 = f79323e.get(this);
        if (w0(j5, true)) {
            return p.INSTANCE.a(h0());
        }
        if (j4 >= (j5 & 1152921504606846975L)) {
            p.INSTANCE.getClass();
            return p.f79411c;
        }
        obj = kotlinx.coroutines.channels.k.f79376m;
        q<E> qVar2 = (q) f79328j.get(this);
        while (!j()) {
            long andIncrement = f79324f.getAndIncrement(this);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j6 = andIncrement / i4;
            int i5 = (int) (andIncrement % i4);
            if (qVar2.id != j6) {
                q<E> Y = Y(j6, qVar2);
                if (Y == null) {
                    continue;
                } else {
                    qVar = Y;
                }
            } else {
                qVar = qVar2;
            }
            Object C1 = C1(qVar, i5, andIncrement, obj);
            s0Var = kotlinx.coroutines.channels.k.f79378o;
            if (C1 == s0Var) {
                y3 y3Var = obj instanceof y3 ? (y3) obj : null;
                if (y3Var != null) {
                    U0(y3Var, qVar, i5);
                }
                I1(andIncrement);
                qVar.r();
                p.INSTANCE.getClass();
                return p.f79411c;
            }
            s0Var2 = kotlinx.coroutines.channels.k.f79380q;
            if (C1 != s0Var2) {
                s0Var3 = kotlinx.coroutines.channels.k.f79379p;
                if (C1 == s0Var3) {
                    throw new IllegalStateException(ProtectedSandApp.s("藅\u0001"));
                }
                qVar.b();
                p.INSTANCE.getClass();
                return p.c(C1);
            }
            if (andIncrement < q0()) {
                qVar.b();
            }
            qVar2 = qVar;
        }
        return p.INSTANCE.a(h0());
    }

    protected void T0() {
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @x0(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object U(@fg.l kotlin.coroutines.d<? super E> dVar) {
        return d0.a.i(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    public Object V(@fg.l kotlin.coroutines.d<? super p<? extends E>> dVar) {
        return b1(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    public Object a0(@fg.l kotlin.coroutines.d<? super E> dVar) {
        return a1(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.d0
    public final void b(@fg.m CancellationException cause) {
        G(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean b0(@fg.m Throwable cause) {
        return K(cause, false);
    }

    @Override // kotlinx.coroutines.channels.d0
    public final void cancel() {
        G(null);
    }

    @Override // kotlinx.coroutines.channels.e0
    public void d0(@fg.l ld.l<? super Throwable, k2> handler) {
        s0 s0Var;
        s0 s0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s0 s0Var3;
        s0 s0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f79331m;
        if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater2, this, null, handler)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            s0Var = kotlinx.coroutines.channels.k.f79388y;
            if (obj != s0Var) {
                s0Var2 = kotlinx.coroutines.channels.k.f79389z;
                if (obj == s0Var2) {
                    throw new IllegalStateException(ProtectedSandApp.s("藠\u0001"));
                }
                throw new IllegalStateException((ProtectedSandApp.s("藡\u0001") + obj).toString());
            }
            atomicReferenceFieldUpdater = f79331m;
            s0Var3 = kotlinx.coroutines.channels.k.f79388y;
            s0Var4 = kotlinx.coroutines.channels.k.f79389z;
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, s0Var3, s0Var4));
        handler.invoke(h0());
    }

    @Override // kotlinx.coroutines.channels.d0
    public final boolean f(@fg.m Throwable cause) {
        return G(cause);
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.m
    public Object f0(E e4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return n1(this, e4, dVar);
    }

    @Override // kotlinx.coroutines.channels.e0
    public boolean g0() {
        return w0(f79323e.get(this), false);
    }

    @fg.m
    protected final Throwable h0() {
        return (Throwable) f79330l.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        r14.d(kotlin.k2.f75408a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void i1(@fg.l kotlinx.coroutines.selects.m<?> r14, @fg.m java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.j.f79327i
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.q) r0
        L8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.j.f79323e
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            r5 = 0
            boolean r1 = r13.w0(r1, r5)
            int r2 = kotlinx.coroutines.channels.k.f79365b
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.id
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            kotlinx.coroutines.channels.q r5 = r13.Z(r5, r0)
            if (r5 != 0) goto L35
            if (r1 == 0) goto L8
        L30:
            r13.P0(r15, r14)
            goto L8f
        L35:
            r0 = r5
        L36:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = r5.E1(r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L8b
            r6 = 1
            if (r5 == r6) goto L85
            r6 = 2
            if (r5 == r6) goto L71
            r1 = 3
            if (r5 == r1) goto L65
            r1 = 4
            if (r5 == r1) goto L57
            r1 = 5
            if (r5 == r1) goto L53
            goto L8
        L53:
            r0.b()
            goto L8
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.j.f79324f
            long r1 = r1.get(r13)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L30
            r0.b()
            goto L30
        L65:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "藅\u0001"
            java.lang.String r15 = com.flashget.parentalcontrol.ProtectedSandApp.s(r15)
            r14.<init>(r15)
            throw r14
        L71:
            if (r1 == 0) goto L77
            r0.r()
            goto L30
        L77:
            boolean r15 = r14 instanceof kotlinx.coroutines.y3
            if (r15 == 0) goto L7e
            kotlinx.coroutines.y3 r14 = (kotlinx.coroutines.y3) r14
            goto L7f
        L7e:
            r14 = 0
        L7f:
            if (r14 == 0) goto L8f
            r13.V0(r14, r0, r2)
            goto L8f
        L85:
            kotlin.k2 r15 = kotlin.k2.f75408a
            r14.d(r15)
            goto L8f
        L8b:
            r0.b()
            goto L85
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.i1(kotlinx.coroutines.selects.m, java.lang.Object):void");
    }

    @Override // kotlinx.coroutines.channels.d0
    public boolean isEmpty() {
        if (j() || r0()) {
            return false;
        }
        return !j();
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.l
    public kotlinx.coroutines.channels.n<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.d0
    public boolean j() {
        return w0(f79323e.get(this), true);
    }

    public final long o0() {
        return f79324f.get(this);
    }

    @fg.m
    public Object o1(E e4, @fg.l kotlin.coroutines.d<? super Boolean> dVar) {
        return p1(this, e4, dVar);
    }

    @Override // kotlinx.coroutines.channels.e0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e4) {
        return e0.a.c(this, e4);
    }

    @fg.l
    protected final Throwable p0() {
        Throwable h02 = h0();
        return h02 == null ? new ClosedSendChannelException(ProtectedSandApp.s("藊\u0001")) : h02;
    }

    @Override // kotlinx.coroutines.channels.d0
    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @x0(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) d0.a.h(this);
    }

    public final long q0() {
        return f79323e.get(this) & 1152921504606846975L;
    }

    protected final <R> R q1(E element, @fg.m Object waiter, @fg.l ld.a<? extends R> onRendezvousOrBuffered, @fg.l ld.p<? super q<E>, ? super Integer, ? extends R> onSuspend, @fg.l ld.a<? extends R> onClosed, @fg.l ld.r<? super q<E>, ? super Integer, ? super E, ? super Long, ? extends R> onNoWaiterSuspend) {
        q<E> qVar;
        q<E> qVar2 = (q) f79327i.get(this);
        while (true) {
            long andIncrement = f79323e.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean w02 = w0(andIncrement, false);
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j5 = j4 / i4;
            int i5 = (int) (j4 % i4);
            if (qVar2.id != j5) {
                q<E> Z = Z(j5, qVar2);
                if (Z != null) {
                    qVar = Z;
                } else if (w02) {
                    return onClosed.invoke();
                }
            } else {
                qVar = qVar2;
            }
            int E1 = E1(qVar, i5, element, j4, waiter, w02);
            if (E1 == 0) {
                qVar.b();
                return onRendezvousOrBuffered.invoke();
            }
            if (E1 == 1) {
                return onRendezvousOrBuffered.invoke();
            }
            if (E1 == 2) {
                if (w02) {
                    qVar.r();
                    return onClosed.invoke();
                }
                y3 y3Var = waiter instanceof y3 ? (y3) waiter : null;
                if (y3Var != null) {
                    V0(y3Var, qVar, i5);
                }
                return onSuspend.invoke(qVar, Integer.valueOf(i5));
            }
            if (E1 == 3) {
                return onNoWaiterSuspend.i(qVar, Integer.valueOf(i5), element, Long.valueOf(j4));
            }
            if (E1 == 4) {
                if (j4 < f79324f.get(this)) {
                    qVar.b();
                }
                return onClosed.invoke();
            }
            if (E1 == 5) {
                qVar.b();
            }
            qVar2 = qVar;
        }
    }

    @Override // kotlinx.coroutines.channels.e0
    @fg.l
    public kotlinx.coroutines.selects.i<E, j<E>> r() {
        i iVar = i.f79346d;
        l0.n(iVar, ProtectedSandApp.s("藞\u0001"));
        ld.q qVar = (ld.q) u1.q(iVar, 3);
        C1216j c1216j = C1216j.f79347d;
        l0.n(c1216j, ProtectedSandApp.s("藟\u0001"));
        return new kotlinx.coroutines.selects.j(this, qVar, (ld.q) u1.q(c1216j, 3), null, 8, null);
    }

    public final boolean r0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79328j;
            q<E> qVar = (q) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f79324f;
            long j4 = atomicLongFieldUpdater.get(this);
            if (q0() <= j4) {
                return false;
            }
            int i4 = kotlinx.coroutines.channels.k.f79365b;
            long j5 = j4 / i4;
            if (qVar.id == j5 || (qVar = Y(j5, qVar)) != null) {
                qVar.b();
                if (v0(qVar, (int) (j4 % i4), j4)) {
                    return true;
                }
                atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1);
            } else if (((q) atomicReferenceFieldUpdater.get(this)).id < j5) {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0215, code lost:
    
        r3 = (kotlinx.coroutines.channels.q) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021c, code lost:
    
        if (r3 != null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.toString():java.lang.String");
    }

    public boolean v1() {
        return u1(f79323e.get(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final String w1() {
        String valueOf;
        q qVar;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("藴\u0001"));
        sb2.append(q0());
        sb2.append(ProtectedSandApp.s("藵\u0001"));
        sb2.append(f79324f.get(this));
        sb2.append(ProtectedSandApp.s("藶\u0001"));
        sb2.append(f79325g.get(this));
        sb2.append(ProtectedSandApp.s("藷\u0001"));
        sb2.append(f79326h.get(this));
        sb2.append(ProtectedSandApp.s("藸\u0001"));
        AtomicLongFieldUpdater atomicLongFieldUpdater = f79323e;
        sb2.append((int) (atomicLongFieldUpdater.get(this) >> 60));
        sb2.append(',');
        sb.append(sb2.toString());
        int i4 = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i4 == 1) {
            sb.append(ProtectedSandApp.s("藻\u0001"));
        } else if (i4 == 2) {
            sb.append(ProtectedSandApp.s("藺\u0001"));
        } else if (i4 == 3) {
            sb.append(ProtectedSandApp.s("藹\u0001"));
        }
        StringBuilder sb3 = new StringBuilder(ProtectedSandApp.s("藼\u0001"));
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79327i;
        sb3.append(w0.b(atomicReferenceFieldUpdater.get(this)));
        sb3.append(ProtectedSandApp.s("藽\u0001"));
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f79328j;
        sb3.append(w0.b(atomicReferenceFieldUpdater2.get(this)));
        sb.append(sb3.toString());
        if (!D0()) {
            sb.append(ProtectedSandApp.s("藾\u0001") + w0.b(f79329k.get(this)));
        }
        sb.append(ProtectedSandApp.s("藿\u0001"));
        List O = kotlin.collections.w.O(atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), f79329k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : O) {
            q qVar2 = (q) obj;
            qVar = kotlinx.coroutines.channels.k.f79364a;
            if (qVar2 != qVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((q) next).id;
            do {
                Object next2 = it.next();
                long j5 = ((q) next2).id;
                if (j4 > j5) {
                    next = next2;
                    j4 = j5;
                }
            } while (it.hasNext());
        }
        q qVar3 = (q) next;
        do {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(w0.b(qVar3));
            sb4.append(ProtectedSandApp.s("蘀\u0001"));
            sb4.append(qVar3.h() ? ProtectedSandApp.s("蘁\u0001") : "");
            sb4.append(qVar3.id);
            sb4.append(ProtectedSandApp.s("蘂\u0001"));
            q qVar4 = (q) qVar3.g();
            sb4.append(qVar4 != null ? w0.b(qVar4) : null);
            sb4.append(',');
            sb.append(sb4.toString());
            int i5 = kotlinx.coroutines.channels.k.f79365b;
            for (int i6 = 0; i6 < i5; i6++) {
                Object y4 = qVar3.y(i6);
                Object x4 = qVar3.x(i6);
                if (y4 instanceof kotlinx.coroutines.p) {
                    valueOf = ProtectedSandApp.s("藨\u0001");
                } else if (y4 instanceof kotlinx.coroutines.selects.m) {
                    valueOf = ProtectedSandApp.s("藫\u0001");
                } else if (y4 instanceof c0) {
                    valueOf = ProtectedSandApp.s("藬\u0001");
                } else if (y4 instanceof b) {
                    valueOf = ProtectedSandApp.s("蘃\u0001");
                } else if (y4 instanceof h0) {
                    valueOf = ProtectedSandApp.s("藮\u0001") + y4 + ')';
                } else {
                    valueOf = String.valueOf(y4);
                }
                sb.append(ProtectedSandApp.s("蘄\u0001") + i6 + ProtectedSandApp.s("蘅\u0001") + valueOf + ',' + x4 + ProtectedSandApp.s("藱\u0001"));
            }
            StringBuilder sb5 = new StringBuilder(ProtectedSandApp.s("蘆\u0001"));
            q qVar5 = (q) qVar3.e();
            sb5.append(qVar5 != null ? w0.b(qVar5) : null);
            sb5.append(ProtectedSandApp.s("蘇\u0001"));
            sb.append(sb5.toString());
            qVar3 = (q) qVar3.e();
        } while (qVar3 != null);
        return sb.toString();
    }

    public /* synthetic */ j(int i4, ld.l lVar, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, (i5 & 2) != 0 ? null : lVar);
    }
}
