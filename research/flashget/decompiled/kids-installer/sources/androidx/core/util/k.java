package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aû\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lkotlin/m2;", "onEntryRemoved", "Landroid/util/LruCache;", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class k {

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"", "K", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements q3.p<Object, Object, Integer> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f5244p = new a();

        public a() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer g0(@d5.d Object noName_0, @d5.d Object noName_1) {
            l0.p(noName_0, "$noName_0");
            l0.p(noName_1, "$noName_1");
            return 1;
        }
    }

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"", "K", "V", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements q3.l<Object, Object> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f5245p = new b();

        public b() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        public final Object N(@d5.d Object it) {
            l0.p(it, "it");
            return null;
        }
    }

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\n"}, d2 = {"", "K", "V", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements q3.r<Boolean, Object, Object, Object, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f5246p = new c();

        public c() {
            super(4);
        }

        @Override // q3.r
        public /* bridge */ /* synthetic */ m2 S(Boolean bool, Object obj, Object obj2, Object obj3) {
            a(bool.booleanValue(), obj, obj2, obj3);
            return m2.f23662a;
        }

        public final void a(boolean z5, @d5.d Object noName_1, @d5.d Object noName_2, @d5.e Object obj) {
            l0.p(noName_1, "$noName_1");
            l0.p(noName_2, "$noName_2");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/k$d", "Landroid/util/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lkotlin/m2;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class d<K, V> extends LruCache<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.p<K, V, Integer> f5247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3.l<K, V> f5248b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q3.r<Boolean, K, V, V, m2> f5249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(q3.p<? super K, ? super V, Integer> pVar, q3.l<? super K, ? extends V> lVar, q3.r<? super Boolean, ? super K, ? super V, ? super V, m2> rVar, int i5) {
            super(i5);
            this.f5247a = pVar;
            this.f5248b = lVar;
            this.f5249c = rVar;
            this.f5250d = i5;
        }

        @Override // android.util.LruCache
        @d5.e
        protected V create(@d5.d K key) {
            l0.p(key, "key");
            return this.f5248b.N(key);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean evicted, @d5.d K key, @d5.d V oldValue, @d5.e V newValue) {
            l0.p(key, "key");
            l0.p(oldValue, "oldValue");
            this.f5249c.S(Boolean.valueOf(evicted), key, oldValue, newValue);
        }

        @Override // android.util.LruCache
        protected int sizeOf(@d5.d K key, @d5.d V value) {
            l0.p(key, "key");
            l0.p(value, "value");
            return this.f5247a.g0(key, value).intValue();
        }
    }

    @d5.d
    public static final <K, V> LruCache<K, V> a(int i5, @d5.d q3.p<? super K, ? super V, Integer> sizeOf, @d5.d q3.l<? super K, ? extends V> create, @d5.d q3.r<? super Boolean, ? super K, ? super V, ? super V, m2> onEntryRemoved) {
        l0.p(sizeOf, "sizeOf");
        l0.p(create, "create");
        l0.p(onEntryRemoved, "onEntryRemoved");
        return new d(sizeOf, create, onEntryRemoved, i5);
    }

    public static /* synthetic */ LruCache b(int i5, q3.p sizeOf, q3.l create, q3.r onEntryRemoved, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            sizeOf = a.f5244p;
        }
        if ((i6 & 4) != 0) {
            create = b.f5245p;
        }
        if ((i6 & 8) != 0) {
            onEntryRemoved = c.f5246p;
        }
        l0.p(sizeOf, "sizeOf");
        l0.p(create, "create");
        l0.p(onEntryRemoved, "onEntryRemoved");
        return new d(sizeOf, create, onEntryRemoved, i5);
    }
}
