package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.ranges.LongRange;
import kotlin.ranges.u;
import kotlin.text.h0;

/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u0018\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010jJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
@p3.g
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* renamed from: kotlin.time.e, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class Duration implements Comparable<Duration> {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f27196p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    private static final long f27197q = s(0);

    /* renamed from: r, reason: collision with root package name */
    private static final long f27198r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f27199s;

    /* renamed from: o, reason: collision with root package name */
    private final long f27200o;

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u0018\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b<J\u0018\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b>J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\"\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\"\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\"\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\"\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\"\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\"\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\"\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.e$a */
    public static final class a {
        private a() {
        }

        @InlineOnly
        public static /* synthetic */ void A(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void B(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void C(long j5) {
        }

        private final long D(double d6) {
            return g.l0(d6, DurationUnit.MINUTES);
        }

        private final long E(int i5) {
            return g.m0(i5, DurationUnit.MINUTES);
        }

        private final long F(long j5) {
            return g.n0(j5, DurationUnit.MINUTES);
        }

        @InlineOnly
        public static /* synthetic */ void G(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void H(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void I(long j5) {
        }

        private final long K(double d6) {
            return g.l0(d6, DurationUnit.NANOSECONDS);
        }

        private final long L(int i5) {
            return g.m0(i5, DurationUnit.NANOSECONDS);
        }

        private final long M(long j5) {
            return g.n0(j5, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void N(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void O(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void P(long j5) {
        }

        private final long Q(double d6) {
            return g.l0(d6, DurationUnit.SECONDS);
        }

        private final long R(int i5) {
            return g.m0(i5, DurationUnit.SECONDS);
        }

        private final long S(long j5) {
            return g.n0(j5, DurationUnit.SECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void T(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void U(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void V(long j5) {
        }

        private final long e(double d6) {
            return g.l0(d6, DurationUnit.DAYS);
        }

        private final long f(int i5) {
            return g.m0(i5, DurationUnit.DAYS);
        }

        private final long g(long j5) {
            return g.n0(j5, DurationUnit.DAYS);
        }

        @InlineOnly
        public static /* synthetic */ void h(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void i(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void j(long j5) {
        }

        private final long k(double d6) {
            return g.l0(d6, DurationUnit.HOURS);
        }

        private final long l(int i5) {
            return g.m0(i5, DurationUnit.HOURS);
        }

        private final long m(long j5) {
            return g.n0(j5, DurationUnit.HOURS);
        }

        @InlineOnly
        public static /* synthetic */ void n(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void o(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void p(long j5) {
        }

        private final long r(double d6) {
            return g.l0(d6, DurationUnit.MICROSECONDS);
        }

        private final long s(int i5) {
            return g.m0(i5, DurationUnit.MICROSECONDS);
        }

        private final long t(long j5) {
            return g.n0(j5, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        public static /* synthetic */ void u(double d6) {
        }

        @InlineOnly
        public static /* synthetic */ void v(int i5) {
        }

        @InlineOnly
        public static /* synthetic */ void w(long j5) {
        }

        private final long x(double d6) {
            return g.l0(d6, DurationUnit.MILLISECONDS);
        }

        private final long y(int i5) {
            return g.m0(i5, DurationUnit.MILLISECONDS);
        }

        private final long z(long j5) {
            return g.n0(j5, DurationUnit.MILLISECONDS);
        }

        public final long J() {
            return Duration.f27199s;
        }

        public final long W() {
            return Duration.f27197q;
        }

        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long X(double d6) {
            return g.l0(d6, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long Y(int i5) {
            return g.m0(i5, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long Z(long j5) {
            return g.n0(j5, DurationUnit.HOURS);
        }

        @ExperimentalTime
        public final double a(double d6, @d5.d DurationUnit durationUnit, @d5.d DurationUnit durationUnit2) {
            l0.p(durationUnit, ProtectedSandApp.s("寵"));
            l0.p(durationUnit2, ProtectedSandApp.s("寶"));
            return j.a(d6, durationUnit, durationUnit2);
        }

        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long a0(double d6) {
            return g.l0(d6, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long b(double d6) {
            return g.l0(d6, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long b0(int i5) {
            return g.m0(i5, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long c(int i5) {
            return g.m0(i5, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long c0(long j5) {
            return g.n0(j5, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long d(long j5) {
            return g.n0(j5, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long d0(double d6) {
            return g.l0(d6, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long e0(int i5) {
            return g.m0(i5, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long f0(long j5) {
            return g.n0(j5, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long g0(double d6) {
            return g.l0(d6, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long h0(int i5) {
            return g.m0(i5, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long i0(long j5) {
            return g.n0(j5, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long j0(double d6) {
            return g.l0(d6, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long k0(int i5) {
            return g.m0(i5, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long l0(long j5) {
            return g.n0(j5, DurationUnit.NANOSECONDS);
        }

        public final long m0(@d5.d String str) {
            long f02;
            l0.p(str, ProtectedSandApp.s("寷"));
            try {
                f02 = g.f0(str, false);
                return f02;
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("寸"), str, ProtectedSandApp.s("对")), e6);
            }
        }

        public final long n0(@d5.d String str) {
            long f02;
            l0.p(str, ProtectedSandApp.s("寺"));
            try {
                f02 = g.f0(str, true);
                return f02;
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("寻"), str, ProtectedSandApp.s("导")), e6);
            }
        }

        @d5.e
        public final Duration o0(@d5.d String str) {
            long f02;
            l0.p(str, ProtectedSandApp.s("寽"));
            try {
                f02 = g.f0(str, true);
                return Duration.p(f02);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @d5.e
        public final Duration p0(@d5.d String str) {
            long f02;
            l0.p(str, ProtectedSandApp.s("対"));
            try {
                f02 = g.f0(str, false);
                return Duration.p(f02);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return Duration.f27198r;
        }

        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long q0(double d6) {
            return g.l0(d6, DurationUnit.SECONDS);
        }

        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long r0(int i5) {
            return g.m0(i5, DurationUnit.SECONDS);
        }

        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        @SinceKotlin(version = "1.5")
        public final /* synthetic */ long s0(long j5) {
            return g.n0(j5, DurationUnit.SECONDS);
        }

        public a(w wVar) {
        }
    }

    static {
        long j5;
        long j6;
        j5 = g.j(g.f27205c);
        f27198r = j5;
        j6 = g.j(-4611686018427387903L);
        f27199s = j6;
    }

    private /* synthetic */ Duration(long j5) {
        this.f27200o = j5;
    }

    public static final int A(long j5) {
        if (j0(j5)) {
            return 0;
        }
        return (int) (Q(j5) % 24);
    }

    @d5.d
    public static String A0(long j5) {
        if (j5 == 0) {
            return ProtectedSandApp.s("寿");
        }
        if (j5 == f27198r) {
            return ProtectedSandApp.s("尀");
        }
        if (j5 == f27199s) {
            return ProtectedSandApp.s("封");
        }
        boolean k02 = k0(j5);
        StringBuilder sb = new StringBuilder();
        if (k02) {
            sb.append('-');
        }
        long y5 = y(j5);
        long P = P(y5);
        int A = A(y5);
        int X = X(y5);
        int b02 = b0(y5);
        int Z = Z(y5);
        int i5 = 0;
        boolean z5 = P != 0;
        boolean z6 = A != 0;
        boolean z7 = X != 0;
        boolean z8 = (b02 == 0 && Z == 0) ? false : true;
        if (z5) {
            sb.append(P);
            sb.append('d');
            i5 = 1;
        }
        if (z6 || (z5 && (z7 || z8))) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(A);
            sb.append('h');
            i5 = i6;
        }
        if (z7 || (z8 && (z6 || z5))) {
            int i7 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(X);
            sb.append('m');
            i5 = i7;
        }
        if (z8) {
            int i8 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            if (b02 != 0 || z5 || z6 || z7) {
                o(j5, sb, b02, Z, 9, ProtectedSandApp.s("尅"), false);
            } else if (Z >= 1000000) {
                o(j5, sb, Z / g.f27203a, Z % g.f27203a, 6, ProtectedSandApp.s("専"), false);
            } else if (Z >= 1000) {
                o(j5, sb, Z / 1000, Z % 1000, 3, ProtectedSandApp.s("尃"), false);
            } else {
                sb.append(Z);
                sb.append(ProtectedSandApp.s("射"));
            }
            i5 = i8;
        }
        if (k02 && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("将"));
        return sb2;
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void B() {
    }

    @d5.d
    public static final String B0(long j5, @d5.d DurationUnit durationUnit, int i5) {
        l0.p(durationUnit, ProtectedSandApp.s("將"));
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("專"), i5).toString());
        }
        double u02 = u0(j5, durationUnit);
        if (Double.isInfinite(u02)) {
            return String.valueOf(u02);
        }
        StringBuilder sb = new StringBuilder();
        if (i5 > 12) {
            i5 = 12;
        }
        sb.append(f.b(u02, i5));
        sb.append(k.h(durationUnit));
        return sb.toString();
    }

    public static /* synthetic */ String C0(long j5, DurationUnit durationUnit, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return B0(j5, durationUnit, i5);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void D() {
    }

    public static final long D0(long j5, @d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("尉"));
        DurationUnit c02 = c0(j5);
        if (durationUnit.compareTo(c02) <= 0 || j0(j5)) {
            return j5;
        }
        long j6 = j5 >> 1;
        return g.n0(j6 - (j6 % j.b(1L, durationUnit, c02)), c02);
    }

    public static final long E0(long j5) {
        long i5;
        i5 = g.i(-(j5 >> 1), ((int) j5) & 1);
        return i5;
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void F() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void H() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void J() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void L() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void N() {
    }

    public static final long P(long j5) {
        return x0(j5, DurationUnit.DAYS);
    }

    public static final long Q(long j5) {
        return x0(j5, DurationUnit.HOURS);
    }

    public static final long R(long j5) {
        return x0(j5, DurationUnit.MICROSECONDS);
    }

    public static final long S(long j5) {
        return (h0(j5) && g0(j5)) ? j5 >> 1 : x0(j5, DurationUnit.MILLISECONDS);
    }

    public static final long T(long j5) {
        return x0(j5, DurationUnit.MINUTES);
    }

    public static final long U(long j5) {
        long j6 = j5 >> 1;
        if (i0(j5)) {
            return j6;
        }
        if (j6 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j6 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j6 * g.f27203a;
    }

    public static final long V(long j5) {
        return x0(j5, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void W() {
    }

    public static final int X(long j5) {
        if (j0(j5)) {
            return 0;
        }
        return (int) (T(j5) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void Y() {
    }

    public static final int Z(long j5) {
        if (j0(j5)) {
            return 0;
        }
        return (int) (h0(j5) ? ((j5 >> 1) % 1000) * g.f27203a : (j5 >> 1) % okhttp3.internal.http2.e.W);
    }

    @PublishedApi
    public static /* synthetic */ void a0() {
    }

    public static final int b0(long j5) {
        if (j0(j5)) {
            return 0;
        }
        return (int) (V(j5) % 60);
    }

    private static final DurationUnit c0(long j5) {
        return i0(j5) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    private static final int d0(long j5) {
        return ((int) j5) & 1;
    }

    private static final long e0(long j5) {
        return j5 >> 1;
    }

    public static int f0(long j5) {
        return Long.hashCode(j5);
    }

    public static final boolean g0(long j5) {
        return !j0(j5);
    }

    private static final boolean h0(long j5) {
        return (((int) j5) & 1) == 1;
    }

    private static final boolean i0(long j5) {
        return (((int) j5) & 1) == 0;
    }

    public static final boolean j0(long j5) {
        return j5 == f27198r || j5 == f27199s;
    }

    public static final boolean k0(long j5) {
        return j5 < 0;
    }

    private static final long l(long j5, long j6, long j7) {
        long K;
        long j8;
        long l5;
        long j9 = g.f27203a;
        long j10 = j7 / j9;
        long j11 = j6 + j10;
        if (new LongRange(-4611686018426L, 4611686018426L).v(j11)) {
            l5 = g.l((j11 * j9) + (j7 - (j10 * j9)));
            return l5;
        }
        K = u.K(j11, -4611686018427387903L, g.f27205c);
        j8 = g.j(K);
        return j8;
    }

    public static final boolean l0(long j5) {
        return j5 > 0;
    }

    public static final long m0(long j5, long j6) {
        return n0(j5, E0(j6));
    }

    public static final long n0(long j5, long j6) {
        long k5;
        long m5;
        if (j0(j5)) {
            if (g0(j6) || (j6 ^ j5) >= 0) {
                return j5;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("尊"));
        }
        if (j0(j6)) {
            return j6;
        }
        if ((((int) j5) & 1) != (((int) j6) & 1)) {
            return h0(j5) ? l(j5, j5 >> 1, j6 >> 1) : l(j5, j6 >> 1, j5 >> 1);
        }
        long j7 = (j5 >> 1) + (j6 >> 1);
        if (i0(j5)) {
            m5 = g.m(j7);
            return m5;
        }
        k5 = g.k(j7);
        return k5;
    }

    private static final void o(long j5, StringBuilder sb, int i5, int i6, int i7, String str, boolean z5) {
        String R3;
        sb.append(i5);
        if (i6 != 0) {
            sb.append(org.apache.commons.io.k.f32026a);
            R3 = h0.R3(String.valueOf(i6), i7, '0');
            int i8 = -1;
            int length = R3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i9 = length - 1;
                    if (R3.charAt(length) != '0') {
                        i8 = length;
                        break;
                    } else if (i9 < 0) {
                        break;
                    } else {
                        length = i9;
                    }
                }
            }
            int i10 = i8 + 1;
            String s5 = ProtectedSandApp.s("尋");
            if (z5 || i10 >= 3) {
                sb.append((CharSequence) R3, 0, ((i10 + 2) / 3) * 3);
                l0.o(sb, s5);
            } else {
                sb.append((CharSequence) R3, 0, i10);
                l0.o(sb, s5);
            }
        }
        sb.append(str);
    }

    public static final long o0(long j5, double d6) {
        int K0;
        K0 = kotlin.math.d.K0(d6);
        if (((double) K0) == d6) {
            return p0(j5, K0);
        }
        DurationUnit c02 = c0(j5);
        return g.l0(u0(j5, c02) * d6, c02);
    }

    public static final /* synthetic */ Duration p(long j5) {
        return new Duration(j5);
    }

    public static final long p0(long j5, int i5) {
        int V;
        int U;
        long L;
        long j6;
        int V2;
        int U2;
        long L2;
        long j7;
        long m5;
        long l5;
        if (j0(j5)) {
            if (i5 != 0) {
                return i5 > 0 ? j5 : E0(j5);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("尌"));
        }
        if (i5 == 0) {
            return f27197q;
        }
        long j8 = j5 >> 1;
        long j9 = i5;
        long j10 = j8 * j9;
        if (!i0(j5)) {
            if (j10 / j9 == j8) {
                L = u.L(j10, new LongRange(-4611686018427387903L, g.f27205c));
                j6 = g.j(L);
                return j6;
            }
            V = kotlin.math.d.V(j8);
            U = kotlin.math.d.U(i5);
            return U * V > 0 ? f27198r : f27199s;
        }
        if (new LongRange(-2147483647L, 2147483647L).v(j8)) {
            l5 = g.l(j10);
            return l5;
        }
        if (j10 / j9 == j8) {
            m5 = g.m(j10);
            return m5;
        }
        long j11 = g.f27203a;
        long j12 = j8 / j11;
        long j13 = j12 * j9;
        long j14 = (((j8 - (j12 * j11)) * j9) / j11) + j13;
        if (j13 / j9 != j12 || (j14 ^ j13) < 0) {
            V2 = kotlin.math.d.V(j8);
            U2 = kotlin.math.d.U(i5);
            return U2 * V2 > 0 ? f27198r : f27199s;
        }
        L2 = u.L(j14, new LongRange(-4611686018427387903L, g.f27205c));
        j7 = g.j(L2);
        return j7;
    }

    public static final <T> T q0(long j5, @d5.d q3.p<? super Long, ? super Integer, ? extends T> pVar) {
        l0.p(pVar, ProtectedSandApp.s("對"));
        return pVar.g0(Long.valueOf(V(j5)), Integer.valueOf(Z(j5)));
    }

    public static int r(long j5, long j6) {
        long j7 = j5 ^ j6;
        if (j7 < 0 || (((int) j7) & 1) == 0) {
            return l0.u(j5, j6);
        }
        int i5 = (((int) j5) & 1) - (((int) j6) & 1);
        return k0(j5) ? -i5 : i5;
    }

    public static final <T> T r0(long j5, @d5.d q3.q<? super Long, ? super Integer, ? super Integer, ? extends T> qVar) {
        l0.p(qVar, ProtectedSandApp.s("導"));
        return qVar.G(Long.valueOf(T(j5)), Integer.valueOf(b0(j5)), Integer.valueOf(Z(j5)));
    }

    public static long s(long j5) {
        if (f.d()) {
            if (i0(j5)) {
                long j6 = j5 >> 1;
                if (!new LongRange(-4611686018426999999L, g.f27204b).v(j6)) {
                    throw new AssertionError(j6 + ProtectedSandApp.s("小"));
                }
            } else {
                long j7 = j5 >> 1;
                if (!new LongRange(-4611686018427387903L, g.f27205c).v(j7)) {
                    throw new AssertionError(j7 + ProtectedSandApp.s("少"));
                }
                if (new LongRange(-4611686018426L, 4611686018426L).v(j7)) {
                    throw new AssertionError(j7 + ProtectedSandApp.s("尐"));
                }
            }
        }
        return j5;
    }

    public static final <T> T s0(long j5, @d5.d q3.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> rVar) {
        l0.p(rVar, ProtectedSandApp.s("尒"));
        return rVar.S(Long.valueOf(Q(j5)), Integer.valueOf(X(j5)), Integer.valueOf(b0(j5)), Integer.valueOf(Z(j5)));
    }

    public static final double t(long j5, long j6) {
        Comparable X;
        X = kotlin.comparisons.h.X(c0(j5), c0(j6));
        DurationUnit durationUnit = (DurationUnit) X;
        return u0(j5, durationUnit) / u0(j6, durationUnit);
    }

    public static final <T> T t0(long j5, @d5.d q3.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> sVar) {
        l0.p(sVar, ProtectedSandApp.s("尓"));
        return sVar.i0(Long.valueOf(P(j5)), Integer.valueOf(A(j5)), Integer.valueOf(X(j5)), Integer.valueOf(b0(j5)), Integer.valueOf(Z(j5)));
    }

    public static final long u(long j5, double d6) {
        int K0;
        K0 = kotlin.math.d.K0(d6);
        if ((((double) K0) == d6) && K0 != 0) {
            return v(j5, K0);
        }
        DurationUnit c02 = c0(j5);
        return g.l0(u0(j5, c02) / d6, c02);
    }

    public static final double u0(long j5, @d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("尔"));
        if (j5 == f27198r) {
            return Double.POSITIVE_INFINITY;
        }
        if (j5 == f27199s) {
            return Double.NEGATIVE_INFINITY;
        }
        return j.a(j5 >> 1, c0(j5), durationUnit);
    }

    public static final long v(long j5, int i5) {
        long j6;
        long l5;
        int U;
        long l6;
        if (i5 == 0) {
            if (l0(j5)) {
                return f27198r;
            }
            if (k0(j5)) {
                return f27199s;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("尕"));
        }
        if (i0(j5)) {
            l6 = g.l((j5 >> 1) / i5);
            return l6;
        }
        if (j0(j5)) {
            U = kotlin.math.d.U(i5);
            return p0(j5, U);
        }
        long j7 = j5 >> 1;
        long j8 = i5;
        long j9 = j7 / j8;
        if (!new LongRange(-4611686018426L, 4611686018426L).v(j9)) {
            j6 = g.j(j9);
            return j6;
        }
        long j10 = g.f27203a;
        l5 = g.l((j9 * j10) + (((j7 - (j9 * j8)) * j10) / j8));
        return l5;
    }

    public static final int v0(long j5, @d5.d DurationUnit durationUnit) {
        long K;
        l0.p(durationUnit, ProtectedSandApp.s("尖"));
        K = u.K(x0(j5, durationUnit), -2147483648L, 2147483647L);
        return (int) K;
    }

    public static boolean w(long j5, Object obj) {
        return (obj instanceof Duration) && j5 == ((Duration) obj).f27200o;
    }

    @d5.d
    public static final String w0(long j5) {
        StringBuilder sb = new StringBuilder();
        if (k0(j5)) {
            sb.append('-');
        }
        sb.append(ProtectedSandApp.s("尗"));
        long y5 = y(j5);
        long Q = Q(y5);
        int X = X(y5);
        int b02 = b0(y5);
        int Z = Z(y5);
        if (j0(j5)) {
            Q = 9999999999999L;
        }
        boolean z5 = true;
        boolean z6 = Q != 0;
        boolean z7 = (b02 == 0 && Z == 0) ? false : true;
        if (X == 0 && (!z7 || !z6)) {
            z5 = false;
        }
        if (z6) {
            sb.append(Q);
            sb.append('H');
        }
        if (z5) {
            sb.append(X);
            sb.append('M');
        }
        if (z7 || (!z6 && !z5)) {
            o(j5, sb, b02, Z, 9, ProtectedSandApp.s("尘"), true);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("尙"));
        return sb2;
    }

    public static final boolean x(long j5, long j6) {
        return j5 == j6;
    }

    public static final long x0(long j5, @d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("尚"));
        if (j5 == f27198r) {
            return Long.MAX_VALUE;
        }
        if (j5 == f27199s) {
            return Long.MIN_VALUE;
        }
        return j.b(j5 >> 1, c0(j5), durationUnit);
    }

    public static final long y(long j5) {
        return k0(j5) ? E0(j5) : j5;
    }

    @PublishedApi
    public static /* synthetic */ void z() {
    }

    /* renamed from: F0, reason: from getter */
    public final /* synthetic */ long getF27200o() {
        return this.f27200o;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Duration duration) {
        return q(duration.f27200o);
    }

    public boolean equals(Object obj) {
        return w(this.f27200o, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.f27200o);
    }

    public int q(long j5) {
        return r(this.f27200o, j5);
    }

    @d5.d
    public String toString() {
        return A0(this.f27200o);
    }
}
