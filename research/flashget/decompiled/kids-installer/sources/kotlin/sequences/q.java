package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aJ\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2/\b\u0001\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0015\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002X\u0082T¢\u0006\u0002\n\u0000*\f\b\u0002\u0010\u0016\"\u00020\u00012\u00020\u0001¨\u0006\u0017"}, d2 = {"State_Done", "", "Lkotlin/sequences/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "iterator", "", "T", "block", "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "sequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "State", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes5.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f26922a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f26923b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f26924c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f26925d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f26926e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f26927f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    public static final class a<T> implements Sequence<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.p f26928a;

        public a(q3.p pVar) {
            this.f26928a = pVar;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<T> iterator() {
            return q.a(this.f26928a);
        }
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static <T> Iterator<T> a(@BuilderInference @d5.d q3.p<? super SequenceScope<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        Continuation<? super m2> c6;
        l0.p(pVar, ProtectedSandApp.s("娰"));
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        c6 = kotlin.coroutines.intrinsics.c.c(pVar, sequenceBuilderIterator, sequenceBuilderIterator);
        sequenceBuilderIterator.q(c6);
        return sequenceBuilderIterator;
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static <T> Sequence<T> b(@BuilderInference @d5.d q3.p<? super SequenceScope<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        l0.p(pVar, ProtectedSandApp.s("娱"));
        return new a(pVar);
    }
}
