package kotlin.coroutines.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: DebugMetadata.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Ljava/lang/StackTraceElement;", "e", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/f;", "b", "(Lkotlin/coroutines/jvm/internal/a;)Lkotlin/coroutines/jvm/internal/f;", "", "c", "(Lkotlin/coroutines/jvm/internal/a;)I", "expected", "actual", "Lkotlin/k2;", "a", "(II)V", "", "", "d", "(Lkotlin/coroutines/jvm/internal/a;)[Ljava/lang/String;", "I", "COROUTINES_DEBUG_METADATA_VERSION", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f75074a = 1;

    private static final void a(int i4, int i5) {
        if (i5 <= i4) {
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("挱\u0001") + i4 + ProtectedSandApp.s("挲\u0001") + i5 + ProtectedSandApp.s("挳\u0001")).toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField(ProtectedSandApp.s("挴\u0001"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @fg.m
    @c1(version = "1.3")
    @kd.i(name = "getSpilledVariableFieldMapping")
    public static final String[] d(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("挵\u0001"));
        f b5 = b(aVar);
        if (b5 == null) {
            return null;
        }
        a(1, b5.v());
        ArrayList arrayList = new ArrayList();
        int c5 = c(aVar);
        int[] i4 = b5.i();
        int length = i4.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i4[i5] == c5) {
                arrayList.add(b5.s()[i5]);
                arrayList.add(b5.n()[i5]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @fg.m
    @c1(version = "1.3")
    @kd.i(name = "getStackTraceElement")
    public static final StackTraceElement e(@fg.l a aVar) {
        String str;
        l0.p(aVar, ProtectedSandApp.s("挵\u0001"));
        f b5 = b(aVar);
        if (b5 == null) {
            return null;
        }
        a(1, b5.v());
        int c5 = c(aVar);
        int i4 = c5 < 0 ? -1 : b5.l()[c5];
        String b6 = i.f75075a.b(aVar);
        if (b6 == null) {
            str = b5.c();
        } else {
            str = b6 + '/' + b5.c();
        }
        return new StackTraceElement(str, b5.m(), b5.f(), i4);
    }
}
