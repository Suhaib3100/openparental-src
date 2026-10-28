package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: PositionalDataSource.kt */
@kotlin.k(message = "PositionalDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.x0(expression = "PagingSource<Int, T>", imports = {"androidx.paging.PagingSource"}))
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b'\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005/0123B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00020\u000fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001d*\u00020\u00012\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0\u001e¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001d*\u00020\u00012\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001f0#¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001d*\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b&\u0010\"J1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u001d*\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b'\u0010%R \u0010.\u001a\u00020(8\u0010X\u0090D¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/paging/e1;", "", "T", "Landroidx/paging/m;", "", "<init>", "()V", "Landroidx/paging/e1$e;", "params", "Landroidx/paging/m$a;", "v", "(Landroidx/paging/e1$e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/m$f;", "i", "(Landroidx/paging/m$f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/e1$c;", "u", "(Landroidx/paging/e1$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/e1$b;", "callback", "Lkotlin/k2;", "t", "(Landroidx/paging/e1$c;Landroidx/paging/e1$b;)V", "Landroidx/paging/e1$d;", "w", "(Landroidx/paging/e1$e;Landroidx/paging/e1$d;)V", "item", "r", "(Ljava/lang/Object;)Ljava/lang/Integer;", "V", "Li/a;", "", "function", "z", "(Li/a;)Landroidx/paging/e1;", "Lkotlin/Function1;", "A", "(Lld/l;)Landroidx/paging/e1;", "x", "y", "", "f", "Z", "g", "()Z", "s", "isContiguous", "a", "b", "c", "d", "e", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e1<T> extends m<Integer, T> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isContiguous;

    /* compiled from: PositionalDataSource.kt */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/e1$a;", "", "<init>", "()V", "Landroidx/paging/e1$c;", "params", "", "totalCount", "a", "(Landroidx/paging/e1$c;I)I", "initialLoadPosition", "b", "(Landroidx/paging/e1$c;II)I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.e1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @kd.n
        public final int a(@fg.l c params, int totalCount) {
            kotlin.jvm.internal.l0.p(params, "params");
            int i4 = params.requestedStartPosition;
            int i5 = params.requestedLoadSize;
            int i6 = params.pageSize;
            return Math.max(0, Math.min(((((totalCount - i5) + i6) - 1) / i6) * i6, (i4 / i6) * i6));
        }

        @kd.n
        public final int b(@fg.l c params, int initialLoadPosition, int totalCount) {
            kotlin.jvm.internal.l0.p(params, "params");
            return Math.min(totalCount - initialLoadPosition, params.requestedLoadSize);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/e1$b;", "T", "", "<init>", "()V", "", "data", "", "position", "totalCount", "Lkotlin/k2;", "b", "(Ljava/util/List;II)V", "a", "(Ljava/util/List;I)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b<T> {
        public abstract void a(@fg.l List<? extends T> data, int position);

        public abstract void b(@fg.l List<? extends T> data, int position, int totalCount);
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/paging/e1$c;", "", "", "requestedStartPosition", "requestedLoadSize", "pageSize", "", "placeholdersEnabled", "<init>", "(IIIZ)V", "a", "I", "b", "c", "d", "Z", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int requestedStartPosition;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int requestedLoadSize;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int pageSize;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean placeholdersEnabled;

        public c(int i4, int i5, int i6, boolean z4) {
            this.requestedStartPosition = i4;
            this.requestedLoadSize = i5;
            this.pageSize = i6;
            this.placeholdersEnabled = z4;
            if (!(i4 >= 0)) {
                throw new IllegalStateException(kotlin.jvm.internal.l0.C("invalid start position: ", Integer.valueOf(i4)).toString());
            }
            if (!(i5 >= 0)) {
                throw new IllegalStateException(kotlin.jvm.internal.l0.C("invalid load size: ", Integer.valueOf(i5)).toString());
            }
            if (!(i6 >= 0)) {
                throw new IllegalStateException(kotlin.jvm.internal.l0.C("invalid page size: ", Integer.valueOf(i6)).toString());
            }
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/paging/e1$d;", "T", "", "<init>", "()V", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class d<T> {
        public abstract void a(@fg.l List<? extends T> data);
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/paging/e1$e;", "", "", "startPosition", "loadSize", "<init>", "(II)V", "a", "I", "b", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int startPosition;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int loadSize;

        public e(int i4, int i5) {
            this.startPosition = i4;
            this.loadSize = i5;
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"androidx/paging/e1$f", "Landroidx/paging/e1$b;", "Landroidx/paging/e1$c;", "params", "Landroidx/paging/m$a;", "result", "Lkotlin/k2;", "c", "(Landroidx/paging/e1$c;Landroidx/paging/m$a;)V", "", "data", "", "position", "totalCount", "b", "(Ljava/util/List;II)V", "a", "(Ljava/util/List;I)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1<T> f31672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<m.a<T>> f31673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f31674c;

        /* JADX WARN: Multi-variable type inference failed */
        f(e1<T> e1Var, kotlinx.coroutines.p<? super m.a<T>> pVar, c cVar) {
            this.f31672a = e1Var;
            this.f31673b = pVar;
            this.f31674c = cVar;
        }

        private final void c(c params, m.a<T> result) {
            if (params.placeholdersEnabled) {
                result.e(params.pageSize);
            }
            kotlinx.coroutines.p<m.a<T>> pVar = this.f31673b;
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(result);
        }

        @Override // androidx.paging.e1.b
        public void a(@fg.l List<? extends T> data, int position) {
            kotlin.jvm.internal.l0.p(data, "data");
            if (!this.f31672a.h()) {
                c(this.f31674c, new m.a<>(data, position == 0 ? null : Integer.valueOf(position), Integer.valueOf(data.size() + position), position, Integer.MIN_VALUE));
                return;
            }
            kotlinx.coroutines.p<m.a<T>> pVar = this.f31673b;
            m.a<T> b5 = m.a.INSTANCE.b();
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(b5);
        }

        @Override // androidx.paging.e1.b
        public void b(@fg.l List<? extends T> data, int position, int totalCount) {
            kotlin.jvm.internal.l0.p(data, "data");
            if (!this.f31672a.h()) {
                int size = data.size() + position;
                c(this.f31674c, new m.a<>(data, position == 0 ? null : Integer.valueOf(position), size == totalCount ? null : Integer.valueOf(size), position, (totalCount - data.size()) - position));
            } else {
                kotlinx.coroutines.p<m.a<T>> pVar = this.f31673b;
                m.a<T> b5 = m.a.INSTANCE.b();
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(b5);
            }
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/e1$g", "Landroidx/paging/e1$d;", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g extends d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f31675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1<T> f31676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<m.a<T>> f31677c;

        /* JADX WARN: Multi-variable type inference failed */
        g(e eVar, e1<T> e1Var, kotlinx.coroutines.p<? super m.a<T>> pVar) {
            this.f31675a = eVar;
            this.f31676b = e1Var;
            this.f31677c = pVar;
        }

        @Override // androidx.paging.e1.d
        public void a(@fg.l List<? extends T> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            int i4 = this.f31675a.startPosition;
            Integer valueOf = i4 == 0 ? null : Integer.valueOf(i4);
            if (this.f31676b.h()) {
                kotlinx.coroutines.p<m.a<T>> pVar = this.f31677c;
                m.a<T> b5 = m.a.INSTANCE.b();
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(b5);
                return;
            }
            kotlinx.coroutines.p<m.a<T>> pVar2 = this.f31677c;
            m.a aVar = new m.a(data, valueOf, Integer.valueOf(data.size() + this.f31675a.startPosition), 0, 0, 24, null);
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            pVar2.resumeWith(aVar);
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u0002H\u0005 \u0003*\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "V", "kotlin.jvm.PlatformType", "", "T", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.a<T, V> f31678a;

        h(i.a<T, V> aVar) {
            this.f31678a = aVar;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<V> apply(List<? extends T> list) {
            kotlin.jvm.internal.l0.o(list, "list");
            List<? extends T> list2 = list;
            i.a<T, V> aVar = this.f31678a;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u0002H\u0005 \u0003*\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "V", "kotlin.jvm.PlatformType", "", "T", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<T, V> f31679a;

        /* JADX WARN: Multi-variable type inference failed */
        i(ld.l<? super T, ? extends V> lVar) {
            this.f31679a = lVar;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<V> apply(List<? extends T> list) {
            kotlin.jvm.internal.l0.o(list, "list");
            List<? extends T> list2 = list;
            ld.l<T, V> lVar = this.f31679a;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: PositionalDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u0002H\u0005 \u0003*\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "V", "kotlin.jvm.PlatformType", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class j<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<List<? extends T>, List<V>> f31680a;

        /* JADX WARN: Multi-variable type inference failed */
        j(ld.l<? super List<? extends T>, ? extends List<? extends V>> lVar) {
            this.f31680a = lVar;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<V> apply(List<? extends T> it) {
            ld.l<List<? extends T>, List<V>> lVar = this.f31680a;
            kotlin.jvm.internal.l0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public e1() {
        super(m.e.POSITIONAL);
    }

    @kd.n
    public static final int p(@fg.l c cVar, int i4) {
        return INSTANCE.a(cVar, i4);
    }

    @kd.n
    public static final int q(@fg.l c cVar, int i4, int i5) {
        return INSTANCE.b(cVar, i4, i5);
    }

    public static /* synthetic */ void s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(e eVar, kotlin.coroutines.d<? super m.a<T>> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        w(eVar, new g(eVar, this, qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final <V> e1<V> m(@fg.l ld.l<? super List<? extends T>, ? extends List<? extends V>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new j(function));
    }

    @Override // androidx.paging.m
    /* renamed from: g, reason: from getter */
    public boolean getIsContiguous() {
        return this.isContiguous;
    }

    @Override // androidx.paging.m
    @fg.m
    public final Object i(@fg.l m.f<Integer> fVar, @fg.l kotlin.coroutines.d<? super m.a<T>> dVar) {
        if (fVar.getType() != g0.REFRESH) {
            Integer b5 = fVar.b();
            kotlin.jvm.internal.l0.m(b5);
            int intValue = b5.intValue();
            int pageSize = fVar.getPageSize();
            if (fVar.getType() == g0.PREPEND) {
                pageSize = Math.min(pageSize, intValue);
                intValue -= pageSize;
            }
            return v(new e(intValue, pageSize), dVar);
        }
        int initialLoadSize = fVar.getInitialLoadSize();
        int i4 = 0;
        if (fVar.b() != null) {
            int intValue2 = fVar.b().intValue();
            if (fVar.getPlaceholdersEnabled()) {
                initialLoadSize = Math.max(initialLoadSize / fVar.getPageSize(), 2) * fVar.getPageSize();
                i4 = Math.max(0, fVar.getPageSize() * ((intValue2 - (initialLoadSize / 2)) / fVar.getPageSize()));
            } else {
                i4 = Math.max(0, intValue2 - (initialLoadSize / 2));
            }
        }
        return u(new c(i4, initialLoadSize, fVar.getPageSize(), fVar.getPlaceholdersEnabled()), dVar);
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Integer c(@fg.l T item) {
        kotlin.jvm.internal.l0.p(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @androidx.annotation.n1
    public abstract void t(@fg.l c params, @fg.l b<T> callback);

    @fg.m
    @androidx.annotation.m1
    public final Object u(@fg.l c cVar, @fg.l kotlin.coroutines.d<? super m.a<T>> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        t(cVar, new f(this, qVar, cVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @androidx.annotation.n1
    public abstract void w(@fg.l e params, @fg.l d<T> callback);

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final <V> e1<V> j(@fg.l i.a<T, V> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new h(function));
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final <V> e1<V> k(@fg.l ld.l<? super T, ? extends V> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new i(function));
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final <V> e1<V> l(@fg.l i.a<List<T>, List<V>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return new a2(this, function);
    }
}
