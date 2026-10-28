package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/sequences/c;", "T", "K", "Lkotlin/sequences/m;", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Lkotlin/sequences/m;Lld/l;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/m;", "b", "Lld/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c<T, K> implements m<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, K> keySelector;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@fg.l m<? extends T> mVar, @fg.l ld.l<? super T, ? extends K> lVar) {
        l0.p(mVar, ProtectedSandApp.s("苠\u0001"));
        l0.p(lVar, ProtectedSandApp.s("苡\u0001"));
        this.source = mVar;
        this.keySelector = lVar;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<T> iterator() {
        return new b(this.source.iterator(), this.keySelector);
    }
}
