package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÿ\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lkotlin/k2;", "onEntryRemoved", "Landroid/util/LruCache;", "a", "(ILld/p;Lld/l;Lld/r;)Landroid/util/LruCache;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "K", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.p<Object, Object, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26875b = new a(2);

        public a() {
            super(2);
        }

        public final Integer a(Object obj, Object obj2) {
            return 1;
        }

        @Override // ld.p
        public Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "V", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26876b = new b(1);

        public b() {
            super(1);
        }

        @Override // ld.l
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "K", "V", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/k2;", "a", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.r<Boolean, Object, Object, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26877b = new c(4);

        public c() {
            super(4);
        }

        public final void a(boolean z4, Object obj, Object obj2, Object obj3) {
        }

        @Override // ld.r
        public k2 i(Boolean bool, Object obj, Object obj2, Object obj3) {
            bool.booleanValue();
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: LruCache.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/q$d", "Landroid/util/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lkotlin/k2;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    public static final class d<K, V> extends LruCache<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.p<K, V, Integer> f26878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<K, V> f26879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.r<Boolean, K, V, V, k2> f26880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i4, ld.p<? super K, ? super V, Integer> pVar, ld.l<? super K, ? extends V> lVar, ld.r<? super Boolean, ? super K, ? super V, ? super V, k2> rVar) {
            super(i4);
            this.f26878a = pVar;
            this.f26879b = lVar;
            this.f26880c = rVar;
        }

        @Override // android.util.LruCache
        protected V create(K key) {
            return this.f26879b.invoke(key);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
            this.f26880c.i(Boolean.valueOf(evicted), key, oldValue, newValue);
        }

        @Override // android.util.LruCache
        protected int sizeOf(K key, V value) {
            return this.f26878a.invoke(key, value).intValue();
        }
    }

    @fg.l
    public static final <K, V> LruCache<K, V> a(int i4, @fg.l ld.p<? super K, ? super V, Integer> pVar, @fg.l ld.l<? super K, ? extends V> lVar, @fg.l ld.r<? super Boolean, ? super K, ? super V, ? super V, k2> rVar) {
        return new d(i4, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache b(int i4, ld.p pVar, ld.l lVar, ld.r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = a.f26875b;
        }
        if ((i5 & 4) != 0) {
            lVar = b.f26876b;
        }
        if ((i5 & 8) != 0) {
            rVar = c.f26877b;
        }
        return new d(i4, pVar, lVar, rVar);
    }
}
