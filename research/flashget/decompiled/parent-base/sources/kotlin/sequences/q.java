package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\u001aL\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aL\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\"\u0018\u0010\u0011\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0010\"\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0010\"\u0018\u0010\u0014\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0018\u0010\u0016\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010\"\u0018\u0010\u0018\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\"\u0018\u0010\u001a\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010*\f\b\u0002\u0010\u001b\"\u00020\u000e2\u00020\u000e¨\u0006\u001c"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlin/sequences/o;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlin/sequences/m;", "b", "(Lld/p;)Lkotlin/sequences/m;", "", "a", "(Lld/p;)Ljava/util/Iterator;", "", "Lkotlin/sequences/State;", "I", "State_NotReady", "State_ManyNotReady", "c", "State_ManyReady", "d", "State_Ready", "e", "State_Done", "f", "State_Failed", "State", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes7.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f78932a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f78933b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f78934c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f78935d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f78936e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f78937f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.p f78938a;

        public a(ld.p pVar) {
            this.f78938a = pVar;
        }

        @Override // kotlin.sequences.m
        @fg.l
        public Iterator<T> iterator() {
            return q.a(this.f78938a);
        }
    }

    @fg.l
    @c1(version = "1.3")
    public static <T> Iterator<T> a(@fg.l @InterfaceC1469b ld.p<? super o<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        l0.p(pVar, ProtectedSandApp.s("苼\u0001"));
        n nVar = new n();
        nVar.m(kotlin.coroutines.intrinsics.b.c(pVar, nVar, nVar));
        return nVar;
    }

    @fg.l
    @c1(version = "1.3")
    public static <T> m<T> b(@fg.l @InterfaceC1469b ld.p<? super o<? super T>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        l0.p(pVar, ProtectedSandApp.s("苼\u0001"));
        return new a(pVar);
    }
}
