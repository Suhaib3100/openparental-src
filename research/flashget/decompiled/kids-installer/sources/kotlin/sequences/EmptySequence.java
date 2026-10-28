package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "()V", "drop", "n", "", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.g, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class EmptySequence implements Sequence, DropTakeSequence {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final EmptySequence f26890a = new EmptySequence();

    private EmptySequence() {
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence a(int i5) {
        return f26890a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence b(int i5) {
        return f26890a;
    }

    @d5.d
    public EmptySequence c(int i5) {
        return f26890a;
    }

    @d5.d
    public EmptySequence d(int i5) {
        return f26890a;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator iterator() {
        return EmptyIterator.f23163o;
    }
}
