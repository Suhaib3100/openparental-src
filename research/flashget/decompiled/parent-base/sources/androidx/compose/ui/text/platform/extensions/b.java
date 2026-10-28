package androidx.compose.ui.text.platform.extensions;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import androidx.annotation.x0;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.platform.m;
import fg.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;

/* compiled from: LocaleExtensions.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/b;", "", "<init>", "()V", "Lu0/f;", "localeList", "a", "(Lu0/f;)Ljava/lang/Object;", "Landroidx/compose/ui/text/platform/m;", "textPaint", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/text/platform/m;Lu0/f;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 1)
@x0(24)
@r1({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n1549#2:58\n1620#2,3:59\n37#3,2:56\n37#3,2:62\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:52\n40#1:53,3\n47#1:58\n47#1:59,3\n40#1:56,2\n47#1:62,2\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f21243a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f21244b = 0;

    private b() {
    }

    @l
    @androidx.annotation.u
    @x0(24)
    public final Object a(@l u0.f localeList) {
        ArrayList arrayList = new ArrayList(w.b0(localeList, 10));
        Iterator<u0.e> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @androidx.annotation.u
    @x0(24)
    public final void b(@l m textPaint, @l u0.f localeList) {
        ArrayList arrayList = new ArrayList(w.b0(localeList, 10));
        Iterator<u0.e> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
