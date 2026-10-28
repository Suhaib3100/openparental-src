package androidx.room.util;

import androidx.annotation.c1;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: StringUtil.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f\"\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ljava/lang/StringBuilder;", "d", "()Ljava/lang/StringBuilder;", "builder", "", "count", "Lkotlin/k2;", "a", "(Ljava/lang/StringBuilder;I)V", "", "input", "", "e", "(Ljava/lang/String;)Ljava/util/List;", "c", "(Ljava/util/List;)Ljava/lang/String;", "", "[Ljava/lang/String;", "b", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@kd.i(name = "StringUtil")
@r1({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n1#3:97\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n66#1:87,9\n66#1:96\n66#1:98\n66#1:99\n66#1:97\n*E\n"})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    @kd.f
    public static final String[] f33961a = new String[0];

    public static final void a(@l StringBuilder builder, int i4) {
        l0.p(builder, "builder");
        for (int i5 = 0; i5 < i4; i5++) {
            builder.append("?");
            if (i5 < i4 - 1) {
                builder.append(",");
            }
        }
    }

    public static /* synthetic */ void b() {
    }

    @m
    public static final String c(@m List<Integer> list) {
        if (list != null) {
            return w.m3(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @l
    public static final StringBuilder d() {
        return new StringBuilder();
    }

    @m
    public static final List<Integer> e(@m String str) {
        List Q4;
        Integer num;
        if (str == null || (Q4 = v.Q4(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Q4.iterator();
        while (it.hasNext()) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
