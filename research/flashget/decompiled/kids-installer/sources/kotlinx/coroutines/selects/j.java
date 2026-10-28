package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import q3.l;
import q3.p;

/* compiled from: SelectUnbiased.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001J5\u0010\u0001\u001a\u00020\u0005*\u00020\b2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\fJG\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u000e2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000fH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J[\u0010\u0015\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u0012\"\u0004\b\u0002\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000fH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR3\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\"0!j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\"`#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/selects/j;", "R", "Lkotlinx/coroutines/selects/a;", "", "e", "Lkotlin/m2;", "", "f", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "(Lkotlinx/coroutines/selects/c;Lq3/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", "s0", "(Lkotlinx/coroutines/selects/d;Lq3/p;)V", "P", "Lkotlinx/coroutines/selects/e;", "param", "A", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Lq3/p;)V", "", "timeMillis", "b", "(JLq3/l;)V", "Lkotlinx/coroutines/selects/b;", "o", "Lkotlinx/coroutines/selects/b;", "d", "()Lkotlinx/coroutines/selects/b;", "instance", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "Lkotlin/collections/ArrayList;", "p", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "clauses", "uCont", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes5.dex */
public final class j<R> implements kotlinx.coroutines.selects.a<R> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.selects.b<R> instance;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ArrayList<q3.a<m2>> clauses = new ArrayList<>();

    /* compiled from: SelectUnbiased.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.c f28928p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<R> f28929q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ l<Continuation<? super R>, Object> f28930r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.selects.c cVar, j<? super R> jVar, l<? super Continuation<? super R>, ? extends Object> lVar) {
            super(0);
            this.f28928p = cVar;
            this.f28929q = jVar;
            this.f28930r = lVar;
        }

        public final void a() {
            this.f28928p.x(this.f28929q.d(), this.f28930r);
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            a();
            return m2.f23662a;
        }
    }

    /* compiled from: SelectUnbiased.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Q", "R", "Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.d<Q> f28931p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<R> f28932q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ p<Q, Continuation<? super R>, Object> f28933r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.selects.d<? extends Q> dVar, j<? super R> jVar, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
            super(0);
            this.f28931p = dVar;
            this.f28932q = jVar;
            this.f28933r = pVar;
        }

        public final void a() {
            this.f28931p.L(this.f28932q.d(), this.f28933r);
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            a();
            return m2.f23662a;
        }
    }

    /* compiled from: SelectUnbiased.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"P", "Q", "R", "Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ e<P, Q> f28934p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<R> f28935q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ P f28936r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ p<Q, Continuation<? super R>, Object> f28937s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e<? super P, ? extends Q> eVar, j<? super R> jVar, P p5, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
            super(0);
            this.f28934p = eVar;
            this.f28935q = jVar;
            this.f28936r = p5;
            this.f28937s = pVar;
        }

        public final void a() {
            this.f28934p.V(this.f28935q.d(), this.f28936r, this.f28937s);
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            a();
            return m2.f23662a;
        }
    }

    /* compiled from: SelectUnbiased.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/m2;", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.a<m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<R> f28938p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f28939q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ l<Continuation<? super R>, Object> f28940r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(j<? super R> jVar, long j5, l<? super Continuation<? super R>, ? extends Object> lVar) {
            super(0);
            this.f28938p = jVar;
            this.f28939q = j5;
            this.f28940r = lVar;
        }

        public final void a() {
            this.f28938p.d().b(this.f28939q, this.f28940r);
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            a();
            return m2.f23662a;
        }
    }

    public j(@d5.d Continuation<? super R> continuation) {
        this.instance = new kotlinx.coroutines.selects.b<>(continuation);
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void A(@d5.d e<? super P, ? extends Q> eVar, P p5, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        this.clauses.add(new c(eVar, this, p5, pVar));
    }

    @Override // kotlinx.coroutines.selects.a
    public void R(@d5.d kotlinx.coroutines.selects.c cVar, @d5.d l<? super Continuation<? super R>, ? extends Object> lVar) {
        this.clauses.add(new a(cVar, this, lVar));
    }

    @d5.d
    public final ArrayList<q3.a<m2>> a() {
        return this.clauses;
    }

    @Override // kotlinx.coroutines.selects.a
    public void b(long timeMillis, @d5.d l<? super Continuation<? super R>, ? extends Object> block) {
        this.clauses.add(new d(this, timeMillis, block));
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void c(@d5.d e<? super P, ? extends Q> eVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        A(eVar, null, pVar);
    }

    @d5.d
    public final kotlinx.coroutines.selects.b<R> d() {
        return this.instance;
    }

    @PublishedApi
    public final void e(@d5.d Throwable th) {
        this.instance.i1(th);
    }

    @d5.e
    @PublishedApi
    public final Object f() {
        if (!this.instance.C()) {
            try {
                Collections.shuffle(this.clauses);
                Iterator<T> it = this.clauses.iterator();
                while (it.hasNext()) {
                    ((q3.a) it.next()).n();
                }
            } catch (Throwable th) {
                this.instance.i1(th);
            }
        }
        return this.instance.h1();
    }

    @Override // kotlinx.coroutines.selects.a
    public <Q> void s0(@d5.d kotlinx.coroutines.selects.d<? extends Q> dVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        this.clauses.add(new b(dVar, this, pVar));
    }
}
