package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\u001e\b\u0000\u0010\u0013\u001a\u0004\b\u0000\u0010\u0011\"\b\u0012\u0004\u0012\u00028\u00000\u00122\b\u0012\u0004\u0012\u00028\u00000\u0012¨\u0006\u0014"}, d2 = {"", "minDigits", "maxDigits", "", "isGroupingUsed", "", "c", "(IIIZ)Ljava/lang/String;", "Ljava/text/NumberFormat;", "b", "(IIZ)Ljava/text/NumberFormat;", "Ljava/util/WeakHashMap;", "a", "Ljava/util/WeakHashMap;", "cachedFormatters", "Ljava/util/Locale;", "CalendarLocale", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "InternalAtomicReference", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/material3/ActualJvm_jvmKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n361#2,7:71\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/material3/ActualJvm_jvmKt\n*L\n62#1:71,7\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final WeakHashMap<String, NumberFormat> f9824a = new WeakHashMap<>();

    public static /* synthetic */ void a() {
    }

    private static final NumberFormat b(int i4, int i5, boolean z4) {
        String str = i4 + '.' + i5 + '.' + z4 + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = f9824a;
        NumberFormat numberFormat = weakHashMap.get(str);
        if (numberFormat == null) {
            numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setGroupingUsed(z4);
            numberFormat.setMinimumIntegerDigits(i4);
            numberFormat.setMaximumIntegerDigits(i5);
            weakHashMap.put(str, numberFormat);
        }
        return numberFormat;
    }

    @fg.l
    public static final String c(int i4, int i5, int i6, boolean z4) {
        return b(i5, i6, z4).format(Integer.valueOf(i4));
    }

    public static /* synthetic */ String d(int i4, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 1;
        }
        if ((i7 & 2) != 0) {
            i6 = 40;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return c(i4, i5, i6, z4);
    }
}
