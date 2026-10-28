package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.z;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001%B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b\u001f\u0010$J\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\tJ \u0010\f\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\tRF\u0010\u0012\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000f*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000e0\u000e0\r8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lkotlin/reflect/jvm/internal/y;", "D", "E", "V", "Lkotlin/reflect/r;", "Lkotlin/reflect/jvm/internal/z;", "receiver1", "receiver2", "m0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "r0", "g0", "Lkotlin/reflect/jvm/internal/g0$b;", "Lkotlin/reflect/jvm/internal/y$a;", "kotlin.jvm.PlatformType", "A", "Lkotlin/reflect/jvm/internal/g0$b;", "_getter", "Lkotlin/b0;", "Ljava/lang/reflect/Member;", "B", "Lkotlin/b0;", "delegateSource", "N0", "()Lkotlin/reflect/jvm/internal/y$a;", "getter", "Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class y<D, E, V> extends z<V> implements KProperty2<D, E, V> {

    /* renamed from: A, reason: from kotlin metadata */
    @d5.d
    private final g0.b<a<D, E, V>> _getter;

    /* renamed from: B, reason: from kotlin metadata */
    @d5.d
    private final Lazy<Member> delegateSource;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/y$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/z$c;", "Lkotlin/reflect/r$b;", "receiver1", "receiver2", "g0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/y;", "v", "Lkotlin/reflect/jvm/internal/y;", "I0", "()Lkotlin/reflect/jvm/internal/y;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/y;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a<D, E, V> extends z.c<V> implements KProperty2.b<D, E, V> {

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final y<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d y<D, E, ? extends V> yVar) {
            kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("誵"));
            this.property = yVar;
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        public z G0() {
            return this.property;
        }

        @d5.d
        public y<D, E, V> I0() {
            return this.property;
        }

        @Override // q3.p
        public V g0(D receiver1, E receiver2) {
            return this.property.m0(receiver1, receiver2);
        }

        @Override // kotlin.reflect.KProperty.a
        public KProperty s0() {
            return this.property;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u0004*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"D", "E", "V", "Lkotlin/reflect/jvm/internal/y$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/y$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<a<D, E, ? extends V>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ y<D, E, V> f26839p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y<D, E, ? extends V> yVar) {
            super(0);
            this.f26839p = yVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a<D, E, V> n() {
            return new a<>(this.f26839p);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements q3.a<Member> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ y<D, E, V> f26840p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(y<D, E, ? extends V> yVar) {
            super(0);
            this.f26840p = yVar;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Member n() {
            return this.f26840p.G0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@d5.d p pVar, @d5.d String str, @d5.d String str2) {
        super(pVar, str, str2, kotlin.jvm.internal.q.f23594u);
        Lazy<Member> b6;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("誃"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("誄"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("誅"));
        g0.b<a<D, E, V>> b7 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("誆"));
        this._getter = b7;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(this));
        this.delegateSource = b6;
    }

    @Override // kotlin.reflect.KProperty
    @d5.d
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> e() {
        a<D, E, V> n5 = this._getter.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("誊"));
        return n5;
    }

    @Override // q3.p
    public V g0(D receiver1, E receiver2) {
        return m0(receiver1, receiver2);
    }

    @Override // kotlin.reflect.KProperty2
    public V m0(D receiver1, E receiver2) {
        return e().C(receiver1, receiver2);
    }

    @Override // kotlin.reflect.KProperty2
    @d5.e
    public Object r0(D receiver1, E receiver2) {
        return I0(this.delegateSource.getValue(), receiver1, receiver2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@d5.d p pVar, @d5.d u0 u0Var) {
        super(pVar, u0Var);
        Lazy<Member> b6;
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("誇"));
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("誈"));
        g0.b<a<D, E, V>> b7 = g0.b(new b(this));
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("誉"));
        this._getter = b7;
        b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(this));
        this.delegateSource = b6;
    }
}
