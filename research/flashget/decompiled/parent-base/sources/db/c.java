package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.threeten.bp.q;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\n\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lorg/threeten/bp/d;", "other", "", "a", "(Lorg/threeten/bp/d;Lorg/threeten/bp/d;)I", "T", "", "Lkotlin/Function1;", "", "predicate", "c", "(Ljava/lang/Iterable;Lld/l;)Ljava/lang/Integer;", "Lcb/a;", "Lorg/threeten/bp/q;", "b", "(Lcb/a;)Lorg/threeten/bp/q;", "positionYearMonth", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/kizitonwose/calendar/data/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n336#2,8:27\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/kizitonwose/calendar/data/ExtensionsKt\n*L\n23#1:27,8\n*E\n"})
/* loaded from: classes6.dex */
public final class c {

    /* compiled from: Extensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73705a;

        static {
            int[] iArr = new int[cb.d.values().length];
            try {
                iArr[cb.d.InDate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cb.d.MonthDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cb.d.OutDate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73705a = iArr;
        }
    }

    public static final int a(@l org.threeten.bp.d dVar, @l org.threeten.bp.d dVar2) {
        l0.p(dVar, ProtectedSandApp.s("㜎\u0001"));
        l0.p(dVar2, ProtectedSandApp.s("㜏\u0001"));
        return ((dVar2.ordinal() - dVar.ordinal()) + 7) % 7;
    }

    @l
    public static final q b(@l cb.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("㜎\u0001"));
        int i4 = a.f73705a[aVar.f().ordinal()];
        if (i4 == 1) {
            return cb.f.h(cb.f.j(aVar.e()));
        }
        if (i4 == 2) {
            return cb.f.j(aVar.e());
        }
        if (i4 == 3) {
            return cb.f.i(cb.f.j(aVar.e()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @m
    public static final <T> Integer c(@l Iterable<? extends T> iterable, @l ld.l<? super T, Boolean> lVar) {
        Iterator a5 = b.a(iterable, ProtectedSandApp.s("㜎\u0001"), lVar, ProtectedSandApp.s("㜐\u0001"));
        int i4 = 0;
        while (true) {
            if (!a5.hasNext()) {
                i4 = -1;
                break;
            }
            a0.c cVar = (Object) a5.next();
            if (i4 < 0) {
                w.Z();
            }
            if (lVar.invoke(cVar).booleanValue()) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            return null;
        }
        return Integer.valueOf(i4);
    }
}
