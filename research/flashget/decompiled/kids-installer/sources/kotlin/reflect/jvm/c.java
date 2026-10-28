package kotlin.reflect.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.m;
import p3.i;

/* compiled from: KClassesJvm.kt */
@i(name = "KClassesJvm")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0019\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/d;", "", "a", "(Lkotlin/reflect/d;)Ljava/lang/String;", "jvmName", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class c {
    @d5.d
    public static final String a(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌻"));
        String name = ((m) kClass).f().getName();
        l0.o(name, ProtectedSandApp.s("䌼"));
        return name;
    }
}
