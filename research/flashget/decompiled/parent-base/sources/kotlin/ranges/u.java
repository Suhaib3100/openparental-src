package kotlin.ranges;

import androidx.collection.m1;
import androidx.collection.y0;
import androidx.compose.runtime.snapshots.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.ranges.a;
import kotlin.ranges.j;
import kotlin.ranges.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0003\bª\u0001\n\u0002\u0010\u000f\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u0013\u0010\u0014\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u000b\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\r\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u000f\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t*\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0011\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u0018H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001c\u001a\u00020\u0005*\u00020\u001bH\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0014\u0010\u001f\u001a\u00020\t*\u00020\u001eH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010#\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u00020\u0005*\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\t*\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0016\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u0018H\u0087\b¢\u0006\u0004\b)\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010\u0005*\u00020\u001bH\u0087\b¢\u0006\u0004\b+\u0010,\u001a\u0016\u0010-\u001a\u0004\u0018\u00010\t*\u00020\u001eH\u0087\b¢\u0006\u0004\b-\u0010.\u001a\u001d\u0010/\u001a\u0004\u0018\u00010\u0001*\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b/\u00100\u001a\u001d\u00101\u001a\u0004\u0018\u00010\u0005*\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b1\u00102\u001a\u001d\u00103\u001a\u0004\u0018\u00010\t*\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b3\u00104\u001a\u001e\u00107\u001a\u000206*\u00020\u00182\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0004\b7\u00108\u001a\u001e\u00109\u001a\u000206*\u00020\u001b2\b\u00105\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0004\b9\u0010:\u001a\u001e\u0010;\u001a\u000206*\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0004\b;\u0010<\u001a\"\u0010@\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\b@\u0010A\u001a\"\u0010B\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050=2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bB\u0010A\u001a\"\u0010D\u001a\u000206*\b\u0012\u0004\u0012\u00020C0=2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bD\u0010A\u001a\"\u0010F\u001a\u000206*\b\u0012\u0004\u0012\u00020E0=2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bF\u0010A\u001a\"\u0010H\u001a\u000206*\b\u0012\u0004\u0012\u00020G0=2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bH\u0010A\u001a\"\u0010J\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010I2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bJ\u0010K\u001a\"\u0010L\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050I2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bL\u0010K\u001a\"\u0010M\u001a\u000206*\b\u0012\u0004\u0012\u00020C0I2\u0006\u0010?\u001a\u00020>H\u0087\u0002¢\u0006\u0004\bM\u0010K\u001a\u001c\u0010N\u001a\u000206*\u00020\u00182\u0006\u0010?\u001a\u00020>H\u0087\n¢\u0006\u0004\bN\u0010O\u001a\u001c\u0010P\u001a\u000206*\u00020\u001b2\u0006\u0010?\u001a\u00020>H\u0087\n¢\u0006\u0004\bP\u0010Q\u001a\"\u0010R\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010?\u001a\u00020EH\u0087\u0002¢\u0006\u0004\bR\u0010S\u001a\"\u0010T\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050=2\u0006\u0010?\u001a\u00020EH\u0087\u0002¢\u0006\u0004\bT\u0010S\u001a\"\u0010U\u001a\u000206*\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020EH\u0087\u0002¢\u0006\u0004\bU\u0010S\u001a\"\u0010V\u001a\u000206*\b\u0012\u0004\u0012\u00020C0=2\u0006\u0010?\u001a\u00020EH\u0087\u0002¢\u0006\u0004\bV\u0010S\u001a\"\u0010W\u001a\u000206*\b\u0012\u0004\u0012\u00020G0=2\u0006\u0010?\u001a\u00020EH\u0087\u0002¢\u0006\u0004\bW\u0010S\u001a\"\u0010X\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010?\u001a\u00020GH\u0087\u0002¢\u0006\u0004\bX\u0010Y\u001a\"\u0010Z\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050=2\u0006\u0010?\u001a\u00020GH\u0087\u0002¢\u0006\u0004\bZ\u0010Y\u001a\"\u0010[\u001a\u000206*\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020GH\u0087\u0002¢\u0006\u0004\b[\u0010Y\u001a\"\u0010\\\u001a\u000206*\b\u0012\u0004\u0012\u00020C0=2\u0006\u0010?\u001a\u00020GH\u0087\u0002¢\u0006\u0004\b\\\u0010Y\u001a\"\u0010]\u001a\u000206*\b\u0012\u0004\u0012\u00020E0=2\u0006\u0010?\u001a\u00020GH\u0087\u0002¢\u0006\u0004\b]\u0010Y\u001a\"\u0010^\u001a\u000206*\b\u0012\u0004\u0012\u00020E0I2\u0006\u0010?\u001a\u00020GH\u0087\u0002¢\u0006\u0004\b^\u0010_\u001a\"\u0010`\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050=2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b`\u0010a\u001a\"\u0010b\u001a\u000206*\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\bb\u0010a\u001a\"\u0010c\u001a\u000206*\b\u0012\u0004\u0012\u00020C0=2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\bc\u0010a\u001a\"\u0010d\u001a\u000206*\b\u0012\u0004\u0012\u00020E0=2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\bd\u0010a\u001a\"\u0010e\u001a\u000206*\b\u0012\u0004\u0012\u00020G0=2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\be\u0010a\u001a\"\u0010f\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050I2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\bf\u0010g\u001a\"\u0010h\u001a\u000206*\b\u0012\u0004\u0012\u00020>0I2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\bh\u0010g\u001a\"\u0010i\u001a\u000206*\b\u0012\u0004\u0012\u00020C0I2\u0006\u0010?\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\bi\u0010g\u001a\u001c\u0010j\u001a\u000206*\u00020\u001b2\u0006\u0010?\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\bj\u0010k\u001a\"\u0010l\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bl\u0010m\u001a\"\u0010n\u001a\u000206*\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bn\u0010m\u001a\"\u0010o\u001a\u000206*\b\u0012\u0004\u0012\u00020C0=2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bo\u0010m\u001a\"\u0010p\u001a\u000206*\b\u0012\u0004\u0012\u00020E0=2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bp\u0010m\u001a\"\u0010q\u001a\u000206*\b\u0012\u0004\u0012\u00020G0=2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bq\u0010m\u001a\"\u0010r\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010I2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\br\u0010s\u001a\"\u0010t\u001a\u000206*\b\u0012\u0004\u0012\u00020>0I2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bt\u0010s\u001a\"\u0010u\u001a\u000206*\b\u0012\u0004\u0012\u00020C0I2\u0006\u0010?\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\bu\u0010s\u001a\u001c\u0010v\u001a\u000206*\u00020\u00182\u0006\u0010?\u001a\u00020\u0005H\u0087\n¢\u0006\u0004\bv\u0010w\u001a\"\u0010x\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010=2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0004\bx\u0010y\u001a\"\u0010z\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050=2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0004\bz\u0010y\u001a\"\u0010{\u001a\u000206*\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0004\b{\u0010y\u001a\"\u0010|\u001a\u000206*\b\u0012\u0004\u0012\u00020E0=2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0004\b|\u0010y\u001a\"\u0010}\u001a\u000206*\b\u0012\u0004\u0012\u00020G0=2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0004\b}\u0010y\u001a\"\u0010~\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00010I2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0004\b~\u0010\u007f\u001a$\u0010\u0080\u0001\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00050I2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u007f\u001a$\u0010\u0081\u0001\u001a\u000206*\b\u0012\u0004\u0012\u00020>0I2\u0006\u0010?\u001a\u00020CH\u0087\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u007f\u001a\u001f\u0010\u0082\u0001\u001a\u000206*\u00020\u00182\u0006\u0010?\u001a\u00020CH\u0087\n¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u001f\u0010\u0084\u0001\u001a\u000206*\u00020\u001b2\u0006\u0010?\u001a\u00020CH\u0087\n¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a \u0010\u0087\u0001\u001a\u00020\u0000*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a \u0010\u0089\u0001\u001a\u00020\u0004*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a \u0010\u008b\u0001\u001a\u00020\u0000*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a \u0010\u008d\u0001\u001a\u00020\u0000*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a \u0010\u008f\u0001\u001a\u00020\b*\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0086\u0004¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a \u0010\u0091\u0001\u001a\u00020\u0000*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a \u0010\u0093\u0001\u001a\u00020\u0004*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a \u0010\u0095\u0001\u001a\u00020\u0000*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a \u0010\u0097\u0001\u001a\u00020\u0000*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a \u0010\u0099\u0001\u001a\u00020\u0004*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a \u0010\u009b\u0001\u001a\u00020\u0004*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a \u0010\u009d\u0001\u001a\u00020\u0004*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a \u0010\u009f\u0001\u001a\u00020\u0004*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a \u0010¡\u0001\u001a\u00020\u0000*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001a \u0010£\u0001\u001a\u00020\u0004*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\b£\u0001\u0010¤\u0001\u001a \u0010¥\u0001\u001a\u00020\u0000*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\b¥\u0001\u0010¦\u0001\u001a \u0010§\u0001\u001a\u00020\u0000*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001a\u0014\u0010©\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001\u001a\u0014\u0010«\u0001\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0006\b«\u0001\u0010¬\u0001\u001a\u0014\u0010\u00ad\u0001\u001a\u00020\b*\u00020\b¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001\u001a \u0010°\u0001\u001a\u00020\u0000*\u00020\u00002\u0007\u0010¯\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\b°\u0001\u0010±\u0001\u001a \u0010²\u0001\u001a\u00020\u0004*\u00020\u00042\u0007\u0010¯\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\b²\u0001\u0010³\u0001\u001a \u0010´\u0001\u001a\u00020\b*\u00020\b2\u0007\u0010¯\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\b´\u0001\u0010µ\u0001\u001a\u0018\u0010¶\u0001\u001a\u0004\u0018\u00010>*\u00020\u0001H\u0000¢\u0006\u0006\b¶\u0001\u0010·\u0001\u001a\u0018\u0010¸\u0001\u001a\u0004\u0018\u00010>*\u00020\u0005H\u0000¢\u0006\u0006\b¸\u0001\u0010¹\u0001\u001a\u0018\u0010º\u0001\u001a\u0004\u0018\u00010>*\u00020CH\u0000¢\u0006\u0006\bº\u0001\u0010»\u0001\u001a\u0018\u0010¼\u0001\u001a\u0004\u0018\u00010>*\u00020EH\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001\u001a\u0018\u0010¾\u0001\u001a\u0004\u0018\u00010>*\u00020GH\u0000¢\u0006\u0006\b¾\u0001\u0010¿\u0001\u001a\u0018\u0010À\u0001\u001a\u0004\u0018\u00010\u0001*\u00020\u0005H\u0000¢\u0006\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0018\u0010Â\u0001\u001a\u0004\u0018\u00010\u0001*\u00020EH\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0018\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0001*\u00020GH\u0000¢\u0006\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0018\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0005*\u00020EH\u0000¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0018\u0010È\u0001\u001a\u0004\u0018\u00010\u0005*\u00020GH\u0000¢\u0006\u0006\bÈ\u0001\u0010É\u0001\u001a\u0018\u0010Ê\u0001\u001a\u0004\u0018\u00010C*\u00020\u0001H\u0000¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0018\u0010Ì\u0001\u001a\u0004\u0018\u00010C*\u00020\u0005H\u0000¢\u0006\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0018\u0010Î\u0001\u001a\u0004\u0018\u00010C*\u00020EH\u0000¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0018\u0010Ð\u0001\u001a\u0004\u0018\u00010C*\u00020GH\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001\u001a \u0010Ò\u0001\u001a\u00020\u0018*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001\u001a \u0010Ô\u0001\u001a\u00020\u001b*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001\u001a \u0010Ö\u0001\u001a\u00020\u0018*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\bÖ\u0001\u0010×\u0001\u001a \u0010Ø\u0001\u001a\u00020\u0018*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020>H\u0086\u0004¢\u0006\u0006\bØ\u0001\u0010Ù\u0001\u001a \u0010Ú\u0001\u001a\u00020\u001e*\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0086\u0004¢\u0006\u0006\bÚ\u0001\u0010Û\u0001\u001a \u0010Ü\u0001\u001a\u00020\u0018*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001\u001a \u0010Þ\u0001\u001a\u00020\u001b*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\bÞ\u0001\u0010ß\u0001\u001a \u0010à\u0001\u001a\u00020\u0018*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\bà\u0001\u0010á\u0001\u001a \u0010â\u0001\u001a\u00020\u0018*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020\u0001H\u0086\u0004¢\u0006\u0006\bâ\u0001\u0010ã\u0001\u001a \u0010ä\u0001\u001a\u00020\u001b*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\bä\u0001\u0010å\u0001\u001a \u0010æ\u0001\u001a\u00020\u001b*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\bæ\u0001\u0010ç\u0001\u001a \u0010è\u0001\u001a\u00020\u001b*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\bè\u0001\u0010é\u0001\u001a \u0010ê\u0001\u001a\u00020\u001b*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0006\bê\u0001\u0010ë\u0001\u001a \u0010ì\u0001\u001a\u00020\u0018*\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\bì\u0001\u0010í\u0001\u001a \u0010î\u0001\u001a\u00020\u001b*\u00020\u00052\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\bî\u0001\u0010ï\u0001\u001a \u0010ð\u0001\u001a\u00020\u0018*\u00020>2\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\bð\u0001\u0010ñ\u0001\u001a \u0010ò\u0001\u001a\u00020\u0018*\u00020C2\u0007\u0010\u0086\u0001\u001a\u00020CH\u0086\u0004¢\u0006\u0006\bò\u0001\u0010ó\u0001\u001a.\u0010ö\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u00107*\t\u0012\u0004\u0012\u00028\u00000ô\u0001*\u00028\u00002\u0007\u0010õ\u0001\u001a\u00028\u0000¢\u0006\u0006\bö\u0001\u0010÷\u0001\u001a\u001d\u0010ø\u0001\u001a\u00020>*\u00020>2\u0007\u0010õ\u0001\u001a\u00020>¢\u0006\u0006\bø\u0001\u0010ù\u0001\u001a\u001d\u0010ú\u0001\u001a\u00020C*\u00020C2\u0007\u0010õ\u0001\u001a\u00020C¢\u0006\u0006\bú\u0001\u0010û\u0001\u001a\u001d\u0010ü\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010õ\u0001\u001a\u00020\u0001¢\u0006\u0006\bü\u0001\u0010ý\u0001\u001a\u001d\u0010þ\u0001\u001a\u00020\u0005*\u00020\u00052\u0007\u0010õ\u0001\u001a\u00020\u0005¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u001d\u0010\u0080\u0002\u001a\u00020G*\u00020G2\u0007\u0010õ\u0001\u001a\u00020G¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u001d\u0010\u0082\u0002\u001a\u00020E*\u00020E2\u0007\u0010õ\u0001\u001a\u00020E¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a.\u0010\u0085\u0002\u001a\u00028\u0000\"\u000f\b\u0000\u00107*\t\u0012\u0004\u0012\u00028\u00000ô\u0001*\u00028\u00002\u0007\u0010\u0084\u0002\u001a\u00028\u0000¢\u0006\u0006\b\u0085\u0002\u0010÷\u0001\u001a\u001d\u0010\u0086\u0002\u001a\u00020>*\u00020>2\u0007\u0010\u0084\u0002\u001a\u00020>¢\u0006\u0006\b\u0086\u0002\u0010ù\u0001\u001a\u001d\u0010\u0087\u0002\u001a\u00020C*\u00020C2\u0007\u0010\u0084\u0002\u001a\u00020C¢\u0006\u0006\b\u0087\u0002\u0010û\u0001\u001a\u001d\u0010\u0088\u0002\u001a\u00020\u0001*\u00020\u00012\u0007\u0010\u0084\u0002\u001a\u00020\u0001¢\u0006\u0006\b\u0088\u0002\u0010ý\u0001\u001a\u001d\u0010\u0089\u0002\u001a\u00020\u0005*\u00020\u00052\u0007\u0010\u0084\u0002\u001a\u00020\u0005¢\u0006\u0006\b\u0089\u0002\u0010ÿ\u0001\u001a\u001d\u0010\u008a\u0002\u001a\u00020G*\u00020G2\u0007\u0010\u0084\u0002\u001a\u00020G¢\u0006\u0006\b\u008a\u0002\u0010\u0081\u0002\u001a\u001d\u0010\u008b\u0002\u001a\u00020E*\u00020E2\u0007\u0010\u0084\u0002\u001a\u00020E¢\u0006\u0006\b\u008b\u0002\u0010\u0083\u0002\u001a;\u0010\u008c\u0002\u001a\u00028\u0000\"\u000f\b\u0000\u00107*\t\u0012\u0004\u0012\u00028\u00000ô\u0001*\u00028\u00002\t\u0010õ\u0001\u001a\u0004\u0018\u00018\u00002\t\u0010\u0084\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a&\u0010\u008e\u0002\u001a\u00020>*\u00020>2\u0007\u0010õ\u0001\u001a\u00020>2\u0007\u0010\u0084\u0002\u001a\u00020>¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a&\u0010\u0090\u0002\u001a\u00020C*\u00020C2\u0007\u0010õ\u0001\u001a\u00020C2\u0007\u0010\u0084\u0002\u001a\u00020C¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a&\u0010\u0092\u0002\u001a\u00020\u0001*\u00020\u00012\u0007\u0010õ\u0001\u001a\u00020\u00012\u0007\u0010\u0084\u0002\u001a\u00020\u0001¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a&\u0010\u0094\u0002\u001a\u00020\u0005*\u00020\u00052\u0007\u0010õ\u0001\u001a\u00020\u00052\u0007\u0010\u0084\u0002\u001a\u00020\u0005¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a&\u0010\u0096\u0002\u001a\u00020G*\u00020G2\u0007\u0010õ\u0001\u001a\u00020G2\u0007\u0010\u0084\u0002\u001a\u00020G¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a&\u0010\u0098\u0002\u001a\u00020E*\u00020E2\u0007\u0010õ\u0001\u001a\u00020E2\u0007\u0010\u0084\u0002\u001a\u00020E¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002\u001a7\u0010\u009c\u0002\u001a\u00028\u0000\"\u000f\b\u0000\u00107*\t\u0012\u0004\u0012\u00028\u00000ô\u0001*\u00028\u00002\u000e\u0010\u009b\u0002\u001a\t\u0012\u0004\u0012\u00028\u00000\u009a\u0002H\u0007¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a4\u0010\u009e\u0002\u001a\u00028\u0000\"\u000f\b\u0000\u00107*\t\u0012\u0004\u0012\u00028\u00000ô\u0001*\u00028\u00002\r\u0010\u009b\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000=¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a#\u0010 \u0002\u001a\u00020\u0001*\u00020\u00012\r\u0010\u009b\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010=¢\u0006\u0006\b \u0002\u0010¡\u0002\u001a#\u0010¢\u0002\u001a\u00020\u0005*\u00020\u00052\r\u0010\u009b\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050=¢\u0006\u0006\b¢\u0002\u0010£\u0002¨\u0006¤\u0002"}, d2 = {"Lkotlin/ranges/j;", "", "x0", "(Lkotlin/ranges/j;)I", "Lkotlin/ranges/m;", "", "y0", "(Lkotlin/ranges/m;)J", "Lkotlin/ranges/a;", "", "w0", "(Lkotlin/ranges/a;)C", "A0", "(Lkotlin/ranges/j;)Ljava/lang/Integer;", "B0", "(Lkotlin/ranges/m;)Ljava/lang/Long;", "z0", "(Lkotlin/ranges/a;)Ljava/lang/Character;", "Q0", "R0", "P0", "T0", "U0", "S0", "Lkotlin/ranges/l;", "f1", "(Lkotlin/ranges/l;)I", "Lkotlin/ranges/o;", "h1", "(Lkotlin/ranges/o;)J", "Lkotlin/ranges/c;", "d1", "(Lkotlin/ranges/c;)C", "Lkotlin/random/f;", "random", "g1", "(Lkotlin/ranges/l;Lkotlin/random/f;)I", "i1", "(Lkotlin/ranges/o;Lkotlin/random/f;)J", "e1", "(Lkotlin/ranges/c;Lkotlin/random/f;)C", "l1", "(Lkotlin/ranges/l;)Ljava/lang/Integer;", "n1", "(Lkotlin/ranges/o;)Ljava/lang/Long;", "j1", "(Lkotlin/ranges/c;)Ljava/lang/Character;", "m1", "(Lkotlin/ranges/l;Lkotlin/random/f;)Ljava/lang/Integer;", "o1", "(Lkotlin/ranges/o;Lkotlin/random/f;)Ljava/lang/Long;", "k1", "(Lkotlin/ranges/c;Lkotlin/random/f;)Ljava/lang/Character;", "element", "", "T", "(Lkotlin/ranges/l;Ljava/lang/Integer;)Z", "X", "(Lkotlin/ranges/o;Ljava/lang/Long;)Z", "Q", "(Lkotlin/ranges/c;Ljava/lang/Character;)Z", "Lkotlin/ranges/g;", "", "value", "H0", "(Lkotlin/ranges/g;B)Z", "V0", "", "s1", "", "Z", "", "C0", "Lkotlin/ranges/r;", "M0", "(Lkotlin/ranges/r;B)Z", "a1", "x1", "R", "(Lkotlin/ranges/l;B)Z", "V", "(Lkotlin/ranges/o;B)Z", "I0", "(Lkotlin/ranges/g;D)Z", "W0", "j", "t1", "D0", "J0", "(Lkotlin/ranges/g;F)Z", "X0", "k", "u1", "a0", "e0", "(Lkotlin/ranges/r;F)Z", "Y0", "(Lkotlin/ranges/g;I)Z", "l", "v1", "b0", "E0", "b1", "(Lkotlin/ranges/r;I)Z", "o", "y1", "W", "(Lkotlin/ranges/o;I)Z", "K0", "(Lkotlin/ranges/g;J)Z", "m", "w1", "c0", "F0", "N0", "(Lkotlin/ranges/r;J)Z", "p", "z1", "S", "(Lkotlin/ranges/l;J)Z", "L0", "(Lkotlin/ranges/g;S)Z", "Z0", "n", "d0", "G0", "O0", "(Lkotlin/ranges/r;S)Z", "c1", "q", "U", "(Lkotlin/ranges/l;S)Z", "Y", "(Lkotlin/ranges/o;S)Z", "to", "j0", "(IB)Lkotlin/ranges/j;", "r0", "(JB)Lkotlin/ranges/m;", "g0", "(BB)Lkotlin/ranges/j;", "m0", "(SB)Lkotlin/ranges/j;", "f0", "(CC)Lkotlin/ranges/a;", "k0", "(II)Lkotlin/ranges/j;", "s0", "(JI)Lkotlin/ranges/m;", "h0", "(BI)Lkotlin/ranges/j;", "n0", "(SI)Lkotlin/ranges/j;", "q0", "(IJ)Lkotlin/ranges/m;", "t0", "(JJ)Lkotlin/ranges/m;", "p0", "(BJ)Lkotlin/ranges/m;", "v0", "(SJ)Lkotlin/ranges/m;", "l0", "(IS)Lkotlin/ranges/j;", "u0", "(JS)Lkotlin/ranges/m;", "i0", "(BS)Lkotlin/ranges/j;", "o0", "(SS)Lkotlin/ranges/j;", "q1", "(Lkotlin/ranges/j;)Lkotlin/ranges/j;", "r1", "(Lkotlin/ranges/m;)Lkotlin/ranges/m;", "p1", "(Lkotlin/ranges/a;)Lkotlin/ranges/a;", "step", "B1", "(Lkotlin/ranges/j;I)Lkotlin/ranges/j;", "C1", "(Lkotlin/ranges/m;J)Lkotlin/ranges/m;", "A1", "(Lkotlin/ranges/a;I)Lkotlin/ranges/a;", "F1", "(I)Ljava/lang/Byte;", "G1", "(J)Ljava/lang/Byte;", "H1", "(S)Ljava/lang/Byte;", "D1", "(D)Ljava/lang/Byte;", "E1", "(F)Ljava/lang/Byte;", "K1", "(J)Ljava/lang/Integer;", "I1", "(D)Ljava/lang/Integer;", "J1", "(F)Ljava/lang/Integer;", "L1", "(D)Ljava/lang/Long;", "M1", "(F)Ljava/lang/Long;", "P1", "(I)Ljava/lang/Short;", "Q1", "(J)Ljava/lang/Short;", "N1", "(D)Ljava/lang/Short;", "O1", "(F)Ljava/lang/Short;", "V1", "(IB)Lkotlin/ranges/l;", "d2", "(JB)Lkotlin/ranges/o;", "S1", "(BB)Lkotlin/ranges/l;", "Y1", "(SB)Lkotlin/ranges/l;", "R1", "(CC)Lkotlin/ranges/c;", "W1", "(II)Lkotlin/ranges/l;", "e2", "(JI)Lkotlin/ranges/o;", "T1", "(BI)Lkotlin/ranges/l;", "Z1", "(SI)Lkotlin/ranges/l;", "c2", "(IJ)Lkotlin/ranges/o;", "f2", "(JJ)Lkotlin/ranges/o;", "b2", "(BJ)Lkotlin/ranges/o;", "h2", "(SJ)Lkotlin/ranges/o;", "X1", "(IS)Lkotlin/ranges/l;", "g2", "(JS)Lkotlin/ranges/o;", "U1", "(BS)Lkotlin/ranges/l;", "a2", "(SS)Lkotlin/ranges/l;", "", "minimumValue", "w", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "r", "(BB)B", "x", "(SS)S", "u", "(II)I", "v", "(JJ)J", "t", "(FF)F", "s", "(DD)D", "maximumValue", "D", "y", "E", "B", "C", "A", "z", "M", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "F", "(BBB)B", "P", "(SSS)S", "I", "(III)I", "K", "(JJJ)J", "H", "(FFF)F", "G", "(DDD)D", "Lkotlin/ranges/f;", "range", "N", "(Ljava/lang/Comparable;Lkotlin/ranges/f;)Ljava/lang/Comparable;", "O", "(Ljava/lang/Comparable;Lkotlin/ranges/g;)Ljava/lang/Comparable;", "J", "(ILkotlin/ranges/g;)I", "L", "(JLkotlin/ranges/g;)J", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
@r1({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes7.dex */
public class u extends t {
    public static float A(float f4, float f5) {
        return f4 > f5 ? f5 : f4;
    }

    @fg.m
    @c1(version = "1.7")
    public static final Integer A0(@fg.l j jVar) {
        l0.p(jVar, ProtectedSandApp.s("旮\u0001"));
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.getFirst());
    }

    @fg.l
    public static final a A1(@fg.l a aVar, int i4) {
        l0.p(aVar, ProtectedSandApp.s("旮\u0001"));
        t.a(i4 > 0, Integer.valueOf(i4));
        a.Companion companion = a.INSTANCE;
        char first = aVar.getFirst();
        char last = aVar.getLast();
        if (aVar.getStep() <= 0) {
            i4 = -i4;
        }
        companion.getClass();
        return new a(first, last, i4);
    }

    public static int B(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    @fg.m
    @c1(version = "1.7")
    public static final Long B0(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("旮\u0001"));
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.getFirst());
    }

    @fg.l
    public static j B1(@fg.l j jVar, int i4) {
        l0.p(jVar, ProtectedSandApp.s("旮\u0001"));
        t.a(i4 > 0, Integer.valueOf(i4));
        j.Companion companion = j.INSTANCE;
        int first = jVar.getFirst();
        int last = jVar.getLast();
        if (jVar.getStep() <= 0) {
            i4 = -i4;
        }
        companion.getClass();
        return new j(first, last, i4);
    }

    public static long C(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean C0(g gVar, byte b5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Float.valueOf(b5));
    }

    @fg.l
    public static final m C1(@fg.l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("旮\u0001"));
        t.a(j4 > 0, Long.valueOf(j4));
        m.Companion companion = m.INSTANCE;
        long first = mVar.getFirst();
        long last = mVar.getLast();
        if (mVar.getStep() <= 0) {
            j4 = -j4;
        }
        long j5 = j4;
        companion.getClass();
        return new m(first, last, j5);
    }

    @fg.l
    public static <T extends Comparable<? super T>> T D(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("旮\u0001"));
        l0.p(t5, ProtectedSandApp.s("旯\u0001"));
        return t4.compareTo(t5) > 0 ? t5 : t4;
    }

    @kd.i(name = "floatRangeContains")
    public static final boolean D0(@fg.l g<Float> gVar, double d5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Float.valueOf((float) d5));
    }

    @fg.m
    public static final Byte D1(double d5) {
        if (-128.0d > d5 || d5 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d5);
    }

    public static final short E(short s4, short s5) {
        return s4 > s5 ? s5 : s4;
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean E0(g gVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Float.valueOf(i4));
    }

    @fg.m
    public static final Byte E1(float f4) {
        if (-128.0f > f4 || f4 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f4);
    }

    public static final byte F(byte b5, byte b6, byte b7) {
        if (b6 <= b7) {
            return b5 < b6 ? b6 : b5 > b7 ? b7 : b5;
        }
        throw new IllegalArgumentException(m1.a(ProtectedSandApp.s("旰\u0001"), b7, ProtectedSandApp.s("旱\u0001"), b6, '.'));
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean F0(g gVar, long j4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Float.valueOf(j4));
    }

    @fg.m
    public static final Byte F1(int i4) {
        if (new l(-128, 127, 1).r(i4)) {
            return Byte.valueOf((byte) i4);
        }
        return null;
    }

    public static double G(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
        }
        StringBuilder a5 = com.airbnb.lottie.parser.moshi.e.a(ProtectedSandApp.s("旰\u0001"), d7, ProtectedSandApp.s("旱\u0001"));
        a5.append(d6);
        a5.append('.');
        throw new IllegalArgumentException(a5.toString());
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "floatRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean G0(g gVar, short s4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Float.valueOf(s4));
    }

    @fg.m
    public static final Byte G1(long j4) {
        if (new o(-128L, 127L).r(j4)) {
            return Byte.valueOf((byte) j4);
        }
        return null;
    }

    public static float H(float f4, float f5, float f6) {
        if (f5 <= f6) {
            return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旰\u0001") + f6 + ProtectedSandApp.s("旱\u0001") + f5 + '.');
    }

    @kd.i(name = "intRangeContains")
    public static final boolean H0(@fg.l g<Integer> gVar, byte b5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Integer.valueOf(b5));
    }

    @fg.m
    public static final Byte H1(short s4) {
        if (L0(new l(-128, 127, 1), s4)) {
            return Byte.valueOf((byte) s4);
        }
        return null;
    }

    public static int I(int i4, int i5, int i6) {
        if (i5 <= i6) {
            return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
        }
        throw new IllegalArgumentException(m1.a(ProtectedSandApp.s("旰\u0001"), i6, ProtectedSandApp.s("旱\u0001"), i5, '.'));
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "intRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean I0(g gVar, double d5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Integer I1 = I1(d5);
        if (I1 != null) {
            return gVar.b(I1);
        }
        return false;
    }

    @fg.m
    public static final Integer I1(double d5) {
        if (-2.147483648E9d > d5 || d5 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d5);
    }

    public static int J(int i4, @fg.l g<Integer> gVar) {
        l0.p(gVar, ProtectedSandApp.s("旲\u0001"));
        if (gVar instanceof f) {
            return ((Number) N(Integer.valueOf(i4), (f) gVar)).intValue();
        }
        if (!gVar.isEmpty()) {
            return i4 < gVar.c().intValue() ? gVar.c().intValue() : i4 > gVar.h().intValue() ? gVar.h().intValue() : i4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旳\u0001") + gVar + '.');
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "intRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean J0(g gVar, float f4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Integer J1 = J1(f4);
        if (J1 != null) {
            return gVar.b(J1);
        }
        return false;
    }

    @fg.m
    public static final Integer J1(float f4) {
        if (-2.1474836E9f > f4 || f4 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f4);
    }

    public static long K(long j4, long j5, long j6) {
        if (j5 <= j6) {
            return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
        }
        throw new IllegalArgumentException(y0.a(f0.a(ProtectedSandApp.s("旰\u0001"), j6, ProtectedSandApp.s("旱\u0001")), j5, '.'));
    }

    @kd.i(name = "intRangeContains")
    public static boolean K0(@fg.l g<Integer> gVar, long j4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Integer K1 = K1(j4);
        if (K1 != null) {
            return gVar.b(K1);
        }
        return false;
    }

    @fg.m
    public static final Integer K1(long j4) {
        if (new o(-2147483648L, 2147483647L).r(j4)) {
            return Integer.valueOf((int) j4);
        }
        return null;
    }

    public static long L(long j4, @fg.l g<Long> gVar) {
        l0.p(gVar, ProtectedSandApp.s("旲\u0001"));
        if (gVar instanceof f) {
            return ((Number) N(Long.valueOf(j4), (f) gVar)).longValue();
        }
        if (!gVar.isEmpty()) {
            return j4 < gVar.c().longValue() ? gVar.c().longValue() : j4 > gVar.h().longValue() ? gVar.h().longValue() : j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旳\u0001") + gVar + '.');
    }

    @kd.i(name = "intRangeContains")
    public static final boolean L0(@fg.l g<Integer> gVar, short s4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Integer.valueOf(s4));
    }

    @fg.m
    public static final Long L1(double d5) {
        if (-9.223372036854776E18d > d5 || d5 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d5);
    }

    @fg.l
    public static final <T extends Comparable<? super T>> T M(@fg.l T t4, @fg.m T t5, @fg.m T t6) {
        l0.p(t4, ProtectedSandApp.s("旮\u0001"));
        if (t5 == null || t6 == null) {
            if (t5 != null && t4.compareTo(t5) < 0) {
                return t5;
            }
            if (t6 != null && t4.compareTo(t6) > 0) {
                return t6;
            }
        } else {
            if (t5.compareTo(t6) > 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("旰\u0001") + t6 + ProtectedSandApp.s("旱\u0001") + t5 + '.');
            }
            if (t4.compareTo(t5) < 0) {
                return t5;
            }
            if (t4.compareTo(t6) > 0) {
                return t6;
            }
        }
        return t4;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "intRangeContains")
    public static final boolean M0(@fg.l r<Integer> rVar, byte b5) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Integer.valueOf(b5));
    }

    @fg.m
    public static final Long M1(float f4) {
        if (-9.223372E18f > f4 || f4 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f4);
    }

    @fg.l
    @c1(version = "1.1")
    public static <T extends Comparable<? super T>> T N(@fg.l T t4, @fg.l f<T> fVar) {
        l0.p(t4, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("旲\u0001"));
        if (!fVar.isEmpty()) {
            return (!fVar.f(t4, fVar.c()) || fVar.f(fVar.c(), t4)) ? (!fVar.f(fVar.h(), t4) || fVar.f(t4, fVar.h())) ? t4 : fVar.h() : fVar.c();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旳\u0001") + fVar + '.');
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "intRangeContains")
    public static final boolean N0(@fg.l r<Integer> rVar, long j4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        Integer K1 = K1(j4);
        if (K1 != null) {
            return rVar.b(K1);
        }
        return false;
    }

    @fg.m
    public static final Short N1(double d5) {
        if (-32768.0d > d5 || d5 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d5);
    }

    @fg.l
    public static final <T extends Comparable<? super T>> T O(@fg.l T t4, @fg.l g<T> gVar) {
        l0.p(t4, ProtectedSandApp.s("旮\u0001"));
        l0.p(gVar, ProtectedSandApp.s("旲\u0001"));
        if (gVar instanceof f) {
            return (T) N(t4, (f) gVar);
        }
        if (!gVar.isEmpty()) {
            return t4.compareTo(gVar.c()) < 0 ? gVar.c() : t4.compareTo(gVar.h()) > 0 ? gVar.h() : t4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("旳\u0001") + gVar + '.');
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "intRangeContains")
    public static final boolean O0(@fg.l r<Integer> rVar, short s4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Integer.valueOf(s4));
    }

    @fg.m
    public static final Short O1(float f4) {
        if (-32768.0f > f4 || f4 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f4);
    }

    public static final short P(short s4, short s5, short s6) {
        if (s5 <= s6) {
            return s4 < s5 ? s5 : s4 > s6 ? s6 : s4;
        }
        throw new IllegalArgumentException(m1.a(ProtectedSandApp.s("旰\u0001"), s6, ProtectedSandApp.s("旱\u0001"), s5, '.'));
    }

    @c1(version = "1.7")
    public static final char P0(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("旮\u0001"));
        if (!aVar.isEmpty()) {
            return aVar.getLast();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旴\u0001") + aVar + ProtectedSandApp.s("旵\u0001"));
    }

    @fg.m
    public static final Short P1(int i4) {
        if (new l(-32768, androidx.compose.ui.layout.a0.f18904a, 1).r(i4)) {
            return Short.valueOf((short) i4);
        }
        return null;
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final boolean Q(c cVar, Character ch) {
        l0.p(cVar, ProtectedSandApp.s("旮\u0001"));
        return ch != null && cVar.r(ch.charValue());
    }

    @c1(version = "1.7")
    public static final int Q0(@fg.l j jVar) {
        l0.p(jVar, ProtectedSandApp.s("旮\u0001"));
        if (!jVar.isEmpty()) {
            return jVar.getLast();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旴\u0001") + jVar + ProtectedSandApp.s("旵\u0001"));
    }

    @fg.m
    public static final Short Q1(long j4) {
        if (new o(-32768L, 32767L).r(j4)) {
            return Short.valueOf((short) j4);
        }
        return null;
    }

    @kotlin.internal.f
    private static final boolean R(l lVar, byte b5) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        return H0(lVar, b5);
    }

    @c1(version = "1.7")
    public static final long R0(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("旮\u0001"));
        if (!mVar.isEmpty()) {
            return mVar.getLast();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旴\u0001") + mVar + ProtectedSandApp.s("旵\u0001"));
    }

    @fg.l
    public static final c R1(char c5, char c6) {
        if (l0.t(c6, 0) > 0) {
            return new c(c5, (char) (c6 - 1), 1);
        }
        c.INSTANCE.getClass();
        return c.f75463g;
    }

    @kotlin.internal.f
    private static final boolean S(l lVar, long j4) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        return K0(lVar, j4);
    }

    @fg.m
    @c1(version = "1.7")
    public static final Character S0(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("旮\u0001"));
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.getLast());
    }

    @fg.l
    public static final l S1(byte b5, byte b6) {
        return new l(b5, b6 - 1, 1);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final boolean T(l lVar, Integer num) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        return num != null && lVar.r(num.intValue());
    }

    @fg.m
    @c1(version = "1.7")
    public static final Integer T0(@fg.l j jVar) {
        l0.p(jVar, ProtectedSandApp.s("旮\u0001"));
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.getLast());
    }

    @fg.l
    public static final l T1(byte b5, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new l(b5, i4 - 1, 1);
        }
        l.INSTANCE.getClass();
        return l.f75481g;
    }

    @kotlin.internal.f
    private static final boolean U(l lVar, short s4) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        return L0(lVar, s4);
    }

    @fg.m
    @c1(version = "1.7")
    public static final Long U0(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("旮\u0001"));
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.getLast());
    }

    @fg.l
    public static final l U1(byte b5, short s4) {
        return new l(b5, s4 - 1, 1);
    }

    @kotlin.internal.f
    private static final boolean V(o oVar, byte b5) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        return V0(oVar, b5);
    }

    @kd.i(name = "longRangeContains")
    public static final boolean V0(@fg.l g<Long> gVar, byte b5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Long.valueOf(b5));
    }

    @fg.l
    public static final l V1(int i4, byte b5) {
        return new l(i4, b5 - 1, 1);
    }

    @kotlin.internal.f
    private static final boolean W(o oVar, int i4) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        return Y0(oVar, i4);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "longRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean W0(g gVar, double d5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Long L1 = L1(d5);
        if (L1 != null) {
            return gVar.b(L1);
        }
        return false;
    }

    @fg.l
    public static l W1(int i4, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new l(i4, i5 - 1, 1);
        }
        l.INSTANCE.getClass();
        return l.f75481g;
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final boolean X(o oVar, Long l4) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        return l4 != null && oVar.r(l4.longValue());
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "longRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean X0(g gVar, float f4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Long M1 = M1(f4);
        if (M1 != null) {
            return gVar.b(M1);
        }
        return false;
    }

    @fg.l
    public static final l X1(int i4, short s4) {
        return new l(i4, s4 - 1, 1);
    }

    @kotlin.internal.f
    private static final boolean Y(o oVar, short s4) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        return Z0(oVar, s4);
    }

    @kd.i(name = "longRangeContains")
    public static final boolean Y0(@fg.l g<Long> gVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Long.valueOf(i4));
    }

    @fg.l
    public static final l Y1(short s4, byte b5) {
        return new l(s4, b5 - 1, 1);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean Z(g gVar, byte b5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Double.valueOf(b5));
    }

    @kd.i(name = "longRangeContains")
    public static final boolean Z0(@fg.l g<Long> gVar, short s4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Long.valueOf(s4));
    }

    @fg.l
    public static final l Z1(short s4, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new l(s4, i4 - 1, 1);
        }
        l.INSTANCE.getClass();
        return l.f75481g;
    }

    @kd.i(name = "doubleRangeContains")
    public static final boolean a0(@fg.l g<Double> gVar, float f4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Double.valueOf(f4));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "longRangeContains")
    public static final boolean a1(@fg.l r<Long> rVar, byte b5) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Long.valueOf(b5));
    }

    @fg.l
    public static final l a2(short s4, short s5) {
        return new l(s4, s5 - 1, 1);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean b0(g gVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Double.valueOf(i4));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "longRangeContains")
    public static final boolean b1(@fg.l r<Long> rVar, int i4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Long.valueOf(i4));
    }

    @fg.l
    public static final o b2(byte b5, long j4) {
        if (j4 > Long.MIN_VALUE) {
            return new o(b5, j4 - 1);
        }
        o.INSTANCE.getClass();
        return o.f75491g;
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean c0(g gVar, long j4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Double.valueOf(j4));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "longRangeContains")
    public static final boolean c1(@fg.l r<Long> rVar, short s4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Long.valueOf(s4));
    }

    @fg.l
    public static final o c2(int i4, long j4) {
        if (j4 > Long.MIN_VALUE) {
            return new o(i4, j4 - 1);
        }
        o.INSTANCE.getClass();
        return o.f75491g;
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "doubleRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean d0(g gVar, short s4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Double.valueOf(s4));
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final char d1(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("旮\u0001"));
        return e1(cVar, kotlin.random.f.INSTANCE);
    }

    @fg.l
    public static final o d2(long j4, byte b5) {
        return new o(j4, b5 - 1);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "doubleRangeContains")
    public static final boolean e0(@fg.l r<Double> rVar, float f4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Double.valueOf(f4));
    }

    @c1(version = "1.3")
    public static final char e1(@fg.l c cVar, @fg.l kotlin.random.f fVar) {
        l0.p(cVar, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("时\u0001"));
        try {
            return (char) fVar.n(cVar.getFirst(), cVar.getLast() + 1);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @fg.l
    public static final o e2(long j4, int i4) {
        return new o(j4, i4 - 1);
    }

    @fg.l
    public static final a f0(char c5, char c6) {
        a.INSTANCE.getClass();
        return new a(c5, c6, -1);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final int f1(l lVar) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        return g1(lVar, kotlin.random.f.INSTANCE);
    }

    @fg.l
    public static final o f2(long j4, long j5) {
        if (j5 > Long.MIN_VALUE) {
            return new o(j4, j5 - 1);
        }
        o.INSTANCE.getClass();
        return o.f75491g;
    }

    @fg.l
    public static final j g0(byte b5, byte b6) {
        j.INSTANCE.getClass();
        return new j(b5, b6, -1);
    }

    @c1(version = "1.3")
    public static int g1(@fg.l l lVar, @fg.l kotlin.random.f fVar) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("时\u0001"));
        try {
            return kotlin.random.g.h(fVar, lVar);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @fg.l
    public static final o g2(long j4, short s4) {
        return new o(j4, s4 - 1);
    }

    @fg.l
    public static final j h0(byte b5, int i4) {
        j.INSTANCE.getClass();
        return new j(b5, i4, -1);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final long h1(o oVar) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        return i1(oVar, kotlin.random.f.INSTANCE);
    }

    @fg.l
    public static final o h2(short s4, long j4) {
        if (j4 > Long.MIN_VALUE) {
            return new o(s4, j4 - 1);
        }
        o.INSTANCE.getClass();
        return o.f75491g;
    }

    @fg.l
    public static final j i0(byte b5, short s4) {
        j.INSTANCE.getClass();
        return new j(b5, s4, -1);
    }

    @c1(version = "1.3")
    public static final long i1(@fg.l o oVar, @fg.l kotlin.random.f fVar) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("时\u0001"));
        try {
            return kotlin.random.g.i(fVar, oVar);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "byteRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean j(g gVar, double d5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Byte D1 = D1(d5);
        if (D1 != null) {
            return gVar.b(D1);
        }
        return false;
    }

    @fg.l
    public static final j j0(int i4, byte b5) {
        j.INSTANCE.getClass();
        return new j(i4, b5, -1);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final Character j1(c cVar) {
        l0.p(cVar, ProtectedSandApp.s("旮\u0001"));
        return k1(cVar, kotlin.random.f.INSTANCE);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "byteRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean k(g gVar, float f4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Byte E1 = E1(f4);
        if (E1 != null) {
            return gVar.b(E1);
        }
        return false;
    }

    @fg.l
    public static j k0(int i4, int i5) {
        j.INSTANCE.getClass();
        return new j(i4, i5, -1);
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @c1(version = "1.4")
    public static final Character k1(@fg.l c cVar, @fg.l kotlin.random.f fVar) {
        l0.p(cVar, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("时\u0001"));
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) fVar.n(cVar.getFirst(), cVar.getLast() + 1));
    }

    @kd.i(name = "byteRangeContains")
    public static final boolean l(@fg.l g<Byte> gVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Byte F1 = F1(i4);
        if (F1 != null) {
            return gVar.b(F1);
        }
        return false;
    }

    @fg.l
    public static final j l0(int i4, short s4) {
        j.INSTANCE.getClass();
        return new j(i4, s4, -1);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final Integer l1(l lVar) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        return m1(lVar, kotlin.random.f.INSTANCE);
    }

    @kd.i(name = "byteRangeContains")
    public static final boolean m(@fg.l g<Byte> gVar, long j4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Byte G1 = G1(j4);
        if (G1 != null) {
            return gVar.b(G1);
        }
        return false;
    }

    @fg.l
    public static final j m0(short s4, byte b5) {
        j.INSTANCE.getClass();
        return new j(s4, b5, -1);
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @c1(version = "1.4")
    public static final Integer m1(@fg.l l lVar, @fg.l kotlin.random.f fVar) {
        l0.p(lVar, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("时\u0001"));
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.g.h(fVar, lVar));
    }

    @kd.i(name = "byteRangeContains")
    public static final boolean n(@fg.l g<Byte> gVar, short s4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Byte H1 = H1(s4);
        if (H1 != null) {
            return gVar.b(H1);
        }
        return false;
    }

    @fg.l
    public static final j n0(short s4, int i4) {
        j.INSTANCE.getClass();
        return new j(s4, i4, -1);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final Long n1(o oVar) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        return o1(oVar, kotlin.random.f.INSTANCE);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "byteRangeContains")
    public static final boolean o(@fg.l r<Byte> rVar, int i4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        Byte F1 = F1(i4);
        if (F1 != null) {
            return rVar.b(F1);
        }
        return false;
    }

    @fg.l
    public static final j o0(short s4, short s5) {
        j.INSTANCE.getClass();
        return new j(s4, s5, -1);
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @c1(version = "1.4")
    public static final Long o1(@fg.l o oVar, @fg.l kotlin.random.f fVar) {
        l0.p(oVar, ProtectedSandApp.s("旮\u0001"));
        l0.p(fVar, ProtectedSandApp.s("时\u0001"));
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.g.i(fVar, oVar));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "byteRangeContains")
    public static final boolean p(@fg.l r<Byte> rVar, long j4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        Byte G1 = G1(j4);
        if (G1 != null) {
            return rVar.b(G1);
        }
        return false;
    }

    @fg.l
    public static final m p0(byte b5, long j4) {
        m.INSTANCE.getClass();
        return new m(b5, j4, -1L);
    }

    @fg.l
    public static final a p1(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("旮\u0001"));
        a.Companion companion = a.INSTANCE;
        char last = aVar.getLast();
        char first = aVar.getFirst();
        int i4 = -aVar.getStep();
        companion.getClass();
        return new a(last, first, i4);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "byteRangeContains")
    public static final boolean q(@fg.l r<Byte> rVar, short s4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        Byte H1 = H1(s4);
        if (H1 != null) {
            return rVar.b(H1);
        }
        return false;
    }

    @fg.l
    public static final m q0(int i4, long j4) {
        m.INSTANCE.getClass();
        return new m(i4, j4, -1L);
    }

    @fg.l
    public static j q1(@fg.l j jVar) {
        l0.p(jVar, ProtectedSandApp.s("旮\u0001"));
        j.Companion companion = j.INSTANCE;
        int last = jVar.getLast();
        int first = jVar.getFirst();
        int i4 = -jVar.getStep();
        companion.getClass();
        return new j(last, first, i4);
    }

    public static final byte r(byte b5, byte b6) {
        return b5 < b6 ? b6 : b5;
    }

    @fg.l
    public static final m r0(long j4, byte b5) {
        m.INSTANCE.getClass();
        return new m(j4, b5, -1L);
    }

    @fg.l
    public static final m r1(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("旮\u0001"));
        m.Companion companion = m.INSTANCE;
        long last = mVar.getLast();
        long first = mVar.getFirst();
        long j4 = -mVar.getStep();
        companion.getClass();
        return new m(last, first, j4);
    }

    public static double s(double d5, double d6) {
        return d5 < d6 ? d6 : d5;
    }

    @fg.l
    public static final m s0(long j4, int i4) {
        m.INSTANCE.getClass();
        return new m(j4, i4, -1L);
    }

    @kd.i(name = "shortRangeContains")
    public static final boolean s1(@fg.l g<Short> gVar, byte b5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        return gVar.b(Short.valueOf(b5));
    }

    public static float t(float f4, float f5) {
        return f4 < f5 ? f5 : f4;
    }

    @fg.l
    public static final m t0(long j4, long j5) {
        m.INSTANCE.getClass();
        return new m(j4, j5, -1L);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "shortRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean t1(g gVar, double d5) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Short N1 = N1(d5);
        if (N1 != null) {
            return gVar.b(N1);
        }
        return false;
    }

    public static int u(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }

    @fg.l
    public static final m u0(long j4, short s4) {
        m.INSTANCE.getClass();
        return new m(j4, s4, -1L);
    }

    @kotlin.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kd.i(name = "shortRangeContains")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean u1(g gVar, float f4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Short O1 = O1(f4);
        if (O1 != null) {
            return gVar.b(O1);
        }
        return false;
    }

    public static long v(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    @fg.l
    public static final m v0(short s4, long j4) {
        m.INSTANCE.getClass();
        return new m(s4, j4, -1L);
    }

    @kd.i(name = "shortRangeContains")
    public static final boolean v1(@fg.l g<Short> gVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Short P1 = P1(i4);
        if (P1 != null) {
            return gVar.b(P1);
        }
        return false;
    }

    @fg.l
    public static <T extends Comparable<? super T>> T w(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("旮\u0001"));
        l0.p(t5, ProtectedSandApp.s("旷\u0001"));
        return t4.compareTo(t5) < 0 ? t5 : t4;
    }

    @c1(version = "1.7")
    public static final char w0(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("旮\u0001"));
        if (!aVar.isEmpty()) {
            return aVar.getFirst();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旴\u0001") + aVar + ProtectedSandApp.s("旵\u0001"));
    }

    @kd.i(name = "shortRangeContains")
    public static final boolean w1(@fg.l g<Short> gVar, long j4) {
        l0.p(gVar, ProtectedSandApp.s("旮\u0001"));
        Short Q1 = Q1(j4);
        if (Q1 != null) {
            return gVar.b(Q1);
        }
        return false;
    }

    public static final short x(short s4, short s5) {
        return s4 < s5 ? s5 : s4;
    }

    @c1(version = "1.7")
    public static final int x0(@fg.l j jVar) {
        l0.p(jVar, ProtectedSandApp.s("旮\u0001"));
        if (!jVar.isEmpty()) {
            return jVar.getFirst();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旴\u0001") + jVar + ProtectedSandApp.s("旵\u0001"));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "shortRangeContains")
    public static final boolean x1(@fg.l r<Short> rVar, byte b5) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        return rVar.b(Short.valueOf(b5));
    }

    public static final byte y(byte b5, byte b6) {
        return b5 > b6 ? b6 : b5;
    }

    @c1(version = "1.7")
    public static final long y0(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("旮\u0001"));
        if (!mVar.isEmpty()) {
            return mVar.getFirst();
        }
        throw new NoSuchElementException(ProtectedSandApp.s("旴\u0001") + mVar + ProtectedSandApp.s("旵\u0001"));
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "shortRangeContains")
    public static final boolean y1(@fg.l r<Short> rVar, int i4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        Short P1 = P1(i4);
        if (P1 != null) {
            return rVar.b(P1);
        }
        return false;
    }

    public static double z(double d5, double d6) {
        return d5 > d6 ? d6 : d5;
    }

    @fg.m
    @c1(version = "1.7")
    public static final Character z0(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("旮\u0001"));
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.getFirst());
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.9")
    @kd.i(name = "shortRangeContains")
    public static final boolean z1(@fg.l r<Short> rVar, long j4) {
        l0.p(rVar, ProtectedSandApp.s("旮\u0001"));
        Short Q1 = Q1(j4);
        if (Q1 != null) {
            return rVar.b(Q1);
        }
        return false;
    }
}
