package kotlin.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.f;
import kotlin.o2;
import kotlin.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bR\u001a\u0018\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0003\u001a \u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\u0003\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u0003\u001a\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0003\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0003\u001a \u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u000b\u001a\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0003\u001a\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0003\u001a\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0003\u001a\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u000b\u001a\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0003\u001a\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0019\u0010\u0003\u001a\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u0003\u001a\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001b\u0010\u0003\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\u0003\u001a\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001c\u0010\u0003\u001a\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u0003\u001a\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001e\u0010\u0003\u001a\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001f\u0010\u0003\u001a\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b \u0010\u0003\u001a \u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b#\u0010\u000b\u001a \u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b$\u0010\u000b\u001a\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b&\u0010\u000b\u001a\u001c\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0087\b¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010,\u001a\u00020\u0000*\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b,\u0010\u000b\u001a\u001c\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b.\u0010\u000b\u001a\u001c\u0010/\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020'H\u0087\b¢\u0006\u0004\b/\u0010*\u001a\u0014\u00100\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b0\u0010\u0003\u001a\u0014\u00101\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b1\u0010\u0003\u001a\u001c\u00103\u001a\u00020\u0000*\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b3\u0010\u000b\u001a\u0013\u00104\u001a\u00020'*\u00020\u0000H\u0007¢\u0006\u0004\b4\u00105\u001a\u0013\u00107\u001a\u000206*\u00020\u0000H\u0007¢\u0006\u0004\b7\u00108\u001a\u0018\u0010:\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b:\u0010;\u001a\u0018\u0010<\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b<\u0010;\u001a\u0018\u0010=\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b=\u0010;\u001a\u0018\u0010(\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b(\u0010;\u001a\u0018\u0010>\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b>\u0010;\u001a\u0018\u0010?\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b?\u0010;\u001a \u0010@\u001a\u0002092\u0006\u0010\t\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b@\u0010A\u001a\u0018\u0010B\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bB\u0010;\u001a\u0018\u0010C\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bC\u0010;\u001a\u0018\u0010D\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bD\u0010;\u001a\u0018\u0010E\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bE\u0010;\u001a\u0018\u0010F\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bF\u0010;\u001a\u0018\u0010G\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bG\u0010;\u001a \u0010H\u001a\u0002092\u0006\u0010\u0001\u001a\u0002092\u0006\u0010\t\u001a\u000209H\u0087\b¢\u0006\u0004\bH\u0010A\u001a\u0018\u0010I\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bI\u0010;\u001a\u0018\u0010J\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bJ\u0010;\u001a\u0018\u0010K\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bK\u0010;\u001a\u001f\u0010L\u001a\u0002092\u0006\u0010\u0001\u001a\u0002092\u0006\u0010\u0016\u001a\u000209H\u0007¢\u0006\u0004\bL\u0010A\u001a\u0018\u0010M\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bM\u0010;\u001a\u0018\u0010N\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bN\u0010;\u001a\u0017\u0010O\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0007¢\u0006\u0004\bO\u0010;\u001a\u0018\u0010P\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bP\u0010;\u001a\u0018\u0010Q\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bQ\u0010;\u001a\u0018\u0010R\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bR\u0010;\u001a\u0017\u0010S\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0007¢\u0006\u0004\bS\u0010;\u001a\u0018\u0010T\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bT\u0010;\u001a\u0018\u0010U\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bU\u0010;\u001a\u0018\u0010V\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bV\u0010;\u001a \u0010W\u001a\u0002092\u0006\u0010!\u001a\u0002092\u0006\u0010\"\u001a\u000209H\u0087\b¢\u0006\u0004\bW\u0010A\u001a \u0010X\u001a\u0002092\u0006\u0010!\u001a\u0002092\u0006\u0010\"\u001a\u000209H\u0087\b¢\u0006\u0004\bX\u0010A\u001a\u0018\u0010\u0001\u001a\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\b\u0001\u0010;\u001a\u001c\u0010Y\u001a\u000209*\u0002092\u0006\u0010\u0001\u001a\u000209H\u0087\b¢\u0006\u0004\bY\u0010A\u001a\u001c\u0010Z\u001a\u000209*\u0002092\u0006\u0010(\u001a\u00020'H\u0087\b¢\u0006\u0004\bZ\u0010[\u001a\u001c\u0010\\\u001a\u000209*\u0002092\u0006\u0010+\u001a\u000209H\u0087\b¢\u0006\u0004\b\\\u0010A\u001a\u001c\u0010]\u001a\u000209*\u0002092\u0006\u0010-\u001a\u000209H\u0087\b¢\u0006\u0004\b]\u0010A\u001a\u001c\u0010^\u001a\u000209*\u0002092\u0006\u0010-\u001a\u00020'H\u0087\b¢\u0006\u0004\b^\u0010[\u001a\u0014\u0010_\u001a\u000209*\u000209H\u0087\b¢\u0006\u0004\b_\u0010;\u001a\u0014\u0010`\u001a\u000209*\u000209H\u0087\b¢\u0006\u0004\b`\u0010;\u001a\u001c\u0010a\u001a\u000209*\u0002092\u0006\u00102\u001a\u000209H\u0087\b¢\u0006\u0004\ba\u0010A\u001a\u0013\u0010b\u001a\u00020'*\u000209H\u0007¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010d\u001a\u000206*\u000209H\u0007¢\u0006\u0004\bd\u0010e\u001a\u0018\u0010f\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0087\b¢\u0006\u0004\bf\u0010g\u001a \u0010h\u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b¢\u0006\u0004\bh\u0010i\u001a \u0010j\u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b¢\u0006\u0004\bj\u0010i\u001a\u0018\u0010k\u001a\u0002062\u0006\u0010(\u001a\u000206H\u0087\b¢\u0006\u0004\bk\u0010l\u001a \u0010m\u001a\u0002062\u0006\u0010!\u001a\u0002062\u0006\u0010\"\u001a\u000206H\u0087\b¢\u0006\u0004\bm\u0010n\u001a \u0010o\u001a\u0002062\u0006\u0010!\u001a\u0002062\u0006\u0010\"\u001a\u000206H\u0087\b¢\u0006\u0004\bo\u0010n\"\u001f\u0010s\u001a\u00020\u0000*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010r\u001a\u0004\bp\u0010\u0003\"\u001f\u0010-\u001a\u00020\u0000*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010r\u001a\u0004\bt\u0010\u0003\"\u001f\u0010x\u001a\u00020\u0000*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bw\u0010r\u001a\u0004\bv\u0010\u0003\"\u001f\u0010s\u001a\u000209*\u0002098Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010{\u001a\u0004\by\u0010;\"\u001f\u0010-\u001a\u000209*\u0002098Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010{\u001a\u0004\b|\u0010;\"\u001f\u0010x\u001a\u000209*\u0002098Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010{\u001a\u0004\b~\u0010;\"\"\u0010s\u001a\u00020'*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\u000f\u0012\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0080\u0001\u0010g\"!\u0010-\u001a\u00020'*\u00020'8FX\u0087\u0004¢\u0006\u000f\u0012\u0006\b\u0084\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010g\"\"\u0010s\u001a\u000206*\u0002068Æ\u0002X\u0087\u0004¢\u0006\u000f\u0012\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0085\u0001\u0010l\"\"\u0010-\u001a\u00020'*\u0002068FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008b\u0001"}, d2 = {"", "x", "Q0", "(D)D", "A", "W0", "m", "i", "q", "y", "s", "(DD)D", "S0", "C", "Y0", "o", "k", "u", "e0", "U0", "E", "G", "base", "k0", "g0", "m0", "o0", "i0", "I", "a1", "I0", "e", "O0", "a", "b", "u0", "q0", "w", "E0", "", "n", "F0", "(DI)D", "divisor", "c", "sign", "c1", "d1", "C0", "y0", "to", "A0", "K0", "(D)I", "", "M0", "(D)J", "", "R0", "(F)F", "B", "X0", "j", "r", "t", "(FF)F", "T0", "D", "Z0", "p", "l", "v", "f0", "V0", "F", "H", "l0", "h0", "n0", "p0", "j0", "z", "J", "b1", "J0", "f", "P0", "v0", "r0", "G0", "H0", "(FI)F", "d", "e1", "f1", "D0", "z0", "B0", "L0", "(F)I", "N0", "(F)J", "g", "(I)I", "w0", "(II)I", "s0", "h", "(J)J", "x0", "(JJ)J", "t0", "K", "O", "(D)V", "absoluteValue", "S", "W", "a0", "c0", "ulp", "L", "P", "(F)V", "T", "X", "b0", "d0", "M", "Q", "(I)V", "U", "Y", "N", "R", "(J)V", "V", "(J)I", "Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes7.dex */
public class d extends c {
    @c1(version = "1.2")
    @f
    private static final double A(double d5) {
        return Math.cos(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double A0(double d5, double d6) {
        return Math.nextAfter(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final float B(float f4) {
        return (float) Math.cos(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float B0(float f4, float f5) {
        return Math.nextAfter(f4, f5);
    }

    @c1(version = "1.2")
    @f
    private static final double C(double d5) {
        return Math.cosh(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double C0(double d5) {
        return Math.nextUp(d5);
    }

    @c1(version = "1.2")
    @f
    private static final float D(float f4) {
        return (float) Math.cosh(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float D0(float f4) {
        return Math.nextUp(f4);
    }

    @c1(version = "1.2")
    @f
    private static final double E(double d5) {
        return Math.exp(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double E0(double d5, double d6) {
        return Math.pow(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final float F(float f4) {
        return (float) Math.exp(f4);
    }

    @c1(version = "1.2")
    @f
    private static final double F0(double d5, int i4) {
        return Math.pow(d5, i4);
    }

    @c1(version = "1.2")
    @f
    private static final double G(double d5) {
        return Math.expm1(d5);
    }

    @c1(version = "1.2")
    @f
    private static final float G0(float f4, float f5) {
        return (float) Math.pow(f4, f5);
    }

    @c1(version = "1.2")
    @f
    private static final float H(float f4) {
        return (float) Math.expm1(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float H0(float f4, int i4) {
        return (float) Math.pow(f4, i4);
    }

    @c1(version = "1.2")
    @f
    private static final double I(double d5) {
        return Math.floor(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double I0(double d5) {
        return Math.rint(d5);
    }

    @c1(version = "1.2")
    @f
    private static final float J(float f4) {
        return (float) Math.floor(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float J0(float f4) {
        return (float) Math.rint(f4);
    }

    private static final double K(double d5) {
        return Math.abs(d5);
    }

    @c1(version = "1.2")
    public static int K0(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斃\u0001"));
        }
        if (d5 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d5 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d5);
    }

    private static final float L(float f4) {
        return Math.abs(f4);
    }

    @c1(version = "1.2")
    public static int L0(float f4) {
        if (Float.isNaN(f4)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斃\u0001"));
        }
        return Math.round(f4);
    }

    private static final int M(int i4) {
        return Math.abs(i4);
    }

    @c1(version = "1.2")
    public static long M0(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斃\u0001"));
        }
        return Math.round(d5);
    }

    private static final long N(long j4) {
        return Math.abs(j4);
    }

    @c1(version = "1.2")
    public static long N0(float f4) {
        return M0(f4);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void O(double d5) {
    }

    @c1(version = "1.2")
    @f
    private static final double O0(double d5) {
        return Math.signum(d5);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void P(float f4) {
    }

    @c1(version = "1.2")
    @f
    private static final float P0(float f4) {
        return Math.signum(f4);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i4) {
    }

    @c1(version = "1.2")
    @f
    private static final double Q0(double d5) {
        return Math.sin(d5);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void R(long j4) {
    }

    @c1(version = "1.2")
    @f
    private static final float R0(float f4) {
        return (float) Math.sin(f4);
    }

    private static final double S(double d5) {
        return Math.signum(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double S0(double d5) {
        return Math.sinh(d5);
    }

    private static final float T(float f4) {
        return Math.signum(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float T0(float f4) {
        return (float) Math.sinh(f4);
    }

    public static int U(int i4) {
        if (i4 < 0) {
            return -1;
        }
        return i4 > 0 ? 1 : 0;
    }

    @c1(version = "1.2")
    @f
    private static final double U0(double d5) {
        return Math.sqrt(d5);
    }

    public static int V(long j4) {
        if (j4 < 0) {
            return -1;
        }
        return j4 > 0 ? 1 : 0;
    }

    @c1(version = "1.2")
    @f
    private static final float V0(float f4) {
        return (float) Math.sqrt(f4);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void W(double d5) {
    }

    @c1(version = "1.2")
    @f
    private static final double W0(double d5) {
        return Math.tan(d5);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void X(float f4) {
    }

    @c1(version = "1.2")
    @f
    private static final float X0(float f4) {
        return (float) Math.tan(f4);
    }

    @c1(version = "1.2")
    public static /* synthetic */ void Y(int i4) {
    }

    @c1(version = "1.2")
    @f
    private static final double Y0(double d5) {
        return Math.tanh(d5);
    }

    @c1(version = "1.2")
    public static /* synthetic */ void Z(long j4) {
    }

    @c1(version = "1.2")
    @f
    private static final float Z0(float f4) {
        return (float) Math.tanh(f4);
    }

    private static final double a0(double d5) {
        return Math.ulp(d5);
    }

    @c1(version = "1.2")
    public static final double a1(double d5) {
        return (Double.isNaN(d5) || Double.isInfinite(d5)) ? d5 : d5 > p.f60679p ? Math.floor(d5) : Math.ceil(d5);
    }

    private static final float b0(float f4) {
        return Math.ulp(f4);
    }

    @c1(version = "1.2")
    public static final float b1(float f4) {
        if (Float.isNaN(f4) || Float.isInfinite(f4)) {
            return f4;
        }
        return (float) (f4 > 0.0f ? Math.floor(f4) : Math.ceil(f4));
    }

    @c1(version = "1.2")
    @f
    private static final double c(double d5, double d6) {
        return Math.IEEEremainder(d5, d6);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d5) {
    }

    @c1(version = "1.2")
    @f
    private static final double c1(double d5, double d6) {
        return Math.copySign(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final float d(float f4, float f5) {
        return (float) Math.IEEEremainder(f4, f5);
    }

    @c1(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f4) {
    }

    @c1(version = "1.2")
    @f
    private static final double d1(double d5, int i4) {
        return Math.copySign(d5, i4);
    }

    @c1(version = "1.2")
    @f
    private static final double e(double d5) {
        return Math.abs(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double e0(double d5, double d6) {
        return Math.hypot(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final float e1(float f4, float f5) {
        return Math.copySign(f4, f5);
    }

    @c1(version = "1.2")
    @f
    private static final float f(float f4) {
        return Math.abs(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float f0(float f4, float f5) {
        return (float) Math.hypot(f4, f5);
    }

    @c1(version = "1.2")
    @f
    private static final float f1(float f4, int i4) {
        return Math.copySign(f4, i4);
    }

    @c1(version = "1.2")
    @f
    private static final int g(int i4) {
        return Math.abs(i4);
    }

    @c1(version = "1.2")
    @f
    private static final double g0(double d5) {
        return Math.log(d5);
    }

    @c1(version = "1.2")
    @f
    private static final long h(long j4) {
        return Math.abs(j4);
    }

    @c1(version = "1.2")
    @f
    private static final float h0(float f4) {
        return (float) Math.log(f4);
    }

    @c1(version = "1.2")
    @f
    private static final double i(double d5) {
        return Math.acos(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double i0(double d5) {
        return Math.log1p(d5);
    }

    @c1(version = "1.2")
    @f
    private static final float j(float f4) {
        return (float) Math.acos(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float j0(float f4) {
        return (float) Math.log1p(f4);
    }

    @c1(version = "1.2")
    public static final double k(double d5) {
        if (d5 < 1.0d) {
            return Double.NaN;
        }
        if (d5 > a.upper_taylor_2_bound) {
            return Math.log(d5) + a.LN2;
        }
        double d6 = 1;
        double d7 = d5 - d6;
        if (d7 >= a.taylor_n_bound) {
            return Math.log(Math.sqrt((d5 * d5) - d6) + d5);
        }
        double sqrt = Math.sqrt(d7);
        if (sqrt >= a.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @c1(version = "1.2")
    public static final double k0(double d5, double d6) {
        if (d6 <= p.f60679p || d6 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d5) / Math.log(d6);
    }

    @c1(version = "1.2")
    @f
    private static final float l(float f4) {
        return (float) k(f4);
    }

    @c1(version = "1.2")
    public static final float l0(float f4, float f5) {
        if (f5 <= 0.0f || f5 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f4) / Math.log(f5));
    }

    @c1(version = "1.2")
    @f
    private static final double m(double d5) {
        return Math.asin(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double m0(double d5) {
        return Math.log10(d5);
    }

    @c1(version = "1.2")
    @f
    private static final float n(float f4) {
        return (float) Math.asin(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float n0(float f4) {
        return (float) Math.log10(f4);
    }

    @c1(version = "1.2")
    public static final double o(double d5) {
        double d6 = a.taylor_n_bound;
        if (d5 < d6) {
            return d5 <= (-d6) ? -o(-d5) : Math.abs(d5) >= a.taylor_2_bound ? d5 - (((d5 * d5) * d5) / 6) : d5;
        }
        if (d5 <= a.upper_taylor_n_bound) {
            return Math.log(Math.sqrt((d5 * d5) + 1) + d5);
        }
        if (d5 > a.upper_taylor_2_bound) {
            return Math.log(d5) + a.LN2;
        }
        double d7 = d5 * 2;
        return Math.log((1 / d7) + d7);
    }

    @c1(version = "1.2")
    public static final double o0(double d5) {
        return Math.log(d5) / a.LN2;
    }

    @c1(version = "1.2")
    @f
    private static final float p(float f4) {
        return (float) o(f4);
    }

    @c1(version = "1.2")
    public static final float p0(float f4) {
        return (float) (Math.log(f4) / a.LN2);
    }

    @c1(version = "1.2")
    @f
    private static final double q(double d5) {
        return Math.atan(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double q0(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final float r(float f4) {
        return (float) Math.atan(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float r0(float f4, float f5) {
        return Math.max(f4, f5);
    }

    @c1(version = "1.2")
    @f
    private static final double s(double d5, double d6) {
        return Math.atan2(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final int s0(int i4, int i5) {
        return Math.max(i4, i5);
    }

    @c1(version = "1.2")
    @f
    private static final float t(float f4, float f5) {
        return (float) Math.atan2(f4, f5);
    }

    @c1(version = "1.2")
    @f
    private static final long t0(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @c1(version = "1.2")
    public static final double u(double d5) {
        if (Math.abs(d5) < a.taylor_n_bound) {
            return Math.abs(d5) > a.taylor_2_bound ? d5 + (((d5 * d5) * d5) / 3) : d5;
        }
        double d6 = 1;
        return Math.log((d6 + d5) / (d6 - d5)) / 2;
    }

    @c1(version = "1.2")
    @f
    private static final double u0(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @c1(version = "1.2")
    @f
    private static final float v(float f4) {
        return (float) u(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float v0(float f4, float f5) {
        return Math.min(f4, f5);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    @f
    private static final double w(double d5) {
        return Math.cbrt(d5);
    }

    @c1(version = "1.2")
    @f
    private static final int w0(int i4, int i5) {
        return Math.min(i4, i5);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    @f
    private static final float x(float f4) {
        return (float) Math.cbrt(f4);
    }

    @c1(version = "1.2")
    @f
    private static final long x0(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @c1(version = "1.2")
    @f
    private static final double y(double d5) {
        return Math.ceil(d5);
    }

    @c1(version = "1.2")
    @f
    private static final double y0(double d5) {
        return Math.nextAfter(d5, Double.NEGATIVE_INFINITY);
    }

    @c1(version = "1.2")
    @f
    private static final float z(float f4) {
        return (float) Math.ceil(f4);
    }

    @c1(version = "1.2")
    @f
    private static final float z0(float f4) {
        return Math.nextAfter(f4, Double.NEGATIVE_INFINITY);
    }
}
