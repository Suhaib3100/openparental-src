package androidx.compose.runtime.saveable;

import androidx.compose.runtime.p3;
import androidx.compose.runtime.saveable.i;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/runtime/saveable/e;", "T", "Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/runtime/p3;", "Landroidx/compose/runtime/saveable/l;", "", "saver", "Landroidx/compose/runtime/saveable/i;", "registry", "", "key", "value", "", "inputs", "<init>", "(Landroidx/compose/runtime/saveable/l;Landroidx/compose/runtime/saveable/i;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "Lkotlin/k2;", "h", "()V", "i", "", "a", "(Ljava/lang/Object;)Z", "b", "d", "c", "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/runtime/saveable/i;", "Ljava/lang/String;", "e", "Ljava/lang/Object;", "f", "[Ljava/lang/Object;", "Landroidx/compose/runtime/saveable/i$a;", "Landroidx/compose/runtime/saveable/i$a;", "entry", "Lkotlin/Function0;", "Lld/a;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
/* loaded from: classes.dex */
final class e<T> implements n, p3 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private l<T, Object> saver;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i registry;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String key;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] inputs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i.a entry;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Object> valueProvider = new a(this);

    /* compiled from: RememberSaveable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder$valueProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
    static final class a extends n0 implements ld.a<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T> f16979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar) {
            super(0);
            this.f16979b = eVar;
        }

        @Override // ld.a
        @fg.m
        public final Object invoke() {
            l lVar = ((e) this.f16979b).saver;
            e<T> eVar = this.f16979b;
            Object obj = ((e) eVar).value;
            if (obj != null) {
                return lVar.a(eVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public e(@fg.l l<T, Object> lVar, @fg.m i iVar, @fg.l String str, T t4, @fg.l Object[] objArr) {
        this.saver = lVar;
        this.registry = iVar;
        this.key = str;
        this.value = t4;
        this.inputs = objArr;
    }

    private final void h() {
        i iVar = this.registry;
        if (this.entry != null) {
            throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
        }
        if (iVar != null) {
            d.e(iVar, this.valueProvider.invoke());
            this.entry = iVar.c(this.key, this.valueProvider);
        }
    }

    @Override // androidx.compose.runtime.saveable.n
    public boolean a(@fg.l Object value) {
        i iVar = this.registry;
        return iVar == null || iVar.a(value);
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
        h();
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
        i.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        i.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @fg.m
    public final T g(@fg.l Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }

    public final void i(@fg.l l<T, Object> saver, @fg.m i registry, @fg.l String key, T value, @fg.l Object[] inputs) {
        boolean z4;
        boolean z5 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z4 = true;
        } else {
            z4 = false;
        }
        if (l0.g(this.key, key)) {
            z5 = z4;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        i.a aVar = this.entry;
        if (aVar == null || !z5) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.entry = null;
        h();
    }
}
