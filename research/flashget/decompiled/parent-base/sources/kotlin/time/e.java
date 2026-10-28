package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.o2;
import kotlin.text.v;
import kotlin.w0;
import kotlin.x0;

/* compiled from: Duration.kt */
@o2(markerClass = {l.class})
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b?\b\u0087@\u0018\u0000 \u0093\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0094\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0017H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0017H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\bJ\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u009d\u0001\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2u\u00101\u001aq\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00000)H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b2\u00103J\u0088\u0001\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2`\u00101\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u000004H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b5\u00106Js\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2K\u00101\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u000007H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b8\u00109J^\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u0010(26\u00101\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00000:H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b?\u0010!J\u0015\u0010@\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0002H\u0007¢\u0006\u0004\bB\u0010\u0005J\u000f\u0010C\u001a\u00020\u0002H\u0007¢\u0006\u0004\bC\u0010\u0005J\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ?\u0010N\u001a\u00020M*\u00060Gj\u0002`H2\u0006\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020D2\u0006\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020D2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010P\u001a\u00020\u0013¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020D¢\u0006\u0004\bS\u0010FJ\u0010\u0010T\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010W\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0005R\u0015\u0010^\u001a\u00020\u00138Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010UR\u0014\u0010a\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bb\u0010\u0005R\u001a\u0010g\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bd\u0010UR\u001a\u0010j\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bi\u0010f\u001a\u0004\bh\u0010UR\u001a\u0010m\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bl\u0010f\u001a\u0004\bk\u0010UR\u001a\u0010o\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b(\u0010f\u001a\u0004\bn\u0010UR\u001a\u0010s\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010f\u001a\u0004\bp\u0010qR\u001a\u0010v\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010f\u001a\u0004\bt\u0010qR\u001a\u0010y\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010f\u001a\u0004\bw\u0010qR\u001a\u0010|\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010f\u001a\u0004\bz\u0010qR\u001a\u0010\u007f\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b~\u0010f\u001a\u0004\b}\u0010qR\u001d\u0010\u0082\u0001\u001a\u00020\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010f\u001a\u0005\b\u0080\u0001\u0010qR\u001d\u0010\u0085\u0001\u001a\u00020\u00178FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0084\u0001\u0010f\u001a\u0005\b\u0083\u0001\u0010qR\u0012\u0010\u0086\u0001\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0005R\u0013\u0010\u0088\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0005R\u0013\u0010\u008a\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u0005R\u0013\u0010\u008c\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0005R\u0013\u0010\u008e\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u0005R\u0013\u0010\u0090\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u0005R\u0013\u0010\u0092\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u0095\u0001"}, d2 = {"Lkotlin/time/e;", "", "", "rawValue", "i", "(J)J", "", "d0", "(J)Z", "c0", "A0", "other", "i0", "(JJ)J", "thisMillis", "otherNanos", "d", "(JJJ)J", "h0", "", "scale", "k0", "(JI)J", "", "j0", "(JD)J", "l", "k", "j", "(JJ)D", "Lkotlin/time/h;", "unit", "z0", "(JLkotlin/time/h;)J", "f0", "g0", "e0", "b0", "h", "(JJ)I", "T", "Lkotlin/Function5;", "Lkotlin/r0;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "o0", "(JLld/s;)Ljava/lang/Object;", "Lkotlin/Function4;", "n0", "(JLld/r;)Ljava/lang/Object;", "Lkotlin/Function3;", "m0", "(JLld/q;)Ljava/lang/Object;", "Lkotlin/Function2;", "l0", "(JLld/p;)Ljava/lang/Object;", "p0", "(JLkotlin/time/h;)D", "t0", "r0", "(JLkotlin/time/h;)I", "v0", "u0", "", "w0", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "Lkotlin/k2;", "e", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "x0", "(JLkotlin/time/h;I)Ljava/lang/String;", "s0", "a0", "(J)I", "", "m", "(JLjava/lang/Object;)Z", "b", "J", "Z", "value", "Y", "unitDiscriminator", "X", "(J)Lkotlin/time/h;", "storageUnit", "o", "absoluteValue", "q", "p", "()V", "hoursComponent", "S", "R", "minutesComponent", "W", "V", "secondsComponent", "U", "nanosecondsComponent", "s", "(J)D", "r", "inDays", "u", "t", "inHours", "A", "z", "inMinutes", "G", "E", "inSeconds", "y", "x", "inMilliseconds", "w", "v", "inMicroseconds", "C", "B", "inNanoseconds", "inWholeDays", "K", "inWholeHours", "N", "inWholeMinutes", "Q", "inWholeSeconds", "M", "inWholeMilliseconds", "L", "inWholeMicroseconds", "P", "inWholeNanoseconds", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kd.g
@c1(version = "1.6")
@r1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* loaded from: classes7.dex */
public final class e implements Comparable<e> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    private static final long f79210d = i(0);

    /* renamed from: e, reason: collision with root package name */
    private static final long f79211e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f79212f;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long rawValue;

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\bB\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000eJ\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0011J\u001a\u0010\"\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010#\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010\u000eJ\u001a\u0010$\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u001a\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0013J\u0018\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b)\u0010(J\u001a\u0010*\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001a\u0010,\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b,\u0010+R\"\u00100\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u000eR\"\u00100\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0011R\"\u00100\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0013R\"\u00109\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u000eR\"\u00109\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b;\u00103\u001a\u0004\b:\u0010\u0011R\"\u00109\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u0013R\"\u0010@\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b?\u0010/\u001a\u0004\b>\u0010\u000eR\"\u0010@\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bB\u00103\u001a\u0004\bA\u0010\u0011R\"\u0010@\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010\u0013R\"\u0010G\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bF\u0010/\u001a\u0004\bE\u0010\u000eR\"\u0010G\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bI\u00103\u001a\u0004\bH\u0010\u0011R\"\u0010G\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bK\u00106\u001a\u0004\bJ\u0010\u0013R\"\u0010N\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bM\u0010/\u001a\u0004\bL\u0010\u000eR\"\u0010N\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bP\u00103\u001a\u0004\bO\u0010\u0011R\"\u0010N\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bR\u00106\u001a\u0004\bQ\u0010\u0013R\"\u0010U\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bT\u0010/\u001a\u0004\bS\u0010\u000eR\"\u0010U\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bW\u00103\u001a\u0004\bV\u0010\u0011R\"\u0010U\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\bY\u00106\u001a\u0004\bX\u0010\u0013R\"\u0010\\\u001a\u00020\f*\u00020\u000b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b[\u0010/\u001a\u0004\bZ\u0010\u000eR\"\u0010\\\u001a\u00020\f*\u00020\u000f8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b^\u00103\u001a\u0004\b]\u0010\u0011R\"\u0010\\\u001a\u00020\f*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b`\u00106\u001a\u0004\b_\u0010\u0013R\u001a\u0010a\u001a\u00020\f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010dR\u001d\u0010g\u001a\u00020\f8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bg\u0010b\u001a\u0004\bb\u0010d\u0082\u0002\u0004\n\u0002\b!¨\u0006h"}, d2 = {"Lkotlin/time/e$a;", "", "<init>", "()V", "", "value", "Lkotlin/time/h;", "sourceUnit", "targetUnit", "a", "(DLkotlin/time/h;Lkotlin/time/h;)D", "", "Lkotlin/time/e;", "k0", "(I)J", "", "l0", "(J)J", "j0", "(D)J", "b0", "c0", "a0", "e0", "f0", "d0", "r0", "s0", "q0", "h0", "i0", "g0", "Y", "Z", "X", "c", "d", "b", "", "m0", "(Ljava/lang/String;)J", "n0", "p0", "(Ljava/lang/String;)Lkotlin/time/e;", "o0", "L", "O", "(I)V", "nanoseconds", "M", "P", "(J)V", "K", "N", "(D)V", "s", "v", "microseconds", "t", "w", "r", "u", "y", "B", "milliseconds", "z", "C", "x", "A", "R", "U", "seconds", "S", "V", "Q", "T", "E", "H", "minutes", "F", "I", "D", "G", "l", "o", "hours", "m", "p", "k", "n", "f", "i", "days", "g", "j", "e", "h", "ZERO", "J", "W", "()J", "INFINITE", "q", "NEG_INFINITE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.internal.f
        public static /* synthetic */ void A(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void B(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void C(long j4) {
        }

        private final long D(double d5) {
            return g.l0(d5, h.MINUTES);
        }

        private final long E(int i4) {
            return g.m0(i4, h.MINUTES);
        }

        private final long F(long j4) {
            return g.n0(j4, h.MINUTES);
        }

        @kotlin.internal.f
        public static /* synthetic */ void G(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void H(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void I(long j4) {
        }

        private final long K(double d5) {
            return g.l0(d5, h.NANOSECONDS);
        }

        private final long L(int i4) {
            return g.m0(i4, h.NANOSECONDS);
        }

        private final long M(long j4) {
            return g.n0(j4, h.NANOSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void N(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void O(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void P(long j4) {
        }

        private final long Q(double d5) {
            return g.l0(d5, h.SECONDS);
        }

        private final long R(int i4) {
            return g.m0(i4, h.SECONDS);
        }

        private final long S(long j4) {
            return g.n0(j4, h.SECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void T(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void U(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void V(long j4) {
        }

        private final long e(double d5) {
            return g.l0(d5, h.DAYS);
        }

        private final long f(int i4) {
            return g.m0(i4, h.DAYS);
        }

        private final long g(long j4) {
            return g.n0(j4, h.DAYS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void h(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void i(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void j(long j4) {
        }

        private final long k(double d5) {
            return g.l0(d5, h.HOURS);
        }

        private final long l(int i4) {
            return g.m0(i4, h.HOURS);
        }

        private final long m(long j4) {
            return g.n0(j4, h.HOURS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void n(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void o(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void p(long j4) {
        }

        private final long r(double d5) {
            return g.l0(d5, h.MICROSECONDS);
        }

        private final long s(int i4) {
            return g.m0(i4, h.MICROSECONDS);
        }

        private final long t(long j4) {
            return g.n0(j4, h.MICROSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void u(double d5) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void v(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void w(long j4) {
        }

        private final long x(double d5) {
            return g.l0(d5, h.MILLISECONDS);
        }

        private final long y(int i4) {
            return g.m0(i4, h.MILLISECONDS);
        }

        private final long z(long j4) {
            return g.n0(j4, h.MILLISECONDS);
        }

        public final long J() {
            return e.f79212f;
        }

        public final long W() {
            return e.f79210d;
        }

        @kotlin.k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long X(double value) {
            return g.l0(value, h.HOURS);
        }

        @kotlin.k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long Y(int value) {
            return g.m0(value, h.HOURS);
        }

        @kotlin.k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long Z(long value) {
            return g.n0(value, h.HOURS);
        }

        @l
        public final double a(double value, @fg.l h sourceUnit, @fg.l h targetUnit) {
            l0.p(sourceUnit, ProtectedSandApp.s("蔔\u0001"));
            l0.p(targetUnit, ProtectedSandApp.s("蔕\u0001"));
            return j.a(value, sourceUnit, targetUnit);
        }

        @kotlin.k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long a0(double value) {
            return g.l0(value, h.MICROSECONDS);
        }

        @kotlin.k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long b(double value) {
            return g.l0(value, h.DAYS);
        }

        @kotlin.k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long b0(int value) {
            return g.m0(value, h.MICROSECONDS);
        }

        @kotlin.k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long c(int value) {
            return g.m0(value, h.DAYS);
        }

        @kotlin.k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long c0(long value) {
            return g.n0(value, h.MICROSECONDS);
        }

        @kotlin.k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long d(long value) {
            return g.n0(value, h.DAYS);
        }

        @kotlin.k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long d0(double value) {
            return g.l0(value, h.MILLISECONDS);
        }

        @kotlin.k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long e0(int value) {
            return g.m0(value, h.MILLISECONDS);
        }

        @kotlin.k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long f0(long value) {
            return g.n0(value, h.MILLISECONDS);
        }

        @kotlin.k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long g0(double value) {
            return g.l0(value, h.MINUTES);
        }

        @kotlin.k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long h0(int value) {
            return g.m0(value, h.MINUTES);
        }

        @kotlin.k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long i0(long value) {
            return g.n0(value, h.MINUTES);
        }

        @kotlin.k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long j0(double value) {
            return g.l0(value, h.NANOSECONDS);
        }

        @kotlin.k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long k0(int value) {
            return g.m0(value, h.NANOSECONDS);
        }

        @kotlin.k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long l0(long value) {
            return g.n0(value, h.NANOSECONDS);
        }

        public final long m0(@fg.l String value) {
            long f02;
            l0.p(value, ProtectedSandApp.s("蔖\u0001"));
            try {
                f02 = g.f0(value, false);
                return f02;
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("蔗\u0001"), value, ProtectedSandApp.s("蔘\u0001")), e4);
            }
        }

        public final long n0(@fg.l String value) {
            long f02;
            l0.p(value, ProtectedSandApp.s("蔖\u0001"));
            try {
                f02 = g.f0(value, true);
                return f02;
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("蔙\u0001"), value, ProtectedSandApp.s("蔘\u0001")), e4);
            }
        }

        @fg.m
        public final e o0(@fg.l String value) {
            long f02;
            l0.p(value, ProtectedSandApp.s("蔖\u0001"));
            try {
                f02 = g.f0(value, true);
                return e.f(f02);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @fg.m
        public final e p0(@fg.l String value) {
            long f02;
            l0.p(value, ProtectedSandApp.s("蔖\u0001"));
            try {
                f02 = g.f0(value, false);
                return e.f(f02);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return e.f79211e;
        }

        @kotlin.k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long q0(double value) {
            return g.l0(value, h.SECONDS);
        }

        @kotlin.k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long r0(int value) {
            return g.m0(value, h.SECONDS);
        }

        @kotlin.k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @x0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        @c1(version = "1.5")
        public final /* synthetic */ long s0(long value) {
            return g.n0(value, h.SECONDS);
        }

        public Companion(w wVar) {
        }
    }

    static {
        long j4;
        long j5;
        j4 = g.j(g.f79218c);
        f79211e = j4;
        j5 = g.j(-4611686018427387903L);
        f79212f = j5;
    }

    private /* synthetic */ e(long j4) {
        this.rawValue = j4;
    }

    public static final long A0(long j4) {
        long i4;
        i4 = g.i(-(j4 >> 1), ((int) j4) & 1);
        return i4;
    }

    @kotlin.k(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void B() {
    }

    @kotlin.k(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void E() {
    }

    public static final long J(long j4) {
        return t0(j4, h.DAYS);
    }

    public static final long K(long j4) {
        return t0(j4, h.HOURS);
    }

    public static final long L(long j4) {
        return t0(j4, h.MICROSECONDS);
    }

    public static final long M(long j4) {
        return (c0(j4) && b0(j4)) ? j4 >> 1 : t0(j4, h.MILLISECONDS);
    }

    public static final long N(long j4) {
        return t0(j4, h.MINUTES);
    }

    public static final long P(long j4) {
        long j5 = j4 >> 1;
        if (d0(j4)) {
            return j5;
        }
        if (j5 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j5 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j5 * 1000000;
    }

    public static final long Q(long j4) {
        return t0(j4, h.SECONDS);
    }

    @w0
    public static /* synthetic */ void R() {
    }

    public static final int S(long j4) {
        if (e0(j4)) {
            return 0;
        }
        return (int) (t0(j4, h.MINUTES) % 60);
    }

    @w0
    public static /* synthetic */ void T() {
    }

    public static final int U(long j4) {
        if (e0(j4)) {
            return 0;
        }
        return (int) (c0(j4) ? ((j4 >> 1) % 1000) * 1000000 : (j4 >> 1) % 1000000000);
    }

    @w0
    public static /* synthetic */ void V() {
    }

    public static final int W(long j4) {
        if (e0(j4)) {
            return 0;
        }
        return (int) (t0(j4, h.SECONDS) % 60);
    }

    private static final h X(long j4) {
        return d0(j4) ? h.NANOSECONDS : h.MILLISECONDS;
    }

    private static final int Y(long j4) {
        return ((int) j4) & 1;
    }

    private static final long Z(long j4) {
        return j4 >> 1;
    }

    public static int a0(long j4) {
        return Long.hashCode(j4);
    }

    public static final boolean b0(long j4) {
        return !e0(j4);
    }

    private static final boolean c0(long j4) {
        return (((int) j4) & 1) == 1;
    }

    private static final long d(long j4, long j5, long j6) {
        long j7;
        long l4;
        long j10 = 1000000;
        long j11 = j6 / j10;
        long j12 = j5 + j11;
        if (!new kotlin.ranges.o(-4611686018426L, 4611686018426L).r(j12)) {
            j7 = g.j(kotlin.ranges.s.K(j12, -4611686018427387903L, g.f79218c));
            return j7;
        }
        l4 = g.l((j12 * j10) + (j6 - (j11 * j10)));
        return l4;
    }

    private static final boolean d0(long j4) {
        return (((int) j4) & 1) == 0;
    }

    private static final void e(long j4, StringBuilder sb, int i4, int i5, int i6, String str, boolean z4) {
        sb.append(i4);
        if (i5 != 0) {
            sb.append('.');
            String R3 = v.R3(String.valueOf(i5), i6, '0');
            int i7 = -1;
            int length = R3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (R3.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            }
            int i11 = i7 + 1;
            String s4 = ProtectedSandApp.s("蔚\u0001");
            if (z4 || i11 >= 3) {
                sb.append((CharSequence) R3, 0, ((i7 + 3) / 3) * 3);
                l0.o(sb, s4);
            } else {
                sb.append((CharSequence) R3, 0, i11);
                l0.o(sb, s4);
            }
        }
        sb.append(str);
    }

    public static final boolean e0(long j4) {
        return j4 == f79211e || j4 == f79212f;
    }

    public static final /* synthetic */ e f(long j4) {
        return new e(j4);
    }

    public static final boolean f0(long j4) {
        return j4 < 0;
    }

    public static final boolean g0(long j4) {
        return j4 > 0;
    }

    public static int h(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 < 0 || (((int) j6) & 1) == 0) {
            return l0.u(j4, j5);
        }
        int i4 = (((int) j4) & 1) - (((int) j5) & 1);
        return f0(j4) ? -i4 : i4;
    }

    public static final long h0(long j4, long j5) {
        return i0(j4, A0(j5));
    }

    public static long i(long j4) {
        if (f.d()) {
            if (d0(j4)) {
                long j5 = j4 >> 1;
                if (!new kotlin.ranges.o(-4611686018426999999L, g.f79217b).r(j5)) {
                    throw new AssertionError(com.flashget.kid.common.configs.log.o.a(j5, ProtectedSandApp.s("蔛\u0001")));
                }
            } else {
                long j6 = j4 >> 1;
                if (!new kotlin.ranges.o(-4611686018427387903L, g.f79218c).r(j6)) {
                    throw new AssertionError(com.flashget.kid.common.configs.log.o.a(j6, ProtectedSandApp.s("蔝\u0001")));
                }
                if (new kotlin.ranges.o(-4611686018426L, 4611686018426L).r(j6)) {
                    throw new AssertionError(com.flashget.kid.common.configs.log.o.a(j6, ProtectedSandApp.s("蔜\u0001")));
                }
            }
        }
        return j4;
    }

    public static final long i0(long j4, long j5) {
        long k4;
        long m4;
        if (e0(j4)) {
            if (b0(j5) || (j5 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("蔞\u0001"));
        }
        if (e0(j5)) {
            return j5;
        }
        if ((((int) j4) & 1) != (((int) j5) & 1)) {
            return c0(j4) ? d(j4, j4 >> 1, j5 >> 1) : d(j4, j5 >> 1, j4 >> 1);
        }
        long j6 = (j4 >> 1) + (j5 >> 1);
        if (d0(j4)) {
            m4 = g.m(j6);
            return m4;
        }
        k4 = g.k(j6);
        return k4;
    }

    public static final double j(long j4, long j5) {
        h hVar = (h) kotlin.comparisons.a.X(X(j4), X(j5));
        return p0(j4, hVar) / p0(j5, hVar);
    }

    public static final long j0(long j4, double d5) {
        int K0 = kotlin.math.b.K0(d5);
        if (K0 == d5) {
            return k0(j4, K0);
        }
        h X = X(j4);
        return g.l0(p0(j4, X) * d5, X);
    }

    public static final long k(long j4, double d5) {
        int K0 = kotlin.math.b.K0(d5);
        if (K0 == d5 && K0 != 0) {
            return l(j4, K0);
        }
        h X = X(j4);
        return g.l0(p0(j4, X) / d5, X);
    }

    public static final long k0(long j4, int i4) {
        long j5;
        long j6;
        long m4;
        long l4;
        if (e0(j4)) {
            if (i4 != 0) {
                return i4 > 0 ? j4 : A0(j4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("蔟\u0001"));
        }
        if (i4 == 0) {
            return f79210d;
        }
        long j7 = j4 >> 1;
        long j10 = i4;
        long j11 = j7 * j10;
        if (!d0(j4)) {
            if (j11 / j10 != j7) {
                return kotlin.math.b.U(i4) * kotlin.math.b.V(j7) > 0 ? f79211e : f79212f;
            }
            j5 = g.j(kotlin.ranges.s.L(j11, new kotlin.ranges.o(-4611686018427387903L, g.f79218c)));
            return j5;
        }
        if (new kotlin.ranges.o(-2147483647L, 2147483647L).r(j7)) {
            l4 = g.l(j11);
            return l4;
        }
        if (j11 / j10 == j7) {
            m4 = g.m(j11);
            return m4;
        }
        long j12 = 1000000;
        long j13 = j7 / j12;
        long j14 = j13 * j10;
        long j15 = (((j7 - (j13 * j12)) * j10) / j12) + j14;
        if (j14 / j10 != j13 || (j15 ^ j14) < 0) {
            return kotlin.math.b.U(i4) * kotlin.math.b.V(j7) > 0 ? f79211e : f79212f;
        }
        j6 = g.j(kotlin.ranges.s.L(j15, new kotlin.ranges.o(-4611686018427387903L, g.f79218c)));
        return j6;
    }

    public static final long l(long j4, int i4) {
        long j5;
        long l4;
        long l5;
        if (i4 == 0) {
            if (g0(j4)) {
                return f79211e;
            }
            if (f0(j4)) {
                return f79212f;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("蔠\u0001"));
        }
        if (d0(j4)) {
            l5 = g.l((j4 >> 1) / i4);
            return l5;
        }
        if (e0(j4)) {
            return k0(j4, kotlin.math.b.U(i4));
        }
        long j6 = j4 >> 1;
        long j7 = i4;
        long j10 = j6 / j7;
        if (!new kotlin.ranges.o(-4611686018426L, 4611686018426L).r(j10)) {
            j5 = g.j(j10);
            return j5;
        }
        long j11 = 1000000;
        l4 = g.l((j10 * j11) + (((j6 - (j10 * j7)) * j11) / j7));
        return l4;
    }

    public static final <T> T l0(long j4, @fg.l ld.p<? super Long, ? super Integer, ? extends T> pVar) {
        l0.p(pVar, ProtectedSandApp.s("蔡\u0001"));
        return pVar.invoke(Long.valueOf(t0(j4, h.SECONDS)), Integer.valueOf(U(j4)));
    }

    public static boolean m(long j4, Object obj) {
        return (obj instanceof e) && j4 == ((e) obj).rawValue;
    }

    public static final <T> T m0(long j4, @fg.l ld.q<? super Long, ? super Integer, ? super Integer, ? extends T> qVar) {
        l0.p(qVar, ProtectedSandApp.s("蔡\u0001"));
        return qVar.R(Long.valueOf(t0(j4, h.MINUTES)), Integer.valueOf(W(j4)), Integer.valueOf(U(j4)));
    }

    public static final boolean n(long j4, long j5) {
        return j4 == j5;
    }

    public static final <T> T n0(long j4, @fg.l ld.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        l0.p(rVar, ProtectedSandApp.s("蔡\u0001"));
        return rVar.i(Long.valueOf(t0(j4, h.HOURS)), Integer.valueOf(S(j4)), Integer.valueOf(W(j4)), Integer.valueOf(U(j4)));
    }

    public static final long o(long j4) {
        return f0(j4) ? A0(j4) : j4;
    }

    public static final <T> T o0(long j4, @fg.l ld.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> sVar) {
        l0.p(sVar, ProtectedSandApp.s("蔡\u0001"));
        return sVar.a0(Long.valueOf(t0(j4, h.DAYS)), Integer.valueOf(q(j4)), Integer.valueOf(S(j4)), Integer.valueOf(W(j4)), Integer.valueOf(U(j4)));
    }

    @w0
    public static /* synthetic */ void p() {
    }

    public static final double p0(long j4, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔢\u0001"));
        if (j4 == f79211e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j4 == f79212f) {
            return Double.NEGATIVE_INFINITY;
        }
        return j.a(j4 >> 1, X(j4), hVar);
    }

    public static final int q(long j4) {
        if (e0(j4)) {
            return 0;
        }
        return (int) (t0(j4, h.HOURS) % 24);
    }

    @kotlin.k(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void r() {
    }

    public static final int r0(long j4, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔢\u0001"));
        return (int) kotlin.ranges.s.K(t0(j4, hVar), -2147483648L, 2147483647L);
    }

    @fg.l
    public static final String s0(long j4) {
        StringBuilder sb = new StringBuilder();
        if (f0(j4)) {
            sb.append('-');
        }
        sb.append(ProtectedSandApp.s("蔣\u0001"));
        long o4 = o(j4);
        long t02 = t0(o4, h.HOURS);
        int S = S(o4);
        int W = W(o4);
        int U = U(o4);
        if (e0(j4)) {
            t02 = 9999999999999L;
        }
        boolean z4 = false;
        boolean z5 = t02 != 0;
        boolean z6 = (W == 0 && U == 0) ? false : true;
        if (S != 0 || (z6 && z5)) {
            z4 = true;
        }
        if (z5) {
            sb.append(t02);
            sb.append('H');
        }
        if (z4) {
            sb.append(S);
            sb.append('M');
        }
        if (z6 || (!z5 && !z4)) {
            e(j4, sb, W, U, 9, ProtectedSandApp.s("蔤\u0001"), true);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("蔥\u0001"));
        return sb2;
    }

    @kotlin.k(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void t() {
    }

    public static final long t0(long j4, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔢\u0001"));
        if (j4 == f79211e) {
            return Long.MAX_VALUE;
        }
        if (j4 == f79212f) {
            return Long.MIN_VALUE;
        }
        return j.b(j4 >> 1, X(j4), hVar);
    }

    @kotlin.k(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void v() {
    }

    @fg.l
    public static String w0(long j4) {
        if (j4 == 0) {
            return ProtectedSandApp.s("蔦\u0001");
        }
        if (j4 == f79211e) {
            return ProtectedSandApp.s("蔧\u0001");
        }
        if (j4 == f79212f) {
            return ProtectedSandApp.s("蔨\u0001");
        }
        boolean f02 = f0(j4);
        StringBuilder sb = new StringBuilder();
        if (f02) {
            sb.append('-');
        }
        long o4 = o(j4);
        long t02 = t0(o4, h.DAYS);
        int q4 = q(o4);
        int S = S(o4);
        int W = W(o4);
        int U = U(o4);
        int i4 = 0;
        boolean z4 = t02 != 0;
        boolean z5 = q4 != 0;
        boolean z6 = S != 0;
        boolean z7 = (W == 0 && U == 0) ? false : true;
        if (z4) {
            sb.append(t02);
            sb.append('d');
            i4 = 1;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(q4);
            sb.append('h');
            i4 = i5;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(S);
            sb.append('m');
            i4 = i6;
        }
        if (z7) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (W != 0 || z4 || z5 || z6) {
                e(j4, sb, W, U, 9, ProtectedSandApp.s("蔬\u0001"), false);
            } else if (U >= 1000000) {
                e(j4, sb, U / 1000000, U % 1000000, 6, ProtectedSandApp.s("蔩\u0001"), false);
            } else if (U >= 1000) {
                e(j4, sb, U / 1000, U % 1000, 3, ProtectedSandApp.s("蔪\u0001"), false);
            } else {
                sb.append(U);
                sb.append(ProtectedSandApp.s("蔫\u0001"));
            }
            i4 = i7;
        }
        if (f02 && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("蔥\u0001"));
        return sb2;
    }

    @kotlin.k(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void x() {
    }

    @fg.l
    public static final String x0(long j4, @fg.l h hVar, int i4) {
        l0.p(hVar, ProtectedSandApp.s("蔢\u0001"));
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("蔭\u0001"), i4).toString());
        }
        double p02 = p0(j4, hVar);
        if (Double.isInfinite(p02)) {
            return String.valueOf(p02);
        }
        StringBuilder sb = new StringBuilder();
        if (i4 > 12) {
            i4 = 12;
        }
        sb.append(f.b(p02, i4));
        sb.append(k.h(hVar));
        return sb.toString();
    }

    public static /* synthetic */ String y0(long j4, h hVar, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return x0(j4, hVar, i4);
    }

    @kotlin.k(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @x0(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static /* synthetic */ void z() {
    }

    public static final long z0(long j4, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蔢\u0001"));
        h X = X(j4);
        if (hVar.compareTo(X) <= 0 || e0(j4)) {
            return j4;
        }
        long j5 = j4 >> 1;
        return g.n0(j5 - (j5 % j.b(1L, hVar, X)), X);
    }

    /* renamed from: B0, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(e eVar) {
        return h(this.rawValue, eVar.rawValue);
    }

    public boolean equals(Object obj) {
        return m(this.rawValue, obj);
    }

    public int g(long j4) {
        return h(this.rawValue, j4);
    }

    public int hashCode() {
        return Long.hashCode(this.rawValue);
    }

    @fg.l
    public String toString() {
        return w0(this.rawValue);
    }
}
