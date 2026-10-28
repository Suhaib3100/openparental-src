package kotlin.coroutines.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: DebugMetadata.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23314a = 1;

    private static final void a(int i5, int i6) {
        if (i6 <= i5) {
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("㻟") + i5 + ProtectedSandApp.s("㻠") + i6 + ProtectedSandApp.s("㻡")).toString());
    }

    private static final DebugMetadata b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField(ProtectedSandApp.s("㻢"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @p3.i(name = "getSpilledVariableFieldMapping")
    @SinceKotlin(version = "1.3")
    @d5.e
    public static final String[] d(@d5.d BaseContinuationImpl baseContinuationImpl) {
        l0.p(baseContinuationImpl, ProtectedSandApp.s("㻣"));
        DebugMetadata b6 = b(baseContinuationImpl);
        if (b6 == null) {
            return null;
        }
        a(1, b6.v());
        ArrayList arrayList = new ArrayList();
        int c6 = c(baseContinuationImpl);
        int[] i5 = b6.i();
        int length = i5.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (i5[i6] == c6) {
                arrayList.add(b6.s()[i6]);
                arrayList.add(b6.n()[i6]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @p3.i(name = "getStackTraceElement")
    @SinceKotlin(version = "1.3")
    @d5.e
    public static final StackTraceElement e(@d5.d BaseContinuationImpl baseContinuationImpl) {
        String str;
        l0.p(baseContinuationImpl, ProtectedSandApp.s("㻤"));
        DebugMetadata b6 = b(baseContinuationImpl);
        if (b6 == null) {
            return null;
        }
        a(1, b6.v());
        int c6 = c(baseContinuationImpl);
        int i5 = c6 < 0 ? -1 : b6.l()[c6];
        String b7 = ModuleNameRetriever.f23315a.b(baseContinuationImpl);
        if (b7 == null) {
            str = b6.c();
        } else {
            str = b7 + org.apache.commons.io.n.f32060b + b6.c();
        }
        return new StackTraceElement(str, b6.m(), b6.f(), i5);
    }
}
