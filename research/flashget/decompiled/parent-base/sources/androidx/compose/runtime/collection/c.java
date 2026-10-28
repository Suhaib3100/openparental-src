package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.sequences.o;
import ld.p;

/* compiled from: IdentityArrayMap.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010\"\u001a\u00020\u001826\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#J3\u0010%\u001a\u00020\u00182!\u0010!\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000f0$H\u0086\b¢\u0006\u0004\b%\u0010&JH\u0010'\u001a\u00020\u001826\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u001eH\u0086\b¢\u0006\u0004\b'\u0010#J\u0019\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b)\u0010*R4\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R4\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b2\u00100R$\u00107\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Landroidx/compose/runtime/collection/c;", "", "Key", "Value", "", "capacity", "<init>", "(I)V", "key", "e", "(Ljava/lang/Object;)I", "midIndex", "keyHash", "f", "(ILjava/lang/Object;I)I", "", "l", "()Z", "m", "d", "(Ljava/lang/Object;)Z", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "q", "(Ljava/lang/Object;Ljava/lang/Object;)V", "n", "c", "()V", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "block", "o", "(Lld/p;)V", "Lkotlin/Function1;", "p", "(Lld/l;)V", "g", "", "b", "()Ljava/util/Map;", "", "<set-?>", "a", "[Ljava/lang/Object;", "i", "()[Ljava/lang/Object;", "keys", "k", "values", "I", "j", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,298:1\n125#1,22:299\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n149#1:299,22\n*E\n"})
/* loaded from: classes.dex */
public final class c<Key, Value> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16099d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] keys;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private Object[] values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: IdentityArrayMap.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"androidx/compose/runtime/collection/c$a", "", "", "isEmpty", "()Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "containsValue", "(Ljava/lang/Object;)Z", "containsKey", "", "", "b", "()Ljava/util/Set;", "entries", "c", "keys", "", "d", "()I", "size", "", "e", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Map<Key, Value>, md.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<Key, Value> f16103b;

        /* compiled from: IdentityArrayMap.kt */
        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/runtime/collection/c$a$a", "", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "c", "(Ljava/util/Map$Entry;)Z", "", "f", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1726#2,3:299\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1\n*L\n240#1:299,3\n*E\n"})
        /* renamed from: androidx.compose.runtime.collection.c$a$a, reason: collision with other inner class name */
        public static final class C0307a implements Set<Map.Entry<? extends Key, ? extends Value>>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f16104b;

            /* compiled from: IdentityArrayMap.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1", f = "IdentityArrayMap.kt", i = {0, 0}, l = {229}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.runtime.collection.c$a$a$a, reason: collision with other inner class name */
            static final class C0308a extends k implements p<o<? super Map.Entry<? extends Key, ? extends Value>>, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f16105c;

                /* renamed from: d, reason: collision with root package name */
                int f16106d;

                /* renamed from: e, reason: collision with root package name */
                int f16107e;

                /* renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f16108f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ c<Key, Value> f16109g;

                /* compiled from: IdentityArrayMap.kt */
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010&\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R\u001a\u0010\u0006\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"androidx/compose/runtime/collection/c$a$a$a$a", "", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "c", "getValue", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.runtime.collection.c$a$a$a$a, reason: collision with other inner class name */
                public static final class C0309a implements Map.Entry<Key, Value>, md.a {

                    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                    @l
                    private final Key key;

                    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final Value value;

                    C0309a(c<Key, Value> cVar, int i4) {
                        Key key = (Key) cVar.getKeys()[i4];
                        l0.n(key, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        this.key = key;
                        this.value = (Value) cVar.getValues()[i4];
                    }

                    @Override // java.util.Map.Entry
                    @l
                    public Key getKey() {
                        return this.key;
                    }

                    @Override // java.util.Map.Entry
                    public Value getValue() {
                        return this.value;
                    }

                    @Override // java.util.Map.Entry
                    public Value setValue(Value value) {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0308a(c<Key, Value> cVar, kotlin.coroutines.d<? super C0308a> dVar) {
                    super(2, dVar);
                    this.f16109g = cVar;
                }

                @Override // ld.p
                @m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@l o<? super Map.Entry<? extends Key, ? extends Value>> oVar, @m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0308a) create(oVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    C0308a c0308a = new C0308a(this.f16109g, dVar);
                    c0308a.f16108f = obj;
                    return c0308a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0041 -> B:5:0x0044). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
                    /*
                        r6 = this;
                        kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r1 = r6.f16107e
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        int r1 = r6.f16106d
                        int r3 = r6.f16105c
                        java.lang.Object r4 = r6.f16108f
                        kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                        kotlin.a1.n(r7)
                        goto L44
                    L15:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1d:
                        kotlin.a1.n(r7)
                        java.lang.Object r7 = r6.f16108f
                        kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                        androidx.compose.runtime.collection.c<Key, Value> r1 = r6.f16109g
                        int r1 = r1.getSize()
                        r3 = 0
                        r4 = r7
                    L2c:
                        if (r3 >= r1) goto L46
                        androidx.compose.runtime.collection.c$a$a$a$a r7 = new androidx.compose.runtime.collection.c$a$a$a$a
                        androidx.compose.runtime.collection.c<Key, Value> r5 = r6.f16109g
                        r7.<init>(r5, r3)
                        r6.f16108f = r4
                        r6.f16105c = r3
                        r6.f16106d = r1
                        r6.f16107e = r2
                        java.lang.Object r7 = r4.b(r7, r6)
                        if (r7 != r0) goto L44
                        return r0
                    L44:
                        int r3 = r3 + r2
                        goto L2c
                    L46:
                        kotlin.k2 r7 = kotlin.k2.f75408a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.c.a.C0307a.C0308a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0307a(c<Key, Value> cVar) {
                this.f16104b = cVar;
            }

            @Override // java.util.Set, java.util.Collection
            public /* bridge */ /* synthetic */ boolean add(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Map.Entry<? extends Key, ? extends Value>> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean b(Map.Entry<? extends Key, ? extends Value> entry) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public boolean c(@l Map.Entry<? extends Key, ? extends Value> element) {
                return this.f16104b.h(element.getKey()) == element.getValue();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    return c((Map.Entry) obj);
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@l Collection<? extends Object> elements) {
                Collection<? extends Object> collection = elements;
                if ((collection instanceof Collection) && collection.isEmpty()) {
                    return true;
                }
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }

            public int f() {
                return this.f16104b.getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f16104b.l();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @l
            public Iterator<Map.Entry<Key, Value>> iterator() {
                return kotlin.sequences.p.b(new C0308a(this.f16104b, null)).iterator();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final int size() {
                return this.f16104b.getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return v.a(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) v.b(this, tArr);
            }
        }

        /* compiled from: IdentityArrayMap.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"androidx/compose/runtime/collection/c$a$b", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "b", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements Set<Key>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f16112b;

            /* compiled from: IdentityArrayMap.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1$iterator$1", f = "IdentityArrayMap.kt", i = {0, 0}, l = {251}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.runtime.collection.c$a$b$a, reason: collision with other inner class name */
            static final class C0310a extends k implements p<o<? super Key>, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f16113c;

                /* renamed from: d, reason: collision with root package name */
                int f16114d;

                /* renamed from: e, reason: collision with root package name */
                int f16115e;

                /* renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f16116f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ c<Key, Value> f16117g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0310a(c<Key, Value> cVar, kotlin.coroutines.d<? super C0310a> dVar) {
                    super(2, dVar);
                    this.f16117g = cVar;
                }

                @Override // ld.p
                @m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@l o<? super Key> oVar, @m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0310a) create(oVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    C0310a c0310a = new C0310a(this.f16117g, dVar);
                    c0310a.f16116f = obj;
                    return c0310a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0047 -> B:5:0x004a). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
                    /*
                        r6 = this;
                        kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r1 = r6.f16115e
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        int r1 = r6.f16114d
                        int r3 = r6.f16113c
                        java.lang.Object r4 = r6.f16116f
                        kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                        kotlin.a1.n(r7)
                        goto L4a
                    L15:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1d:
                        kotlin.a1.n(r7)
                        java.lang.Object r7 = r6.f16116f
                        kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                        androidx.compose.runtime.collection.c<Key, Value> r1 = r6.f16117g
                        int r1 = r1.getSize()
                        r3 = 0
                        r4 = r7
                    L2c:
                        if (r3 >= r1) goto L4c
                        androidx.compose.runtime.collection.c<Key, Value> r7 = r6.f16117g
                        java.lang.Object[] r7 = r7.getKeys()
                        r7 = r7[r3]
                        java.lang.String r5 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
                        kotlin.jvm.internal.l0.n(r7, r5)
                        r6.f16116f = r4
                        r6.f16113c = r3
                        r6.f16114d = r1
                        r6.f16115e = r2
                        java.lang.Object r7 = r4.b(r7, r6)
                        if (r7 != r0) goto L4a
                        return r0
                    L4a:
                        int r3 = r3 + r2
                        goto L2c
                    L4c:
                        kotlin.k2 r7 = kotlin.k2.f75408a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.c.a.b.C0310a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            b(c<Key, Value> cVar) {
                this.f16112b = cVar;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Key key) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends Key> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public int b() {
                return this.f16112b.getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(@m Object element) {
                if (element == null) {
                    return false;
                }
                return this.f16112b.d(element);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(@l Collection<? extends Object> elements) {
                Iterator<? extends Object> it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f16112b.l();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            @l
            public Iterator<Key> iterator() {
                return kotlin.sequences.p.b(new C0310a(this.f16112b, null)).iterator();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Set, java.util.Collection
            public final int size() {
                return this.f16112b.getSize();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return v.a(this);
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) v.b(this, tArr);
            }
        }

        /* compiled from: IdentityArrayMap.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/runtime/collection/c$a$c", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "b", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.collection.c$a$c, reason: collision with other inner class name */
        public static final class C0311c implements Collection<Value>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f16118b;

            /* compiled from: IdentityArrayMap.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$values$1$iterator$1", f = "IdentityArrayMap.kt", i = {0, 0}, l = {271}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.runtime.collection.c$a$c$a, reason: collision with other inner class name */
            static final class C0312a extends k implements p<o<? super Value>, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                int f16119c;

                /* renamed from: d, reason: collision with root package name */
                int f16120d;

                /* renamed from: e, reason: collision with root package name */
                int f16121e;

                /* renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f16122f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ c<Key, Value> f16123g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0312a(c<Key, Value> cVar, kotlin.coroutines.d<? super C0312a> dVar) {
                    super(2, dVar);
                    this.f16123g = cVar;
                }

                @Override // ld.p
                @m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@l o<? super Value> oVar, @m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0312a) create(oVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                    C0312a c0312a = new C0312a(this.f16123g, dVar);
                    c0312a.f16122f = obj;
                    return c0312a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0042 -> B:5:0x0045). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r6) {
                    /*
                        r5 = this;
                        kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r1 = r5.f16121e
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        int r1 = r5.f16120d
                        int r3 = r5.f16119c
                        java.lang.Object r4 = r5.f16122f
                        kotlin.sequences.o r4 = (kotlin.sequences.o) r4
                        kotlin.a1.n(r6)
                        goto L45
                    L15:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1d:
                        kotlin.a1.n(r6)
                        java.lang.Object r6 = r5.f16122f
                        kotlin.sequences.o r6 = (kotlin.sequences.o) r6
                        androidx.compose.runtime.collection.c<Key, Value> r1 = r5.f16123g
                        int r1 = r1.getSize()
                        r3 = 0
                        r4 = r6
                    L2c:
                        if (r3 >= r1) goto L47
                        androidx.compose.runtime.collection.c<Key, Value> r6 = r5.f16123g
                        java.lang.Object[] r6 = r6.getValues()
                        r6 = r6[r3]
                        r5.f16122f = r4
                        r5.f16119c = r3
                        r5.f16120d = r1
                        r5.f16121e = r2
                        java.lang.Object r6 = r4.b(r6, r5)
                        if (r6 != r0) goto L45
                        return r0
                    L45:
                        int r3 = r3 + r2
                        goto L2c
                    L47:
                        kotlin.k2 r6 = kotlin.k2.f75408a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.c.a.C0311c.C0312a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            C0311c(c<Key, Value> cVar) {
                this.f16118b = cVar;
            }

            @Override // java.util.Collection
            public boolean add(Value value) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends Value> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public int b() {
                return this.f16118b.getSize();
            }

            @Override // java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean contains(Object element) {
                int size = this.f16118b.getSize();
                for (int i4 = 0; i4 < size; i4++) {
                    if (l0.g(this.f16118b.getValues()[i4], element)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Collection
            public boolean containsAll(@l Collection<? extends Object> elements) {
                Iterator<? extends Object> it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f16118b.l();
            }

            @Override // java.util.Collection, java.lang.Iterable
            @l
            public Iterator<Value> iterator() {
                return kotlin.sequences.p.b(new C0312a(this.f16118b, null)).iterator();
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean removeIf(Predicate<? super Value> predicate) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<? extends Object> collection) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Collection
            public final int size() {
                return this.f16118b.getSize();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return v.a(this);
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) v.b(this, tArr);
            }
        }

        a(c<Key, Value> cVar) {
            this.f16103b = cVar;
        }

        @l
        public Set<Map.Entry<Key, Value>> b() {
            return new C0307a(this.f16103b);
        }

        @l
        public Set<Key> c() {
            return new b(this.f16103b);
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value compute(Key key, BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value computeIfAbsent(Key key, Function<? super Key, ? extends Value> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value computeIfPresent(Key key, BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(@m Object key) {
            return (key == null || this.f16103b.h(key) == null) ? false : true;
        }

        @Override // java.util.Map
        public boolean containsValue(Object value) {
            return kotlin.collections.l.s8(this.f16103b.getValues(), value);
        }

        public int d() {
            return this.f16103b.getSize();
        }

        @l
        public Collection<Value> e() {
            return new C0311c(this.f16103b);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
            return b();
        }

        @Override // java.util.Map
        @m
        public Value get(@m Object key) {
            if (key == null) {
                return null;
            }
            return this.f16103b.h(key);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f16103b.l();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Key> keySet() {
            return c();
        }

        @Override // java.util.Map
        public Value merge(Key key, Value value, BiFunction<? super Value, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value put(Key key, Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends Key, ? extends Value> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value putIfAbsent(Key key, Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Value replace(Key key, Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final int size() {
            return this.f16103b.getSize();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<Value> values() {
            return e();
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(Key key, Value value, Value value2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c() {
        this(0, 1, null);
    }

    private final int e(Object key) {
        int identityHashCode = System.identityHashCode(key);
        int i4 = this.size - 1;
        Object[] objArr = this.keys;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            Object obj = objArr[i6];
            int identityHashCode2 = System.identityHashCode(obj);
            if (identityHashCode2 < identityHashCode) {
                i5 = i6 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    return key == obj ? i6 : f(i6, key, identityHashCode);
                }
                i4 = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    private final int f(int midIndex, Object key, int keyHash) {
        Object obj;
        Object[] objArr = this.keys;
        int i4 = this.size;
        for (int i5 = midIndex - 1; -1 < i5; i5--) {
            Object obj2 = objArr[i5];
            if (obj2 == key) {
                return i5;
            }
            if (System.identityHashCode(obj2) != keyHash) {
                break;
            }
        }
        do {
            midIndex++;
            if (midIndex >= i4) {
                return -(i4 + 1);
            }
            obj = objArr[midIndex];
            if (obj == key) {
                return midIndex;
            }
        } while (System.identityHashCode(obj) == keyHash);
        return -(midIndex + 1);
    }

    @l
    public final Map<Key, Value> b() {
        return new a(this);
    }

    public final void c() {
        this.size = 0;
        kotlin.collections.l.V1(this.keys, null, 0, 0, 6, null);
        kotlin.collections.l.V1(this.values, null, 0, 0, 6, null);
    }

    public final boolean d(@l Key key) {
        return e(key) >= 0;
    }

    public final void g(@l p<? super Key, ? super Value, k2> block) {
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = this.keys[i5];
            l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            block.invoke(obj, this.values[i5]);
        }
    }

    @m
    public final Value h(@l Key key) {
        int e4 = e(key);
        if (e4 >= 0) {
            return (Value) this.values[e4];
        }
        return null;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* renamed from: j, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean l() {
        return this.size == 0;
    }

    public final boolean m() {
        return this.size > 0;
    }

    @m
    public final Value n(@l Key key) {
        int e4 = e(key);
        if (e4 < 0) {
            return null;
        }
        Object[] objArr = this.values;
        Value value = (Value) objArr[e4];
        int i4 = this.size;
        Object[] objArr2 = this.keys;
        int i5 = e4 + 1;
        kotlin.collections.l.B0(objArr2, objArr2, e4, i5, i4);
        kotlin.collections.l.B0(objArr, objArr, e4, i5, i4);
        int i6 = i4 - 1;
        objArr2[i6] = null;
        objArr[i6] = null;
        this.size = i6;
        return value;
    }

    public final void o(@l p<? super Key, ? super Value, Boolean> block) {
        int i4 = this.size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = this.keys[i6];
            l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(obj, this.values[i6]).booleanValue()) {
                if (i5 != i6) {
                    this.keys[i5] = obj;
                    Object[] objArr = this.values;
                    objArr[i5] = objArr[i6];
                }
                i5++;
            }
        }
        int i7 = this.size;
        if (i7 > i5) {
            for (int i10 = i5; i10 < i7; i10++) {
                this.keys[i10] = null;
                this.values[i10] = null;
            }
            this.size = i5;
        }
    }

    public final void p(@l ld.l<? super Value, Boolean> block) {
        int i4 = this.size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = this.keys[i6];
            l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(this.values[i6]).booleanValue()) {
                if (i5 != i6) {
                    this.keys[i5] = obj;
                    Object[] objArr = this.values;
                    objArr[i5] = objArr[i6];
                }
                i5++;
            }
        }
        int i7 = this.size;
        if (i7 > i5) {
            for (int i10 = i5; i10 < i7; i10++) {
                this.keys[i10] = null;
                this.values[i10] = null;
            }
            this.size = i5;
        }
    }

    public final void q(@l Key key, Value value) {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i4 = this.size;
        int e4 = e(key);
        if (e4 >= 0) {
            objArr2[e4] = value;
            return;
        }
        int i5 = -(e4 + 1);
        boolean z4 = i4 == objArr.length;
        Object[] objArr3 = z4 ? new Object[i4 * 2] : objArr;
        int i6 = i5 + 1;
        kotlin.collections.l.B0(objArr, objArr3, i6, i5, i4);
        if (z4) {
            kotlin.collections.l.K0(objArr, objArr3, 0, 0, i5, 6, null);
        }
        objArr3[i5] = key;
        this.keys = objArr3;
        Object[] objArr4 = z4 ? new Object[i4 * 2] : objArr2;
        kotlin.collections.l.B0(objArr2, objArr4, i6, i5, i4);
        if (z4) {
            kotlin.collections.l.K0(objArr2, objArr4, 0, 0, i5, 6, null);
        }
        objArr4[i5] = value;
        this.values = objArr4;
        this.size++;
    }

    public c(int i4) {
        this.keys = new Object[i4];
        this.values = new Object[i4];
    }

    public /* synthetic */ c(int i4, int i5, w wVar) {
        this((i5 & 1) != 0 ? 16 : i4);
    }
}
