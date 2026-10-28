package kotlin.enums;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: EnumEntries.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00070\u0006H\u0001\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"enumEntries", "Lkotlin/enums/EnumEntries;", "T", "", "E", "entriesProvider", "Lkotlin/Function0;", "", "entries", "([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnumEntries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n+ 2 EnumEntriesJVM.kt\nkotlin/enums/EnumEntriesJVMKt\n*L\n1#1,91:1\n16#2:92\n*S KotlinDebug\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n*L\n31#1:92\n*E\n"})
/* loaded from: classes5.dex */
public final class c {
    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final <T extends Enum<T>> EnumEntries<T> a() {
        l0.P();
        return c(new Enum[0]);
    }

    @SinceKotlin(version = "1.8")
    @PublishedApi
    @d5.d
    public static final <E extends Enum<E>> EnumEntries<E> b(@d5.d q3.a<E[]> aVar) {
        l0.p(aVar, ProtectedSandApp.s("㼛"));
        return new EnumEntriesList(aVar.n());
    }

    @SinceKotlin(version = "1.8")
    @PublishedApi
    @d5.d
    public static final <E extends Enum<E>> EnumEntries<E> c(@d5.d E[] eArr) {
        l0.p(eArr, ProtectedSandApp.s("㼜"));
        return new EnumEntriesList(eArr);
    }
}
