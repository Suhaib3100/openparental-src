package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.o2;

/* compiled from: KClasses.kt */
@kd.i(name = "KClasses")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/reflect/d;", "value", "a", "(Lkotlin/reflect/d;Ljava/lang/Object;)Ljava/lang/Object;", "b", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
/* loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @o2(markerClass = {kotlin.r.class})
    @kotlin.internal.h
    @fg.l
    @c1(version = "1.4")
    public static final <T> T a(@fg.l d<T> dVar, @fg.m Object obj) {
        l0.p(dVar, ProtectedSandApp.s("昑\u0001"));
        if (dVar.q(obj)) {
            l0.n(obj, ProtectedSandApp.s("昒\u0001"));
            return obj;
        }
        throw new ClassCastException(ProtectedSandApp.s("易\u0001") + dVar.N());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o2(markerClass = {kotlin.r.class})
    @kotlin.internal.h
    @fg.m
    @c1(version = "1.4")
    public static final <T> T b(@fg.l d<T> dVar, @fg.m Object obj) {
        l0.p(dVar, ProtectedSandApp.s("昑\u0001"));
        if (!dVar.q(obj)) {
            return null;
        }
        l0.n(obj, ProtectedSandApp.s("昔\u0001"));
        return obj;
    }
}
