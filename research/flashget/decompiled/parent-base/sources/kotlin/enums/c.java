package kotlin.enums;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r;
import kotlin.w0;

/* compiled from: EnumEntries.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Lkotlin/enums/a;", "a", "()Lkotlin/enums/a;", "E", "Lkotlin/Function0;", "", "entriesProvider", "b", "(Lld/a;)Lkotlin/enums/a;", "entries", "c", "([Ljava/lang/Enum;)Lkotlin/enums/a;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nEnumEntries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n+ 2 EnumEntriesJVM.kt\nkotlin/enums/EnumEntriesJVMKt\n*L\n1#1,91:1\n16#2:92\n*S KotlinDebug\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n*L\n31#1:92\n*E\n"})
/* loaded from: classes7.dex */
public final class c {
    @r
    @c1(version = "1.9")
    public static final <T extends Enum<T>> a<T> a() {
        l0.P();
        return c(new Enum[0]);
    }

    @l
    @c1(version = "1.8")
    @w0
    public static final <E extends Enum<E>> a<E> b(@l ld.a<E[]> aVar) {
        l0.p(aVar, ProtectedSandApp.s("捎\u0001"));
        return new d(aVar.invoke());
    }

    @l
    @c1(version = "1.8")
    @w0
    public static final <E extends Enum<E>> a<E> c(@l E[] eArr) {
        l0.p(eArr, ProtectedSandApp.s("捏\u0001"));
        return new d(eArr);
    }
}
