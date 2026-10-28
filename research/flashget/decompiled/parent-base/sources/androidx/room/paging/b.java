package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.paging.b1;
import androidx.paging.d1;
import androidx.room.c2;
import androidx.room.d2;
import androidx.room.g2;
import androidx.room.k;
import f3.g;
import fg.l;
import fg.m;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: LimitOffsetPagingSource.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rB-\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\u0010J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH%¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u0004\u0018\u00010\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/room/paging/b;", "", "Value", "Landroidx/paging/b1;", "", "Landroidx/room/g2;", "sourceQuery", "Landroidx/room/c2;", "db", "", "", "tables", "<init>", "(Landroidx/room/g2;Landroidx/room/c2;[Ljava/lang/String;)V", "Lf3/g;", "supportSQLiteQuery", "(Lf3/g;Landroidx/room/c2;[Ljava/lang/String;)V", "Landroidx/paging/b1$a;", "params", "Landroidx/paging/b1$b;", "r", "(Landroidx/paging/b1$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "tempCount", "t", "(Landroidx/paging/b1$a;ILkotlin/coroutines/d;)Ljava/lang/Object;", "g", "Landroid/database/Cursor;", "cursor", "", "o", "(Landroid/database/Cursor;)Ljava/util/List;", "Landroidx/paging/d1;", "state", "q", "(Landroidx/paging/d1;)Ljava/lang/Integer;", "b", "Landroidx/room/g2;", "c", "Landroidx/room/c2;", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "p", "()Ljava/util/concurrent/atomic/AtomicInteger;", "itemCount", "Lc3/b;", "e", "Lc3/b;", "observer", "", "()Z", "jumpingSupported", "room-paging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b<Value> extends b1<Integer, Value> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final g2 sourceQuery;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final c2 db;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicInteger itemCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final c3.b observer;

    /* compiled from: LimitOffsetPagingSource.kt */
    @f(c = "androidx.room.paging.LimitOffsetPagingSource$initialLoad$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "Landroidx/paging/b1$b;", "", "<anonymous>", "()Landroidx/paging/b1$b;"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements ld.l<kotlin.coroutines.d<? super b1.b<Integer, Value>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33904b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<Value> f33905c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b1.a<Integer> f33906d;

        /* compiled from: LimitOffsetPagingSource.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.paging.b$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0610a extends h0 implements ld.l<Cursor, List<? extends Value>> {
            C0610a(Object obj) {
                super(1, obj, b.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
            }

            @Override // ld.l
            @l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final List<Value> invoke(@l Cursor p02) {
                l0.p(p02, "p0");
                return ((b) this.receiver).o(p02);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<Value> bVar, b1.a<Integer> aVar, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f33905c = bVar;
            this.f33906d = aVar;
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@m kotlin.coroutines.d<? super b1.b<Integer, Value>> dVar) {
            return ((a) create(dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@l kotlin.coroutines.d<?> dVar) {
            return new a(this.f33905c, this.f33906d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f33904b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            int g4 = c3.a.g(((b) this.f33905c).sourceQuery, ((b) this.f33905c).db);
            this.f33905c.getItemCount().set(g4);
            return c3.a.f(this.f33906d, ((b) this.f33905c).sourceQuery, ((b) this.f33905c).db, g4, null, new C0610a(this.f33905c), 16, null);
        }
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @f(c = "androidx.room.paging.LimitOffsetPagingSource$load$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {76, 78}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Lkotlinx/coroutines/r0;", "Landroidx/paging/b1$b;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/b1$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.room.paging.b$b, reason: collision with other inner class name */
    static final class C0611b extends o implements p<r0, kotlin.coroutines.d<? super b1.b<Integer, Value>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f33907b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<Value> f33908c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b1.a<Integer> f33909d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0611b(b<Value> bVar, b1.a<Integer> aVar, kotlin.coroutines.d<? super C0611b> dVar) {
            super(2, dVar);
            this.f33908c = bVar;
            this.f33909d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new C0611b(this.f33908c, this.f33909d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f33907b;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        a1.n(obj);
                        return (b1.b) obj;
                    }
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                    return (b1.b) obj;
                }
                a1.n(obj);
                ((b) this.f33908c).observer.e(((b) this.f33908c).db);
                int i5 = this.f33908c.getItemCount().get();
                if (i5 == -1) {
                    b<Value> bVar = this.f33908c;
                    b1.a<Integer> aVar2 = this.f33909d;
                    this.f33907b = 1;
                    obj = bVar.r(aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    return (b1.b) obj;
                }
                b<Value> bVar2 = this.f33908c;
                b1.a<Integer> aVar3 = this.f33909d;
                this.f33907b = 2;
                obj = bVar2.t(aVar3, i5, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (b1.b) obj;
            } catch (Exception e4) {
                return new b1.b.a(e4);
            }
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super b1.b<Integer, Value>> dVar) {
            return ((C0611b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends h0 implements ld.l<Cursor, List<? extends Value>> {
        c(Object obj) {
            super(1, obj, b.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
        }

        @Override // ld.l
        @l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final List<Value> invoke(@l Cursor p02) {
            l0.p(p02, "p0");
            return ((b) this.receiver).o(p02);
        }
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class d extends h0 implements ld.a<k2> {
        d(Object obj) {
            super(0, obj, b.class, "invalidate", "invalidate()V", 0);
        }

        public final void Z() {
            ((b) this.receiver).f();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            Z();
            return k2.f75408a;
        }
    }

    public b(@l g2 sourceQuery, @l c2 db2, @l String... tables) {
        l0.p(sourceQuery, "sourceQuery");
        l0.p(db2, "db");
        l0.p(tables, "tables");
        this.sourceQuery = sourceQuery;
        this.db = db2;
        this.itemCount = new AtomicInteger(-1);
        this.observer = new c3.b(tables, new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b1.a<Integer> aVar, kotlin.coroutines.d<? super b1.b<Integer, Value>> dVar) {
        return d2.g(this.db, new a(this, aVar, null), dVar);
    }

    static /* synthetic */ <Value> Object s(b<Value> bVar, b1.a<Integer> aVar, kotlin.coroutines.d<? super b1.b<Integer, Value>> dVar) {
        return i.h(k.a(((b) bVar).db), new C0611b(bVar, aVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(b1.a<Integer> aVar, int i4, kotlin.coroutines.d<? super b1.b<Integer, Value>> dVar) {
        b1.b f4 = c3.a.f(aVar, this.sourceQuery, this.db, i4, null, new c(this), 16, null);
        this.db.getInvalidationTracker().s();
        if (!a()) {
            return f4;
        }
        b1.b.C0529b<Object, Object> b5 = c3.a.b();
        l0.n(b5, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.LimitOffsetPagingSource>");
        return b5;
    }

    @Override // androidx.paging.b1
    public boolean c() {
        return true;
    }

    @Override // androidx.paging.b1
    @m
    public Object g(@l b1.a<Integer> aVar, @l kotlin.coroutines.d<? super b1.b<Integer, Value>> dVar) {
        return s(this, aVar, dVar);
    }

    @l
    @o0
    protected abstract List<Value> o(@l Cursor cursor);

    @l
    /* renamed from: p, reason: from getter */
    public final AtomicInteger getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.paging.b1
    @m
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer e(@l d1<Integer, Value> state) {
        l0.p(state, "state");
        return c3.a.a(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l g supportSQLiteQuery, @l c2 db2, @l String... tables) {
        this(g2.INSTANCE.b(supportSQLiteQuery), db2, (String[]) Arrays.copyOf(tables, tables.length));
        l0.p(supportSQLiteQuery, "supportSQLiteQuery");
        l0.p(db2, "db");
        l0.p(tables, "tables");
    }
}
