package la;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.random.f;
import kotlin.ranges.s;
import kotlin.text.v;

/* compiled from: RandomUtil.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\u00020\u00038\u0002X\u0082T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/random/f;", "", "length", "", "b", "(Lkotlin/random/f;I)Ljava/lang/String;", "a", "Ljava/lang/String;", "()V", "ALPHANUMERIC_ALPHABET", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRandomUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1#2:43\n1549#3:44\n1620#3,3:45\n*S KotlinDebug\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n*L\n34#1:44\n34#1:45,3\n*E\n"})
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final String f81443a = ProtectedSandApp.s("㡖\u0001");

    private static /* synthetic */ void a() {
    }

    @l
    public static final String b(@l f fVar, int i4) {
        l0.p(fVar, ProtectedSandApp.s("㡕\u0001"));
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("㡗\u0001"), i4).toString());
        }
        kotlin.ranges.l W1 = s.W1(0, i4);
        ArrayList arrayList = new ArrayList(w.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            ((u0) it).c();
            arrayList.add(Character.valueOf(v.m8(ProtectedSandApp.s("㡖\u0001"), fVar)));
        }
        return w.m3(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
