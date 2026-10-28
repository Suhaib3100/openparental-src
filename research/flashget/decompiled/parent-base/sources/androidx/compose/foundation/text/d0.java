package androidx.compose.foundation.text;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: KeyboardActions.kt */
@x4
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015Bµ\u0001\u0012\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R*\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R*\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R*\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R*\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/d0;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "Lkotlin/u;", "onDone", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "<init>", "(Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lld/l;", "b", "()Lld/l;", "c", "d", "e", "f", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f7312h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<c0, k2> onDone;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<c0, k2> onGo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<c0, k2> onNext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<c0, k2> onPrevious;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<c0, k2> onSearch;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<c0, k2> onSend;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final d0 f7313i = new d0(null, null, null, null, null, null, 63, null);

    /* compiled from: KeyboardActions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/d0$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/d0;", "Default", "Landroidx/compose/foundation/text/d0;", "a", "()Landroidx/compose/foundation/text/d0;", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final d0 a() {
            return d0.f7313i;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public d0() {
        this(null, null, null, null, null, null, 63, null);
    }

    @fg.m
    public final ld.l<c0, k2> b() {
        return this.onDone;
    }

    @fg.m
    public final ld.l<c0, k2> c() {
        return this.onGo;
    }

    @fg.m
    public final ld.l<c0, k2> d() {
        return this.onNext;
    }

    @fg.m
    public final ld.l<c0, k2> e() {
        return this.onPrevious;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) other;
        return kotlin.jvm.internal.l0.g(this.onDone, d0Var.onDone) && kotlin.jvm.internal.l0.g(this.onGo, d0Var.onGo) && kotlin.jvm.internal.l0.g(this.onNext, d0Var.onNext) && kotlin.jvm.internal.l0.g(this.onPrevious, d0Var.onPrevious) && kotlin.jvm.internal.l0.g(this.onSearch, d0Var.onSearch) && kotlin.jvm.internal.l0.g(this.onSend, d0Var.onSend);
    }

    @fg.m
    public final ld.l<c0, k2> f() {
        return this.onSearch;
    }

    @fg.m
    public final ld.l<c0, k2> g() {
        return this.onSend;
    }

    public int hashCode() {
        ld.l<c0, k2> lVar = this.onDone;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        ld.l<c0, k2> lVar2 = this.onGo;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        ld.l<c0, k2> lVar3 = this.onNext;
        int hashCode3 = (hashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        ld.l<c0, k2> lVar4 = this.onPrevious;
        int hashCode4 = (hashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        ld.l<c0, k2> lVar5 = this.onSearch;
        int hashCode5 = (hashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        ld.l<c0, k2> lVar6 = this.onSend;
        return hashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@fg.m ld.l<? super c0, k2> lVar, @fg.m ld.l<? super c0, k2> lVar2, @fg.m ld.l<? super c0, k2> lVar3, @fg.m ld.l<? super c0, k2> lVar4, @fg.m ld.l<? super c0, k2> lVar5, @fg.m ld.l<? super c0, k2> lVar6) {
        this.onDone = lVar;
        this.onGo = lVar2;
        this.onNext = lVar3;
        this.onPrevious = lVar4;
        this.onSearch = lVar5;
        this.onSend = lVar6;
    }

    public /* synthetic */ d0(ld.l lVar, ld.l lVar2, ld.l lVar3, ld.l lVar4, ld.l lVar5, ld.l lVar6, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : lVar, (i4 & 2) != 0 ? null : lVar2, (i4 & 4) != 0 ? null : lVar3, (i4 & 8) != 0 ? null : lVar4, (i4 & 16) != 0 ? null : lVar5, (i4 & 32) != 0 ? null : lVar6);
    }
}
