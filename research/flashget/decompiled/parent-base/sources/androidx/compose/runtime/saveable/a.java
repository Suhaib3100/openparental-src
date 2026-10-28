package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import ld.p;

/* compiled from: ListSaver.kt */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0084\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000122\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0002¢\u0006\u0002\b\b2)\u0010\f\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/n;", "Lkotlin/r0;", "name", "value", "", "Lkotlin/u;", "save", "Lkotlin/Function1;", "list", "restore", "Landroidx/compose/runtime/saveable/l;", "", "a", "(Lld/p;Lld/l;)Landroidx/compose/runtime/saveable/l;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* compiled from: ListSaver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Original", "Saveable", "Landroidx/compose/runtime/saveable/n;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nListSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSaver.kt\nandroidx/compose/runtime/saveable/ListSaverKt$listSaver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
    /* renamed from: androidx.compose.runtime.saveable.a$a, reason: collision with other inner class name */
    static final class C0321a<Original> extends n0 implements p<n, Original, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<n, Original, List<Saveable>> f16960b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0321a(p<? super n, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f16960b = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n nVar, Original original) {
            List list = (List) this.f16960b.invoke(nVar, original);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = list.get(i4);
                if (obj != null && !nVar.a(obj)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            List list2 = list;
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
    }

    @fg.l
    public static final <Original, Saveable> l<Original, Object> a(@fg.l p<? super n, ? super Original, ? extends List<? extends Saveable>> pVar, @fg.l ld.l<? super List<? extends Saveable>, ? extends Original> lVar) {
        C0321a c0321a = new C0321a(pVar);
        l0.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return m.a(c0321a, (ld.l) u1.q(lVar, 1));
    }
}
